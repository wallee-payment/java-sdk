# SubscriptionChargeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](SubscriptionChargeServiceApi.md#count) | **POST** /subscription-charge/count | Count
[**create**](SubscriptionChargeServiceApi.md#create) | **POST** /subscription-charge/create | Create
[**discard**](SubscriptionChargeServiceApi.md#discard) | **POST** /subscription-charge/discard | discard
[**read**](SubscriptionChargeServiceApi.md#read) | **GET** /subscription-charge/read | Read
[**search**](SubscriptionChargeServiceApi.md#search) | **POST** /subscription-charge/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionChargeServiceApi;


SubscriptionChargeServiceApi apiInstance = new SubscriptionChargeServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionChargeServiceApi#count");
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
> SubscriptionCharge create(spaceId, charge)

Create

The create operation creates a new subscription charge.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionChargeServiceApi;


SubscriptionChargeServiceApi apiInstance = new SubscriptionChargeServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionChargeCreate charge = new SubscriptionChargeCreate(); // SubscriptionChargeCreate | 
try {
    SubscriptionCharge result = apiInstance.create(spaceId, charge);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionChargeServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **charge** | [**SubscriptionChargeCreate**](SubscriptionChargeCreate.md)|  |

### Return type

[**SubscriptionCharge**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="discard"></a>
# **discard**
> SubscriptionCharge discard(spaceId, chargeId)

discard

This operation allows to discard a scheduled charge.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionChargeServiceApi;


SubscriptionChargeServiceApi apiInstance = new SubscriptionChargeServiceApi();
Long spaceId = 789L; // Long | 
Long chargeId = 789L; // Long | 
try {
    SubscriptionCharge result = apiInstance.discard(spaceId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionChargeServiceApi#discard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **chargeId** | **Long**|  |

### Return type

[**SubscriptionCharge**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> SubscriptionCharge read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionChargeServiceApi;


SubscriptionChargeServiceApi apiInstance = new SubscriptionChargeServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the subscription charge which should be returned.
try {
    SubscriptionCharge result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionChargeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the subscription charge which should be returned. |

### Return type

[**SubscriptionCharge**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;SubscriptionCharge&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionChargeServiceApi;


SubscriptionChargeServiceApi apiInstance = new SubscriptionChargeServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the subscription charges which are returned by the search.
try {
    List<SubscriptionCharge> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionChargeServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the subscription charges which are returned by the search. |

### Return type

[**List&lt;SubscriptionCharge&gt;**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

