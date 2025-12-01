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
 * RenderedDocument
 */
@JsonPropertyOrder({
  RenderedDocument.JSON_PROPERTY_DOCUMENT_TEMPLATE_TYPE,
  RenderedDocument.JSON_PROPERTY_DATA,
  RenderedDocument.JSON_PROPERTY_MIME_TYPE,
  RenderedDocument.JSON_PROPERTY_TITLE
})

public class RenderedDocument {
  public static final String JSON_PROPERTY_DOCUMENT_TEMPLATE_TYPE = "documentTemplateType";
  @javax.annotation.Nullable
  private Long documentTemplateType;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private byte[] data;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  @javax.annotation.Nullable
  private String mimeType;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public RenderedDocument() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public RenderedDocument(
    @JsonProperty(JSON_PROPERTY_DOCUMENT_TEMPLATE_TYPE) Long documentTemplateType, 
    @JsonProperty(JSON_PROPERTY_DATA) byte[] data, 
    @JsonProperty(JSON_PROPERTY_MIME_TYPE) String mimeType, 
    @JsonProperty(JSON_PROPERTY_TITLE) String title
  ) {
    this();
    this.documentTemplateType = documentTemplateType;
    this.data = data;
    this.mimeType = mimeType;
    this.title = title;
  }

  /**
   * The document&#39;s template type
   * @return documentTemplateType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TEMPLATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDocumentTemplateType() {
    return documentTemplateType;
  }



  /**
   * The binary data of the document
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getData() {
    return data;
  }



  /**
   * The document&#39;s content type
   * @return mimeType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }



  /**
   * The title of the rendered document
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderedDocument renderedDocument = (RenderedDocument) o;
    return Objects.equals(this.documentTemplateType, renderedDocument.documentTemplateType) &&
        Arrays.equals(this.data, renderedDocument.data) &&
        Objects.equals(this.mimeType, renderedDocument.mimeType) &&
        Objects.equals(this.title, renderedDocument.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTemplateType, Arrays.hashCode(data), mimeType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderedDocument {\n");
    sb.append("    documentTemplateType: ").append(toIndentedString(documentTemplateType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `documentTemplateType` to the URL query string
    if (getDocumentTemplateType() != null) {
      try {
        joiner.add(String.format("%sdocumentTemplateType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocumentTemplateType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `data` to the URL query string
    if (getData() != null) {
      try {
        joiner.add(String.format("%sdata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getData()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mimeType` to the URL query string
    if (getMimeType() != null) {
      try {
        joiner.add(String.format("%smimeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMimeType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

