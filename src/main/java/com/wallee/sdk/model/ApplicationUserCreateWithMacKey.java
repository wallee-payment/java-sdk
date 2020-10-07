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

public class ApplicationUserCreateWithMacKey extends ApplicationUser {

    @JsonProperty("macKey")
    protected String macKey;


    /**
     * @return macKey
     **/
    @ApiModelProperty(value = "")
    public String getMacKey() {
        return macKey;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationUserCreateWithMacKey applicationUserCreateWithMacKey = (ApplicationUserCreateWithMacKey) o;
        return Objects.equals(this.id, applicationUserCreateWithMacKey.id) &&
                Objects.equals(this.plannedPurgeDate, applicationUserCreateWithMacKey.plannedPurgeDate) &&
                Objects.equals(this.scope, applicationUserCreateWithMacKey.scope) && this.state
                == applicationUserCreateWithMacKey.state && this.userType == applicationUserCreateWithMacKey.userType &&
                Objects.equals(this.version, applicationUserCreateWithMacKey.version) &&
                Objects.equals(this.name, applicationUserCreateWithMacKey.name) &&
                Objects.equals(this.primaryAccount, applicationUserCreateWithMacKey.primaryAccount) &&
                Objects.equals(this.requestLimit, applicationUserCreateWithMacKey.requestLimit) &&
                Objects.equals(this.macKey, applicationUserCreateWithMacKey.macKey) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plannedPurgeDate, scope, state, userType, version, name, primaryAccount, requestLimit, macKey, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ApplicationUserCreateWithMacKey { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    scope: " + toIndentedString(scope) + " \n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "    userType: " + toIndentedString(userType) + " \n" +
            "    version: " + toIndentedString(version) +  "\n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    primaryAccount: " + toIndentedString(primaryAccount) + " \n" +
            "    requestLimit: " + toIndentedString(requestLimit) + " \n" +
            "    macKey: " +  toIndentedString(macKey) + " \n" +
            "}";
        }


}

