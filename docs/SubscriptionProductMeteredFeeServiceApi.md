# SubscriptionProductMeteredFeeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductMeteredFeeServiceApi.md#count) | **POST** /subscription-product-metered-fee/count | Count
[**create**](SubscriptionProductMeteredFeeServiceApi.md#create) | **POST** /subscription-product-metered-fee/create | Create
[**delete**](SubscriptionProductMeteredFeeServiceApi.md#delete) | **POST** /subscription-product-metered-fee/delete | Delete
[**read**](SubscriptionProductMeteredFeeServiceApi.md#read) | **GET** /subscription-product-metered-fee/read | Read
[**search**](SubscriptionProductMeteredFeeServiceApi.md#search) | **POST** /subscription-product-metered-fee/search | Search
[**update**](SubscriptionProductMeteredFeeServiceApi.md#update) | **POST** /subscription-product-metered-fee/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#count");
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
> ProductMeteredFee create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductMeteredFeeUpdate entity = new ProductMeteredFeeUpdate(); // ProductMeteredFeeUpdate | The metered fee object with the properties which should be created.
try {
    ProductMeteredFee result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductMeteredFeeUpdate**](ProductMeteredFeeUpdate.md)| The metered fee object with the properties which should be created. |

### Return type

[**ProductMeteredFee**](ProductMeteredFee.md)

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
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#delete");
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
> ProductMeteredFee read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the metered fee which should be returned.
try {
    ProductMeteredFee result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the metered fee which should be returned. |

### Return type

[**ProductMeteredFee**](ProductMeteredFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ProductMeteredFee&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the metered fees which are returned by the search.
try {
    List<ProductMeteredFee> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the metered fees which are returned by the search. |

### Return type

[**List&lt;ProductMeteredFee&gt;**](ProductMeteredFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> ProductMeteredFee update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductMeteredFeeServiceApi;


SubscriptionProductMeteredFeeServiceApi apiInstance = new SubscriptionProductMeteredFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductMeteredFeeUpdate entity = new ProductMeteredFeeUpdate(); // ProductMeteredFeeUpdate | The metered fee object with all the properties which should be updated. The id and the version are required properties.
try {
    ProductMeteredFee result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductMeteredFeeServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductMeteredFeeUpdate**](ProductMeteredFeeUpdate.md)| The metered fee object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**ProductMeteredFee**](ProductMeteredFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

