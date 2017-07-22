
# AbstractTokenUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerEmailAddress** | **String** | The customer email address is the email address of the customer. |  [optional]
**customerId** | **String** | The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it. |  [optional]
**enabledForOneClickPayment** | **Boolean** | When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments. |  [optional]
**language** | **String** |  |  [optional]
**tokenReference** | **String** | Use something that it is easy to identify and may help you find the token (e.g. customer id, email address). |  [optional]



