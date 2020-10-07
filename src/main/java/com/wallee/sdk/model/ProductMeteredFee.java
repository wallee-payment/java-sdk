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
import com.wallee.sdk.model.enums.ProductFeeType;
import com.wallee.sdk.model.enums.ProductMeteredTierPricing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "")

public class ProductMeteredFee extends Indentable {

    @JsonProperty("component")
    protected SubscriptionProductComponent component;


    @JsonProperty("description")
    protected DatabaseTranslatedString description;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("metric")
    protected SubscriptionMetric metric;


    @JsonProperty("name")
    protected DatabaseTranslatedString name;


    @JsonProperty("tierPricing")
    protected ProductMeteredTierPricing tierPricing;


    @JsonProperty("type")
    protected ProductFeeType type;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return component
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductComponent getComponent() {
        return component;
    }


    /**
     * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
     *
     * @return description
     **/
    @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
    public DatabaseTranslatedString getDescription() {
        return description;
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
     * @return metric
     **/
    @ApiModelProperty(value = "")
    public SubscriptionMetric getMetric() {
        return metric;
    }


    /**
     * The name of the fee should describe for the subscriber in few words for what the fee is for.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
    public DatabaseTranslatedString getName() {
        return name;
    }


    /**
     * The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.
     *
     * @return tierPricing
     **/
    @ApiModelProperty(value = "The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.")
    public ProductMeteredTierPricing getTierPricing() {
        return tierPricing;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public ProductFeeType getType() {
        return type;
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
        ProductMeteredFee productMeteredFee = (ProductMeteredFee) o;
        return Objects.equals(this.component, productMeteredFee.component) &&
                Objects.equals(this.description, productMeteredFee.description) &&
                Objects.equals(this.id, productMeteredFee.id) &&
                Objects.equals(this.linkedSpaceId, productMeteredFee.linkedSpaceId) &&
                Objects.equals(this.metric, productMeteredFee.metric) &&
                Objects.equals(this.name, productMeteredFee.name) && this.tierPricing == productMeteredFee.tierPricing
                && this.type == productMeteredFee.type &&
                Objects.equals(this.version, productMeteredFee.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, description, id, linkedSpaceId, metric, name, tierPricing, type, version);
    }


    @Override
    public String toString() {

        return "class ProductMeteredFee { \n" +
            "    component: " + toIndentedString(component) +  " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    metric: " + toIndentedString(metric) + "\n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    tierPricing: " + toIndentedString(tierPricing) + "\n" +
            "    type: " + toIndentedString(type) + " \n" +
            "    version: " + toIndentedString(version) +  " \n" +
            "}";
        }


}

