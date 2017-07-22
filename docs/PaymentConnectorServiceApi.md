# PaymentConnectorServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](PaymentConnectorServiceApi.md#all) | **GET** /payment-connector/all | All
[**read**](PaymentConnectorServiceApi.md#read) | **GET** /payment-connector/read | Read


<a name="all"></a>
# **all**
> List&lt;PaymentConnector&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentConnectorServiceApi;


PaymentConnectorServiceApi apiInstance = new PaymentConnectorServiceApi();
try {
    List<PaymentConnector> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentConnectorServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PaymentConnector&gt;**](PaymentConnector.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> PaymentConnector read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentConnectorServiceApi;


PaymentConnectorServiceApi apiInstance = new PaymentConnectorServiceApi();
Long id = 789L; // Long | The id of the connector which should be returned.
try {
    PaymentConnector result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentConnectorServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the connector which should be returned. |

### Return type

[**PaymentConnector**](PaymentConnector.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

