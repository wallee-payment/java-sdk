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
     *
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
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriberActive {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

