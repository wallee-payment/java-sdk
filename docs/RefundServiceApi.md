# RefundServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](RefundServiceApi.md#count) | **POST** /refund/count | Count
[**fail**](RefundServiceApi.md#fail) | **POST** /refund/fail | fail
[**getRefundDocument**](RefundServiceApi.md#getRefundDocument) | **GET** /refund/getRefundDocument | getRefundDocument
[**read**](RefundServiceApi.md#read) | **GET** /refund/read | Read
[**refund**](RefundServiceApi.md#refund) | **POST** /refund/refund | create
[**search**](RefundServiceApi.md#search) | **POST** /refund/search | Search
[**succeed**](RefundServiceApi.md#succeed) | **POST** /refund/succeed | succeed


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#count");
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

<a name="fail"></a>
# **fail**
> Refund fail(spaceId, refundId)

fail

This operation allows to mark a refund as failed which is in state MANUAL_CHECK.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
Long refundId = 789L; // Long | The id of the refund which should be marked as failed.
try {
    Refund result = apiInstance.fail(spaceId, refundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#fail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **refundId** | **Long**| The id of the refund which should be marked as failed. |

### Return type

[**Refund**](Refund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="getRefundDocument"></a>
# **getRefundDocument**
> RenderedDocument getRefundDocument(spaceId, id)

getRefundDocument

Returns the PDF document for the refund with given id.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the refund to get the document for.
try {
    RenderedDocument result = apiInstance.getRefundDocument(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#getRefundDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the refund to get the document for. |

### Return type

[**RenderedDocument**](RenderedDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> Refund read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the refund which should be returned.
try {
    Refund result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the refund which should be returned. |

### Return type

[**Refund**](Refund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="refund"></a>
# **refund**
> Refund refund(spaceId, refund)

create

This operation creates and executes a refund of a particular transaction.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
RefundCreate refund = new RefundCreate(); // RefundCreate | The refund object which should be created.
try {
    Refund result = apiInstance.refund(spaceId, refund);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#refund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **refund** | [**RefundCreate**](RefundCreate.md)| The refund object which should be created. |

### Return type

[**Refund**](Refund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="search"></a>
# **search**
> List&lt;Refund&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the refunds which are returned by the search.
try {
    List<Refund> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the refunds which are returned by the search. |

### Return type

[**List&lt;Refund&gt;**](Refund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="succeed"></a>
# **succeed**
> Refund succeed(spaceId, refundId)

succeed

This operation allows to mark a refund as successful which is in state MANUAL_CHECK.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.RefundServiceApi;


RefundServiceApi apiInstance = new RefundServiceApi();
Long spaceId = 789L; // Long | 
Long refundId = 789L; // Long | The id of the refund which should be marked as successful.
try {
    Refund result = apiInstance.succeed(spaceId, refundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundServiceApi#succeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **refundId** | **Long**| The id of the refund which should be marked as successful. |

### Return type

[**Refund**](Refund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

