
# InstallmentPlanSliceConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID is the primary key of the entity. The ID identifies the entity uniquely. |  [optional]
**lineItemTitle** | [**DatabaseTranslatedString**](DatabaseTranslatedString.md) | The title of this slices line items. The title is visible to the buyer. |  [optional]
**linkedSpaceId** | **Long** | The linked space id holds the ID of the space to which the entity belongs to. |  [optional]
**period** | **String** | The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero. |  [optional]
**plan** | [**InstallmentPlanConfiguration**](InstallmentPlanConfiguration.md) | The installment plan this slice belongs to. |  [optional]
**plannedPurgeDate** | [**DateTime**](DateTime.md) | The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed. |  [optional]
**priority** | **Integer** | The priority controls in which order the slices are applied. The lower the value the higher the precedence. |  [optional]
**proportion** | [**BigDecimal**](BigDecimal.md) | The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice. |  [optional]
**state** | [**CreationEntityState**](CreationEntityState.md) |  |  [optional]
**version** | **Integer** | The version number indicates the version of the entity. The version is incremented whenever the entity is changed. |  [optional]



