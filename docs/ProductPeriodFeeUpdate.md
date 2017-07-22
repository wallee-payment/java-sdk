
# ProductPeriodFeeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**component** | **Long** |  |  [optional]
**description** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**name** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**numberOfFreeTrialPeriods** | **Integer** | The number of free trial periods specify how many periods are free of charge at the begining of the subscription. |  [optional]
**periodFee** | [**List&lt;PersistableCurrencyAmountUpdate&gt;**](PersistableCurrencyAmountUpdate.md) | The period fee is charged for every period of the subscription except for those periods which are trial periods. |  [optional]



