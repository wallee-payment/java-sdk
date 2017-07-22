
# SubscriptionProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethodConfigurations** | **List&lt;Long&gt;** | The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed. |  [optional]
**failedPaymentSuspensionPeriod** | **String** | When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**reference** | **String** | The product reference identifies the product for external systems. This field may contain the product&#39;s SKU. |  [optional]
**sortOrder** | **Integer** | The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order. |  [optional]
**spaceId** | **Long** |  |  [optional]
**state** | [**SubscriptionProductState**](SubscriptionProductState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



