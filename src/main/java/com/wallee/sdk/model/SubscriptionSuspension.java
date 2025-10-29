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
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionSuspensionAction;
import com.wallee.sdk.model.SubscriptionSuspensionReason;
import com.wallee.sdk.model.SubscriptionSuspensionState;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionSuspension
 */
@JsonPropertyOrder({
  SubscriptionSuspension.JSON_PROPERTY_EFFECTIVE_END_DATE,
  SubscriptionSuspension.JSON_PROPERTY_NOTE,
  SubscriptionSuspension.JSON_PROPERTY_REASON,
  SubscriptionSuspension.JSON_PROPERTY_PERIOD_BILL,
  SubscriptionSuspension.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionSuspension.JSON_PROPERTY_LANGUAGE,
  SubscriptionSuspension.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionSuspension.JSON_PROPERTY_CREATED_ON,
  SubscriptionSuspension.JSON_PROPERTY_VERSION,
  SubscriptionSuspension.JSON_PROPERTY_PLANNED_END_DATE,
  SubscriptionSuspension.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionSuspension.JSON_PROPERTY_END_ACTION,
  SubscriptionSuspension.JSON_PROPERTY_ID,
  SubscriptionSuspension.JSON_PROPERTY_STATE
})

public class SubscriptionSuspension {
  public static final String JSON_PROPERTY_EFFECTIVE_END_DATE = "effectiveEndDate";
  private OffsetDateTime effectiveEndDate;

  public static final String JSON_PROPERTY_NOTE = "note";
  private String note;

  public static final String JSON_PROPERTY_REASON = "reason";
  private SubscriptionSuspensionReason reason;

  public static final String JSON_PROPERTY_PERIOD_BILL = "periodBill";
  private Long periodBill;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private Subscription subscription;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_PLANNED_END_DATE = "plannedEndDate";
  private OffsetDateTime plannedEndDate;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_END_ACTION = "endAction";
  private SubscriptionSuspensionAction endAction;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private SubscriptionSuspensionState state;

  public SubscriptionSuspension() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionSuspension(
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_END_DATE) OffsetDateTime effectiveEndDate, 
    @JsonProperty(JSON_PROPERTY_NOTE) String note, 
    @JsonProperty(JSON_PROPERTY_PERIOD_BILL) Long periodBill, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_PLANNED_END_DATE) OffsetDateTime plannedEndDate, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.effectiveEndDate = effectiveEndDate;
    this.note = note;
    this.periodBill = periodBill;
    this.plannedPurgeDate = plannedPurgeDate;
    this.language = language;
    this.createdOn = createdOn;
    this.version = version;
    this.plannedEndDate = plannedEndDate;
    this.linkedSpaceId = linkedSpaceId;
    this.id = id;
  }

   /**
   * The date and time when the suspension ended.
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEffectiveEndDate() {
    return effectiveEndDate;
  }



   /**
   * A note that contains details about the suspension. It is not disclosed to the subscriber.
   * @return note
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNote() {
    return note;
  }



  public SubscriptionSuspension reason(SubscriptionSuspensionReason reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionSuspensionReason getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(SubscriptionSuspensionReason reason) {
    this.reason = reason;
  }

   /**
   * The period bill that led to the suspension of the subscription.
   * @return periodBill
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_BILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPeriodBill() {
    return periodBill;
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



  public SubscriptionSuspension subscription(Subscription subscription) {
    
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
   * The date and time when the suspension is planned to end.
   * @return plannedEndDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
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



  public SubscriptionSuspension endAction(SubscriptionSuspensionAction endAction) {
    
    this.endAction = endAction;
    return this;
  }

   /**
   * Get endAction
   * @return endAction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionSuspensionAction getEndAction() {
    return endAction;
  }


  @JsonProperty(JSON_PROPERTY_END_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAction(SubscriptionSuspensionAction endAction) {
    this.endAction = endAction;
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



  public SubscriptionSuspension state(SubscriptionSuspensionState state) {
    
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

  public SubscriptionSuspensionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(SubscriptionSuspensionState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSuspension subscriptionSuspension = (SubscriptionSuspension) o;
    return Objects.equals(this.effectiveEndDate, subscriptionSuspension.effectiveEndDate) &&
        Objects.equals(this.note, subscriptionSuspension.note) &&
        Objects.equals(this.reason, subscriptionSuspension.reason) &&
        Objects.equals(this.periodBill, subscriptionSuspension.periodBill) &&
        Objects.equals(this.plannedPurgeDate, subscriptionSuspension.plannedPurgeDate) &&
        Objects.equals(this.language, subscriptionSuspension.language) &&
        Objects.equals(this.subscription, subscriptionSuspension.subscription) &&
        Objects.equals(this.createdOn, subscriptionSuspension.createdOn) &&
        Objects.equals(this.version, subscriptionSuspension.version) &&
        Objects.equals(this.plannedEndDate, subscriptionSuspension.plannedEndDate) &&
        Objects.equals(this.linkedSpaceId, subscriptionSuspension.linkedSpaceId) &&
        Objects.equals(this.endAction, subscriptionSuspension.endAction) &&
        Objects.equals(this.id, subscriptionSuspension.id) &&
        Objects.equals(this.state, subscriptionSuspension.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveEndDate, note, reason, periodBill, plannedPurgeDate, language, subscription, createdOn, version, plannedEndDate, linkedSpaceId, endAction, id, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSuspension {\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    periodBill: ").append(toIndentedString(periodBill)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    endAction: ").append(toIndentedString(endAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `effectiveEndDate` to the URL query string
    if (getEffectiveEndDate() != null) {
      try {
        joiner.add(String.format("%seffectiveEndDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEffectiveEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `note` to the URL query string
    if (getNote() != null) {
      try {
        joiner.add(String.format("%snote%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNote()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      try {
        joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `periodBill` to the URL query string
    if (getPeriodBill() != null) {
      try {
        joiner.add(String.format("%speriodBill%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodBill()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `plannedEndDate` to the URL query string
    if (getPlannedEndDate() != null) {
      try {
        joiner.add(String.format("%splannedEndDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedEndDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `endAction` to the URL query string
    if (getEndAction() != null) {
      try {
        joiner.add(String.format("%sendAction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndAction()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

