# LanguageServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](LanguageServiceApi.md#all) | **GET** /language/all | All


<a name="all"></a>
# **all**
> List&lt;RestLanguage&gt; all()

All

This operation returns all languages.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.LanguageServiceApi;


LanguageServiceApi apiInstance = new LanguageServiceApi();
try {
    List<RestLanguage> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RestLanguage&gt;**](RestLanguage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

