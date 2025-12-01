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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The metric usage is the actual usage of a metric for a particular subscription as collected by an external application.
 */
@JsonPropertyOrder({
  SubscriptionMetricUsageReportCreate.JSON_PROPERTY_CONSUMED_UNITS,
  SubscriptionMetricUsageReportCreate.JSON_PROPERTY_METRIC,
  SubscriptionMetricUsageReportCreate.JSON_PROPERTY_DESCRIPTION,
  SubscriptionMetricUsageReportCreate.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionMetricUsageReportCreate.JSON_PROPERTY_SUBSCRIPTION
})
@JsonTypeName("SubscriptionMetricUsageReport.Create")

public class SubscriptionMetricUsageReportCreate {
  public static final String JSON_PROPERTY_CONSUMED_UNITS = "consumedUnits";
  @javax.annotation.Nonnull
  private BigDecimal consumedUnits;

  public static final String JSON_PROPERTY_METRIC = "metric";
  @javax.annotation.Nonnull
  private Long metric;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nonnull
  private String externalId;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  @javax.annotation.Nonnull
  private Long subscription;

  public SubscriptionMetricUsageReportCreate() {
  }

  public SubscriptionMetricUsageReportCreate consumedUnits(@javax.annotation.Nonnull BigDecimal consumedUnits) {
    
    this.consumedUnits = consumedUnits;
    return this;
  }

  /**
   * The number of resources consumed, will be charged in the next billing cycle.
   * @return consumedUnits
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSUMED_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMED_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumedUnits(@javax.annotation.Nonnull BigDecimal consumedUnits) {
    this.consumedUnits = consumedUnits;
  }

  public SubscriptionMetricUsageReportCreate metric(@javax.annotation.Nonnull Long metric) {
    
    this.metric = metric;
    return this;
  }

  /**
   * The metric that the usage report is recorded for.
   * @return metric
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetric(@javax.annotation.Nonnull Long metric) {
    this.metric = metric;
  }

  public SubscriptionMetricUsageReportCreate description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * A description used to identify the usage report.
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

  public SubscriptionMetricUsageReportCreate externalId(@javax.annotation.Nonnull String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }

  public SubscriptionMetricUsageReportCreate subscription(@javax.annotation.Nonnull Long subscription) {
    
    this.subscription = subscription;
    return this;
  }

  /**
   * The subscription that the usage report is recorded for.
   * @return subscription
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscription(@javax.annotation.Nonnull Long subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionMetricUsageReportCreate subscriptionMetricUsageReportCreate = (SubscriptionMetricUsageReportCreate) o;
    return Objects.equals(this.consumedUnits, subscriptionMetricUsageReportCreate.consumedUnits) &&
        Objects.equals(this.metric, subscriptionMetricUsageReportCreate.metric) &&
        Objects.equals(this.description, subscriptionMetricUsageReportCreate.description) &&
        Objects.equals(this.externalId, subscriptionMetricUsageReportCreate.externalId) &&
        Objects.equals(this.subscription, subscriptionMetricUsageReportCreate.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumedUnits, metric, description, externalId, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMetricUsageReportCreate {\n");
    sb.append("    consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

    // add `consumedUnits` to the URL query string
    if (getConsumedUnits() != null) {
      try {
        joiner.add(String.format("%sconsumedUnits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumedUnits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metric` to the URL query string
    if (getMetric() != null) {
      try {
        joiner.add(String.format("%smetric%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetric()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      try {
        joiner.add(String.format("%ssubscription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

