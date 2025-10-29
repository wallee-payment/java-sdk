/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.service;

import static com.wallee.sdk.service.TestConstants.MOCK_CARD_DATA;
import static com.wallee.sdk.service.TestConstants.SPACE_ID;
import static com.wallee.sdk.service.TestConstants.TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID;
import static com.wallee.sdk.service.TestConstants.TEST_CUSTOMER_ID;
import static com.wallee.sdk.service.TestUtils.getApiClient;
import static com.wallee.sdk.service.TestUtils.getTransactionCreatePayload;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * API tests for Transactions API Service
 */
class TransactionsServiceTest {
  public static final String INTEGRATION_MODE = "payment_page";
  public static final Set<String> EMPTY_EXPAND = Collections.emptySet();
  private static TransactionsService transactionsService;
  private static TokensService tokensService;

  @BeforeAll
  static void setUp() {
    ApiClient apiClient = getApiClient();
    transactionsService = new TransactionsService(apiClient);
    tokensService = new TokensService(apiClient);
    apiClient.setRequestTimeout(35);
  }

  /**
   * Creates a new transaction.
   *
   * <p>Verifies that: Transaction state is PENDING
   */
  @Test
  public void createAndFindPendingTransaction() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction found =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.PENDING, transaction.getState(), "Transaction state must be PENDING");
    assertEquals(
      transaction.getMerchantReference(),
      found.getMerchantReference(),
      "Merchant reference should match.");
  }

  /**
   * Confirms a pending transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction state is CONFIRMED
   *   <li>Transaction entity version is correctly incremented
   *   <li>Merchant reference is correctly updated
   * </ul>
   */
  @Test
  public void confirmShouldMakeTransactionConfirmed() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setMerchantReference("Test Initial Confirm");
    Transaction created = create(transactionCreate);

    TransactionPending transactionPending = new TransactionPending();
    transactionPending.setVersion(2);
    transactionPending.setMerchantReference("Test Confirm");

    Transaction confirmed =
      transactionsService.postPaymentTransactionsIdConfirm(
        created.getId(), SPACE_ID, transactionPending, EMPTY_EXPAND);

    assertEquals(
      TransactionState.CONFIRMED, confirmed.getState(), "Transaction state must be CONFIRMED");
    assertEquals(3, confirmed.getVersion(), "Version should match.");
    assertEquals(
      transactionPending.getMerchantReference(),
      confirmed.getMerchantReference(),
      "Merchant reference should match.");
  }

  /**
   * Processes a deferred transaction.
   *
   * <p>Verifies that: Transaction state is AUTHORIZED
   */
  @Test
  public void processDeferredTransactionShouldMakeTransactionAuthorized() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);

    Transaction transaction = create(transactionCreate);

    Transaction processed =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    assertEquals(
      TransactionState.AUTHORIZED, processed.getState(), "Transaction state must be AUTHORIZED");
  }

  /**
   * Processes a transaction via charge flow.
   *
   * <p>Verifies that: Transaction state is PROCESSING
   */
  @Test
  public void processViaChargeFlowShouldMakeTransactionProcessing() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processingTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowApply(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.PROCESSING,
      processingTransaction.getState(),
      "Transaction state must be PROCESSING");
  }

  /**
   * Processes and cancels a transaction via charge flow.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Initially, transaction state is PROCESSING
   *   <li>After cancellation, transaction state is FAILED
   * </ul>
   */
  @Test
  public void cancelChargeFlowShouldMakeTransactionFailed() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processingTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowApply(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.PROCESSING,
      processingTransaction.getState(),
      "Transaction state must be PROCESSING");

    Transaction failedTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowCancel(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FAILED, failedTransaction.getState(), "Transaction state must be FAILED");
  }

  /**
   * Processes a transaction and retrieves payment page URL.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Retrieved URL contains space ID
   *   <li>Retrieved URL contains transaction ID
   * </ul>
   */
  @Test
  public void fetchPaymentPageUrlShouldReturnValidUrl() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processingTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowApply(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    String url =
      transactionsService.getPaymentTransactionsIdPaymentPageUrl(transaction.getId(), SPACE_ID);

    assertTrue(url.contains("/s/" + SPACE_ID), "Space id should be present in url");
    assertTrue(url.contains("securityToken="), "Security token should be present in url");
    assertTrue(
      url.contains(Long.toString(processingTransaction.getId())),
      "Transaction id should be present in url");
  }

  /**
   * Processes a transaction via charge flow and retrieves payment page URL.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction state is PROCESSING
   *   <li>Retrieved URL contains space ID
   *   <li>Retrieved URL contains transaction ID
   * </ul>
   */
  @Test
  public void fetchChargeFlowUrlShouldReturnValidUrl() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processingTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowApply(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.PROCESSING,
      processingTransaction.getState(),
      "Transaction state must be PROCESSING");

    String url =
      transactionsService.getPaymentTransactionsIdChargeFlowPaymentPageUrl(
        processingTransaction.getId(), SPACE_ID);

    assertTrue(url.contains(Long.toString(SPACE_ID)), "Url must contain space id");
    assertTrue(
      url.contains(Long.toString(processingTransaction.getId())),
      "Url must contain transaction id");
    assertTrue(url.contains("securityToken="), "Url must contain security token");
  }

  /**
   * Authorizes and completes a transaction online using card details.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction completion state is SUCCESSFUL
   *   <li>Transaction state is FULFILL
   * </ul>
   */
  @Test
  public void completeOnlineShouldMakeTransactionCompletionStateSuccessful() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_IMMEDIATELY);

    Transaction transaction = create(transactionCreate);

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      processedTransaction.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction completedTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL,
      completedTransaction.getState(),
      "Transaction state must be FULFILLED");
  }

  /**
   * Authorizes and completes a transaction online partially using card details.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction completion state is SUCCESSFUL
   *   <li>Transaction state is FULFILL
   * </ul>
   */
  @Test
  public void completeOnlinePartiallyShouldMakeTransactionCompletionStateSuccessful()
    throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletionDetails tcd = new TransactionCompletionDetails();
    tcd.setExternalId(UUID.randomUUID().toString());

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompletePartiallyOnline(
        authorizedTransaction.getId(), SPACE_ID, tcd, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      processedTransaction.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction completedTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL,
      completedTransaction.getState(),
      "Transaction state must be FULFILLED");
  }

  /**
   * Authorizes and completes a transaction offline using card details.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction completion state is SUCCESSFUL
   *   <li>Transaction state is FULFILL
   * </ul>
   */
  @Test
  public void completeOfflineShouldMakeTransactionCompletionStateSuccessful() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_IMMEDIATELY);

    Transaction transaction = create(transactionCreate);

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompleteOffline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      processedTransaction.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction completedTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL,
      completedTransaction.getState(),
      "Transaction state must be FULFILLED");
  }

  /**
   * Authorizes and completes a transaction offline partially using card details.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction completion state is SUCCESSFUL
   *   <li>Transaction state is FULFILL
   * </ul>
   */
  @Test
  public void completeOfflinePartiallyShouldMakeTransactionCompletionStateSuccessful()
    throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletionDetails tcd = new TransactionCompletionDetails();
    tcd.setExternalId(UUID.randomUUID().toString());

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompletePartiallyOffline(
        authorizedTransaction.getId(), SPACE_ID, tcd, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      processedTransaction.getState(),
      "Transaction completion state must be SUCCESSFUL");

    Transaction completedTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL,
      completedTransaction.getState(),
      "Transaction state must be FULFILLED");
  }

  /**
   * Authorizes and voids a transaction online.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction void state is SUCCESSFUL
   *   <li>Transaction state is VOIDED
   * </ul>
   */
  @Test
  public void voidTransactionOnlineShouldReturnVoidedTransaction() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);

    Transaction transaction = create(transactionCreate);

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    assertEquals(
      TransactionState.AUTHORIZED,
      authorizedTransaction.getState(),
      "Transaction state should be AUTHORIZED");

    Set<String> expand = new HashSet<>();
    expand.add("transaction");

    TransactionVoid transactionVoid =
      transactionsService.postPaymentTransactionsIdVoidOnline(
        authorizedTransaction.getId(), SPACE_ID, expand);

    assertEquals(
      TransactionVoidState.SUCCESSFUL,
      transactionVoid.getState(),
      "Transaction void state should be SUCCESSFUL");

    assertNotNull(transactionVoid.getTransaction());

    assertEquals(
      TransactionState.VOIDED,
      transactionVoid.getTransaction().getState(),
      "Transaction state should be VOIDED");
  }

  /**
   * Authorizes and voids a transaction offline.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Transaction void state is SUCCESSFUL
   *   <li>Transaction state is VOIDED
   * </ul>
   */
  @Test
  public void voidTransactionOfflineShouldReturnVoidedTransaction() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);

    Transaction transaction = create(transactionCreate);

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    assertEquals(
      TransactionState.AUTHORIZED,
      authorizedTransaction.getState(),
      "Transaction state should be AUTHORIZED");

    Set<String> expand = new HashSet<>();
    expand.add("transaction");

    TransactionVoid transactionVoid =
      transactionsService.postPaymentTransactionsIdVoidOffline(
        authorizedTransaction.getId(), SPACE_ID, expand);

    assertEquals(
      TransactionVoidState.SUCCESSFUL,
      transactionVoid.getState(),
      "Transaction void state should be SUCCESSFUL");

    assertNotNull(transactionVoid.getTransaction());

    assertEquals(
      TransactionState.VOIDED,
      transactionVoid.getTransaction().getState(),
      "Transaction state should be VOIDED");
  }

  /**
   * Creates, authorizes and completes a transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>It's possible to create a transaction token for the fulfilled transaction
   * </ul>
   */
  @Test
  public void checkIfPossibleToCreateTokenForFulfilledTransaction() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion fulFilledTransactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction fulFilledTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.FULFILL,
      fulFilledTransaction.getState(),
      "Transaction state must be FULFILL");

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      fulFilledTransactionCompletion.getState(),
      "Transaction completion state must be SUCCESSFUL");

    assertTrue(
      transactionsService.getPaymentTransactionsIdCheckTokenCreationPossible(
        fulFilledTransaction.getId(), SPACE_ID),
      "Should be possible to create token for successful transaction");
  }

  /**
   * Creates, authorizes and voids a transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>It's possible to create a transaction token for the voided transaction
   * </ul>
   */
  @Test
  public void checkIfPossibleToCreateTokenForVoidedTransaction() throws ApiException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);

    Transaction transaction = create(transactionCreate);

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    assertEquals(
      TransactionState.AUTHORIZED,
      authorizedTransaction.getState(),
      "Transaction state should be AUTHORIZED");

    TransactionVoid transactionVoid =
      transactionsService.postPaymentTransactionsIdVoidOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction voidedTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionVoidState.SUCCESSFUL,
      transactionVoid.getState(),
      "Transaction void state should be SUCCESSFUL");

    assertEquals(
      TransactionState.VOIDED,
      voidedTransaction.getState(),
      "Transaction state should be VOIDED");

    assertTrue(
      transactionsService.getPaymentTransactionsIdCheckTokenCreationPossible(
        voidedTransaction.getId(), SPACE_ID),
      "Should be possible to create token for voided transaction");
  }

  /**
   * Creates transaction token for a transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>Token contains space ID
   *   <li>Token contains transaction ID
   * </ul>
   */
  @Test
  public void createTransactionCredentialsShouldCreateTransactionToken() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String credentials = getCredentials(transaction.getId());

    assertTrue(
      credentials.startsWith(String.valueOf(SPACE_ID)),
      "Transaction credentials token should have valid format");
    assertNotNull(transaction.getId());
    assertTrue(
      credentials.contains(transaction.getId().toString()),
      "Transaction credentials token should contain transaction id");
  }

  /**
   * Gets IFrame payment URL for transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>URL contains space ID
   *   <li>URL contains transaction ID
   * </ul>
   */
  @Test
  public void fetchIFrameUrlShouldReturnValidUrl() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String iFrameUrl =
      transactionsService.getPaymentTransactionsIdIframeJavascriptUrl(
        transaction.getId(), SPACE_ID);

    assertTrue(
      iFrameUrl.contains(Long.toString(SPACE_ID)),
      "IFrame JavaScript URL should contain space id");

    assertTrue(
      iFrameUrl.contains(Long.toString(transaction.getId())),
      "IFrame JavaScript URL should contain transaction id");
  }

  /**
   * Gets Lightbox payment URL for transaction.
   *
   * <p>Verifies that:
   * <ul>
   *   <li>URL contains space ID
   *   <li>URL contains transaction ID
   * </ul>
   */
  @Test
  public void fetchLightboxUrlShouldReturnValidUrl() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String lightboxJavascriptUrl =
      transactionsService.getPaymentTransactionsIdLightboxJavascriptUrl(
        transaction.getId(), SPACE_ID);

    assertTrue(
      lightboxJavascriptUrl.contains(Long.toString(SPACE_ID)),
      "Lightbox URL should contain space id");

    assertTrue(
      lightboxJavascriptUrl.contains(Long.toString(transaction.getId())),
      "Lightbox URL should contain transaction id");
  }

  /**
   * Creates, authorizes, completes transaction and gets invoice file.
   *
   * <ul>
   *   <li>Creates, authorizes and completes transaction
   *   <li>Gets transaction invoice file
   *   <li>Verifies that:
   *       <ul>
   *         <li>File title contains "invoice"
   *         <li>File mime type is PDF
   *       </ul>
   * </ul>
   */
  @Test
  public void fetchInvoiceShouldReturnPdfFile() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion fulFilledTransactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction fulFilledTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    RenderedDocument invoice =
      transactionsService.getPaymentTransactionsIdInvoiceDocument(
        fulFilledTransaction.getId(), SPACE_ID);

    assertNotNull(invoice.getTitle());
    assertTrue(
      invoice.getTitle().toLowerCase().contains("invoice"), "Invoice title should be present");

    assertNotNull(invoice.getMimeType());
    assertTrue(
      invoice.getMimeType().toLowerCase().contains("pdf"), "Invoice mimetype should be pdf");
  }

  /**
   * Creates, authorizes, completes transaction and gets packing slip.
   *
   * <ul>
   *   <li>Creates, authorizes and completes transaction
   *   <li>Gets transaction packing slip
   *   <li>Verifies that:
   *       <ul>
   *         <li>File title contains "packing slip"
   *         <li>File mime type is PDF
   *       </ul>
   * </ul>
   */
  @Test
  public void fetchPackageSlipShouldReturnPdfFile() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion fulFilledTransactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction fulFilledTransaction =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    RenderedDocument packingSlip =
      transactionsService.getPaymentTransactionsIdPackingSlipDocument(
        fulFilledTransaction.getId(), SPACE_ID);

    assertNotNull(packingSlip.getTitle());
    assertTrue(
      packingSlip.getTitle().toLowerCase().contains("packing slip"),
      "Packing slip title should be present");

    assertNotNull(packingSlip.getMimeType());
    assertTrue(
      packingSlip.getMimeType().toLowerCase().contains("pdf"),
      "Packing slip mimetype should be pdf");
  }

  /**
   * Creates transaction and gets payment methods configuration.
   *
   * <ul>
   *   <li>Creates transaction
   *   <li>Gets payment methods configuration
   *   <li>Verifies that: Payment methods are present
   * </ul>
   */
  @Test
  public void fetchPaymentMethodsByIDShouldReturnAvailablePaymentMethods() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    PaymentMethodConfigurationListResponse methodConfigurationListResponse =
      transactionsService.getPaymentTransactionsIdPaymentMethodConfigurations(
        transaction.getId(), INTEGRATION_MODE, SPACE_ID, EMPTY_EXPAND);

    assertNotNull(
      methodConfigurationListResponse.getData(), "The payment method list should be present");
    assertFalse(
      methodConfigurationListResponse.getData().isEmpty(),
      "Payment methods should be configured for a given transaction in test space");
  }

  /**
   * Creates transaction and finds it by credentials.
   *
   * <ul>
   *   <li>Creates transaction and gets its credentials
   *   <li>Finds transaction by credentials
   *   <li>Verifies that: Transaction is present
   * </ul>
   */
  @Test
  public void fetchTransactionWithCredentialsShouldReturnTransaction() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String credentials =
      transactionsService.getPaymentTransactionsIdCredentials(transaction.getId(), SPACE_ID);

    Transaction retrievedTransaction =
      transactionsService.getPaymentTransactionsByCredentialsCredentials(
        credentials, SPACE_ID, EMPTY_EXPAND);

    assertNotNull(retrievedTransaction, "Transaction must be present");
  }

  /**
   * Creates transaction and gets payment methods configuration by credentials.
   *
   * <ul>
   *   <li>Creates transaction and gets its credentials
   *   <li>Gets payment methods configuration by credentials
   *   <li>Verifies that: Payment methods are present
   * </ul>
   */
  @Test
  public void fetchPaymentMethodsWithCredentialsShouldReturnAvailablePaymentMethods()
    throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String credentials = getCredentials(transaction.getId());

    PaymentMethodConfigurationListResponse methodConfigurationListResponse =
      transactionsService
        .getPaymentTransactionsByCredentialsCredentialsPaymentMethodConfigurations(
          credentials, INTEGRATION_MODE, SPACE_ID, EMPTY_EXPAND);

    assertNotNull(
      methodConfigurationListResponse.getData(), "The payment method list should be present.");

    assertFalse(
      methodConfigurationListResponse.getData().isEmpty(),
      "Payment methods should be configured for a given transaction in test space");
  }

  /**
   * Creates and exports a transaction.
   *
   * <ul>
   *   <li>Creates transaction, exports it
   *   <li>Verifies that: Export file exists
   * </ul>
   */
  @Test
  public void exportTransactionsShouldReturnFile() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Set<String> fields = new HashSet<>();
    fields.add("id");

    assertNotNull(transaction.getId());
    File exportTransaction =
      transactionsService.getPaymentTransactionsExport(
        SPACE_ID, fields, 1, 0, "id:ASC", "id:" + transaction.getId().toString());

    assertTrue(exportTransaction.exists(), "Export file should exist");
  }

  /**
   * Gets transaction by invalid credentials.
   *
   * <ul>
   *   <li>Attempts to retrieve a transaction using invalid credentials
   *   <li>Verifies that: Operation fails as expected
   * </ul>
   */
  @Test
  public void fetchWithCredentialsWithGivenBadCredentialsShouldFail() {
    assertThrows(
      ApiException.class,
      () -> {
        transactionsService.getPaymentTransactionsByCredentialsCredentials(
          "bad_credentials", SPACE_ID, EMPTY_EXPAND);
      },
      "Bad token should error response");
  }

  /**
   * Creates and updates a transaction.
   *
   * <ul>
   *   <li>Creates a new transaction
   *   <li>Updates it with new data
   *   <li>Verifies that:
   *       <ul>
   *         <li>Update was successful
   *         <li>Version was incremented correctly
   *       </ul>
   * </ul>
   */
  @Test
  public void updateShouldChangeTransactionData() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    TransactionPending update = new TransactionPending();
    update.setLanguage("en-GB");
    update.setVersion(2);

    Transaction updatedTransaction =
      transactionsService.patchPaymentTransactionsId(
        transaction.getId(), SPACE_ID, update, EMPTY_EXPAND);

    assertEquals("en-GB", updatedTransaction.getLanguage());
    assertEquals(
      transaction.getMerchantReference(),
      updatedTransaction.getMerchantReference(),
      "Merchant reference should match.");
    assertEquals(2, updatedTransaction.getVersion(), "Version should match");
  }

  /**
   * Tests one-click token flow: creation, update, usage.
   *
   * <ul>
   *   <li>Creates token
   *   <li>Updates token settings (enabling one click payment)
   *   <li>Creates transaction with linked token
   *   <li>Processes and completes transaction
   *   <li>Creates new transaction and completes it using token
   * </ul>
   */
  @Test
  public void processOneClickTokenAndRedirectWithCredentialsShouldReturnPaymentUrl()
    throws ApiException {
    TokenCreate tokenCreate = new TokenCreate();
    tokenCreate.setState(CreationEntityState.ACTIVE);
    tokenCreate.setTokenReference("testtoken");
    tokenCreate.setCustomerId(String.valueOf(TEST_CUSTOMER_ID));
    tokenCreate.externalId(UUID.randomUUID().toString());
    tokenCreate.setCustomerEmailAddress("test@domain.com");

    Token token = tokensService.postPaymentTokens(SPACE_ID, tokenCreate, EMPTY_EXPAND);

    assertNotNull(token.getVersion());

    TokenUpdate tokenUpdate = new TokenUpdate();
    tokenUpdate.setVersion(token.getVersion());
    tokenUpdate.enabledForOneClickPayment(true);
    Token updatedToken =
      tokensService.patchPaymentTokensId(token.getId(), SPACE_ID, tokenUpdate, EMPTY_EXPAND);

    Transaction transaction1 =
      tokensService.postPaymentTokensIdCreateTransactionForTokenUpdate(
        token.getId(), SPACE_ID, EMPTY_EXPAND);

    LineItemCreate lineItem = new LineItemCreate();
    lineItem
          .name("Red T-Shirt")
          .uniqueId("5412")
          .type(LineItemType.PRODUCT)
          .quantity(BigDecimal.valueOf(1))
          .amountIncludingTax(BigDecimal.valueOf(29.95))
          .sku("red-t-shirt-789");

    List<LineItemCreate> lineItemCreateList = new ArrayList<>();
    lineItemCreateList.add(lineItem);

    TransactionPending transaction1Pending = new TransactionPending();
    transaction1Pending.setLineItems(lineItemCreateList);
    transaction1Pending.setVersion(2);
    transaction1Pending.setCurrency("CHF");

    transactionsService.patchPaymentTransactionsId(
      transaction1.getId(), SPACE_ID, transaction1Pending, EMPTY_EXPAND
    );

    Transaction processedTransaction1 =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction1.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion transactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        transaction1.getId(), SPACE_ID, EMPTY_EXPAND);

    TransactionCreate transactionCreate2 = getTransactionCreatePayload();
    transactionCreate2.setTokenizationMode(TokenizationMode.FORCE_CREATION_WITH_ONE_CLICK_PAYMENT);
    transactionCreate2.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate2.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);
    transactionCreate2.setCustomerId(String.valueOf(TEST_CUSTOMER_ID));

    Transaction transaction2 = create(transactionCreate2);

    String credentials1 = getCredentials(transaction1.getId());
    String credentials2 = getCredentials(transaction2.getId());

    String paymentUrl2 =
      transactionsService.postPaymentTransactionsByCredentialsCredentialsOneClickTokensIdProcess(
        credentials2, updatedToken.getId(), SPACE_ID);

    assertFalse(paymentUrl2.isEmpty(), "Payment url should not be empty");
    assertNotNull(paymentUrl2, "Payment url should not be null");

    Transaction readTransaction2 =
      transactionsService.getPaymentTransactionsId(transaction2.getId(), SPACE_ID, EMPTY_EXPAND);

    assertNotEquals(
      TransactionState.FAILED, readTransaction2.getState(), "Transaction state should not be FAILED");
    assertNotEquals(
      TransactionState.PENDING, readTransaction2.getState(), "Transaction state should not be PENDING");

    TransactionCompletion completedTransaction1 =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        transaction1.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionCompletionState.SUCCESSFUL,
      completedTransaction1.getState(),
      "State must be SUCCESSFUL");
  }

  /**
   * Processes transaction via token
   *
   * <ul>
   *   <li>Creates token
   *   <li>Creates transaction with linked token
   *   <li>Processes and completes transaction
   *   <li>Creates new transaction and completes it using token
   * </ul>
   */
  @Test
  public void processTransactionViaTokenShouldProcessTransaction() throws ApiException {
    LineItemCreate lineItem = new LineItemCreate();
    lineItem
          .name("Red T-Shirt")
          .uniqueId("5412")
          .type(LineItemType.PRODUCT)
          .quantity(BigDecimal.valueOf(1))
          .amountIncludingTax(BigDecimal.valueOf(29.95))
          .sku("red-t-shirt-789");

    List<LineItemCreate> lineItemCreateList = new ArrayList<>();
    lineItemCreateList.add(lineItem);

    TokenCreate tokenCreate = new TokenCreate();
    tokenCreate.setState(CreationEntityState.ACTIVE);
    tokenCreate.setTokenReference("testtoken");
    tokenCreate.setCustomerId(String.valueOf(TEST_CUSTOMER_ID));
    tokenCreate.externalId(UUID.randomUUID().toString());
    tokenCreate.setCustomerEmailAddress("test@domain.com");

    Token token = tokensService.postPaymentTokens(SPACE_ID, tokenCreate, EMPTY_EXPAND);

    Transaction transaction =
      tokensService.postPaymentTokensIdCreateTransactionForTokenUpdate(
        token.getId(), SPACE_ID, EMPTY_EXPAND);

    TransactionPending transaction1Pending = new TransactionPending();
    transaction1Pending.setLineItems(lineItemCreateList);
    transaction1Pending.setVersion(2);
    transaction1Pending.setCurrency("CHF");

    transactionsService.patchPaymentTransactionsId(
      transaction.getId(), SPACE_ID, transaction1Pending, EMPTY_EXPAND);

    Transaction processedTransaction1 =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion transactionCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    Transaction transaction2 = create(getTransactionCreatePayload());
    TransactionPending transactionPending = new TransactionPending();
    transactionPending.setToken(token.getId());
    transactionPending.setVersion(transaction2.getVersion());
    transactionPending.setCurrency("CHF");
    transactionPending.setLineItems(lineItemCreateList);

    Transaction updatedTransaction2 =
      transactionsService.patchPaymentTransactionsId(
        transaction2.getId(), SPACE_ID, transactionPending, EMPTY_EXPAND);

    Charge charge =
      transactionsService.postPaymentTransactionsIdProcessWithToken(
        updatedTransaction2.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(ChargeState.SUCCESSFUL, charge.getState(), "Charge state must be SUCCESSFUL");

    Transaction readTransaction2 =
      transactionsService.getPaymentTransactionsId(transaction2.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(token.getId(), readTransaction2.getToken().getId(), "Tokens id should match");
    assertEquals(
      TransactionState.FULFILL,
      readTransaction2.getState(),
      "Transaction state must be FULFILLED");
  }

  /**
   * Verifies non-interactive transaction processing.
   *
   * <ul>
   *   <li>Processes a transaction without user interaction
   *   <li>Verifies that: Transaction reaches the AUTHORIZED state
   * </ul>
   */
  @Test
  public void processWithoutUserInteractionShouldProcessTransactionProperly() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processedTransaction =
      transactionsService.postPaymentTransactionsIdProcessWithoutInteraction(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(transaction.getId(), processedTransaction.getId(), "Transaction ids must match");
    assertEquals(
      TransactionState.PROCESSING,
      processedTransaction.getState(),
      "Transaction state should be PROCESSING");
  }

  /**
   * Retrieves tokens by transaction credentials.
   *
   * <ul>
   *   <li>Creates a new transaction
   *   <li>Attempts to retrieve one-click tokens
   *   <li>Verifies that: Response data is present
   * </ul>
   */
  @Test
  public void fetchOneClickTokenShouldReturnResponseWithoutException() {
    assertDoesNotThrow(() -> {
      Transaction transaction = create(getTransactionCreatePayload());

      String credentials = getCredentials(transaction.getId());

      TokenVersionListResponse tokens =
        transactionsService.getPaymentTransactionsByCredentialsCredentialsOneClickTokens(
          credentials, SPACE_ID, EMPTY_EXPAND);

      assertNotNull(tokens);
      assertNotNull(tokens.getData(), "Token data should not be null");
    });
  }

  /**
   * Processes transaction with 3-D security
   *
   * <ul>
   *   <li>Creates a new transaction
   *   <li>Processes transaction with 3-D security
   *   <li>Verifies that:
   *       <ul>
   *         <li>Returned url contains space id
   *         <li>Returned url contains securityToken
   *         <li>Transaction state is fulfilled
   *       </ul>
   * </ul>
   */
  @Test
  public void processTransactionWithThreeDSecureShouldFulfillTransaction() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    TokenizedCardDataCreate tokenizedCardDataCreate = new TokenizedCardDataCreate();
    tokenizedCardDataCreate.setExpiryDate(MOCK_CARD_DATA.getCardData().getExpiryDate());
    tokenizedCardDataCreate.setPrimaryAccountNumber(
      MOCK_CARD_DATA.getCardData().getPrimaryAccountNumber());

    TokenizedCardRequest tcr = new TokenizedCardRequest();
    tcr.setCardData(tokenizedCardDataCreate);
    tcr.setPaymentMethodConfiguration(TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID);

    String url =
      transactionsService.postPaymentTransactionsIdProcessCardDetailsThreed(
        transaction.getId(), SPACE_ID, tcr);

    Transaction processed =
      transactionsService.getPaymentTransactionsId(transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertNotNull(url, "Url should not be null");
    assertFalse(url.isEmpty(), "Url should not be empty");
    assertNotEquals(TransactionState.FAILED, processed.getState(), "Transaction state should not be FAILED");
    assertNotEquals(TransactionState.PENDING, processed.getState(), "Transaction state should not be PENDING");
  }

  /**
   * Gets mobile sdk url by credentials
   *
   * <ul>
   *   <li>Creates a new transaction
   *   <li>Gets mobile sdk url
   *   <li>Verifies that:
   *       <ul>
   *         <li>Returned url contains space id
   *         <li>Returned url contains securityToken
   *       </ul>
   * </ul>
   */
  @Test
  public void fetchMobileSdkUrlByCredentialsShouldReturnValidUrl() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    String credentials = getCredentials(transaction.getId());

    String url =
      transactionsService.getPaymentTransactionsByCredentialsCredentialsMobileSdkUrl(
        credentials, SPACE_ID);

    assertTrue(url.contains("/s/" + SPACE_ID), "Space id should be present in url");
    assertTrue(url.contains("securityToken="), "Security token should be present in url");
  }

  /**
   * Gets all terminal receipts for transaction.
   *
   * <ul>
   *   <li>Verifies that: Terminal receipts list is empty as they were not created
   * </ul>
   */
  @Test
  public void fetchTerminalReceiptsShouldReturnValidTerminalReceiptsList() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    RenderedTerminalReceiptListResponse receiptListResponse =
      transactionsService.getPaymentTransactionsIdTerminalReceipts(
        transaction.getId(), TerminalReceiptFormat.TXT, 200, SPACE_ID);

    assertNotNull(receiptListResponse, "Response should be present");
    assertEquals(0, receiptListResponse.getData().size(), "Response size should be 0 as no terminal receipts created for this transaction");
  }

  /**
   * Updates charge flow recipient for processing transaction
   *
   * <ul>
   *   <li>Verifies that: Operation made without exceptions
   * </ul>
   */
  @Test
  public void updateChargeFlowRecipientShouldNotThrowException() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction processingTransaction =
      transactionsService.postPaymentTransactionsIdChargeFlowApply(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(
      TransactionState.PROCESSING,
      processingTransaction.getState(),
      "Transaction state should be PROCESSING");

    assertDoesNotThrow(
      () ->
        transactionsService.postPaymentTransactionsIdChargeFlowUpdateRecipient(
          transaction.getId(), 1453447675844L, "test2@domain.com", SPACE_ID),
      "ApiException should not be thrown when updating recipient");
  }

  /**
   * Gets last version of line items list
   *
   * <ul>
   *   <li>Creates a new transaction
   *   <li>Gets line items
   *   <li>Verifies that:
   *       <ul>
   *         <li>Amount is correct
   *         <li>Version is correct
   *         <li>Transaction id is same in transaction and charge
   *       </ul>
   * </ul>
   */
  @Test
  public void fetchLineItemsVersionShouldReturnLatestLineItemsVersion() throws ApiException {
    Transaction transaction = create(getTransactionCreatePayload());

    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transaction.getId(), SPACE_ID, MOCK_CARD_DATA, EMPTY_EXPAND);

    TransactionCompletion processedTransaction =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, EMPTY_EXPAND);

    TransactionLineItemVersion lineItems =
      transactionsService.getPaymentTransactionsIdLatestLineItemVersion(
        transaction.getId(), SPACE_ID, EMPTY_EXPAND);

    assertEquals(1, lineItems.getVersion(), "Line items version should be 1");
    assertEquals(
      BigDecimal.valueOf(29.95), lineItems.getAmount(), "Line items amount should be 29.95");
    assertEquals(
      transaction.getId(), lineItems.getLinkedTransaction(), "Transaction ids should match");
  }

  private Transaction create(TransactionCreate transactionCreate) throws ApiException {
    return transactionsService.postPaymentTransactions(SPACE_ID, transactionCreate, EMPTY_EXPAND);
  }

  private String getCredentials(Long transactionId) throws ApiException {
    return transactionsService.getPaymentTransactionsIdCredentials(transactionId, SPACE_ID);
  }
}
