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
import com.wallee.sdk.model.LabelDescriptor;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Label
 */
@JsonPropertyOrder({
  Label.JSON_PROPERTY_CONTENT_AS_STRING,
  Label.JSON_PROPERTY_DESCRIPTOR,
  Label.JSON_PROPERTY_CONTENT
})

public class Label {
  public static final String JSON_PROPERTY_CONTENT_AS_STRING = "contentAsString";
  @javax.annotation.Nullable
  private String contentAsString;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  @javax.annotation.Nullable
  private LabelDescriptor descriptor;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private JsonNullable<Object> content = JsonNullable.<Object>of(null);

  public Label() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Label(
    @JsonProperty(JSON_PROPERTY_CONTENT_AS_STRING) String contentAsString, 
    @JsonProperty(JSON_PROPERTY_CONTENT) Object content
  ) {
    this();
    this.contentAsString = contentAsString;
    this.content = content == null ? JsonNullable.<Object>undefined() : JsonNullable.of(content);
  }

  /**
   * The label&#39;s content formatted as string.
   * @return contentAsString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_AS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentAsString() {
    return contentAsString;
  }



  public Label descriptor(@javax.annotation.Nullable LabelDescriptor descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelDescriptor getDescriptor() {
    return descriptor;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptor(@javax.annotation.Nullable LabelDescriptor descriptor) {
    this.descriptor = descriptor;
  }

  /**
   * The label&#39;s actual content.
   * @return content
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getContent() {
    
    if (content == null) {
      content = JsonNullable.<Object>of(null);
    }
    return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  private void setContent_JsonNullable(JsonNullable<Object> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.contentAsString, label.contentAsString) &&
        Objects.equals(this.descriptor, label.descriptor) &&
        equalsNullable(this.content, label.content);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentAsString, descriptor, hashCodeNullable(content));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    sb.append("    contentAsString: ").append(toIndentedString(contentAsString)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

    // add `contentAsString` to the URL query string
    if (getContentAsString() != null) {
      try {
        joiner.add(String.format("%scontentAsString%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentAsString()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `descriptor` to the URL query string
    if (getDescriptor() != null) {
      joiner.add(getDescriptor().toUrlQueryString(prefix + "descriptor" + suffix));
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

