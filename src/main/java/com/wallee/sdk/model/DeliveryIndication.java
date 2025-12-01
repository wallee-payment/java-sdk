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
import com.wallee.sdk.model.DeliveryIndicationDecisionReason;
import com.wallee.sdk.model.DeliveryIndicationState;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCompletion;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DeliveryIndication
 */
@JsonPropertyOrder({
  DeliveryIndication.JSON_PROPERTY_COMPLETION,
  DeliveryIndication.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DeliveryIndication.JSON_PROPERTY_AUTOMATIC_DECISION_REASON,
  DeliveryIndication.JSON_PROPERTY_AUTOMATICALLY_DECIDED_ON,
  DeliveryIndication.JSON_PROPERTY_CREATED_ON,
  DeliveryIndication.JSON_PROPERTY_LINKED_SPACE_ID,
  DeliveryIndication.JSON_PROPERTY_MANUALLY_DECIDED_BY,
  DeliveryIndication.JSON_PROPERTY_TIMEOUT_ON,
  DeliveryIndication.JSON_PROPERTY_MANUAL_DECISION_TIMEOUT_ON,
  DeliveryIndication.JSON_PROPERTY_MANUALLY_DECIDED_ON,
  DeliveryIndication.JSON_PROPERTY_ID,
  DeliveryIndication.JSON_PROPERTY_STATE,
  DeliveryIndication.JSON_PROPERTY_LINKED_TRANSACTION,
  DeliveryIndication.JSON_PROPERTY_TRANSACTION
})

public class DeliveryIndication {
  public static final String JSON_PROPERTY_COMPLETION = "completion";
  @javax.annotation.Nullable
  private TransactionCompletion completion;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_AUTOMATIC_DECISION_REASON = "automaticDecisionReason";
  @javax.annotation.Nullable
  private DeliveryIndicationDecisionReason automaticDecisionReason;

  public static final String JSON_PROPERTY_AUTOMATICALLY_DECIDED_ON = "automaticallyDecidedOn";
  @javax.annotation.Nullable
  private OffsetDateTime automaticallyDecidedOn;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_MANUALLY_DECIDED_BY = "manuallyDecidedBy";
  @javax.annotation.Nullable
  private Long manuallyDecidedBy;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  @javax.annotation.Nullable
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_MANUAL_DECISION_TIMEOUT_ON = "manualDecisionTimeoutOn";
  @javax.annotation.Nullable
  private OffsetDateTime manualDecisionTimeoutOn;

  public static final String JSON_PROPERTY_MANUALLY_DECIDED_ON = "manuallyDecidedOn";
  @javax.annotation.Nullable
  private OffsetDateTime manuallyDecidedOn;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private DeliveryIndicationState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private Transaction transaction;

