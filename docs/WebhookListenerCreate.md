
# WebhookListenerCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **Long** | The listener listens on state changes of the entity linked with the listener. | 
**entityStates** | **List&lt;String&gt;** | The target state identifies the state into which entities need to move into to trigger the webhook listener. | 
**identity** | **Long** | The identity which will be used to sign messages sent by this listener. |  [optional]
**notifyEveryChange** | **Boolean** | Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only. |  [optional]
**url** | **Long** | The URL which is invoked by the listener to notify the application about the event. | 



