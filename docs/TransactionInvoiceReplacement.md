
# TransactionInvoiceReplacement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dueOn** | [**DateTime**](DateTime.md) | The date on which the invoice should be paid on. |  [optional]
**externalId** | **String** |  | 
**lineItems** | [**List&lt;LineItemCreate&gt;**](LineItemCreate.md) |  | 
**merchantReference** | **String** |  |  [optional]
**sentToCustomer** | **Boolean** | When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent. |  [optional]



