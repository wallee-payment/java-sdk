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
import com.wallee.sdk.model.InvoiceReimbursementState;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentInitiationAdviceFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class InvoiceReimbursement {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("discardedBy")
  protected Long discardedBy = null;

  
  @JsonProperty("discardedOn")
  protected OffsetDateTime discardedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("paymentConnectorConfiguration")
  protected PaymentConnectorConfiguration paymentConnectorConfiguration = null;

  
  @JsonProperty("paymentInitiationAdviceFile")
  protected PaymentInitiationAdviceFile paymentInitiationAdviceFile = null;

  
  @JsonProperty("processedBy")
  protected Long processedBy = null;

  
  @JsonProperty("processedOn")
  protected OffsetDateTime processedOn = null;

  
  @JsonProperty("recipientCity")
  protected String recipientCity = null;

  
  @JsonProperty("recipientCountry")
  protected String recipientCountry = null;

  
  @JsonProperty("recipientFamilyName")
  protected String recipientFamilyName = null;

  
  @JsonProperty("recipientGivenName")
  protected String recipientGivenName = null;

  
  @JsonProperty("recipientIban")
  protected String recipientIban = null;

  
  @JsonProperty("recipientPostcode")
  protected String recipientPostcode = null;

  
  @JsonProperty("recipientStreet")
  protected String recipientStreet = null;

  
  @JsonProperty("senderIban")
  protected String senderIban = null;

  
  @JsonProperty("state")
  protected InvoiceReimbursementState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
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
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * 
   * @return discardedBy
  **/
  @ApiModelProperty(value = "")
  public Long getDiscardedBy() {
    return discardedBy;
  }

  
   /**
   * 
   * @return discardedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
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
   * 
   * @return paymentConnectorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }

  
   /**
   * 
   * @return paymentInitiationAdviceFile
  **/
  @ApiModelProperty(value = "")
  public PaymentInitiationAdviceFile getPaymentInitiationAdviceFile() {
    return paymentInitiationAdviceFile;
  }

  
   /**
   * 
   * @return processedBy
  **/
  @ApiModelProperty(value = "")
  public Long getProcessedBy() {
    return processedBy;
  }

  
   /**
   * 
   * @return processedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessedOn() {
    return processedOn;
  }

  
   /**
   * 
   * @return recipientCity
  **/
  @ApiModelProperty(value = "")
  public String getRecipientCity() {
    return recipientCity;
  }

  
   /**
   * 
   * @return recipientCountry
  **/
  @ApiModelProperty(value = "")
  public String getRecipientCountry() {
    return recipientCountry;
  }

  
   /**
   * 
   * @return recipientFamilyName
  **/
  @ApiModelProperty(value = "")
  public String getRecipientFamilyName() {
    return recipientFamilyName;
  }

  
   /**
   * 
   * @return recipientGivenName
  **/
  @ApiModelProperty(value = "")
  public String getRecipientGivenName() {
    return recipientGivenName;
  }

  
   /**
   * 
   * @return recipientIban
  **/
  @ApiModelProperty(value = "")
  public String getRecipientIban() {
    return recipientIban;
  }

  
   /**
   * 
   * @return recipientPostcode
  **/
  @ApiModelProperty(value = "")
  public String getRecipientPostcode() {
    return recipientPostcode;
  }

  
   /**
   * 
   * @return recipientStreet
  **/
  @ApiModelProperty(value = "")
  public String getRecipientStreet() {
    return recipientStreet;
  }

  
   /**
   * 
   * @return senderIban
  **/
  @ApiModelProperty(value = "")
  public String getSenderIban() {
    return senderIban;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public InvoiceReimbursementState getState() {
    return state;
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
    InvoiceReimbursement invoiceReimbursement = (InvoiceReimbursement) o;
    return Objects.equals(this.amount, invoiceReimbursement.amount) &&
        Objects.equals(this.createdOn, invoiceReimbursement.createdOn) &&
        Objects.equals(this.currency, invoiceReimbursement.currency) &&
        Objects.equals(this.discardedBy, invoiceReimbursement.discardedBy) &&
        Objects.equals(this.discardedOn, invoiceReimbursement.discardedOn) &&
        Objects.equals(this.id, invoiceReimbursement.id) &&
        Objects.equals(this.linkedSpaceId, invoiceReimbursement.linkedSpaceId) &&
        Objects.equals(this.paymentConnectorConfiguration, invoiceReimbursement.paymentConnectorConfiguration) &&
        Objects.equals(this.paymentInitiationAdviceFile, invoiceReimbursement.paymentInitiationAdviceFile) &&
        Objects.equals(this.processedBy, invoiceReimbursement.processedBy) &&
        Objects.equals(this.processedOn, invoiceReimbursement.processedOn) &&
        Objects.equals(this.recipientCity, invoiceReimbursement.recipientCity) &&
        Objects.equals(this.recipientCountry, invoiceReimbursement.recipientCountry) &&
        Objects.equals(this.recipientFamilyName, invoiceReimbursement.recipientFamilyName) &&
        Objects.equals(this.recipientGivenName, invoiceReimbursement.recipientGivenName) &&
        Objects.equals(this.recipientIban, invoiceReimbursement.recipientIban) &&
        Objects.equals(this.recipientPostcode, invoiceReimbursement.recipientPostcode) &&
        Objects.equals(this.recipientStreet, invoiceReimbursement.recipientStreet) &&
        Objects.equals(this.senderIban, invoiceReimbursement.senderIban) &&
        Objects.equals(this.state, invoiceReimbursement.state) &&
        Objects.equals(this.version, invoiceReimbursement.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdOn, currency, discardedBy, discardedOn, id, linkedSpaceId, paymentConnectorConfiguration, paymentInitiationAdviceFile, processedBy, processedOn, recipientCity, recipientCountry, recipientFamilyName, recipientGivenName, recipientIban, recipientPostcode, recipientStreet, senderIban, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReimbursement {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    paymentInitiationAdviceFile: ").append(toIndentedString(paymentInitiationAdviceFile)).append("\n");
    sb.append("    processedBy: ").append(toIndentedString(processedBy)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    recipientCity: ").append(toIndentedString(recipientCity)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientFamilyName: ").append(toIndentedString(recipientFamilyName)).append("\n");
    sb.append("    recipientGivenName: ").append(toIndentedString(recipientGivenName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientPostcode: ").append(toIndentedString(recipientPostcode)).append("\n");
    sb.append("    recipientStreet: ").append(toIndentedString(recipientStreet)).append("\n");
    sb.append("    senderIban: ").append(toIndentedString(senderIban)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

