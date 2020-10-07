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

import java.math.BigDecimal;
import java.util.Objects;


@ApiModel(description = "")

public class SubscriptionComponentConfiguration extends Indentable {

    @JsonProperty("component")
    protected Long component;


    @JsonProperty("quantity")
    protected BigDecimal quantity;


    /**
     * @return component
     **/
    @ApiModelProperty(value = "")
    public Long getComponent() {
        return component;
    }


    /**
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getQuantity() {
        return quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionComponentConfiguration subscriptionComponentConfiguration = (SubscriptionComponentConfiguration) o;
        return Objects.equals(this.component, subscriptionComponentConfiguration.component) &&
                Objects.equals(this.quantity, subscriptionComponentConfiguration.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, quantity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionComponentConfiguration {\n");

        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

