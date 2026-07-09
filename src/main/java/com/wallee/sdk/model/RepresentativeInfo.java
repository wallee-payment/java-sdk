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
import com.wallee.sdk.model.SoleProprietorshipInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RepresentativeInfo
 */
@JsonPropertyOrder({
  RepresentativeInfo.JSON_PROPERTY_PHONE_NUMBER,
  RepresentativeInfo.JSON_PROPERTY_SOLE_PROPRIETORSHIP_INFO
})

public class RepresentativeInfo {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  @javax.annotation.Nullable
  private String phoneNumber;

  public static final String JSON_PROPERTY_SOLE_PROPRIETORSHIP_INFO = "soleProprietorshipInfo";
  @javax.annotation.Nullable
  private SoleProprietorshipInfo soleProprietorshipInfo;

  public RepresentativeInfo() {
  }

  public RepresentativeInfo phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RepresentativeInfo soleProprietorshipInfo(@javax.annotation.Nullable SoleProprietorshipInfo soleProprietorshipInfo) {
    
    this.soleProprietorshipInfo = soleProprietorshipInfo;
    return this;
  }

  /**
   * Get soleProprietorshipInfo
   * @return soleProprietorshipInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SoleProprietorshipInfo getSoleProprietorshipInfo() {
    return soleProprietorshipInfo;
  }


  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoleProprietorshipInfo(@javax.annotation.Nullable SoleProprietorshipInfo soleProprietorshipInfo) {
    this.soleProprietorshipInfo = soleProprietorshipInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentativeInfo representativeInfo = (RepresentativeInfo) o;
    return Objects.equals(this.phoneNumber, representativeInfo.phoneNumber) &&
        Objects.equals(this.soleProprietorshipInfo, representativeInfo.soleProprietorshipInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, soleProprietorshipInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentativeInfo {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    soleProprietorshipInfo: ").append(toIndentedString(soleProprietorshipInfo)).append("\n");
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

    // add `phoneNumber` to the URL query string
    if (getPhoneNumber() != null) {
      try {
        joiner.add(String.format("%sphoneNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `soleProprietorshipInfo` to the URL query string
    if (getSoleProprietorshipInfo() != null) {
      joiner.add(getSoleProprietorshipInfo().toUrlQueryString(prefix + "soleProprietorshipInfo" + suffix));
    }

    return joiner.toString();
  }

}

