# SubscriptionProductSetupFeeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductSetupFeeServiceApi.md#count) | **POST** /subscription-product-setup-fee/count | Count
[**create**](SubscriptionProductSetupFeeServiceApi.md#create) | **POST** /subscription-product-setup-fee/create | Create
[**delete**](SubscriptionProductSetupFeeServiceApi.md#delete) | **POST** /subscription-product-setup-fee/delete | Delete
[**read**](SubscriptionProductSetupFeeServiceApi.md#read) | **GET** /subscription-product-setup-fee/read | Read
[**search**](SubscriptionProductSetupFeeServiceApi.md#search) | **POST** /subscription-product-setup-fee/search | Search
[**update**](SubscriptionProductSetupFeeServiceApi.md#update) | **POST** /subscription-product-setup-fee/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#count");
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
> ProductSetupFee create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductSetupFeeUpdate entity = new ProductSetupFeeUpdate(); // ProductSetupFeeUpdate | The setup fee object with the properties which should be created.
try {
    ProductSetupFee result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductSetupFeeUpdate**](ProductSetupFeeUpdate.md)| The setup fee object with the properties which should be created. |

### Return type

[**ProductSetupFee**](ProductSetupFee.md)

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
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#delete");
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
> ProductSetupFee read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the setup fee which should be returned.
try {
    ProductSetupFee result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the setup fee which should be returned. |

### Return type

[**ProductSetupFee**](ProductSetupFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ProductSetupFee&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the setup fees which are returned by the search.
try {
    List<ProductSetupFee> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the setup fees which are returned by the search. |

### Return type

[**List&lt;ProductSetupFee&gt;**](ProductSetupFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> ProductSetupFee update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductSetupFeeServiceApi;


SubscriptionProductSetupFeeServiceApi apiInstance = new SubscriptionProductSetupFeeServiceApi();
Long spaceId = 789L; // Long | 
ProductSetupFeeUpdate entity = new ProductSetupFeeUpdate(); // ProductSetupFeeUpdate | The setup fee object with all the properties which should be updated. The id and the version are required properties.
try {
    ProductSetupFee result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductSetupFeeServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**ProductSetupFeeUpdate**](ProductSetupFeeUpdate.md)| The setup fee object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**ProductSetupFee**](ProductSetupFee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

