
# TransactionInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**completion** | [**TransactionCompletion**](TransactionCompletion.md) |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The date on which the invoice is created on. |  [optional]
**derecognizedOn** | [**DateTime**](DateTime.md) | The date on which the invoice is marked as derecognized. |  [optional]
**dueOn** | [**DateTime**](DateTime.md) | The date on which the invoice should be paid on. |  [optional]
**externalId** | **String** |  |  [optional]
**language** | **String** |  |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) |  |  [optional]
**merchantReference** | **String** |  |  [optional]
**outstandingAmount** | [**BigDecimal**](BigDecimal.md) | The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid. |  [optional]
**paidOn** | [**DateTime**](DateTime.md) | The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**spaceViewId** | **Long** |  |  [optional]
**state** | [**TransactionInvoiceState**](TransactionInvoiceState.md) |  |  [optional]
**taxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



