
# EntityQueryFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**children** | [**List&lt;EntityQueryFilter&gt;**](EntityQueryFilter.md) | The &#39;children&#39; can contain other filter nodes which are applied to the query. This property is only applicable on filter types &#39;OR&#39; and &#39;AND&#39;. |  [optional]
**fieldName** | **String** | The &#39;fieldName&#39; indicates the property on the entity which should be filtered. This property is only applicable on filter type &#39;LEAF&#39;. |  [optional]
**operator** | [**CriteriaOperator**](CriteriaOperator.md) | The &#39;operator&#39; indicates what kind of filtering on the &#39;fieldName&#39; is executed on. This property is only applicable on filter type &#39;LEAF&#39;. |  [optional]
**type** | [**EntityQueryFilterType**](EntityQueryFilterType.md) | The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group. | 
**value** | **Object** | The &#39;value&#39; is used to compare with the &#39;fieldName&#39; as defined by the &#39;operator&#39;. This property is only applicable on filter type &#39;LEAF&#39;. |  [optional]



