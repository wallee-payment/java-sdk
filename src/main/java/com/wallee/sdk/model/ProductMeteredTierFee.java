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

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class ProductMeteredTierFee extends Indentable {

    @JsonProperty("fee")
    protected List<PersistableCurrencyAmount> fee;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("meteredFee")
    protected ProductMeteredFee meteredFee;


    @JsonProperty("startRange")
    protected BigDecimal startRange;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
     *
     * @return fee
     **/
    @ApiModelProperty(value = "The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.")
    public List<PersistableCurrencyAmount> getFee() {
        return fee;
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
     * @return meteredFee
     **/
    @ApiModelProperty(value = "")
    public ProductMeteredFee getMeteredFee() {
        return meteredFee;
    }


    /**
     * The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
     *
     * @return startRange
     **/
    @ApiModelProperty(value = "The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.")
    public BigDecimal getStartRange() {
        return startRange;
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
        ProductMeteredTierFee productMeteredTierFee = (ProductMeteredTierFee) o;
        return Objects.equals(this.fee, productMeteredTierFee.fee) &&
                Objects.equals(this.id, productMeteredTierFee.id) &&
                Objects.equals(this.meteredFee, productMeteredTierFee.meteredFee) &&
                Objects.equals(this.startRange, productMeteredTierFee.startRange) &&
                Objects.equals(this.version, productMeteredTierFee.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fee, id, meteredFee, startRange, version);
    }


    @Override
    public String toString() {

        return "class ProductMeteredTierFee { \n" +
            "    fee: " + toIndentedString(fee) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    meteredFee: " + toIndentedString(meteredFee) + " \n" +
            "    startRange: " + toIndentedString(startRange) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

