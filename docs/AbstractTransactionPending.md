
# AbstractTransactionPending

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethodBrands** | [**List&lt;PaymentMethodBrand&gt;**](PaymentMethodBrand.md) |  |  [optional]
**allowedPaymentMethodConfigurations** | **List&lt;Long&gt;** |  |  [optional]
**billingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**customerEmailAddress** | **String** | The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used. |  [optional]
**customerId** | **String** |  |  [optional]
**failedUrl** | **String** | The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed. |  [optional]
**invoiceMerchantReference** | **String** |  |  [optional]
**language** | **String** |  |  [optional]
**lineItems** | [**List&lt;LineItemCreate&gt;**](LineItemCreate.md) |  |  [optional]
**merchantReference** | **String** |  |  [optional]
**metaData** | **Map&lt;String, String&gt;** | Meta data allow to store additional data along the object. |  [optional]
**shippingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]
**shippingMethod** | **String** |  |  [optional]
**successUrl** | **String** | The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed. |  [optional]
**token** | **Long** |  |  [optional]



