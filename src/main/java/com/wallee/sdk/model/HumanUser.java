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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class HumanUser extends Indentable {

    @JsonProperty("emailAddress")
    protected String emailAddress;


    @JsonProperty("emailAddressVerified")
    protected Boolean emailAddressVerified;


    @JsonProperty("firstname")
    protected String firstname;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lastname")
    protected String lastname;


    @JsonProperty("mobilePhoneNumber")
    protected String mobilePhoneNumber;


    @JsonProperty("mobilePhoneVerified")
    protected Boolean mobilePhoneVerified;


    @JsonProperty("primaryAccount")
    protected Account primaryAccount;


    @JsonProperty("scope")
    protected Scope scope;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("twoFactorEnabled")
    protected Boolean twoFactorEnabled;


    @JsonProperty("twoFactorType")
    protected TwoFactorAuthenticationType twoFactorType;


    /**
     * The email address of the user.
     *
     * @return emailAddress
     **/
    @ApiModelProperty(value = "The email address of the user.")
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Defines whether a user is verified or not.
     *
     * @return emailAddressVerified
     **/
    @ApiModelProperty(value = "Defines whether a user is verified or not.")
    public Boolean isEmailAddressVerified() {
        return emailAddressVerified;
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


    /**
     * The preferred language of the user.
     *
     * @return language
     **/
    @ApiModelProperty(value = "The preferred language of the user.")
    public String getLanguage() {
        return language;
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


    /**
     * @return mobilePhoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }


    /**
     * Defines whether a users mobile phone number is verified or not.
     *
     * @return mobilePhoneVerified
     **/
    @ApiModelProperty(value = "Defines whether a users mobile phone number is verified or not.")
    public Boolean isMobilePhoneVerified() {
        return mobilePhoneVerified;
    }


    /**
     * The primary account links the user to a specific account.
     *
     * @return primaryAccount
     **/
    @ApiModelProperty(value = "The primary account links the user to a specific account.")
    public Account getPrimaryAccount() {
        return primaryAccount;
    }


    /**
     * The scope to which the user belongs to.
     *
     * @return scope
     **/
    @ApiModelProperty(value = "The scope to which the user belongs to.")
    public Scope getScope() {
        return scope;
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


    /**
     * Defines whether two-factor authentication is enabled for this user.
     *
     * @return twoFactorEnabled
     **/
    @ApiModelProperty(value = "Defines whether two-factor authentication is enabled for this user.")
    public Boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }


    /**
     * @return twoFactorType
     **/
    @ApiModelProperty(value = "")
    public TwoFactorAuthenticationType getTwoFactorType() {
        return twoFactorType;
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


}

