
# Space

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**Account**](Account.md) | The account to which the space belongs to. |  [optional]
**active** | **Boolean** | Active means that this account and all accounts in the hierarchy are active. |  [optional]
**activeOrRestrictedActive** | **Boolean** | This property is true when all accounts in the hierarchy are active or restricted active. |  [optional]
**database** | [**TenantDatabase**](TenantDatabase.md) | The database in which the space&#39;s data are stored in. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**name** | **String** | The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**postalAddress** | [**SpaceAddress**](SpaceAddress.md) | The address to use in communication with clients for example in email, documents etc. |  [optional]
**requestLimit** | **Long** | The request limit defines the maximum number of API request accepted within 2 minutes per cluster node. This limit can only be changed with special privileges. |  [optional]
**restrictedActive** | **Boolean** | Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**technicalContactAddresses** | **List&lt;String&gt;** | The email address provided as contact addresses will be informed about technical issues or errors triggered by the space. |  [optional]
**timeZone** | **String** | The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



