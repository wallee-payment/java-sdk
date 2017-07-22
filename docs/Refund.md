
# Refund

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**baseLineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional]
**createdBy** | **Long** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**externalId** | **String** | The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction. |  [optional]
**failedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional]
**language** | **String** |  |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**merchantReference** | **String** |  |  [optional]
**nextUpdateOn** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**processorReference** | **String** |  |  [optional]
**reducedLineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional]
**reductions** | [**List&lt;LineItemReduction&gt;**](LineItemReduction.md) |  |  [optional]
**state** | [**RefundState**](RefundState.md) |  |  [optional]
**succeededOn** | [**DateTime**](DateTime.md) |  |  [optional]
**taxes** | [**List&lt;Tax&gt;**](Tax.md) |  |  [optional]
**timeoutOn** | [**DateTime**](DateTime.md) |  |  [optional]
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**type** | [**RefundType**](RefundType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



