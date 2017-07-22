
# ChargeFlow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List&lt;Long&gt;** | If a transaction meets all selected conditions, the charge flow will be used to process the transaction. If the conditions are not met the next charge flow in line will be chosen according to the priorities. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The charge flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**priority** | **Integer** | The priority orders the charge flows. As such the priority determines together with the conditions the charge flow the selection mechanism for a particular transaction. A change of the priority affects all future selections. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



