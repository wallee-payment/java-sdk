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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class CompletionLineItemCreate {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  
  public CompletionLineItemCreate amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the line item including any tax.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The total amount of the line item including any tax.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  
  public CompletionLineItemCreate quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the line item which should be completed.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of the line item which should be completed.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  
  public CompletionLineItemCreate uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * The unique id identifies the line item on which the capture is applied on.
   * @return uniqueId
  **/
  @ApiModelProperty(required = true, value = "The unique id identifies the line item on which the capture is applied on.")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionLineItemCreate completionLineItemCreate = (CompletionLineItemCreate) o;
    return Objects.equals(this.amount, completionLineItemCreate.amount) &&
        Objects.equals(this.quantity, completionLineItemCreate.quantity) &&
        Objects.equals(this.uniqueId, completionLineItemCreate.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, quantity, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionLineItemCreate {\n");
    
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

