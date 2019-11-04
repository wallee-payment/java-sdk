package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.service.TransactionPaymentPageService;
import com.wallee.sdk.service.TransactionService;
import com.wallee.sdk.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class TransactionPaymentPageServiceTest {
    private TransactionService transactionService;
    private TransactionCreate transactionCreate;
    private Long spaceId;
    private Long applicationUserId;
    private String authenticationKey;
    private ApiClient apiClient;
    private ApiResponse<Transaction> transaction;

    @Before
    public void setup() {
        this.applicationUserId = (long) 512;
        this.spaceId = (long) 405;
        this.authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        this.apiClient.setBasePath("https://app-wallee.com:443/api");
        this.transactionService = new TransactionService(this.apiClient);
        this.createTransaction();
    }

    private void createTransaction() {

        AddressCreate billingAddress = new AddressCreate()
                .salutation("Ms")
                .givenName("Good")
                .familyName("Customer")
                .gender(Gender.FEMALE)
                .country("CH")
                .city("Winterthur")
                .postCode("8400")
                .dateOfBirth(LocalDate.of(1991, 1, 11))
                .organizationName("Test GmbH")
                .mobilePhoneNumber("+41791234567")
                .emailAddress("test@wallee.com");

        AddressCreate shippingAddress = new AddressCreate()
                .salutation("Ms")
                .givenName("Good")
                .familyName("Customer")
                .gender(Gender.FEMALE)
                .country("CH")
                .city("Winterthur")
                .postCode("8400")
                .dateOfBirth(LocalDate.of(1991, 1, 11))
                .organizationName("Test GmbH")
                .mobilePhoneNumber("+41791234567")
                .emailAddress("test@wallee.com");

        LineItemCreate lineItem1 = new LineItemCreate()
                .sku("item-1")
                .name("Item 1")
                .uniqueId("unique-id-item-1")
                .type(LineItemType.PRODUCT)
                .quantity(BigDecimal.ONE)
                .shippingRequired(true)
                .amountIncludingTax(new BigDecimal("67.47"))
                .addTaxesItem(
                        new TaxCreate().title("VAT").rate(new BigDecimal(8))
                );

        LineItemCreate lineItem2 = new LineItemCreate()
                .sku("test-shipping")
                .name("Shipping")
                .uniqueId("unique-id-test-shipping")
                .type(LineItemType.SHIPPING)
                .quantity(BigDecimal.ONE)
                .amountIncludingTax(new BigDecimal("3.12"))
                .addTaxesItem(
                        new TaxCreate().title("VAT").rate(new BigDecimal(8))
                );

        this.transactionCreate = new TransactionCreate();
        this.transactionCreate.customerEmailAddress("test@wallee.com");
        this.transactionCreate.customerId("cutomer-x");
        this.transactionCreate.merchantReference(UUID.randomUUID().toString());
        this.transactionCreate.invoiceMerchantReference("order-1");
        this.transactionCreate.successUrl("http://localhost/success?orderId=1");
        this.transactionCreate.failedUrl("http://localhost/failed?orderId=1");
        this.transactionCreate.shippingMethod("Test Shipping");
        this.transactionCreate.chargeRetryEnabled(false);
        this.transactionCreate.allowedPaymentMethodConfigurations(Arrays.asList(8656l));
        this.transactionCreate.language("en-US");
        this.transactionCreate.currency("CHF");
        this.transactionCreate.billingAddress(billingAddress);
        this.transactionCreate.shippingAddress(shippingAddress);
        this.transactionCreate.addLineItemsItem(lineItem1);
        this.transactionCreate.addLineItemsItem(lineItem2);
        try {
            this.transaction = this.transactionService.createWithHttpInfo(
                    this.spaceId,
                    this.transactionCreate
            );
        } catch (ApiException e) {
            Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    @Test
    public void testPaymentPageUrl() {

        TransactionPaymentPageService transactionPaymentPageService = new TransactionPaymentPageService(this.apiClient);
        String paymentPageUrl     = null;
        try {
            paymentPageUrl = transactionPaymentPageService.paymentPageUrl(this.spaceId, this.transaction.getData().getId());
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(paymentPageUrl);
        Assert.assertTrue(paymentPageUrl.contains("http"));
    }
}
