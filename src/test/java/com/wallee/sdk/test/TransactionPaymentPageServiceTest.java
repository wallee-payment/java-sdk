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
    private Long spaceId = (long) 405;
    private Long applicationUserId = (long) 512;
    private String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
    private ApiClient apiClient;
    private ApiResponse<Transaction> transaction;
    TransactionPaymentPageService transactionPaymentPageService;

    @Before
    public void setup() {
        this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        this.transactionService = new TransactionService(this.apiClient);
        this.transactionPaymentPageService = new TransactionPaymentPageService(this.apiClient);
        this.createTransaction();
    }

    private void createTransaction() {

        AddressCreate billingAddress = new AddressCreate();
        billingAddress.salutation("Ms");
        billingAddress.givenName("Good");
        billingAddress.familyName("Customer");
        billingAddress.gender(Gender.FEMALE);
        billingAddress.country("CH");
        billingAddress.city("Winterthur");
        billingAddress.postcode("8400");
        billingAddress.dateOfBirth(LocalDate.of(1991, 1, 11));
        billingAddress.organizationName("Test GmbH");
        billingAddress.mobilePhoneNumber("+41791234567");
        billingAddress.emailAddress("test@wallee.com");

        AddressCreate shippingAddress = new AddressCreate();
        shippingAddress.salutation("Ms");
        shippingAddress.givenName("Good");
        shippingAddress.familyName("Customer");
        shippingAddress.gender(Gender.FEMALE);
        shippingAddress.country("CH");
        shippingAddress.city("Winterthur");
        shippingAddress.postcode("8400");
        shippingAddress.dateOfBirth(LocalDate.of(1991, 1, 11));
        shippingAddress.organizationName("Test GmbH");
        shippingAddress.mobilePhoneNumber("+41791234567");
        shippingAddress.emailAddress("test@wallee.com");

        LineItemCreate lineItem1 = new LineItemCreate();
        lineItem1.sku("item-1");
        lineItem1.name("Item 1");
        lineItem1.uniqueId("unique-id-item-1");
        lineItem1.type(LineItemType.PRODUCT);
        lineItem1.quantity(BigDecimal.ONE);
        lineItem1.shippingRequired(true);
        lineItem1.amountIncludingTax(new BigDecimal("67.47"));
        lineItem1.addTaxesItem(
                        new TaxCreate().title("VAT").rate(new BigDecimal(8))
                );

        LineItemCreate lineItem2 = new LineItemCreate();
        lineItem2.sku("test-shipping");
        lineItem2.name("Shipping");
        lineItem2.uniqueId("unique-id-test-shipping");
        lineItem2.type(LineItemType.SHIPPING);
        lineItem2.quantity(BigDecimal.ONE);
        lineItem2.amountIncludingTax(new BigDecimal("3.12"));
        lineItem2.addTaxesItem(
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

    /**
    * Build Payment Page URL
    *
    * This operation creates the URL to which the user should be redirected to when the payment page should be used.
    *
    */
    @Test
    public void paymentPageUrlTest() {

        try {
            String paymentPageUrl = transactionPaymentPageService.paymentPageUrl(this.spaceId, this.transaction.getData().getId());
            Assert.assertTrue(paymentPageUrl.contains("https://"));
        } catch (ApiException e) {
            e.printStackTrace();
        }

    }
}
