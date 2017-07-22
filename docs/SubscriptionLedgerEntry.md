
# SubscriptionLedgerEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregatedTaxRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountExcludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amountIncludingTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**createdBy** | **Long** |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**externalId** | **String** | The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**state** | [**SubscriptionLedgerEntryState**](SubscriptionLedgerEntryState.md) |  |  [optional]
**subscriptionVersion** | **Long** |  |  [optional]
**taxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**taxes** | [**List&lt;Tax&gt;**](Tax.md) |  |  [optional]
**title** | **String** |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



