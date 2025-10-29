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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.RestAddressFormatField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RestAddressFormat
 */
@JsonPropertyOrder({
  RestAddressFormat.JSON_PROPERTY_POST_CODE_EXAMPLES,
  RestAddressFormat.JSON_PROPERTY_REQUIRED_FIELDS,
  RestAddressFormat.JSON_PROPERTY_USED_FIELDS,
  RestAddressFormat.JSON_PROPERTY_POST_CODE_REGEX
})

public class RestAddressFormat {
  public static final String JSON_PROPERTY_POST_CODE_EXAMPLES = "postCodeExamples";
  private List<String> postCodeExamples = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUIRED_FIELDS = "requiredFields";
  private Set<RestAddressFormatField> requiredFields = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_USED_FIELDS = "usedFields";
  private Set<RestAddressFormatField> usedFields = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_POST_CODE_REGEX = "postCodeRegex";
  private String postCodeRegex;

  public RestAddressFormat() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public RestAddressFormat(
    @JsonProperty(JSON_PROPERTY_POST_CODE_EXAMPLES) List<String> postCodeExamples, 
    @JsonProperty(JSON_PROPERTY_REQUIRED_FIELDS) Set<RestAddressFormatField> requiredFields, 
    @JsonProperty(JSON_PROPERTY_USED_FIELDS) Set<RestAddressFormatField> usedFields, 
    @JsonProperty(JSON_PROPERTY_POST_CODE_REGEX) String postCodeRegex
  ) {
    this();
    this.postCodeExamples = postCodeExamples;
    this.requiredFields = requiredFields;
    this.usedFields = usedFields;
    this.postCodeRegex = postCodeRegex;
  }

   /**
   * A list of sample post codes.
   * @return postCodeExamples
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_CODE_EXAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPostCodeExamples() {
    return postCodeExamples;
  }



   /**
   * The fields that are required in the address format.
   * @return requiredFields
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<RestAddressFormatField> getRequiredFields() {
    return requiredFields;
  }



   /**
   * The fields that are used in the address format.
   * @return usedFields
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<RestAddressFormatField> getUsedFields() {
    return usedFields;
  }



   /**
   * The regular expression to validate post codes.
   * @return postCodeRegex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_CODE_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostCodeRegex() {
    return postCodeRegex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestAddressFormat restAddressFormat = (RestAddressFormat) o;
    return Objects.equals(this.postCodeExamples, restAddressFormat.postCodeExamples) &&
        Objects.equals(this.requiredFields, restAddressFormat.requiredFields) &&
        Objects.equals(this.usedFields, restAddressFormat.usedFields) &&
        Objects.equals(this.postCodeRegex, restAddressFormat.postCodeRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postCodeExamples, requiredFields, usedFields, postCodeRegex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestAddressFormat {\n");
    sb.append("    postCodeExamples: ").append(toIndentedString(postCodeExamples)).append("\n");
    sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append("\n");
    sb.append("    usedFields: ").append(toIndentedString(usedFields)).append("\n");
    sb.append("    postCodeRegex: ").append(toIndentedString(postCodeRegex)).append("\n");
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

    // add `postCodeExamples` to the URL query string
    if (getPostCodeExamples() != null) {
      for (int i = 0; i < getPostCodeExamples().size(); i++) {
        try {
          joiner.add(String.format("%spostCodeExamples%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPostCodeExamples().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `requiredFields` to the URL query string
    if (getRequiredFields() != null) {
      int i = 0;
      for (RestAddressFormatField _item : getRequiredFields()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%srequiredFields%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
        i++;
      }
    }

    // add `usedFields` to the URL query string
    if (getUsedFields() != null) {
      int i = 0;
      for (RestAddressFormatField _item : getUsedFields()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%susedFields%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
        i++;
      }
    }

    // add `postCodeRegex` to the URL query string
    if (getPostCodeRegex() != null) {
      try {
        joiner.add(String.format("%spostCodeRegex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostCodeRegex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

