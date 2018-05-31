[![Build Status](https://travis-ci.org/wallee-payment/wallee-java-sdk.svg?branch=master)](https://travis-ci.org/wallee-payment/wallee-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.wallee/wallee-java-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.wallee/wallee-java-sdk)

# wallee Java SDK

This project provides a SDK to simplify the usage of the [wallee](https://wallee.com) services. 

## Documentation

For detailed information about wallee API please see [wallee documentation](https://app-wallee.com/doc/api/web-service).

## Getting Started

If you don't have an account with wallee you can [singup here](https://app-wallee.com/user/signup) for free.

To start using `wallee` API you will first have to add a dependency to your project.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.wallee</groupId>
    <artifactId>wallee-java-sdk</artifactId>
    <version>1.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wallee:wallee-java-sdk:1.0.1"
```

### Example

The following code snippet is simple example on how to use the `wallee-java-sdk` to create a transaction token.

```java
package com.wallee.sdk.example;

import java.util.UUID;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.TokenCreate;
import com.wallee.sdk.service.TokenService;

public class WalleeExample {

	public static void main(String[] args) {

		final Long spaceId = 405l;

		final long applicationUserId = 512;
		final String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";
		final ApiClient apiClient = new ApiClient(applicationUserId, authenticationKey);

		// @formatter:off
		TokenCreate tokenCreate = new TokenCreate()
				.customerEmailAddress("test@wallee.com")
				.tokenReference("test@wallee.com")
				.customerId(UUID.randomUUID().toString())
				.enabledForOneClickPayment(true)
				.externalId(UUID.randomUUID().toString());
		// @formatter:on

		final TokenService tokenService = new TokenService(apiClient);

		try {
			tokenCreate = tokenService.create(spaceId, tokenCreate);

		} catch (ApiException e) {
			throw new RuntimeException("Failed to create a token in space '" + spaceId + "'.", e);
		}
	}

}
```


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

