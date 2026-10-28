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
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.InvoiceProcessor;
import com.wallee.sdk.model.InvoiceReimbursementState;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentInitiationAdviceFile;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InvoiceReimbursement
 */
@JsonPropertyOrder({
  InvoiceReimbursement.JSON_PROPERTY_DISCARDED_ON,
  InvoiceReimbursement.JSON_PROPERTY_AMOUNT,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_GIVEN_NAME,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_IBAN,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_ORGANIZATION_NAME,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_STREET,
  InvoiceReimbursement.JSON_PROPERTY_DISCARDED_BY,
  InvoiceReimbursement.JSON_PROPERTY_SENDER_IBAN,
  InvoiceReimbursement.JSON_PROPERTY_SOURCE,
  InvoiceReimbursement.JSON_PROPERTY_CREATED_ON,
  InvoiceReimbursement.JSON_PROPERTY_VERSION,
  InvoiceReimbursement.JSON_PROPERTY_LINKED_SPACE_ID,
  InvoiceReimbursement.JSON_PROPERTY_ENVIRONMENT,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_FAMILY_NAME,
  InvoiceReimbursement.JSON_PROPERTY_PROCESSED_ON,
  InvoiceReimbursement.JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_POSTCODE,
  InvoiceReimbursement.JSON_PROPERTY_CURRENCY,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_COUNTRY,
  InvoiceReimbursement.JSON_PROPERTY_ID,
  InvoiceReimbursement.JSON_PROPERTY_STATE,
  InvoiceReimbursement.JSON_PROPERTY_PROCESSED_BY,
  InvoiceReimbursement.JSON_PROPERTY_RECIPIENT_CITY,
  InvoiceReimbursement.JSON_PROPERTY_PAYMENT_INITIATION_ADVICE_FILE
})

public class InvoiceReimbursement {
  public static final String JSON_PROPERTY_DISCARDED_ON = "discardedOn";
  @javax.annotation.Nullable
  private OffsetDateTime discardedOn;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_RECIPIENT_GIVEN_NAME = "recipientGivenName";
  @javax.annotation.Nullable
  private String recipientGivenName;

  public static final String JSON_PROPERTY_RECIPIENT_IBAN = "recipientIban";
  @javax.annotation.Nullable
  private String recipientIban;

  public static final String JSON_PROPERTY_RECIPIENT_ORGANIZATION_NAME = "recipientOrganizationName";
  @javax.annotation.Nullable
  private String recipientOrganizationName;

  public static final String JSON_PROPERTY_RECIPIENT_STREET = "recipientStreet";
  @javax.annotation.Nullable
  private String recipientStreet;

  public static final String JSON_PROPERTY_DISCARDED_BY = "discardedBy";
  @javax.annotation.Nullable
  private Long discardedBy;

  public static final String JSON_PROPERTY_SENDER_IBAN = "senderIban";
  @javax.annotation.Nullable
  private String senderIban;

  public static final String JSON_PROPERTY_SOURCE = "source";
  @javax.annotation.Nullable
  private InvoiceProcessor source;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private ChargeAttemptEnvironment environment;

  public static final String JSON_PROPERTY_RECIPIENT_FAMILY_NAME = "recipientFamilyName";
  @javax.annotation.Nullable
  private String recipientFamilyName;

  public static final String JSON_PROPERTY_PROCESSED_ON = "processedOn";
  @javax.annotation.Nullable
  private OffsetDateTime processedOn;

  public static final String JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION = "paymentConnectorConfiguration";
  @javax.annotation.Nullable
  private PaymentConnectorConfiguration paymentConnectorConfiguration;

  public static final String JSON_PROPERTY_RECIPIENT_POSTCODE = "recipientPostcode";
  @javax.annotation.Nullable
  private String recipientPostcode;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_RECIPIENT_COUNTRY = "recipientCountry";
  @javax.annotation.Nullable
  private String recipientCountry;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private InvoiceReimbursementState state;

  public static final String JSON_PROPERTY_PROCESSED_BY = "processedBy";
  @javax.annotation.Nullable
  private Long processedBy;

  public static final String JSON_PROPERTY_RECIPIENT_CITY = "recipientCity";
  @javax.annotation.Nullable
  private String recipientCity;

  public static final String JSON_PROPERTY_PAYMENT_INITIATION_ADVICE_FILE = "paymentInitiationAdviceFile";
  @javax.annotation.Nullable
  private PaymentInitiationAdviceFile paymentInitiationAdviceFile;

