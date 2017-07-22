# ApplicationUserServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](ApplicationUserServiceApi.md#count) | **POST** /application-user/count | Count
[**create**](ApplicationUserServiceApi.md#create) | **POST** /application-user/create | Create
[**delete**](ApplicationUserServiceApi.md#delete) | **POST** /application-user/delete | Delete
[**read**](ApplicationUserServiceApi.md#read) | **GET** /application-user/read | Read
[**search**](ApplicationUserServiceApi.md#search) | **POST** /application-user/search | Search
[**update**](ApplicationUserServiceApi.md#update) | **POST** /application-user/update | Update


<a name="count"></a>
# **count**
> Long count(filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#count");
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
> ApplicationUserCreateWithMacKey create(entity)

Create

Creates the application user with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
ApplicationUserCreate entity = new ApplicationUserCreate(); // ApplicationUserCreate | The user object with the properties which should be created.
try {
    ApplicationUserCreateWithMacKey result = apiInstance.create(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**ApplicationUserCreate**](ApplicationUserCreate.md)| The user object with the properties which should be created. |

### Return type

[**ApplicationUserCreateWithMacKey**](ApplicationUserCreateWithMacKey.md)

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
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#delete");
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
> ApplicationUser read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
Long id = 789L; // Long | The id of the application user which should be returned.
try {
    ApplicationUser result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the application user which should be returned. |

### Return type

[**ApplicationUser**](ApplicationUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;ApplicationUser&gt; search(query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the application users which are returned by the search.
try {
    List<ApplicationUser> result = apiInstance.search(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the application users which are returned by the search. |

### Return type

[**List&lt;ApplicationUser&gt;**](ApplicationUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> ApplicationUser update(entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ApplicationUserServiceApi;


ApplicationUserServiceApi apiInstance = new ApplicationUserServiceApi();
ApplicationUserUpdate entity = new ApplicationUserUpdate(); // ApplicationUserUpdate | The application user entity with all the properties which should be updated. The id and the version are required properties.
try {
    ApplicationUser result = apiInstance.update(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationUserServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**ApplicationUserUpdate**](ApplicationUserUpdate.md)| The application user entity with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**ApplicationUser**](ApplicationUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

