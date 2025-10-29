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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import com.wallee.sdk.model.SubscriptionChargeState;
import com.wallee.sdk.model.SubscriptionChargeType;
import com.wallee.sdk.model.SubscriptionLedgerEntry;
import com.wallee.sdk.model.Transaction;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
@JsonPropertyOrder({
  SubscriptionCharge.JSON_PROPERTY_DISCARDED_ON,
  SubscriptionCharge.JSON_PROPERTY_PLANNED_EXECUTION_DATE,
  SubscriptionCharge.JSON_PROPERTY_PROCESSING_TYPE,
  SubscriptionCharge.JSON_PROPERTY_LEDGER_ENTRIES,
  SubscriptionCharge.JSON_PROPERTY_DISCARDED_BY,
  SubscriptionCharge.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionCharge.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionCharge.JSON_PROPERTY_SUCCESS_URL,
  SubscriptionCharge.JSON_PROPERTY_LANGUAGE,
  SubscriptionCharge.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionCharge.JSON_PROPERTY_TYPE,
  SubscriptionCharge.JSON_PROPERTY_CREATED_ON,
  SubscriptionCharge.JSON_PROPERTY_VERSION,
  SubscriptionCharge.JSON_PROPERTY_REFERENCE,
  SubscriptionCharge.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionCharge.JSON_PROPERTY_ID,
  SubscriptionCharge.JSON_PROPERTY_STATE,
  SubscriptionCharge.JSON_PROPERTY_FAILED_ON,
  SubscriptionCharge.JSON_PROPERTY_TRANSACTION,
  SubscriptionCharge.JSON_PROPERTY_FAILED_URL,
  SubscriptionCharge.JSON_PROPERTY_SUCCEED_ON
})

public class SubscriptionCharge {
  public static final String JSON_PROPERTY_DISCARDED_ON = "discardedOn";
  private OffsetDateTime discardedOn;

  public static final String JSON_PROPERTY_PLANNED_EXECUTION_DATE = "plannedExecutionDate";
  private OffsetDateTime plannedExecutionDate;

  public static final String JSON_PROPERTY_PROCESSING_TYPE = "processingType";
  private SubscriptionChargeProcessingType processingType;

  public static final String JSON_PROPERTY_LEDGER_ENTRIES = "ledgerEntries";
  private Set<SubscriptionLedgerEntry> ledgerEntries = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_DISCARDED_BY = "discardedBy";
  private Long discardedBy;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  private String successUrl;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private Subscription subscription;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SubscriptionChargeType type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private SubscriptionChargeState state;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private Transaction transaction;

  public static final String JSON_PROPERTY_FAILED_URL = "failedUrl";
  private String failedUrl;

  public static final String JSON_PROPERTY_SUCCEED_ON = "succeedOn";
  private OffsetDateTime succeedOn;

