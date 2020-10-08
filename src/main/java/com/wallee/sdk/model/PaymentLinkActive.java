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
import com.wallee.sdk.model.enums.CreationEntityState;

/**
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")

public class PaymentLinkActive extends PaymentLinkUpdate {

    @JsonProperty("state")
    protected CreationEntityState state;


    public PaymentLinkActive state(CreationEntityState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }

    public void setState(CreationEntityState state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentLinkActive paymentLinkActive = (PaymentLinkActive) o;
        return Objects.equals(this.id, paymentLinkActive.id) &&
                Objects.equals(this.version, paymentLinkActive.version) &&
                Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkActive.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.appliedSpaceView, paymentLinkActive.appliedSpaceView) &&
                Objects.equals(this.availableFrom, paymentLinkActive.availableFrom) &&
                Objects.equals(this.availableUntil, paymentLinkActive.availableUntil) &&
                Objects.equals(this.billingAddressRequired, paymentLinkActive.billingAddressRequired) &&
                Objects.equals(this.currency, paymentLinkActive.currency) &&
                Objects.equals(this.language, paymentLinkActive.language) &&
                Objects.equals(this.lineItems, paymentLinkActive.lineItems) &&
                Objects.equals(this.maximalNumberOfTransactions, paymentLinkActive.maximalNumberOfTransactions) &&
                Objects.equals(this.name, paymentLinkActive.name) &&
                Objects.equals(this.shippingAddressRequired, paymentLinkActive.shippingAddressRequired) && this.state
                == paymentLinkActive.state &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressRequired, state, super.hashCode());
    }


    @Override
    public String toString() {
      return "class PaymentLinkActive { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) +  " \n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  " \n" +
            "    appliedSpaceView: " + toIndentedString(appliedSpaceView) + " \n" +
            "    availableFrom: " + toIndentedString(availableFrom) + " \n" +
            "    availableUntil: " + toIndentedString(availableUntil) +  " \n" +
            "    billingAddressRequired: " + toIndentedString(billingAddressRequired) + " \n" +
            "    currency: " + toIndentedString(currency) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    maximalNumberOfTransactions: " +  toIndentedString(maximalNumberOfTransactions) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    shippingAddressRequired: " + toIndentedString(shippingAddressRequired) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
      }


}

