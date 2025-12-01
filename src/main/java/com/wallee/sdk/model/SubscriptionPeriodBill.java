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
import com.wallee.sdk.model.SubscriptionPeriodBillState;
import com.wallee.sdk.model.SubscriptionVersion;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionPeriodBill
 */
@JsonPropertyOrder({
  SubscriptionPeriodBill.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionPeriodBill.JSON_PROPERTY_PERIOD_START_DATE,
  SubscriptionPeriodBill.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionPeriodBill.JSON_PROPERTY_SUBSCRIPTION_VERSION,
  SubscriptionPeriodBill.JSON_PROPERTY_EFFECTIVE_PERIOD_END_DATE,
  SubscriptionPeriodBill.JSON_PROPERTY_LANGUAGE,
  SubscriptionPeriodBill.JSON_PROPERTY_ID,
  SubscriptionPeriodBill.JSON_PROPERTY_STATE,
  SubscriptionPeriodBill.JSON_PROPERTY_CREATED_ON,
  SubscriptionPeriodBill.JSON_PROPERTY_PLANNED_PERIOD_END_DATE,
  SubscriptionPeriodBill.JSON_PROPERTY_VERSION
})

public class SubscriptionPeriodBill {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_PERIOD_START_DATE = "periodStartDate";
  @javax.annotation.Nullable
  private OffsetDateTime periodStartDate;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_SUBSCRIPTION_VERSION = "subscriptionVersion";
  @javax.annotation.Nullable
  private SubscriptionVersion subscriptionVersion;

  public static final String JSON_PROPERTY_EFFECTIVE_PERIOD_END_DATE = "effectivePeriodEndDate";
  @javax.annotation.Nullable
  private OffsetDateTime effectivePeriodEndDate;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private SubscriptionPeriodBillState state;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_PLANNED_PERIOD_END_DATE = "plannedPeriodEndDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPeriodEndDate;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public SubscriptionPeriodBill() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SubscriptionPeriodBill(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_PERIOD_START_DATE) OffsetDateTime periodStartDate, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_PERIOD_END_DATE) OffsetDateTime effectivePeriodEndDate, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PERIOD_END_DATE) OffsetDateTime plannedPeriodEndDate, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.periodStartDate = periodStartDate;
    this.plannedPurgeDate = plannedPurgeDate;
    this.effectivePeriodEndDate = effectivePeriodEndDate;
    this.language = language;
    this.id = id;
    this.createdOn = createdOn;
    this.plannedPeriodEndDate = plannedPeriodEndDate;
    this.version = version;
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
   * The date and time when the period started.
   * @return periodStartDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPeriodStartDate() {
    return periodStartDate;
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



  public SubscriptionPeriodBill subscriptionVersion(@javax.annotation.Nullable SubscriptionVersion subscriptionVersion) {
    
    this.subscriptionVersion = subscriptionVersion;
    return this;
  }

  /**
   * Get subscriptionVersion
   * @return subscriptionVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionVersion getSubscriptionVersion() {
    return subscriptionVersion;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionVersion(@javax.annotation.Nullable SubscriptionVersion subscriptionVersion) {
    this.subscriptionVersion = subscriptionVersion;
  }

  /**
   * The date and time when the period actually ended.
   * @return effectivePeriodEndDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_PERIOD_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEffectivePeriodEndDate() {
    return effectivePeriodEndDate;
  }



  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
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



  public SubscriptionPeriodBill state(@javax.annotation.Nullable SubscriptionPeriodBillState state) {
    
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

  public SubscriptionPeriodBillState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable SubscriptionPeriodBillState state) {
    this.state = state;
  }

  /**
   * The date and time when the period bill was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The date and time when the period is planned to end.
   * @return plannedPeriodEndDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PERIOD_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPeriodEndDate() {
    return plannedPeriodEndDate;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPeriodBill subscriptionPeriodBill = (SubscriptionPeriodBill) o;
    return Objects.equals(this.linkedSpaceId, subscriptionPeriodBill.linkedSpaceId) &&
        Objects.equals(this.periodStartDate, subscriptionPeriodBill.periodStartDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionPeriodBill.plannedPurgeDate) &&
        Objects.equals(this.subscriptionVersion, subscriptionPeriodBill.subscriptionVersion) &&
        Objects.equals(this.effectivePeriodEndDate, subscriptionPeriodBill.effectivePeriodEndDate) &&
        Objects.equals(this.language, subscriptionPeriodBill.language) &&
        Objects.equals(this.id, subscriptionPeriodBill.id) &&
        Objects.equals(this.state, subscriptionPeriodBill.state) &&
        Objects.equals(this.createdOn, subscriptionPeriodBill.createdOn) &&
        Objects.equals(this.plannedPeriodEndDate, subscriptionPeriodBill.plannedPeriodEndDate) &&
        Objects.equals(this.version, subscriptionPeriodBill.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, periodStartDate, plannedPurgeDate, subscriptionVersion, effectivePeriodEndDate, language, id, state, createdOn, plannedPeriodEndDate, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPeriodBill {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    effectivePeriodEndDate: ").append(toIndentedString(effectivePeriodEndDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    plannedPeriodEndDate: ").append(toIndentedString(plannedPeriodEndDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `periodStartDate` to the URL query string
    if (getPeriodStartDate() != null) {
      try {
        joiner.add(String.format("%speriodStartDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriodStartDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `subscriptionVersion` to the URL query string
    if (getSubscriptionVersion() != null) {
      joiner.add(getSubscriptionVersion().toUrlQueryString(prefix + "subscriptionVersion" + suffix));
    }

    // add `effectivePeriodEndDate` to the URL query string
    if (getEffectivePeriodEndDate() != null) {
      try {
        joiner.add(String.format("%seffectivePeriodEndDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEffectivePeriodEndDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPeriodEndDate` to the URL query string
    if (getPlannedPeriodEndDate() != null) {
      try {
        joiner.add(String.format("%splannedPeriodEndDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPeriodEndDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

