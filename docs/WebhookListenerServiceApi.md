# WebhookListenerServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](WebhookListenerServiceApi.md#count) | **POST** /webhook-listener/count | Count
[**create**](WebhookListenerServiceApi.md#create) | **POST** /webhook-listener/create | Create
[**delete**](WebhookListenerServiceApi.md#delete) | **POST** /webhook-listener/delete | Delete
[**read**](WebhookListenerServiceApi.md#read) | **GET** /webhook-listener/read | Read
[**search**](WebhookListenerServiceApi.md#search) | **POST** /webhook-listener/search | Search
[**update**](WebhookListenerServiceApi.md#update) | **POST** /webhook-listener/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#count");
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
> WebhookListener create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
WebhookListenerCreate entity = new WebhookListenerCreate(); // WebhookListenerCreate | The webhook listener object with the properties which should be created.
try {
    WebhookListener result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**WebhookListenerCreate**](WebhookListenerCreate.md)| The webhook listener object with the properties which should be created. |

### Return type

[**WebhookListener**](WebhookListener.md)

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
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#delete");
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
> WebhookListener read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the webhook listener which should be returned.
try {
    WebhookListener result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the webhook listener which should be returned. |

### Return type

[**WebhookListener**](WebhookListener.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;WebhookListener&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the webhook listeners which are returned by the search.
try {
    List<WebhookListener> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the webhook listeners which are returned by the search. |

### Return type

[**List&lt;WebhookListener&gt;**](WebhookListener.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> WebhookListener update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookListenerServiceApi;


WebhookListenerServiceApi apiInstance = new WebhookListenerServiceApi();
Long spaceId = 789L; // Long | 
WebhookListenerUpdate entity = new WebhookListenerUpdate(); // WebhookListenerUpdate | The webhook listener object with all the properties which should be updated. The id and the version are required properties.
try {
    WebhookListener result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookListenerServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**WebhookListenerUpdate**](WebhookListenerUpdate.md)| The webhook listener object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**WebhookListener**](WebhookListener.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

