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

import java.util.Objects;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
@ApiModel(description = "The debt collection case represents a try to collect the money from the debtor.")

public class DebtCollectionCaseUpdate extends AbstractDebtCollectionCaseUpdate {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public DebtCollectionCaseUpdate id(Long id) {
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


    public DebtCollectionCaseUpdate version(Long version) {
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
        DebtCollectionCaseUpdate debtCollectionCaseUpdate = (DebtCollectionCaseUpdate) o;
        return Objects.equals(this.billingAddress, debtCollectionCaseUpdate.billingAddress) &&
                Objects.equals(this.contractDate, debtCollectionCaseUpdate.contractDate) &&
                Objects.equals(this.currency, debtCollectionCaseUpdate.currency) &&
                Objects.equals(this.dueDate, debtCollectionCaseUpdate.dueDate) && this.environment
                == debtCollectionCaseUpdate.environment &&
                Objects.equals(this.language, debtCollectionCaseUpdate.language) &&
                Objects.equals(this.lineItems, debtCollectionCaseUpdate.lineItems) &&
                Objects.equals(this.spaceViewId, debtCollectionCaseUpdate.spaceViewId) &&
                Objects.equals(this.id, debtCollectionCaseUpdate.id) &&
                Objects.equals(this.version, debtCollectionCaseUpdate.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingAddress, contractDate, currency, dueDate, environment, language, lineItems, spaceViewId, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class DebtCollectionCaseUpdate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    billingAddress: " + toIndentedString(billingAddress) + " \n" +
            "    contractDate: " +  toIndentedString(contractDate) + " \n" +
            "    currency: " + toIndentedString(currency) + " \n" +
            "    dueDate: " + toIndentedString(dueDate) + " \n" +
            "    environment: " + toIndentedString(environment) +  "\n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    lineItems: " + toIndentedString(lineItems) + "\n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + " \n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

