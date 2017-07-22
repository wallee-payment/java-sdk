
# SubscriptionSuspensionCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endAction** | [**SubscriptionSuspensionAction**](SubscriptionSuspensionAction.md) | When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date. | 
**note** | **String** | The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber. |  [optional]
**plannedEndDate** | [**DateTime**](DateTime.md) | The planned end date of the suspension identifies the date on which the suspension will be ended automatically. | 
**subscription** | **Long** |  | 



