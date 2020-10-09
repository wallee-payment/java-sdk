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

public class AccountUpdate extends AbstractAccountUpdate implements UpsertableEntity {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public AccountUpdate id(Long id) {
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


    public AccountUpdate version(Long version) {
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
        AccountUpdate accountUpdate = (AccountUpdate) o;
        return Objects.equals(this.lastModifiedDate, accountUpdate.lastModifiedDate) &&
                Objects.equals(this.name, accountUpdate.name) &&
                Objects.equals(this.subaccountLimit, accountUpdate.subaccountLimit) &&
                Objects.equals(this.id, accountUpdate.id) &&
                Objects.equals(this.version, accountUpdate.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModifiedDate, name, subaccountLimit, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class AccountUpdate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    lastModifiedDate: " + toIndentedString(lastModifiedDate) + " \n" +
            "    name: " +  toIndentedString(name) + "\n" +
            "    subaccountLimit: " + toIndentedString(subaccountLimit) + "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }

}

