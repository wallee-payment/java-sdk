
# Scope

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domainName** | **String** | The domain name to which this scope is mapped to. |  [optional]
**features** | [**List&lt;Feature&gt;**](Feature.md) |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**name** | **String** | The name of the scope is shown to the user where the user should select a scope. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**port** | **Integer** | The port number to which this scope is mapped to. |  [optional]
**sslActive** | **Boolean** | Define whether the scope supports SSL. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**themes** | **List&lt;String&gt;** | The themes determines how the application layout, look and feel is. By providing multiple themes you can fallback to other themes. |  [optional]
**url** | **String** |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