  public DeliveryIndication() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public DeliveryIndication(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_AUTOMATICALLY_DECIDED_ON) OffsetDateTime automaticallyDecidedOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_MANUALLY_DECIDED_BY) Long manuallyDecidedBy, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_MANUAL_DECISION_TIMEOUT_ON) OffsetDateTime manualDecisionTimeoutOn, 
    @JsonProperty(JSON_PROPERTY_MANUALLY_DECIDED_ON) OffsetDateTime manuallyDecidedOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.automaticallyDecidedOn = automaticallyDecidedOn;
    this.createdOn = createdOn;
    this.linkedSpaceId = linkedSpaceId;
    this.manuallyDecidedBy = manuallyDecidedBy;
    this.timeoutOn = timeoutOn;
    this.manualDecisionTimeoutOn = manualDecisionTimeoutOn;
    this.manuallyDecidedOn = manuallyDecidedOn;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
  }

  public DeliveryIndication completion(@javax.annotation.Nullable TransactionCompletion completion) {
    
    this.completion = completion;
    return this;
  }

  /**
   * Get completion
   * @return completion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletion getCompletion() {
    return completion;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(@javax.annotation.Nullable TransactionCompletion completion) {
    this.completion = completion;
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



  public DeliveryIndication automaticDecisionReason(@javax.annotation.Nullable DeliveryIndicationDecisionReason automaticDecisionReason) {
    
    this.automaticDecisionReason = automaticDecisionReason;
    return this;
  }

  /**
   * Get automaticDecisionReason
   * @return automaticDecisionReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATIC_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryIndicationDecisionReason getAutomaticDecisionReason() {
    return automaticDecisionReason;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATIC_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomaticDecisionReason(@javax.annotation.Nullable DeliveryIndicationDecisionReason automaticDecisionReason) {
    this.automaticDecisionReason = automaticDecisionReason;
  }

  /**
   * The date and time when an automatic decision was made.
   * @return automaticallyDecidedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATICALLY_DECIDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAutomaticallyDecidedOn() {
    return automaticallyDecidedOn;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The ID of the user who manually decided the delivery indication&#39;s state.
   * @return manuallyDecidedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUALLY_DECIDED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getManuallyDecidedBy() {
    return manuallyDecidedBy;
  }



  /**
   * The date and time when the delivery indication will expire.
   * @return timeoutOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



  /**
   * The date and time by which a decision must be made before the system automatically proceeds according to the connector&#39;s predefined settings.
   * @return manualDecisionTimeoutOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUAL_DECISION_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getManualDecisionTimeoutOn() {
    return manualDecisionTimeoutOn;
  }



  /**
   * The date and time when a manual decision was made.
   * @return manuallyDecidedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUALLY_DECIDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getManuallyDecidedOn() {
    return manuallyDecidedOn;
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



  public DeliveryIndication state(@javax.annotation.Nullable DeliveryIndicationState state) {
    
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

  public DeliveryIndicationState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable DeliveryIndicationState state) {
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



  public DeliveryIndication transaction(@javax.annotation.Nullable Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(@javax.annotation.Nullable Transaction transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryIndication deliveryIndication = (DeliveryIndication) o;
    return Objects.equals(this.completion, deliveryIndication.completion) &&
        Objects.equals(this.plannedPurgeDate, deliveryIndication.plannedPurgeDate) &&
        Objects.equals(this.automaticDecisionReason, deliveryIndication.automaticDecisionReason) &&
        Objects.equals(this.automaticallyDecidedOn, deliveryIndication.automaticallyDecidedOn) &&
        Objects.equals(this.createdOn, deliveryIndication.createdOn) &&
        Objects.equals(this.linkedSpaceId, deliveryIndication.linkedSpaceId) &&
        Objects.equals(this.manuallyDecidedBy, deliveryIndication.manuallyDecidedBy) &&
        Objects.equals(this.timeoutOn, deliveryIndication.timeoutOn) &&
        Objects.equals(this.manualDecisionTimeoutOn, deliveryIndication.manualDecisionTimeoutOn) &&
        Objects.equals(this.manuallyDecidedOn, deliveryIndication.manuallyDecidedOn) &&
        Objects.equals(this.id, deliveryIndication.id) &&
        Objects.equals(this.state, deliveryIndication.state) &&
        Objects.equals(this.linkedTransaction, deliveryIndication.linkedTransaction) &&
        Objects.equals(this.transaction, deliveryIndication.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completion, plannedPurgeDate, automaticDecisionReason, automaticallyDecidedOn, createdOn, linkedSpaceId, manuallyDecidedBy, timeoutOn, manualDecisionTimeoutOn, manuallyDecidedOn, id, state, linkedTransaction, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryIndication {\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    automaticDecisionReason: ").append(toIndentedString(automaticDecisionReason)).append("\n");
    sb.append("    automaticallyDecidedOn: ").append(toIndentedString(automaticallyDecidedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    manuallyDecidedBy: ").append(toIndentedString(manuallyDecidedBy)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    manualDecisionTimeoutOn: ").append(toIndentedString(manualDecisionTimeoutOn)).append("\n");
    sb.append("    manuallyDecidedOn: ").append(toIndentedString(manuallyDecidedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `automaticDecisionReason` to the URL query string
    if (getAutomaticDecisionReason() != null) {
      joiner.add(getAutomaticDecisionReason().toUrlQueryString(prefix + "automaticDecisionReason" + suffix));
    }

    // add `automaticallyDecidedOn` to the URL query string
    if (getAutomaticallyDecidedOn() != null) {
      try {
        joiner.add(String.format("%sautomaticallyDecidedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutomaticallyDecidedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manuallyDecidedBy` to the URL query string
    if (getManuallyDecidedBy() != null) {
      try {
        joiner.add(String.format("%smanuallyDecidedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManuallyDecidedBy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `manualDecisionTimeoutOn` to the URL query string
    if (getManualDecisionTimeoutOn() != null) {
      try {
        joiner.add(String.format("%smanualDecisionTimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManualDecisionTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manuallyDecidedOn` to the URL query string
    if (getManuallyDecidedOn() != null) {
      try {
        joiner.add(String.format("%smanuallyDecidedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManuallyDecidedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    return joiner.toString();
  }

}

