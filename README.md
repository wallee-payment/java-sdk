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
    <version>8.8.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wallee:wallee-java-sdk:8.8.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/wallee-java-sdk-8.8.0.jar`
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

        //Setup a custom connection timeout if needed. (Default value is: 25 seconds)
        apiClient.setReadTimeOut(20);

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
Consider using the following overloaded ApiClient constructor and following code snippet to gain access to a resource behind a **proxy** server with a Basic Authentication scheme
```java
    // Create an instance of the ApiClient with the user's unique credentials and proxy information.
    ApiClient apiClient = new ApiClient(userId, secret, String proxyHostname, int proxyPort);

    Authenticator authenticator = new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            // Check if the authentication request is for a proxy
            if (getRequestorType() == RequestorType.PROXY) {
                // Check if the authentication scheme is Basic
                if ("Basic".equalsIgnoreCase(getRequestingScheme())) {
                    // Return the PasswordAuthentication instance with the proxy credentials
                    return new PasswordAuthentication(proxyUsername, proxyPassword.toCharArray());
                }
            }

            return null;
          }
    };

    // Set the default Authenticator that will be used by the networking code when a proxy or an HTTP server asks for authentication.
    // Authenticator.setDefault will set the java.net.Authenticator that processes all authentication requests.
    Authenticator.setDefault(authenticator);
```
### Disable Basic authentication for HTTPS tunneling

>In some environments, certain authentication schemes may be undesirable when proxying HTTPS. Accordingly, the Basic authentication scheme has been deactivated, by default, in the Oracle
>Java Runtime, by adding Basic to the jdk.http.auth.tunneling.disabledSchemes networking property. Now, proxies requiring Basic authentication when setting up a tunnel for HTTPS
>will no longer succeed by default. If required, this authentication scheme can be reactivated by removing Basic from the jdk.http.auth.tunneling.disabledSchemes networking
>property, or by setting a system property of the same name to "" ( empty ) on the command line.

```java
    System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");
    System.setProperty("jdk.http.auth.proxying.disabledSchemes", "");
```
### Integrating Webhook Payload Signing Mechanism into webhook callback handler

The HTTP request which is sent for a state change of an entity now includes an additional field `state`, which provides information about the update of the monitored entity's state. This enhancement is a result of the implementation of our webhook encryption mechanism.

Payload field `state` provides direct information about the state update of the entity, making additional API calls to retrieve the entity state redundant.

#### ⚠️ Warning: Generic Pseudocode

> **The provided pseudocode is intentionally generic and serves to illustrate the process of enhancing your API to leverage webhook payload signing. It is not a complete implementation.**
>
> Please ensure that you adapt and extend this code to meet the specific needs of your application, including appropriate security measures and error handling.
For a detailed webhook payload signing mechanism understanding we highly recommend referring to our comprehensive
[Webhook Payload Signing Documentation](https://app-wallee.com/doc/webhooks#_webhook_payload_signing_mechanism).


```java
@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping("/callback")
    public ResponseEntity<Object> handleWebhook(@RequestBody String requestPayload,
                                                HttpServletRequest request) {

      // ...

      // Retrieve the 'x-signature' header from the request
        String signature = request.getHeader("x-signature");

        // Check if the x-signature header is present
        if (signature == null || signature.isEmpty()) {

          // Make additional API call to retrieve the entity state.
          // ...

        } else {

          // Authenticate webhook payload
          if (apiClient.getWebhookEncryptionService().isContentValid(signature, requestPayload)) {
            // parse the requestPayload to extract the 'state' value

            // After parsing the 'state', process the entity's state change.
             if (state != null) {
                 processEntityStateChange(state);
             }

            // Process the received webhook data
            // ...
          }

        }

        // Process the received webhook data
        // ...
    }
}
```

## Recommendation

It is recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## License

Please see the [license file](https://github.com/wallee-payment/java-sdk/blob/master/LICENSE) for more information.
