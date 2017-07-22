# SubscriptionProductFeeTierServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductFeeTierServiceApi.md#count) | **POST** /subscription-product-fee-tier/count | Count
[**create**](SubscriptionProductFeeTierServiceApi.md#create) | **POST** /subscription-product-fee-tier/create | Create
[**delete**](SubscriptionProductFeeTierServiceApi.md#delete) | **POST** /subscription-product-fee-tier/delete | Delete
[**read**](SubscriptionProductFeeTierServiceApi.md#read) | **GET** /subscription-product-fee-tier/read | Read
[**search**](SubscriptionProductFeeTierServiceApi.md#search) | **POST** /subscription-product-fee-tier/search | Search
[**update**](SubscriptionProductFeeTierServiceApi.md#update) | **POST** /subscription-product-fee-tier/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#count");
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
> ProductMeteredTierFee create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
ProductMeteredTierFeeUpdate entity = new ProductMeteredTierFeeUpdate(); // ProductMeteredTierFeeUpdate | The metered fee tier object with the properties which should be created.
try {
    ProductMeteredTierFee result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductMeteredTierFeeUpdate**](ProductMeteredTierFeeUpdate.md)| The metered fee tier object with the properties which should be created. |

### Return type

[**ProductMeteredTierFee**](ProductMeteredTierFee.md)

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
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#delete");
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
> ProductMeteredTierFee read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the metered fee tier which should be returned.
try {
    ProductMeteredTierFee result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the metered fee tier which should be returned. |

### Return type

[**ProductMeteredTierFee**](ProductMeteredTierFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ProductMeteredTierFee&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the metered fee tiers which are returned by the search.
try {
    List<ProductMeteredTierFee> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the metered fee tiers which are returned by the search. |

### Return type

[**List&lt;ProductMeteredTierFee&gt;**](ProductMeteredTierFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> ProductMeteredTierFee update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductFeeTierServiceApi;


SubscriptionProductFeeTierServiceApi apiInstance = new SubscriptionProductFeeTierServiceApi();
Long spaceId = 789L; // Long | 
ProductMeteredTierFeeUpdate entity = new ProductMeteredTierFeeUpdate(); // ProductMeteredTierFeeUpdate | The metered fee tier object with all the properties which should be updated. The id and the version are required properties.
try {
    ProductMeteredTierFee result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductFeeTierServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductMeteredTierFeeUpdate**](ProductMeteredTierFeeUpdate.md)| The metered fee tier object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**ProductMeteredTierFee**](ProductMeteredTierFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

