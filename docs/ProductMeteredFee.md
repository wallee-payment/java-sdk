
# ProductMeteredFee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | [**SubscriptionProductComponent**](SubscriptionProductComponent.md) |  |  [optional]
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**metric** | [**SubscriptionMetric**](SubscriptionMetric.md) |  |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The name of the fee should describe for the subscriber in few words for what the fee is for. |  [optional]
**tierPricing** | [**ProductMeteredTierPricing**](ProductMeteredTierPricing.md) | The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation. |  [optional]
**type** | [**ProductFeeType**](ProductFeeType.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



