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

public class PaymentConnectorFeature extends Indentable {

    @JsonProperty("displayName")
    protected String displayName;


    @JsonProperty("feature")
    protected Feature feature;


    @JsonProperty("id")
    protected Long id;


    /**
     * @return displayName
     **/
    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }


    /**
     * @return feature
     **/
    @ApiModelProperty(value = "")
    public Feature getFeature() {
        return feature;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentConnectorFeature paymentConnectorFeature = (PaymentConnectorFeature) o;
        return Objects.equals(this.displayName, paymentConnectorFeature.displayName) &&
                Objects.equals(this.feature, paymentConnectorFeature.feature) &&
                Objects.equals(this.id, paymentConnectorFeature.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, feature, id);
    }


    @Override
    public String toString() {

        return "class PaymentConnectorFeature { \n" +
            "    displayName: " + toIndentedString(displayName) +  "\n" +
            "    feature: " + toIndentedString(feature) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "}";
        }


}

