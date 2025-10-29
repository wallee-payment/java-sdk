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

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.model.TransactionListResponse;
import com.wallee.sdk.model.TransactionSearchResponse;
import com.wallee.sdk.model.TransactionState;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static com.wallee.sdk.service.TestConstants.MOCK_CARD_DATA;
import static com.wallee.sdk.service.TestConstants.SPACE_ID;
import static com.wallee.sdk.service.TestUtils.getApiClient;
import static com.wallee.sdk.service.TestUtils.getTransactionCreatePayload;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Api querying features test using transactions service
 */
public class QueryingTest {
  private static TransactionsService transactionsService;
  private static Transaction transaction1;
  private static Transaction transaction2;

  @BeforeAll
  static void setUp() throws ApiException {
    ApiClient apiClient = getApiClient();
    transactionsService = new TransactionsService(apiClient);

    Transaction transactionBase =
      transactionsService.postPaymentTransactions(
        SPACE_ID, getTransactionCreatePayload(), Collections.emptySet());
    Transaction authorizedTransaction =
      transactionsService.postPaymentTransactionsIdProcessCardDetails(
        transactionBase.getId(), SPACE_ID, MOCK_CARD_DATA, Collections.emptySet());
    TransactionCompletion transactionsIdCompletion =
      transactionsService.postPaymentTransactionsIdCompleteOnline(
        authorizedTransaction.getId(), SPACE_ID, Collections.emptySet());
    transaction1 =
      transactionsService.getPaymentTransactionsId(
        authorizedTransaction.getId(), SPACE_ID, Collections.emptySet());

    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setCurrency("USD");
    transactionCreate.setMerchantReference("Transaction for querying test");
    transaction2 =
      transactionsService.postPaymentTransactions(
        SPACE_ID, transactionCreate, Collections.emptySet());
  }

  /**
   * Transaction search with limit parameter set to 2 items.
   */
  @Test
  public void searchWithLimitShouldReturnCorrectAmountOfItems() throws ApiException {
    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 2, 0, "", "");

