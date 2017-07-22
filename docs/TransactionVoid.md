
# TransactionVoid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdBy** | **Long** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**failedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional]
**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional]
**language** | **String** |  |  [optional]
**mode** | [**TransactionVoidMode**](TransactionVoidMode.md) |  |  [optional]
**nextUpdateOn** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**processorReference** | **String** |  |  [optional]
**spaceViewId** | **Long** |  |  [optional]
**state** | [**TransactionVoidState**](TransactionVoidState.md) |  |  [optional]
**succeededOn** | [**DateTime**](DateTime.md) |  |  [optional]
**timeoutOn** | [**DateTime**](DateTime.md) |  |  [optional]
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



