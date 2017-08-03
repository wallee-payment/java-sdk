/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.EntityQueryOrderBy;
import java.util.ArrayList;
import java.util.List;

/**
 * The entity query allows to search for specific entities by providing filters. This is similar to a SQL query.
 */
public class EntityQuery {

	@SerializedName("filter")
	private EntityQueryFilter filter = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("numberOfEntities")
	private Integer numberOfEntities = null;

	@SerializedName("orderBys")
	private List<EntityQueryOrderBy> orderBys = new ArrayList<EntityQueryOrderBy>();

	@SerializedName("startingEntity")
	private Integer startingEntity = null;

	/**
	 * The filter node defines the root filter node of the query. The root node may contain multiple sub nodes with different filters in it.
	 *
	 * @return The filter node defines the root filter node of the query. The root node may contain multiple sub nodes with different filters in it.
	 */
	public EntityQueryFilter getFilter() {
		return filter;
	}

	/**
	 * The language is applied to the ordering of the entities returned. Some entity fields are language dependent and hence the language is required to order them.
	 *
	 * @return The language is applied to the ordering of the entities returned. Some entity fields are language dependent and hence the language is required to order them.
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * The number of entities defines how many entities should be returned. There is a maximum of 500 entities.
	 *
	 * @return The number of entities defines how many entities should be returned. There is a maximum of 500 entities.
	 */
	public Integer getNumberOfEntities() {
		return numberOfEntities;
	}

	/**
	 * The order bys allows to define the ordering of the entities returned by the search.
	 *
	 * @return The order bys allows to define the ordering of the entities returned by the search.
	 */
	public List<EntityQueryOrderBy> getOrderBys() {
		return orderBys;
	}

	/**
	 * The 'starting entity' defines the entity number at which the returned result should start. The entity number is the consecutive number of the entity as returned and it is not the entity id.
	 *
	 * @return The 'starting entity' defines the entity number at which the returned result should start. The entity number is the consecutive number of the entity as returned and it is not the entity id.
	 */
	public Integer getStartingEntity() {
		return startingEntity;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EntityQuery entityQuery = (EntityQuery) o;
		return Objects.equals(this.filter, entityQuery.filter) &&
				Objects.equals(this.language, entityQuery.language) &&
				Objects.equals(this.numberOfEntities, entityQuery.numberOfEntities) &&
				Objects.equals(this.orderBys, entityQuery.orderBys) &&
				Objects.equals(this.startingEntity, entityQuery.startingEntity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filter, language, numberOfEntities, orderBys, startingEntity);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntityQuery {\n");
		
		sb.append("		filter: ").append(toIndentedString(filter)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		numberOfEntities: ").append(toIndentedString(numberOfEntities)).append("\n");
		sb.append("		orderBys: ").append(toIndentedString(orderBys)).append("\n");
		sb.append("		startingEntity: ").append(toIndentedString(startingEntity)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

