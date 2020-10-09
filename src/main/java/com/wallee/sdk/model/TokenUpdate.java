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

public class TokenUpdate extends AbstractTokenUpdate implements UpsertableEntity {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public TokenUpdate id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public TokenUpdate version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenUpdate tokenUpdate = (TokenUpdate) o;
        return Objects.equals(this.customerEmailAddress, tokenUpdate.customerEmailAddress) &&
                Objects.equals(this.customerId, tokenUpdate.customerId) &&
                Objects.equals(this.enabledForOneClickPayment, tokenUpdate.enabledForOneClickPayment) &&
                Objects.equals(this.language, tokenUpdate.language) &&
                Objects.equals(this.timeZone, tokenUpdate.timeZone) &&
                Objects.equals(this.tokenReference, tokenUpdate.tokenReference) &&
                Objects.equals(this.id, tokenUpdate.id) &&
                Objects.equals(this.version, tokenUpdate.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, timeZone, tokenReference, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TokenUpdate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    customerEmailAddress: " + toIndentedString(customerEmailAddress) + " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    enabledForOneClickPayment: " +  toIndentedString(enabledForOneClickPayment) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    tokenReference: " + toIndentedString(tokenReference) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

