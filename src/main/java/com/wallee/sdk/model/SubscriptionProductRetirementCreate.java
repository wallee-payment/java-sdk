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

public class SubscriptionProductRetirementCreate extends Indentable {

    @JsonProperty("product")
    protected Long product;


    @JsonProperty("respectTerminiationPeriodsEnabled")
    protected Boolean respectTerminiationPeriodsEnabled;


    @JsonProperty("targetProduct")
    protected Long targetProduct;


    public SubscriptionProductRetirementCreate product(Long product) {
        this.product = product;
        return this;
    }

    /**
     * @return product
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }


    public SubscriptionProductRetirementCreate respectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
        this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
        return this;
    }

    /**
     * @return respectTerminiationPeriodsEnabled
     **/
    @ApiModelProperty(value = "")
    public Boolean isRespectTerminiationPeriodsEnabled() {
        return respectTerminiationPeriodsEnabled;
    }

    public void setRespectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
        this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
    }


    public SubscriptionProductRetirementCreate targetProduct(Long targetProduct) {
        this.targetProduct = targetProduct;
        return this;
    }

    /**
     * @return targetProduct
     **/
    @ApiModelProperty(value = "")
    public Long getTargetProduct() {
        return targetProduct;
    }

    public void setTargetProduct(Long targetProduct) {
        this.targetProduct = targetProduct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionProductRetirementCreate subscriptionProductRetirementCreate = (SubscriptionProductRetirementCreate) o;
        return Objects.equals(this.product, subscriptionProductRetirementCreate.product) &&
                Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductRetirementCreate.respectTerminiationPeriodsEnabled) &&
                Objects.equals(this.targetProduct, subscriptionProductRetirementCreate.targetProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, respectTerminiationPeriodsEnabled, targetProduct);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionProductRetirementCreate {\n");

        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
        sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