  public SubscriptionCharge() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionCharge(
    @JsonProperty(JSON_PROPERTY_DISCARDED_ON) OffsetDateTime discardedOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_EXECUTION_DATE) OffsetDateTime plannedExecutionDate, 
    @JsonProperty(JSON_PROPERTY_LEDGER_ENTRIES) Set<SubscriptionLedgerEntry> ledgerEntries, 
    @JsonProperty(JSON_PROPERTY_DISCARDED_BY) Long discardedBy, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_SUCCESS_URL) String successUrl, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_FAILED_URL) String failedUrl, 
    @JsonProperty(JSON_PROPERTY_SUCCEED_ON) OffsetDateTime succeedOn
  ) {
    this();
    this.discardedOn = discardedOn;
    this.plannedExecutionDate = plannedExecutionDate;
    this.ledgerEntries = ledgerEntries;
    this.discardedBy = discardedBy;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.successUrl = successUrl;
    this.language = language;
    this.createdOn = createdOn;
    this.version = version;
    this.reference = reference;
    this.linkedSpaceId = linkedSpaceId;
    this.id = id;
    this.failedOn = failedOn;
    this.failedUrl = failedUrl;
    this.succeedOn = succeedOn;
  }

   /**
   * The date and time when the charge was discarded.
   * @return discardedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
  }



   /**
   * The date and time when the execution of the charge is planned.
   * @return plannedExecutionDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedExecutionDate() {
    return plannedExecutionDate;
  }



  public SubscriptionCharge processingType(SubscriptionChargeProcessingType processingType) {
    
    this.processingType = processingType;
    return this;
  }

   /**
   * Get processingType
   * @return processingType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionChargeProcessingType getProcessingType() {
    return processingType;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingType(SubscriptionChargeProcessingType processingType) {
    this.processingType = processingType;
  }

   /**
   * The ledger entries that belong to the charge.
   * @return ledgerEntries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEDGER_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SubscriptionLedgerEntry> getLedgerEntries() {
    return ledgerEntries;
  }



   /**
   * The ID of the user the charge was discarded by.
   * @return discardedBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCARDED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiscardedBy() {
    return discardedBy;
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
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuccessUrl() {
    return successUrl;
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



  public SubscriptionCharge subscription(Subscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscription getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public SubscriptionCharge type(SubscriptionChargeType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionChargeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(SubscriptionChargeType type) {
    this.type = type;
  }

   /**
   * The date and time when the charge was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The merchant&#39;s reference used to identify the charge.
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
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



  public SubscriptionCharge state(SubscriptionChargeState state) {
    
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

  public SubscriptionChargeState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(SubscriptionChargeState state) {
    this.state = state;
  }

   /**
   * The date and time when the charge failed.
   * @return failedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  public SubscriptionCharge transaction(Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

   /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedUrl() {
    return failedUrl;
  }



   /**
   * The date and time when the charge succeeded.
   * @return succeedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceedOn() {
    return succeedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCharge subscriptionCharge = (SubscriptionCharge) o;
    return Objects.equals(this.discardedOn, subscriptionCharge.discardedOn) &&
        Objects.equals(this.plannedExecutionDate, subscriptionCharge.plannedExecutionDate) &&
        Objects.equals(this.processingType, subscriptionCharge.processingType) &&
        Objects.equals(this.ledgerEntries, subscriptionCharge.ledgerEntries) &&
        Objects.equals(this.discardedBy, subscriptionCharge.discardedBy) &&
        Objects.equals(this.plannedPurgeDate, subscriptionCharge.plannedPurgeDate) &&
        Objects.equals(this.externalId, subscriptionCharge.externalId) &&
        Objects.equals(this.successUrl, subscriptionCharge.successUrl) &&
        Objects.equals(this.language, subscriptionCharge.language) &&
        Objects.equals(this.subscription, subscriptionCharge.subscription) &&
        Objects.equals(this.type, subscriptionCharge.type) &&
        Objects.equals(this.createdOn, subscriptionCharge.createdOn) &&
        Objects.equals(this.version, subscriptionCharge.version) &&
        Objects.equals(this.reference, subscriptionCharge.reference) &&
        Objects.equals(this.linkedSpaceId, subscriptionCharge.linkedSpaceId) &&
        Objects.equals(this.id, subscriptionCharge.id) &&
        Objects.equals(this.state, subscriptionCharge.state) &&
        Objects.equals(this.failedOn, subscriptionCharge.failedOn) &&
        Objects.equals(this.transaction, subscriptionCharge.transaction) &&
        Objects.equals(this.failedUrl, subscriptionCharge.failedUrl) &&
        Objects.equals(this.succeedOn, subscriptionCharge.succeedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discardedOn, plannedExecutionDate, processingType, ledgerEntries, discardedBy, plannedPurgeDate, externalId, successUrl, language, subscription, type, createdOn, version, reference, linkedSpaceId, id, state, failedOn, transaction, failedUrl, succeedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCharge {\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    ledgerEntries: ").append(toIndentedString(ledgerEntries)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    succeedOn: ").append(toIndentedString(succeedOn)).append("\n");
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

    // add `plannedExecutionDate` to the URL query string
    if (getPlannedExecutionDate() != null) {
      try {
        joiner.add(String.format("%splannedExecutionDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedExecutionDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processingType` to the URL query string
    if (getProcessingType() != null) {
      try {
        joiner.add(String.format("%sprocessingType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ledgerEntries` to the URL query string
    if (getLedgerEntries() != null) {
      int i = 0;
      for (SubscriptionLedgerEntry _item : getLedgerEntries()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sledgerEntries%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `successUrl` to the URL query string
    if (getSuccessUrl() != null) {
      try {
        joiner.add(String.format("%ssuccessUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      joiner.add(getSubscription().toUrlQueryString(prefix + "subscription" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    // add `failedUrl` to the URL query string
    if (getFailedUrl() != null) {
      try {
        joiner.add(String.format("%sfailedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `succeedOn` to the URL query string
    if (getSucceedOn() != null) {
      try {
        joiner.add(String.format("%ssucceedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSucceedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

