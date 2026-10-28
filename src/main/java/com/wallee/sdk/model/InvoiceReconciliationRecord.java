/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.BankPaymentType;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.InvoiceReconciliationRecordRejectionStatus;
import com.wallee.sdk.model.InvoiceReconciliationRecordState;
import com.wallee.sdk.model.InvoiceReconciliationRecordType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InvoiceReconciliationRecord
 */
@JsonPropertyOrder({
  InvoiceReconciliationRecord.JSON_PROPERTY_DISCARDED_ON,
  InvoiceReconciliationRecord.JSON_PROPERTY_LAST_RESOLUTION_FAILURE,
  InvoiceReconciliationRecord.JSON_PROPERTY_COUNTRY,
  InvoiceReconciliationRecord.JSON_PROPERTY_REJECTION_STATUS,
  InvoiceReconciliationRecord.JSON_PROPERTY_CITY,
  InvoiceReconciliationRecord.JSON_PROPERTY_RESOLVED_BY,
  InvoiceReconciliationRecord.JSON_PROPERTY_DISCARDED_BY,
  InvoiceReconciliationRecord.JSON_PROPERTY_TYPE,
  InvoiceReconciliationRecord.JSON_PROPERTY_CREATED_ON,
  InvoiceReconciliationRecord.JSON_PROPERTY_PAYMENT_FEE_CURRENCY,
  InvoiceReconciliationRecord.JSON_PROPERTY_PAYMENT_REASON,
  InvoiceReconciliationRecord.JSON_PROPERTY_REFERENCE_NUMBER,
  InvoiceReconciliationRecord.JSON_PROPERTY_STREET,
  InvoiceReconciliationRecord.JSON_PROPERTY_FAMILY_NAME,
  InvoiceReconciliationRecord.JSON_PROPERTY_CURRENCY,
  InvoiceReconciliationRecord.JSON_PROPERTY_ID,
  InvoiceReconciliationRecord.JSON_PROPERTY_STATE,
  InvoiceReconciliationRecord.JSON_PROPERTY_LINKED_TRANSACTION,
  InvoiceReconciliationRecord.JSON_PROPERTY_RESOLVED_ON,
  InvoiceReconciliationRecord.JSON_PROPERTY_AMOUNT,
  InvoiceReconciliationRecord.JSON_PROPERTY_ADDRESS,
  InvoiceReconciliationRecord.JSON_PROPERTY_GIVEN_NAME,
  InvoiceReconciliationRecord.JSON_PROPERTY_PLANNED_PURGE_DATE,
  InvoiceReconciliationRecord.JSON_PROPERTY_BANK_PAYMENT_TYPE,
  InvoiceReconciliationRecord.JSON_PROPERTY_VALUE_DATE,
  InvoiceReconciliationRecord.JSON_PROPERTY_VERSION,
  InvoiceReconciliationRecord.JSON_PROPERTY_PAYMENT_FEE_AMOUNT,
  InvoiceReconciliationRecord.JSON_PROPERTY_LINKED_SPACE_ID,
  InvoiceReconciliationRecord.JSON_PROPERTY_ENVIRONMENT,
  InvoiceReconciliationRecord.JSON_PROPERTY_SENDER_BANK_ACCOUNT,
  InvoiceReconciliationRecord.JSON_PROPERTY_PARTICIPANT_NUMBER,
  InvoiceReconciliationRecord.JSON_PROPERTY_IBAN,
  InvoiceReconciliationRecord.JSON_PROPERTY_POST_CODE,
  InvoiceReconciliationRecord.JSON_PROPERTY_UNIQUE_ID
})

public class InvoiceReconciliationRecord {
  public static final String JSON_PROPERTY_DISCARDED_ON = "discardedOn";
  @javax.annotation.Nullable
  private OffsetDateTime discardedOn;

  public static final String JSON_PROPERTY_LAST_RESOLUTION_FAILURE = "lastResolutionFailure";
  @javax.annotation.Nullable
  private FailureReason lastResolutionFailure;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nullable
  private String country;

  public static final String JSON_PROPERTY_REJECTION_STATUS = "rejectionStatus";
  @javax.annotation.Nullable
  private InvoiceReconciliationRecordRejectionStatus rejectionStatus;

