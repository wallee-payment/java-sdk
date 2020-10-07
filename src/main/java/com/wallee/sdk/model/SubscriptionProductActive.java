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

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")

public class SubscriptionProductActive extends AbstractSubscriptionProductActive {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public SubscriptionProductActive id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SubscriptionProductActive version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionProductActive subscriptionProductActive = (SubscriptionProductActive) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProductActive.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProductActive.failedPaymentSuspensionPeriod) &&
                Objects.equals(this.name, subscriptionProductActive.name) &&
                Objects.equals(this.sortOrder, subscriptionProductActive.sortOrder) && this.state
                == subscriptionProductActive.state &&
                Objects.equals(this.id, subscriptionProductActive.id) &&
                Objects.equals(this.version, subscriptionProductActive.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, sortOrder, state, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionProductActive {\n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  "\n" +
            "    failedPaymentSuspensionPeriod: " + toIndentedString(failedPaymentSuspensionPeriod) +  "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    sortOrder: " + toIndentedString(sortOrder) +  "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

