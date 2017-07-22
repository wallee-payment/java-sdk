
# ConnectorInvocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**stage** | [**ConnectorInvocationStage**](ConnectorInvocationStage.md) |  |  [optional]
**timeTookInMilliseconds** | **Long** |  |  [optional]
**transaction** | **Long** |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



