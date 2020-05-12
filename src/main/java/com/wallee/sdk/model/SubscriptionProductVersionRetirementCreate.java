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

public class SubscriptionProductVersionRetirementCreate {
  
  @JsonProperty("productVersion")
  protected Long productVersion = null;

  
  @JsonProperty("respectTerminiationPeriodsEnabled")
  protected Boolean respectTerminiationPeriodsEnabled = null;

  
  @JsonProperty("targetProduct")
  protected Long targetProduct = null;

  
  
  public SubscriptionProductVersionRetirementCreate productVersion(Long productVersion) {
    this.productVersion = productVersion;
    return this;
  }

   /**
   * 
   * @return productVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(Long productVersion) {
    this.productVersion = productVersion;
  }

  
  public SubscriptionProductVersionRetirementCreate respectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
    this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
    return this;
  }

   /**
   * 
   * @return respectTerminiationPeriodsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isRespectTerminiationPeriodsEnabled() {
    return respectTerminiationPeriodsEnabled;
  }

  public void setRespectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
    this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
  }

  
  public SubscriptionProductVersionRetirementCreate targetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
    return this;
  }

   /**
   * 
   * @return targetProduct
  **/
  @ApiModelProperty(value = "")
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
    SubscriptionProductVersionRetirementCreate subscriptionProductVersionRetirementCreate = (SubscriptionProductVersionRetirementCreate) o;
    return Objects.equals(this.productVersion, subscriptionProductVersionRetirementCreate.productVersion) &&
        Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductVersionRetirementCreate.respectTerminiationPeriodsEnabled) &&
        Objects.equals(this.targetProduct, subscriptionProductVersionRetirementCreate.targetProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVersion, respectTerminiationPeriodsEnabled, targetProduct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersionRetirementCreate {\n");
    
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
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

