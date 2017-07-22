
# TransactionCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]
**chargeRetryEnabled** | **Boolean** | When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry. |  [optional]
**customersPresence** | [**CustomersPresence**](CustomersPresence.md) |  | 
**lineItems** | [**List&lt;LineItemCreate&gt;**](LineItemCreate.md) |  | 
**shippingAddress** | [**AddressCreate**](AddressCreate.md) |  |  [optional]
**spaceViewId** | **Long** |  |  [optional]
**token** | **Long** |  |  [optional]



