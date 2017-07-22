
# Subscriber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalAllowedPaymentMethodConfigurations** | **List&lt;Long&gt;** | Those payment methods which are allowed additionally will be available even when the product does not allow those methods. |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**description** | **String** | The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber. |  [optional]
**disallowedPaymentMethodConfigurations** | **List&lt;Long&gt;** | Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods. |  [optional]
**emailAddress** | **String** | The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address. |  [optional]
**externalId** | **String** | The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**language** | **String** | The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices). |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**reference** | **String** | The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id). |  [optional]
**shippingAddress** | [**Address**](Address.md) |  |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



