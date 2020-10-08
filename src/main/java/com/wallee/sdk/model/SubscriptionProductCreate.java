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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")

public class SubscriptionProductCreate extends AbstractSubscriptionProductActive implements CreateableEntity {

    @JsonProperty("reference")
    protected String reference;


    public SubscriptionProductCreate reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * The product reference identifies the product for external systems. This field may contain the product&#39;s SKU.
     *
     * @return reference
     **/
    @ApiModelProperty(required = true, value = "The product reference identifies the product for external systems. This field may contain the product's SKU.")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionProductCreate subscriptionProductCreate = (SubscriptionProductCreate) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProductCreate.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProductCreate.failedPaymentSuspensionPeriod) &&
                Objects.equals(this.name, subscriptionProductCreate.name) &&
                Objects.equals(this.sortOrder, subscriptionProductCreate.sortOrder) && this.state
                == subscriptionProductCreate.state &&
                Objects.equals(this.reference, subscriptionProductCreate.reference) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, sortOrder, state, reference, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionProductCreate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  "\n" +
            "    failedPaymentSuspensionPeriod: " + toIndentedString(failedPaymentSuspensionPeriod) +  "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    sortOrder: " + toIndentedString(sortOrder) +  "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    reference: " + toIndentedString(reference) +  "\n" +
            "}";
        }


}

