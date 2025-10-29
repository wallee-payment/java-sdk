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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The metric usage provides details about the consumption of a particular metric.
 */
@JsonPropertyOrder({
  MetricUsage.JSON_PROPERTY_CONSUMED_UNITS,
  MetricUsage.JSON_PROPERTY_METRIC_DESCRIPTION,
  MetricUsage.JSON_PROPERTY_METRIC_NAME,
  MetricUsage.JSON_PROPERTY_METRIC_ID
})

public class MetricUsage {
  public static final String JSON_PROPERTY_CONSUMED_UNITS = "consumedUnits";
  private BigDecimal consumedUnits;

  public static final String JSON_PROPERTY_METRIC_DESCRIPTION = "metricDescription";
  private Map<String, String> metricDescription = new HashMap<>();

  public static final String JSON_PROPERTY_METRIC_NAME = "metricName";
  private Map<String, String> metricName = new HashMap<>();

  public static final String JSON_PROPERTY_METRIC_ID = "metricId";
  private Long metricId;

  public MetricUsage() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public MetricUsage(
    @JsonProperty(JSON_PROPERTY_CONSUMED_UNITS) BigDecimal consumedUnits, 
    @JsonProperty(JSON_PROPERTY_METRIC_DESCRIPTION) Map<String, String> metricDescription, 
    @JsonProperty(JSON_PROPERTY_METRIC_NAME) Map<String, String> metricName, 
    @JsonProperty(JSON_PROPERTY_METRIC_ID) Long metricId
  ) {
    this();
    this.consumedUnits = consumedUnits;
    this.metricDescription = metricDescription;
    this.metricName = metricName;
    this.metricId = metricId;
  }

   /**
   * The number of consumed units.
   * @return consumedUnits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMED_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConsumedUnits() {
    return consumedUnits;
  }



   /**
   * The description of the consumed unit&#39;s metric.
   * @return metricDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetricDescription() {
    return metricDescription;
  }



   /**
   * The name of the consumed units&#39; metric.
   * @return metricName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetricName() {
    return metricName;
  }



   /**
   * The ID of the consumed units&#39; metric.
   * @return metricId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMetricId() {
    return metricId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricUsage metricUsage = (MetricUsage) o;
    return Objects.equals(this.consumedUnits, metricUsage.consumedUnits) &&
        Objects.equals(this.metricDescription, metricUsage.metricDescription) &&
        Objects.equals(this.metricName, metricUsage.metricName) &&
        Objects.equals(this.metricId, metricUsage.metricId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumedUnits, metricDescription, metricName, metricId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricUsage {\n");
    sb.append("    consumedUnits: ").append(toIndentedString(consumedUnits)).append("\n");
    sb.append("    metricDescription: ").append(toIndentedString(metricDescription)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
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

    // add `metricDescription` to the URL query string
    if (getMetricDescription() != null) {
      for (String _key : getMetricDescription().keySet()) {
        try {
          joiner.add(String.format("%smetricDescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetricDescription().get(_key), URLEncoder.encode(String.valueOf(getMetricDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `metricName` to the URL query string
    if (getMetricName() != null) {
      for (String _key : getMetricName().keySet()) {
        try {
          joiner.add(String.format("%smetricName%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetricName().get(_key), URLEncoder.encode(String.valueOf(getMetricName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `metricId` to the URL query string
    if (getMetricId() != null) {
      try {
        joiner.add(String.format("%smetricId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetricId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

