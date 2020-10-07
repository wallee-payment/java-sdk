/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AbstractHumanUserUpdate
 */

public class AbstractHumanUserUpdate extends Indentable {

    @JsonProperty("emailAddress")
    protected String emailAddress;


    @JsonProperty("firstname")
    protected String firstname;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lastname")
    protected String lastname;


    @JsonProperty("mobilePhoneNumber")
    protected String mobilePhoneNumber;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("twoFactorEnabled")
    protected Boolean twoFactorEnabled;


    public AbstractHumanUserUpdate emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * The email address of the user.
     *
     * @return emailAddress
     **/
    @ApiModelProperty(value = "The email address of the user.")
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
     * The first name of the user.
     *
     * @return firstname
     **/
    @ApiModelProperty(value = "The first name of the user.")
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
     * The preferred language of the user.
     *
     * @return language
     **/
    @ApiModelProperty(value = "The preferred language of the user.")
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
     * The last name of the user.
     *
     * @return lastname
     **/
    @ApiModelProperty(value = "The last name of the user.")
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
     * @return mobilePhoneNumber
     **/
    @ApiModelProperty(value = "")
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
     * @return state
     **/
    @ApiModelProperty(value = "")
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
     * The time zone which is applied for the user. If no timezone is specified the browser is used to determine an appropriate time zone.
     *
     * @return timeZone
     **/
    @ApiModelProperty(value = "The time zone which is applied for the user. If no timezone is specified the browser is used to determine an appropriate time zone.")
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
     * Defines whether two-factor authentication is enabled for this user.
     *
     * @return twoFactorEnabled
     **/
    @ApiModelProperty(value = "Defines whether two-factor authentication is enabled for this user.")
    public Boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
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
        return Objects.equals(this.emailAddress, abstractHumanUserUpdate.emailAddress) &&
                Objects.equals(this.firstname, abstractHumanUserUpdate.firstname) &&
                Objects.equals(this.language, abstractHumanUserUpdate.language) &&
                Objects.equals(this.lastname, abstractHumanUserUpdate.lastname) &&
                Objects.equals(this.mobilePhoneNumber, abstractHumanUserUpdate.mobilePhoneNumber) && this.state
                == abstractHumanUserUpdate.state &&
                Objects.equals(this.timeZone, abstractHumanUserUpdate.timeZone) &&
                Objects.equals(this.twoFactorEnabled, abstractHumanUserUpdate.twoFactorEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress, firstname, language, lastname, mobilePhoneNumber, state, timeZone, twoFactorEnabled);
    }


    @Override
    public String toString() {

        return "class AbstractHumanUserUpdate { \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    firstname: " + toIndentedString(firstname) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    lastname: " + toIndentedString(lastname) + " \n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    twoFactorEnabled: " + toIndentedString(twoFactorEnabled) + " \n" +
            "}";
    }

}

