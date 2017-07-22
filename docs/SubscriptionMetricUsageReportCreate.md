
# SubscriptionMetricUsageReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumedUnits** | [**BigDecimal**](BigDecimal.md) | The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle. | 
**description** | **String** | The metric usage report description describe the reported usage. This description may be shown to the end user. |  [optional]
**externalId** | **String** | The external id identifies the metric usage uniquely. | 
**metric** | **Long** | The metric usage report is linked to the metric for which the usage should be recorded. | 
**subscription** | **Long** | The subscription to which the usage is added to. | 



