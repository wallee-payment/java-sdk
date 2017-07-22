# CountryServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](CountryServiceApi.md#all) | **GET** /country/all | All


<a name="all"></a>
# **all**
> List&lt;RestCountry&gt; all()

All

This operation returns all countries.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.CountryServiceApi;


CountryServiceApi apiInstance = new CountryServiceApi();
try {
    List<RestCountry> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RestCountry&gt;**](RestCountry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

