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

public class SpaceCreate extends AbstractSpaceUpdate {

    @JsonProperty("account")
    protected Long account;


    public SpaceCreate account(Long account) {
        this.account = account;
        return this;
    }

    /**
     * The account to which the space belongs to.
     *
     * @return account
     **/
    @ApiModelProperty(required = true, value = "The account to which the space belongs to.")
    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpaceCreate spaceCreate = (SpaceCreate) o;
        return Objects.equals(this.lastModifiedDate, spaceCreate.lastModifiedDate) &&
                Objects.equals(this.name, spaceCreate.name) &&
                Objects.equals(this.postalAddress, spaceCreate.postalAddress) &&
                Objects.equals(this.primaryCurrency, spaceCreate.primaryCurrency) &&
                Objects.equals(this.requestLimit, spaceCreate.requestLimit) && this.state == spaceCreate.state &&
                Objects.equals(this.technicalContactAddresses, spaceCreate.technicalContactAddresses) &&
                Objects.equals(this.timeZone, spaceCreate.timeZone) &&
                Objects.equals(this.account, spaceCreate.account) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModifiedDate, name, postalAddress, primaryCurrency, requestLimit, state, technicalContactAddresses, timeZone, account, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SpaceCreate {\n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    lastModifiedDate: " + toIndentedString(lastModifiedDate) + "\n" +
            "    name: " +  toIndentedString(name) + "\n" +
            "    postalAddress: " + toIndentedString(postalAddress) + "\n" +
            "    primaryCurrency: " + toIndentedString(primaryCurrency) + "\n" +
            "    requestLimit: " + toIndentedString(requestLimit) +  "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    technicalContactAddresses: " +  toIndentedString(technicalContactAddresses) + "\n" +
            "    timeZone: " + toIndentedString(timeZone) + "\n" +
            "    account: " + toIndentedString(account) + "\n" +
            "}";
        }


}

