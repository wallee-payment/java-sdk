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
import com.wallee.sdk.model.LineItemReductionCreate;
import com.wallee.sdk.model.RefundType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A refund is a credit issued to the customer, which can be initiated either by the merchant or by the customer as a reversal.
 */
@ApiModel(description = "A refund is a credit issued to the customer, which can be initiated either by the merchant or by the customer as a reversal.")

public class RefundCreate {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("completion")
  protected Long completion = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("reductions")
  protected List<LineItemReductionCreate> reductions = null;

  
  @JsonProperty("transaction")
  protected Long transaction = null;

  
  @JsonProperty("type")
  protected RefundType type = null;

  
  
  public RefundCreate amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total monetary amount of the refund, representing the exact credit issued to the customer.
   * @return amount
  **/
  @ApiModelProperty(value = "The total monetary amount of the refund, representing the exact credit issued to the customer.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  
  public RefundCreate completion(Long completion) {
    this.completion = completion;
    return this;
  }

   /**
   * The transaction completion that the refund belongs to.
   * @return completion
  **/
  @ApiModelProperty(value = "The transaction completion that the refund belongs to.")
  public Long getCompletion() {
    return completion;
  }

  public void setCompletion(Long completion) {
    this.completion = completion;
  }

  
  public RefundCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public RefundCreate merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * The merchant&#39;s reference used to identify the refund.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the refund.")
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  
  public RefundCreate reductions(List<LineItemReductionCreate> reductions) {
    this.reductions = reductions;
    return this;
  }

  public RefundCreate addReductionsItem(LineItemReductionCreate reductionsItem) {
    if (this.reductions == null) {
      this.reductions = new ArrayList<>();
    }
    this.reductions.add(reductionsItem);
    return this;
  }

   /**
   * The reductions applied on the original transaction items, detailing specific adjustments associated with the refund.
   * @return reductions
  **/
  @ApiModelProperty(value = "The reductions applied on the original transaction items, detailing specific adjustments associated with the refund.")
  public List<LineItemReductionCreate> getReductions() {
    return reductions;
  }

  public void setReductions(List<LineItemReductionCreate> reductions) {
    this.reductions = reductions;
  }

  
  public RefundCreate transaction(Long transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * The transaction that the refund belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the refund belongs to.")
  public Long getTransaction() {
    return transaction;
  }

  public void setTransaction(Long transaction) {
    this.transaction = transaction;
  }

  
  public RefundCreate type(RefundType type) {
    this.type = type;
    return this;
  }

   /**
   * The type specifying the method and origin of the refund (e.g., initiated by the customer or merchant).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type specifying the method and origin of the refund (e.g., initiated by the customer or merchant).")
  public RefundType getType() {
    return type;
  }

  public void setType(RefundType type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundCreate refundCreate = (RefundCreate) o;
    return Objects.equals(this.amount, refundCreate.amount) &&
        Objects.equals(this.completion, refundCreate.completion) &&
        Objects.equals(this.externalId, refundCreate.externalId) &&
        Objects.equals(this.merchantReference, refundCreate.merchantReference) &&
        Objects.equals(this.reductions, refundCreate.reductions) &&
        Objects.equals(this.transaction, refundCreate.transaction) &&
        Objects.equals(this.type, refundCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, completion, externalId, merchantReference, reductions, transaction, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundCreate {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    reductions: ").append(toIndentedString(reductions)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

