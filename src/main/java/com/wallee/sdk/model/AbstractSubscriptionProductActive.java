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
import com.wallee.sdk.model.enums.SubscriptionProductState;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AbstractSubscriptionProductActive
 */

public class AbstractSubscriptionProductActive extends Indentable {

    @JsonProperty("allowedPaymentMethodConfigurations")
    protected List<Long> allowedPaymentMethodConfigurations;


    @JsonProperty("failedPaymentSuspensionPeriod")
    protected String failedPaymentSuspensionPeriod;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    @JsonProperty("state")
    protected SubscriptionProductState state;


    public AbstractSubscriptionProductActive allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
        this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
        return this;
    }

    public AbstractSubscriptionProductActive addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
        if (this.allowedPaymentMethodConfigurations == null) {
            this.allowedPaymentMethodConfigurations = new ArrayList<>();
        }
        this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
        return this;
    }

    /**
     * The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.
     *
     * @return allowedPaymentMethodConfigurations
     **/
    @ApiModelProperty(value = "The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.")
    public List<Long> getAllowedPaymentMethodConfigurations() {
        return allowedPaymentMethodConfigurations;
    }

    public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
        this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    }


    public AbstractSubscriptionProductActive failedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
        this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
        return this;
    }

    /**
     * When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.
     *
     * @return failedPaymentSuspensionPeriod
     **/
    @ApiModelProperty(value = "When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.")
    public String getFailedPaymentSuspensionPeriod() {
        return failedPaymentSuspensionPeriod;
    }

    public void setFailedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
        this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
    }


    public AbstractSubscriptionProductActive name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AbstractSubscriptionProductActive sortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.
     *
     * @return sortOrder
     **/
    @ApiModelProperty(value = "The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    public AbstractSubscriptionProductActive state(SubscriptionProductState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductState getState() {
        return state;
    }

    public void setState(SubscriptionProductState state) {
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
        AbstractSubscriptionProductActive abstractSubscriptionProductActive = (AbstractSubscriptionProductActive) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, abstractSubscriptionProductActive.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.failedPaymentSuspensionPeriod, abstractSubscriptionProductActive.failedPaymentSuspensionPeriod) &&
                Objects.equals(this.name, abstractSubscriptionProductActive.name) &&
                Objects.equals(this.sortOrder, abstractSubscriptionProductActive.sortOrder) && this.state
                == abstractSubscriptionProductActive.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, sortOrder, state);
    }


    @Override
    public String toString() {

        return "class AbstractSubscriptionProductActive { \n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) + " \n" +
            "    failedPaymentSuspensionPeriod: " + toIndentedString(failedPaymentSuspensionPeriod) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    sortOrder: " + toIndentedString(sortOrder) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
    }

}

