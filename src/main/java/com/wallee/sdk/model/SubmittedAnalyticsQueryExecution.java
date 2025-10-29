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
import com.wallee.sdk.model.FacadeUserFriendlyQueryStatusModel;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubmittedAnalyticsQueryExecution
 */
@JsonPropertyOrder({
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_ACCOUNT_ID,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_TOTAL_BILLED_EXECUTION_TIME_MS,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_CREATED_TIMESTAMP,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_DOWNLOAD_REQUESTS,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_ORIGINAL_QUERY,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_SCANNED_BYTES,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_PORTAL_QUERY_TOKEN,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_RESULT_FILE_BYTES,
  SubmittedAnalyticsQueryExecution.JSON_PROPERTY_STATUS
})

public class SubmittedAnalyticsQueryExecution {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_TOTAL_BILLED_EXECUTION_TIME_MS = "totalBilledExecutionTimeMs";
  private Integer totalBilledExecutionTimeMs;

  public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
  private OffsetDateTime createdTimestamp;

  public static final String JSON_PROPERTY_DOWNLOAD_REQUESTS = "downloadRequests";
  private Long downloadRequests;

  public static final String JSON_PROPERTY_ORIGINAL_QUERY = "originalQuery";
  private String originalQuery;

  public static final String JSON_PROPERTY_SCANNED_BYTES = "scannedBytes";
  private Integer scannedBytes;

  public static final String JSON_PROPERTY_PORTAL_QUERY_TOKEN = "portalQueryToken";
  private String portalQueryToken;

  public static final String JSON_PROPERTY_RESULT_FILE_BYTES = "resultFileBytes";
  private Integer resultFileBytes;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FacadeUserFriendlyQueryStatusModel status;

  public SubmittedAnalyticsQueryExecution() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubmittedAnalyticsQueryExecution(
    @JsonProperty(JSON_PROPERTY_ACCOUNT_ID) Long accountId, 
    @JsonProperty(JSON_PROPERTY_TOTAL_BILLED_EXECUTION_TIME_MS) Integer totalBilledExecutionTimeMs, 
    @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP) OffsetDateTime createdTimestamp, 
    @JsonProperty(JSON_PROPERTY_DOWNLOAD_REQUESTS) Long downloadRequests, 
    @JsonProperty(JSON_PROPERTY_ORIGINAL_QUERY) String originalQuery, 
    @JsonProperty(JSON_PROPERTY_SCANNED_BYTES) Integer scannedBytes, 
    @JsonProperty(JSON_PROPERTY_PORTAL_QUERY_TOKEN) String portalQueryToken, 
    @JsonProperty(JSON_PROPERTY_RESULT_FILE_BYTES) Integer resultFileBytes
  ) {
    this();
    this.accountId = accountId;
    this.totalBilledExecutionTimeMs = totalBilledExecutionTimeMs;
    this.createdTimestamp = createdTimestamp;
    this.downloadRequests = downloadRequests;
    this.originalQuery = originalQuery;
    this.scannedBytes = scannedBytes;
    this.portalQueryToken = portalQueryToken;
    this.resultFileBytes = resultFileBytes;
  }

   /**
   * The ID of the target account for which the analytics query will be executed, determining the data scope for the request.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }



   /**
   * The total execution time, in milliseconds, that has been billed for the query.
   * @return totalBilledExecutionTimeMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_BILLED_EXECUTION_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalBilledExecutionTimeMs() {
    return totalBilledExecutionTimeMs;
  }



   /**
   * The date and time when the query was created.
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedTimestamp() {
    return createdTimestamp;
  }



   /**
   * The number of times the query result file has been downloaded.
   * @return downloadRequests
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDownloadRequests() {
    return downloadRequests;
  }



   /**
   * The SQL query as originally submitted by the user.
   * @return originalQuery
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalQuery() {
    return originalQuery;
  }



   /**
   * The total bytes of data scanned by the submitted query.
   * @return scannedBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScannedBytes() {
    return scannedBytes;
  }



   /**
   * The unique query token associated with the analytics query execution.
   * @return portalQueryToken
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORTAL_QUERY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortalQueryToken() {
    return portalQueryToken;
  }



   /**
   * The size, in bytes, of the result file generated by the query.
   * @return resultFileBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultFileBytes() {
    return resultFileBytes;
  }



  public SubmittedAnalyticsQueryExecution status(FacadeUserFriendlyQueryStatusModel status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacadeUserFriendlyQueryStatusModel getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(FacadeUserFriendlyQueryStatusModel status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmittedAnalyticsQueryExecution submittedAnalyticsQueryExecution = (SubmittedAnalyticsQueryExecution) o;
    return Objects.equals(this.accountId, submittedAnalyticsQueryExecution.accountId) &&
        Objects.equals(this.totalBilledExecutionTimeMs, submittedAnalyticsQueryExecution.totalBilledExecutionTimeMs) &&
        Objects.equals(this.createdTimestamp, submittedAnalyticsQueryExecution.createdTimestamp) &&
        Objects.equals(this.downloadRequests, submittedAnalyticsQueryExecution.downloadRequests) &&
        Objects.equals(this.originalQuery, submittedAnalyticsQueryExecution.originalQuery) &&
        Objects.equals(this.scannedBytes, submittedAnalyticsQueryExecution.scannedBytes) &&
        Objects.equals(this.portalQueryToken, submittedAnalyticsQueryExecution.portalQueryToken) &&
        Objects.equals(this.resultFileBytes, submittedAnalyticsQueryExecution.resultFileBytes) &&
        Objects.equals(this.status, submittedAnalyticsQueryExecution.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, totalBilledExecutionTimeMs, createdTimestamp, downloadRequests, originalQuery, scannedBytes, portalQueryToken, resultFileBytes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedAnalyticsQueryExecution {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    totalBilledExecutionTimeMs: ").append(toIndentedString(totalBilledExecutionTimeMs)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    downloadRequests: ").append(toIndentedString(downloadRequests)).append("\n");
    sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
    sb.append("    scannedBytes: ").append(toIndentedString(scannedBytes)).append("\n");
    sb.append("    portalQueryToken: ").append(toIndentedString(portalQueryToken)).append("\n");
    sb.append("    resultFileBytes: ").append(toIndentedString(resultFileBytes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `accountId` to the URL query string
    if (getAccountId() != null) {
      try {
        joiner.add(String.format("%saccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalBilledExecutionTimeMs` to the URL query string
    if (getTotalBilledExecutionTimeMs() != null) {
      try {
        joiner.add(String.format("%stotalBilledExecutionTimeMs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalBilledExecutionTimeMs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdTimestamp` to the URL query string
    if (getCreatedTimestamp() != null) {
      try {
        joiner.add(String.format("%screatedTimestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `downloadRequests` to the URL query string
    if (getDownloadRequests() != null) {
      try {
        joiner.add(String.format("%sdownloadRequests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownloadRequests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `originalQuery` to the URL query string
    if (getOriginalQuery() != null) {
      try {
        joiner.add(String.format("%soriginalQuery%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginalQuery()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scannedBytes` to the URL query string
    if (getScannedBytes() != null) {
      try {
        joiner.add(String.format("%sscannedBytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScannedBytes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `portalQueryToken` to the URL query string
    if (getPortalQueryToken() != null) {
      try {
        joiner.add(String.format("%sportalQueryToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPortalQueryToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resultFileBytes` to the URL query string
    if (getResultFileBytes() != null) {
      try {
        joiner.add(String.format("%sresultFileBytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResultFileBytes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

