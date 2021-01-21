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
import com.wallee.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAdjustment {
  
  @JsonProperty("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("rateInPercentage")
  protected BigDecimal rateInPercentage = null;

  
  @JsonProperty("tax")
  protected Tax tax = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  
   /**
   * 
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * The total amount of this adjustment including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "The total amount of this adjustment including taxes.")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  
   /**
   * The rate in percentage is the rate on which the adjustment amount was calculated with.
   * @return rateInPercentage
  **/
  @ApiModelProperty(value = "The rate in percentage is the rate on which the adjustment amount was calculated with.")
  public BigDecimal getRateInPercentage() {
    return rateInPercentage;
  }

  
   /**
   * 
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public Tax getTax() {
    return tax;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdjustment paymentAdjustment = (PaymentAdjustment) o;
    return Objects.equals(this.amountExcludingTax, paymentAdjustment.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, paymentAdjustment.amountIncludingTax) &&
        Objects.equals(this.rateInPercentage, paymentAdjustment.rateInPercentage) &&
        Objects.equals(this.tax, paymentAdjustment.tax) &&
        Objects.equals(this.type, paymentAdjustment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTax, amountIncludingTax, rateInPercentage, tax, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAdjustment {\n");
    
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    rateInPercentage: ").append(toIndentedString(rateInPercentage)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

