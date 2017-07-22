
# SubscriptionMetric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**type** | [**SubscriptionMetricType**](SubscriptionMetricType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



