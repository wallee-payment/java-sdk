# DocumentTemplateTypeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](DocumentTemplateTypeServiceApi.md#all) | **GET** /document-template-type/all | All
[**read**](DocumentTemplateTypeServiceApi.md#read) | **GET** /document-template-type/read | Read


<a name="all"></a>
# **all**
> List&lt;DocumentTemplateType&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DocumentTemplateTypeServiceApi;


DocumentTemplateTypeServiceApi apiInstance = new DocumentTemplateTypeServiceApi();
try {
    List<DocumentTemplateType> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentTemplateTypeServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DocumentTemplateType&gt;**](DocumentTemplateType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> DocumentTemplateType read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.DocumentTemplateTypeServiceApi;


DocumentTemplateTypeServiceApi apiInstance = new DocumentTemplateTypeServiceApi();
Long id = 789L; // Long | The id of the document template type which should be returned.
try {
    DocumentTemplateType result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentTemplateTypeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the document template type which should be returned. |

### Return type

[**DocumentTemplateType**](DocumentTemplateType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

