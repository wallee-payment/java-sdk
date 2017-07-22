# TransactionCompletionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeOffline**](TransactionCompletionServiceApi.md#completeOffline) | **POST** /transaction-completion/completeOffline | completeOffline
[**completeOnline**](TransactionCompletionServiceApi.md#completeOnline) | **POST** /transaction-completion/completeOnline | completeOnline
[**count**](TransactionCompletionServiceApi.md#count) | **POST** /transaction-completion/count | Count
[**read**](TransactionCompletionServiceApi.md#read) | **GET** /transaction-completion/read | Read
[**search**](TransactionCompletionServiceApi.md#search) | **POST** /transaction-completion/search | Search


<a name="completeOffline"></a>
# **completeOffline**
> TransactionCompletion completeOffline(spaceId, id)

completeOffline

This operation completes the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionCompletionServiceApi;


TransactionCompletionServiceApi apiInstance = new TransactionCompletionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be completed.
try {
    TransactionCompletion result = apiInstance.completeOffline(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionCompletionServiceApi#completeOffline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be completed. |

### Return type

[**TransactionCompletion**](TransactionCompletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="completeOnline"></a>
# **completeOnline**
> TransactionCompletion completeOnline(spaceId, id)

completeOnline

This operation completes the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionCompletionServiceApi;


TransactionCompletionServiceApi apiInstance = new TransactionCompletionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction which should be completed.
try {
    TransactionCompletion result = apiInstance.completeOnline(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionCompletionServiceApi#completeOnline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction which should be completed. |

### Return type

[**TransactionCompletion**](TransactionCompletion.md)

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
//import com.wallee.sdk.api.TransactionCompletionServiceApi;


TransactionCompletionServiceApi apiInstance = new TransactionCompletionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionCompletionServiceApi#count");
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
> TransactionCompletion read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionCompletionServiceApi;


TransactionCompletionServiceApi apiInstance = new TransactionCompletionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the transaction completions which should be returned.
try {
    TransactionCompletion result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionCompletionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the transaction completions which should be returned. |

### Return type

[**TransactionCompletion**](TransactionCompletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;TransactionCompletion&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TransactionCompletionServiceApi;


TransactionCompletionServiceApi apiInstance = new TransactionCompletionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the transaction completions which are returned by the search.
try {
    List<TransactionCompletion> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionCompletionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the transaction completions which are returned by the search. |

### Return type

[**List&lt;TransactionCompletion&gt;**](TransactionCompletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

