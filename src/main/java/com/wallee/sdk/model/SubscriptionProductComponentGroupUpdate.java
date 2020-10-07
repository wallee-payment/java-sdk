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

import java.util.Objects;


@ApiModel(description = "")

public class SubscriptionProductComponentGroupUpdate extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("name")
    protected DatabaseTranslatedStringCreate name;


    @JsonProperty("optional")
    protected Boolean optional;


    @JsonProperty("productVersion")
    protected Long productVersion;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    public SubscriptionProductComponentGroupUpdate id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SubscriptionProductComponentGroupUpdate version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    public SubscriptionProductComponentGroupUpdate name(DatabaseTranslatedStringCreate name) {
        this.name = name;
        return this;
    }

    /**
     * The component group name will be shown when the components are selected. This can be visible to the subscriber.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The component group name will be shown when the components are selected. This can be visible to the subscriber.")
    public DatabaseTranslatedStringCreate getName() {
        return name;
    }

    public void setName(DatabaseTranslatedStringCreate name) {
        this.name = name;
    }


    public SubscriptionProductComponentGroupUpdate optional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * The component group can be optional. This means no component has to be selected by the subscriber.
     *
     * @return optional
     **/
    @ApiModelProperty(value = "The component group can be optional. This means no component has to be selected by the subscriber.")
    public Boolean isOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }


    public SubscriptionProductComponentGroupUpdate productVersion(Long productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    /**
     * @return productVersion
     **/
    @ApiModelProperty(value = "")
    public Long getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
    }


    public SubscriptionProductComponentGroupUpdate sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order.
     *
     * @return sortOrder
     **/
    @ApiModelProperty(value = "The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order.")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionProductComponentGroupUpdate subscriptionProductComponentGroupUpdate = (SubscriptionProductComponentGroupUpdate) o;
        return Objects.equals(this.id, subscriptionProductComponentGroupUpdate.id) &&
                Objects.equals(this.version, subscriptionProductComponentGroupUpdate.version) &&
                Objects.equals(this.name, subscriptionProductComponentGroupUpdate.name) &&
                Objects.equals(this.optional, subscriptionProductComponentGroupUpdate.optional) &&
                Objects.equals(this.productVersion, subscriptionProductComponentGroupUpdate.productVersion) &&
                Objects.equals(this.sortOrder, subscriptionProductComponentGroupUpdate.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, name, optional, productVersion, sortOrder);
    }


    @Override
    public String toString() {

        return "class SubscriptionProductComponentGroupUpdate {\n" +
            "    id: " + toIndentedString(id) +  "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    optional: " + toIndentedString(optional) + "\n" +
            "    productVersion: " +  toIndentedString(productVersion) + "\n" +
            "    sortOrder: " + toIndentedString(sortOrder) + "\n" +
            "}";
        }


}

