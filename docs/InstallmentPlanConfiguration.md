
# InstallmentPlanConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseCurrency** | **String** | The base currency in which the installment fee and minimal amount are defined. |  [optional]
**conditions** | **List&lt;Long&gt;** | If a transaction meets all selected conditions the installment plan will be available to the customer to be selected. |  [optional]
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**installmentFee** | [**BigDecimal**](BigDecimal.md) | The installment fee is a fixed amount that is charged additionally when applying this installment plan. |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) | The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**minimalAmount** | [**BigDecimal**](BigDecimal.md) | The installment plan can only be applied if the orders total is at least the defined minimal amount. |  [optional]
**name** | **String** | The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive. |  [optional]
**paymentMethodConfigurations** | **List&lt;Long&gt;** | A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**sortOrder** | **Integer** | The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order. |  [optional]
**spaceReference** | [**SpaceReference**](SpaceReference.md) |  |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**taxClass** | [**TaxClass**](TaxClass.md) | The tax class determines the taxes which are applicable on all fees linked to the installment plan. |  [optional]
**termsAndConditions** | [**ResourcePath**](ResourcePath.md) | The terms and conditions will be displayed to the customer when he or she selects this installment plan. |  [optional]
**title** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The title of the installment plan is used within the payment process. The title is visible to the buyer. |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



