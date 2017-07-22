# SpaceServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SpaceServiceApi.md#count) | **POST** /space/count | Count
[**create**](SpaceServiceApi.md#create) | **POST** /space/create | Create
[**delete**](SpaceServiceApi.md#delete) | **POST** /space/delete | Delete
[**read**](SpaceServiceApi.md#read) | **GET** /space/read | Read
[**search**](SpaceServiceApi.md#search) | **POST** /space/search | Search
[**update**](SpaceServiceApi.md#update) | **POST** /space/update | Update


<a name="count"></a>
# **count**
> Long count(filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> Space create(entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
SpaceCreate entity = new SpaceCreate(); // SpaceCreate | The space object with the properties which should be created.
try {
    Space result = apiInstance.create(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**SpaceCreate**](SpaceCreate.md)| The space object with the properties which should be created. |

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="delete"></a>
# **delete**
> delete(id)

Delete

Deletes the entity with the given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> Space read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
Long id = 789L; // Long | The id of the space which should be returned.
try {
    Space result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the space which should be returned. |

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;Space&gt; search(query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the spaces which are returned by the search.
try {
    List<Space> result = apiInstance.search(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the spaces which are returned by the search. |

### Return type

[**List&lt;Space&gt;**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> Space update(entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SpaceServiceApi;


SpaceServiceApi apiInstance = new SpaceServiceApi();
SpaceUpdate entity = new SpaceUpdate(); // SpaceUpdate | The space object with all the properties which should be updated. The id and the version are required properties.
try {
    Space result = apiInstance.update(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**SpaceUpdate**](SpaceUpdate.md)| The space object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

