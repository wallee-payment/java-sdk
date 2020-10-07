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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).
 */
@ApiModel(description = "The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).")

public class RefundCreate {
  
  @JsonProperty("amount")
  protected BigDecimal amount;

  
  @JsonProperty("completion")
  protected Long completion;

  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("merchantReference")
  protected String merchantReference;

  
  @JsonProperty("reductions")
  protected List<LineItemReductionCreate> reductions;

  
  @JsonProperty("transaction")
  protected Long transaction;

  
  @JsonProperty("type")
  protected RefundType type;

  
  
  public RefundCreate amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return completion
  **/
  @ApiModelProperty(value = "")
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
   * The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.")
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
   * 
   * @return merchantReference
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return reductions
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
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
        Objects.equals(this.transaction, refundCreate.transaction) && this.type == refundCreate.type;
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

