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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionVoidMode;
import com.wallee.sdk.model.TransactionVoidState;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionVoid
 */
@JsonPropertyOrder({
  TransactionVoid.JSON_PROPERTY_PLANNED_PURGE_DATE,
  TransactionVoid.JSON_PROPERTY_LANGUAGE,
  TransactionVoid.JSON_PROPERTY_SPACE_VIEW_ID,
  TransactionVoid.JSON_PROPERTY_CREATED_ON,
  TransactionVoid.JSON_PROPERTY_VERSION,
  TransactionVoid.JSON_PROPERTY_LABELS,
  TransactionVoid.JSON_PROPERTY_MODE,
  TransactionVoid.JSON_PROPERTY_LINKED_SPACE_ID,
  TransactionVoid.JSON_PROPERTY_TIMEOUT_ON,
  TransactionVoid.JSON_PROPERTY_CREATED_BY,
  TransactionVoid.JSON_PROPERTY_NEXT_UPDATE_ON,
  TransactionVoid.JSON_PROPERTY_FAILURE_REASON,
  TransactionVoid.JSON_PROPERTY_SUCCEEDED_ON,
  TransactionVoid.JSON_PROPERTY_ID,
  TransactionVoid.JSON_PROPERTY_STATE,
  TransactionVoid.JSON_PROPERTY_LINKED_TRANSACTION,
  TransactionVoid.JSON_PROPERTY_FAILED_ON,
  TransactionVoid.JSON_PROPERTY_TRANSACTION,
  TransactionVoid.JSON_PROPERTY_PROCESSOR_REFERENCE
})

public class TransactionVoid {
  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Set<Label> labels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  private TransactionVoidMode mode;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_NEXT_UPDATE_ON = "nextUpdateOn";
  private OffsetDateTime nextUpdateOn;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_SUCCEEDED_ON = "succeededOn";
  private OffsetDateTime succeededOn;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private TransactionVoidState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private Transaction transaction;

  public static final String JSON_PROPERTY_PROCESSOR_REFERENCE = "processorReference";
  private String processorReference;

  public TransactionVoid() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public TransactionVoid(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON) OffsetDateTime nextUpdateOn, 
    @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON) OffsetDateTime succeededOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_PROCESSOR_REFERENCE) String processorReference
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.language = language;
    this.spaceViewId = spaceViewId;
    this.createdOn = createdOn;
    this.version = version;
    this.labels = labels;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.createdBy = createdBy;
    this.nextUpdateOn = nextUpdateOn;
    this.succeededOn = succeededOn;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.failedOn = failedOn;
    this.processorReference = processorReference;
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
   * The labels providing additional information about the object.
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
  }



  public TransactionVoid mode(TransactionVoidMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionVoidMode getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(TransactionVoidMode mode) {
    this.mode = mode;
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
   * The date and time when the object will expire.
   * @return timeoutOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



   /**
   * The ID of the user the transaction void was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



   /**
   * The date and time when the next update of the object&#39;s state is planned.
   * @return nextUpdateOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNextUpdateOn() {
    return nextUpdateOn;
  }



  public TransactionVoid failureReason(FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(FailureReason failureReason) {
    this.failureReason = failureReason;
  }

   /**
   * The date and time when the transaction void succeeded.
   * @return succeededOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceededOn() {
    return succeededOn;
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



  public TransactionVoid state(TransactionVoidState state) {
    
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

  public TransactionVoidState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(TransactionVoidState state) {
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
   * The date and time when the transaction void failed.
   * @return failedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  public TransactionVoid transaction(Transaction transaction) {
    
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
   * The reference ID provided by the payment processor, used to trace the void through the external payment system.
   * @return processorReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessorReference() {
    return processorReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVoid transactionVoid = (TransactionVoid) o;
    return Objects.equals(this.plannedPurgeDate, transactionVoid.plannedPurgeDate) &&
        Objects.equals(this.language, transactionVoid.language) &&
        Objects.equals(this.spaceViewId, transactionVoid.spaceViewId) &&
        Objects.equals(this.createdOn, transactionVoid.createdOn) &&
        Objects.equals(this.version, transactionVoid.version) &&
        Objects.equals(this.labels, transactionVoid.labels) &&
        Objects.equals(this.mode, transactionVoid.mode) &&
        Objects.equals(this.linkedSpaceId, transactionVoid.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, transactionVoid.timeoutOn) &&
        Objects.equals(this.createdBy, transactionVoid.createdBy) &&
        Objects.equals(this.nextUpdateOn, transactionVoid.nextUpdateOn) &&
        Objects.equals(this.failureReason, transactionVoid.failureReason) &&
        Objects.equals(this.succeededOn, transactionVoid.succeededOn) &&
        Objects.equals(this.id, transactionVoid.id) &&
        Objects.equals(this.state, transactionVoid.state) &&
        Objects.equals(this.linkedTransaction, transactionVoid.linkedTransaction) &&
        Objects.equals(this.failedOn, transactionVoid.failedOn) &&
        Objects.equals(this.transaction, transactionVoid.transaction) &&
        Objects.equals(this.processorReference, transactionVoid.processorReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedPurgeDate, language, spaceViewId, createdOn, version, labels, mode, linkedSpaceId, timeoutOn, createdBy, nextUpdateOn, failureReason, succeededOn, id, state, linkedTransaction, failedOn, transaction, processorReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVoid {\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    processorReference: ").append(toIndentedString(processorReference)).append("\n");
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

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (Label _item : getLabels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slabels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `timeoutOn` to the URL query string
    if (getTimeoutOn() != null) {
      try {
        joiner.add(String.format("%stimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nextUpdateOn` to the URL query string
    if (getNextUpdateOn() != null) {
      try {
        joiner.add(String.format("%snextUpdateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextUpdateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `succeededOn` to the URL query string
    if (getSucceededOn() != null) {
      try {
        joiner.add(String.format("%ssucceededOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSucceededOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processorReference` to the URL query string
    if (getProcessorReference() != null) {
      try {
        joiner.add(String.format("%sprocessorReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessorReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

