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

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;


@ApiModel(description = "")

public class Customer extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("customerId")
    protected String customerId;


    @JsonProperty("emailAddress")
    protected String emailAddress;


    @JsonProperty("familyName")
    protected String familyName;


    @JsonProperty("givenName")
    protected String givenName;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("metaData")
    protected Map<String, String> metaData;


    @JsonProperty("preferredCurrency")
    protected String preferredCurrency;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return customerId
     **/
    @ApiModelProperty(value = "")
    public String getCustomerId() {
        return customerId;
    }


    /**
     * @return emailAddress
     **/
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * @return familyName
     **/
    @ApiModelProperty(value = "")
    public String getFamilyName() {
        return familyName;
    }


    /**
     * @return givenName
     **/
    @ApiModelProperty(value = "")
    public String getGivenName() {
        return givenName;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * Meta data allow to store additional data along the object.
     *
     * @return metaData
     **/
    @ApiModelProperty(value = "Meta data allow to store additional data along the object.")
    public Map<String, String> getMetaData() {
        return metaData;
    }


    /**
     * @return preferredCurrency
     **/
    @ApiModelProperty(value = "")
    public String getPreferredCurrency() {
        return preferredCurrency;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(this.createdOn, customer.createdOn) &&
                Objects.equals(this.customerId, customer.customerId) &&
                Objects.equals(this.emailAddress, customer.emailAddress) &&
                Objects.equals(this.familyName, customer.familyName) &&
                Objects.equals(this.givenName, customer.givenName) &&
                Objects.equals(this.id, customer.id) &&
                Objects.equals(this.language, customer.language) &&
                Objects.equals(this.linkedSpaceId, customer.linkedSpaceId) &&
                Objects.equals(this.metaData, customer.metaData) &&
                Objects.equals(this.preferredCurrency, customer.preferredCurrency) &&
                Objects.equals(this.version, customer.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, customerId, emailAddress, familyName, givenName, id, language, linkedSpaceId, metaData, preferredCurrency, version);
    }


    @Override
    public String toString() {

        return "class Customer { \n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) +  " \n" +
            "    familyName: " + toIndentedString(familyName) + " \n" +
            "    givenName: " + toIndentedString(givenName) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    language: " + toIndentedString(language) +  " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    metaData: " +  toIndentedString(metaData) + "\n" +
            "    preferredCurrency: " + toIndentedString(preferredCurrency) + "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

