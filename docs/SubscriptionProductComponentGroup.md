
# SubscriptionProductComponentGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The component group name will be shown when the components are selected. This can be visible to the subscriber. |  [optional]
**optional** | **Boolean** | The component group can be optional. This means no component has to be selected by the subscriber. |  [optional]
**productVersion** | [**SubscriptionProductVersion**](SubscriptionProductVersion.md) |  |  [optional]
**sortOrder** | **Integer** | The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



