# WebhookUrlServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](WebhookUrlServiceApi.md#count) | **POST** /webhook-url/count | Count
[**create**](WebhookUrlServiceApi.md#create) | **POST** /webhook-url/create | Create
[**delete**](WebhookUrlServiceApi.md#delete) | **POST** /webhook-url/delete | Delete
[**read**](WebhookUrlServiceApi.md#read) | **GET** /webhook-url/read | Read
[**search**](WebhookUrlServiceApi.md#search) | **POST** /webhook-url/search | Search
[**update**](WebhookUrlServiceApi.md#update) | **POST** /webhook-url/update | Update


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#count");
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
> WebhookUrl create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
WebhookUrlCreate entity = new WebhookUrlCreate(); // WebhookUrlCreate | The webhook url object with the properties which should be created.
try {
    WebhookUrl result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**WebhookUrlCreate**](WebhookUrlCreate.md)| The webhook url object with the properties which should be created. |

### Return type

[**WebhookUrl**](WebhookUrl.md)

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
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    apiInstance.delete(spaceId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#delete");
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
> WebhookUrl read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the webhook url which should be returned.
try {
    WebhookUrl result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the webhook url which should be returned. |

### Return type

[**WebhookUrl**](WebhookUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;WebhookUrl&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the webhook urls which are returned by the search.
try {
    List<WebhookUrl> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the webhook urls which are returned by the search. |

### Return type

[**List&lt;WebhookUrl&gt;**](WebhookUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> WebhookUrl update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.WebhookUrlServiceApi;


WebhookUrlServiceApi apiInstance = new WebhookUrlServiceApi();
Long spaceId = 789L; // Long | 
WebhookUrlUpdate entity = new WebhookUrlUpdate(); // WebhookUrlUpdate | The webhook url object with all the properties which should be updated. The id and the version are required properties.
try {
    WebhookUrl result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookUrlServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**WebhookUrlUpdate**](WebhookUrlUpdate.md)| The webhook url object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**WebhookUrl**](WebhookUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

