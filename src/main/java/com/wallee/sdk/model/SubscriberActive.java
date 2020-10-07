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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")

public class SubscriberActive extends SubscriberUpdate {

    @JsonProperty("state")
    protected CreationEntityState state;


    public SubscriberActive state(CreationEntityState state) {
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
        SubscriberActive subscriberActive = (SubscriberActive) o;
        return Objects.equals(this.id, subscriberActive.id) &&
                Objects.equals(this.version, subscriberActive.version) &&
                Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberActive.additionalAllowedPaymentMethodConfigurations) &&
                Objects.equals(this.billingAddress, subscriberActive.billingAddress) &&
                Objects.equals(this.description, subscriberActive.description) &&
                Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberActive.disallowedPaymentMethodConfigurations) &&
                Objects.equals(this.emailAddress, subscriberActive.emailAddress) &&
                Objects.equals(this.language, subscriberActive.language) &&
                Objects.equals(this.metaData, subscriberActive.metaData) &&
                Objects.equals(this.reference, subscriberActive.reference) &&
                Objects.equals(this.shippingAddress, subscriberActive.shippingAddress) && this.state == subscriberActive.state
                &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, metaData, reference, shippingAddress, state, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriberActive { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) +  "\n" +
            "    additionalAllowedPaymentMethodConfigurations: " +  toIndentedString(additionalAllowedPaymentMethodConfigurations) + " \n" +
            "    billingAddress: " +  toIndentedString(billingAddress) + " \n" +
            "    description: " + toIndentedString(description) +  "\n" +
            "    disallowedPaymentMethodConfigurations: " + toIndentedString(disallowedPaymentMethodConfigurations) + "\n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    language: " +  toIndentedString(language) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    reference: " + toIndentedString(reference) + " \n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) +  "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
        }


}

