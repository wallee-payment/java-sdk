
# PaymentMethodConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataCollectionType** | [**DataCollectionType**](DataCollectionType.md) | The data collection type determines who is collecting the payment information. This can be done either by the processor (offsite) or by our application (onsite). |  [optional]
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The payment method configuration description can be used to show a text during the payment process. Choose an appropriate description as it will be displayed to your customer. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**imageResourcePath** | [**ResourcePath**](ResourcePath.md) | The image of the payment method configuration overrides the default image of the payment method. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The payment method configuration name is used internally to identify the payment method configuration. For example the name is used within search fields and hence it should be distinct and descriptive. |  [optional]
**oneClickPaymentMode** | [**OneClickPaymentMode**](OneClickPaymentMode.md) | When the buyer is present on the payment page or within the iFrame the payment details can be stored automatically. The buyer will be able to use the stored payment details for subsequent transactions. When the transaction already contains a token one-click payments are disabled anyway |  [optional]
**paymentMethod** | **Long** |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**sortOrder** | **Integer** | The sort order of the payment method determines the ordering of the methods shown to the user during the payment process. |  [optional]
**spaceId** | **Long** |  |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**title** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The title of the payment method configuration is used within the payment process. The title is visible to the customer. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



