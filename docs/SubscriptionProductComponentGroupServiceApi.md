# SubscriptionProductComponentGroupServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductComponentGroupServiceApi.md#count) | **POST** /subscription-product-component-group/count | Count
[**create**](SubscriptionProductComponentGroupServiceApi.md#create) | **POST** /subscription-product-component-group/create | Create
[**delete**](SubscriptionProductComponentGroupServiceApi.md#delete) | **POST** /subscription-product-component-group/delete | Delete
[**read**](SubscriptionProductComponentGroupServiceApi.md#read) | **GET** /subscription-product-component-group/read | Read
[**search**](SubscriptionProductComponentGroupServiceApi.md#search) | **POST** /subscription-product-component-group/search | Search
[**update**](SubscriptionProductComponentGroupServiceApi.md#update) | **POST** /subscription-product-component-group/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#count");
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
> SubscriptionProductComponentGroup create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductComponentGroupUpdate entity = new SubscriptionProductComponentGroupUpdate(); // SubscriptionProductComponentGroupUpdate | The product component group object with the properties which should be created.
try {
    SubscriptionProductComponentGroup result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductComponentGroupUpdate**](SubscriptionProductComponentGroupUpdate.md)| The product component group object with the properties which should be created. |

### Return type

[**SubscriptionProductComponentGroup**](SubscriptionProductComponentGroup.md)

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
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#delete");
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
> SubscriptionProductComponentGroup read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the product component group which should be returned.
try {
    SubscriptionProductComponentGroup result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the product component group which should be returned. |

### Return type

[**SubscriptionProductComponentGroup**](SubscriptionProductComponentGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProductComponentGroup&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the product component groups which are returned by the search.
try {
    List<SubscriptionProductComponentGroup> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the product component groups which are returned by the search. |

### Return type

[**List&lt;SubscriptionProductComponentGroup&gt;**](SubscriptionProductComponentGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> SubscriptionProductComponentGroup update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentGroupServiceApi;


SubscriptionProductComponentGroupServiceApi apiInstance = new SubscriptionProductComponentGroupServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductComponentGroupUpdate entity = new SubscriptionProductComponentGroupUpdate(); // SubscriptionProductComponentGroupUpdate | The product component group object with all the properties which should be updated. The id and the version are required properties.
try {
    SubscriptionProductComponentGroup result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentGroupServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductComponentGroupUpdate**](SubscriptionProductComponentGroupUpdate.md)| The product component group object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**SubscriptionProductComponentGroup**](SubscriptionProductComponentGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

