# SubscriberServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriberServiceApi.md#count) | **POST** /subscriber/count | Count
[**create**](SubscriberServiceApi.md#create) | **POST** /subscriber/create | Create
[**delete**](SubscriberServiceApi.md#delete) | **POST** /subscriber/delete | Delete
[**read**](SubscriberServiceApi.md#read) | **GET** /subscriber/read | Read
[**search**](SubscriberServiceApi.md#search) | **POST** /subscriber/search | Search
[**update**](SubscriberServiceApi.md#update) | **POST** /subscriber/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#count");
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
> SubscriberCreate create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
SubscriberCreate entity = new SubscriberCreate(); // SubscriberCreate | The customer object with the properties which should be created.
try {
    SubscriberCreate result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriberCreate**](SubscriberCreate.md)| The customer object with the properties which should be created. |

### Return type

[**SubscriberCreate**](SubscriberCreate.md)

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
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#delete");
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
> Subscriber read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the customer which should be returned.
try {
    Subscriber result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the customer which should be returned. |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;Subscriber&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the customer which are returned by the search.
try {
    List<Subscriber> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the customer which are returned by the search. |

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> Subscriber update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriberServiceApi;


SubscriberServiceApi apiInstance = new SubscriberServiceApi();
Long spaceId = 789L; // Long | 
SubscriberUpdate entity = new SubscriberUpdate(); // SubscriberUpdate | The customer with all the properties which should be updated. The id and the version are required properties.
try {
    Subscriber result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriberUpdate**](SubscriberUpdate.md)| The customer with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

