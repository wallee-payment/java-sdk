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
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.InvoiceReconciliationRecordRejectionStatus;
import com.wallee.sdk.model.InvoiceReconciliationRecordState;
import com.wallee.sdk.model.InvoiceReconciliationRecordType;
import com.wallee.sdk.model.TransactionAwareEntity;
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

public class InvoiceReconciliationRecord extends TransactionAwareEntity {
  
  @JsonProperty("address")
  protected String address = null;

  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("city")
  protected String city = null;

  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("discardedBy")
  protected Long discardedBy = null;

  
  @JsonProperty("discardedOn")
  protected OffsetDateTime discardedOn = null;

  
  @JsonProperty("environment")
  protected ChargeAttemptEnvironment environment = null;

  
  @JsonProperty("familyName")
  protected String familyName = null;

  
  @JsonProperty("givenName")
  protected String givenName = null;

  
  @JsonProperty("iban")
  protected String iban = null;

  
  @JsonProperty("lastResolutionFailure")
  protected FailureReason lastResolutionFailure = null;

  
  @JsonProperty("participantNumber")
  protected String participantNumber = null;

  
  @JsonProperty("paymentFeeAmount")
  protected BigDecimal paymentFeeAmount = null;

  
  @JsonProperty("paymentFeeCurrency")
  protected String paymentFeeCurrency = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("postCode")
  protected String postCode = null;

  
  @JsonProperty("referenceNumber")
  protected String referenceNumber = null;

  
  @JsonProperty("rejectionStatus")
  protected InvoiceReconciliationRecordRejectionStatus rejectionStatus = null;

  
  @JsonProperty("resolvedBy")
  protected Long resolvedBy = null;

  
  @JsonProperty("resolvedOn")
  protected OffsetDateTime resolvedOn = null;

  
  @JsonProperty("senderBankAccount")
  protected String senderBankAccount = null;

  
  @JsonProperty("state")
  protected InvoiceReconciliationRecordState state = null;

  
  @JsonProperty("street")
  protected String street = null;

  
  @JsonProperty("type")
  protected InvoiceReconciliationRecordType type = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  @JsonProperty("valueDate")
  protected OffsetDateTime valueDate = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  
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
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  
   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
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
   * The discarded on date indicates when the bank transaction has been discarded.
   * @return discardedOn
  **/
  @ApiModelProperty(value = "The discarded on date indicates when the bank transaction has been discarded.")
  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  
   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  
   /**
   * 
   * @return iban
  **/
  @ApiModelProperty(value = "")
  public String getIban() {
    return iban;
  }

  
   /**
   * 
   * @return lastResolutionFailure
  **/
  @ApiModelProperty(value = "")
  public FailureReason getLastResolutionFailure() {
    return lastResolutionFailure;
  }

  
   /**
   * 
   * @return participantNumber
  **/
  @ApiModelProperty(value = "")
  public String getParticipantNumber() {
    return participantNumber;
  }

  
   /**
   * 
   * @return paymentFeeAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPaymentFeeAmount() {
    return paymentFeeAmount;
  }

  
   /**
   * 
   * @return paymentFeeCurrency
  **/
  @ApiModelProperty(value = "")
  public String getPaymentFeeCurrency() {
    return paymentFeeCurrency;
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
   * @return postCode
  **/
  @ApiModelProperty(value = "")
  public String getPostCode() {
    return postCode;
  }

  
   /**
   * 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  
   /**
   * 
   * @return rejectionStatus
  **/
  @ApiModelProperty(value = "")
  public InvoiceReconciliationRecordRejectionStatus getRejectionStatus() {
    return rejectionStatus;
  }

  
   /**
   * 
   * @return resolvedBy
  **/
  @ApiModelProperty(value = "")
  public Long getResolvedBy() {
    return resolvedBy;
  }

  
   /**
   * The resolved on date indicates when the bank transaction has been resolved.
   * @return resolvedOn
  **/
  @ApiModelProperty(value = "The resolved on date indicates when the bank transaction has been resolved.")
  public OffsetDateTime getResolvedOn() {
    return resolvedOn;
  }

  
   /**
   * 
   * @return senderBankAccount
  **/
  @ApiModelProperty(value = "")
  public String getSenderBankAccount() {
    return senderBankAccount;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public InvoiceReconciliationRecordState getState() {
    return state;
  }

  
   /**
   * 
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public InvoiceReconciliationRecordType getType() {
    return type;
  }

  
   /**
   * 
   * @return uniqueId
  **/
  @ApiModelProperty(value = "")
  public String getUniqueId() {
    return uniqueId;
  }

  
   /**
   * 
   * @return valueDate
  **/
  @ApiModelProperty(value = "")
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
    InvoiceReconciliationRecord invoiceReconciliationRecord = (InvoiceReconciliationRecord) o;
    return Objects.equals(this.id, invoiceReconciliationRecord.id) &&
        Objects.equals(this.linkedSpaceId, invoiceReconciliationRecord.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, invoiceReconciliationRecord.linkedTransaction) &&
        Objects.equals(this.address, invoiceReconciliationRecord.address) &&
        Objects.equals(this.amount, invoiceReconciliationRecord.amount) &&
        Objects.equals(this.city, invoiceReconciliationRecord.city) &&
        Objects.equals(this.country, invoiceReconciliationRecord.country) &&
        Objects.equals(this.createdOn, invoiceReconciliationRecord.createdOn) &&
        Objects.equals(this.currency, invoiceReconciliationRecord.currency) &&
        Objects.equals(this.discardedBy, invoiceReconciliationRecord.discardedBy) &&
        Objects.equals(this.discardedOn, invoiceReconciliationRecord.discardedOn) &&
        Objects.equals(this.environment, invoiceReconciliationRecord.environment) &&
        Objects.equals(this.familyName, invoiceReconciliationRecord.familyName) &&
        Objects.equals(this.givenName, invoiceReconciliationRecord.givenName) &&
        Objects.equals(this.iban, invoiceReconciliationRecord.iban) &&
        Objects.equals(this.lastResolutionFailure, invoiceReconciliationRecord.lastResolutionFailure) &&
        Objects.equals(this.participantNumber, invoiceReconciliationRecord.participantNumber) &&
        Objects.equals(this.paymentFeeAmount, invoiceReconciliationRecord.paymentFeeAmount) &&
        Objects.equals(this.paymentFeeCurrency, invoiceReconciliationRecord.paymentFeeCurrency) &&
        Objects.equals(this.plannedPurgeDate, invoiceReconciliationRecord.plannedPurgeDate) &&
        Objects.equals(this.postCode, invoiceReconciliationRecord.postCode) &&
        Objects.equals(this.referenceNumber, invoiceReconciliationRecord.referenceNumber) &&
        Objects.equals(this.rejectionStatus, invoiceReconciliationRecord.rejectionStatus) &&
        Objects.equals(this.resolvedBy, invoiceReconciliationRecord.resolvedBy) &&
        Objects.equals(this.resolvedOn, invoiceReconciliationRecord.resolvedOn) &&
        Objects.equals(this.senderBankAccount, invoiceReconciliationRecord.senderBankAccount) &&
        Objects.equals(this.state, invoiceReconciliationRecord.state) &&
        Objects.equals(this.street, invoiceReconciliationRecord.street) &&
        Objects.equals(this.type, invoiceReconciliationRecord.type) &&
        Objects.equals(this.uniqueId, invoiceReconciliationRecord.uniqueId) &&
        Objects.equals(this.valueDate, invoiceReconciliationRecord.valueDate) &&
        Objects.equals(this.version, invoiceReconciliationRecord.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, address, amount, city, country, createdOn, currency, discardedBy, discardedOn, environment, familyName, givenName, iban, lastResolutionFailure, participantNumber, paymentFeeAmount, paymentFeeCurrency, plannedPurgeDate, postCode, referenceNumber, rejectionStatus, resolvedBy, resolvedOn, senderBankAccount, state, street, type, uniqueId, valueDate, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReconciliationRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    lastResolutionFailure: ").append(toIndentedString(lastResolutionFailure)).append("\n");
    sb.append("    participantNumber: ").append(toIndentedString(participantNumber)).append("\n");
    sb.append("    paymentFeeAmount: ").append(toIndentedString(paymentFeeAmount)).append("\n");
    sb.append("    paymentFeeCurrency: ").append(toIndentedString(paymentFeeCurrency)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    rejectionStatus: ").append(toIndentedString(rejectionStatus)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    resolvedOn: ").append(toIndentedString(resolvedOn)).append("\n");
    sb.append("    senderBankAccount: ").append(toIndentedString(senderBankAccount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

