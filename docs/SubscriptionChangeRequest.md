
# SubscriptionChangeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** |  | 
**product** | [**SubscriptionProduct**](SubscriptionProduct.md) | The subscription has to be linked with a product. | 
**respectTerminationPeriod** | **Boolean** | The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. |  [optional]
**selectedComponents** | [**List&lt;SubscriptionProductComponentReference&gt;**](SubscriptionProductComponentReference.md) |  |  [optional]
**subscription** | [**Subscription**](Subscription.md) |  |  [optional]



