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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The component reference configuration adjusts the product component for a particular subscription.
 */
@ApiModel(description = "The component reference configuration adjusts the product component for a particular subscription.")

public class SubscriptionComponentReferenceConfiguration extends Indentable {

    @JsonProperty("productComponentReferenceId")
    protected Long productComponentReferenceId;


    @JsonProperty("quantity")
    protected BigDecimal quantity;


    public SubscriptionComponentReferenceConfiguration productComponentReferenceId(Long productComponentReferenceId) {
        this.productComponentReferenceId = productComponentReferenceId;
        return this;
    }

    /**
     * @return productComponentReferenceId
     **/
    @ApiModelProperty(value = "")
    public Long getProductComponentReferenceId() {
        return productComponentReferenceId;
    }

    public void setProductComponentReferenceId(Long productComponentReferenceId) {
        this.productComponentReferenceId = productComponentReferenceId;
    }


    public SubscriptionComponentReferenceConfiguration quantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionComponentReferenceConfiguration subscriptionComponentReferenceConfiguration = (SubscriptionComponentReferenceConfiguration) o;
        return Objects.equals(this.productComponentReferenceId, subscriptionComponentReferenceConfiguration.productComponentReferenceId) &&
                Objects.equals(this.quantity, subscriptionComponentReferenceConfiguration.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productComponentReferenceId, quantity);
    }


    @Override
    public String toString() {

        return "class SubscriptionComponentReferenceConfiguration {\n" +
            "    productComponentReferenceId: " + toIndentedString(productComponentReferenceId) + "\n" +
            "    quantity: " + toIndentedString(quantity) +  "\n" +
            "}";
        }


}

