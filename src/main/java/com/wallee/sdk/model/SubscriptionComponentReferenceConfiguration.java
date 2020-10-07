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

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The component reference configuration adjusts the product component for a particular subscription.
 */
@ApiModel(description = "The component reference configuration adjusts the product component for a particular subscription.")

public class SubscriptionComponentReferenceConfiguration {
  
  @JsonProperty("productComponentReferenceId")
  protected Long productComponentReferenceId = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  
  public SubscriptionComponentReferenceConfiguration productComponentReferenceId(Long productComponentReferenceId) {
    this.productComponentReferenceId = productComponentReferenceId;
    return this;
  }

   /**
   * 
   * @return productComponentReferenceId
  **/
  @ApiModelProperty(value = "")
  public Long getProductComponentReferenceId() {
    return productComponentReferenceId;
  }

  public void setProductComponentReferenceId(Long productComponentReferenceId) {
    this.productComponentReferenceId = productComponentReferenceId;
  }

  
  public SubscriptionComponentReferenceConfiguration quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionComponentReferenceConfiguration subscriptionComponentReferenceConfiguration = (SubscriptionComponentReferenceConfiguration) o;
    return Objects.equals(this.productComponentReferenceId, subscriptionComponentReferenceConfiguration.productComponentReferenceId) &&
        Objects.equals(this.quantity, subscriptionComponentReferenceConfiguration.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productComponentReferenceId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionComponentReferenceConfiguration {\n");
    
    sb.append("    productComponentReferenceId: ").append(toIndentedString(productComponentReferenceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

