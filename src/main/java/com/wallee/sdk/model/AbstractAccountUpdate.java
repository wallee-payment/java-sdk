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
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AbstractAccountUpdate
 */

public class AbstractAccountUpdate extends Indentable {

    @JsonProperty("lastModifiedDate")
    protected OffsetDateTime lastModifiedDate;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("subaccountLimit")
    protected Long subaccountLimit;


    public AbstractAccountUpdate lastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     *
     * @return lastModifiedDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    public AbstractAccountUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the account identifies the account within the administrative interface.
     * @return name
     **/
    @ApiModelProperty(value = "The name of the account identifies the account within the administrative interface.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AbstractAccountUpdate subaccountLimit(Long subaccountLimit) {
        this.subaccountLimit = subaccountLimit;
        return this;
    }

    /**
     * This property restricts the number of subaccounts which can be created within this account.
     * @return subaccountLimit
     **/
    @ApiModelProperty(value = "This property restricts the number of subaccounts which can be created within this account.")
    public Long getSubaccountLimit() {
        return subaccountLimit;
    }

    public void setSubaccountLimit(Long subaccountLimit) {
        this.subaccountLimit = subaccountLimit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractAccountUpdate abstractAccountUpdate = (AbstractAccountUpdate) o;
        return Objects.equals(this.lastModifiedDate, abstractAccountUpdate.lastModifiedDate) &&
                Objects.equals(this.name, abstractAccountUpdate.name) &&
                Objects.equals(this.subaccountLimit, abstractAccountUpdate.subaccountLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastModifiedDate, name, subaccountLimit);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractAccountUpdate {\n");

        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

