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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionProductVersionState;

@ApiModel(description = "")

public class SubscriptionProductVersionPending extends Indentable implements UpsertableEntity {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("billingCycle")
    protected String billingCycle;


    @JsonProperty("comment")
    protected String comment;


    @JsonProperty("defaultCurrency")
    protected String defaultCurrency;


    @JsonProperty("enabledCurrencies")
    protected List<String> enabledCurrencies;


    @JsonProperty("minimalNumberOfPeriods")
    protected Integer minimalNumberOfPeriods;


    @JsonProperty("name")
    protected DatabaseTranslatedStringCreate name;


    @JsonProperty("numberOfNoticePeriods")
    protected Integer numberOfNoticePeriods;


    @JsonProperty("product")
    protected Long product;


    @JsonProperty("state")
    protected SubscriptionProductVersionState state;


    public SubscriptionProductVersionPending id(Long id) {
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


    public SubscriptionProductVersionPending version(Long version) {
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


    public SubscriptionProductVersionPending billingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
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

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }


    public SubscriptionProductVersionPending comment(String comment) {
        this.comment = comment;
        return this;
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

    public void setComment(String comment) {
        this.comment = comment;
    }


    public SubscriptionProductVersionPending defaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
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

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }


    public SubscriptionProductVersionPending enabledCurrencies(List<String> enabledCurrencies) {
        this.enabledCurrencies = enabledCurrencies;
        return this;
    }

    public SubscriptionProductVersionPending addEnabledCurrenciesItem(String enabledCurrenciesItem) {
        if (this.enabledCurrencies == null) {
            this.enabledCurrencies = new ArrayList<>();
        }
        this.enabledCurrencies.add(enabledCurrenciesItem);
        return this;
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

    public void setEnabledCurrencies(List<String> enabledCurrencies) {
        this.enabledCurrencies = enabledCurrencies;
    }


    public SubscriptionProductVersionPending minimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
        this.minimalNumberOfPeriods = minimalNumberOfPeriods;
        return this;
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

    public void setMinimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
        this.minimalNumberOfPeriods = minimalNumberOfPeriods;
    }


    public SubscriptionProductVersionPending name(DatabaseTranslatedStringCreate name) {
        this.name = name;
        return this;
    }

    /**
     * The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.")
    public DatabaseTranslatedStringCreate getName() {
        return name;
    }

    public void setName(DatabaseTranslatedStringCreate name) {
        this.name = name;
    }


    public SubscriptionProductVersionPending numberOfNoticePeriods(Integer numberOfNoticePeriods) {
        this.numberOfNoticePeriods = numberOfNoticePeriods;
        return this;
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

    public void setNumberOfNoticePeriods(Integer numberOfNoticePeriods) {
        this.numberOfNoticePeriods = numberOfNoticePeriods;
    }


    public SubscriptionProductVersionPending product(Long product) {
        this.product = product;
        return this;
    }

    /**
     * Each product version is linked to a product.
     *
     * @return product
     **/
    @ApiModelProperty(value = "Each product version is linked to a product.")
    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }


    public SubscriptionProductVersionPending state(SubscriptionProductVersionState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductVersionState getState() {
        return state;
    }

    public void setState(SubscriptionProductVersionState state) {
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
        SubscriptionProductVersionPending subscriptionProductVersionPending = (SubscriptionProductVersionPending) o;
        return Objects.equals(this.id, subscriptionProductVersionPending.id) &&
                Objects.equals(this.version, subscriptionProductVersionPending.version) &&
                Objects.equals(this.billingCycle, subscriptionProductVersionPending.billingCycle) &&
                Objects.equals(this.comment, subscriptionProductVersionPending.comment) &&
                Objects.equals(this.defaultCurrency, subscriptionProductVersionPending.defaultCurrency) &&
                Objects.equals(this.enabledCurrencies, subscriptionProductVersionPending.enabledCurrencies) &&
                Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersionPending.minimalNumberOfPeriods) &&
                Objects.equals(this.name, subscriptionProductVersionPending.name) &&
                Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersionPending.numberOfNoticePeriods) &&
                Objects.equals(this.product, subscriptionProductVersionPending.product) && this.state
                == subscriptionProductVersionPending.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, billingCycle, comment, defaultCurrency, enabledCurrencies, minimalNumberOfPeriods, name, numberOfNoticePeriods, product, state);
    }


    @Override
    public String toString() {

        return "class SubscriptionProductVersionPending { \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "    billingCycle: " + toIndentedString(billingCycle) + "\n" +
            "    comment: " + toIndentedString(comment) + "\n" +
            "    defaultCurrency: " +  toIndentedString(defaultCurrency) + "\n" +
            "    enabledCurrencies: " + toIndentedString(enabledCurrencies) +  " \n" +
            "    minimalNumberOfPeriods: " + toIndentedString(minimalNumberOfPeriods) + " \n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    numberOfNoticePeriods: " + toIndentedString(numberOfNoticePeriods) + "\n" +
            "    product: " + toIndentedString(product) + "\n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "}";
        }


}

