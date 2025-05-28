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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionInvoiceState;
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

public class TransactionInvoice {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("completion")
  protected TransactionCompletion completion = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("derecognizedBy")
  protected Long derecognizedBy = null;

  
  @JsonProperty("derecognizedOn")
  protected OffsetDateTime derecognizedOn = null;

  
  @JsonProperty("dueOn")
  protected OffsetDateTime dueOn = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("outstandingAmount")
  protected BigDecimal outstandingAmount = null;

  
  @JsonProperty("paidOn")
  protected OffsetDateTime paidOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionInvoiceState state = null;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The total sum of all line items on the invoice, including taxes.
   * @return amount
  **/
  @ApiModelProperty(value = "The total sum of all line items on the invoice, including taxes.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The address associated with the invoice, used for billing purposes.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address associated with the invoice, used for billing purposes.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * The transaction completion this object is linked to.
   * @return completion
  **/
  @ApiModelProperty(value = "The transaction completion this object is linked to.")
  public TransactionCompletion getCompletion() {
    return completion;
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
   * The ID of the user the invoice was derecognized by.
   * @return derecognizedBy
  **/
  @ApiModelProperty(value = "The ID of the user the invoice was derecognized by.")
  public Long getDerecognizedBy() {
    return derecognizedBy;
  }

  
   /**
   * The date and time when the invoice was derecognized, meaning it is no longer considered outstanding or valid in the system.
   * @return derecognizedOn
  **/
  @ApiModelProperty(value = "The date and time when the invoice was derecognized, meaning it is no longer considered outstanding or valid in the system.")
  public OffsetDateTime getDerecognizedOn() {
    return derecognizedOn;
  }

  
   /**
   * The due date for payment of the invoice.
   * @return dueOn
  **/
  @ApiModelProperty(value = "The due date for payment of the invoice.")
  public OffsetDateTime getDueOn() {
    return dueOn;
  }

  
   /**
   * The environment used when rendering resources.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment used when rendering resources.")
  public Environment getEnvironment() {
    return environment;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
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
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The invoiced line items that will appear on the invoice document.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The invoiced line items that will appear on the invoice document.")
  public List<LineItem> getLineItems() {
    return lineItems;
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
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
  }

  
   /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the invoice.")
  public String getMerchantReference() {
    return merchantReference;
  }

  
   /**
   * The remaining amount the buyer owes to the merchant. A negative value indicates the invoice has been overpaid.
   * @return outstandingAmount
  **/
  @ApiModelProperty(value = "The remaining amount the buyer owes to the merchant. A negative value indicates the invoice has been overpaid.")
  public BigDecimal getOutstandingAmount() {
    return outstandingAmount;
  }

  
   /**
   * The date and time when the invoice was recorded as paid. May differ from the actual payment date due to processing delays.
   * @return paidOn
  **/
  @ApiModelProperty(value = "The date and time when the invoice was recorded as paid. May differ from the actual payment date due to processing delays.")
  public OffsetDateTime getPaidOn() {
    return paidOn;
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
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public TransactionInvoiceState getState() {
    return state;
  }

  
   /**
   * The portion of the invoiced amount that corresponds to taxes.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The portion of the invoiced amount that corresponds to taxes.")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * The time zone that this object is associated with.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone that this object is associated with.")
  public String getTimeZone() {
    return timeZone;
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
    TransactionInvoice transactionInvoice = (TransactionInvoice) o;
    return Objects.equals(this.amount, transactionInvoice.amount) &&
        Objects.equals(this.billingAddress, transactionInvoice.billingAddress) &&
        Objects.equals(this.completion, transactionInvoice.completion) &&
        Objects.equals(this.createdOn, transactionInvoice.createdOn) &&
        Objects.equals(this.derecognizedBy, transactionInvoice.derecognizedBy) &&
        Objects.equals(this.derecognizedOn, transactionInvoice.derecognizedOn) &&
        Objects.equals(this.dueOn, transactionInvoice.dueOn) &&
        Objects.equals(this.environment, transactionInvoice.environment) &&
        Objects.equals(this.externalId, transactionInvoice.externalId) &&
        Objects.equals(this.id, transactionInvoice.id) &&
        Objects.equals(this.language, transactionInvoice.language) &&
        Objects.equals(this.lineItems, transactionInvoice.lineItems) &&
        Objects.equals(this.linkedSpaceId, transactionInvoice.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, transactionInvoice.linkedTransaction) &&
        Objects.equals(this.merchantReference, transactionInvoice.merchantReference) &&
        Objects.equals(this.outstandingAmount, transactionInvoice.outstandingAmount) &&
        Objects.equals(this.paidOn, transactionInvoice.paidOn) &&
        Objects.equals(this.plannedPurgeDate, transactionInvoice.plannedPurgeDate) &&
        Objects.equals(this.spaceViewId, transactionInvoice.spaceViewId) &&
        Objects.equals(this.state, transactionInvoice.state) &&
        Objects.equals(this.taxAmount, transactionInvoice.taxAmount) &&
        Objects.equals(this.timeZone, transactionInvoice.timeZone) &&
        Objects.equals(this.version, transactionInvoice.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billingAddress, completion, createdOn, derecognizedBy, derecognizedOn, dueOn, environment, externalId, id, language, lineItems, linkedSpaceId, linkedTransaction, merchantReference, outstandingAmount, paidOn, plannedPurgeDate, spaceViewId, state, taxAmount, timeZone, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoice {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    derecognizedBy: ").append(toIndentedString(derecognizedBy)).append("\n");
    sb.append("    derecognizedOn: ").append(toIndentedString(derecognizedOn)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

