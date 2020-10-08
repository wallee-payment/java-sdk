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

public class AccountCreate extends AbstractAccountUpdate {

    @JsonProperty("parentAccount")
    protected Long parentAccount;


    @JsonProperty("scope")
    protected Long scope;


    public AccountCreate parentAccount(Long parentAccount) {
        this.parentAccount = parentAccount;
        return this;
    }

    /**
     * The account which is responsible for administering the account.
     *
     * @return parentAccount
     **/
    @ApiModelProperty(value = "The account which is responsible for administering the account.")
    public Long getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(Long parentAccount) {
        this.parentAccount = parentAccount;
    }


    public AccountCreate scope(Long scope) {
        this.scope = scope;
        return this;
    }

    /**
     * This is the scope to which the account belongs to.
     *
     * @return scope
     **/
    @ApiModelProperty(required = true, value = "This is the scope to which the account belongs to.")
    public Long getScope() {
        return scope;
    }

    public void setScope(Long scope) {
        this.scope = scope;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountCreate accountCreate = (AccountCreate) o;
        return Objects.equals(this.lastModifiedDate, accountCreate.lastModifiedDate) &&
                Objects.equals(this.name, accountCreate.name) &&
                Objects.equals(this.subaccountLimit, accountCreate.subaccountLimit) &&
                Objects.equals(this.parentAccount, accountCreate.parentAccount) &&
                Objects.equals(this.scope, accountCreate.scope) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModifiedDate, name, subaccountLimit, parentAccount, scope, super.hashCode());
    }

    @Override
    public String toString() {
        return "class AccountCreate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    lastModifiedDate: " + toIndentedString(lastModifiedDate) + " \n" +
            "    name: " +  toIndentedString(name) + " \n" +
            "    subaccountLimit: " + toIndentedString(subaccountLimit) + " \n" +
            "    parentAccount: " + toIndentedString(parentAccount) + " \n" +
            "    scope: " + toIndentedString(scope) + " \n" +
            "}";
        }

}

