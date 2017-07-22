# SubscriptionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyChanges**](SubscriptionServiceApi.md#applyChanges) | **POST** /subscription/applyChanges | apply changes
[**count**](SubscriptionServiceApi.md#count) | **POST** /subscription/count | Count
[**create**](SubscriptionServiceApi.md#create) | **POST** /subscription/create | Create
[**initialize**](SubscriptionServiceApi.md#initialize) | **POST** /subscription/initialize | initialize
[**initializeSubscriberPresent**](SubscriptionServiceApi.md#initializeSubscriberPresent) | **POST** /subscription/initializeSubscriberPresent | initializeSubscriberPresent
[**read**](SubscriptionServiceApi.md#read) | **GET** /subscription/read | Read
[**search**](SubscriptionServiceApi.md#search) | **POST** /subscription/search | Search
[**terminate**](SubscriptionServiceApi.md#terminate) | **POST** /subscription/terminate | terminate
[**updateProductVersion**](SubscriptionServiceApi.md#updateProductVersion) | **POST** /subscription/updateProductVersion | update product version


<a name="applyChanges"></a>
# **applyChanges**
> SubscriptionVersion applyChanges(spaceId, request)

apply changes

This operation allows to apply changes on a subscription.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionChangeRequest request = new SubscriptionChangeRequest(); // SubscriptionChangeRequest | 
try {
    SubscriptionVersion result = apiInstance.applyChanges(spaceId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#applyChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **request** | [**SubscriptionChangeRequest**](SubscriptionChangeRequest.md)|  |

### Return type

[**SubscriptionVersion**](SubscriptionVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#count");
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
> SubscriptionVersion create(spaceId, createRequest)

Create

The create operation creates a new subscription and a corresponding subscription version.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
SubscriptionCreateRequest createRequest = new SubscriptionCreateRequest(); // SubscriptionCreateRequest | 
try {
    SubscriptionVersion result = apiInstance.create(spaceId, createRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **createRequest** | [**SubscriptionCreateRequest**](SubscriptionCreateRequest.md)|  |

### Return type

[**SubscriptionVersion**](SubscriptionVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="initialize"></a>
# **initialize**
> SubscriptionCharge initialize(spaceId, subscriptionId)

initialize

The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
Long subscriptionId = 789L; // Long | The provided subscription id will be used to lookup the subscription which should be initialized.
try {
    SubscriptionCharge result = apiInstance.initialize(spaceId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#initialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **subscriptionId** | **Long**| The provided subscription id will be used to lookup the subscription which should be initialized. |

### Return type

[**SubscriptionCharge**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="initializeSubscriberPresent"></a>
# **initializeSubscriberPresent**
> SubscriptionCharge initializeSubscriberPresent(spaceId, subscriptionId, successUrl, failedUrl)

initializeSubscriberPresent

The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
Long subscriptionId = 789L; // Long | 
String successUrl = "successUrl_example"; // String | The subscriber will be redirected to the success URL when the transaction is successful.
String failedUrl = "failedUrl_example"; // String | The subscriber will be redirected to the fail URL when the transaction fails.
try {
    SubscriptionCharge result = apiInstance.initializeSubscriberPresent(spaceId, subscriptionId, successUrl, failedUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#initializeSubscriberPresent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **subscriptionId** | **Long**|  |
 **successUrl** | **String**| The subscriber will be redirected to the success URL when the transaction is successful. | [optional]
 **failedUrl** | **String**| The subscriber will be redirected to the fail URL when the transaction fails. | [optional]

### Return type

[**SubscriptionCharge**](SubscriptionCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> Subscription read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the subscription which should be returned.
try {
    Subscription result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the subscription which should be returned. |

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;Subscription&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the subscriptions which are returned by the search.
try {
    List<Subscription> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the subscriptions which are returned by the search. |

### Return type

[**List&lt;Subscription&gt;**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="terminate"></a>
# **terminate**
> terminate(spaceId, subscriptionId, respectTerminationPeriod)

terminate

This operation allows to terminate a subscription.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
Long subscriptionId = 789L; // Long | The subscription id identifies the subscription which should be terminated.
Boolean respectTerminationPeriod = true; // Boolean | The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
try {
    apiInstance.terminate(spaceId, subscriptionId, respectTerminationPeriod);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#terminate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **subscriptionId** | **Long**| The subscription id identifies the subscription which should be terminated. |
 **respectTerminationPeriod** | **Boolean**| The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="updateProductVersion"></a>
# **updateProductVersion**
> SubscriptionVersion updateProductVersion(spaceId, subscriptionId, respectTerminationPeriod)

update product version

The update product version operation updates the product version of the subscription to the latest active product version.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.SubscriptionServiceApi;


SubscriptionServiceApi apiInstance = new SubscriptionServiceApi();
Long spaceId = 789L; // Long | 
Long subscriptionId = 789L; // Long | The subscription id identifies the subscription which should be updated to the latest version.
Boolean respectTerminationPeriod = true; // Boolean | The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
try {
    SubscriptionVersion result = apiInstance.updateProductVersion(spaceId, subscriptionId, respectTerminationPeriod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionServiceApi#updateProductVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **subscriptionId** | **Long**| The subscription id identifies the subscription which should be updated to the latest version. |
 **respectTerminationPeriod** | **Boolean**| The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. |

### Return type

[**SubscriptionVersion**](SubscriptionVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

