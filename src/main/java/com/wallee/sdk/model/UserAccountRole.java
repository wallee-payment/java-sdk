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

public class UserAccountRole extends Indentable {

    @JsonProperty("account")
    protected Long account;


    @JsonProperty("appliesOnSubAccount")
    protected Boolean appliesOnSubAccount;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("role")
    protected Long role;


    @JsonProperty("user")
    protected Long user;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return account
     **/
    @ApiModelProperty(value = "")
    public Long getAccount() {
        return account;
    }


    /**
     * @return appliesOnSubAccount
     **/
    @ApiModelProperty(value = "")
    public Boolean isAppliesOnSubAccount() {
        return appliesOnSubAccount;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return role
     **/
    @ApiModelProperty(value = "")
    public Long getRole() {
        return role;
    }


    /**
     * @return user
     **/
    @ApiModelProperty(value = "")
    public Long getUser() {
        return user;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAccountRole userAccountRole = (UserAccountRole) o;
        return Objects.equals(this.account, userAccountRole.account) &&
                Objects.equals(this.appliesOnSubAccount, userAccountRole.appliesOnSubAccount) &&
                Objects.equals(this.id, userAccountRole.id) &&
                Objects.equals(this.role, userAccountRole.role) &&
                Objects.equals(this.user, userAccountRole.user) &&
                Objects.equals(this.version, userAccountRole.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, appliesOnSubAccount, id, role, user, version);
    }


    @Override
    public String toString() {

        return "class UserAccountRole { \n" +
            "    account: " + toIndentedString(account) +  "\n" +
            "    appliesOnSubAccount: " + toIndentedString(appliesOnSubAccount) + " \n" +
            "    id: " +  toIndentedString(id) + " \n" +
            "    role: " + toIndentedString(role) + " \n" +
            "    user: " + toIndentedString(user) +  "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

