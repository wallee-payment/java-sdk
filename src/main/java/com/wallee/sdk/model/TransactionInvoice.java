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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.Environment;
import com.wallee.sdk.model.enums.TransactionInvoiceState;

/**
 * The transaction invoice represents the invoice document for a particular transaction.
 */
@ApiModel(description = "The transaction invoice represents the invoice document for a particular transaction.")

public class TransactionInvoice extends TransactionAwareEntity {
  
  @JsonProperty("amount")
  protected BigDecimal amount;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress;

  
  @JsonProperty("completion")
  protected TransactionCompletion completion;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("derecognizedBy")
  protected Long derecognizedBy;

  
  @JsonProperty("derecognizedOn")
  protected OffsetDateTime derecognizedOn;

  
  @JsonProperty("dueOn")
  protected OffsetDateTime dueOn;

  
  @JsonProperty("environment")
  protected Environment environment;

  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("language")
  protected String language;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems;

  
  @JsonProperty("merchantReference")
  protected String merchantReference;

  
  @JsonProperty("outstandingAmount")
  protected BigDecimal outstandingAmount;

  
  @JsonProperty("paidOn")
  protected OffsetDateTime paidOn;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId;

  
  @JsonProperty("state")
  protected TransactionInvoiceState state;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount;

  
  @JsonProperty("timeZone")
  protected String timeZone;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * 
   * @return completion
  **/
  @ApiModelProperty(value = "")
  public TransactionCompletion getCompletion() {
    return completion;
  }

  
   /**
   * The date on which the invoice is created on.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date on which the invoice is created on.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The id of the user which marked the invoice as derecognized.
   * @return derecognizedBy
  **/
  @ApiModelProperty(value = "The id of the user which marked the invoice as derecognized.")
  public Long getDerecognizedBy() {
    return derecognizedBy;
  }

  
   /**
   * The date on which the invoice is marked as derecognized.
   * @return derecognizedOn
  **/
  @ApiModelProperty(value = "The date on which the invoice is marked as derecognized.")
  public OffsetDateTime getDerecognizedOn() {
    return derecognizedOn;
  }

  
   /**
   * The date on which the invoice should be paid on.
   * @return dueOn
  **/
  @ApiModelProperty(value = "The date on which the invoice should be paid on.")
  public OffsetDateTime getDueOn() {
    return dueOn;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public Environment getEnvironment() {
    return environment;
  }

  
   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  
   /**
   * 
   * @return merchantReference
  **/
  @ApiModelProperty(value = "")
  public String getMerchantReference() {
    return merchantReference;
  }

  
   /**
   * The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.
   * @return outstandingAmount
  **/
  @ApiModelProperty(value = "The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.")
  public BigDecimal getOutstandingAmount() {
    return outstandingAmount;
  }

  
   /**
   * The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.
   * @return paidOn
  **/
  @ApiModelProperty(value = "The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.")
  public OffsetDateTime getPaidOn() {
    return paidOn;
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
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public TransactionInvoiceState getState() {
    return state;
  }

  
   /**
   * 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInvoice transactionInvoice = (TransactionInvoice) o;
    return Objects.equals(this.id, transactionInvoice.id) &&
        Objects.equals(this.linkedSpaceId, transactionInvoice.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, transactionInvoice.linkedTransaction) &&
        Objects.equals(this.amount, transactionInvoice.amount) &&
        Objects.equals(this.billingAddress, transactionInvoice.billingAddress) &&
        Objects.equals(this.completion, transactionInvoice.completion) &&
        Objects.equals(this.createdOn, transactionInvoice.createdOn) &&
        Objects.equals(this.derecognizedBy, transactionInvoice.derecognizedBy) &&
        Objects.equals(this.derecognizedOn, transactionInvoice.derecognizedOn) &&
        Objects.equals(this.dueOn, transactionInvoice.dueOn) && this.environment == transactionInvoice.environment &&
        Objects.equals(this.externalId, transactionInvoice.externalId) &&
        Objects.equals(this.language, transactionInvoice.language) &&
        Objects.equals(this.lineItems, transactionInvoice.lineItems) &&
        Objects.equals(this.merchantReference, transactionInvoice.merchantReference) &&
        Objects.equals(this.outstandingAmount, transactionInvoice.outstandingAmount) &&
        Objects.equals(this.paidOn, transactionInvoice.paidOn) &&
        Objects.equals(this.plannedPurgeDate, transactionInvoice.plannedPurgeDate) &&
        Objects.equals(this.spaceViewId, transactionInvoice.spaceViewId) && this.state == transactionInvoice.state &&
        Objects.equals(this.taxAmount, transactionInvoice.taxAmount) &&
        Objects.equals(this.timeZone, transactionInvoice.timeZone) &&
        Objects.equals(this.version, transactionInvoice.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, amount, billingAddress, completion, createdOn, derecognizedBy, derecognizedOn, dueOn, environment, externalId, language, lineItems, merchantReference, outstandingAmount, paidOn, plannedPurgeDate, spaceViewId, state, taxAmount, timeZone, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoice {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    derecognizedBy: ").append(toIndentedString(derecognizedBy)).append("\n");
    sb.append("    derecognizedOn: ").append(toIndentedString(derecognizedOn)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    paidOn: ").append(toIndentedString(paidOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

