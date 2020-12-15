package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentTerminalTillService
 */
public class PaymentTerminalTillServiceTest {
    private ApiClient apiClient;
    private PaymentTerminalTillService varPaymentTerminalTillService;
    private Long spaceId = (long) 405;
    private Long applicationUserId = (long) 512;
    private String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
    Long terminalId = (long) 948;

    // Models
    private TransactionCreate transactionPayload;

    @Before
    public void setup() {
        if(this.apiClient == null){
            this.apiClient = new ApiClient(applicationUserId, authenticationKey);
        }
        if(this.varPaymentTerminalTillService == null){
            this.varPaymentTerminalTillService = new PaymentTerminalTillService(this.apiClient);
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
     * Test that headers are set correctly when the content is null
     *
     * Checks that we're not receiving a 415 unsupported media header
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void testHeaderNot415() throws IOException {
        try {
            Transaction transaction = this.apiClient.getTransactionService().create(this.spaceId, this.getTransactionPayload());
            String language = null;
            Transaction response = varPaymentTerminalTillService.performTransaction(this.spaceId, transaction.getId(), this.terminalId, language);
            Assert.assertNotEquals(415, response.getStatusCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
