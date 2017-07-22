
# PaymentConnectorConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicableForTransactionProcessing** | **Boolean** | This property indicates if the connector is currently used for processing transactions. In case either the payment method configuration or the processor configuration is not active the connector will not be used even though the connector state is active. |  [optional]
**conditions** | **List&lt;Long&gt;** | If a transaction meet all selected conditions the connector configuration will be used to process the transaction otherwise the next connector configuration in line will be chosen according to the priorities. |  [optional]
**connector** | **Long** |  |  [optional]
**enabledSpaceViews** | **List&lt;Long&gt;** | The connector configuration is only enabled for the selected space views. In case the set is empty the connector configuration is enabled for all space views. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**name** | **String** | The connector configuration name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**paymentMethodConfiguration** | [**PaymentMethodConfiguration**](PaymentMethodConfiguration.md) |  |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**priority** | **Integer** | The priority will define the order of choice of the connector configurations. The lower the value, the higher the priority is going to be. This value can also be a negative number in case you are adding a new configuration that you want to have a high priority and you dont want to change the priority of all the other configurations. |  [optional]
**processorConfiguration** | [**PaymentProcessorConfiguration**](PaymentProcessorConfiguration.md) |  |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



