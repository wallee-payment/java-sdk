/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
package com.wallee.sdk.service;

import static com.wallee.sdk.service.TestConstants.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.TransactionCreate;
import java.math.BigDecimal;

public abstract class TestUtils {

  /**
   * Singleton (single) instance for ApiClient. To ensure the apiClient is static (shared and single
   * across the application).
   *
   * <p>Unlike a global static approach, the ApiClient.new() method creates independent instances,
   * allowing for configuration flexibility and avoiding shared state across the application.
   */
  public static ApiClient getApiClient() {
    return new ApiClient(APPLICATION_USER_ID, AUTHENTICATION_KEY);
  }

  public static TransactionCreate getTransactionCreatePayload() {
    LineItemCreate lineItem = new LineItemCreate();
    lineItem
      .name("Red T-Shirt")
      .uniqueId("5412")
      .type(LineItemType.PRODUCT)
      .quantity(BigDecimal.valueOf(1))
      .amountIncludingTax(BigDecimal.valueOf(29.95))
      .sku("red-t-shirt-789");

    String email = "test@domain.com";

    AddressCreate address = new AddressCreate();
    address
      .city("Winterthur")
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

  private TestUtils() {
    throw new IllegalAccessError("Utility Test class");
  }
}