  public InvoiceReimbursement() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public InvoiceReimbursement(
    @JsonProperty(JSON_PROPERTY_DISCARDED_ON) OffsetDateTime discardedOn, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_GIVEN_NAME) String recipientGivenName, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_IBAN) String recipientIban, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_ORGANIZATION_NAME) String recipientOrganizationName, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_STREET) String recipientStreet, 
    @JsonProperty(JSON_PROPERTY_DISCARDED_BY) Long discardedBy, 
    @JsonProperty(JSON_PROPERTY_SENDER_IBAN) String senderIban, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_FAMILY_NAME) String recipientFamilyName, 
    @JsonProperty(JSON_PROPERTY_PROCESSED_ON) OffsetDateTime processedOn, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_POSTCODE) String recipientPostcode, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_COUNTRY) String recipientCountry, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PROCESSED_BY) Long processedBy, 
    @JsonProperty(JSON_PROPERTY_RECIPIENT_CITY) String recipientCity
  ) {
    this();
    this.discardedOn = discardedOn;
    this.amount = amount;
    this.recipientGivenName = recipientGivenName;
    this.recipientIban = recipientIban;
    this.recipientOrganizationName = recipientOrganizationName;
    this.recipientStreet = recipientStreet;
    this.discardedBy = discardedBy;
    this.senderIban = senderIban;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.recipientFamilyName = recipientFamilyName;
    this.processedOn = processedOn;
    this.recipientPostcode = recipientPostcode;
    this.currency = currency;
    this.recipientCountry = recipientCountry;
    this.id = id;
    this.processedBy = processedBy;
    this.recipientCity = recipientCity;
  }

  /**
   * Get discardedOn
   * @return discardedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
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
   * Get recipientGivenName
   * @return recipientGivenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientGivenName() {
    return recipientGivenName;
  }



  /**
   * Get recipientIban
   * @return recipientIban
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientIban() {
    return recipientIban;
  }



  /**
   * Get recipientOrganizationName
   * @return recipientOrganizationName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientOrganizationName() {
    return recipientOrganizationName;
  }



  /**
   * Get recipientStreet
   * @return recipientStreet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientStreet() {
    return recipientStreet;
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



  /**
   * Get senderIban
   * @return senderIban
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderIban() {
    return senderIban;
  }



  public InvoiceReimbursement source(@javax.annotation.Nullable InvoiceProcessor source) {
    
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvoiceProcessor getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(@javax.annotation.Nullable InvoiceProcessor source) {
    this.source = source;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public InvoiceReimbursement environment(@javax.annotation.Nullable ChargeAttemptEnvironment environment) {
    
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
   * Get recipientFamilyName
   * @return recipientFamilyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientFamilyName() {
    return recipientFamilyName;
  }



  /**
   * Get processedOn
   * @return processedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessedOn() {
    return processedOn;
  }



  public InvoiceReimbursement paymentConnectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration paymentConnectorConfiguration) {
    
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
    return this;
  }

  /**
   * Get paymentConnectorConfiguration
   * @return paymentConnectorConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentConnectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration paymentConnectorConfiguration) {
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
  }

  /**
   * Get recipientPostcode
   * @return recipientPostcode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientPostcode() {
    return recipientPostcode;
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
   * Get recipientCountry
   * @return recipientCountry
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientCountry() {
    return recipientCountry;
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



  public InvoiceReimbursement state(@javax.annotation.Nullable InvoiceReimbursementState state) {
    
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

  public InvoiceReimbursementState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable InvoiceReimbursementState state) {
    this.state = state;
  }

  /**
   * Get processedBy
   * @return processedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessedBy() {
    return processedBy;
  }



  /**
   * Get recipientCity
   * @return recipientCity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientCity() {
    return recipientCity;
  }



  public InvoiceReimbursement paymentInitiationAdviceFile(@javax.annotation.Nullable PaymentInitiationAdviceFile paymentInitiationAdviceFile) {
    
    this.paymentInitiationAdviceFile = paymentInitiationAdviceFile;
    return this;
  }

  /**
   * Get paymentInitiationAdviceFile
   * @return paymentInitiationAdviceFile
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_INITIATION_ADVICE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentInitiationAdviceFile getPaymentInitiationAdviceFile() {
    return paymentInitiationAdviceFile;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INITIATION_ADVICE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInitiationAdviceFile(@javax.annotation.Nullable PaymentInitiationAdviceFile paymentInitiationAdviceFile) {
    this.paymentInitiationAdviceFile = paymentInitiationAdviceFile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceReimbursement invoiceReimbursement = (InvoiceReimbursement) o;
    return Objects.equals(this.discardedOn, invoiceReimbursement.discardedOn) &&
        Objects.equals(this.amount, invoiceReimbursement.amount) &&
        Objects.equals(this.recipientGivenName, invoiceReimbursement.recipientGivenName) &&
        Objects.equals(this.recipientIban, invoiceReimbursement.recipientIban) &&
        Objects.equals(this.recipientOrganizationName, invoiceReimbursement.recipientOrganizationName) &&
        Objects.equals(this.recipientStreet, invoiceReimbursement.recipientStreet) &&
        Objects.equals(this.discardedBy, invoiceReimbursement.discardedBy) &&
        Objects.equals(this.senderIban, invoiceReimbursement.senderIban) &&
        Objects.equals(this.source, invoiceReimbursement.source) &&
        Objects.equals(this.createdOn, invoiceReimbursement.createdOn) &&
        Objects.equals(this.version, invoiceReimbursement.version) &&
        Objects.equals(this.linkedSpaceId, invoiceReimbursement.linkedSpaceId) &&
        Objects.equals(this.environment, invoiceReimbursement.environment) &&
        Objects.equals(this.recipientFamilyName, invoiceReimbursement.recipientFamilyName) &&
        Objects.equals(this.processedOn, invoiceReimbursement.processedOn) &&
        Objects.equals(this.paymentConnectorConfiguration, invoiceReimbursement.paymentConnectorConfiguration) &&
        Objects.equals(this.recipientPostcode, invoiceReimbursement.recipientPostcode) &&
        Objects.equals(this.currency, invoiceReimbursement.currency) &&
        Objects.equals(this.recipientCountry, invoiceReimbursement.recipientCountry) &&
        Objects.equals(this.id, invoiceReimbursement.id) &&
        Objects.equals(this.state, invoiceReimbursement.state) &&
        Objects.equals(this.processedBy, invoiceReimbursement.processedBy) &&
        Objects.equals(this.recipientCity, invoiceReimbursement.recipientCity) &&
        Objects.equals(this.paymentInitiationAdviceFile, invoiceReimbursement.paymentInitiationAdviceFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discardedOn, amount, recipientGivenName, recipientIban, recipientOrganizationName, recipientStreet, discardedBy, senderIban, source, createdOn, version, linkedSpaceId, environment, recipientFamilyName, processedOn, paymentConnectorConfiguration, recipientPostcode, currency, recipientCountry, id, state, processedBy, recipientCity, paymentInitiationAdviceFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReimbursement {\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    recipientGivenName: ").append(toIndentedString(recipientGivenName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientOrganizationName: ").append(toIndentedString(recipientOrganizationName)).append("\n");
    sb.append("    recipientStreet: ").append(toIndentedString(recipientStreet)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    senderIban: ").append(toIndentedString(senderIban)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    recipientFamilyName: ").append(toIndentedString(recipientFamilyName)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    recipientPostcode: ").append(toIndentedString(recipientPostcode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    processedBy: ").append(toIndentedString(processedBy)).append("\n");
    sb.append("    recipientCity: ").append(toIndentedString(recipientCity)).append("\n");
    sb.append("    paymentInitiationAdviceFile: ").append(toIndentedString(paymentInitiationAdviceFile)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientGivenName` to the URL query string
    if (getRecipientGivenName() != null) {
      try {
        joiner.add(String.format("%srecipientGivenName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientGivenName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientIban` to the URL query string
    if (getRecipientIban() != null) {
      try {
        joiner.add(String.format("%srecipientIban%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientIban()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientOrganizationName` to the URL query string
    if (getRecipientOrganizationName() != null) {
      try {
        joiner.add(String.format("%srecipientOrganizationName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientOrganizationName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientStreet` to the URL query string
    if (getRecipientStreet() != null) {
      try {
        joiner.add(String.format("%srecipientStreet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientStreet()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `senderIban` to the URL query string
    if (getSenderIban() != null) {
      try {
        joiner.add(String.format("%ssenderIban%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderIban()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `source` to the URL query string
    if (getSource() != null) {
      try {
        joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `recipientFamilyName` to the URL query string
    if (getRecipientFamilyName() != null) {
      try {
        joiner.add(String.format("%srecipientFamilyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientFamilyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processedOn` to the URL query string
    if (getProcessedOn() != null) {
      try {
        joiner.add(String.format("%sprocessedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentConnectorConfiguration` to the URL query string
    if (getPaymentConnectorConfiguration() != null) {
      joiner.add(getPaymentConnectorConfiguration().toUrlQueryString(prefix + "paymentConnectorConfiguration" + suffix));
    }

    // add `recipientPostcode` to the URL query string
    if (getRecipientPostcode() != null) {
      try {
        joiner.add(String.format("%srecipientPostcode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientPostcode()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `recipientCountry` to the URL query string
    if (getRecipientCountry() != null) {
      try {
        joiner.add(String.format("%srecipientCountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientCountry()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processedBy` to the URL query string
    if (getProcessedBy() != null) {
      try {
        joiner.add(String.format("%sprocessedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientCity` to the URL query string
    if (getRecipientCity() != null) {
      try {
        joiner.add(String.format("%srecipientCity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientCity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentInitiationAdviceFile` to the URL query string
    if (getPaymentInitiationAdviceFile() != null) {
      joiner.add(getPaymentInitiationAdviceFile().toUrlQueryString(prefix + "paymentInitiationAdviceFile" + suffix));
    }

    return joiner.toString();
  }

}

