# PermissionServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](PermissionServiceApi.md#all) | **GET** /permission/all | All
[**read**](PermissionServiceApi.md#read) | **GET** /permission/read | Read


<a name="all"></a>
# **all**
> List&lt;Permission&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PermissionServiceApi;


PermissionServiceApi apiInstance = new PermissionServiceApi();
try {
    List<Permission> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> Permission read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.PermissionServiceApi;


PermissionServiceApi apiInstance = new PermissionServiceApi();
Long id = 789L; // Long | The id of the permission which should be returned.
try {
    Permission result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the permission which should be returned. |

### Return type

[**Permission**](Permission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

