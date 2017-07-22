
# ChargeAttempt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charge** | [**Charge**](Charge.md) |  |  [optional]
**connectorConfiguration** | [**PaymentConnectorConfiguration**](PaymentConnectorConfiguration.md) |  |  [optional]
**createdOn** | [**DateTime**](DateTime.md) | The created on date indicates the date on which the entity was stored into the database. |  [optional]
**environment** | [**ChargeAttemptEnvironment**](ChargeAttemptEnvironment.md) |  |  [optional]
**failedOn** | [**DateTime**](DateTime.md) |  |  [optional]
**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional]
**initializingTokenVersion** | **Boolean** |  |  [optional]
**invocation** | [**ConnectorInvocation**](ConnectorInvocation.md) |  |  [optional]
**labels** | [**List&lt;Label&gt;**](Label.md) |  |  [optional]
**language** | **String** |  |  [optional]
**nextUpdateOn** | [**DateTime**](DateTime.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**redirectionUrl** | **String** |  |  [optional]
**spaceViewId** | **Long** |  |  [optional]
**state** | [**ChargeAttemptState**](ChargeAttemptState.md) |  |  [optional]
**succeededOn** | [**DateTime**](DateTime.md) |  |  [optional]
**timeoutOn** | [**DateTime**](DateTime.md) |  |  [optional]
**tokenVersion** | [**TokenVersion**](TokenVersion.md) |  |  [optional]
**userFailureMessage** | **String** | The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



