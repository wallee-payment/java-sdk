
# WebhookListener

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **Long** | The listener listens on state changes of the entity linked with the listener. |  [optional]
**entityStates** | **List&lt;String&gt;** | The target state identifies the state into which entities need to move into to trigger the webhook listener. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**identity** | [**WebhookIdentity**](WebhookIdentity.md) | The identity which will be used to sign messages sent by this listener. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**notifyEveryChange** | **Boolean** | Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**url** | [**WebhookUrl**](WebhookUrl.md) | The URL which is invoked by the listener to notify the application about the event. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



