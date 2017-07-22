# InstallmentPlanConfigurationServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](InstallmentPlanConfigurationServiceApi.md#count) | **POST** /installment-plan-configuration/count | Count
[**read**](InstallmentPlanConfigurationServiceApi.md#read) | **GET** /installment-plan-configuration/read | Read
[**search**](InstallmentPlanConfigurationServiceApi.md#search) | **POST** /installment-plan-configuration/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPlanConfigurationServiceApi;


InstallmentPlanConfigurationServiceApi apiInstance = new InstallmentPlanConfigurationServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the installment plan configurations which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanConfigurationServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **filter** | [**EntityQueryFilter**](EntityQueryFilter.md)| The filter which restricts the installment plan configurations which are used to calculate the count. |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> InstallmentPlanConfiguration read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPlanConfigurationServiceApi;


InstallmentPlanConfigurationServiceApi apiInstance = new InstallmentPlanConfigurationServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the installment plan configuration which should be returned.
try {
    InstallmentPlanConfiguration result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanConfigurationServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the installment plan configuration which should be returned. |

### Return type

[**InstallmentPlanConfiguration**](InstallmentPlanConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;InstallmentPlanConfiguration&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPlanConfigurationServiceApi;


InstallmentPlanConfigurationServiceApi apiInstance = new InstallmentPlanConfigurationServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the installment plan configurations which are returned by the search.
try {
    List<InstallmentPlanConfiguration> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanConfigurationServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the installment plan configurations which are returned by the search. |

### Return type

[**List&lt;InstallmentPlanConfiguration&gt;**](InstallmentPlanConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

