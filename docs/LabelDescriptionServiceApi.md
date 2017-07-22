# LabelDescriptionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](LabelDescriptionServiceApi.md#all) | **GET** /label-description-service/all | All
[**read**](LabelDescriptionServiceApi.md#read) | **GET** /label-description-service/read | Read


<a name="all"></a>
# **all**
> List&lt;LabelDescriptor&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.LabelDescriptionServiceApi;


LabelDescriptionServiceApi apiInstance = new LabelDescriptionServiceApi();
try {
    List<LabelDescriptor> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelDescriptionServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LabelDescriptor&gt;**](LabelDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> LabelDescriptor read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.LabelDescriptionServiceApi;


LabelDescriptionServiceApi apiInstance = new LabelDescriptionServiceApi();
Long id = 789L; // Long | The id of the label descriptor which should be returned.
try {
    LabelDescriptor result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelDescriptionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the label descriptor which should be returned. |

### Return type

[**LabelDescriptor**](LabelDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

