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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ShopifySubscriberState;

@ApiModel(description = "")

public class ShopifySubscriber extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("emailAddress")
    protected String emailAddress;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("phoneNumber")
    protected String phoneNumber;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("shop")
    protected Long shop;


    @JsonProperty("state")
    protected ShopifySubscriberState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return emailAddress
     **/
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
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
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * @return phoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return shop
     **/
    @ApiModelProperty(value = "")
    public Long getShop() {
        return shop;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriberState getState() {
        return state;
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
        ShopifySubscriber shopifySubscriber = (ShopifySubscriber) o;
        return Objects.equals(this.createdOn, shopifySubscriber.createdOn) &&
                Objects.equals(this.emailAddress, shopifySubscriber.emailAddress) &&
                Objects.equals(this.externalId, shopifySubscriber.externalId) &&
                Objects.equals(this.id, shopifySubscriber.id) &&
                Objects.equals(this.linkedSpaceId, shopifySubscriber.linkedSpaceId) &&
                Objects.equals(this.phoneNumber, shopifySubscriber.phoneNumber) &&
                Objects.equals(this.plannedPurgeDate, shopifySubscriber.plannedPurgeDate) &&
                Objects.equals(this.shop, shopifySubscriber.shop) && this.state == shopifySubscriber.state &&
                Objects.equals(this.version, shopifySubscriber.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, emailAddress, externalId, id, linkedSpaceId, phoneNumber, plannedPurgeDate, shop, state, version);
    }


    @Override
    public String toString() {

        return "class ShopifySubscriber { \n" +
            "    createdOn: " + toIndentedString(createdOn) +  " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    externalId: " +  toIndentedString(externalId) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " +  toIndentedString(linkedSpaceId) + "\n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    shop: " + toIndentedString(shop) + "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

