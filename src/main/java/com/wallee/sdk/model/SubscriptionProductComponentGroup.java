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

public class SubscriptionProductComponentGroup extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected DatabaseTranslatedString name;


    @JsonProperty("optional")
    protected Boolean optional;


    @JsonProperty("productVersion")
    protected SubscriptionProductVersion productVersion;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The component group name will be shown when the components are selected. This can be visible to the subscriber.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The component group name will be shown when the components are selected. This can be visible to the subscriber.")
    public DatabaseTranslatedString getName() {
        return name;
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


    /**
     * @return productVersion
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductVersion getProductVersion() {
        return productVersion;
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


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionProductComponentGroup subscriptionProductComponentGroup = (SubscriptionProductComponentGroup) o;
        return Objects.equals(this.id, subscriptionProductComponentGroup.id) &&
                Objects.equals(this.linkedSpaceId, subscriptionProductComponentGroup.linkedSpaceId) &&
                Objects.equals(this.name, subscriptionProductComponentGroup.name) &&
                Objects.equals(this.optional, subscriptionProductComponentGroup.optional) &&
                Objects.equals(this.productVersion, subscriptionProductComponentGroup.productVersion) &&
                Objects.equals(this.sortOrder, subscriptionProductComponentGroup.sortOrder) &&
                Objects.equals(this.version, subscriptionProductComponentGroup.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, name, optional, productVersion, sortOrder, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionProductComponentGroup {\n" +
            "    id: " + toIndentedString(id) +  "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    optional: " + toIndentedString(optional) + "\n" +
            "    productVersion: " +  toIndentedString(productVersion) + "\n" +
            "    sortOrder: " + toIndentedString(sortOrder) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

