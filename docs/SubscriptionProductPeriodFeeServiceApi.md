# SubscriptionProductPeriodFeeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductPeriodFeeServiceApi.md#count) | **POST** /subscription-product-period-fee/count | Count
[**create**](SubscriptionProductPeriodFeeServiceApi.md#create) | **POST** /subscription-product-period-fee/create | Create
[**delete**](SubscriptionProductPeriodFeeServiceApi.md#delete) | **POST** /subscription-product-period-fee/delete | Delete
[**read**](SubscriptionProductPeriodFeeServiceApi.md#read) | **GET** /subscription-product-period-fee/read | Read
[**search**](SubscriptionProductPeriodFeeServiceApi.md#search) | **POST** /subscription-product-period-fee/search | Search
[**update**](SubscriptionProductPeriodFeeServiceApi.md#update) | **POST** /subscription-product-period-fee/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#count");
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
> ProductPeriodFee create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductPeriodFeeUpdate entity = new ProductPeriodFeeUpdate(); // ProductPeriodFeeUpdate | The period fee object with the properties which should be created.
try {
    ProductPeriodFee result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductPeriodFeeUpdate**](ProductPeriodFeeUpdate.md)| The period fee object with the properties which should be created. |

### Return type

[**ProductPeriodFee**](ProductPeriodFee.md)

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
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> ProductPeriodFee read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the period fee which should be returned.
try {
    ProductPeriodFee result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the period fee which should be returned. |

### Return type

[**ProductPeriodFee**](ProductPeriodFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ProductPeriodFee&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the period fees which are returned by the search.
try {
    List<ProductPeriodFee> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the period fees which are returned by the search. |

### Return type

[**List&lt;ProductPeriodFee&gt;**](ProductPeriodFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> ProductPeriodFee update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductPeriodFeeServiceApi;


SubscriptionProductPeriodFeeServiceApi apiInstance = new SubscriptionProductPeriodFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductPeriodFeeUpdate entity = new ProductPeriodFeeUpdate(); // ProductPeriodFeeUpdate | The period fee object with all the properties which should be updated. The id and the version are required properties.
try {
    ProductPeriodFee result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductPeriodFeeServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductPeriodFeeUpdate**](ProductPeriodFeeUpdate.md)| The period fee object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**ProductPeriodFee**](ProductPeriodFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

