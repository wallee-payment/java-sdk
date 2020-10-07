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
import com.wallee.sdk.model.enums.SubscriptionProductState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")

public class SubscriptionProduct extends Indentable {

    @JsonProperty("allowedPaymentMethodConfigurations")
    protected List<Long> allowedPaymentMethodConfigurations;


    @JsonProperty("failedPaymentSuspensionPeriod")
    protected String failedPaymentSuspensionPeriod;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("reference")
    protected String reference;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    @JsonProperty("spaceId")
    protected Long spaceId;


    @JsonProperty("state")
    protected SubscriptionProductState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.
     *
     * @return allowedPaymentMethodConfigurations
     **/
    @ApiModelProperty(value = "The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.")
    public List<Long> getAllowedPaymentMethodConfigurations() {
        return allowedPaymentMethodConfigurations;
    }


    /**
     * When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.
     *
     * @return failedPaymentSuspensionPeriod
     **/
    @ApiModelProperty(value = "When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.")
    public String getFailedPaymentSuspensionPeriod() {
        return failedPaymentSuspensionPeriod;
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
     * The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
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
     * The product reference identifies the product for external systems. This field may contain the product&#39;s SKU.
     *
     * @return reference
     **/
    @ApiModelProperty(value = "The product reference identifies the product for external systems. This field may contain the product's SKU.")
    public String getReference() {
        return reference;
    }


    /**
     * The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.
     *
     * @return sortOrder
     **/
    @ApiModelProperty(value = "The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.")
    public Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * @return spaceId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceId() {
        return spaceId;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductState getState() {
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
        SubscriptionProduct subscriptionProduct = (SubscriptionProduct) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProduct.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProduct.failedPaymentSuspensionPeriod) &&
                Objects.equals(this.id, subscriptionProduct.id) &&
                Objects.equals(this.linkedSpaceId, subscriptionProduct.linkedSpaceId) &&
                Objects.equals(this.name, subscriptionProduct.name) &&
                Objects.equals(this.plannedPurgeDate, subscriptionProduct.plannedPurgeDate) &&
                Objects.equals(this.reference, subscriptionProduct.reference) &&
                Objects.equals(this.sortOrder, subscriptionProduct.sortOrder) &&
                Objects.equals(this.spaceId, subscriptionProduct.spaceId) && this.state == subscriptionProduct.state &&
                Objects.equals(this.version, subscriptionProduct.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, id, linkedSpaceId, name, plannedPurgeDate, reference, sortOrder, spaceId, state, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionProduct { \n" +
            "    allowedPaymentMethodConfigurations: " +  toIndentedString(allowedPaymentMethodConfigurations) + "\n" +
            "    failedPaymentSuspensionPeriod: " +  toIndentedString(failedPaymentSuspensionPeriod) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    reference: " + toIndentedString(reference) + " \n" +
            "    sortOrder: " + toIndentedString(sortOrder) +  " \n" +
            "    spaceId: " + toIndentedString(spaceId) + " \n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

