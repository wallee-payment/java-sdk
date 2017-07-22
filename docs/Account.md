
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Active means that this account and all accounts in the hierarchy are active. |  [optional]
**activeOrRestrictedActive** | **Boolean** | This property is true when all accounts in the hierarchy are active or restricted active. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**name** | **String** | The name of the account identifies the account within the administrative interface. |  [optional]
**parentAccount** | [**Account**](Account.md) | The account which is responsible for administering the account. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**restrictedActive** | **Boolean** | Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active. |  [optional]
**state** | [**AccountState**](AccountState.md) |  |  [optional]
**subaccountLimit** | **Long** | This property restricts the number of subaccounts which can be created within this account. |  [optional]
**type** | [**AccountType**](AccountType.md) | The account type defines which role and capabilities it has. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



