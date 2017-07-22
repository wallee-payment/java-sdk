# ChargeFlowLevelServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](ChargeFlowLevelServiceApi.md#count) | **POST** /charge-flow-level/count | Count
[**read**](ChargeFlowLevelServiceApi.md#read) | **GET** /charge-flow-level/read | Read
[**search**](ChargeFlowLevelServiceApi.md#search) | **POST** /charge-flow-level/search | Search
[**sendMessage**](ChargeFlowLevelServiceApi.md#sendMessage) | **POST** /charge-flow-level/sendMessage | Send Payment Link


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowLevelServiceApi;


ChargeFlowLevelServiceApi apiInstance = new ChargeFlowLevelServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowLevelServiceApi#count");
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
> ChargeFlowLevel read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowLevelServiceApi;


ChargeFlowLevelServiceApi apiInstance = new ChargeFlowLevelServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the payment flow level which should be returned.
try {
    ChargeFlowLevel result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowLevelServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the payment flow level which should be returned. |

### Return type

[**ChargeFlowLevel**](ChargeFlowLevel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ChargeFlowLevel&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowLevelServiceApi;


ChargeFlowLevelServiceApi apiInstance = new ChargeFlowLevelServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the payment flow levels which are returned by the search.
try {
    List<ChargeFlowLevel> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowLevelServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the payment flow levels which are returned by the search. |

### Return type

[**List&lt;ChargeFlowLevel&gt;**](ChargeFlowLevel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="sendMessage"></a>
# **sendMessage**
> ChargeFlowLevel sendMessage(spaceId, id)

Send Payment Link

Sends the payment link of the charge flow level with the given &#39;id&#39;.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ChargeFlowLevelServiceApi;


ChargeFlowLevelServiceApi apiInstance = new ChargeFlowLevelServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the charge flow level whose payment link should be sent.
try {
    ChargeFlowLevel result = apiInstance.sendMessage(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargeFlowLevelServiceApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the charge flow level whose payment link should be sent. |

### Return type

[**ChargeFlowLevel**](ChargeFlowLevel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

