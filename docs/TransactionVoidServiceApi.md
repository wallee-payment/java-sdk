# TransactionVoidServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](TransactionVoidServiceApi.md#count) | **POST** /transaction-void/count | Count
[**read**](TransactionVoidServiceApi.md#read) | **GET** /transaction-void/read | Read
[**search**](TransactionVoidServiceApi.md#search) | **POST** /transaction-void/search | Search
[**voidOffline**](TransactionVoidServiceApi.md#voidOffline) | **POST** /transaction-void/voidOffline | voidOffline
[**voidOnline**](TransactionVoidServiceApi.md#voidOnline) | **POST** /transaction-void/voidOnline | voidOnline


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionVoidServiceApi;


TransactionVoidServiceApi apiInstance = new TransactionVoidServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionVoidServiceApi#count");
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
> TransactionVoid read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionVoidServiceApi;


TransactionVoidServiceApi apiInstance = new TransactionVoidServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction voids which should be returned.
try {
    TransactionVoid result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionVoidServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction voids which should be returned. |

### Return type

[**TransactionVoid**](TransactionVoid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;TransactionVoid&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionVoidServiceApi;


TransactionVoidServiceApi apiInstance = new TransactionVoidServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the transaction voids which are returned by the search.
try {
    List<TransactionVoid> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionVoidServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the transaction voids which are returned by the search. |

### Return type

[**List&lt;TransactionVoid&gt;**](TransactionVoid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="voidOffline"></a>
# **voidOffline**
> TransactionVoid voidOffline(spaceId, id)

voidOffline

This operation voids the transaction offline. The void is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionVoidServiceApi;


TransactionVoidServiceApi apiInstance = new TransactionVoidServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be voided.
try {
    TransactionVoid result = apiInstance.voidOffline(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionVoidServiceApi#voidOffline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be voided. |

### Return type

[**TransactionVoid**](TransactionVoid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="voidOnline"></a>
# **voidOnline**
> TransactionVoid voidOnline(spaceId, id)

voidOnline

This operation voids the transaction online. The void is forwarded to the processor. This implies that the processor may take some actions based on the void.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionVoidServiceApi;


TransactionVoidServiceApi apiInstance = new TransactionVoidServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be voided.
try {
    TransactionVoid result = apiInstance.voidOnline(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionVoidServiceApi#voidOnline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be voided. |

### Return type

[**TransactionVoid**](TransactionVoid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

