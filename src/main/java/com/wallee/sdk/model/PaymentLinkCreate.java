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
import com.wallee.sdk.model.enums.PaymentLinkProtectionMode;

/**
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")

public class PaymentLinkCreate extends AbstractPaymentLinkUpdate implements UpsertableEntity {

    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("protectionMode")
    protected PaymentLinkProtectionMode protectionMode;


    public PaymentLinkCreate state(CreationEntityState state) {
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


    public PaymentLinkCreate externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    public PaymentLinkCreate protectionMode(PaymentLinkProtectionMode protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * The protection mode determines if the payment link is protected against tampering and in what way.
     *
     * @return protectionMode
     **/
    @ApiModelProperty(value = "The protection mode determines if the payment link is protected against tampering and in what way.")
    public PaymentLinkProtectionMode getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(PaymentLinkProtectionMode protectionMode) {
        this.protectionMode = protectionMode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentLinkCreate paymentLinkCreate = (PaymentLinkCreate) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkCreate.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.appliedSpaceView, paymentLinkCreate.appliedSpaceView) &&
                Objects.equals(this.availableFrom, paymentLinkCreate.availableFrom) &&
                Objects.equals(this.availableUntil, paymentLinkCreate.availableUntil) &&
                Objects.equals(this.billingAddressRequired, paymentLinkCreate.billingAddressRequired) &&
                Objects.equals(this.currency, paymentLinkCreate.currency) &&
                Objects.equals(this.language, paymentLinkCreate.language) &&
                Objects.equals(this.lineItems, paymentLinkCreate.lineItems) &&
                Objects.equals(this.maximalNumberOfTransactions, paymentLinkCreate.maximalNumberOfTransactions) &&
                Objects.equals(this.name, paymentLinkCreate.name) &&
                Objects.equals(this.shippingAddressRequired, paymentLinkCreate.shippingAddressRequired) && this.state
                == paymentLinkCreate.state &&
                Objects.equals(this.externalId, paymentLinkCreate.externalId) && this.protectionMode
                == paymentLinkCreate.protectionMode &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressRequired, state, externalId, protectionMode, super.hashCode());
    }


    @Override
    public String toString() {
        return "class PaymentLinkCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  " \n" +
            "    appliedSpaceView: " + toIndentedString(appliedSpaceView) + " \n" +
            "    availableFrom: " + toIndentedString(availableFrom) + " \n" +
            "    availableUntil: " + toIndentedString(availableUntil) +  " \n" +
            "    billingAddressRequired: " + toIndentedString(billingAddressRequired) + " \n" +
            "    currency: " + toIndentedString(currency) + " \n" +
            "    language: " + toIndentedString(language) +  " \n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    maximalNumberOfTransactions: " + toIndentedString(maximalNumberOfTransactions) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    shippingAddressRequired: " + toIndentedString(shippingAddressRequired) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    externalId: " + toIndentedString(externalId) +  " \n" +
            "    protectionMode: " + toIndentedString(protectionMode) + " \n" +
            "}";
        }


}

