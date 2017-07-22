# SubscriptionProductRetirementServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionProductRetirementServiceApi.md#count) | **POST** /subscription-product-retirement/count | Count
[**create**](SubscriptionProductRetirementServiceApi.md#create) | **POST** /subscription-product-retirement/create | Create
[**read**](SubscriptionProductRetirementServiceApi.md#read) | **GET** /subscription-product-retirement/read | Read
[**search**](SubscriptionProductRetirementServiceApi.md#search) | **POST** /subscription-product-retirement/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductRetirementServiceApi;


SubscriptionProductRetirementServiceApi apiInstance = new SubscriptionProductRetirementServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductRetirementServiceApi#count");
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
> SubscriptionProductRetirement create(spaceId, retirement)

Create

The create operation creates a new product retirement.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductRetirementServiceApi;


SubscriptionProductRetirementServiceApi apiInstance = new SubscriptionProductRetirementServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionProductRetirementCreate retirement = new SubscriptionProductRetirementCreate(); // SubscriptionProductRetirementCreate | 
try {
    SubscriptionProductRetirement result = apiInstance.create(spaceId, retirement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductRetirementServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **retirement** | [**SubscriptionProductRetirementCreate**](SubscriptionProductRetirementCreate.md)|  |

### Return type

[**SubscriptionProductRetirement**](SubscriptionProductRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="read"></a>
# **read**
> SubscriptionProductRetirement read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductRetirementServiceApi;


SubscriptionProductRetirementServiceApi apiInstance = new SubscriptionProductRetirementServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the retirement which should be returned.
try {
    SubscriptionProductRetirement result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductRetirementServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the retirement which should be returned. |

### Return type

[**SubscriptionProductRetirement**](SubscriptionProductRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionProductRetirement&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionProductRetirementServiceApi;


SubscriptionProductRetirementServiceApi apiInstance = new SubscriptionProductRetirementServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the product retirements which are returned by the search.
try {
    List<SubscriptionProductRetirement> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionProductRetirementServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the product retirements which are returned by the search. |

### Return type

[**List&lt;SubscriptionProductRetirement&gt;**](SubscriptionProductRetirement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

