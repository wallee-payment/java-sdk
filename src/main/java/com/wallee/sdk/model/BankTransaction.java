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
   * The adjustments applied on this bank transaction.
   * @return adjustments
  **/
  @ApiModelProperty(value = "The adjustments applied on this bank transaction.")
  public List<PaymentAdjustment> getAdjustments() {
    return adjustments;
  }

  
   /**
   * The created by indicates the user which has created the bank transaction.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The created by indicates the user which has created the bank transaction.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The currency bank account which is used to handle money flow.
   * @return currencyBankAccount
  **/
  @ApiModelProperty(value = "The currency bank account which is used to handle money flow.")
  public CurrencyBankAccount getCurrencyBankAccount() {
    return currencyBankAccount;
  }

  
   /**
   * 
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * 
   * @return flowDirection
  **/
  @ApiModelProperty(value = "")
  public BankTransactionFlowDirection getFlowDirection() {
    return flowDirection;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The posting amount indicates the amount including adjustments.
   * @return postingAmount
  **/
  @ApiModelProperty(value = "The posting amount indicates the amount including adjustments.")
  public BigDecimal getPostingAmount() {
    return postingAmount;
  }

  
   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  
   /**
   * 
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Long getSource() {
    return source;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public BankTransactionState getState() {
    return state;
  }

  
   /**
   * 
   * @return totalAdjustmentAmountIncludingTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalAdjustmentAmountIncludingTax() {
    return totalAdjustmentAmountIncludingTax;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  
   /**
   * 
   * @return valueAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getValueAmount() {
    return valueAmount;
  }

  
   /**
   * The value date describes the date the amount is effective on the account.
   * @return valueDate
  **/
  @ApiModelProperty(value = "The value date describes the date the amount is effective on the account.")
  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    return Objects.hash(adjustments, createdBy, createdOn, currencyBankAccount, externalId, flowDirection, id, linkedSpaceId, plannedPurgeDate, postingAmount, reference, source, state, totalAdjustmentAmountIncludingTax, type, valueAmount, valueDate, version);
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

