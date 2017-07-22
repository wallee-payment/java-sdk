# ChargeFlowServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyFlow**](ChargeFlowServiceApi.md#applyFlow) | **POST** /charge-flow/applyFlow | applyFlow
[**count**](ChargeFlowServiceApi.md#count) | **POST** /charge-flow/count | Count
[**read**](ChargeFlowServiceApi.md#read) | **GET** /charge-flow/read | Read
[**search**](ChargeFlowServiceApi.md#search) | **POST** /charge-flow/search | Search
[**updateRecipient**](ChargeFlowServiceApi.md#updateRecipient) | **POST** /charge-flow/updateRecipient | updateRecipient


<a name="applyFlow"></a>
# **applyFlow**
> Transaction applyFlow(spaceId, id)

applyFlow



### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowServiceApi;


ChargeFlowServiceApi apiInstance = new ChargeFlowServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The transaction id of the transaction which should be process asynchronously.
try {
    Transaction result = apiInstance.applyFlow(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowServiceApi#applyFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The transaction id of the transaction which should be process asynchronously. |

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
//import com.wallee.sdk.api.ChargeFlowServiceApi;


ChargeFlowServiceApi apiInstance = new ChargeFlowServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowServiceApi#count");
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

<a name="read"></a>
# **read**
> ChargeFlow read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowServiceApi;


ChargeFlowServiceApi apiInstance = new ChargeFlowServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the charge flow which should be returned.
try {
    ChargeFlow result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the charge flow which should be returned. |

### Return type

[**ChargeFlow**](ChargeFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ChargeFlow&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowServiceApi;


ChargeFlowServiceApi apiInstance = new ChargeFlowServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the charge flows which are returned by the search.
try {
    List<ChargeFlow> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the charge flows which are returned by the search. |

### Return type

[**List&lt;ChargeFlow&gt;**](ChargeFlow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateRecipient"></a>
# **updateRecipient**
> updateRecipient(spaceId, transactionId, type, recipient)

updateRecipient



### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowServiceApi;


ChargeFlowServiceApi apiInstance = new ChargeFlowServiceApi();
Long spaceId = 789L; // Long | 
Long transactionId = 789L; // Long | The transaction id of the transaction whose recipient should be updated.
Long type = 789L; // Long | The id of the charge flow configuration type to recipient should be updated for.
String recipient = "recipient_example"; // String | The recipient address that should be used to send the payment URL.
try {
    apiInstance.updateRecipient(spaceId, transactionId, type, recipient);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowServiceApi#updateRecipient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **transactionId** | **Long**| The transaction id of the transaction whose recipient should be updated. |
 **type** | **Long**| The id of the charge flow configuration type to recipient should be updated for. |
 **recipient** | **String**| The recipient address that should be used to send the payment URL. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

