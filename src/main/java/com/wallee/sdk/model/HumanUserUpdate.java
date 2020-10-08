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

public class HumanUserUpdate extends AbstractHumanUserUpdate {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public HumanUserUpdate id(Long id) {
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


    public HumanUserUpdate version(Long version) {
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
        HumanUserUpdate humanUserUpdate = (HumanUserUpdate) o;
        return Objects.equals(this.emailAddress, humanUserUpdate.emailAddress) &&
                Objects.equals(this.firstname, humanUserUpdate.firstname) &&
                Objects.equals(this.language, humanUserUpdate.language) &&
                Objects.equals(this.lastname, humanUserUpdate.lastname) &&
                Objects.equals(this.mobilePhoneNumber, humanUserUpdate.mobilePhoneNumber) && this.state
                == humanUserUpdate.state &&
                Objects.equals(this.timeZone, humanUserUpdate.timeZone) &&
                Objects.equals(this.twoFactorEnabled, humanUserUpdate.twoFactorEnabled) &&
                Objects.equals(this.id, humanUserUpdate.id) &&
                Objects.equals(this.version, humanUserUpdate.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress, firstname, language, lastname, mobilePhoneNumber, state, timeZone, twoFactorEnabled, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class HumanUserUpdate {\n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    emailAddress: " + toIndentedString(emailAddress) + "\n" +
            "    firstname: " +  toIndentedString(firstname) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    lastname: " + toIndentedString(lastname) + "\n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) +  "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    timeZone: " + toIndentedString(timeZone) +  "\n" +
            "    twoFactorEnabled: " + toIndentedString(twoFactorEnabled) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

