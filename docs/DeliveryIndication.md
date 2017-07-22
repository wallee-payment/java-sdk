
# DeliveryIndication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automaticDecisionReason** | [**DeliveryIndicationDecisionReason**](DeliveryIndicationDecisionReason.md) |  |  [optional]
**automaticallyDecidedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**manualDecisionTimeoutOn** | [**DateTime**](DateTime.md) |  |  [optional]
**manuallyDecidedBy** | **Long** |  |  [optional]
**manuallyDecidedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**state** | [**DeliveryIndicationState**](DeliveryIndicationState.md) |  |  [optional]
**timeoutOn** | [**DateTime**](DateTime.md) |  |  [optional]
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]



