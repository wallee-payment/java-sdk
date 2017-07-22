
# SubscriptionProductComponentGroupUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. | 
**version** | **Long** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. | 
**name** | [**DatabaseTranslatedStringCreate**](DatabaseTranslatedStringCreate.md) | The component group name will be shown when the components are selected. This can be visible to the subscriber. |  [optional]
**optional** | **Boolean** | The component group can be optional. This means no component has to be selected by the subscriber. |  [optional]
**productVersion** | **Long** |  |  [optional]
**sortOrder** | **Integer** | The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order. |  [optional]



