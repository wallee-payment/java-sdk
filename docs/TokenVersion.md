
# TokenVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activatedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**environment** | [**ChargeAttemptEnvironment**](ChargeAttemptEnvironment.md) |  |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional]
**language** | **String** |  |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** |  |  [optional]
**obsoletedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**paymentConnectorConfiguration** | [**PaymentConnectorConfiguration**](PaymentConnectorConfiguration.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**processorToken** | **String** |  |  [optional]
**shippingAddress** | [**Address**](Address.md) |  |  [optional]
**state** | [**TokenVersionState**](TokenVersionState.md) |  |  [optional]
**token** | [**Token**](Token.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



