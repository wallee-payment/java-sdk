/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductRetirementCreate {
  
  @JsonProperty("product")
  protected Long product = null;

  
  @JsonProperty("respectTerminationPeriods")
  protected Boolean respectTerminationPeriods = null;

  
  @JsonProperty("targetProduct")
  protected Long targetProduct = null;

  
  
  public SubscriptionProductRetirementCreate product(Long product) {
    this.product = product;
    return this;
  }

   /**
   * The product that is to be retired.
   * @return product
  **/
  @ApiModelProperty(required = true, value = "The product that is to be retired.")
  public Long getProduct() {
    return product;
  }

  public void setProduct(Long product) {
    this.product = product;
  }

  
  public SubscriptionProductRetirementCreate respectTerminationPeriods(Boolean respectTerminationPeriods) {
    this.respectTerminationPeriods = respectTerminationPeriods;
    return this;
  }

   /**
   * Whether the subscriptions&#39; termination periods should be respected.
   * @return respectTerminationPeriods
  **/
  @ApiModelProperty(value = "Whether the subscriptions' termination periods should be respected.")
  public Boolean isRespectTerminationPeriods() {
    return respectTerminationPeriods;
  }

  public void setRespectTerminationPeriods(Boolean respectTerminationPeriods) {
    this.respectTerminationPeriods = respectTerminationPeriods;
  }

  
  public SubscriptionProductRetirementCreate targetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
    return this;
  }

   /**
   * The product to which the subscriptions with the retiring product are to be migrated. If none is defined, the subscriptions are terminated.
   * @return targetProduct
  **/
  @ApiModelProperty(value = "The product to which the subscriptions with the retiring product are to be migrated. If none is defined, the subscriptions are terminated.")
  public Long getTargetProduct() {
    return targetProduct;
  }

  public void setTargetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductRetirementCreate subscriptionProductRetirementCreate = (SubscriptionProductRetirementCreate) o;
    return Objects.equals(this.product, subscriptionProductRetirementCreate.product) &&
        Objects.equals(this.respectTerminationPeriods, subscriptionProductRetirementCreate.respectTerminationPeriods) &&
        Objects.equals(this.targetProduct, subscriptionProductRetirementCreate.targetProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, respectTerminationPeriods, targetProduct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductRetirementCreate {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    respectTerminationPeriods: ").append(toIndentedString(respectTerminationPeriods)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

