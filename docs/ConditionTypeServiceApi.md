# ConditionTypeServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](ConditionTypeServiceApi.md#all) | **GET** /condition-type/all | All
[**read**](ConditionTypeServiceApi.md#read) | **GET** /condition-type/read | Read


<a name="all"></a>
# **all**
> List&lt;ConditionType&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ConditionTypeServiceApi;


ConditionTypeServiceApi apiInstance = new ConditionTypeServiceApi();
try {
    List<ConditionType> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConditionTypeServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ConditionType&gt;**](ConditionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> ConditionType read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.ConditionTypeServiceApi;


ConditionTypeServiceApi apiInstance = new ConditionTypeServiceApi();
Long id = 789L; // Long | The id of the condition type which should be returned.
try {
    ConditionType result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConditionTypeServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the condition type which should be returned. |

### Return type

[**ConditionType**](ConditionType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

