
# Token

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**customerEmailAddress** | **String** | The customer email address is the email address of the customer. |  [optional]
**customerId** | **String** | The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it. |  [optional]
**enabledForOneClickPayment** | **Boolean** | When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments. |  [optional]
**externalId** | **String** | The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**language** | **String** |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**tokenReference** | **String** | Use something that it is easy to identify and may help you find the token (e.g. customer id, email address). |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



