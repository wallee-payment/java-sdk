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
import com.wallee.sdk.model.TwoFactorAuthenticationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * HumanUser
 */
@JsonPropertyOrder({
  HumanUser.JSON_PROPERTY_MOBILE_PHONE_NUMBER,
  HumanUser.JSON_PROPERTY_TWO_FACTOR_ENABLED,
  HumanUser.JSON_PROPERTY_EMAIL_ADDRESS,
  HumanUser.JSON_PROPERTY_FIRSTNAME,
  HumanUser.JSON_PROPERTY_EMAIL_ADDRESS_VERIFIED,
  HumanUser.JSON_PROPERTY_SCOPE,
  HumanUser.JSON_PROPERTY_TIME_ZONE,
  HumanUser.JSON_PROPERTY_LANGUAGE,
  HumanUser.JSON_PROPERTY_TWO_FACTOR_TYPE,
  HumanUser.JSON_PROPERTY_MOBILE_PHONE_VERIFIED,
  HumanUser.JSON_PROPERTY_PRIMARY_ACCOUNT,
  HumanUser.JSON_PROPERTY_LASTNAME
})

public class HumanUser {
  public static final String JSON_PROPERTY_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
  @javax.annotation.Nullable
  private String mobilePhoneNumber;

  public static final String JSON_PROPERTY_TWO_FACTOR_ENABLED = "twoFactorEnabled";
  @javax.annotation.Nullable
  private Boolean twoFactorEnabled;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  @javax.annotation.Nullable
  private String emailAddress;

  public static final String JSON_PROPERTY_FIRSTNAME = "firstname";
  @javax.annotation.Nullable
  private String firstname;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS_VERIFIED = "emailAddressVerified";
  @javax.annotation.Nullable
  private Boolean emailAddressVerified;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable
  private Long scope;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_TWO_FACTOR_TYPE = "twoFactorType";
  @javax.annotation.Nullable
  private TwoFactorAuthenticationType twoFactorType;

  public static final String JSON_PROPERTY_MOBILE_PHONE_VERIFIED = "mobilePhoneVerified";
  @javax.annotation.Nullable
  private Boolean mobilePhoneVerified;

  public static final String JSON_PROPERTY_PRIMARY_ACCOUNT = "primaryAccount";
  @javax.annotation.Nullable
  private Long primaryAccount;

  public static final String JSON_PROPERTY_LASTNAME = "lastname";
  @javax.annotation.Nullable
  private String lastname;

