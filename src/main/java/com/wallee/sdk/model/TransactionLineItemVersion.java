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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class TransactionLineItemVersion extends TransactionAwareEntity {

    @JsonProperty("amount")
    protected BigDecimal amount;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    @JsonProperty("taxAmount")
    protected BigDecimal taxAmount;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return amount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmount() {
        return amount;
    }


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
        return createdBy;
    }


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
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * @return lineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getLineItems() {
        return lineItems;
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
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }


    /**
     * @return taxAmount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
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
        TransactionLineItemVersion transactionLineItemVersion = (TransactionLineItemVersion) o;
        return Objects.equals(this.id, transactionLineItemVersion.id) &&
                Objects.equals(this.linkedSpaceId, transactionLineItemVersion.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, transactionLineItemVersion.linkedTransaction) &&
                Objects.equals(this.amount, transactionLineItemVersion.amount) &&
                Objects.equals(this.createdBy, transactionLineItemVersion.createdBy) &&
                Objects.equals(this.createdOn, transactionLineItemVersion.createdOn) &&
                Objects.equals(this.language, transactionLineItemVersion.language) &&
                Objects.equals(this.lineItems, transactionLineItemVersion.lineItems) &&
                Objects.equals(this.plannedPurgeDate, transactionLineItemVersion.plannedPurgeDate) &&
                Objects.equals(this.spaceViewId, transactionLineItemVersion.spaceViewId) &&
                Objects.equals(this.taxAmount, transactionLineItemVersion.taxAmount) &&
                Objects.equals(this.transaction, transactionLineItemVersion.transaction) &&
                Objects.equals(this.version, transactionLineItemVersion.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, amount, createdBy, createdOn, language, lineItems, plannedPurgeDate, spaceViewId, taxAmount, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionLineItemVersion { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    amount: " +  toIndentedString(amount) + " \n" +
            "    createdBy: " + toIndentedString(createdBy) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    language: " + toIndentedString(language) +  " \n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    plannedPurgeDate: " +  toIndentedString(plannedPurgeDate) + " \n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + " \n" +
            "    taxAmount: " + toIndentedString(taxAmount) + " \n" +
            "    transaction: " + toIndentedString(transaction) +  " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

