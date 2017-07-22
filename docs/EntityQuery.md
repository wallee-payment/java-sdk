
# EntityQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**EntityQueryFilter**](EntityQueryFilter.md) | The filter node defines the root filter node of the query. The root node may contain multiple sub nodes with different filters in it. |  [optional]
**language** | **String** | The language is applied to the ordering of the entities returned. Some entity fields are language dependent and hence the language is required to order them. |  [optional]
**numberOfEntities** | **Integer** | The number of entities defines how many entities should be returned. There is a maximum of 500 entities. |  [optional]
**orderBys** | [**List&lt;EntityQueryOrderBy&gt;**](EntityQueryOrderBy.md) | The order bys allows to define the ordering of the entities returned by the search. |  [optional]
**startingEntity** | **Integer** | The &#39;starting entity&#39; defines the entity number at which the returned result should start. The entity number is the consecutive number of the entity as returned and it is not the entity id. |  [optional]



