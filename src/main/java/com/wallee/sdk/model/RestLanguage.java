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
 * RestLanguage
 */
@JsonPropertyOrder({
  RestLanguage.JSON_PROPERTY_PRIMARY_OF_GROUP,
  RestLanguage.JSON_PROPERTY_COUNTRY_CODE,
  RestLanguage.JSON_PROPERTY_ISO2_CODE,
  RestLanguage.JSON_PROPERTY_NAME,
  RestLanguage.JSON_PROPERTY_IETF_CODE,
  RestLanguage.JSON_PROPERTY_ISO3_CODE,
  RestLanguage.JSON_PROPERTY_PLURAL_EXPRESSION
})

public class RestLanguage {
  public static final String JSON_PROPERTY_PRIMARY_OF_GROUP = "primaryOfGroup";
  @javax.annotation.Nullable
  private Boolean primaryOfGroup;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  @javax.annotation.Nullable
  private String countryCode;

  public static final String JSON_PROPERTY_ISO2_CODE = "iso2Code";
  @javax.annotation.Nullable
  private String iso2Code;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_IETF_CODE = "ietfCode";
  @javax.annotation.Nullable
  private String ietfCode;

  public static final String JSON_PROPERTY_ISO3_CODE = "iso3Code";
  @javax.annotation.Nullable
  private String iso3Code;

  public static final String JSON_PROPERTY_PLURAL_EXPRESSION = "pluralExpression";
  @javax.annotation.Nullable
  private String pluralExpression;

  public RestLanguage() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public RestLanguage(
    @JsonProperty(JSON_PROPERTY_PRIMARY_OF_GROUP) Boolean primaryOfGroup, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE) String countryCode, 
    @JsonProperty(JSON_PROPERTY_ISO2_CODE) String iso2Code, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_IETF_CODE) String ietfCode, 
    @JsonProperty(JSON_PROPERTY_ISO3_CODE) String iso3Code, 
    @JsonProperty(JSON_PROPERTY_PLURAL_EXPRESSION) String pluralExpression
  ) {
    this();
    this.primaryOfGroup = primaryOfGroup;
    this.countryCode = countryCode;
    this.iso2Code = iso2Code;
    this.name = name;
    this.ietfCode = ietfCode;
    this.iso3Code = iso3Code;
    this.pluralExpression = pluralExpression;
  }

  /**
   * Whether this is the primary language in a group of languages.
   * @return primaryOfGroup
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_OF_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimaryOfGroup() {
    return primaryOfGroup;
  }



  /**
   * The two-letter code of the language&#39;s region (ISO 3166-1 alpha-2 format).
   * @return countryCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }



  /**
   * The language&#39;s two-letter code (ISO 639-1 format).
   * @return iso2Code
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO2_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIso2Code() {
    return iso2Code;
  }



  /**
   * The name of the language.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * The language&#39;s IETF tag consisting of the two-letter ISO code and region e.g. en-US, de-CH.
   * @return ietfCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IETF_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIetfCode() {
    return ietfCode;
  }



  /**
   * The language&#39;s three-letter code (ISO 639-2/T format).
   * @return iso3Code
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO3_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIso3Code() {
    return iso3Code;
  }



  /**
   * The expression to determine the plural index for a given number of items used to find the proper plural form for translations.
   * @return pluralExpression
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLURAL_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPluralExpression() {
    return pluralExpression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestLanguage restLanguage = (RestLanguage) o;
    return Objects.equals(this.primaryOfGroup, restLanguage.primaryOfGroup) &&
        Objects.equals(this.countryCode, restLanguage.countryCode) &&
        Objects.equals(this.iso2Code, restLanguage.iso2Code) &&
        Objects.equals(this.name, restLanguage.name) &&
        Objects.equals(this.ietfCode, restLanguage.ietfCode) &&
        Objects.equals(this.iso3Code, restLanguage.iso3Code) &&
        Objects.equals(this.pluralExpression, restLanguage.pluralExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryOfGroup, countryCode, iso2Code, name, ietfCode, iso3Code, pluralExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestLanguage {\n");
    sb.append("    primaryOfGroup: ").append(toIndentedString(primaryOfGroup)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    iso2Code: ").append(toIndentedString(iso2Code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ietfCode: ").append(toIndentedString(ietfCode)).append("\n");
    sb.append("    iso3Code: ").append(toIndentedString(iso3Code)).append("\n");
    sb.append("    pluralExpression: ").append(toIndentedString(pluralExpression)).append("\n");
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

    // add `primaryOfGroup` to the URL query string
    if (getPrimaryOfGroup() != null) {
      try {
        joiner.add(String.format("%sprimaryOfGroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryOfGroup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countryCode` to the URL query string
    if (getCountryCode() != null) {
      try {
        joiner.add(String.format("%scountryCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iso2Code` to the URL query string
    if (getIso2Code() != null) {
      try {
        joiner.add(String.format("%siso2Code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIso2Code()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ietfCode` to the URL query string
    if (getIetfCode() != null) {
      try {
        joiner.add(String.format("%sietfCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIetfCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iso3Code` to the URL query string
    if (getIso3Code() != null) {
      try {
        joiner.add(String.format("%siso3Code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIso3Code()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pluralExpression` to the URL query string
    if (getPluralExpression() != null) {
      try {
        joiner.add(String.format("%spluralExpression%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPluralExpression()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

