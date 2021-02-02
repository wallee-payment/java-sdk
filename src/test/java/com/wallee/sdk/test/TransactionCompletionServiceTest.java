package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * API tests for TransactionCompletionService
 */
public class TransactionCompletionServiceTest {

    // Credentials
    private Long spaceId = (long) 405;
    private Long applicationUserId = (long) 512;
    private String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

    // Services
    private ApiClient apiClient;

    // Models
    private TransactionCreate transactionPayload;

    @Before
    public void setup() {
        if (this.apiClient == null) {
            this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        }
    }

    /**
     * Get transaction payload
     *
     * @return TransactionCreate
     */
    private TransactionCreate getTransactionPayload() {
        if (this.transactionPayload == null) {
            // Line item
            LineItemCreate lineItem = new LineItemCreate();
            lineItem.name("Red T-Shirt")
                    .uniqueId("5412")
                    .type(LineItemType.PRODUCT)
                    .quantity(BigDecimal.valueOf(1))
                    .amountIncludingTax(BigDecimal.valueOf(29.95))
                    .sku("red-t-shirt-123");

            // Customer Billind Address
            AddressCreate billingAddress = new AddressCreate();
            billingAddress.city("Winterthur")
                    .country("CH")
                    .emailAddress("test@example.com")
                    .familyName("Customer")
                    .givenName("Good")
                    .postcode("8400")
                    .postalState("ZH")
                    .organizationName("Test GmbH")
                    .mobilePhoneNumber("+41791234567")
                    .salutation("Ms");

            this.transactionPayload = new TransactionCreate();
            this.transactionPayload.autoConfirmationEnabled(true).currency("CHF").language("en-US");
            this.transactionPayload.setBillingAddress(billingAddress);
            this.transactionPayload.setShippingAddress(billingAddress);
            this.transactionPayload.setCompletionBehavior(TransactionCompletionBehavior.COMPLETE_DEFERRED);
            this.transactionPayload.addLineItemsItem(lineItem);
        }
        return this.transactionPayload;
    }

    /**
     * completeOffline
     * <p>
     * This operation completes the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
     */
    @Test
    public void completeOfflineTest() throws Exception{
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        transaction = this.apiClient.getTransactionService().processWithoutUserInteraction(spaceId, transaction.getId());
        // wait for transaction to be authorized
		for (int i = 1; i <= 10; i++) {
			if (
				transaction.getState() == TransactionState.AUTHORIZED ||
				transaction.getState() == TransactionState.FAILED
			) {
				break;
			}

			try {
				Thread.sleep(i * 500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			transaction = this.apiClient.getTransactionService().read(this.spaceId, transaction.getId());
		}
		Assert.assertEquals(TransactionState.AUTHORIZED, transaction.getState());
 
		transaction = this.apiClient.getTransactionService().processWithoutUserInteraction(this.spaceId, transaction.getId());
		TransactionCompletion transactionCompletion = this.apiClient.getTransactionCompletionService().completeOffline(this.spaceId, transaction.getId());
		TransactionCompletionState[] TransactionCompletionStates = {
				TransactionCompletionState.SUCCESSFUL,
				TransactionCompletionState.PENDING
		};
		Assert.assertTrue("Transaction Completions " + transactionCompletion.getState(), Arrays.asList(TransactionCompletionStates).contains(transactionCompletion.getState()));
    }

    /**
     * completeOnline
     * <p>
     * This operation completes the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
     */
    @Test
    public void completeOnlineTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        transaction = this.apiClient.getTransactionService().processWithoutUserInteraction(spaceId, transaction.getId());
        // wait for transaction to be authorized
		for (int i = 1; i <= 10; i++) {
			if (
				transaction.getState() == TransactionState.AUTHORIZED ||
				transaction.getState() == TransactionState.FAILED
			) {
				break;
			}

			try {
				Thread.sleep(i * 500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			transaction = this.apiClient.getTransactionService().read(this.spaceId, transaction.getId());
		}
		Assert.assertEquals(TransactionState.AUTHORIZED, transaction.getState());
		transaction = this.apiClient.getTransactionService().processWithoutUserInteraction(this.spaceId, transaction.getId());
		TransactionCompletion transactionCompletion = this.apiClient.getTransactionCompletionService().completeOnline(this.spaceId, transaction.getId());
		TransactionCompletionState[] TransactionCompletionStates = {
				TransactionCompletionState.SUCCESSFUL,
				TransactionCompletionState.PENDING
		};
		Assert.assertTrue("Transaction Completions " + transactionCompletion.getState(), Arrays.asList(TransactionCompletionStates).contains(transactionCompletion.getState()));
    }

    /**
     * completePartiallyOffline
     * <p>
     * This operation can be used to partially complete the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
     */
    @Ignore
    @Test
    public void completePartiallyOfflineTest() {
        // TODO: test validations
    }

    /**
     * completePartiallyOnline
     * <p>
     * This operation can be used to partially complete the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
     */
    @Ignore
    @Test
    public void completePartiallyOnlineTest() {
        // TODO: test validations
    }

    /**
     * Count
     * <p>
     * Counts the number of items in the database as restricted by the given filter.
     */
    @Ignore
    @Test
    public void countTest() {
        // TODO: test validations
    }

    /**
     * Read
     * <p>
     * Reads the entity with the given &#39;id&#39; and returns it.
     */
    @Ignore
    @Test
    public void readTest() {
        // TODO: test validations
    }

    /**
     * Search
     * <p>
     * Searches for the entities as specified by the given query.
     */
    @Ignore
    @Test
    public void searchTest() {
        // TODO: test validations
    }

}
