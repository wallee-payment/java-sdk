package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * API tests for RefundService
 */
public class RefundServiceTest {

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

            // Customer Billing Address
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
            this.transactionPayload.addLineItemsItem(lineItem);
        }
        return this.transactionPayload;
    }

    /**
     * Get refund payload
     *
     * @param transaction
     * @return
     */
    private RefundCreate getRefundPayload(Transaction transaction) {
        RefundCreate refundPayload = new RefundCreate();
        refundPayload.amount(transaction.getAuthorizationAmount())
                .transaction(transaction.getId())
                .merchantReference(transaction.getMerchantReference())
                .externalId(transaction.getId().toString())
                .type(RefundType.MERCHANT_INITIATED_ONLINE);
        return refundPayload;
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
     * fail
     * <p>
     * This operation allows to mark a refund as failed which is in state MANUAL_CHECK.
     */
    @Ignore
    @Test
    public void failTest() {
        // TODO: test validations
    }

    /**
     * getRefundDocument
     * <p>
     * Returns the PDF document for the refund with given id.
     */
    @Ignore
    @Test
    public void getRefundDocumentTest() {
        // TODO: test validations
    }

    /**
     * getRefundDocumentWithTargetMediaType
     * <p>
     * Returns the PDF document for the refund with given id and the given target media type.
     */
    @Ignore
    @Test
    public void getRefundDocumentWithTargetMediaTypeTest() {
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
     * create
     * <p>
     * This operation creates and executes a refund of a particular transaction.
     */
    @Test
    public void refundTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        transaction = this.apiClient.getTransactionService().processWithoutUserInteraction(spaceId, transaction.getId());
        // wait for transaction to be authorized
		for (int i = 1; i <= 10; i++) {
			if (
				transaction.getState() == TransactionState.FULFILL ||
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

        if (transaction.getState() == TransactionState.FULFILL) {
            TransactionCompletion transactionCompletion = this.apiClient.getTransactionCompletionService().completeOffline(this.spaceId, transaction.getId());

            Assert.assertEquals(
                    "Transaction completion successful",
                    transactionCompletion.getState(),
                    TransactionCompletionState.SUCCESSFUL
            );

            transaction = this.apiClient.getTransactionService().read(transaction.getLinkedSpaceId(), transactionCompletion.getLinkedTransaction());
            Refund refund = this.apiClient.getRefundService().refund(this.spaceId, getRefundPayload(transaction));

            Assert.assertEquals(
                    "Refund successful",
                    refund.getState(),
                    RefundState.SUCCESSFUL
            );
		} else {
            System.err.println("API response timeout");
        }
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

    /**
     * succeed
     * <p>
     * This operation allows to mark a refund as successful which is in state MANUAL_CHECK.
     */
    @Ignore
    @Test
    public void succeedTest() {
        // TODO: test validations
    }

}
