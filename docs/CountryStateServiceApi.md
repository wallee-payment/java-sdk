# CountryStateServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](CountryStateServiceApi.md#all) | **GET** /country-state/all | All
[**country**](CountryStateServiceApi.md#country) | **GET** /country-state/country | Find by Country


<a name="all"></a>
# **all**
> List&lt;RestCountryState&gt; all()

All

This operation returns all states of all countries.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.CountryStateServiceApi;


CountryStateServiceApi apiInstance = new CountryStateServiceApi();
try {
    List<RestCountryState> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryStateServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RestCountryState&gt;**](RestCountryState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="country"></a>
# **country**
> List&lt;RestCountryState&gt; country(code)

Find by Country

This operation returns all states for a given country.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.CountryStateServiceApi;


CountryStateServiceApi apiInstance = new CountryStateServiceApi();
String code = "code_example"; // String | The country code in ISO code two letter format for which all states should be returned.
try {
    List<RestCountryState> result = apiInstance.country(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountryStateServiceApi#country");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The country code in ISO code two letter format for which all states should be returned. |

### Return type

[**List&lt;RestCountryState&gt;**](RestCountryState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