  public static final String JSON_PROPERTY_CITY = "city";
  @javax.annotation.Nullable
  private String city;

  public static final String JSON_PROPERTY_RESOLVED_BY = "resolvedBy";
  @javax.annotation.Nullable
  private Long resolvedBy;

  public static final String JSON_PROPERTY_DISCARDED_BY = "discardedBy";
  @javax.annotation.Nullable
  private Long discardedBy;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private InvoiceReconciliationRecordType type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_PAYMENT_FEE_CURRENCY = "paymentFeeCurrency";
  @javax.annotation.Nullable
  private String paymentFeeCurrency;

  public static final String JSON_PROPERTY_PAYMENT_REASON = "paymentReason";
  @javax.annotation.Nullable
  private String paymentReason;

  public static final String JSON_PROPERTY_REFERENCE_NUMBER = "referenceNumber";
  @javax.annotation.Nullable
  private String referenceNumber;

  public static final String JSON_PROPERTY_STREET = "street";
  @javax.annotation.Nullable
  private String street;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  @javax.annotation.Nullable
  private String familyName;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private InvoiceReconciliationRecordState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_RESOLVED_ON = "resolvedOn";
  @javax.annotation.Nullable
  private OffsetDateTime resolvedOn;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private String address;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  @javax.annotation.Nullable
  private String givenName;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_BANK_PAYMENT_TYPE = "bankPaymentType";
  @javax.annotation.Nullable
  private BankPaymentType bankPaymentType;

  public static final String JSON_PROPERTY_VALUE_DATE = "valueDate";
  @javax.annotation.Nullable
  private OffsetDateTime valueDate;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_PAYMENT_FEE_AMOUNT = "paymentFeeAmount";
  @javax.annotation.Nullable
  private BigDecimal paymentFeeAmount;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private ChargeAttemptEnvironment environment;

  public static final String JSON_PROPERTY_SENDER_BANK_ACCOUNT = "senderBankAccount";
  @javax.annotation.Nullable
  private String senderBankAccount;

  public static final String JSON_PROPERTY_PARTICIPANT_NUMBER = "participantNumber";
  @javax.annotation.Nullable
  private String participantNumber;

  public static final String JSON_PROPERTY_IBAN = "iban";
  @javax.annotation.Nullable
  private String iban;

  public static final String JSON_PROPERTY_POST_CODE = "postCode";
  @javax.annotation.Nullable
  private String postCode;

  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  @javax.annotation.Nullable
  private String uniqueId;

