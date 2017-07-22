# PaymentProcessorConfigurationServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](PaymentProcessorConfigurationServiceApi.md#count) | **POST** /payment-processor-configuration/count | Count
[**read**](PaymentProcessorConfigurationServiceApi.md#read) | **GET** /payment-processor-configuration/read | Read
[**search**](PaymentProcessorConfigurationServiceApi.md#search) | **POST** /payment-processor-configuration/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentProcessorConfigurationServiceApi;


PaymentProcessorConfigurationServiceApi apiInstance = new PaymentProcessorConfigurationServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentProcessorConfigurationServiceApi#count");
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
> PaymentProcessorConfiguration read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentProcessorConfigurationServiceApi;


PaymentProcessorConfigurationServiceApi apiInstance = new PaymentProcessorConfigurationServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the payment processor configuration which should be returned.
try {
    PaymentProcessorConfiguration result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentProcessorConfigurationServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the payment processor configuration which should be returned. |

### Return type

[**PaymentProcessorConfiguration**](PaymentProcessorConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;PaymentProcessorConfiguration&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentProcessorConfigurationServiceApi;


PaymentProcessorConfigurationServiceApi apiInstance = new PaymentProcessorConfigurationServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the payment processor configuration which are returned by the search.
try {
    List<PaymentProcessorConfiguration> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentProcessorConfigurationServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the payment processor configuration which are returned by the search. |

### Return type

[**List&lt;PaymentProcessorConfiguration&gt;**](PaymentProcessorConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

