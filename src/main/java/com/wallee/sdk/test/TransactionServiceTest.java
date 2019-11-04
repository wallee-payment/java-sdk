/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.TransactionService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
* Test of {@link TransactionService}.
*/
public class TransactionServiceTest {

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
    public void testTransactionCreate() {
        Assert.assertEquals(this.transaction.getStatusCode(), 200);
        Assert.assertEquals(this.spaceId, this.transaction.getData().getLinkedSpaceId());
        Assert.assertEquals(new BigDecimal("70.59"), this.transaction.getData().getAuthorizationAmount());
    }

    @Test
    public void testTransactionCount(){
        EntityQueryFilter entityQueryFilter = new EntityQueryFilter();
            entityQueryFilter.setFieldName("id");
            entityQueryFilter.setValue(this.transaction.getData().getId());
            entityQueryFilter.setType(EntityQueryFilterType.LEAF);
            entityQueryFilter.setOperator(CriteriaOperator.EQUALS);
        try {
            Long transactionCount = this.transactionService.count(this.spaceId, entityQueryFilter);
            Assert.assertEquals((long) transactionCount, (long) 1);
        }catch (ApiException e){
            Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    @Test
    public void testTransactionRead(){
        try {
            Transaction transactionRead = this.transactionService.read(this.spaceId, this.transaction.getData().getId());
            Assert.assertEquals(transactionRead.getState(), TransactionState.PENDING);
        }catch (ApiException e){
            Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    @Test
    public void testTransactionSearch(){
        EntityQueryFilter entityQueryFilter = new EntityQueryFilter();
            entityQueryFilter.setFieldName("id");
            entityQueryFilter.setValue(this.transaction.getData().getId());
            entityQueryFilter.setType(EntityQueryFilterType.LEAF);
            entityQueryFilter.setOperator(CriteriaOperator.EQUALS);

        EntityQuery entityQuery = new EntityQuery();
        entityQuery.setFilter(entityQueryFilter);

        try {
            List<Transaction> transactionSearch = this.transactionService.search(this.spaceId, entityQuery);
            Assert.assertEquals(transactionSearch.size(), 1);
            for (Transaction t: transactionSearch) {
                Assert.assertEquals(t.getState(), TransactionState.PENDING);
            }
        }catch (ApiException e){
            Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }
}
