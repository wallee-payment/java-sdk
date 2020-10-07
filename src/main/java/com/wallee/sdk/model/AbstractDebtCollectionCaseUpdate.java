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
import com.wallee.sdk.model.enums.DebtCollectionEnvironment;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AbstractDebtCollectionCaseUpdate
 */

public class AbstractDebtCollectionCaseUpdate extends Indentable {

    @JsonProperty("billingAddress")
    protected AddressCreate billingAddress;


    @JsonProperty("contractDate")
    protected OffsetDateTime contractDate;


    @JsonProperty("currency")
    protected String currency;


    @JsonProperty("dueDate")
    protected OffsetDateTime dueDate;


    @JsonProperty("environment")
    protected DebtCollectionEnvironment environment;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lineItems")
    protected List<LineItemCreate> lineItems;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    public AbstractDebtCollectionCaseUpdate billingAddress(AddressCreate billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * The billing address of the case identifies the debtor.
     * @return billingAddress
     **/
    @ApiModelProperty(value = "The billing address of the case identifies the debtor.")
    public AddressCreate getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(AddressCreate billingAddress) {
        this.billingAddress = billingAddress;
    }


    public AbstractDebtCollectionCaseUpdate contractDate(OffsetDateTime contractDate) {
        this.contractDate = contractDate;
        return this;
    }

    /**
     * The contract date is the date on which the contract with the debtor was signed on.
     * @return contractDate
     **/
    @ApiModelProperty(value = "The contract date is the date on which the contract with the debtor was signed on.")
    public OffsetDateTime getContractDate() {
        return contractDate;
    }

    public void setContractDate(OffsetDateTime contractDate) {
        this.contractDate = contractDate;
    }


    public AbstractDebtCollectionCaseUpdate currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * The currency defines the billing currency of the debt collection case.
     * @return currency
     **/
    @ApiModelProperty(value = "The currency defines the billing currency of the debt collection case.")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public AbstractDebtCollectionCaseUpdate dueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * The due date indicates the date on which the amount receivable was due. This date has to be always in the past.
     * @return dueDate
     **/
    @ApiModelProperty(value = "The due date indicates the date on which the amount receivable was due. This date has to be always in the past.")
    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }


    public AbstractDebtCollectionCaseUpdate environment(DebtCollectionEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * The environment in which this case will be processed. There must be a debt collector configuration present which supports the chosen environment.
     * @return environment
     **/
    @ApiModelProperty(value = "The environment in which this case will be processed. There must be a debt collector configuration present which supports the chosen environment.")
    public DebtCollectionEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(DebtCollectionEnvironment environment) {
        this.environment = environment;
    }


    public AbstractDebtCollectionCaseUpdate language(String language) {
        this.language = language;
        return this;
    }

    /**
     * The language indicates the language to be used in the communication with the debtor.
     * @return language
     **/
    @ApiModelProperty(value = "The language indicates the language to be used in the communication with the debtor.")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public AbstractDebtCollectionCaseUpdate lineItems(List<LineItemCreate> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public AbstractDebtCollectionCaseUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(lineItemsItem);
        return this;
    }

    /**
     * The line items of the debt collection case will be shown on documents sent to the debtor and the total of them makes up total amount to collect.
     * @return lineItems
     **/
    @ApiModelProperty(value = "The line items of the debt collection case will be shown on documents sent to the debtor and the total of them makes up total amount to collect.")
    public List<LineItemCreate> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItemCreate> lineItems) {
        this.lineItems = lineItems;
    }


    public AbstractDebtCollectionCaseUpdate spaceViewId(Long spaceViewId) {
        this.spaceViewId = spaceViewId;
        return this;
    }

    /**
     *
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }

    public void setSpaceViewId(Long spaceViewId) {
        this.spaceViewId = spaceViewId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractDebtCollectionCaseUpdate abstractDebtCollectionCaseUpdate = (AbstractDebtCollectionCaseUpdate) o;
        return Objects.equals(this.billingAddress, abstractDebtCollectionCaseUpdate.billingAddress) &&
                Objects.equals(this.contractDate, abstractDebtCollectionCaseUpdate.contractDate) &&
                Objects.equals(this.currency, abstractDebtCollectionCaseUpdate.currency) &&
                Objects.equals(this.dueDate, abstractDebtCollectionCaseUpdate.dueDate) && this.environment
                == abstractDebtCollectionCaseUpdate.environment &&
                Objects.equals(this.language, abstractDebtCollectionCaseUpdate.language) &&
                Objects.equals(this.lineItems, abstractDebtCollectionCaseUpdate.lineItems) &&
                Objects.equals(this.spaceViewId, abstractDebtCollectionCaseUpdate.spaceViewId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingAddress, contractDate, currency, dueDate, environment, language, lineItems, spaceViewId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractDebtCollectionCaseUpdate {\n");

        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
        sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

