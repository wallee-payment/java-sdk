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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class ProductSetupFeeUpdate extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("component")
    protected Long component;


    @JsonProperty("description")
    protected DatabaseTranslatedStringCreate description;


    @JsonProperty("name")
    protected DatabaseTranslatedStringCreate name;


    @JsonProperty("onDowngradeCreditedAmount")
    protected List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount;


    @JsonProperty("onUpgradeCreditedAmount")
    protected List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount;


    @JsonProperty("setupFee")
    protected List<PersistableCurrencyAmountUpdate> setupFee;


    public ProductSetupFeeUpdate id(Long id) {
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


    public ProductSetupFeeUpdate version(Long version) {
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


    public ProductSetupFeeUpdate component(Long component) {
        this.component = component;
        return this;
    }

    /**
     * @return component
     **/
    @ApiModelProperty(value = "")
    public Long getComponent() {
        return component;
    }

    public void setComponent(Long component) {
        this.component = component;
    }


    public ProductSetupFeeUpdate description(DatabaseTranslatedStringCreate description) {
        this.description = description;
        return this;
    }

    /**
     * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
     *
     * @return description
     **/
    @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
    public DatabaseTranslatedStringCreate getDescription() {
        return description;
    }

    public void setDescription(DatabaseTranslatedStringCreate description) {
        this.description = description;
    }


    public ProductSetupFeeUpdate name(DatabaseTranslatedStringCreate name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the fee should describe for the subscriber in few words for what the fee is for.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
    public DatabaseTranslatedStringCreate getName() {
        return name;
    }

    public void setName(DatabaseTranslatedStringCreate name) {
        this.name = name;
    }


    public ProductSetupFeeUpdate onDowngradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
        this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
        return this;
    }

    public ProductSetupFeeUpdate addOnDowngradeCreditedAmountItem(PersistableCurrencyAmountUpdate onDowngradeCreditedAmountItem) {
        if (this.onDowngradeCreditedAmount == null) {
            this.onDowngradeCreditedAmount = new ArrayList<>();
        }
        this.onDowngradeCreditedAmount.add(onDowngradeCreditedAmountItem);
        return this;
    }

    /**
     * When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber.
     *
     * @return onDowngradeCreditedAmount
     **/
    @ApiModelProperty(value = "When the subscription is changed and the change is considered as a downgrade the amount defined by this property will be credited to the subscriber.")
    public List<PersistableCurrencyAmountUpdate> getOnDowngradeCreditedAmount() {
        return onDowngradeCreditedAmount;
    }

    public void setOnDowngradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onDowngradeCreditedAmount) {
        this.onDowngradeCreditedAmount = onDowngradeCreditedAmount;
    }


    public ProductSetupFeeUpdate onUpgradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
        this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
        return this;
    }

    public ProductSetupFeeUpdate addOnUpgradeCreditedAmountItem(PersistableCurrencyAmountUpdate onUpgradeCreditedAmountItem) {
        if (this.onUpgradeCreditedAmount == null) {
            this.onUpgradeCreditedAmount = new ArrayList<>();
        }
        this.onUpgradeCreditedAmount.add(onUpgradeCreditedAmountItem);
        return this;
    }

    /**
     * When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber.
     *
     * @return onUpgradeCreditedAmount
     **/
    @ApiModelProperty(value = "When the subscription is changed and the change is considered as a upgrade the amount defined by this property will be credited to the subscriber.")
    public List<PersistableCurrencyAmountUpdate> getOnUpgradeCreditedAmount() {
        return onUpgradeCreditedAmount;
    }

    public void setOnUpgradeCreditedAmount(List<PersistableCurrencyAmountUpdate> onUpgradeCreditedAmount) {
        this.onUpgradeCreditedAmount = onUpgradeCreditedAmount;
    }


    public ProductSetupFeeUpdate setupFee(List<PersistableCurrencyAmountUpdate> setupFee) {
        this.setupFee = setupFee;
        return this;
    }

    public ProductSetupFeeUpdate addSetupFeeItem(PersistableCurrencyAmountUpdate setupFeeItem) {
        if (this.setupFee == null) {
            this.setupFee = new ArrayList<>();
        }
        this.setupFee.add(setupFeeItem);
        return this;
    }

    /**
     * The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions.
     *
     * @return setupFee
     **/
    @ApiModelProperty(value = "The setup fee is charged when the subscriber subscribes to this component. The setup fee is debited with the first charge for the subscriptions.")
    public List<PersistableCurrencyAmountUpdate> getSetupFee() {
        return setupFee;
    }

    public void setSetupFee(List<PersistableCurrencyAmountUpdate> setupFee) {
        this.setupFee = setupFee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductSetupFeeUpdate productSetupFeeUpdate = (ProductSetupFeeUpdate) o;
        return Objects.equals(this.id, productSetupFeeUpdate.id) &&
                Objects.equals(this.version, productSetupFeeUpdate.version) &&
                Objects.equals(this.component, productSetupFeeUpdate.component) &&
                Objects.equals(this.description, productSetupFeeUpdate.description) &&
                Objects.equals(this.name, productSetupFeeUpdate.name) &&
                Objects.equals(this.onDowngradeCreditedAmount, productSetupFeeUpdate.onDowngradeCreditedAmount) &&
                Objects.equals(this.onUpgradeCreditedAmount, productSetupFeeUpdate.onUpgradeCreditedAmount) &&
                Objects.equals(this.setupFee, productSetupFeeUpdate.setupFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, component, description, name, onDowngradeCreditedAmount, onUpgradeCreditedAmount, setupFee);
    }


    @Override
    public String toString() {

        return "class ProductSetupFeeUpdate { \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "    component: " + toIndentedString(component) +  " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    onDowngradeCreditedAmount: " + toIndentedString(onDowngradeCreditedAmount) +  " \n" +
            "    onUpgradeCreditedAmount: " + toIndentedString(onUpgradeCreditedAmount) + " \n" +
            "    setupFee: " + toIndentedString(setupFee) + " \n" +
            "}";
        }


}

