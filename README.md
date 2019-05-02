[![Build Status](https://travis-ci.org/wallee-payment/java-sdk.svg?branch=master)](https://travis-ci.org/wallee-payment/java-sdk)

# 



## Documentation

doc/api/web-service

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.wallee</groupId>
    <artifactId>wallee-java-sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wallee:wallee-java-sdk:1.0.0"
```

### Example

The following code snippet is simple example on how to use the SDK to create a transaction and a payment page URL for this transaction:

```java
package com.wallee.sdk.example;

import java.math.BigDecimal;
import java.util.Arrays;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.TokenCreate;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.service.TransactionService;

public class Example {

    public static void main(String[] args) {
	
		// API Configuration.
		long spaceId = 405;
		long userId = 512;
		String secret = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
		ApiClient apiClient = new ApiClient(userId, secret);
	
		// Create API service instance.
		TransactionService transactionService = new TransactionService(apiClient);
	
		// Create transaction.
		LineItemCreate lineItem = new LineItemCreate();
		lineItem.setType(LineItemType.PRODUCT);
		lineItem.setAmountIncludingTax(new BigDecimal(23.78));
		lineItem.setQuantity(BigDecimal.ONE);
		lineItem.setName("Red T-Shirt");
		lineItem.setSku("red-t-shirt-4");
		lineItem.setUniqueId("4216");
	
		TransactionCreate transactionCreate = new TransactionCreate();
		transactionCreate.setLineItems(Arrays.asList(lineItem));
		transactionCreate.setAutoConfirmationEnabled(true);
		transactionCreate.setCurrency("EUR");
	
		try {
		    // Send create transaction request.
		    Transaction transaction = transactionService.create(spaceId, transactionCreate);
	
		    // Build payment URL.
		    String redirectionUrl = transactionService.buildPaymentPageUrl(spaceId, transaction.getId());
		    System.out.println("Payment URL: " + redirectionUrl);
	
		} catch (ApiException e) {
		    throw new RuntimeException("Failed to create transaction.", e);
		}
    }
}
```


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

