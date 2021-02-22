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
    <version>2.2.22</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wallee:wallee-java-sdk:2.2.22"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/wallee-java-sdk-2.2.22.jar`
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

        // API Configuration.
        long spaceId = (Long) 405;
        long userId = (Long) 512;
        String secret = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
        ApiClient apiClient = new ApiClient(userId, secret);

        // Create API service instance.
        TransactionService transactionService = apiClient.getTransactionService();

    }
}
```

To get started with sending transactions, please review the example below:

```java
package com.wallee.sdk.test;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.*;
import com.wallee.sdk.service.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * API tests for TransactionPaymentPageService
 */
public class TransactionPaymentPageServiceTest {

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
            String paymentPageUrl = this.apiClient.getTransactionPaymentPageService.paymentPageUrl(spaceId, transaction.getId());
            Assert.assertTrue(paymentPageUrl.contains("https://"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

```
## Recommendation

It is recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License

Please see the [license file](https://github.com/wallee-payment/java-sdk/blob/master/LICENSE) for more information.
