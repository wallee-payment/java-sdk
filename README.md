[![Build Status](https://travis-ci.org/wallee-payment/java-sdk.svg?branch=master)](https://travis-ci.org/wallee-payment/java-sdk)

# wallee Java Library

The wallee Java library wraps around the wallee API. This library facilitates your interaction with various services such as transactions, accounts, and subscriptions.


## Documentation

[wallee Web Service API](https://app-wallee.com/doc/api/web-service)

## Requirements

- Java 1.8+

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.wallee</groupId>
    <artifactId>wallee-java-sdk</artifactId>
    <version>4.0.11</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wallee:wallee-java-sdk:4.0.11"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/wallee-java-sdk-4.0.11.jar`
* `target/lib/*.jar`

## Usage
The library needs to be configured with your account's space id, user id, and secret key which are available in your [wallee
account dashboard](https://app-wallee.com/account/select). Set `space_id`, `user_id`, and `api_secret` to their values.

### Configuring a Service

```java
package com.wallee.sdk.example;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.service.TransactionService;

public class Example {

    public static void main(String[] args) {

        // Credentials
        Long userId = 512L;
        String secret = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        
        // API Client
        ApiClient apiClient = new ApiClient(userId, secret);

        // Create an API service instance:
        TransactionService transactionService = apiClient.getTransactionService();

        // ... use the transactionService to make API calls ...
        
    }
}
```

To get started with sending transactions, please review the example below:

```java
package com.wallee.sdk.test;

import java.io.IOException;
import java.math.BigDecimal;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;

/**
 * 
 */
public class TransactionPaymentPageExample {

	public static void main(String[] args) throws IOException {

	    // Credentials
        Long spaceId = 405L;
        Long applicationUserId = 512L;
        String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

	    // API Client
	    ApiClient apiClient = new ApiClient(applicationUserId, authenticationKey);

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

	    // Transaction Create Request
	    TransactionCreate request = new TransactionCreate();
        request.autoConfirmationEnabled(true).currency("CHF").language("en-US");
        request.setBillingAddress(billingAddress);
        request.setShippingAddress(billingAddress);
        request.addLineItemsItem(lineItem);
        
        // Create Transaction
        Transaction transaction = apiClient.getTransactionService().create(spaceId, request);
        
        // Build the payment page URL to which the user should be redirected when the payment page should be used:
        String paymentPageUrl = apiClient.getTransactionPaymentPageService().paymentPageUrl(spaceId, transaction.getId());
        System.out.println("Payment Page URL: " + paymentPageUrl);
        
        // The above statement should print something like:
        //
        //   Payment Page URL: https://app-wallee.com/s/405/payment/transaction/pay/[transaction ID]?securityToken=[some token]
        //
	}

}

```
## Recommendation

It is recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License

Please see the [license file](https://github.com/wallee-payment/java-sdk/blob/master/LICENSE) for more information.