    assertEquals(
      2,
      transactionSearchResponse.getData().size(),
      "Response should contain 2 items(as limited)");
  }

  /**
   * Transaction search with offset parameter. Search is made with query which selects only 2 items
   * and offset parameter is set to 1. Response should contain only one item which has higher id
   * number.
   */
  @Test
  public void searchWithOffsetShouldReturnCorrectResponse() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");
    assertNotNull(transaction2, "Second transaction should be present for this test");

    String query =
      "id:" + transaction1.getId().toString() + " OR id:" + transaction2.getId().toString();
    Long higherNumberId = Math.max(transaction1.getId(), transaction2.getId());

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 2, 1, "id:ASC", query);

    assertEquals(
      higherNumberId,
      transactionSearchResponse.getData().getFirst().getId(),
      "Response offset should be correct");
  }

  /**
   * Transaction search using the 'before' parameter. Ensures that search returns transactions with
   * IDs less than the given upperBoundTransactionId. The response should contain transaction with
   * the lower ID (lowerBoundTransactionId), assuming it precedes the upperBoundTransactionId.
   */
  @Test
  public void searchWithBeforeParameterShouldReturnCorrectResponses() throws ApiException {
    assertNotNull(transaction1, "First transaction must be initialized for this test");
    assertNotNull(transaction2, "Second transaction must be initialized for this test");

    Long upperBoundTransactionId = Math.max(transaction1.getId(), transaction2.getId());
    Long lowerBoundTransactionId = Math.min(transaction1.getId(), transaction2.getId());

    TransactionListResponse response =
      transactionsService.getPaymentTransactions(
        SPACE_ID, null, upperBoundTransactionId, Collections.emptySet(), 10, SortingOrder.ASC);

    assertNotNull(response.getData(), "Response data should not be null");
    assertTrue(
      response.getData().stream().anyMatch(t -> t.getId().equals(lowerBoundTransactionId)),
      "Response should contain the transaction with ID: " + lowerBoundTransactionId);
  }

  /**
   * Transaction search made with query. Response should contain 2 items.
   */
  @Test
  public void fetchWithSearchQueryShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");
    assertNotNull(transaction2, "Second transaction should be present for this test");

    String query =
      "id:" + transaction1.getId().toString() + " OR id:" + transaction2.getId().toString();

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 4, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertEquals(
      2, transactionSearchResponse.getData().size(), "Response should contain only 2 items");
  }

  /**
   * Transaction search made with query which contains quotes. Response should contain 1 items.
   */
  @Test
  public void fetchWithSearchQueryWithQuotesShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");
    assertNotNull(transaction2, "Second transaction should be present for this test");

    String query = "merchantReference:\"Transaction for querying test\" AND id:" + transaction2.getId().toString();

    TransactionSearchResponse transactionSearchResponse = transactionsService.getPaymentTransactionsSearch(
      SPACE_ID, Collections.emptySet(), 4, 0, "id:ASC", query
    );

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertNotEquals(
      0, transactionSearchResponse.getData().size(), "Response should contain more than 0 items");
    assertEquals(1, transactionSearchResponse.getData().size(), "Response should contain 1 item");
  }

  /**
   * Transaction search made with query which has isNull constrain. Response should contain 1 item.
   */
  @Test
  public void fetchWithQueryWithIsNullConstrainShouldReturnListWithValidItem() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");

    String query = "id:" + transaction2.getId().toString() + " AND paymentConnectorConfiguration:*";

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 4, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertEquals(
      1, transactionSearchResponse.getData().size(), "Response should contain only 1 items");
  }

  /**
   * Transaction search made with query which has grouping. Response should contain 1 item.
   */
  @Test
  public void fetchWithQueryWithGroupingShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");
    assertNotNull(transaction2, "Second transaction should be present for this test");

    String query = "id:" + transaction1.getId().toString() + " AND (currency:EUR OR currency:CHF)";

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 4, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertEquals(
      1, transactionSearchResponse.getData().size(), "Response should contain only 1 items");
  }

  /**
   * Transaction search made with query which has range clause. Response should contain transaction
   * with specific id.
   */
  @Test
  public void fetchWithQueryWithRangeShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");

    String query = "id:>" + (transaction1.getId() - 2) + " id:<=" + (transaction1.getId() + 2);

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 8, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertTrue(
      transactionSearchResponse.getData().stream()
        .anyMatch(t -> t.getId().equals(transaction1.getId())),
      "Transaction with expected ID should be found");
  }

  /**
   * Transaction search made with query with contains clause. Response should contain more then 0 items
   */
  @Test
  public void fetchWithQueryWithContainsClauseShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction2, "Second transaction should be present for this test");

    String query = "merchantReference:~querying";

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 2, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertNotEquals(
      0, transactionSearchResponse.getData().size(), "Response should contain more then 0 items");
  }

  /**
   * Transaction search made with query which negation parameter. Response should not contain transaction
   * with specific id.
   */
  @Test
  public void fetchWithQueryWithNegationShouldReturnListWithValidItems() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");

    String query = "id:>" + (transaction1.getId() - 2) + " id:<=" + (transaction1.getId() + 2) + " AND -id:" + transaction1.getId();

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 8, 0, "id:ASC", query);

    assertNotNull(transactionSearchResponse, "Response should be present");
    assertNotNull(transactionSearchResponse.getData());
    assertFalse(
      transactionSearchResponse.getData().stream()
        .anyMatch(t -> t.getId().equals(transaction1.getId())),
      "Transaction with expected ID should be found");
  }

  /**
   * Transaction search made with order clause. Items in response should be in descending order.
   */
  @Test
  public void searchWithDescSortingShouldReturnSortedResponse() throws ApiException {
    assertNotNull(transaction1, "First transaction should be present for this test");
    assertNotNull(transaction2, "Second transaction should be present for this test");

    TransactionSearchResponse transactionSearchResponse =
      transactionsService.getPaymentTransactionsSearch(
        SPACE_ID, Collections.emptySet(), 4, 0, "id:DESC", "");

      assertNotNull(transactionSearchResponse.getData());
      assertNotNull(transactionSearchResponse.getData().getFirst().getId());
      assertNotNull(transactionSearchResponse.getData().getLast().getId());

    long differenceBetweenFirstAndLast  = transactionSearchResponse.getData().getFirst().getId() - transactionSearchResponse.getData().getLast().getId();

    assertTrue(differenceBetweenFirstAndLast > 0, "Response should be sorted descending. First id in DESC order should be higher than last");
  }

  /**
   * Gets transaction with no expand parameters. Checks if response does not contain any data which
   * should be present only when expand used. Example: group id should be present, but group state
   * should be null.
   */
  @Test
  public void fetchWithNoExpandingShouldReturnCollapsedResponse() throws ApiException {
    assertNotNull(transaction1, "Transaction should be present for this test");

    Transaction response =
      transactionsService.getPaymentTransactionsId(
        transaction1.getId(), SPACE_ID, Collections.emptySet());

    assertNotNull(response.getGroup(), "Group always should be present");
    assertNotNull(response.getGroup().getId(), "Id always should be present");

    assertNull(
      response.getGroup().getState(), "Group state should be null when response collapsed");
    assertNull(
      response.getGroup().getVersion(), "Group version should be null when response collapsed");
  }

  /**
   * Gets transaction with expand parameters. Checks if response contains data which should be
   * present when expand parameter is enabled. Example: group id and group state, version
   */
  @Test
  public void fetchWithExpandingShouldReturnExpandedResponse() throws ApiException {
    assertNotNull(transaction1, "Transaction should be present for this test");
    assertEquals(
      TransactionState.FULFILL,
      transaction1.getState(),
      "Transaction state should be FULFILLED for this test");

    Set<String> expandSet = new HashSet<>();
    expandSet.add("group");
    expandSet.add("paymentConnectorConfiguration");

    Transaction response =
      transactionsService.getPaymentTransactionsId(transaction1.getId(), SPACE_ID, expandSet);

    assertNotNull(response.getGroup(), "Group always should be present");
    assertNotNull(response.getGroup().getId(), "Group id always should be present");

    assertNotNull(
      response.getGroup().getState(), "Group state should be present when response expanded");
    assertNotNull(
      response.getGroup().getVersion(), "Group version should be present when response expanded");

    assertNotNull(response.getPaymentConnectorConfiguration());
    assertNotNull(
      response.getPaymentConnectorConfiguration().getProcessorConfiguration(),
      "Both items in expand set should be expanded");
  }

  /**
   * Gets transaction with nested expand parameter. Checks if response contains data related to
   * parent item and to child item. Example: paymentConnectorConfiguration - parent item and
   * processorConfiguration - child item.
   */
  @Test
  public void fetchWithNestedExpandingShouldReturnExpandedResponse() throws ApiException {
    assertNotNull(transaction1, "Transaction should be present for this test");
    assertEquals(
      TransactionState.FULFILL,
      transaction1.getState(),
      "Transaction state should be FULFILLED for this test");

    Set<String> expandSet = new HashSet<>();
    expandSet.add("paymentConnectorConfiguration.processorConfiguration");

    Transaction response =
      transactionsService.getPaymentTransactionsId(transaction1.getId(), SPACE_ID, expandSet);

    assertNotNull(response.getPaymentConnectorConfiguration());
    assertNotNull(response.getPaymentConnectorConfiguration().getProcessorConfiguration());
    assertNotNull(
      response.getPaymentConnectorConfiguration().getProcessorConfiguration().getLinkedSpaceId(),
      "Items in nested response should be present");
  }
}
