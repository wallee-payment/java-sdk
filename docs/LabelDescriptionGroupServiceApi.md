# LabelDescriptionGroupServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](LabelDescriptionGroupServiceApi.md#all) | **GET** /label-description-group-service/all | All
[**read**](LabelDescriptionGroupServiceApi.md#read) | **GET** /label-description-group-service/read | Read


<a name="all"></a>
# **all**
> List&lt;LabelDescriptorGroup&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.LabelDescriptionGroupServiceApi;


LabelDescriptionGroupServiceApi apiInstance = new LabelDescriptionGroupServiceApi();
try {
    List<LabelDescriptorGroup> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelDescriptionGroupServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LabelDescriptorGroup&gt;**](LabelDescriptorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> LabelDescriptorGroup read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.LabelDescriptionGroupServiceApi;


LabelDescriptionGroupServiceApi apiInstance = new LabelDescriptionGroupServiceApi();
Long id = 789L; // Long | The id of the label descriptor group which should be returned.
try {
    LabelDescriptorGroup result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelDescriptionGroupServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the label descriptor group which should be returned. |

### Return type

[**LabelDescriptorGroup**](LabelDescriptorGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

