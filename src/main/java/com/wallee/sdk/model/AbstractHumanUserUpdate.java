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
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractHumanUserUpdate
 */

public class AbstractHumanUserUpdate {
  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("firstname")
  protected String firstname = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lastname")
  protected String lastname = null;

  
  @JsonProperty("mobilePhoneNumber")
  protected String mobilePhoneNumber = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("twoFactorEnabled")
  protected Boolean twoFactorEnabled = null;

  
  
  public AbstractHumanUserUpdate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The user's email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public AbstractHumanUserUpdate firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * The user&#39;s first name.
   * @return firstname
  **/
  @ApiModelProperty(value = "The user's first name.")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  
  public AbstractHumanUserUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The user&#39;s preferred language.
   * @return language
  **/
  @ApiModelProperty(value = "The user's preferred language.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractHumanUserUpdate lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * The user&#39;s last name.
   * @return lastname
  **/
  @ApiModelProperty(value = "The user's last name.")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  
  public AbstractHumanUserUpdate mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * The user&#39;s mobile phone number.
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "The user's mobile phone number.")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  
  public AbstractHumanUserUpdate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  
  public AbstractHumanUserUpdate timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The user&#39;s time zone. If none is specified, the one provided by the browser will be used.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The user's time zone. If none is specified, the one provided by the browser will be used.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  public AbstractHumanUserUpdate twoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
    return this;
  }

   /**
   * Whether two-factor authentication is enabled for this user.
   * @return twoFactorEnabled
  **/
  @ApiModelProperty(value = "Whether two-factor authentication is enabled for this user.")
  public Boolean isTwoFactorEnabled() {
    return twoFactorEnabled;
  }

  public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractHumanUserUpdate abstractHumanUserUpdate = (AbstractHumanUserUpdate) o;
    return Objects.equals(this.emailAddress, abstractHumanUserUpdate.emailAddress) &&
        Objects.equals(this.firstname, abstractHumanUserUpdate.firstname) &&
        Objects.equals(this.language, abstractHumanUserUpdate.language) &&
        Objects.equals(this.lastname, abstractHumanUserUpdate.lastname) &&
        Objects.equals(this.mobilePhoneNumber, abstractHumanUserUpdate.mobilePhoneNumber) &&
        Objects.equals(this.state, abstractHumanUserUpdate.state) &&
        Objects.equals(this.timeZone, abstractHumanUserUpdate.timeZone) &&
        Objects.equals(this.twoFactorEnabled, abstractHumanUserUpdate.twoFactorEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, firstname, language, lastname, mobilePhoneNumber, state, timeZone, twoFactorEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractHumanUserUpdate {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
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

