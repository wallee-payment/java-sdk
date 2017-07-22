# InstallmentPaymentSliceServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](InstallmentPaymentSliceServiceApi.md#count) | **POST** /installment-payment-slice/count | Count
[**read**](InstallmentPaymentSliceServiceApi.md#read) | **GET** /installment-payment-slice/read | Read
[**search**](InstallmentPaymentSliceServiceApi.md#search) | **POST** /installment-payment-slice/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentSliceServiceApi;


InstallmentPaymentSliceServiceApi apiInstance = new InstallmentPaymentSliceServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the installment payment slices which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentSliceServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **filter** | [**EntityQueryFilter**](EntityQueryFilter.md)| The filter which restricts the installment payment slices which are used to calculate the count. |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> InstallmentPaymentSlice read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentSliceServiceApi;


InstallmentPaymentSliceServiceApi apiInstance = new InstallmentPaymentSliceServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the installment payment slice which should be returned.
try {
    InstallmentPaymentSlice result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentSliceServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the installment payment slice which should be returned. |

### Return type

[**InstallmentPaymentSlice**](InstallmentPaymentSlice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;InstallmentPaymentSlice&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentSliceServiceApi;


InstallmentPaymentSliceServiceApi apiInstance = new InstallmentPaymentSliceServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the installment payment slices which are returned by the search.
try {
    List<InstallmentPaymentSlice> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentSliceServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the installment payment slices which are returned by the search. |

### Return type

[**List&lt;InstallmentPaymentSlice&gt;**](InstallmentPaymentSlice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

