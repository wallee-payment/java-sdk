
# ProductPeriodFee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | [**SubscriptionProductComponent**](SubscriptionProductComponent.md) |  |  [optional]
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**numberOfFreeTrialPeriods** | **Integer** | The number of free trial periods specify how many periods are free of charge at the begining of the subscription. |  [optional]
**periodFee** | [**List&lt;PersistableCurrencyAmount&gt;**](PersistableCurrencyAmount.md) | The period fee is charged for every period of the subscription except for those periods which are trial periods. |  [optional]
**type** | [**ProductFeeType**](ProductFeeType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



