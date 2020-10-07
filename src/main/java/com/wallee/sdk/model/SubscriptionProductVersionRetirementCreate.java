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


@ApiModel(description = "")

public class SubscriptionProductVersionRetirementCreate extends Indentable {
  
  @JsonProperty("productVersion")
  protected Long productVersion;

  
  @JsonProperty("respectTerminiationPeriodsEnabled")
  protected Boolean respectTerminiationPeriodsEnabled;

  
  @JsonProperty("targetProduct")
  protected Long targetProduct;

  
  
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
  public boolean equals(Object o) {
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



}

