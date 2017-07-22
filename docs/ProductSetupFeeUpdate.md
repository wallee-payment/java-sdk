
# ProductSetupFeeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**component** | **Long** |  |  [optional]
**description** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**name** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**onDowngradeCreditedAmount** | [**List&lt;PersistableCurrencyAmountUpdate&gt;**](PersistableCurrencyAmountUpdate.md) | When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber. |  [optional]
**onUpgradeCreditedAmount** | [**List&lt;PersistableCurrencyAmountUpdate&gt;**](PersistableCurrencyAmountUpdate.md) | When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber. |  [optional]
**setupFee** | [**List&lt;PersistableCurrencyAmountUpdate&gt;**](PersistableCurrencyAmountUpdate.md) | The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions. |  [optional]



