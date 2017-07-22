
# SubscriptionProductComponent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentChangeWeight** | **Integer** | The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade. |  [optional]
**componentGroup** | [**SubscriptionProductComponentGroup**](SubscriptionProductComponentGroup.md) |  |  [optional]
**defaultComponent** | **Boolean** | When a component is marked as a &#39;default&#39; component it is used when no other component is selected by the user. |  [optional]
**description** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The component description may contain a longer description which gives the subscriber a better understanding of what the component contains. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The component name is shown to the subscriber. It should describe in few words what the component does contain. |  [optional]
**reference** | [**SubscriptionProductComponentReference**](SubscriptionProductComponentReference.md) | The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions. |  [optional]
**sortOrder** | **Integer** | The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order. |  [optional]
**taxClass** | [**TaxClass**](TaxClass.md) | The tax class of the component determines the taxes which are applicable on all fees linked with the component. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



