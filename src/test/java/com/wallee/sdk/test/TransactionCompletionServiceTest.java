package com.wallee.sdk.test;

import static com.wallee.sdk.test.TestConstants.FAKE_CARD_DATA;
import static com.wallee.sdk.test.TestConstants.SPACE_ID;
import static com.wallee.sdk.test.TestConstants.TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID;
import static com.wallee.sdk.test.TestUtils.getApiClient;
import static com.wallee.sdk.test.TestUtils.getTransactionCreatePayload;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TransactionCompletionServiceTest {
  private TransactionService transactionService;
  private CardProcessingService cardProcessingService;
  private TransactionCompletionService transactionCompletionService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    cardProcessingService = apiClient.getCardProcessingService();
    transactionCompletionService = apiClient.getTransactionCompletionService();
  }

  @Test
  public void completeOfflineShouldMakeTransactionStatusSuccessful() throws IOException {
    Transaction transaction =
        transactionService.create(SPACE_ID, getDeferredTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());

    TransactionCompletion transactionCompletion =
        transactionCompletionService.completeOffline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, transactionCompletion.getState());
  }

  @Test
  public void completeOnlineShouldMakeTransactionStatusSuccessful() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        getDeferredTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());

    TransactionCompletion transactionCompletion =
        transactionCompletionService.completeOnline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, transactionCompletion.getState());
  }

  @Test
  public void readShouldReturnCompletedTransactionData() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        getDeferredTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());

    TransactionCompletion transactionCompletion =
        transactionCompletionService.completeOnline(SPACE_ID, processedTransaction.getId());

    TransactionCompletion readTransaction =
        transactionCompletionService.read(SPACE_ID, transactionCompletion.getId());

    assertEquals("Transaction ids must match",
        transactionCompletion.getId(), readTransaction.getId());
  }

  @Test
  public void countByCriteriaShouldReturnAmountOfCompletedTransactions() throws IOException {
    Transaction transaction =
        transactionService.create(SPACE_ID, getDeferredTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());

    TransactionCompletion completedTransaction =
        transactionCompletionService.completeOnline(SPACE_ID, processedTransaction.getId());

    EntityQueryFilter criteria = new EntityQueryFilter();
    criteria.setFieldName("id");
    criteria.setValue(completedTransaction.getId());
    criteria.setType(EntityQueryFilterType.LEAF);
    criteria.setOperator(CriteriaOperator.EQUALS);

    long count = transactionCompletionService.count(SPACE_ID, criteria);

    assertEquals("Count of completions should be 1",
        1, count);
  }

  @Test
  public void searchByCriteriaShouldReturnTransactionCompletions() throws IOException {
    Transaction transaction =
        transactionService.create(SPACE_ID, getDeferredTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    assertEquals("State must be AUTHORIZED",
        TransactionState.AUTHORIZED, processedTransaction.getState());

    TransactionCompletion transactionCompletion =
        transactionCompletionService.completeOnline(SPACE_ID, processedTransaction.getId());

    EntityQueryFilter filter = new EntityQueryFilter();
    filter.setFieldName("id");
    filter.setValue(transactionCompletion.getId());
    filter.setType(EntityQueryFilterType.LEAF);
    filter.setOperator(CriteriaOperator.EQUALS);

    EntityQuery criteria = new EntityQuery();
    criteria.setFilter(filter);

    List<TransactionCompletion> completions =
        transactionCompletionService.search(SPACE_ID, criteria);

    assertFalse("Completions should exist", completions.isEmpty());

    completions.forEach(compl -> {
      assertEquals("Completion id should match",
          transactionCompletion.getId(), compl.getId());
    });
  }

  private TransactionCreate getDeferredTransactionCreatePayload() {
    TransactionCreate create = getTransactionCreatePayload();
    create.setTokenizationMode(TokenizationMode.FORCE_CREATION);
    create.setCustomersPresence(CustomersPresence.NOT_PRESENT);
    create.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);
    return create;
  }
}
