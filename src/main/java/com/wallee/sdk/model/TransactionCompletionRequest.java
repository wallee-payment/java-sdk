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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class TransactionCompletionRequest extends Indentable {
  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("lastCompletion")
  protected Boolean lastCompletion;

  
  @JsonProperty("lineItems")
  protected List<CompletionLineItemCreate> lineItems;

  
  @JsonProperty("transactionId")
  protected Long transactionId;

  
  
  public TransactionCompletionRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public TransactionCompletionRequest lastCompletion(Boolean lastCompletion) {
    this.lastCompletion = lastCompletion;
    return this;
  }

   /**
   * The last completion flag indicates if this is the last completion. After the last completion is created no further completions can be issued.
   * @return lastCompletion
  **/
  @ApiModelProperty(required = true, value = "The last completion flag indicates if this is the last completion. After the last completion is created no further completions can be issued.")
  public Boolean isLastCompletion() {
    return lastCompletion;
  }

  public void setLastCompletion(Boolean lastCompletion) {
    this.lastCompletion = lastCompletion;
  }

  
  public TransactionCompletionRequest lineItems(List<CompletionLineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TransactionCompletionRequest addLineItemsItem(CompletionLineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items which will be used to complete the transaction.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items which will be used to complete the transaction.")
  public List<CompletionLineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CompletionLineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public TransactionCompletionRequest transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the transaction which should be completed.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction which should be completed.")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCompletionRequest transactionCompletionRequest = (TransactionCompletionRequest) o;
    return Objects.equals(this.externalId, transactionCompletionRequest.externalId) &&
        Objects.equals(this.lastCompletion, transactionCompletionRequest.lastCompletion) &&
        Objects.equals(this.lineItems, transactionCompletionRequest.lineItems) &&
        Objects.equals(this.transactionId, transactionCompletionRequest.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, lastCompletion, lineItems, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCompletionRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

