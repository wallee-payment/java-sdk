package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for TransactionService
 */
public class TransactionServiceTest {

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


            // Customer email address
            String customerEmailAddress = "test@example.com";


            // Customer Billind Address
            AddressCreate billingAddress = new AddressCreate();
            billingAddress.city("Winterthur")
                .country("CH")
                .emailAddress(customerEmailAddress)
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
			this.transactionPayload.setCustomerId("1234");
			this.transactionPayload.setCustomerEmailAddress(customerEmailAddress);
        }
        return this.transactionPayload;
    }


    /**
     * Confirm
     * <p>
     * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
     *
     */
    @Ignore
    @Test
    public void confirmTest() {
        // TODO: test validations
    }

    /**
     * Count
     * <p>
     * Counts the number of items in the database as restricted by the given filter.
     *
     */
    @Test
    public void countTest() throws Exception{
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        EntityQueryFilter filter = new EntityQueryFilter();
        filter.type(EntityQueryFilterType.LEAF)
            .fieldName("id")
            .value(transaction.getId())
            .operator(CriteriaOperator.EQUALS);
        Long count = this.apiClient.getTransactionService().count(this.spaceId, filter);
        Assert.assertEquals((long) count, (long) 1);
    }

    /**
     * Create
     * <p>
     * Creates the entity with the given properties.
     */
    @Test
    public void createTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        Assert.assertEquals(transaction.getState(), TransactionState.PENDING);
    }

    /**
     * Create Transaction Credentials
     * <p>
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     */
    @Test
    public void createTransactionCredentialsTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        String transactionCredentials = this.apiClient.getTransactionService().createTransactionCredentials(this.spaceId, transaction.getId());
        Assert.assertTrue(!transactionCredentials.isEmpty());
    }

    /**
     * Delete One-Click Token with Credentials
     * <p>
     * This operation removes the given token.
     */
    @Ignore
    @Test
    public void deleteOneClickTokenWithCredentialsTest() {
        // TODO: test validations
    }

    /**
     * Export
     * <p>
     * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
     */
    @Ignore
    @Test
    public void exportTest() {
        // TODO: test validations
    }

    /**
     * Fetch One Click Tokens with Credentials
     * <p>
     * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
     */
    @Ignore
    @Test
    public void fetchOneClickTokensWithCredentialsTest() {
        // TODO: test validations
    }

    /**
     * Fetch Possible Payment Methods
     * <p>
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     * payment_page, iframe, lightbox, mobile_web_view, terminal, payment_link, charge_flow, direct_card_processing
     */
    @Test
    public void fetchPaymentMethodsTest() throws Exception{
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        List<PaymentMethodConfiguration> paymentMethods = this.apiClient.getTransactionService().fetchPaymentMethods(this.spaceId, transaction.getId(), "payment_page");
        Assert.assertTrue(paymentMethods.size() >= 1);
    }

    /**
     * Fetch Possible Payment Methods with Credentials
     * <p>
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     */
    @Ignore
    @Test
    public void fetchPaymentMethodsWithCredentialsTest() {
        // TODO: test validations
    }

    /**
     * getLatestTransactionLineItemVersion
     */
    @Ignore
    @Test
    public void getLatestTransactionLineItemVersionTest() {
        // TODO: test validations
    }

    /**
     * getPackingSlip
     * <p>
     * Returns the packing slip for the transaction with given id.
     */
    @Ignore
    @Test
    public void getPackingSlipTest() {
        // TODO: test validations
    }

    /**
     * Process One-Click Token with Credentials
     * <p>
     * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
     */
    @Ignore
    @Test
    public void processOneClickTokenAndRedirectWithCredentialsTest() {
        // TODO: test validations
    }

    /**
     * Process Without User Interaction
     * <p>
     * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
     *
     */
    @Test
    public void processWithoutUserInteractionTest() throws Exception{
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
		TransactionState[] TransactionStates = {
			TransactionState.FULFILL
		};
		Assert.assertTrue(Arrays.asList(TransactionStates).contains(transaction.getState()));
		
				
        RenderedDocument renderedDocument = this.apiClient.getTransactionService().getInvoiceDocument(this.spaceId, transaction.getId());
        Assert.assertEquals(true, renderedDocument.getData() != null);
        Assert.assertEquals(true, renderedDocument.getData().length > 0);
		
    }

    /**
     * Read
     * <p>
     * Reads the entity with the given &#39;id&#39; and returns it.
     */
    @Test
    public void readTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        Transaction transactionRead = this.apiClient.getTransactionService().read(this.spaceId, transaction.getId());
        Assert.assertTrue(transaction.getId().equals(transactionRead.getId()));
    }

    /**
     * Read With Credentials
     * <p>
     * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
     */
    @Ignore
    @Test
    public void readWithCredentialsTest() {
        // TODO: test validations
    }

    /**
     * Search
     * <p>
     * Searches for the entities as specified by the given query.
     */
    @Test
    public void searchTest() throws Exception{
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        EntityQueryFilter entityQueryFilter = new EntityQueryFilter();
        entityQueryFilter.fieldName("id")
            .value(transaction.getId())
            .type(EntityQueryFilterType.LEAF)
            .operator(CriteriaOperator.EQUALS);

        EntityQuery entityQuery = new EntityQuery();
        entityQuery.setFilter(entityQueryFilter);
        List<Transaction> transactionSearch = this.apiClient.getTransactionService().search(this.spaceId, entityQuery);
        Assert.assertEquals(transactionSearch.size(), 1);
        for (Transaction t : transactionSearch) {
            Assert.assertEquals(t.getState(), TransactionState.PENDING);
        }
    }

    /**
     * Update
     * <p>
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     */
    @Test
    public void updateTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
        TransactionPending transactionPending = new TransactionPending();
        transactionPending.id(transaction.getId()).language("en-US");
        transactionPending.version(transaction.getVersion().longValue());
        transactionPending.setCurrency(transaction.getCurrency());
        Transaction transactionUpdate = this.apiClient.getTransactionService().update(spaceId, transactionPending);
        Assert.assertEquals(transaction.getId(), transactionUpdate.getId());
    }

    /**
     * updateTransactionLineItems
     */
    @Test
    public void updateTransactionLineItemsTest() throws Exception {
        Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());

        // Line item
        LineItemCreate lineItem = new LineItemCreate();
        lineItem.name("Blue T-Shirt")
                .uniqueId("5413")
                .type(LineItemType.PRODUCT)
                .quantity(BigDecimal.valueOf(1))
                .amountIncludingTax(BigDecimal.valueOf(39.95))
                .sku("blue-t-shirt-123");

        TransactionPending transactionPending = new TransactionPending();
        transactionPending.version(transaction.getVersion().longValue())
                          .id(transaction.getId())
                          .addLineItemsItem(lineItem)
                          .customerId(transaction.getCustomerId())
                          .currency(transaction.getCurrency());
        Transaction transactionUpdate = this.apiClient.getTransactionService().update(spaceId, transactionPending);
        Assert.assertEquals(transaction.getId(), transactionUpdate.getId());
    }

}
