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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionInvoiceState;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionInvoice
 */
@JsonPropertyOrder({
  TransactionInvoice.JSON_PROPERTY_COMPLETION,
  TransactionInvoice.JSON_PROPERTY_DERECOGNIZED_ON,
  TransactionInvoice.JSON_PROPERTY_AMOUNT,
  TransactionInvoice.JSON_PROPERTY_DUE_ON,
  TransactionInvoice.JSON_PROPERTY_OUTSTANDING_AMOUNT,
  TransactionInvoice.JSON_PROPERTY_PLANNED_PURGE_DATE,
  TransactionInvoice.JSON_PROPERTY_EXTERNAL_ID,
  TransactionInvoice.JSON_PROPERTY_TIME_ZONE,
  TransactionInvoice.JSON_PROPERTY_LANGUAGE,
  TransactionInvoice.JSON_PROPERTY_SPACE_VIEW_ID,
  TransactionInvoice.JSON_PROPERTY_CREATED_ON,
  TransactionInvoice.JSON_PROPERTY_PAID_ON,
  TransactionInvoice.JSON_PROPERTY_VERSION,
  TransactionInvoice.JSON_PROPERTY_LINE_ITEMS,
  TransactionInvoice.JSON_PROPERTY_LINKED_SPACE_ID,
  TransactionInvoice.JSON_PROPERTY_ENVIRONMENT,
  TransactionInvoice.JSON_PROPERTY_DERECOGNIZED_BY,
  TransactionInvoice.JSON_PROPERTY_BILLING_ADDRESS,
  TransactionInvoice.JSON_PROPERTY_ID,
  TransactionInvoice.JSON_PROPERTY_STATE,
  TransactionInvoice.JSON_PROPERTY_LINKED_TRANSACTION,
  TransactionInvoice.JSON_PROPERTY_TAX_AMOUNT,
  TransactionInvoice.JSON_PROPERTY_MERCHANT_REFERENCE
})

public class TransactionInvoice {
  public static final String JSON_PROPERTY_COMPLETION = "completion";
  private TransactionCompletion completion;

  public static final String JSON_PROPERTY_DERECOGNIZED_ON = "derecognizedOn";
  private OffsetDateTime derecognizedOn;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_DUE_ON = "dueOn";
  private OffsetDateTime dueOn;

  public static final String JSON_PROPERTY_OUTSTANDING_AMOUNT = "outstandingAmount";
  private BigDecimal outstandingAmount;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_PAID_ON = "paidOn";
  private OffsetDateTime paidOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private Environment environment;

