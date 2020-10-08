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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class SubscriptionProductVersionRetirement extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("productVersion")
    protected SubscriptionProductVersion productVersion;


    @JsonProperty("respectTerminiationPeriodsEnabled")
    protected Boolean respectTerminiationPeriodsEnabled;


    @JsonProperty("targetProduct")
    protected SubscriptionProduct targetProduct;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


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
     * @return productVersion
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductVersion getProductVersion() {
        return productVersion;
    }


    /**
     * @return respectTerminiationPeriodsEnabled
     **/
    @ApiModelProperty(value = "")
    public Boolean isRespectTerminiationPeriodsEnabled() {
        return respectTerminiationPeriodsEnabled;
    }


    /**
     * @return targetProduct
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProduct getTargetProduct() {
        return targetProduct;
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
        SubscriptionProductVersionRetirement subscriptionProductVersionRetirement = (SubscriptionProductVersionRetirement) o;
        return Objects.equals(this.createdOn, subscriptionProductVersionRetirement.createdOn) &&
                Objects.equals(this.id, subscriptionProductVersionRetirement.id) &&
                Objects.equals(this.linkedSpaceId, subscriptionProductVersionRetirement.linkedSpaceId) &&
                Objects.equals(this.productVersion, subscriptionProductVersionRetirement.productVersion) &&
                Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductVersionRetirement.respectTerminiationPeriodsEnabled) &&
                Objects.equals(this.targetProduct, subscriptionProductVersionRetirement.targetProduct) &&
                Objects.equals(this.version, subscriptionProductVersionRetirement.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, id, linkedSpaceId, productVersion, respectTerminiationPeriodsEnabled, targetProduct, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionProductVersionRetirement { \n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    productVersion: " + toIndentedString(productVersion) +  "\n" +
            "    respectTerminiationPeriodsEnabled: " + toIndentedString(respectTerminiationPeriodsEnabled) +  "\n" +
            "    targetProduct: " + toIndentedString(targetProduct) + " \n" +
            "    version: " +  toIndentedString(version) + " \n" +
            "}";
        }


}

