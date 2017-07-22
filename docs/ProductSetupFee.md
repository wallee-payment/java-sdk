
# ProductSetupFee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | [**SubscriptionProductComponent**](SubscriptionProductComponent.md) |  |  [optional]
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**onDowngradeCreditedAmount** | [**List&lt;PersistableCurrencyAmount&gt;**](PersistableCurrencyAmount.md) | When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber. |  [optional]
**onUpgradeCreditedAmount** | [**List&lt;PersistableCurrencyAmount&gt;**](PersistableCurrencyAmount.md) | When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber. |  [optional]
**setupFee** | [**List&lt;PersistableCurrencyAmount&gt;**](PersistableCurrencyAmount.md) | The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions. |  [optional]
**type** | [**ProductFeeType**](ProductFeeType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



