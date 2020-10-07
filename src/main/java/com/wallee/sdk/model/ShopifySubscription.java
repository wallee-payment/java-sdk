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
import com.wallee.sdk.model.enums.ShopifySubscriptionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class ShopifySubscription extends Indentable {

    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("initialPaymentTransaction")
    protected Long initialPaymentTransaction;


    @JsonProperty("initialShopifyTransaction")
    protected Long initialShopifyTransaction;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("orderRecurrenceNumber")
    protected Integer orderRecurrenceNumber;


    @JsonProperty("shop")
    protected Long shop;


    @JsonProperty("state")
    protected ShopifySubscriptionState state;


    @JsonProperty("subscriber")
    protected ShopifySubscriber subscriber;


    @JsonProperty("terminatedBy")
    protected Long terminatedBy;


    @JsonProperty("terminatedOn")
    protected OffsetDateTime terminatedOn;


    @JsonProperty("terminationRequestDate")
    protected OffsetDateTime terminationRequestDate;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
        return createdBy;
    }


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
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
     * @return initialPaymentTransaction
     **/
    @ApiModelProperty(value = "")
    public Long getInitialPaymentTransaction() {
        return initialPaymentTransaction;
    }


    /**
     * @return initialShopifyTransaction
     **/
    @ApiModelProperty(value = "")
    public Long getInitialShopifyTransaction() {
        return initialShopifyTransaction;
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
     * @return orderRecurrenceNumber
     **/
    @ApiModelProperty(value = "")
    public Integer getOrderRecurrenceNumber() {
        return orderRecurrenceNumber;
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
    public ShopifySubscriptionState getState() {
        return state;
    }


    /**
     * @return subscriber
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriber getSubscriber() {
        return subscriber;
    }


    /**
     * @return terminatedBy
     **/
    @ApiModelProperty(value = "")
    public Long getTerminatedBy() {
        return terminatedBy;
    }


    /**
     * @return terminatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminatedOn() {
        return terminatedOn;
    }


    /**
     * @return terminationRequestDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminationRequestDate() {
        return terminationRequestDate;
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
        ShopifySubscription shopifySubscription = (ShopifySubscription) o;
        return Objects.equals(this.createdBy, shopifySubscription.createdBy) &&
                Objects.equals(this.createdOn, shopifySubscription.createdOn) &&
                Objects.equals(this.externalId, shopifySubscription.externalId) &&
                Objects.equals(this.id, shopifySubscription.id) &&
                Objects.equals(this.initialPaymentTransaction, shopifySubscription.initialPaymentTransaction) &&
                Objects.equals(this.initialShopifyTransaction, shopifySubscription.initialShopifyTransaction) &&
                Objects.equals(this.language, shopifySubscription.language) &&
                Objects.equals(this.linkedSpaceId, shopifySubscription.linkedSpaceId) &&
                Objects.equals(this.orderRecurrenceNumber, shopifySubscription.orderRecurrenceNumber) &&
                Objects.equals(this.shop, shopifySubscription.shop) && this.state == shopifySubscription.state &&
                Objects.equals(this.subscriber, shopifySubscription.subscriber) &&
                Objects.equals(this.terminatedBy, shopifySubscription.terminatedBy) &&
                Objects.equals(this.terminatedOn, shopifySubscription.terminatedOn) &&
                Objects.equals(this.terminationRequestDate, shopifySubscription.terminationRequestDate) &&
                Objects.equals(this.version, shopifySubscription.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdBy, createdOn, externalId, id, initialPaymentTransaction, initialShopifyTransaction, language, linkedSpaceId, orderRecurrenceNumber, shop, state, subscriber, terminatedBy, terminatedOn, terminationRequestDate, version);
    }


    @Override
    public String toString() {

        return "class ShopifySubscription {\n" +
            "    createdBy: " + toIndentedString(createdBy) +  "\n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    externalId: " + toIndentedString(externalId) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    initialPaymentTransaction: " +  toIndentedString(initialPaymentTransaction) + "\n" +
            "    initialShopifyTransaction: " +  toIndentedString(initialShopifyTransaction) + "\n" +
            "    language: " + toIndentedString(language) +  "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    orderRecurrenceNumber: " + toIndentedString(orderRecurrenceNumber) + "\n" +
            "    shop: " + toIndentedString(shop) +  "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    subscriber: " + toIndentedString(subscriber) +  "\n" +
            "    terminatedBy: " + toIndentedString(terminatedBy) + "\n" +
            "    terminatedOn: " +  toIndentedString(terminatedOn) + "\n" +
            "    terminationRequestDate: " + toIndentedString(terminationRequestDate) +  "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

