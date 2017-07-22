
# SubscriptionSuspension

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**effectiveEndDate** | [**DateTime**](DateTime.md) |  |  [optional]
**endAction** | [**SubscriptionSuspensionAction**](SubscriptionSuspensionAction.md) | When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**language** | **String** |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**note** | **String** | The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber. |  [optional]
**periodBill** | **Long** |  |  [optional]
**plannedEndDate** | [**DateTime**](DateTime.md) | The planned end date of the suspension identifies the date on which the suspension will be ended automatically. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**reason** | [**SubscriptionSuspensionReason**](SubscriptionSuspensionReason.md) | The suspension reason indicates why a suspension has been created. |  [optional]
**state** | [**SubscriptionSuspensionState**](SubscriptionSuspensionState.md) |  |  [optional]
**subscription** | **Long** |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



