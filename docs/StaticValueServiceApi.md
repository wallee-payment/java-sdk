# StaticValueServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**all**](StaticValueServiceApi.md#all) | **GET** /static-value-service/all | All
[**read**](StaticValueServiceApi.md#read) | **GET** /static-value-service/read | Read


<a name="all"></a>
# **all**
> List&lt;StaticValue&gt; all()

All

This operation returns all entities which are available.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.StaticValueServiceApi;


StaticValueServiceApi apiInstance = new StaticValueServiceApi();
try {
    List<StaticValue> result = apiInstance.all();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticValueServiceApi#all");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StaticValue&gt;**](StaticValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="read"></a>
# **read**
> StaticValue read(id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.StaticValueServiceApi;


StaticValueServiceApi apiInstance = new StaticValueServiceApi();
Long id = 789L; // Long | The id of the static value which should be returned.
try {
    StaticValue result = apiInstance.read(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticValueServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The id of the static value which should be returned. |

### Return type

[**StaticValue**](StaticValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

