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
import com.wallee.sdk.model.TransactionInvoice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InvoiceSearchResponse
 */
@JsonPropertyOrder({
  InvoiceSearchResponse.JSON_PROPERTY_DATA,
  InvoiceSearchResponse.JSON_PROPERTY_OFFSET,
  InvoiceSearchResponse.JSON_PROPERTY_HAS_MORE,
  InvoiceSearchResponse.JSON_PROPERTY_LIMIT
})
@JsonTypeName("Invoice_Search_Response")

public class InvoiceSearchResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private List<TransactionInvoice> data = new ArrayList<>();

  public static final String JSON_PROPERTY_OFFSET = "offset";
  @javax.annotation.Nullable
  private Integer offset;

  public static final String JSON_PROPERTY_HAS_MORE = "hasMore";
  @javax.annotation.Nullable
  private Boolean hasMore;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public InvoiceSearchResponse() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public InvoiceSearchResponse(
    @JsonProperty(JSON_PROPERTY_DATA) List<TransactionInvoice> data, 
    @JsonProperty(JSON_PROPERTY_OFFSET) Integer offset, 
    @JsonProperty(JSON_PROPERTY_HAS_MORE) Boolean hasMore, 
    @JsonProperty(JSON_PROPERTY_LIMIT) Integer limit
  ) {
    this();
    this.data = data;
    this.offset = offset;
    this.hasMore = hasMore;
    this.limit = limit;
  }

  /**
   * An array containing the actual response objects.
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransactionInvoice> getData() {
    return data;
  }



  /**
   * The number of skipped objects.
   * @return offset
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }



  /**
   * Whether there are more objects available after this set. If false, there are no more objects to retrieve.
   * @return hasMore
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMore() {
    return hasMore;
  }



  /**
   * The applied limit on the number of objects returned.
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceSearchResponse invoiceSearchResponse = (InvoiceSearchResponse) o;
    return Objects.equals(this.data, invoiceSearchResponse.data) &&
        Objects.equals(this.offset, invoiceSearchResponse.offset) &&
        Objects.equals(this.hasMore, invoiceSearchResponse.hasMore) &&
        Objects.equals(this.limit, invoiceSearchResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, offset, hasMore, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceSearchResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format("%sdata%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `offset` to the URL query string
    if (getOffset() != null) {
      try {
        joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffset()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hasMore` to the URL query string
    if (getHasMore() != null) {
      try {
        joiner.add(String.format("%shasMore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasMore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

