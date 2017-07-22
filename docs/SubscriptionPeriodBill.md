
# SubscriptionPeriodBill

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**effectivePeriodEndDate** | [**DateTime**](DateTime.md) |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**language** | **String** |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**periodStartDate** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPeriodEndDate** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**state** | [**SubscriptionPeriodBillState**](SubscriptionPeriodBillState.md) |  |  [optional]
**subscriptionVersion** | [**SubscriptionVersion**](SubscriptionVersion.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



