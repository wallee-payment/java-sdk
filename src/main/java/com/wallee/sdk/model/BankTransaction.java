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
import com.wallee.sdk.model.BankTransactionFlowDirection;
import com.wallee.sdk.model.BankTransactionState;
import com.wallee.sdk.model.CurrencyBankAccount;
import com.wallee.sdk.model.PaymentAdjustment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class BankTransaction {
  
  @JsonProperty("adjustments")
  protected List<PaymentAdjustment> adjustments = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currencyBankAccount")
  protected CurrencyBankAccount currencyBankAccount = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("flowDirection")
  protected BankTransactionFlowDirection flowDirection = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("paymentDate")
  protected OffsetDateTime paymentDate = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("postingAmount")
  protected BigDecimal postingAmount = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("source")
  protected Long source = null;

  
  @JsonProperty("state")
  protected BankTransactionState state = null;

  
  @JsonProperty("totalAdjustmentAmountIncludingTax")
  protected BigDecimal totalAdjustmentAmountIncludingTax = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  @JsonProperty("valueAmount")
  protected BigDecimal valueAmount = null;

  
  @JsonProperty("valueDate")
  protected OffsetDateTime valueDate = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Adjustments are changes made to the initial transaction amount, such as fees or corrections.
   * @return adjustments
  **/
  @ApiModelProperty(value = "Adjustments are changes made to the initial transaction amount, such as fees or corrections.")
  public List<PaymentAdjustment> getAdjustments() {
    return adjustments;
  }

  
   /**
   * The ID of the user the bank transaction was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the bank transaction was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The currency bank account that sends or receives money based on the bank transaction&#39;s flow direction.
   * @return currencyBankAccount
  **/
  @ApiModelProperty(value = "The currency bank account that sends or receives money based on the bank transaction's flow direction.")
  public CurrencyBankAccount getCurrencyBankAccount() {
    return currencyBankAccount;
  }

  
   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * Indicates the direction of a bank transaction, specifying whether the amount flows into or out of the bank account.
   * @return flowDirection
  **/
  @ApiModelProperty(value = "Indicates the direction of a bank transaction, specifying whether the amount flows into or out of the bank account.")
  public BankTransactionFlowDirection getFlowDirection() {
    return flowDirection;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The payment date specifies the date on which the payment was processed.
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The payment date specifies the date on which the payment was processed.")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The posting amount refers to the monetary value recorded for the bank transaction prior to any adjustments.
   * @return postingAmount
  **/
  @ApiModelProperty(value = "The posting amount refers to the monetary value recorded for the bank transaction prior to any adjustments.")
  public BigDecimal getPostingAmount() {
    return postingAmount;
  }

  
   /**
   * A unique reference to identify the bank transaction.
   * @return reference
  **/
  @ApiModelProperty(value = "A unique reference to identify the bank transaction.")
  public String getReference() {
    return reference;
  }

  
   /**
   * The source indicates how the bank transaction was created.
   * @return source
  **/
  @ApiModelProperty(value = "The source indicates how the bank transaction was created.")
  public Long getSource() {
    return source;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public BankTransactionState getState() {
    return state;
  }

  
   /**
   * Represents the total value of all adjustments to the bank transaction, including tax.
   * @return totalAdjustmentAmountIncludingTax
  **/
  @ApiModelProperty(value = "Represents the total value of all adjustments to the bank transaction, including tax.")
  public BigDecimal getTotalAdjustmentAmountIncludingTax() {
    return totalAdjustmentAmountIncludingTax;
  }

  
   /**
   * The bank transaction&#39;s type.
   * @return type
  **/
  @ApiModelProperty(value = "The bank transaction's type.")
  public Long getType() {
    return type;
  }

  
   /**
   * The value amount represents the net monetary value of the transaction after applicable deductions.
   * @return valueAmount
  **/
  @ApiModelProperty(value = "The value amount represents the net monetary value of the transaction after applicable deductions.")
  public BigDecimal getValueAmount() {
    return valueAmount;
  }

  
   /**
   * The value date indicates the date on which the transaction amount becomes effective.
   * @return valueDate
  **/
  @ApiModelProperty(value = "The value date indicates the date on which the transaction amount becomes effective.")
  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransaction bankTransaction = (BankTransaction) o;
    return Objects.equals(this.adjustments, bankTransaction.adjustments) &&
        Objects.equals(this.createdBy, bankTransaction.createdBy) &&
        Objects.equals(this.createdOn, bankTransaction.createdOn) &&
        Objects.equals(this.currencyBankAccount, bankTransaction.currencyBankAccount) &&
        Objects.equals(this.externalId, bankTransaction.externalId) &&
        Objects.equals(this.flowDirection, bankTransaction.flowDirection) &&
        Objects.equals(this.id, bankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, bankTransaction.linkedSpaceId) &&
        Objects.equals(this.paymentDate, bankTransaction.paymentDate) &&
        Objects.equals(this.plannedPurgeDate, bankTransaction.plannedPurgeDate) &&
        Objects.equals(this.postingAmount, bankTransaction.postingAmount) &&
        Objects.equals(this.reference, bankTransaction.reference) &&
        Objects.equals(this.source, bankTransaction.source) &&
        Objects.equals(this.state, bankTransaction.state) &&
        Objects.equals(this.totalAdjustmentAmountIncludingTax, bankTransaction.totalAdjustmentAmountIncludingTax) &&
        Objects.equals(this.type, bankTransaction.type) &&
        Objects.equals(this.valueAmount, bankTransaction.valueAmount) &&
        Objects.equals(this.valueDate, bankTransaction.valueDate) &&
        Objects.equals(this.version, bankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustments, createdBy, createdOn, currencyBankAccount, externalId, flowDirection, id, linkedSpaceId, paymentDate, plannedPurgeDate, postingAmount, reference, source, state, totalAdjustmentAmountIncludingTax, type, valueAmount, valueDate, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransaction {\n");
    
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currencyBankAccount: ").append(toIndentedString(currencyBankAccount)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    flowDirection: ").append(toIndentedString(flowDirection)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    postingAmount: ").append(toIndentedString(postingAmount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalAdjustmentAmountIncludingTax: ").append(toIndentedString(totalAdjustmentAmountIncludingTax)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueAmount: ").append(toIndentedString(valueAmount)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

