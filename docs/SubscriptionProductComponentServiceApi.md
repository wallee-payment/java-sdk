# SubscriptionProductComponentServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductComponentServiceApi.md#count) | **POST** /subscription-product-component/count | Count
[**create**](SubscriptionProductComponentServiceApi.md#create) | **POST** /subscription-product-component/create | Create
[**delete**](SubscriptionProductComponentServiceApi.md#delete) | **POST** /subscription-product-component/delete | Delete
[**read**](SubscriptionProductComponentServiceApi.md#read) | **GET** /subscription-product-component/read | Read
[**search**](SubscriptionProductComponentServiceApi.md#search) | **POST** /subscription-product-component/search | Search
[**update**](SubscriptionProductComponentServiceApi.md#update) | **POST** /subscription-product-component/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#count");
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
> SubscriptionProductComponent create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductComponentUpdate entity = new SubscriptionProductComponentUpdate(); // SubscriptionProductComponentUpdate | The product component object with the properties which should be created.
try {
    SubscriptionProductComponent result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductComponentUpdate**](SubscriptionProductComponentUpdate.md)| The product component object with the properties which should be created. |

### Return type

[**SubscriptionProductComponent**](SubscriptionProductComponent.md)

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
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#delete");
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
> SubscriptionProductComponent read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the product component which should be returned.
try {
    SubscriptionProductComponent result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the product component which should be returned. |

### Return type

[**SubscriptionProductComponent**](SubscriptionProductComponent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProductComponent&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the product component which are returned by the search.
try {
    List<SubscriptionProductComponent> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the product component which are returned by the search. |

### Return type

[**List&lt;SubscriptionProductComponent&gt;**](SubscriptionProductComponent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> SubscriptionProductComponent update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductComponentServiceApi;


SubscriptionProductComponentServiceApi apiInstance = new SubscriptionProductComponentServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductComponentUpdate entity = new SubscriptionProductComponentUpdate(); // SubscriptionProductComponentUpdate | The product component object with all the properties which should be updated. The id and the version are required properties.
try {
    SubscriptionProductComponent result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductComponentServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductComponentUpdate**](SubscriptionProductComponentUpdate.md)| The product component object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**SubscriptionProductComponent**](SubscriptionProductComponent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

