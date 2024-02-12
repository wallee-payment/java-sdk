package com.wallee.sdk.test;


import static com.wallee.sdk.test.TestConstants.FAKE_CARD_DATA;
import static com.wallee.sdk.test.TestConstants.SPACE_ID;
import static com.wallee.sdk.test.TestConstants.TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID;
import static com.wallee.sdk.test.TestUtils.getApiClient;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RefundTest {
  private TransactionService transactionService;
  private CardProcessingService cardProcessingService;
  private TransactionCompletionService transactionCompletionService;
  private RefundService refundService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    cardProcessingService = apiClient.getCardProcessingService();
    transactionCompletionService = apiClient.getTransactionCompletionService();
    refundService = apiClient.getRefundService();
  }

  @Test
  public void refundOfCompletedTransactionShouldWork() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    TransactionCompletion completedTransaction =
        transactionCompletionService.completeOffline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction.getState());

    Transaction readTransaction = transactionService.read(SPACE_ID, processedTransaction.getId());

    Refund refund = refundService.refund(SPACE_ID, getRefundCreatePayload(readTransaction));
    assertEquals("State must be SUCCESSFUL",
        RefundState.SUCCESSFUL, refund.getState());
  }

  @Test
  public void readShouldReturnRefundData() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    TransactionCompletion completedTransaction =
        transactionCompletionService.completeOffline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction.getState());

    Transaction readTransaction = transactionService.read(SPACE_ID, processedTransaction.getId());

    Refund refund = refundService.refund(SPACE_ID, getRefundCreatePayload(readTransaction));
    assertEquals("State must be SUCCESSFUL",
        RefundState.SUCCESSFUL, refund.getState());

    Refund readRefund = refundService.read(SPACE_ID, refund.getId());

    assertEquals("Refund ids must match",
        refund.getId(), readRefund.getId());
  }

  @Test
  public void searchByGivenCriteriaShouldReturnRefund() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    TransactionCompletion completedTransaction =
        transactionCompletionService.completeOffline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction.getState());

    Transaction readTransaction = transactionService.read(SPACE_ID, processedTransaction.getId());

    Refund refund = refundService.refund(SPACE_ID, getRefundCreatePayload(readTransaction));
    assertEquals("State must be SUCCESSFUL",
        RefundState.SUCCESSFUL, refund.getState());

    EntityQueryFilter filter = new EntityQueryFilter();
    filter.setFieldName("id");
    filter.setValue(refund.getId());
    filter.setType(EntityQueryFilterType.LEAF);
    filter.setOperator(CriteriaOperator.EQUALS);

    EntityQuery criteria = new EntityQuery();
    criteria.setFilter(filter);

    List<Refund> refunds = refundService.search(SPACE_ID, criteria);
    
    assertEquals("Should find 1 refund", 1, refunds.size());

    refunds.forEach(ref -> {
      assertEquals("Refund ids must match",
          refund.getId(), ref.getId());
    });
  }

  @Test
  public void countByGivenCriteriaShouldReturnAmountOfRefunds() throws IOException {
    Transaction transaction = transactionService.create(SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    Transaction processedTransaction =
        cardProcessingService.process(SPACE_ID, transaction.getId(),
            TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID, FAKE_CARD_DATA);

    TransactionCompletion completedTransaction =
        transactionCompletionService.completeOffline(SPACE_ID, processedTransaction.getId());

    assertEquals("State must be SUCCESSFUL",
        TransactionCompletionState.SUCCESSFUL, completedTransaction.getState());

    Transaction readTransaction = transactionService.read(SPACE_ID, processedTransaction.getId());

    Refund refund = refundService.refund(SPACE_ID, getRefundCreatePayload(readTransaction));
    assertEquals("State must be SUCCESSFUL",
        RefundState.SUCCESSFUL, refund.getState());

    EntityQueryFilter criteria = new EntityQueryFilter();
    criteria.setFieldName("id");
    criteria.setValue(refund.getId());
    criteria.setType(EntityQueryFilterType.LEAF);
    criteria.setOperator(CriteriaOperator.EQUALS);

    long count = refundService.count(SPACE_ID, criteria);
    assertEquals(1, count);
  }

  private RefundCreate getRefundCreatePayload(Transaction transaction) {
    RefundCreate create = new RefundCreate();
    create.setExternalId(String.valueOf(transaction.getId()));
    create.setType(RefundType.MERCHANT_INITIATED_ONLINE);
    create.setAmount(transaction.getAuthorizationAmount());
    create.setTransaction(transaction.getId());
    create.setMerchantReference(transaction.getMerchantReference());

    return create;
  }
}
