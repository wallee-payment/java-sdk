# SubscriptionMetricServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionMetricServiceApi.md#count) | **POST** /subscription-metric/count | Count
[**create**](SubscriptionMetricServiceApi.md#create) | **POST** /subscription-metric/create | Create
[**delete**](SubscriptionMetricServiceApi.md#delete) | **POST** /subscription-metric/delete | Delete
[**read**](SubscriptionMetricServiceApi.md#read) | **GET** /subscription-metric/read | Read
[**search**](SubscriptionMetricServiceApi.md#search) | **POST** /subscription-metric/search | Search
[**update**](SubscriptionMetricServiceApi.md#update) | **POST** /subscription-metric/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#count");
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
> SubscriptionMetric create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionMetricCreate entity = new SubscriptionMetricCreate(); // SubscriptionMetricCreate | The metric object with the properties which should be created.
try {
    SubscriptionMetric result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionMetricCreate**](SubscriptionMetricCreate.md)| The metric object with the properties which should be created. |

### Return type

[**SubscriptionMetric**](SubscriptionMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="delete"></a>
# **delete**
> delete(spaceId, id)

Delete

Deletes the entity with the given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the metric which should be deleted.
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the metric which should be deleted. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionMetric read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the metric which should be returned.
try {
    SubscriptionMetric result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the metric which should be returned. |

### Return type

[**SubscriptionMetric**](SubscriptionMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionMetric&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the metric which are returned by the search.
try {
    List<SubscriptionMetric> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the metric which are returned by the search. |

### Return type

[**List&lt;SubscriptionMetric&gt;**](SubscriptionMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> SubscriptionMetric update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricServiceApi;


SubscriptionMetricServiceApi apiInstance = new SubscriptionMetricServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionMetricActive entity = new SubscriptionMetricActive(); // SubscriptionMetricActive | The products metric with all the properties which should be updated. The id and the version are required properties.
try {
    SubscriptionMetric result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionMetricActive**](SubscriptionMetricActive.md)| The products metric with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**SubscriptionMetric**](SubscriptionMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

