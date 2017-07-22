# TokenVersionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activeVersion**](TokenVersionServiceApi.md#activeVersion) | **GET** /token-version/active-version | Active Version
[**count**](TokenVersionServiceApi.md#count) | **POST** /token-version/count | Count
[**read**](TokenVersionServiceApi.md#read) | **GET** /token-version/read | Read
[**search**](TokenVersionServiceApi.md#search) | **POST** /token-version/search | Search


<a name="activeVersion"></a>
# **activeVersion**
> TokenVersion activeVersion(spaceId, id)

Active Version

Returns the token version which is currently active given by the token id. In case no token version is active the method will return null.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TokenVersionServiceApi;


TokenVersionServiceApi apiInstance = new TokenVersionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of a token for which you want to look up the current active token version.
try {
    TokenVersion result = apiInstance.activeVersion(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenVersionServiceApi#activeVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of a token for which you want to look up the current active token version. |

### Return type

[**TokenVersion**](TokenVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TokenVersionServiceApi;


TokenVersionServiceApi apiInstance = new TokenVersionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenVersionServiceApi#count");
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

<a name="read"></a>
# **read**
> TokenVersion read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TokenVersionServiceApi;


TokenVersionServiceApi apiInstance = new TokenVersionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the token version which should be returned.
try {
    TokenVersion result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenVersionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the token version which should be returned. |

### Return type

[**TokenVersion**](TokenVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;TokenVersion&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.TokenVersionServiceApi;


TokenVersionServiceApi apiInstance = new TokenVersionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the token versions which are returned by the search.
try {
    List<TokenVersion> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenVersionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the token versions which are returned by the search. |

### Return type

[**List&lt;TokenVersion&gt;**](TokenVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

