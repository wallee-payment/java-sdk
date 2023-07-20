/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.TwoFactorAuthenticationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class HumanUser {
  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("emailAddressVerified")
  protected Boolean emailAddressVerified = null;

  
  @JsonProperty("firstname")
  protected String firstname = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lastname")
  protected String lastname = null;

  
  @JsonProperty("mobilePhoneNumber")
  protected String mobilePhoneNumber = null;

  
  @JsonProperty("mobilePhoneVerified")
  protected Boolean mobilePhoneVerified = null;

  
  @JsonProperty("primaryAccount")
  protected Long primaryAccount = null;

  
  @JsonProperty("scope")
  protected Long scope = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("twoFactorEnabled")
  protected Boolean twoFactorEnabled = null;

  
  @JsonProperty("twoFactorType")
  protected TwoFactorAuthenticationType twoFactorType = null;

  
  
   /**
   * The user&#39;s email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The user's email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  
   /**
   * Whether the user&#39;s email address has been verified.
   * @return emailAddressVerified
  **/
  @ApiModelProperty(value = "Whether the user's email address has been verified.")
  public Boolean isEmailAddressVerified() {
    return emailAddressVerified;
  }

  
   /**
   * The user&#39;s first name.
   * @return firstname
  **/
  @ApiModelProperty(value = "The user's first name.")
  public String getFirstname() {
    return firstname;
  }

  
   /**
   * The user&#39;s preferred language.
   * @return language
  **/
  @ApiModelProperty(value = "The user's preferred language.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The user&#39;s last name.
   * @return lastname
  **/
  @ApiModelProperty(value = "The user's last name.")
  public String getLastname() {
    return lastname;
  }

  
   /**
   * The user&#39;s mobile phone number.
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "The user's mobile phone number.")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  
   /**
   * Whether the user&#39;s mobile phone number has been verified.
   * @return mobilePhoneVerified
  **/
  @ApiModelProperty(value = "Whether the user's mobile phone number has been verified.")
  public Boolean isMobilePhoneVerified() {
    return mobilePhoneVerified;
  }

  
   /**
   * The primary account that the user belongs to.
   * @return primaryAccount
  **/
  @ApiModelProperty(value = "The primary account that the user belongs to.")
  public Long getPrimaryAccount() {
    return primaryAccount;
  }

  
   /**
   * The scope that the user belongs to.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope that the user belongs to.")
  public Long getScope() {
    return scope;
  }

  
   /**
   * The user&#39;s time zone. If none is specified, the one provided by the browser will be used.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The user's time zone. If none is specified, the one provided by the browser will be used.")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * Whether two-factor authentication is enabled for this user.
   * @return twoFactorEnabled
  **/
  @ApiModelProperty(value = "Whether two-factor authentication is enabled for this user.")
  public Boolean isTwoFactorEnabled() {
    return twoFactorEnabled;
  }

  
   /**
   * The type of two-factor authentication that is enabled for the user.
   * @return twoFactorType
  **/
  @ApiModelProperty(value = "The type of two-factor authentication that is enabled for the user.")
  public TwoFactorAuthenticationType getTwoFactorType() {
    return twoFactorType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanUser humanUser = (HumanUser) o;
    return Objects.equals(this.emailAddress, humanUser.emailAddress) &&
        Objects.equals(this.emailAddressVerified, humanUser.emailAddressVerified) &&
        Objects.equals(this.firstname, humanUser.firstname) &&
        Objects.equals(this.language, humanUser.language) &&
        Objects.equals(this.lastname, humanUser.lastname) &&
        Objects.equals(this.mobilePhoneNumber, humanUser.mobilePhoneNumber) &&
        Objects.equals(this.mobilePhoneVerified, humanUser.mobilePhoneVerified) &&
        Objects.equals(this.primaryAccount, humanUser.primaryAccount) &&
        Objects.equals(this.scope, humanUser.scope) &&
        Objects.equals(this.timeZone, humanUser.timeZone) &&
        Objects.equals(this.twoFactorEnabled, humanUser.twoFactorEnabled) &&
        Objects.equals(this.twoFactorType, humanUser.twoFactorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailAddressVerified, firstname, language, lastname, mobilePhoneNumber, mobilePhoneVerified, primaryAccount, scope, timeZone, twoFactorEnabled, twoFactorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanUser {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressVerified: ").append(toIndentedString(emailAddressVerified)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    mobilePhoneVerified: ").append(toIndentedString(mobilePhoneVerified)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    twoFactorType: ").append(toIndentedString(twoFactorType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

