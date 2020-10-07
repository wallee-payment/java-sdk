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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The subscription create request holds all the data required to create a new subscription.
 */
@ApiModel(description = "The subscription create request holds all the data required to create a new subscription.")

public class SubscriptionCreateRequest extends Indentable {

    @JsonProperty("componentConfigurations")
    protected List<SubscriptionComponentReferenceConfiguration> componentConfigurations;


    @JsonProperty("currency")
    protected String currency;


    @JsonProperty("product")
    protected Long product;


    @JsonProperty("selectedComponents")
    protected List<SubscriptionProductComponentReference> selectedComponents;


    @JsonProperty("subscription")
    protected SubscriptionPending subscription;


    public SubscriptionCreateRequest componentConfigurations(List<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
        this.componentConfigurations = componentConfigurations;
        return this;
    }

    public SubscriptionCreateRequest addComponentConfigurationsItem(SubscriptionComponentReferenceConfiguration componentConfigurationsItem) {
        if (this.componentConfigurations == null) {
            this.componentConfigurations = new ArrayList<>();
        }
        this.componentConfigurations.add(componentConfigurationsItem);
        return this;
    }

    /**
     *
     * @return componentConfigurations
     **/
    @ApiModelProperty(value = "")
    public List<SubscriptionComponentReferenceConfiguration> getComponentConfigurations() {
        return componentConfigurations;
    }

    public void setComponentConfigurations(List<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
        this.componentConfigurations = componentConfigurations;
    }


    public SubscriptionCreateRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *
     * @return currency
     **/
    @ApiModelProperty(required = true, value = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public SubscriptionCreateRequest product(Long product) {
        this.product = product;
        return this;
    }

    /**
     * The subscription has to be linked with a product.
     * @return product
     **/
    @ApiModelProperty(required = true, value = "The subscription has to be linked with a product.")
    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }


    public SubscriptionCreateRequest selectedComponents(List<SubscriptionProductComponentReference> selectedComponents) {
        this.selectedComponents = selectedComponents;
        return this;
    }

    public SubscriptionCreateRequest addSelectedComponentsItem(SubscriptionProductComponentReference selectedComponentsItem) {
        if (this.selectedComponents == null) {
            this.selectedComponents = new ArrayList<>();
        }
        this.selectedComponents.add(selectedComponentsItem);
        return this;
    }

    /**
     *
     * @return selectedComponents
     **/
    @ApiModelProperty(value = "")
    public List<SubscriptionProductComponentReference> getSelectedComponents() {
        return selectedComponents;
    }

    public void setSelectedComponents(List<SubscriptionProductComponentReference> selectedComponents) {
        this.selectedComponents = selectedComponents;
    }


    public SubscriptionCreateRequest subscription(SubscriptionPending subscription) {
        this.subscription = subscription;
        return this;
    }

    /**
     *
     * @return subscription
     **/
    @ApiModelProperty(required = true, value = "")
    public SubscriptionPending getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionPending subscription) {
        this.subscription = subscription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionCreateRequest subscriptionCreateRequest = (SubscriptionCreateRequest) o;
        return Objects.equals(this.componentConfigurations, subscriptionCreateRequest.componentConfigurations) &&
                Objects.equals(this.currency, subscriptionCreateRequest.currency) &&
                Objects.equals(this.product, subscriptionCreateRequest.product) &&
                Objects.equals(this.selectedComponents, subscriptionCreateRequest.selectedComponents) &&
                Objects.equals(this.subscription, subscriptionCreateRequest.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentConfigurations, currency, product, selectedComponents, subscription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionCreateRequest {\n");

        sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    selectedComponents: ").append(toIndentedString(selectedComponents)).append("\n");
        sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

