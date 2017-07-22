
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**initializedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**language** | **String** |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**plannedTerminationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**state** | [**SubscriptionState**](SubscriptionState.md) |  |  [optional]
**subscriber** | [**Subscriber**](Subscriber.md) |  |  [optional]
**terminatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**terminatingOn** | [**DateTime**](DateTime.md) |  |  [optional]
**token** | [**Token**](Token.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



