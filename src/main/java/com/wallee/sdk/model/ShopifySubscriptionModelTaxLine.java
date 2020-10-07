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
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionModelTaxLine {
  
  @JsonProperty("rate")
  protected BigDecimal rate;

  
  @JsonProperty("title")
  protected String title;

  
  
  public ShopifySubscriptionModelTaxLine rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * 
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  
  public ShopifySubscriptionModelTaxLine title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionModelTaxLine shopifySubscriptionModelTaxLine = (ShopifySubscriptionModelTaxLine) o;
    return Objects.equals(this.rate, shopifySubscriptionModelTaxLine.rate) &&
        Objects.equals(this.title, shopifySubscriptionModelTaxLine.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionModelTaxLine {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

