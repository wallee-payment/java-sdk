package com.wallee.sdk.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.enums.LineItemType;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCreate;

/**
 * API tests for TransactionPaymentPageService
 */
public class TransactionPaymentPageServiceTest {

    // Credentials
    private Long spaceId = 405L;
    private Long applicationUserId = 512L;
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
            this.transactionPayload.addLineItemsItem(lineItem);
        }
        return this.transactionPayload;
    }

    /**
     * Build Payment Page URL
     *
     * This operation creates the URL to which the user should be redirected to when the payment page should be used.
     *
     */
    @Test
    public void paymentPageUrlTest() {
        try {
            Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
            String paymentPageUrl = this.apiClient.getTransactionPaymentPageService().paymentPageUrl(spaceId, transaction.getId());
            Assert.assertTrue(paymentPageUrl.contains("https://"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
