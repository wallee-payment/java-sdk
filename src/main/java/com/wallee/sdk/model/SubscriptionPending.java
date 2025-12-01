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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionPending
 */
@JsonPropertyOrder({
  SubscriptionPending.JSON_PROPERTY_DESCRIPTION,
  SubscriptionPending.JSON_PROPERTY_PLANNED_TERMINATION_DATE,
  SubscriptionPending.JSON_PROPERTY_AFFILIATE,
  SubscriptionPending.JSON_PROPERTY_VERSION,
  SubscriptionPending.JSON_PROPERTY_REFERENCE,
  SubscriptionPending.JSON_PROPERTY_SUBSCRIBER,
  SubscriptionPending.JSON_PROPERTY_TOKEN
})
@JsonTypeName("Subscription.Pending")

public class SubscriptionPending {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_PLANNED_TERMINATION_DATE = "plannedTerminationDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedTerminationDate;

  public static final String JSON_PROPERTY_AFFILIATE = "affiliate";
  @javax.annotation.Nullable
  private Long affiliate;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private String reference;

  public static final String JSON_PROPERTY_SUBSCRIBER = "subscriber";
  @javax.annotation.Nullable
  private Long subscriber;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private Long token;

  public SubscriptionPending() {
  }

  public SubscriptionPending description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * A description used to identify the subscription.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public SubscriptionPending plannedTerminationDate(@javax.annotation.Nullable OffsetDateTime plannedTerminationDate) {
    
    this.plannedTerminationDate = plannedTerminationDate;
    return this;
  }

  /**
   * The date and time when the subscription is planned to be terminated.
   * @return plannedTerminationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_TERMINATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }


  @JsonProperty(JSON_PROPERTY_PLANNED_TERMINATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlannedTerminationDate(@javax.annotation.Nullable OffsetDateTime plannedTerminationDate) {
    this.plannedTerminationDate = plannedTerminationDate;
  }

  public SubscriptionPending affiliate(@javax.annotation.Nullable Long affiliate) {
    
    this.affiliate = affiliate;
    return this;
  }

  /**
   * The affiliate that led to the creation of the subscription.
   * @return affiliate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAffiliate() {
    return affiliate;
  }


  @JsonProperty(JSON_PROPERTY_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffiliate(@javax.annotation.Nullable Long affiliate) {
    this.affiliate = affiliate;
  }

  public SubscriptionPending version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }

  public SubscriptionPending reference(@javax.annotation.Nullable String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the subscription.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(@javax.annotation.Nullable String reference) {
    this.reference = reference;
  }

  public SubscriptionPending subscriber(@javax.annotation.Nullable Long subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

  /**
   * The subscriber that the subscription belongs to.
   * @return subscriber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriber() {
    return subscriber;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriber(@javax.annotation.Nullable Long subscriber) {
    this.subscriber = subscriber;
  }

  public SubscriptionPending token(@javax.annotation.Nullable Long token) {
    
    this.token = token;
    return this;
  }

  /**
   * The payment token that is used to charge the customer.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@javax.annotation.Nullable Long token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPending subscriptionPending = (SubscriptionPending) o;
    return Objects.equals(this.description, subscriptionPending.description) &&
        Objects.equals(this.plannedTerminationDate, subscriptionPending.plannedTerminationDate) &&
        Objects.equals(this.affiliate, subscriptionPending.affiliate) &&
        Objects.equals(this.version, subscriptionPending.version) &&
        Objects.equals(this.reference, subscriptionPending.reference) &&
        Objects.equals(this.subscriber, subscriptionPending.subscriber) &&
        Objects.equals(this.token, subscriptionPending.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, plannedTerminationDate, affiliate, version, reference, subscriber, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPending {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedTerminationDate` to the URL query string
    if (getPlannedTerminationDate() != null) {
      try {
        joiner.add(String.format("%splannedTerminationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedTerminationDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `affiliate` to the URL query string
    if (getAffiliate() != null) {
      try {
        joiner.add(String.format("%saffiliate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAffiliate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `subscriber` to the URL query string
    if (getSubscriber() != null) {
      try {
        joiner.add(String.format("%ssubscriber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

