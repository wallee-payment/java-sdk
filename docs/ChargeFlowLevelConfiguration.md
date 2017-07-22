
# ChargeFlowLevelConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flow** | [**ChargeFlow**](ChargeFlow.md) | The charge flow level configuration to which the flow is associated. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The charge flow level configuration name is used internally to identify the charge flow level configuration. For example the name is used within search fields and hence it should be distinct and descriptive. |  [optional]
**period** | **String** | The duration of the level before switching to the next one. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**priority** | **Integer** | The priority indicates the sort order of the level configurations. A low value indicates that the level configuration is executed before any level with a higher value. Any change to this value affects future level configuration selections. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**type** | **Long** | The type determines how the payment link is delivered to the customer. Once the type is defined it cannot be changed anymore. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



