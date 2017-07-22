
# AbstractSubscriberUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalAllowedPaymentMethodConfigurations** | **List&lt;Long&gt;** | Those payment methods which are allowed additionally will be available even when the product does not allow those methods. |  [optional]
**billingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]
**description** | **String** | The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber. |  [optional]
**disallowedPaymentMethodConfigurations** | **List&lt;Long&gt;** | Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods. |  [optional]
**emailAddress** | **String** | The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address. |  [optional]
**language** | **String** | The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices). |  [optional]
**reference** | **String** | The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id). |  [optional]
**shippingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]



