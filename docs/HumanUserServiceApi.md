# HumanUserServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](HumanUserServiceApi.md#count) | **POST** /human-user/count | Count
[**create**](HumanUserServiceApi.md#create) | **POST** /human-user/create | Create
[**delete**](HumanUserServiceApi.md#delete) | **POST** /human-user/delete | Delete
[**read**](HumanUserServiceApi.md#read) | **GET** /human-user/read | Read
[**search**](HumanUserServiceApi.md#search) | **POST** /human-user/search | Search
[**update**](HumanUserServiceApi.md#update) | **POST** /human-user/update | Update


<a name="count"></a>
# **count**
> Long count(filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#count");
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
> HumanUser create(entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
HumanUserCreate entity = new HumanUserCreate(); // HumanUserCreate | The human user object with the properties which should be created.
try {
    HumanUser result = apiInstance.create(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**HumanUserCreate**](HumanUserCreate.md)| The human user object with the properties which should be created. |

### Return type

[**HumanUser**](HumanUser.md)

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
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#delete");
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
> HumanUser read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
Long id = 789L; // Long | The id of the human user which should be returned.
try {
    HumanUser result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the human user which should be returned. |

### Return type

[**HumanUser**](HumanUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;HumanUser&gt; search(query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the human users which are returned by the search.
try {
    List<HumanUser> result = apiInstance.search(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the human users which are returned by the search. |

### Return type

[**List&lt;HumanUser&gt;**](HumanUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> HumanUser update(entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.HumanUserServiceApi;


HumanUserServiceApi apiInstance = new HumanUserServiceApi();
HumanUserUpdate entity = new HumanUserUpdate(); // HumanUserUpdate | The object with all the properties which should be updated. The id and the version are required properties.
try {
    HumanUser result = apiInstance.update(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HumanUserServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**HumanUserUpdate**](HumanUserUpdate.md)| The object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**HumanUser**](HumanUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

