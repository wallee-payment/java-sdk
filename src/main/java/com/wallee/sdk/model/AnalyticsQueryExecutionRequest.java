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
 * AnalyticsQueryExecutionRequest
 */
@JsonPropertyOrder({
  AnalyticsQueryExecutionRequest.JSON_PROPERTY_SFTP_DISPATCH_SETTINGS_ID,
  AnalyticsQueryExecutionRequest.JSON_PROPERTY_SFTP_DISPATCH_RESULT_FILE_RENAME_PATTERN,
  AnalyticsQueryExecutionRequest.JSON_PROPERTY_SQL
})

public class AnalyticsQueryExecutionRequest {
  public static final String JSON_PROPERTY_SFTP_DISPATCH_SETTINGS_ID = "sftpDispatchSettingsId";
  @javax.annotation.Nullable
  private Long sftpDispatchSettingsId;

  public static final String JSON_PROPERTY_SFTP_DISPATCH_RESULT_FILE_RENAME_PATTERN = "sftpDispatchResultFileRenamePattern";
  @javax.annotation.Nullable
  private String sftpDispatchResultFileRenamePattern;

  public static final String JSON_PROPERTY_SQL = "sql";
  @javax.annotation.Nullable
  private String sql;

  public AnalyticsQueryExecutionRequest() {
  }

  public AnalyticsQueryExecutionRequest sftpDispatchSettingsId(@javax.annotation.Nullable Long sftpDispatchSettingsId) {
    
    this.sftpDispatchSettingsId = sftpDispatchSettingsId;
    return this;
  }

  /**
   * Optional. ID of the active SFTP configuration to use (associated with the target account). This is only required if the result file is scheduled for delivery to a remote SFTP server.
   * @return sftpDispatchSettingsId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SFTP_DISPATCH_SETTINGS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSftpDispatchSettingsId() {
    return sftpDispatchSettingsId;
  }


  @JsonProperty(JSON_PROPERTY_SFTP_DISPATCH_SETTINGS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSftpDispatchSettingsId(@javax.annotation.Nullable Long sftpDispatchSettingsId) {
    this.sftpDispatchSettingsId = sftpDispatchSettingsId;
  }

  public AnalyticsQueryExecutionRequest sftpDispatchResultFileRenamePattern(@javax.annotation.Nullable String sftpDispatchResultFileRenamePattern) {
    
    this.sftpDispatchResultFileRenamePattern = sftpDispatchResultFileRenamePattern;
    return this;
  }

  /**
   * Optional. Renaming pattern used for the result file during SFTP delivery. You can use a combination of fixed Latin text and timestamp variables (e.g., \&quot;transaction_report_{YYYMMDD_hhmmss}\&quot;). Supported variable formats: DDMMYY, MMDDYY, YYYYMMDD, DD_MM_YY, DD-MM-YY, YYYY-MM-DD, YYYY_MM_DD, YYYYMMDD_hhmmss, YYYY-MM-DD_hh-mm-ss.
   * @return sftpDispatchResultFileRenamePattern
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SFTP_DISPATCH_RESULT_FILE_RENAME_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSftpDispatchResultFileRenamePattern() {
    return sftpDispatchResultFileRenamePattern;
  }


  @JsonProperty(JSON_PROPERTY_SFTP_DISPATCH_RESULT_FILE_RENAME_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSftpDispatchResultFileRenamePattern(@javax.annotation.Nullable String sftpDispatchResultFileRenamePattern) {
    this.sftpDispatchResultFileRenamePattern = sftpDispatchResultFileRenamePattern;
  }

  public AnalyticsQueryExecutionRequest sql(@javax.annotation.Nullable String sql) {
    
    this.sql = sql;
    return this;
  }

  /**
   * The SQL query (in PrestoDB dialect) to execute on the analytics database. This query defines exactly which data should be retrieved.
   * @return sql
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSql() {
    return sql;
  }


  @JsonProperty(JSON_PROPERTY_SQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSql(@javax.annotation.Nullable String sql) {
    this.sql = sql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryExecutionRequest analyticsQueryExecutionRequest = (AnalyticsQueryExecutionRequest) o;
    return Objects.equals(this.sftpDispatchSettingsId, analyticsQueryExecutionRequest.sftpDispatchSettingsId) &&
        Objects.equals(this.sftpDispatchResultFileRenamePattern, analyticsQueryExecutionRequest.sftpDispatchResultFileRenamePattern) &&
        Objects.equals(this.sql, analyticsQueryExecutionRequest.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sftpDispatchSettingsId, sftpDispatchResultFileRenamePattern, sql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryExecutionRequest {\n");
    sb.append("    sftpDispatchSettingsId: ").append(toIndentedString(sftpDispatchSettingsId)).append("\n");
    sb.append("    sftpDispatchResultFileRenamePattern: ").append(toIndentedString(sftpDispatchResultFileRenamePattern)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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

    // add `sftpDispatchSettingsId` to the URL query string
    if (getSftpDispatchSettingsId() != null) {
      try {
        joiner.add(String.format("%ssftpDispatchSettingsId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSftpDispatchSettingsId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sftpDispatchResultFileRenamePattern` to the URL query string
    if (getSftpDispatchResultFileRenamePattern() != null) {
      try {
        joiner.add(String.format("%ssftpDispatchResultFileRenamePattern%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSftpDispatchResultFileRenamePattern()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sql` to the URL query string
    if (getSql() != null) {
      try {
        joiner.add(String.format("%ssql%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSql()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

