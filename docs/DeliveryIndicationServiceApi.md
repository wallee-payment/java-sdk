# DeliveryIndicationServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](DeliveryIndicationServiceApi.md#count) | **POST** /delivery-indication/count | Count
[**markAsNotSuitable**](DeliveryIndicationServiceApi.md#markAsNotSuitable) | **POST** /delivery-indication/markAsNotSuitable | markAsNotSuitable
[**markAsSuitable**](DeliveryIndicationServiceApi.md#markAsSuitable) | **POST** /delivery-indication/markAsSuitable | markAsSuitable
[**read**](DeliveryIndicationServiceApi.md#read) | **GET** /delivery-indication/read | Read
[**search**](DeliveryIndicationServiceApi.md#search) | **POST** /delivery-indication/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DeliveryIndicationServiceApi;


DeliveryIndicationServiceApi apiInstance = new DeliveryIndicationServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIndicationServiceApi#count");
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

<a name="markAsNotSuitable"></a>
# **markAsNotSuitable**
> DeliveryIndication markAsNotSuitable(spaceId, deliveryIndicationId)

markAsNotSuitable

This operation marks the delivery indication as not suitable.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DeliveryIndicationServiceApi;


DeliveryIndicationServiceApi apiInstance = new DeliveryIndicationServiceApi();
Long spaceId = 789L; // Long | 
Long deliveryIndicationId = 789L; // Long | The delivery indication id which should be marked as not suitable.
try {
    DeliveryIndication result = apiInstance.markAsNotSuitable(spaceId, deliveryIndicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIndicationServiceApi#markAsNotSuitable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **deliveryIndicationId** | **Long**| The delivery indication id which should be marked as not suitable. |

### Return type

[**DeliveryIndication**](DeliveryIndication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="markAsSuitable"></a>
# **markAsSuitable**
> DeliveryIndication markAsSuitable(spaceId, deliveryIndicationId)

markAsSuitable

This operation marks the delivery indication as suitable.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DeliveryIndicationServiceApi;


DeliveryIndicationServiceApi apiInstance = new DeliveryIndicationServiceApi();
Long spaceId = 789L; // Long | 
Long deliveryIndicationId = 789L; // Long | The delivery indication id which should be marked as suitable.
try {
    DeliveryIndication result = apiInstance.markAsSuitable(spaceId, deliveryIndicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIndicationServiceApi#markAsSuitable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **deliveryIndicationId** | **Long**| The delivery indication id which should be marked as suitable. |

### Return type

[**DeliveryIndication**](DeliveryIndication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> DeliveryIndication read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DeliveryIndicationServiceApi;


DeliveryIndicationServiceApi apiInstance = new DeliveryIndicationServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the delivery indication which should be returned.
try {
    DeliveryIndication result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIndicationServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the delivery indication which should be returned. |

### Return type

[**DeliveryIndication**](DeliveryIndication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;DeliveryIndication&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DeliveryIndicationServiceApi;


DeliveryIndicationServiceApi apiInstance = new DeliveryIndicationServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the delivery indications which are returned by the search.
try {
    List<DeliveryIndication> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryIndicationServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the delivery indications which are returned by the search. |

### Return type

[**List&lt;DeliveryIndication&gt;**](DeliveryIndication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

