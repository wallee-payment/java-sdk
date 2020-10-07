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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")

public class SubscriptionProductCreate extends AbstractSubscriptionProductActive {
  
  @JsonProperty("reference")
  protected String reference;

  
  
  public SubscriptionProductCreate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The product reference identifies the product for external systems. This field may contain the product&#39;s SKU.
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
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

