
# SubscriptionProductVersionPending

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**billingCycle** | **String** | The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm. |  [optional]
**comment** | **String** | The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber. |  [optional]
**defaultCurrency** | **String** | The default currency has to be used in all fees. |  [optional]
**enabledCurrencies** | **List&lt;String&gt;** | The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees. |  [optional]
**minimalNumberOfPeriods** | **Integer** | The minimal number of periods determines how long the subscription has to run before the subscription can be terminated. |  [optional]
**name** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product. |  [optional]
**numberOfNoticePeriods** | **Integer** | The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period. |  [optional]
**product** | **Long** | Each product version is linked to a product. |  [optional]
**state** | [**SubscriptionProductVersionState**](SubscriptionProductVersionState.md) |  |  [optional]



