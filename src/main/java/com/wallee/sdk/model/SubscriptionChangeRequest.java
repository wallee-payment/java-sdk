/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The subscription change request allows to change a subscription.
 */
@ApiModel(description = "The subscription change request allows to change a subscription.")

public class SubscriptionChangeRequest {
  
  @JsonProperty("componentConfigurations")
  protected List<SubscriptionComponentReferenceConfiguration> componentConfigurations = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("product")
  protected Long product = null;

  
  @JsonProperty("respectTerminationPeriod")
  protected Boolean respectTerminationPeriod = null;

  
  @JsonProperty("selectedComponents")
  protected List<SubscriptionProductComponentReference> selectedComponents = null;

  
  @JsonProperty("subscription")
  protected Long subscription = null;

  
  
  public SubscriptionChangeRequest componentConfigurations(List<SubscriptionComponentReferenceConfiguration> componentConfigurations) {
    this.componentConfigurations = componentConfigurations;
    return this;
  }

  public SubscriptionChangeRequest addComponentConfigurationsItem(SubscriptionComponentReferenceConfiguration componentConfigurationsItem) {
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

  
  public SubscriptionChangeRequest currency(String currency) {
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

  
  public SubscriptionChangeRequest product(Long product) {
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

  
  public SubscriptionChangeRequest respectTerminationPeriod(Boolean respectTerminationPeriod) {
    this.respectTerminationPeriod = respectTerminationPeriod;
    return this;
  }

   /**
   * The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
   * @return respectTerminationPeriod
  **/
  @ApiModelProperty(value = "The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.")
  public Boolean isRespectTerminationPeriod() {
    return respectTerminationPeriod;
  }

  public void setRespectTerminationPeriod(Boolean respectTerminationPeriod) {
    this.respectTerminationPeriod = respectTerminationPeriod;
  }

  
  public SubscriptionChangeRequest selectedComponents(List<SubscriptionProductComponentReference> selectedComponents) {
    this.selectedComponents = selectedComponents;
    return this;
  }

  public SubscriptionChangeRequest addSelectedComponentsItem(SubscriptionProductComponentReference selectedComponentsItem) {
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

  
  public SubscriptionChangeRequest subscription(Long subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSubscription() {
    return subscription;
  }

  public void setSubscription(Long subscription) {
    this.subscription = subscription;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionChangeRequest subscriptionChangeRequest = (SubscriptionChangeRequest) o;
    return Objects.equals(this.componentConfigurations, subscriptionChangeRequest.componentConfigurations) &&
        Objects.equals(this.currency, subscriptionChangeRequest.currency) &&
        Objects.equals(this.product, subscriptionChangeRequest.product) &&
        Objects.equals(this.respectTerminationPeriod, subscriptionChangeRequest.respectTerminationPeriod) &&
        Objects.equals(this.selectedComponents, subscriptionChangeRequest.selectedComponents) &&
        Objects.equals(this.subscription, subscriptionChangeRequest.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentConfigurations, currency, product, respectTerminationPeriod, selectedComponents, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionChangeRequest {\n");
    
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    respectTerminationPeriod: ").append(toIndentedString(respectTerminationPeriod)).append("\n");
    sb.append("    selectedComponents: ").append(toIndentedString(selectedComponents)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

