# InstallmentPlanCalculationServiceApi

All URIs are relative to *https://app-wallee.com:443/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculatePlans**](InstallmentPlanCalculationServiceApi.md#calculatePlans) | **POST** /installment-plan-calculation/calculatePlans | Calculate Plans


<a name="calculatePlans"></a>
# **calculatePlans**
> List&lt;InstallmentCalculatedPlan&gt; calculatePlans(spaceId, transactionId)

Calculate Plans

This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.

### Example
```java
// Import classes:
//import com.wallee.sdk.ApiException;
//import com.wallee.sdk.api.InstallmentPlanCalculationServiceApi;


InstallmentPlanCalculationServiceApi apiInstance = new InstallmentPlanCalculationServiceApi();
Long spaceId = 789L; // Long | 
Long transactionId = 789L; // Long | The transaction for which the plans should be calculated for.
try {
    List<InstallmentCalculatedPlan> result = apiInstance.calculatePlans(spaceId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentPlanCalculationServiceApi#calculatePlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **Long**|  |
 **transactionId** | **Long**| The transaction for which the plans should be calculated for. |

### Return type

[**List&lt;InstallmentCalculatedPlan&gt;**](InstallmentCalculatedPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: Not defined

