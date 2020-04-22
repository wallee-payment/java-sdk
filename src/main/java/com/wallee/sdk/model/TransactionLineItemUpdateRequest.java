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
import com.wallee.sdk.model.LineItemCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class TransactionLineItemUpdateRequest {
  
  @JsonProperty("newLineItems")
  protected List<LineItemCreate> newLineItems = null;

  
  @JsonProperty("transactionId")
  protected Long transactionId = null;

  
  
  public TransactionLineItemUpdateRequest newLineItems(List<LineItemCreate> newLineItems) {
    this.newLineItems = newLineItems;
    return this;
  }

  public TransactionLineItemUpdateRequest addNewLineItemsItem(LineItemCreate newLineItemsItem) {
    if (this.newLineItems == null) {
      this.newLineItems = new ArrayList<>();
    }
    this.newLineItems.add(newLineItemsItem);
    return this;
  }

   /**
   * 
   * @return newLineItems
  **/
  @ApiModelProperty(value = "")
  public List<LineItemCreate> getNewLineItems() {
    return newLineItems;
  }

  public void setNewLineItems(List<LineItemCreate> newLineItems) {
    this.newLineItems = newLineItems;
  }

  
  public TransactionLineItemUpdateRequest transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * 
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionLineItemUpdateRequest transactionLineItemUpdateRequest = (TransactionLineItemUpdateRequest) o;
    return Objects.equals(this.newLineItems, transactionLineItemUpdateRequest.newLineItems) &&
        Objects.equals(this.transactionId, transactionLineItemUpdateRequest.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newLineItems, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLineItemUpdateRequest {\n");
    
    sb.append("    newLineItems: ").append(toIndentedString(newLineItems)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