  public InvoiceReconciliationRecord() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public InvoiceReconciliationRecord(
    @JsonProperty(JSON_PROPERTY_DISCARDED_ON) OffsetDateTime discardedOn, 
    @JsonProperty(JSON_PROPERTY_COUNTRY) String country, 
    @JsonProperty(JSON_PROPERTY_CITY) String city, 
    @JsonProperty(JSON_PROPERTY_RESOLVED_BY) Long resolvedBy, 
    @JsonProperty(JSON_PROPERTY_DISCARDED_BY) Long discardedBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_FEE_CURRENCY) String paymentFeeCurrency, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_REASON) String paymentReason, 
    @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER) String referenceNumber, 
    @JsonProperty(JSON_PROPERTY_STREET) String street, 
    @JsonProperty(JSON_PROPERTY_FAMILY_NAME) String familyName, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_RESOLVED_ON) OffsetDateTime resolvedOn, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_ADDRESS) String address, 
    @JsonProperty(JSON_PROPERTY_GIVEN_NAME) String givenName, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_VALUE_DATE) OffsetDateTime valueDate, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_FEE_AMOUNT) BigDecimal paymentFeeAmount, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_SENDER_BANK_ACCOUNT) String senderBankAccount, 
    @JsonProperty(JSON_PROPERTY_PARTICIPANT_NUMBER) String participantNumber, 
    @JsonProperty(JSON_PROPERTY_IBAN) String iban, 
    @JsonProperty(JSON_PROPERTY_POST_CODE) String postCode, 
    @JsonProperty(JSON_PROPERTY_UNIQUE_ID) String uniqueId
  ) {
    this();
    this.discardedOn = discardedOn;
    this.country = country;
    this.city = city;
    this.resolvedBy = resolvedBy;
    this.discardedBy = discardedBy;
    this.createdOn = createdOn;
    this.paymentFeeCurrency = paymentFeeCurrency;
    this.paymentReason = paymentReason;
    this.referenceNumber = referenceNumber;
    this.street = street;
    this.familyName = familyName;
    this.currency = currency;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.resolvedOn = resolvedOn;
    this.amount = amount;
    this.address = address;
    this.givenName = givenName;
    this.plannedPurgeDate = plannedPurgeDate;
    this.valueDate = valueDate;
    this.version = version;
    this.paymentFeeAmount = paymentFeeAmount;
    this.linkedSpaceId = linkedSpaceId;
    this.senderBankAccount = senderBankAccount;
    this.participantNumber = participantNumber;
    this.iban = iban;
    this.postCode = postCode;
    this.uniqueId = uniqueId;
  }

  /**
   * The discarded on date indicates when the bank transaction has been discarded.
   * @return discardedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
  }



  public InvoiceReconciliationRecord lastResolutionFailure(@javax.annotation.Nullable FailureReason lastResolutionFailure) {
    
    this.lastResolutionFailure = lastResolutionFailure;
    return this;
  }

  /**
   * Get lastResolutionFailure
   * @return lastResolutionFailure
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESOLUTION_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getLastResolutionFailure() {
    return lastResolutionFailure;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RESOLUTION_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastResolutionFailure(@javax.annotation.Nullable FailureReason lastResolutionFailure) {
    this.lastResolutionFailure = lastResolutionFailure;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }



  public InvoiceReconciliationRecord rejectionStatus(@javax.annotation.Nullable InvoiceReconciliationRecordRejectionStatus rejectionStatus) {
    
    this.rejectionStatus = rejectionStatus;
    return this;
  }

  /**
   * Get rejectionStatus
   * @return rejectionStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvoiceReconciliationRecordRejectionStatus getRejectionStatus() {
    return rejectionStatus;
  }


  @JsonProperty(JSON_PROPERTY_REJECTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectionStatus(@javax.annotation.Nullable InvoiceReconciliationRecordRejectionStatus rejectionStatus) {
    this.rejectionStatus = rejectionStatus;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }



  /**
   * Get resolvedBy
   * @return resolvedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResolvedBy() {
    return resolvedBy;
  }



  /**
   * Get discardedBy
   * @return discardedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiscardedBy() {
    return discardedBy;
  }



  public InvoiceReconciliationRecord type(@javax.annotation.Nullable InvoiceReconciliationRecordType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvoiceReconciliationRecordType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable InvoiceReconciliationRecordType type) {
    this.type = type;
  }

  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * Get paymentFeeCurrency
   * @return paymentFeeCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_FEE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentFeeCurrency() {
    return paymentFeeCurrency;
  }



  /**
   * Get paymentReason
   * @return paymentReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentReason() {
    return paymentReason;
  }



  /**
   * Get referenceNumber
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceNumber() {
    return referenceNumber;
  }



  /**
   * Get street
   * @return street
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }



  /**
   * Get familyName
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }



  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public InvoiceReconciliationRecord state(@javax.annotation.Nullable InvoiceReconciliationRecordState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvoiceReconciliationRecordState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable InvoiceReconciliationRecordState state) {
    this.state = state;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  /**
   * The resolved on date indicates when the bank transaction has been resolved.
   * @return resolvedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getResolvedOn() {
    return resolvedOn;
  }



  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }



  /**
   * Get givenName
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  public InvoiceReconciliationRecord bankPaymentType(@javax.annotation.Nullable BankPaymentType bankPaymentType) {
    
    this.bankPaymentType = bankPaymentType;
    return this;
  }

  /**
   * Get bankPaymentType
   * @return bankPaymentType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankPaymentType getBankPaymentType() {
    return bankPaymentType;
  }


  @JsonProperty(JSON_PROPERTY_BANK_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankPaymentType(@javax.annotation.Nullable BankPaymentType bankPaymentType) {
    this.bankPaymentType = bankPaymentType;
  }

  /**
   * Get valueDate
   * @return valueDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValueDate() {
    return valueDate;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * Get paymentFeeAmount
   * @return paymentFeeAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_FEE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPaymentFeeAmount() {
    return paymentFeeAmount;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public InvoiceReconciliationRecord environment(@javax.annotation.Nullable ChargeAttemptEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(@javax.annotation.Nullable ChargeAttemptEnvironment environment) {
    this.environment = environment;
  }

  /**
   * Get senderBankAccount
   * @return senderBankAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderBankAccount() {
    return senderBankAccount;
  }



  /**
   * Get participantNumber
   * @return participantNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipantNumber() {
    return participantNumber;
  }



  /**
   * Get iban
   * @return iban
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }



  /**
   * Get postCode
   * @return postCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostCode() {
    return postCode;
  }



  /**
   * Get uniqueId
   * @return uniqueId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceReconciliationRecord invoiceReconciliationRecord = (InvoiceReconciliationRecord) o;
    return Objects.equals(this.discardedOn, invoiceReconciliationRecord.discardedOn) &&
        Objects.equals(this.lastResolutionFailure, invoiceReconciliationRecord.lastResolutionFailure) &&
        Objects.equals(this.country, invoiceReconciliationRecord.country) &&
        Objects.equals(this.rejectionStatus, invoiceReconciliationRecord.rejectionStatus) &&
        Objects.equals(this.city, invoiceReconciliationRecord.city) &&
        Objects.equals(this.resolvedBy, invoiceReconciliationRecord.resolvedBy) &&
        Objects.equals(this.discardedBy, invoiceReconciliationRecord.discardedBy) &&
        Objects.equals(this.type, invoiceReconciliationRecord.type) &&
        Objects.equals(this.createdOn, invoiceReconciliationRecord.createdOn) &&
        Objects.equals(this.paymentFeeCurrency, invoiceReconciliationRecord.paymentFeeCurrency) &&
        Objects.equals(this.paymentReason, invoiceReconciliationRecord.paymentReason) &&
        Objects.equals(this.referenceNumber, invoiceReconciliationRecord.referenceNumber) &&
        Objects.equals(this.street, invoiceReconciliationRecord.street) &&
        Objects.equals(this.familyName, invoiceReconciliationRecord.familyName) &&
        Objects.equals(this.currency, invoiceReconciliationRecord.currency) &&
        Objects.equals(this.id, invoiceReconciliationRecord.id) &&
        Objects.equals(this.state, invoiceReconciliationRecord.state) &&
        Objects.equals(this.linkedTransaction, invoiceReconciliationRecord.linkedTransaction) &&
        Objects.equals(this.resolvedOn, invoiceReconciliationRecord.resolvedOn) &&
        Objects.equals(this.amount, invoiceReconciliationRecord.amount) &&
        Objects.equals(this.address, invoiceReconciliationRecord.address) &&
        Objects.equals(this.givenName, invoiceReconciliationRecord.givenName) &&
        Objects.equals(this.plannedPurgeDate, invoiceReconciliationRecord.plannedPurgeDate) &&
        Objects.equals(this.bankPaymentType, invoiceReconciliationRecord.bankPaymentType) &&
        Objects.equals(this.valueDate, invoiceReconciliationRecord.valueDate) &&
        Objects.equals(this.version, invoiceReconciliationRecord.version) &&
        Objects.equals(this.paymentFeeAmount, invoiceReconciliationRecord.paymentFeeAmount) &&
        Objects.equals(this.linkedSpaceId, invoiceReconciliationRecord.linkedSpaceId) &&
        Objects.equals(this.environment, invoiceReconciliationRecord.environment) &&
        Objects.equals(this.senderBankAccount, invoiceReconciliationRecord.senderBankAccount) &&
        Objects.equals(this.participantNumber, invoiceReconciliationRecord.participantNumber) &&
        Objects.equals(this.iban, invoiceReconciliationRecord.iban) &&
        Objects.equals(this.postCode, invoiceReconciliationRecord.postCode) &&
        Objects.equals(this.uniqueId, invoiceReconciliationRecord.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discardedOn, lastResolutionFailure, country, rejectionStatus, city, resolvedBy, discardedBy, type, createdOn, paymentFeeCurrency, paymentReason, referenceNumber, street, familyName, currency, id, state, linkedTransaction, resolvedOn, amount, address, givenName, plannedPurgeDate, bankPaymentType, valueDate, version, paymentFeeAmount, linkedSpaceId, environment, senderBankAccount, participantNumber, iban, postCode, uniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReconciliationRecord {\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    lastResolutionFailure: ").append(toIndentedString(lastResolutionFailure)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    rejectionStatus: ").append(toIndentedString(rejectionStatus)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    paymentFeeCurrency: ").append(toIndentedString(paymentFeeCurrency)).append("\n");
    sb.append("    paymentReason: ").append(toIndentedString(paymentReason)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    resolvedOn: ").append(toIndentedString(resolvedOn)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    bankPaymentType: ").append(toIndentedString(bankPaymentType)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    paymentFeeAmount: ").append(toIndentedString(paymentFeeAmount)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    senderBankAccount: ").append(toIndentedString(senderBankAccount)).append("\n");
    sb.append("    participantNumber: ").append(toIndentedString(participantNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `discardedOn` to the URL query string
    if (getDiscardedOn() != null) {
      try {
        joiner.add(String.format("%sdiscardedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscardedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastResolutionFailure` to the URL query string
    if (getLastResolutionFailure() != null) {
      joiner.add(getLastResolutionFailure().toUrlQueryString(prefix + "lastResolutionFailure" + suffix));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      try {
        joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rejectionStatus` to the URL query string
    if (getRejectionStatus() != null) {
      try {
        joiner.add(String.format("%srejectionStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRejectionStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      try {
        joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resolvedBy` to the URL query string
    if (getResolvedBy() != null) {
      try {
        joiner.add(String.format("%sresolvedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolvedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discardedBy` to the URL query string
    if (getDiscardedBy() != null) {
      try {
        joiner.add(String.format("%sdiscardedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscardedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(getType().toUrlQueryString(prefix + "type" + suffix));
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentFeeCurrency` to the URL query string
    if (getPaymentFeeCurrency() != null) {
      try {
        joiner.add(String.format("%spaymentFeeCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentFeeCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentReason` to the URL query string
    if (getPaymentReason() != null) {
      try {
        joiner.add(String.format("%spaymentReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `referenceNumber` to the URL query string
    if (getReferenceNumber() != null) {
      try {
        joiner.add(String.format("%sreferenceNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReferenceNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `street` to the URL query string
    if (getStreet() != null) {
      try {
        joiner.add(String.format("%sstreet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStreet()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      try {
        joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamilyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resolvedOn` to the URL query string
    if (getResolvedOn() != null) {
      try {
        joiner.add(String.format("%sresolvedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolvedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      try {
        joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      try {
        joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGivenName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bankPaymentType` to the URL query string
    if (getBankPaymentType() != null) {
      try {
        joiner.add(String.format("%sbankPaymentType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankPaymentType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `valueDate` to the URL query string
    if (getValueDate() != null) {
      try {
        joiner.add(String.format("%svalueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentFeeAmount` to the URL query string
    if (getPaymentFeeAmount() != null) {
      try {
        joiner.add(String.format("%spaymentFeeAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentFeeAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `senderBankAccount` to the URL query string
    if (getSenderBankAccount() != null) {
      try {
        joiner.add(String.format("%ssenderBankAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderBankAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `participantNumber` to the URL query string
    if (getParticipantNumber() != null) {
      try {
        joiner.add(String.format("%sparticipantNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParticipantNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iban` to the URL query string
    if (getIban() != null) {
      try {
        joiner.add(String.format("%siban%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIban()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postCode` to the URL query string
    if (getPostCode() != null) {
      try {
        joiner.add(String.format("%spostCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueId` to the URL query string
    if (getUniqueId() != null) {
      try {
        joiner.add(String.format("%suniqueId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

