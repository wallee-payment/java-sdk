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

public class ApplicationUser extends User {

    @JsonProperty("name")
    protected String name;


    @JsonProperty("primaryAccount")
    protected Account primaryAccount;


    @JsonProperty("requestLimit")
    protected Long requestLimit;


    /**
     * The user name is used to identify the application user in administrative interfaces.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The user name is used to identify the application user in administrative interfaces.")
    public String getName() {
        return name;
    }


    /**
     * The account that this user is associated with. The account owner will be able to manage this user.
     *
     * @return primaryAccount
     **/
    @ApiModelProperty(value = "The account that this user is associated with. The account owner will be able to manage this user.")
    public Account getPrimaryAccount() {
        return primaryAccount;
    }


    /**
     * The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.
     *
     * @return requestLimit
     **/
    @ApiModelProperty(value = "The request limit defines the maximum number of API request accepted within 2 minutes. This limit can only be changed with special privileges.")
    public Long getRequestLimit() {
        return requestLimit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationUser applicationUser = (ApplicationUser) o;
        return Objects.equals(this.id, applicationUser.id) &&
                Objects.equals(this.plannedPurgeDate, applicationUser.plannedPurgeDate) &&
                Objects.equals(this.scope, applicationUser.scope) && this.state == applicationUser.state
                && this.userType == applicationUser.userType &&
                Objects.equals(this.version, applicationUser.version) &&
                Objects.equals(this.name, applicationUser.name) &&
                Objects.equals(this.primaryAccount, applicationUser.primaryAccount) &&
                Objects.equals(this.requestLimit, applicationUser.requestLimit) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plannedPurgeDate, scope, state, userType, version, name, primaryAccount, requestLimit, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ApplicationUser { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  " \n" +
            "    scope: " + toIndentedString(scope) + " \n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    userType: " + toIndentedString(userType) + " \n" +
            "    version: " + toIndentedString(version) +  " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    primaryAccount: " + toIndentedString(primaryAccount) + " \n" +
            "    requestLimit: " + toIndentedString(requestLimit) + " \n" +
            "}";
        }

}

