# SubscriptionSuspensionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionSuspensionServiceApi.md#count) | **POST** /subscription-suspension/count | Count
[**create**](SubscriptionSuspensionServiceApi.md#create) | **POST** /subscription-suspension/create | Create
[**read**](SubscriptionSuspensionServiceApi.md#read) | **GET** /subscription-suspension/read | Read
[**search**](SubscriptionSuspensionServiceApi.md#search) | **POST** /subscription-suspension/search | Search
[**terminate**](SubscriptionSuspensionServiceApi.md#terminate) | **POST** /subscription-suspension/terminate | terminate


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionSuspensionServiceApi;


SubscriptionSuspensionServiceApi apiInstance = new SubscriptionSuspensionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionSuspensionServiceApi#count");
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
> SubscriptionSuspension create(spaceId, suspension)

Create

The create operation creates a new subscription suspension.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionSuspensionServiceApi;


SubscriptionSuspensionServiceApi apiInstance = new SubscriptionSuspensionServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionSuspensionCreate suspension = new SubscriptionSuspensionCreate(); // SubscriptionSuspensionCreate | 
try {
    SubscriptionSuspension result = apiInstance.create(spaceId, suspension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionSuspensionServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **suspension** | [**SubscriptionSuspensionCreate**](SubscriptionSuspensionCreate.md)|  |

### Return type

[**SubscriptionSuspension**](SubscriptionSuspension.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionSuspension read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionSuspensionServiceApi;


SubscriptionSuspensionServiceApi apiInstance = new SubscriptionSuspensionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the suspension which should be returned.
try {
    SubscriptionSuspension result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionSuspensionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the suspension which should be returned. |

### Return type

[**SubscriptionSuspension**](SubscriptionSuspension.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionSuspension&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionSuspensionServiceApi;


SubscriptionSuspensionServiceApi apiInstance = new SubscriptionSuspensionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the subscription suspensions which are returned by the search.
try {
    List<SubscriptionSuspension> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionSuspensionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the subscription suspensions which are returned by the search. |

### Return type

[**List&lt;SubscriptionSuspension&gt;**](SubscriptionSuspension.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="terminate"></a>
# **terminate**
> SubscriptionSuspension terminate(spaceId, suspensionId)

terminate

The create operation creates a new subscription suspension.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionSuspensionServiceApi;


SubscriptionSuspensionServiceApi apiInstance = new SubscriptionSuspensionServiceApi();
Long spaceId = 789L; // Long | 
Long suspensionId = 789L; // Long | 
try {
    SubscriptionSuspension result = apiInstance.terminate(spaceId, suspensionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionSuspensionServiceApi#terminate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **suspensionId** | **Long**|  |

### Return type

[**SubscriptionSuspension**](SubscriptionSuspension.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

