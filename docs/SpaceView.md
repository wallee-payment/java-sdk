
# SpaceView

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The space view name is used internally to identify the space view in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**space** | [**Space**](Space.md) | The space to which the view belongs to. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



