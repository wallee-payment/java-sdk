
# ManualTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | **List&lt;Long&gt;** |  |  [optional]
**contextEntityId** | **Long** | The context entity ID links the manual task to the entity which caused its creation. |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**expiresOn** | [**DateTime**](DateTime.md) | The expiry date indicates until when the manual task has to be executed. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**spaceId** | **Long** |  |  [optional]
**state** | [**ManualTaskState**](ManualTaskState.md) |  |  [optional]
**type** | **Long** | The type categorizes the manual task. |  [optional]



