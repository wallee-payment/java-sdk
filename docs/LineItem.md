
# LineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregatedTaxRate** | [**BigDecimal**](BigDecimal.md) | The aggregated tax rate is the sum of all tax rates of the line item. |  [optional]
**amountExcludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountIncludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**attributes** | [**Map&lt;String, LineItemAttribute&gt;**](LineItemAttribute.md) |  |  [optional]
**name** | **String** |  |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**shippingRequired** | **Boolean** |  |  [optional]
**sku** | **String** |  |  [optional]
**taxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**taxAmountPerUnit** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**taxes** | [**List&lt;Tax&gt;**](Tax.md) |  |  [optional]
**type** | [**LineItemType**](LineItemType.md) |  |  [optional]
**uniqueId** | **String** | The unique id identifies the line item within the set of line items associated with the transaction. |  [optional]
**unitPriceExcludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**unitPriceIncludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]