  public HumanUser() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public HumanUser(
    @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER) String mobilePhoneNumber, 
    @JsonProperty(JSON_PROPERTY_TWO_FACTOR_ENABLED) Boolean twoFactorEnabled, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS) String emailAddress, 
    @JsonProperty(JSON_PROPERTY_FIRSTNAME) String firstname, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS_VERIFIED) Boolean emailAddressVerified, 
    @JsonProperty(JSON_PROPERTY_SCOPE) Long scope, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_VERIFIED) Boolean mobilePhoneVerified, 
    @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT) Long primaryAccount, 
    @JsonProperty(JSON_PROPERTY_LASTNAME) String lastname
  ) {
    this();
    this.mobilePhoneNumber = mobilePhoneNumber;
    this.twoFactorEnabled = twoFactorEnabled;
    this.emailAddress = emailAddress;
    this.firstname = firstname;
    this.emailAddressVerified = emailAddressVerified;
    this.scope = scope;
    this.timeZone = timeZone;
    this.language = language;
    this.mobilePhoneVerified = mobilePhoneVerified;
    this.primaryAccount = primaryAccount;
    this.lastname = lastname;
  }

  /**
   * The user&#39;s mobile phone number.
   * @return mobilePhoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }



  /**
   * Whether two-factor authentication is enabled for this user.
   * @return twoFactorEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTwoFactorEnabled() {
    return twoFactorEnabled;
  }



  /**
   * The user&#39;s email address.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }



  /**
   * The user&#39;s first name.
   * @return firstname
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstname() {
    return firstname;
  }



  /**
   * Whether the user&#39;s email address has been verified.
   * @return emailAddressVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailAddressVerified() {
    return emailAddressVerified;
  }



  /**
   * The scope that the user belongs to.
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getScope() {
    return scope;
  }



  /**
   * The user&#39;s time zone. If none is specified, the one provided by the browser will be used.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



  /**
   * The user&#39;s preferred language.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  public HumanUser twoFactorType(@javax.annotation.Nullable TwoFactorAuthenticationType twoFactorType) {
    
    this.twoFactorType = twoFactorType;
    return this;
  }

  /**
   * Get twoFactorType
   * @return twoFactorType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TwoFactorAuthenticationType getTwoFactorType() {
    return twoFactorType;
  }


  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwoFactorType(@javax.annotation.Nullable TwoFactorAuthenticationType twoFactorType) {
    this.twoFactorType = twoFactorType;
  }

  /**
   * Whether the user&#39;s mobile phone number has been verified.
   * @return mobilePhoneVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMobilePhoneVerified() {
    return mobilePhoneVerified;
  }



  /**
   * The primary account that the user belongs to.
   * @return primaryAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPrimaryAccount() {
    return primaryAccount;
  }



  /**
   * The user&#39;s last name.
   * @return lastname
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastname() {
    return lastname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanUser humanUser = (HumanUser) o;
    return Objects.equals(this.mobilePhoneNumber, humanUser.mobilePhoneNumber) &&
        Objects.equals(this.twoFactorEnabled, humanUser.twoFactorEnabled) &&
        Objects.equals(this.emailAddress, humanUser.emailAddress) &&
        Objects.equals(this.firstname, humanUser.firstname) &&
        Objects.equals(this.emailAddressVerified, humanUser.emailAddressVerified) &&
        Objects.equals(this.scope, humanUser.scope) &&
        Objects.equals(this.timeZone, humanUser.timeZone) &&
        Objects.equals(this.language, humanUser.language) &&
        Objects.equals(this.twoFactorType, humanUser.twoFactorType) &&
        Objects.equals(this.mobilePhoneVerified, humanUser.mobilePhoneVerified) &&
        Objects.equals(this.primaryAccount, humanUser.primaryAccount) &&
        Objects.equals(this.lastname, humanUser.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobilePhoneNumber, twoFactorEnabled, emailAddress, firstname, emailAddressVerified, scope, timeZone, language, twoFactorType, mobilePhoneVerified, primaryAccount, lastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanUser {\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    emailAddressVerified: ").append(toIndentedString(emailAddressVerified)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    twoFactorType: ").append(toIndentedString(twoFactorType)).append("\n");
    sb.append("    mobilePhoneVerified: ").append(toIndentedString(mobilePhoneVerified)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
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

    // add `mobilePhoneNumber` to the URL query string
    if (getMobilePhoneNumber() != null) {
      try {
        joiner.add(String.format("%smobilePhoneNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `twoFactorEnabled` to the URL query string
    if (getTwoFactorEnabled() != null) {
      try {
        joiner.add(String.format("%stwoFactorEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTwoFactorEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emailAddress` to the URL query string
    if (getEmailAddress() != null) {
      try {
        joiner.add(String.format("%semailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firstname` to the URL query string
    if (getFirstname() != null) {
      try {
        joiner.add(String.format("%sfirstname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstname()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emailAddressVerified` to the URL query string
    if (getEmailAddressVerified() != null) {
      try {
        joiner.add(String.format("%semailAddressVerified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddressVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `twoFactorType` to the URL query string
    if (getTwoFactorType() != null) {
      joiner.add(getTwoFactorType().toUrlQueryString(prefix + "twoFactorType" + suffix));
    }

    // add `mobilePhoneVerified` to the URL query string
    if (getMobilePhoneVerified() != null) {
      try {
        joiner.add(String.format("%smobilePhoneVerified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMobilePhoneVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primaryAccount` to the URL query string
    if (getPrimaryAccount() != null) {
      try {
        joiner.add(String.format("%sprimaryAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastname` to the URL query string
    if (getLastname() != null) {
      try {
        joiner.add(String.format("%slastname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastname()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

