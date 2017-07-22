# PaymentMethodServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](PaymentMethodServiceApi.md#all) | **GET** /payment-method/all | All
[**read**](PaymentMethodServiceApi.md#read) | **GET** /payment-method/read | Read


<a name="all"></a>
# **all**
> List&lt;PaymentMethod&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentMethodServiceApi;


PaymentMethodServiceApi apiInstance = new PaymentMethodServiceApi();
try {
    List<PaymentMethod> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PaymentMethod&gt;**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> PaymentMethod read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PaymentMethodServiceApi;


PaymentMethodServiceApi apiInstance = new PaymentMethodServiceApi();
Long id = 789L; // Long | The id of the payment method which should be returned.
try {
    PaymentMethod result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the payment method which should be returned. |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

