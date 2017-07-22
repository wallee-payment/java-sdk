# SubscriptionMetricUsageServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionMetricUsageServiceApi.md#count) | **POST** /subscription-metric-usage/count | Count
[**create**](SubscriptionMetricUsageServiceApi.md#create) | **POST** /subscription-metric-usage/create | Create
[**read**](SubscriptionMetricUsageServiceApi.md#read) | **GET** /subscription-metric-usage/read | Read
[**search**](SubscriptionMetricUsageServiceApi.md#search) | **POST** /subscription-metric-usage/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricUsageServiceApi;


SubscriptionMetricUsageServiceApi apiInstance = new SubscriptionMetricUsageServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricUsageServiceApi#count");
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
> SubscriptionMetricUsageReport create(spaceId, usageReport)

Create

This operation creates a new metric usage report.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricUsageServiceApi;


SubscriptionMetricUsageServiceApi apiInstance = new SubscriptionMetricUsageServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionMetricUsageReportCreate usageReport = new SubscriptionMetricUsageReportCreate(); // SubscriptionMetricUsageReportCreate | The usage report which should be created.
try {
    SubscriptionMetricUsageReport result = apiInstance.create(spaceId, usageReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricUsageServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **usageReport** | [**SubscriptionMetricUsageReportCreate**](SubscriptionMetricUsageReportCreate.md)| The usage report which should be created. |

### Return type

[**SubscriptionMetricUsageReport**](SubscriptionMetricUsageReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionMetricUsageReport read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricUsageServiceApi;


SubscriptionMetricUsageServiceApi apiInstance = new SubscriptionMetricUsageServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the usage report which should be returned.
try {
    SubscriptionMetricUsageReport result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricUsageServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the usage report which should be returned. |

### Return type

[**SubscriptionMetricUsageReport**](SubscriptionMetricUsageReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionMetricUsageReport&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionMetricUsageServiceApi;


SubscriptionMetricUsageServiceApi apiInstance = new SubscriptionMetricUsageServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the usage reports which are returned by the search.
try {
    List<SubscriptionMetricUsageReport> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionMetricUsageServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the usage reports which are returned by the search. |

### Return type

[**List&lt;SubscriptionMetricUsageReport&gt;**](SubscriptionMetricUsageReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

