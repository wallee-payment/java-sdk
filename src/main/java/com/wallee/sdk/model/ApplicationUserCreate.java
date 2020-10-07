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

public class ApplicationUserCreate extends AbstractApplicationUserUpdate {

    @JsonProperty("primaryAccount")
    protected Long primaryAccount;


    public ApplicationUserCreate primaryAccount(Long primaryAccount) {
        this.primaryAccount = primaryAccount;
        return this;
    }

    /**
     * The account that this user is associated with. The account owner will be able to manage this user.
     *
     * @return primaryAccount
     **/
    @ApiModelProperty(required = true, value = "The account that this user is associated with. The account owner will be able to manage this user.")
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
        ApplicationUserCreate applicationUserCreate = (ApplicationUserCreate) o;
        return Objects.equals(this.name, applicationUserCreate.name) &&
                Objects.equals(this.requestLimit, applicationUserCreate.requestLimit) && this.state
                == applicationUserCreate.state &&
                Objects.equals(this.primaryAccount, applicationUserCreate.primaryAccount) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, requestLimit, state, primaryAccount, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationUserCreate {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

