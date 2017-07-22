
# TransactionLineItemVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**createdBy** | **Long** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**language** | **String** |  |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**spaceViewId** | **Long** |  |  [optional]
**taxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**transaction** | [**Transaction**](Transaction.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



