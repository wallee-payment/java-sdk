# TransactionInvoiceServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](TransactionInvoiceServiceApi.md#count) | **POST** /transaction-invoice/count | Count
[**getInvoiceDocument**](TransactionInvoiceServiceApi.md#getInvoiceDocument) | **GET** /transaction-invoice/getInvoiceDocument | getInvoiceDocument
[**isReplacementPossible**](TransactionInvoiceServiceApi.md#isReplacementPossible) | **GET** /transaction-invoice/isReplacementPossible | isReplacementPossible
[**markAsPaid**](TransactionInvoiceServiceApi.md#markAsPaid) | **POST** /transaction-invoice/markAsPaid | Mark as Paid
[**read**](TransactionInvoiceServiceApi.md#read) | **GET** /transaction-invoice/read | Read
[**replace**](TransactionInvoiceServiceApi.md#replace) | **POST** /transaction-invoice/replace | replace
[**search**](TransactionInvoiceServiceApi.md#search) | **POST** /transaction-invoice/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#count");
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

<a name="getInvoiceDocument"></a>
# **getInvoiceDocument**
> RenderedDocument getInvoiceDocument(spaceId, id)

getInvoiceDocument

Returns the PDF document for the transaction invoice with given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction invoice to get the document for.
try {
    RenderedDocument result = apiInstance.getInvoiceDocument(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#getInvoiceDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction invoice to get the document for. |

### Return type

[**RenderedDocument**](RenderedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="isReplacementPossible"></a>
# **isReplacementPossible**
> Boolean isReplacementPossible(spaceId, id)

isReplacementPossible

Returns whether the transaction invoice with the given id can be replaced.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The invoice which should be checked if a replacement is possible.
try {
    Boolean result = apiInstance.isReplacementPossible(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#isReplacementPossible");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The invoice which should be checked if a replacement is possible. |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="markAsPaid"></a>
# **markAsPaid**
> TransactionInvoice markAsPaid(spaceId, id)

Mark as Paid

Marks the transaction invoice with the given id as paid.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction invoice which should be marked as paid.
try {
    TransactionInvoice result = apiInstance.markAsPaid(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#markAsPaid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction invoice which should be marked as paid. |

### Return type

[**TransactionInvoice**](TransactionInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> TransactionInvoice read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction invoices which should be returned.
try {
    TransactionInvoice result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction invoices which should be returned. |

### Return type

[**TransactionInvoice**](TransactionInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="replace"></a>
# **replace**
> TransactionInvoice replace(spaceId, id, replacement)

replace

Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction invoices which should be replaced.
TransactionInvoiceReplacement replacement = new TransactionInvoiceReplacement(); // TransactionInvoiceReplacement | 
try {
    TransactionInvoice result = apiInstance.replace(spaceId, id, replacement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#replace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction invoices which should be replaced. |
 **replacement** | [**TransactionInvoiceReplacement**](TransactionInvoiceReplacement.md)|  |

### Return type

[**TransactionInvoice**](TransactionInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="search"></a>
# **search**
> List&lt;TransactionInvoice&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionInvoiceServiceApi;


TransactionInvoiceServiceApi apiInstance = new TransactionInvoiceServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the transaction invoices which are returned by the search.
try {
    List<TransactionInvoice> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionInvoiceServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the transaction invoices which are returned by the search. |

### Return type

[**List&lt;TransactionInvoice&gt;**](TransactionInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

