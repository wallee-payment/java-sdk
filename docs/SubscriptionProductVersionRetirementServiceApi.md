# SubscriptionProductVersionRetirementServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductVersionRetirementServiceApi.md#count) | **POST** /subscription-product-version-retirement/count | Count
[**create**](SubscriptionProductVersionRetirementServiceApi.md#create) | **POST** /subscription-product-version-retirement/create | Create
[**read**](SubscriptionProductVersionRetirementServiceApi.md#read) | **GET** /subscription-product-version-retirement/read | Read
[**search**](SubscriptionProductVersionRetirementServiceApi.md#search) | **POST** /subscription-product-version-retirement/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionRetirementServiceApi;


SubscriptionProductVersionRetirementServiceApi apiInstance = new SubscriptionProductVersionRetirementServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionRetirementServiceApi#count");
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
> SubscriptionProductVersionRetirement create(spaceId, retirement)

Create

The create operation creates a new product version retirement.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionRetirementServiceApi;


SubscriptionProductVersionRetirementServiceApi apiInstance = new SubscriptionProductVersionRetirementServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductVersionRetirementCreate retirement = new SubscriptionProductVersionRetirementCreate(); // SubscriptionProductVersionRetirementCreate | 
try {
    SubscriptionProductVersionRetirement result = apiInstance.create(spaceId, retirement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionRetirementServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **retirement** | [**SubscriptionProductVersionRetirementCreate**](SubscriptionProductVersionRetirementCreate.md)|  |

### Return type

[**SubscriptionProductVersionRetirement**](SubscriptionProductVersionRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionProductVersionRetirement read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionRetirementServiceApi;


SubscriptionProductVersionRetirementServiceApi apiInstance = new SubscriptionProductVersionRetirementServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the retirement which should be returned.
try {
    SubscriptionProductVersionRetirement result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionRetirementServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the retirement which should be returned. |

### Return type

[**SubscriptionProductVersionRetirement**](SubscriptionProductVersionRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProductVersionRetirement&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductVersionRetirementServiceApi;


SubscriptionProductVersionRetirementServiceApi apiInstance = new SubscriptionProductVersionRetirementServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the product version retirements which are returned by the search.
try {
    List<SubscriptionProductVersionRetirement> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductVersionRetirementServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the product version retirements which are returned by the search. |

### Return type

[**List&lt;SubscriptionProductVersionRetirement&gt;**](SubscriptionProductVersionRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

