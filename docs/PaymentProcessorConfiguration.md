
# PaymentProcessorConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**processor** | **Long** | A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



