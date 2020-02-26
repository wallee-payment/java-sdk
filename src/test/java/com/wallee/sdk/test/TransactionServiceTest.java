/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.TransactionService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
* API tests for TransactionService
*/
public class TransactionServiceTest {

    private TransactionService transactionService;
    private TransactionCreate transactionCreate;
    private Long spaceId = (long) 405;
    private Long applicationUserId = (long) 512;
    private String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
    private ApiClient apiClient;
    private ApiResponse<Transaction> transaction;

    @Before
    public void setup() {
        this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        this.transactionService = new TransactionService(this.apiClient);
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
     * Count
     *
     * Counts the number of items in the database as restricted by the given filter.
     *
     * @
     *          if the Api call fails
    */
    @Test
    public void countTest()  {
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

    /**
     * Create
     *
     * Creates the entity with the given properties.
     *
     * @
     *          if the Api call fails
    */
    @Test
    public void createTest()  {
        Assert.assertEquals(this.transaction.getStatusCode(), 200);
        Assert.assertEquals(this.spaceId, this.transaction.getData().getLinkedSpaceId());
        Assert.assertEquals(new BigDecimal("70.59"), this.transaction.getData().getAuthorizationAmount());
    }

    /**
     * Create Transaction Credentials
     *
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     *
    */
    @Test
    public void createTransactionCredentialsTest()  {
        try{
            String response = this.transactionService.createTransactionCredentials(spaceId, this.transaction.getData().getId());
            Assert.assertTrue(!response.isEmpty());
        }catch(ApiException e){
            Assert.fail("Failed to get possible payment methods. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    /**
     * Fetch Possible Payment Methods
     *
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     *
    */
    @Test
    public void fetchPossiblePaymentMethodsTest()  {

        try {
            List<PaymentMethodConfiguration> response = this.transactionService.fetchPossiblePaymentMethods(spaceId, this.transaction.getData().getId());
            Assert.assertTrue(response.size() >= 1);
        }catch (ApiException e){
            Assert.fail("Failed to get possible payment methods. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    /**
     * Process Without User Interaction
     *
     * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
     *
    */
    @Test
    public void processWithoutUserInteractionTest()  {
       
        try {
            Transaction response = this.transactionService.processWithoutUserInteraction(spaceId, this.transaction.getData().getId());
            Assert.assertEquals(response.getId(), this.transaction.getData().getId());
        } catch (ApiException e){
             Assert.fail("Failed to get packing slip. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

    /**
     * Read
     *
     * Reads the entity with the given &#39;id&#39; and returns it.
     *
    */
    @Test
    public void readTest(){
        try {
            Transaction transactionRead = this.transactionService.read(this.spaceId, this.transaction.getData().getId());
            Assert.assertEquals(transactionRead.getState(), TransactionState.PENDING);
        }catch (ApiException e){
            Assert.fail("Failed to read transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }


    /**
     * Search
     *
     * Searches for the entities as specified by the given query.
     *
    */
    @Test
    public void searchTest(){
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
            Assert.fail("Failed to search transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
        }
    }

}
