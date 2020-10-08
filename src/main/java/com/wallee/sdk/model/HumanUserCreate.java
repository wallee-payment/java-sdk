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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class HumanUserCreate extends AbstractHumanUserUpdate {

    @JsonProperty("primaryAccount")
    protected Long primaryAccount;


    public HumanUserCreate primaryAccount(Long primaryAccount) {
        this.primaryAccount = primaryAccount;
        return this;
    }

    /**
     * The primary account links the user to a specific account.
     *
     * @return primaryAccount
     **/
    @ApiModelProperty(value = "The primary account links the user to a specific account.")
    public Long getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(Long primaryAccount) {
        this.primaryAccount = primaryAccount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HumanUserCreate humanUserCreate = (HumanUserCreate) o;
        return Objects.equals(this.emailAddress, humanUserCreate.emailAddress) &&
                Objects.equals(this.firstname, humanUserCreate.firstname) &&
                Objects.equals(this.language, humanUserCreate.language) &&
                Objects.equals(this.lastname, humanUserCreate.lastname) &&
                Objects.equals(this.mobilePhoneNumber, humanUserCreate.mobilePhoneNumber) && this.state
                == humanUserCreate.state &&
                Objects.equals(this.timeZone, humanUserCreate.timeZone) &&
                Objects.equals(this.twoFactorEnabled, humanUserCreate.twoFactorEnabled) &&
                Objects.equals(this.primaryAccount, humanUserCreate.primaryAccount) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress, firstname, language, lastname, mobilePhoneNumber, state, timeZone, twoFactorEnabled, primaryAccount, super.hashCode());
    }


    @Override
    public String toString() {
        return "class HumanUserCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    firstname: " +  toIndentedString(firstname) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    lastname: " + toIndentedString(lastname) + "\n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) +  " \n" +
            "    twoFactorEnabled: " + toIndentedString(twoFactorEnabled) + " \n" +
            "    primaryAccount: " + toIndentedString(primaryAccount) + "\n" +
            "}";
        }


}

