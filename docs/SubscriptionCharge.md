
# SubscriptionCharge

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**discardedBy** | **Long** |  |  [optional]
**discardedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**externalId** | **String** | The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity. |  [optional]
**failedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**failedUrl** | **String** | The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**ledgerEntries** | [**List&lt;SubscriptionLedgerEntry&gt;**](SubscriptionLedgerEntry.md) |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedExecutionDate** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**processingType** | [**SubscriptionChargeProcessingType**](SubscriptionChargeProcessingType.md) |  |  [optional]
**reference** | **String** |  |  [optional]
**state** | [**SubscriptionChargeState**](SubscriptionChargeState.md) |  |  [optional]
**subscription** | [**Subscription**](Subscription.md) | The field subscription indicates the subscription to which the charge belongs to. |  [optional]
**succeedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**successUrl** | **String** | The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed. |  [optional]
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**type** | [**SubscriptionChargeType**](SubscriptionChargeType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



