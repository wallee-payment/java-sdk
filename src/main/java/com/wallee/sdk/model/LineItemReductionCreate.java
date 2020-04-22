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
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:20:41.240+02:00")
public class LineItemReductionCreate {
  
  @JsonProperty("lineItemUniqueId")
  protected String lineItemUniqueId = null;

  
  @JsonProperty("quantityReduction")
  protected BigDecimal quantityReduction = null;

  
  @JsonProperty("unitPriceReduction")
  protected BigDecimal unitPriceReduction = null;

  
  
  public LineItemReductionCreate lineItemUniqueId(String lineItemUniqueId) {
    this.lineItemUniqueId = lineItemUniqueId;
    return this;
  }

   /**
   * The unique id identifies the line item on which the reduction is applied on.
   * @return lineItemUniqueId
  **/
  @ApiModelProperty(required = true, value = "The unique id identifies the line item on which the reduction is applied on.")
  public String getLineItemUniqueId() {
    return lineItemUniqueId;
  }

  public void setLineItemUniqueId(String lineItemUniqueId) {
    this.lineItemUniqueId = lineItemUniqueId;
  }

  
  public LineItemReductionCreate quantityReduction(BigDecimal quantityReduction) {
    this.quantityReduction = quantityReduction;
    return this;
  }

   /**
   * 
   * @return quantityReduction
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getQuantityReduction() {
    return quantityReduction;
  }

  public void setQuantityReduction(BigDecimal quantityReduction) {
    this.quantityReduction = quantityReduction;
  }

  
  public LineItemReductionCreate unitPriceReduction(BigDecimal unitPriceReduction) {
    this.unitPriceReduction = unitPriceReduction;
    return this;
  }

   /**
   * 
   * @return unitPriceReduction
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getUnitPriceReduction() {
    return unitPriceReduction;
  }

  public void setUnitPriceReduction(BigDecimal unitPriceReduction) {
    this.unitPriceReduction = unitPriceReduction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemReductionCreate lineItemReductionCreate = (LineItemReductionCreate) o;
    return Objects.equals(this.lineItemUniqueId, lineItemReductionCreate.lineItemUniqueId) &&
        Objects.equals(this.quantityReduction, lineItemReductionCreate.quantityReduction) &&
        Objects.equals(this.unitPriceReduction, lineItemReductionCreate.unitPriceReduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemUniqueId, quantityReduction, unitPriceReduction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemReductionCreate {\n");
    
    sb.append("    lineItemUniqueId: ").append(toIndentedString(lineItemUniqueId)).append("\n");
    sb.append("    quantityReduction: ").append(toIndentedString(quantityReduction)).append("\n");
    sb.append("    unitPriceReduction: ").append(toIndentedString(unitPriceReduction)).append("\n");
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

