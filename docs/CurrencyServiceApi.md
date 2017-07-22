# CurrencyServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](CurrencyServiceApi.md#all) | **GET** /currency/all | All


<a name="all"></a>
# **all**
> List&lt;RestCurrency&gt; all()

All

This operation returns all currencies.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.CurrencyServiceApi;


CurrencyServiceApi apiInstance = new CurrencyServiceApi();
try {
    List<RestCurrency> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RestCurrency&gt;**](RestCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

