# SubscriptionProductServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductServiceApi.md#count) | **POST** /subscription-product/count | Count
[**create**](SubscriptionProductServiceApi.md#create) | **POST** /subscription-product/create | Create
[**read**](SubscriptionProductServiceApi.md#read) | **GET** /subscription-product/read | Read
[**search**](SubscriptionProductServiceApi.md#search) | **POST** /subscription-product/search | Search
[**update**](SubscriptionProductServiceApi.md#update) | **POST** /subscription-product/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductServiceApi;


SubscriptionProductServiceApi apiInstance = new SubscriptionProductServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductServiceApi#count");
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
> SubscriptionProduct create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductServiceApi;


SubscriptionProductServiceApi apiInstance = new SubscriptionProductServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductCreate entity = new SubscriptionProductCreate(); // SubscriptionProductCreate | The product object with the properties which should be created.
try {
    SubscriptionProduct result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductCreate**](SubscriptionProductCreate.md)| The product object with the properties which should be created. |

### Return type

[**SubscriptionProduct**](SubscriptionProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionProduct read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductServiceApi;


SubscriptionProductServiceApi apiInstance = new SubscriptionProductServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the product which should be returned.
try {
    SubscriptionProduct result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the product which should be returned. |

### Return type

[**SubscriptionProduct**](SubscriptionProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProduct&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductServiceApi;


SubscriptionProductServiceApi apiInstance = new SubscriptionProductServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the products which are returned by the search.
try {
    List<SubscriptionProduct> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the products which are returned by the search. |

### Return type

[**List&lt;SubscriptionProduct&gt;**](SubscriptionProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> SubscriptionProduct update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductServiceApi;


SubscriptionProductServiceApi apiInstance = new SubscriptionProductServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductActive entity = new SubscriptionProductActive(); // SubscriptionProductActive | The products object with all the properties which should be updated. The id and the version are required properties.
try {
    SubscriptionProduct result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductActive**](SubscriptionProductActive.md)| The products object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**SubscriptionProduct**](SubscriptionProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

