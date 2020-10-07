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

public class CompletionLineItem {
  
  @JsonProperty("amount")
  protected BigDecimal amount;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity;

  
  @JsonProperty("uniqueId")
  protected String uniqueId;

  
  
   /**
   * The total amount of the line item including any tax.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount of the line item including any tax.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The quantity of the line item which should be completed.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of the line item which should be completed.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * The unique id identifies the line item on which the capture is applied on.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "The unique id identifies the line item on which the capture is applied on.")
  public String getUniqueId() {
    return uniqueId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionLineItem completionLineItem = (CompletionLineItem) o;
    return Objects.equals(this.amount, completionLineItem.amount) &&
        Objects.equals(this.quantity, completionLineItem.quantity) &&
        Objects.equals(this.uniqueId, completionLineItem.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, quantity, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionLineItem {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

