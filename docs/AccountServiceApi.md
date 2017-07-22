# AccountServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](AccountServiceApi.md#count) | **POST** /account/count | Count
[**create**](AccountServiceApi.md#create) | **POST** /account/create | Create
[**delete**](AccountServiceApi.md#delete) | **POST** /account/delete | Delete
[**read**](AccountServiceApi.md#read) | **GET** /account/read | Read
[**search**](AccountServiceApi.md#search) | **POST** /account/search | Search
[**update**](AccountServiceApi.md#update) | **POST** /account/update | Update


<a name="count"></a>
# **count**
> Long count(filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#count");
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
> Account create(entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
AccountCreate entity = new AccountCreate(); // AccountCreate | The account object with the properties which should be created.
try {
    Account result = apiInstance.create(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**AccountCreate**](AccountCreate.md)| The account object with the properties which should be created. |

### Return type

[**Account**](Account.md)

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
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#delete");
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
> Account read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
Long id = 789L; // Long | The id of the account which should be returned.
try {
    Account result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the account which should be returned. |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;Account&gt; search(query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the accounts which are returned by the search.
try {
    List<Account> result = apiInstance.search(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the accounts which are returned by the search. |

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> Account update(entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.AccountServiceApi;


AccountServiceApi apiInstance = new AccountServiceApi();
AccountUpdate entity = new AccountUpdate(); // AccountUpdate | The account object with all the properties which should be updated. The id and the version are required properties.
try {
    Account result = apiInstance.update(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | [**AccountUpdate**](AccountUpdate.md)| The account object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

