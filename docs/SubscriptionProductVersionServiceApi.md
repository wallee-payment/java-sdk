# SubscriptionProductVersionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate**](SubscriptionProductVersionServiceApi.md#activate) | **POST** /subscription-product-version/activate | activate
[**count**](SubscriptionProductVersionServiceApi.md#count) | **POST** /subscription-product-version/count | Count
[**create**](SubscriptionProductVersionServiceApi.md#create) | **POST** /subscription-product-version/create | Create
[**read**](SubscriptionProductVersionServiceApi.md#read) | **GET** /subscription-product-version/read | Read
[**search**](SubscriptionProductVersionServiceApi.md#search) | **POST** /subscription-product-version/search | Search
[**update**](SubscriptionProductVersionServiceApi.md#update) | **POST** /subscription-product-version/update | Update


<a name="activate"></a>
# **activate**
> SubscriptionProductVersion activate(spaceId, productVersionId)

activate

This operation activates a new product version.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
Long productVersionId = 789L; // Long | The product version id identifies the product version which should be activated.
try {
    SubscriptionProductVersion result = apiInstance.activate(spaceId, productVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#activate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **productVersionId** | **Long**| The product version id identifies the product version which should be activated. |

### Return type

[**SubscriptionProductVersion**](SubscriptionProductVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#count");
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
> SubscriptionProductVersion create(spaceId, entity)

Create

Creates the entity with the given properties.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductVersionPending entity = new SubscriptionProductVersionPending(); // SubscriptionProductVersionPending | The product version object with the properties which should be created.
try {
    SubscriptionProductVersion result = apiInstance.create(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductVersionPending**](SubscriptionProductVersionPending.md)| The product version object with the properties which should be created. |

### Return type

[**SubscriptionProductVersion**](SubscriptionProductVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionProductVersion read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the product version which should be returned.
try {
    SubscriptionProductVersion result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the product version which should be returned. |

### Return type

[**SubscriptionProductVersion**](SubscriptionProductVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProductVersion&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the product versions which are returned by the search.
try {
    List<SubscriptionProductVersion> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the product versions which are returned by the search. |

### Return type

[**List&lt;SubscriptionProductVersion&gt;**](SubscriptionProductVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="update"></a>
# **update**
> SubscriptionProductVersion update(spaceId, entity)

Update

This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionServiceApi;


SubscriptionProductVersionServiceApi apiInstance = new SubscriptionProductVersionServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductVersionPending entity = new SubscriptionProductVersionPending(); // SubscriptionProductVersionPending | The product version object with all the properties which should be updated. The id and the version are required properties.
try {
    SubscriptionProductVersion result = apiInstance.update(spaceId, entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionServiceApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **entity** | [**SubscriptionProductVersionPending**](SubscriptionProductVersionPending.md)| The product version object with all the properties which should be updated. The id and the version are required properties. |

### Return type

[**SubscriptionProductVersion**](SubscriptionProductVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

