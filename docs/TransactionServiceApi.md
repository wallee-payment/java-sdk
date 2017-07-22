# TransactionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buildJavaScriptUrl**](TransactionServiceApi.md#buildJavaScriptUrl) | **GET** /transaction/buildJavaScriptUrl | Build JavaScript URL
[**buildMobileSdkUrlWithCredentials**](TransactionServiceApi.md#buildMobileSdkUrlWithCredentials) | **GET** /transaction/buildMobileSdkUrlWithCredentials | Build Mobile SDK URL with Credentials
[**buildPaymentPageUrl**](TransactionServiceApi.md#buildPaymentPageUrl) | **GET** /transaction/buildPaymentPageUrl | Build Payment Page URL
[**confirm**](TransactionServiceApi.md#confirm) | **POST** /transaction/confirm | Confirm
[**count**](TransactionServiceApi.md#count) | **POST** /transaction/count | Count
[**create**](TransactionServiceApi.md#create) | **POST** /transaction/create | Create
[**createTransactionCredentials**](TransactionServiceApi.md#createTransactionCredentials) | **POST** /transaction/createTransactionCredentials | Create Transaction Credentials
[**deleteOneClickTokenWithCredentials**](TransactionServiceApi.md#deleteOneClickTokenWithCredentials) | **POST** /transaction/deleteOneClickTokenWithCredentials | Delete One-Click Token with Credentials
[**fetchOneClickTokensWithCredentials**](TransactionServiceApi.md#fetchOneClickTokensWithCredentials) | **GET** /transaction/fetchOneClickTokensWithCredentials | Fetch One Click Tokens with Credentials
[**fetchPossiblePaymentMethods**](TransactionServiceApi.md#fetchPossiblePaymentMethods) | **GET** /transaction/fetchPossiblePaymentMethods | Fetch Possible Payment Methods
[**fetchPossiblePaymentMethodsWithCredentials**](TransactionServiceApi.md#fetchPossiblePaymentMethodsWithCredentials) | **GET** /transaction/fetchPossiblePaymentMethodsWithCredentials | Fetch Possible Payment Methods with Credentials
[**getInvoiceDocument**](TransactionServiceApi.md#getInvoiceDocument) | **GET** /transaction/getInvoiceDocument | getInvoiceDocument
[**getLatestTransactionLineItemVersion**](TransactionServiceApi.md#getLatestTransactionLineItemVersion) | **GET** /transaction/getLatestTransactionLineItemVersion | getLatestTransactionLineItemVersion
[**getPackingSlip**](TransactionServiceApi.md#getPackingSlip) | **GET** /transaction/getPackingSlip | getPackingSlip
[**processOneClickTokenWithCredentials**](TransactionServiceApi.md#processOneClickTokenWithCredentials) | **POST** /transaction/processOneClickTokenWithCredentials | Process One-Click Token with Credentials
[**read**](TransactionServiceApi.md#read) | **GET** /transaction/read | Read
[**readWithCredentials**](TransactionServiceApi.md#readWithCredentials) | **GET** /transaction/readWithCredentials | Read With Credentials
[**search**](TransactionServiceApi.md#search) | **POST** /transaction/search | Search
[**update**](TransactionServiceApi.md#update) | **POST** /transaction/update | Update
[**updateTransactionLineItems**](TransactionServiceApi.md#updateTransactionLineItems) | **POST** /transaction/updateTransactionLineItems | updateTransactionLineItems


<a name="buildJavaScriptUrl"></a>
# **buildJavaScriptUrl**
> String buildJavaScriptUrl(spaceId, id)

Build JavaScript URL

This operation creates the URL which can be used to embed the JavaScript for handling the iFrame checkout flow.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be returned.
try {
    String result = apiInstance.buildJavaScriptUrl(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#buildJavaScriptUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be returned. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="buildMobileSdkUrlWithCredentials"></a>
# **buildMobileSdkUrlWithCredentials**
> String buildMobileSdkUrlWithCredentials(credentials)

Build Mobile SDK URL with Credentials

This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
try {
    String result = apiInstance.buildMobileSdkUrlWithCredentials(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#buildMobileSdkUrlWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="buildPaymentPageUrl"></a>
# **buildPaymentPageUrl**
> String buildPaymentPageUrl(spaceId, id)

Build Payment Page URL

This operation creates the URL to which the user should be redirected to when the payment page should be used.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be returned.
try {
    String result = apiInstance.buildPaymentPageUrl(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#buildPaymentPageUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be returned. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="confirm"></a>
# **confirm**
> Transaction confirm(spaceId, transactionModel)

Confirm

The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
TransactionPending transactionModel = new TransactionPending(); // TransactionPending | The transaction JSON object to update and confirm.
try {
    Transaction result = apiInstance.confirm(spaceId, transactionModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#confirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **transactionModel** | [**TransactionPending**](TransactionPending.md)| The transaction JSON object to update and confirm. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **filter** | [**EntityQueryFilter**](EntityQueryFilter.md)| The filter which restricts the entities which are used to calculate the count. | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="create"></a>
# **create**
> Transaction create(spaceId, transaction)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
TransactionCreate transaction = new TransactionCreate(); // TransactionCreate | The transaction object which should be created.
try {
    Transaction result = apiInstance.create(spaceId, transaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **transaction** | [**TransactionCreate**](TransactionCreate.md)| The transaction object which should be created. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createTransactionCredentials"></a>
# **createTransactionCredentials**
> String createTransactionCredentials(spaceId, id)

Create Transaction Credentials

This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be returned.
try {
    String result = apiInstance.createTransactionCredentials(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#createTransactionCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be returned. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteOneClickTokenWithCredentials"></a>
# **deleteOneClickTokenWithCredentials**
> deleteOneClickTokenWithCredentials(credentials, tokenId)

Delete One-Click Token with Credentials

This operation removes the given token.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
Long tokenId = 789L; // Long | The token ID will be used to find the token which should be removed.
try {
    apiInstance.deleteOneClickTokenWithCredentials(credentials, tokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#deleteOneClickTokenWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |
 **tokenId** | **Long**| The token ID will be used to find the token which should be removed. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchOneClickTokensWithCredentials"></a>
# **fetchOneClickTokensWithCredentials**
> List&lt;TokenVersion&gt; fetchOneClickTokensWithCredentials(credentials)

Fetch One Click Tokens with Credentials

This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
try {
    List<TokenVersion> result = apiInstance.fetchOneClickTokensWithCredentials(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#fetchOneClickTokensWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |

### Return type

[**List&lt;TokenVersion&gt;**](TokenVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchPossiblePaymentMethods"></a>
# **fetchPossiblePaymentMethods**
> List&lt;PaymentMethodConfiguration&gt; fetchPossiblePaymentMethods(spaceId, id)

Fetch Possible Payment Methods

This operation allows to get the payment method configurations which can be used with the provided transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be returned.
try {
    List<PaymentMethodConfiguration> result = apiInstance.fetchPossiblePaymentMethods(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#fetchPossiblePaymentMethods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be returned. |

### Return type

[**List&lt;PaymentMethodConfiguration&gt;**](PaymentMethodConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="fetchPossiblePaymentMethodsWithCredentials"></a>
# **fetchPossiblePaymentMethodsWithCredentials**
> List&lt;PaymentMethodConfiguration&gt; fetchPossiblePaymentMethodsWithCredentials(credentials)

Fetch Possible Payment Methods with Credentials

This operation allows to get the payment method configurations which can be used with the provided transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
try {
    List<PaymentMethodConfiguration> result = apiInstance.fetchPossiblePaymentMethodsWithCredentials(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#fetchPossiblePaymentMethodsWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |

### Return type

[**List&lt;PaymentMethodConfiguration&gt;**](PaymentMethodConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="getInvoiceDocument"></a>
# **getInvoiceDocument**
> RenderedDocument getInvoiceDocument(spaceId, id)

getInvoiceDocument

Returns the PDF document for the transaction invoice with given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction to get the invoice document for.
try {
    RenderedDocument result = apiInstance.getInvoiceDocument(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#getInvoiceDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction to get the invoice document for. |

### Return type

[**RenderedDocument**](RenderedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="getLatestTransactionLineItemVersion"></a>
# **getLatestTransactionLineItemVersion**
> TransactionLineItemVersion getLatestTransactionLineItemVersion(spaceId, id)

getLatestTransactionLineItemVersion



### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction to get the latest line item version for.
try {
    TransactionLineItemVersion result = apiInstance.getLatestTransactionLineItemVersion(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#getLatestTransactionLineItemVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction to get the latest line item version for. |

### Return type

[**TransactionLineItemVersion**](TransactionLineItemVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="getPackingSlip"></a>
# **getPackingSlip**
> RenderedDocument getPackingSlip(spaceId, id)

getPackingSlip

Returns the packing slip for the transaction with given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction to get the packing slip for.
try {
    RenderedDocument result = apiInstance.getPackingSlip(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#getPackingSlip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction to get the packing slip for. |

### Return type

[**RenderedDocument**](RenderedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="processOneClickTokenWithCredentials"></a>
# **processOneClickTokenWithCredentials**
> Transaction processOneClickTokenWithCredentials(credentials, tokenId)

Process One-Click Token with Credentials

This operation assigns the given token to the transaction and process it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
Long tokenId = 789L; // Long | The token ID is used to load the corresponding token and to process the transaction with it.
try {
    Transaction result = apiInstance.processOneClickTokenWithCredentials(credentials, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#processOneClickTokenWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |
 **tokenId** | **Long**| The token ID is used to load the corresponding token and to process the transaction with it. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> Transaction read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be returned.
try {
    Transaction result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be returned. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="readWithCredentials"></a>
# **readWithCredentials**
> Transaction readWithCredentials(credentials)

Read With Credentials

Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
String credentials = "credentials_example"; // String | The credentials identifies the transaction and contains the security details which grants the access this operation.
try {
    Transaction result = apiInstance.readWithCredentials(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#readWithCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **String**| The credentials identifies the transaction and contains the security details which grants the access this operation. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;Transaction&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the transactions which are returned by the search.
try {
    List<Transaction> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the transactions which are returned by the search. |

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> Transaction update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
TransactionPending entity = new TransactionPending(); // TransactionPending | The transaction object with the properties which should be updated.
try {
    Transaction result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**TransactionPending**](TransactionPending.md)| The transaction object with the properties which should be updated. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateTransactionLineItems"></a>
# **updateTransactionLineItems**
> TransactionLineItemVersion updateTransactionLineItems(spaceId, updateRequest)

updateTransactionLineItems



### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionServiceApi;


TransactionServiceApi apiInstance = new TransactionServiceApi();
Long spaceId = 789L; // Long | 
TransactionLineItemUpdateRequest updateRequest = new TransactionLineItemUpdateRequest(); // TransactionLineItemUpdateRequest | 
try {
    TransactionLineItemVersion result = apiInstance.updateTransactionLineItems(spaceId, updateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionServiceApi#updateTransactionLineItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **updateRequest** | [**TransactionLineItemUpdateRequest**](TransactionLineItemUpdateRequest.md)|  |

### Return type

[**TransactionLineItemVersion**](TransactionLineItemVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

