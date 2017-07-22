
# ProductMeteredTierFeeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**fee** | [**List&lt;PersistableCurrencyAmountUpdate&gt;**](PersistableCurrencyAmountUpdate.md) | The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period. |  [optional]
**meteredFee** | **Long** |  |  [optional]
**startRange** | [**BigDecimal**](BigDecimal.md) | The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied. |  [optional]



