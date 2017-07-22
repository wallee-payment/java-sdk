
# ProductMeteredFeeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**component** | **Long** |  |  [optional]
**description** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**metric** | **Long** |  |  [optional]
**name** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**tierPricing** | [**ProductMeteredTierPricing**](ProductMeteredTierPricing.md) | The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation. |  [optional]



