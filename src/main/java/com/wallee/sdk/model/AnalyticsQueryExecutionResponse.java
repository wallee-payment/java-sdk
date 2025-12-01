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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AnalyticsQueryExecutionResponse
 */
@JsonPropertyOrder({
  AnalyticsQueryExecutionResponse.JSON_PROPERTY_QUERY_TOKEN
})

public class AnalyticsQueryExecutionResponse {
  public static final String JSON_PROPERTY_QUERY_TOKEN = "queryToken";
  @javax.annotation.Nullable
  private String queryToken;

  public AnalyticsQueryExecutionResponse() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public AnalyticsQueryExecutionResponse(
    @JsonProperty(JSON_PROPERTY_QUERY_TOKEN) String queryToken
  ) {
    this();
    this.queryToken = queryToken;
  }

  /**
   * The unique query token associated with a submitted analytics query execution. This token can be used to check the execution status of the query.
   * @return queryToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQueryToken() {
    return queryToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryExecutionResponse analyticsQueryExecutionResponse = (AnalyticsQueryExecutionResponse) o;
    return Objects.equals(this.queryToken, analyticsQueryExecutionResponse.queryToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryExecutionResponse {\n");
    sb.append("    queryToken: ").append(toIndentedString(queryToken)).append("\n");
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

    // add `queryToken` to the URL query string
    if (getQueryToken() != null) {
      try {
        joiner.add(String.format("%squeryToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQueryToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

