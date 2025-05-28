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
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CompletionLineItem {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  
   /**
   * The total amount of the line item to be captured, including taxes.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount of the line item to be captured, including taxes.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The number of items to be captured.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items to be captured.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * The unique identifier of the line item within the set of line items.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "The unique identifier of the line item within the set of line items.")
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

