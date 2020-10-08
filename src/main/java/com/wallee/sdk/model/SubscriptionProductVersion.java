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
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionProductVersionState;

@ApiModel(description = "")

public class SubscriptionProductVersion extends Indentable {

    @JsonProperty("activatedOn")
    protected OffsetDateTime activatedOn;


    @JsonProperty("billingCycle")
    protected String billingCycle;


    @JsonProperty("comment")
    protected String comment;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("defaultCurrency")
    protected String defaultCurrency;


    @JsonProperty("enabledCurrencies")
    protected List<String> enabledCurrencies;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("incrementNumber")
    protected Integer incrementNumber;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("minimalNumberOfPeriods")
    protected Integer minimalNumberOfPeriods;


    @JsonProperty("name")
    protected DatabaseTranslatedString name;


    @JsonProperty("numberOfNoticePeriods")
    protected Integer numberOfNoticePeriods;


    @JsonProperty("obsoletedOn")
    protected OffsetDateTime obsoletedOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("product")
    protected SubscriptionProduct product;


    @JsonProperty("reference")
    protected String reference;


    @JsonProperty("retiringFinishedOn")
    protected OffsetDateTime retiringFinishedOn;


    @JsonProperty("retiringStartedOn")
    protected OffsetDateTime retiringStartedOn;


    @JsonProperty("state")
    protected SubscriptionProductVersionState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return activatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getActivatedOn() {
        return activatedOn;
    }


    /**
     * The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.
     *
     * @return billingCycle
     **/
    @ApiModelProperty(value = "The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.")
    public String getBillingCycle() {
        return billingCycle;
    }


    /**
     * The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.
     *
     * @return comment
     **/
    @ApiModelProperty(value = "The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.")
    public String getComment() {
        return comment;
    }


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * The default currency has to be used in all fees.
     *
     * @return defaultCurrency
     **/
    @ApiModelProperty(value = "The default currency has to be used in all fees.")
    public String getDefaultCurrency() {
        return defaultCurrency;
    }


    /**
     * The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.
     *
     * @return enabledCurrencies
     **/
    @ApiModelProperty(value = "The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.")
    public List<String> getEnabledCurrencies() {
        return enabledCurrencies;
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
     * The increment number represents the version number incremented whenever a new version is activated.
     *
     * @return incrementNumber
     **/
    @ApiModelProperty(value = "The increment number represents the version number incremented whenever a new version is activated.")
    public Integer getIncrementNumber() {
        return incrementNumber;
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
     * The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.
     *
     * @return minimalNumberOfPeriods
     **/
    @ApiModelProperty(value = "The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.")
    public Integer getMinimalNumberOfPeriods() {
        return minimalNumberOfPeriods;
    }


    /**
     * The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.")
    public DatabaseTranslatedString getName() {
        return name;
    }


    /**
     * The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.
     *
     * @return numberOfNoticePeriods
     **/
    @ApiModelProperty(value = "The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.")
    public Integer getNumberOfNoticePeriods() {
        return numberOfNoticePeriods;
    }


    /**
     * @return obsoletedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getObsoletedOn() {
        return obsoletedOn;
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
     * Each product version is linked to a product.
     *
     * @return product
     **/
    @ApiModelProperty(value = "Each product version is linked to a product.")
    public SubscriptionProduct getProduct() {
        return product;
    }


    /**
     * The product version reference helps to identify the version. The reference is generated out of the product reference.
     *
     * @return reference
     **/
    @ApiModelProperty(value = "The product version reference helps to identify the version. The reference is generated out of the product reference.")
    public String getReference() {
        return reference;
    }


    /**
     * @return retiringFinishedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getRetiringFinishedOn() {
        return retiringFinishedOn;
    }


    /**
     * @return retiringStartedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getRetiringStartedOn() {
        return retiringStartedOn;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductVersionState getState() {
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
        SubscriptionProductVersion subscriptionProductVersion = (SubscriptionProductVersion) o;
        return Objects.equals(this.activatedOn, subscriptionProductVersion.activatedOn) &&
                Objects.equals(this.billingCycle, subscriptionProductVersion.billingCycle) &&
                Objects.equals(this.comment, subscriptionProductVersion.comment) &&
                Objects.equals(this.createdOn, subscriptionProductVersion.createdOn) &&
                Objects.equals(this.defaultCurrency, subscriptionProductVersion.defaultCurrency) &&
                Objects.equals(this.enabledCurrencies, subscriptionProductVersion.enabledCurrencies) &&
                Objects.equals(this.id, subscriptionProductVersion.id) &&
                Objects.equals(this.incrementNumber, subscriptionProductVersion.incrementNumber) &&
                Objects.equals(this.linkedSpaceId, subscriptionProductVersion.linkedSpaceId) &&
                Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersion.minimalNumberOfPeriods) &&
                Objects.equals(this.name, subscriptionProductVersion.name) &&
                Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersion.numberOfNoticePeriods) &&
                Objects.equals(this.obsoletedOn, subscriptionProductVersion.obsoletedOn) &&
                Objects.equals(this.plannedPurgeDate, subscriptionProductVersion.plannedPurgeDate) &&
                Objects.equals(this.product, subscriptionProductVersion.product) &&
                Objects.equals(this.reference, subscriptionProductVersion.reference) &&
                Objects.equals(this.retiringFinishedOn, subscriptionProductVersion.retiringFinishedOn) &&
                Objects.equals(this.retiringStartedOn, subscriptionProductVersion.retiringStartedOn) && this.state
                == subscriptionProductVersion.state &&
                Objects.equals(this.version, subscriptionProductVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activatedOn, billingCycle, comment, createdOn, defaultCurrency, enabledCurrencies, id, incrementNumber, linkedSpaceId, minimalNumberOfPeriods, name, numberOfNoticePeriods, obsoletedOn, plannedPurgeDate, product, reference, retiringFinishedOn, retiringStartedOn, state, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionProductVersion { \n" +
            "    activatedOn: " + toIndentedString(activatedOn) +  "\n" +
            "    billingCycle: " + toIndentedString(billingCycle) + " \n" +
            "    comment: " + toIndentedString(comment) + "\n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    defaultCurrency: " +  toIndentedString(defaultCurrency) + " \n" +
            "    enabledCurrencies: " + toIndentedString(enabledCurrencies) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    incrementNumber: " + toIndentedString(incrementNumber) +  "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    minimalNumberOfPeriods: " + toIndentedString(minimalNumberOfPeriods) + " \n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    numberOfNoticePeriods: " + toIndentedString(numberOfNoticePeriods) + " \n" +
            "    obsoletedOn: " + toIndentedString(obsoletedOn) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  "\n" +
            "    product: " + toIndentedString(product) + " \n" +
            "    reference: " + toIndentedString(reference) +  "\n" +
            "    retiringFinishedOn: " + toIndentedString(retiringFinishedOn) + " \n" +
            "    retiringStartedOn: " + toIndentedString(retiringStartedOn) + " \n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

