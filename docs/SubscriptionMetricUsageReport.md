
# SubscriptionMetricUsageReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumedUnits** | [**BigDecimal**](BigDecimal.md) | The consumed units describe the amount of resources consumed. Those consumed units will be billed in the next billing cycle. |  [optional]
**createdByUserId** | **Long** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**description** | **String** | The metric usage report description describe the reported usage. This description may be shown to the end user. |  [optional]
**externalId** | **String** | The external id identifies the metric usage uniquely. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**metric** | **Long** | The metric usage report is linked to the metric for which the usage should be recorded. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**subscription** | **Long** | The subscription to which the usage is added to. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



