package com.wallee.sdk.test;

import static com.wallee.sdk.test.TestConstants.FAKE_CARD_DATA;
import static com.wallee.sdk.test.TestConstants.SPACE_ID;
import static com.wallee.sdk.test.TestConstants.TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID;
import static com.wallee.sdk.test.TestConstants.TEST_CUSTOMER_ID;
import static com.wallee.sdk.test.TestUtils.getApiClient;
import static com.wallee.sdk.test.TestUtils.getTransactionCreatePayload;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TransactionServiceTest {
  private TransactionService transactionService;
  private CardProcessingService cardProcessingService;
  private TokenService tokenService;
  private TransactionCompletionService transactionCompletionService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    cardProcessingService = apiClient.getCardProcessingService();
    tokenService = apiClient.getTokenService();
    transactionCompletionService = apiClient.getTransactionCompletionService();
  }

  @Test
  public void createShouldCreateTransactionInPendingState() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        getTransactionCreatePayload());

    assertEquals("State must be PENDING",
        TransactionState.PENDING, transaction.getState());
  }

  @Test
  public void confirmShouldMakeTransactionConfirmed() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID, getTransactionCreatePayload());

    TransactionPending update = new TransactionPending();
    update.setId(transaction.getId());
    update.setVersion(Long.valueOf(transaction.getVersion()));
    Transaction confirmedTransaction =
        transactionService.confirm(SPACE_ID, update);

    assertEquals("State must be CONFIRMED",
        TransactionState.CONFIRMED, confirmedTransaction.getState());
  }

  @Test
  public void deferredTransactionProcessingShouldMakeTransactionAuthorized()
      throws IOException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);

    Transaction transaction = transactionService.create(SPACE_ID, transactionCreate);

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());
  }

  @Test
  public void completeImmediatelyTransactionShouldMakeTransactionFulfilled()
      throws IOException {
    TransactionCreate transactionCreate = getTransactionCreatePayload();
    transactionCreate.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    transactionCreate.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_IMMEDIATELY);

    Transaction transaction = transactionService.create(SPACE_ID, transactionCreate);

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be FULFILL",
        TransactionState.FULFILL, processedTransaction.getState());
  }

  @Test
  public void countByGivenCriteriaShouldReturnTransactionCount() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    EntityQueryFilter criteria = new EntityQueryFilter();
    criteria.setFieldName("id");
    criteria.setValue(transaction.getId());
    criteria.setType(EntityQueryFilterType.LEAF);
    criteria.setOperator(CriteriaOperator.EQUALS);

    long count = transactionService.count(SPACE_ID, criteria);
    assertEquals("Transaction count should be 1",
        1, count);
  }

  @Test
  public void fetchPaymentMethodsShouldReturnAvailablePaymentMethods() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    List<PaymentMethodConfiguration> methods =
        transactionService.fetchPaymentMethods(SPACE_ID, transaction.getId(), "payment_page");

    assertFalse("Payment methods should be configured for a given transaction in test space",
        methods.isEmpty());
  }

  @Test
  public void createTransactionCredentialsShouldCreateTransactionToken() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    String creds = transactionService.createTransactionCredentials(
        SPACE_ID, transaction.getId());

    assertTrue("Transaction credentials token should have valid format",
        creds.startsWith(String.valueOf(SPACE_ID)));
  }

  @Test
  public void readForExistingTransactionShouldReturnTransactionData() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    Transaction readTransaction = transactionService.read(
        SPACE_ID, transaction.getId());

    assertEquals("Transaction ids should match",
        transaction.getId(), readTransaction.getId());
  }

  @Test
  public void readWithCredentialsWithGivenBadCredentialsShouldFail() {
    assertThrows("Bad token should error response",
      IOException.class, () -> {
        transactionService.readWithCredentials("invalid_token");
      });
  }

  @Test
  public void readWithCredentialsShouldReturnTransactionData() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    String creds = transactionService.createTransactionCredentials(
        SPACE_ID, transaction.getId());

    Transaction readTransaction = transactionService.readWithCredentials(creds);
    assertEquals("Transaction ids should match",
        transaction.getId(), readTransaction.getId());
  }

  @Test
  public void searchByGivenCriteriaShouldFindTransaction() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    EntityQueryFilter filter = new EntityQueryFilter();
    filter.setFieldName("id");
    filter.setValue(transaction.getId());
    filter.setType(EntityQueryFilterType.LEAF);
    filter.setOperator(CriteriaOperator.EQUALS);

    EntityQuery entityQuery = new EntityQuery();
    entityQuery.setFilter(filter);

    List<Transaction> transactions = transactionService.search(SPACE_ID, entityQuery);

    assertEquals("Should find 1 transaction", 1, transactions.size());

    transactions.forEach(trans -> {
      assertEquals("Transaction ids should match",
        transaction.getId(), trans.getId());
    });
  }

  @Test
  public void updateShouldChangeTransactionData() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    TransactionPending update = new TransactionPending();
    update.setId(transaction.getId());
    update.setVersion(Long.valueOf(transaction.getVersion()));
    update.setLanguage("en-GB");

    Transaction updatedTransaction = transactionService.update(SPACE_ID, update);
    assertEquals("en-GB", updatedTransaction.getLanguage());
  }

  @Test
  public void processWithoutUserInteractionShouldProcessTransactionProperly() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    Transaction processedTransaction = transactionService.processWithoutUserInteraction(
        SPACE_ID, transaction.getId());

    assertEquals("Transaction ids mush match",
        transaction.getId(), processedTransaction.getId());
  }

  @Test
  public void fetchOneClickTokenShouldReturnNoTokensIfThoseWereNotCreatedYet() throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    String creds = transactionService.createTransactionCredentials(
        SPACE_ID, transaction.getId());

    List<TokenVersion> tokens = transactionService.fetchOneClickTokensWithCredentials(creds);
    assertTrue("Should be no tokens yet", tokens.isEmpty());
  }

  @Test
  public void fetchPaymentMethodsWithCredentialsShouldReturnDefinedPaymentMethods()
      throws IOException {
    Transaction transaction = transactionService.create(
        SPACE_ID, getTransactionCreatePayload());

    String creds = transactionService.createTransactionCredentials(
        SPACE_ID, transaction.getId());

    List<PaymentMethodConfiguration> methods =
        transactionService.fetchPaymentMethodsWithCredentials(creds, "payment_page");

    assertFalse("Should have some payment methods set up", methods.isEmpty());
  }

  @Test
  public void processOneClickTokenAndRedirectWithCredentialsShouldReturnPaymentUrl()
      throws IOException {
    TransactionCreate transactionCreate1 = getTransactionCreatePayload();
    transactionCreate1.setTokenizationMode(TokenizationMode.FORCE_CREATION_WITH_ONE_CLICK_PAYMENT);
    transactionCreate1.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate1.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);
    transactionCreate1.setCustomerId(String.valueOf(TEST_CUSTOMER_ID));

    Transaction transaction1 = transactionService.create(
        SPACE_ID, transactionCreate1);

    Transaction processedTransaction1 =
        cardProcessingService.process(SPACE_ID, transaction1.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    Token token = tokenService.createToken(SPACE_ID, processedTransaction1.getId());
    TokenUpdate tokenUpdate = new TokenUpdate();
    tokenUpdate.setId(token.getId());
    tokenUpdate.setVersion(Long.valueOf(token.getVersion()));
    tokenUpdate.enabledForOneClickPayment(true);
    Token updatedToken = tokenService.update(SPACE_ID, tokenUpdate);

    TransactionCreate transactionCreate2 = getTransactionCreatePayload();
    transactionCreate2.setTokenizationMode(TokenizationMode.FORCE_CREATION_WITH_ONE_CLICK_PAYMENT);
    transactionCreate2.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    transactionCreate2.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);
    transactionCreate2.setCustomerId(String.valueOf(TEST_CUSTOMER_ID));

    Transaction transaction2 = transactionService.create(SPACE_ID, transactionCreate2);
    String creds2 = transactionService.createTransactionCredentials(SPACE_ID, transaction2.getId());
    String paymentUrl2 = transactionService.processOneClickTokenAndRedirectWithCredentials(creds2,
        updatedToken.getId());

    assertTrue("URL must be of a proper format", paymentUrl2.contains("securityToken"));

    Transaction readTransaction2 = transactionService.read(SPACE_ID, transaction2.getId());

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, readTransaction2.getState());

    TransactionCompletion completedTransaction2 =
        transactionCompletionService.completeOnline(SPACE_ID, transaction2.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction2.getState());

    TransactionCompletion completedTransaction1 =
        transactionCompletionService.completeOnline(SPACE_ID, transaction1.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction1.getState());

    tokenService.delete(SPACE_ID, token.getId());
  }
}
