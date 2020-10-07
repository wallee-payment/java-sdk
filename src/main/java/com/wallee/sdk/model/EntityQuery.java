/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The entity query allows to search for specific entities by providing filters. This is similar to a SQL query.
 */
@ApiModel(description = "The entity query allows to search for specific entities by providing filters. This is similar to a SQL query.")

public class EntityQuery extends Indentable {

    @JsonProperty("filter")
    protected EntityQueryFilter filter;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("numberOfEntities")
    protected Integer numberOfEntities;


    @JsonProperty("orderBys")
    protected List<EntityQueryOrderBy> orderBys;


    @JsonProperty("startingEntity")
    protected Integer startingEntity;


    public EntityQuery filter(EntityQueryFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * The filter node defines the root filter node of the query. The root node may contain multiple sub nodes with different filters in it.
     *
     * @return filter
     **/
    @ApiModelProperty(value = "The filter node defines the root filter node of the query. The root node may contain multiple sub nodes with different filters in it.")
    public EntityQueryFilter getFilter() {
        return filter;
    }

    public void setFilter(EntityQueryFilter filter) {
        this.filter = filter;
    }


    public EntityQuery language(String language) {
        this.language = language;
        return this;
    }

    /**
     * The language is applied to the ordering of the entities returned. Some entity fields are language dependent and hence the language is required to order them.
     *
     * @return language
     **/
    @ApiModelProperty(value = "The language is applied to the ordering of the entities returned. Some entity fields are language dependent and hence the language is required to order them.")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public EntityQuery numberOfEntities(Integer numberOfEntities) {
        this.numberOfEntities = numberOfEntities;
        return this;
    }

    /**
     * The number of entities defines how many entities should be returned. There is a maximum of 100 entities.
     *
     * @return numberOfEntities
     **/
    @ApiModelProperty(value = "The number of entities defines how many entities should be returned. There is a maximum of 100 entities.")
    public Integer getNumberOfEntities() {
        return numberOfEntities;
    }

    public void setNumberOfEntities(Integer numberOfEntities) {
        this.numberOfEntities = numberOfEntities;
    }


    public EntityQuery orderBys(List<EntityQueryOrderBy> orderBys) {
        this.orderBys = orderBys;
        return this;
    }

    public EntityQuery addOrderBysItem(EntityQueryOrderBy orderBysItem) {
        if (this.orderBys == null) {
            this.orderBys = new ArrayList<>();
        }
        this.orderBys.add(orderBysItem);
        return this;
    }

    /**
     * The order bys allows to define the ordering of the entities returned by the search.
     *
     * @return orderBys
     **/
    @ApiModelProperty(value = "The order bys allows to define the ordering of the entities returned by the search.")
    public List<EntityQueryOrderBy> getOrderBys() {
        return orderBys;
    }

    public void setOrderBys(List<EntityQueryOrderBy> orderBys) {
        this.orderBys = orderBys;
    }


    public EntityQuery startingEntity(Integer startingEntity) {
        this.startingEntity = startingEntity;
        return this;
    }

    /**
     * The &#39;starting entity&#39; defines the entity number at which the returned result should start. The entity number is the consecutive number of the entity as returned and it is not the entity id.
     *
     * @return startingEntity
     **/
    @ApiModelProperty(value = "The 'starting entity' defines the entity number at which the returned result should start. The entity number is the consecutive number of the entity as returned and it is not the entity id.")
    public Integer getStartingEntity() {
        return startingEntity;
    }

    public void setStartingEntity(Integer startingEntity) {
        this.startingEntity = startingEntity;
    }


    @Override
    public boolean equals(Object o) {
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

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    numberOfEntities: ").append(toIndentedString(numberOfEntities)).append("\n");
        sb.append("    orderBys: ").append(toIndentedString(orderBys)).append("\n");
        sb.append("    startingEntity: ").append(toIndentedString(startingEntity)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

