
# SubscriptionProductVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**billingCycle** | **String** | The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm. |  [optional]
**comment** | **String** | The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber. |  [optional]
**createdOn** | [**DateTime**](DateTime.md) |  |  [optional]
**defaultCurrency** | **String** | The default currency has to be used in all fees. |  [optional]
**enabledCurrencies** | **List&lt;String&gt;** | The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**incrementNumber** | **Integer** | The increment number represents the version number incremented whenever a new version is activated. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**minimalNumberOfPeriods** | **Integer** | The minimal number of periods determines how long the subscription has to run before the subscription can be terminated. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product. |  [optional]
**numberOfNoticePeriods** | **Integer** | The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period. |  [optional]
**obsoletedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**product** | [**SubscriptionProduct**](SubscriptionProduct.md) | Each product version is linked to a product. |  [optional]
**reference** | **String** | The product version reference helps to identify the version. The reference is generated out of the product reference. |  [optional]
**retiringFinishedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**retiringStartedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**state** | [**SubscriptionProductVersionState**](SubscriptionProductVersionState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



