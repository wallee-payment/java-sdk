# InstallmentPaymentServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](InstallmentPaymentServiceApi.md#count) | **POST** /installment-payment/count | Count
[**createInstallmentPayment**](InstallmentPaymentServiceApi.md#createInstallmentPayment) | **POST** /installment-payment/createInstallmentPayment | Create Installment Payment
[**read**](InstallmentPaymentServiceApi.md#read) | **GET** /installment-payment/read | Read
[**search**](InstallmentPaymentServiceApi.md#search) | **POST** /installment-payment/search | Search


<a name="count"></a>
# **count**
> Long count(spaceId, filter)

Count

Counts the number of items in the database as restricted by the given filter.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentServiceApi;


InstallmentPaymentServiceApi apiInstance = new InstallmentPaymentServiceApi();
Long spaceId = 789L; // Long | 
EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the installment payment which are used to calculate the count.
try {
    Long result = apiInstance.count(spaceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentServiceApi#count");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **filter** | [**EntityQueryFilter**](EntityQueryFilter.md)| The filter which restricts the installment payment which are used to calculate the count. |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createInstallmentPayment"></a>
# **createInstallmentPayment**
> InstallmentPayment createInstallmentPayment(spaceId, transactionId, installmentPlanConfiguration)

Create Installment Payment

This operation creates based up on the given transaction an installment payment.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentServiceApi;


InstallmentPaymentServiceApi apiInstance = new InstallmentPaymentServiceApi();
Long spaceId = 789L; // Long | 
Long transactionId = 789L; // Long | The transaction which should be converted into an installment payment.
Long installmentPlanConfiguration = 789L; // Long | The installment plan configuration ID which should be applied on the transaction.
try {
    InstallmentPayment result = apiInstance.createInstallmentPayment(spaceId, transactionId, installmentPlanConfiguration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentServiceApi#createInstallmentPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **transactionId** | **Long**| The transaction which should be converted into an installment payment. |
 **installmentPlanConfiguration** | **Long**| The installment plan configuration ID which should be applied on the transaction. |

### Return type

[**InstallmentPayment**](InstallmentPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

<a name="read"></a>
# **read**
> InstallmentPayment read(spaceId, id)

Read

Reads the entity with the given &#39;id&#39; and returns it.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentServiceApi;


InstallmentPaymentServiceApi apiInstance = new InstallmentPaymentServiceApi();
Long spaceId = 789L; // Long | 
Long id = 789L; // Long | The id of the installment payment which should be returned.
try {
    InstallmentPayment result = apiInstance.read(spaceId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentServiceApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **id** | **Long**| The id of the installment payment which should be returned. |

### Return type

[**InstallmentPayment**](InstallmentPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: *_/_*

<a name="search"></a>
# **search**
> List&lt;InstallmentPayment&gt; search(spaceId, query)

Search

Searches for the entities as specified by the given query.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPaymentServiceApi;


InstallmentPaymentServiceApi apiInstance = new InstallmentPaymentServiceApi();
Long spaceId = 789L; // Long | 
EntityQuery query = new EntityQuery(); // EntityQuery | The query restricts the installment payments which are returned by the search.
try {
    List<InstallmentPayment> result = apiInstance.search(spaceId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPaymentServiceApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **query** | [**EntityQuery**](EntityQuery.md)| The query restricts the installment payments which are returned by the search. |

### Return type

[**List&lt;InstallmentPayment&gt;**](InstallmentPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

