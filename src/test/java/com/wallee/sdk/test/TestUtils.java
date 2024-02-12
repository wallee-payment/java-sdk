package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import java.math.BigDecimal;

public abstract class TestUtils {
  private TestUtils() {
  }

  public static ApiClient getApiClient() {
    ApiClient client =
        new ApiClient(TestConstants.APPLICATION_USER_ID, TestConstants.AUTHENTICATION_KEY);
    client.setReadTimeOut(60);
    return client;
  }

  public static TransactionCreate getTransactionCreatePayload() {
    LineItemCreate lineItem = new LineItemCreate();
    lineItem.name("Red T-Shirt")
        .uniqueId("5412")
        .type(LineItemType.PRODUCT)
        .quantity(BigDecimal.valueOf(1))
        .amountIncludingTax(BigDecimal.valueOf(29.95))
        .sku("red-t-shirt-789");

    String email = "test@customweb.com";

    AddressCreate address = new AddressCreate();
    address.city("Winterthur")
        .country("CH")
        .emailAddress(email)
        .familyName("Customer")
        .givenName("Good")
        .postcode("8400")
        .postalState("ZH")
        .organizationName("Test GmbH")
        .mobilePhoneNumber("+41791234567")
        .salutation("Ms");

    TransactionCreate create = new TransactionCreate();
    create.autoConfirmationEnabled(true);
    create.currency("CHF");
    create.language("en-US");
    create.addLineItemsItem(lineItem);
    create.setCustomerId("1234");
    create.setCustomerEmailAddress(email);
    create.setBillingAddress(address);
    create.setShippingAddress(address);

    return create;
  }
}
