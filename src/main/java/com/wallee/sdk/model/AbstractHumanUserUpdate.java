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
import com.wallee.sdk.model.CreationEntityState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AbstractHumanUserUpdate
 */
@JsonPropertyOrder({
  AbstractHumanUserUpdate.JSON_PROPERTY_MOBILE_PHONE_NUMBER,
  AbstractHumanUserUpdate.JSON_PROPERTY_TWO_FACTOR_ENABLED,
  AbstractHumanUserUpdate.JSON_PROPERTY_EMAIL_ADDRESS,
  AbstractHumanUserUpdate.JSON_PROPERTY_FIRSTNAME,
  AbstractHumanUserUpdate.JSON_PROPERTY_TIME_ZONE,
  AbstractHumanUserUpdate.JSON_PROPERTY_LANGUAGE,
  AbstractHumanUserUpdate.JSON_PROPERTY_STATE,
  AbstractHumanUserUpdate.JSON_PROPERTY_LASTNAME
})
@JsonTypeName("Abstract.HumanUser.Update")

public class AbstractHumanUserUpdate {
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

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_LASTNAME = "lastname";
  @javax.annotation.Nullable
  private String lastname;

  public AbstractHumanUserUpdate() {
  }

  public AbstractHumanUserUpdate mobilePhoneNumber(@javax.annotation.Nullable String mobilePhoneNumber) {
    
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
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


  @JsonProperty(JSON_PROPERTY_MOBILE_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePhoneNumber(@javax.annotation.Nullable String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public AbstractHumanUserUpdate twoFactorEnabled(@javax.annotation.Nullable Boolean twoFactorEnabled) {
    
    this.twoFactorEnabled = twoFactorEnabled;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwoFactorEnabled(@javax.annotation.Nullable Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
  }

  public AbstractHumanUserUpdate emailAddress(@javax.annotation.Nullable String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
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


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AbstractHumanUserUpdate firstname(@javax.annotation.Nullable String firstname) {
    
    this.firstname = firstname;
    return this;
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


  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstname(@javax.annotation.Nullable String firstname) {
    this.firstname = firstname;
  }

  public AbstractHumanUserUpdate timeZone(@javax.annotation.Nullable String timeZone) {
    
    this.timeZone = timeZone;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public AbstractHumanUserUpdate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  public AbstractHumanUserUpdate state(@javax.annotation.Nullable CreationEntityState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable CreationEntityState state) {
    this.state = state;
  }

  public AbstractHumanUserUpdate lastname(@javax.annotation.Nullable String lastname) {
    
    this.lastname = lastname;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastname(@javax.annotation.Nullable String lastname) {
    this.lastname = lastname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractHumanUserUpdate abstractHumanUserUpdate = (AbstractHumanUserUpdate) o;
    return Objects.equals(this.mobilePhoneNumber, abstractHumanUserUpdate.mobilePhoneNumber) &&
        Objects.equals(this.twoFactorEnabled, abstractHumanUserUpdate.twoFactorEnabled) &&
        Objects.equals(this.emailAddress, abstractHumanUserUpdate.emailAddress) &&
        Objects.equals(this.firstname, abstractHumanUserUpdate.firstname) &&
        Objects.equals(this.timeZone, abstractHumanUserUpdate.timeZone) &&
        Objects.equals(this.language, abstractHumanUserUpdate.language) &&
        Objects.equals(this.state, abstractHumanUserUpdate.state) &&
        Objects.equals(this.lastname, abstractHumanUserUpdate.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobilePhoneNumber, twoFactorEnabled, emailAddress, firstname, timeZone, language, state, lastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractHumanUserUpdate {\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
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