  public static final String JSON_PROPERTY_DERECOGNIZED_BY = "derecognizedBy";
  private Long derecognizedBy;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private TransactionInvoiceState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  private BigDecimal taxAmount;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public TransactionInvoice() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public TransactionInvoice(
    @JsonProperty(JSON_PROPERTY_DERECOGNIZED_ON) OffsetDateTime derecognizedOn, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_DUE_ON) OffsetDateTime dueOn, 
    @JsonProperty(JSON_PROPERTY_OUTSTANDING_AMOUNT) BigDecimal outstandingAmount, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_PAID_ON) OffsetDateTime paidOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_DERECOGNIZED_BY) Long derecognizedBy, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_TAX_AMOUNT) BigDecimal taxAmount, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE) String merchantReference
  ) {
    this();
    this.derecognizedOn = derecognizedOn;
    this.amount = amount;
    this.dueOn = dueOn;
    this.outstandingAmount = outstandingAmount;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.timeZone = timeZone;
    this.language = language;
    this.spaceViewId = spaceViewId;
    this.createdOn = createdOn;
    this.paidOn = paidOn;
    this.version = version;
    this.lineItems = lineItems;
    this.linkedSpaceId = linkedSpaceId;
    this.derecognizedBy = derecognizedBy;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.taxAmount = taxAmount;
    this.merchantReference = merchantReference;
  }

  public TransactionInvoice completion(TransactionCompletion completion) {
    
    this.completion = completion;
    return this;
  }

   /**
   * Get completion
   * @return completion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletion getCompletion() {
    return completion;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(TransactionCompletion completion) {
    this.completion = completion;
  }

   /**
   * The date and time when the invoice was derecognized, meaning it is no longer considered outstanding or valid in the system.
   * @return derecognizedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DERECOGNIZED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDerecognizedOn() {
    return derecognizedOn;
  }



   /**
   * The total sum of all line items on the invoice, including taxes.
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



   /**
   * The due date for payment of the invoice.
   * @return dueOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDueOn() {
    return dueOn;
  }



   /**
   * The remaining amount the buyer owes to the merchant. A negative value indicates the invoice has been overpaid.
   * @return outstandingAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOutstandingAmount() {
    return outstandingAmount;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



   /**
   * The time zone that this object is associated with.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The date and time when the invoice was recorded as paid. May differ from the actual payment date due to processing delays.
   * @return paidOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPaidOn() {
    return paidOn;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The invoiced line items that will appear on the invoice document.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public TransactionInvoice environment(Environment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Environment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

   /**
   * The ID of the user the invoice was derecognized by.
   * @return derecognizedBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DERECOGNIZED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDerecognizedBy() {
    return derecognizedBy;
  }



  public TransactionInvoice billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public TransactionInvoice state(TransactionInvoiceState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionInvoiceState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(TransactionInvoiceState state) {
    this.state = state;
  }

   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



   /**
   * The portion of the invoiced amount that corresponds to taxes.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }



   /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return merchantReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
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
    return Objects.equals(this.completion, transactionInvoice.completion) &&
        Objects.equals(this.derecognizedOn, transactionInvoice.derecognizedOn) &&
        Objects.equals(this.amount, transactionInvoice.amount) &&
        Objects.equals(this.dueOn, transactionInvoice.dueOn) &&
        Objects.equals(this.outstandingAmount, transactionInvoice.outstandingAmount) &&
        Objects.equals(this.plannedPurgeDate, transactionInvoice.plannedPurgeDate) &&
        Objects.equals(this.externalId, transactionInvoice.externalId) &&
        Objects.equals(this.timeZone, transactionInvoice.timeZone) &&
        Objects.equals(this.language, transactionInvoice.language) &&
        Objects.equals(this.spaceViewId, transactionInvoice.spaceViewId) &&
        Objects.equals(this.createdOn, transactionInvoice.createdOn) &&
        Objects.equals(this.paidOn, transactionInvoice.paidOn) &&
        Objects.equals(this.version, transactionInvoice.version) &&
        Objects.equals(this.lineItems, transactionInvoice.lineItems) &&
        Objects.equals(this.linkedSpaceId, transactionInvoice.linkedSpaceId) &&
        Objects.equals(this.environment, transactionInvoice.environment) &&
        Objects.equals(this.derecognizedBy, transactionInvoice.derecognizedBy) &&
        Objects.equals(this.billingAddress, transactionInvoice.billingAddress) &&
        Objects.equals(this.id, transactionInvoice.id) &&
        Objects.equals(this.state, transactionInvoice.state) &&
        Objects.equals(this.linkedTransaction, transactionInvoice.linkedTransaction) &&
        Objects.equals(this.taxAmount, transactionInvoice.taxAmount) &&
        Objects.equals(this.merchantReference, transactionInvoice.merchantReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completion, derecognizedOn, amount, dueOn, outstandingAmount, plannedPurgeDate, externalId, timeZone, language, spaceViewId, createdOn, paidOn, version, lineItems, linkedSpaceId, environment, derecognizedBy, billingAddress, id, state, linkedTransaction, taxAmount, merchantReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoice {\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    derecognizedOn: ").append(toIndentedString(derecognizedOn)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    paidOn: ").append(toIndentedString(paidOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    derecognizedBy: ").append(toIndentedString(derecognizedBy)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
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

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      joiner.add(getCompletion().toUrlQueryString(prefix + "completion" + suffix));
    }

    // add `derecognizedOn` to the URL query string
    if (getDerecognizedOn() != null) {
      try {
        joiner.add(String.format("%sderecognizedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDerecognizedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `dueOn` to the URL query string
    if (getDueOn() != null) {
      try {
        joiner.add(String.format("%sdueOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `outstandingAmount` to the URL query string
    if (getOutstandingAmount() != null) {
      try {
        joiner.add(String.format("%soutstandingAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutstandingAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `paidOn` to the URL query string
    if (getPaidOn() != null) {
      try {
        joiner.add(String.format("%spaidOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaidOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

    // add `derecognizedBy` to the URL query string
    if (getDerecognizedBy() != null) {
      try {
        joiner.add(String.format("%sderecognizedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDerecognizedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
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

    // add `taxAmount` to the URL query string
    if (getTaxAmount() != null) {
      try {
        joiner.add(String.format("%staxAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

