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

public class TransactionLineItemVersionCreate {
  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = new ArrayList<>();

  
  @JsonProperty("transaction")
  protected Long transaction = null;

  
  
  public TransactionLineItemVersionCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public TransactionLineItemVersionCreate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TransactionLineItemVersionCreate addLineItemsItem(LineItemCreate lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public TransactionLineItemVersionCreate transaction(Long transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTransaction() {
    return transaction;
  }

  public void setTransaction(Long transaction) {
    this.transaction = transaction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionLineItemVersionCreate transactionLineItemVersionCreate = (TransactionLineItemVersionCreate) o;
    return Objects.equals(this.externalId, transactionLineItemVersionCreate.externalId) &&
        Objects.equals(this.lineItems, transactionLineItemVersionCreate.lineItems) &&
        Objects.equals(this.transaction, transactionLineItemVersionCreate.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, lineItems, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLineItemVersionCreate {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

