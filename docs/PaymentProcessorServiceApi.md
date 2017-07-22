# PaymentProcessorServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](PaymentProcessorServiceApi.md#all) | **GET** /payment-processor/all | All
[**read**](PaymentProcessorServiceApi.md#read) | **GET** /payment-processor/read | Read


<a name="all"></a>
# **all**
> List&lt;PaymentProcessor&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentProcessorServiceApi;


PaymentProcessorServiceApi apiInstance = new PaymentProcessorServiceApi();
try {
    List<PaymentProcessor> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentProcessorServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PaymentProcessor&gt;**](PaymentProcessor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> PaymentProcessor read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentProcessorServiceApi;


PaymentProcessorServiceApi apiInstance = new PaymentProcessorServiceApi();
Long id = 789L; // Long | The id of the processor which should be returned.
try {
    PaymentProcessor result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentProcessorServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the processor which should be returned. |

### Return type

[**PaymentProcessor**](PaymentProcessor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

