
# SubscriptionChargeCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity. | 
**failedUrl** | **String** | The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed. |  [optional]
**plannedExecutionDate** | [**DateTime**](DateTime.md) |  |  [optional]
**processingType** | [**SubscriptionChargeProcessingType**](SubscriptionChargeProcessingType.md) |  | 
**reference** | **String** |  |  [optional]
**subscription** | **Long** | The field subscription indicates the subscription to which the charge belongs to. | 
**successUrl** | **String** | The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed. |  [optional]



