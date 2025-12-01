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
import com.wallee.sdk.model.RestAddressFormat;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RestCountry
 */
@JsonPropertyOrder({
  RestCountry.JSON_PROPERTY_ISO_CODE2,
  RestCountry.JSON_PROPERTY_ADDRESS_FORMAT,
  RestCountry.JSON_PROPERTY_ISO_CODE3,
  RestCountry.JSON_PROPERTY_STATE_CODES,
  RestCountry.JSON_PROPERTY_NAME,
  RestCountry.JSON_PROPERTY_NUMERIC_CODE
})

public class RestCountry {
  public static final String JSON_PROPERTY_ISO_CODE2 = "isoCode2";
  @javax.annotation.Nullable
  private String isoCode2;

  public static final String JSON_PROPERTY_ADDRESS_FORMAT = "addressFormat";
  @javax.annotation.Nullable
  private RestAddressFormat addressFormat;

  public static final String JSON_PROPERTY_ISO_CODE3 = "isoCode3";
  @javax.annotation.Nullable
  private String isoCode3;

  public static final String JSON_PROPERTY_STATE_CODES = "stateCodes";
  @javax.annotation.Nullable
  private Set<String> stateCodes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_NUMERIC_CODE = "numericCode";
  @javax.annotation.Nullable
  private String numericCode;

  public RestCountry() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public RestCountry(
    @JsonProperty(JSON_PROPERTY_ISO_CODE2) String isoCode2, 
    @JsonProperty(JSON_PROPERTY_ISO_CODE3) String isoCode3, 
    @JsonProperty(JSON_PROPERTY_STATE_CODES) Set<String> stateCodes, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_NUMERIC_CODE) String numericCode
  ) {
    this();
    this.isoCode2 = isoCode2;
    this.isoCode3 = isoCode3;
    this.stateCodes = stateCodes;
    this.name = name;
    this.numericCode = numericCode;
  }

  /**
   * The country&#39;s two-letter code (ISO 3166-1 alpha-2 format).
   * @return isoCode2
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO_CODE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsoCode2() {
    return isoCode2;
  }



  public RestCountry addressFormat(@javax.annotation.Nullable RestAddressFormat addressFormat) {
    
    this.addressFormat = addressFormat;
    return this;
  }

  /**
   * Get addressFormat
   * @return addressFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestAddressFormat getAddressFormat() {
    return addressFormat;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressFormat(@javax.annotation.Nullable RestAddressFormat addressFormat) {
    this.addressFormat = addressFormat;
  }

  /**
   * The country&#39;s three-letter code (ISO 3166-1 alpha-3 format).
   * @return isoCode3
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO_CODE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsoCode3() {
    return isoCode3;
  }



  /**
   * The codes of all regions (e.g. states, provinces) of the country (ISO 3166-2 format).
   * @return stateCodes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getStateCodes() {
    return stateCodes;
  }



  /**
   * The name of the country.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * The country&#39;s three-digit code (ISO 3166-1 numeric format).
   * @return numericCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMERIC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumericCode() {
    return numericCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCountry restCountry = (RestCountry) o;
    return Objects.equals(this.isoCode2, restCountry.isoCode2) &&
        Objects.equals(this.addressFormat, restCountry.addressFormat) &&
        Objects.equals(this.isoCode3, restCountry.isoCode3) &&
        Objects.equals(this.stateCodes, restCountry.stateCodes) &&
        Objects.equals(this.name, restCountry.name) &&
        Objects.equals(this.numericCode, restCountry.numericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode2, addressFormat, isoCode3, stateCodes, name, numericCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCountry {\n");
    sb.append("    isoCode2: ").append(toIndentedString(isoCode2)).append("\n");
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    isoCode3: ").append(toIndentedString(isoCode3)).append("\n");
    sb.append("    stateCodes: ").append(toIndentedString(stateCodes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericCode: ").append(toIndentedString(numericCode)).append("\n");
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

    // add `isoCode2` to the URL query string
    if (getIsoCode2() != null) {
      try {
        joiner.add(String.format("%sisoCode2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsoCode2()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `addressFormat` to the URL query string
    if (getAddressFormat() != null) {
      joiner.add(getAddressFormat().toUrlQueryString(prefix + "addressFormat" + suffix));
    }

    // add `isoCode3` to the URL query string
    if (getIsoCode3() != null) {
      try {
        joiner.add(String.format("%sisoCode3%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsoCode3()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stateCodes` to the URL query string
    if (getStateCodes() != null) {
      int i = 0;
      for (String _item : getStateCodes()) {
        try {
          joiner.add(String.format("%sstateCodes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
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

    // add `numericCode` to the URL query string
    if (getNumericCode() != null) {
      try {
        joiner.add(String.format("%snumericCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumericCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

