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
import com.wallee.sdk.model.enums.CreationEntityState;

@ApiModel(description = "")

public class TokenCreate extends AbstractTokenUpdate implements CreateableEntity {

    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("state")
    protected CreationEntityState state;


    public TokenCreate externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    public TokenCreate state(CreationEntityState state) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenCreate tokenCreate = (TokenCreate) o;
        return Objects.equals(this.customerEmailAddress, tokenCreate.customerEmailAddress) &&
                Objects.equals(this.customerId, tokenCreate.customerId) &&
                Objects.equals(this.enabledForOneClickPayment, tokenCreate.enabledForOneClickPayment) &&
                Objects.equals(this.language, tokenCreate.language) &&
                Objects.equals(this.timeZone, tokenCreate.timeZone) &&
                Objects.equals(this.tokenReference, tokenCreate.tokenReference) &&
                Objects.equals(this.externalId, tokenCreate.externalId) && this.state == tokenCreate.state &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, timeZone, tokenReference, externalId, state, super.hashCode());
    }


    @Override
    public String toString() {
      return "class TokenCreate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    customerEmailAddress: " + toIndentedString(customerEmailAddress) + " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    enabledForOneClickPayment: " +  toIndentedString(enabledForOneClickPayment) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    tokenReference: " + toIndentedString(tokenReference) +  "\n" +
            "    externalId: " + toIndentedString(externalId) + " \n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "}";
      }


}

