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
import com.wallee.sdk.model.enums.SubscriptionLedgerEntryState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@ApiModel(description = "The subscription ledger entry represents a single change on the subscription balance.")

public class SubscriptionLedgerEntry extends Indentable {

    @JsonProperty("aggregatedTaxRate")
    protected BigDecimal aggregatedTaxRate;


    @JsonProperty("amountExcludingTax")
    protected BigDecimal amountExcludingTax;


    @JsonProperty("amountIncludingTax")
    protected BigDecimal amountIncludingTax;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("quantity")
    protected BigDecimal quantity;


    @JsonProperty("state")
    protected SubscriptionLedgerEntryState state;


    @JsonProperty("subscriptionVersion")
    protected Long subscriptionVersion;


    @JsonProperty("taxAmount")
    protected BigDecimal taxAmount;


    @JsonProperty("taxes")
    protected List<Tax> taxes;


    @JsonProperty("title")
    protected String title;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return aggregatedTaxRate
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAggregatedTaxRate() {
        return aggregatedTaxRate;
    }


    /**
     * @return amountExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmountExcludingTax() {
        return amountExcludingTax;
    }


    /**
     * @return amountIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmountIncludingTax() {
        return amountIncludingTax;
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
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionLedgerEntryState getState() {
        return state;
    }


    /**
     * @return subscriptionVersion
     **/
    @ApiModelProperty(value = "")
    public Long getSubscriptionVersion() {
        return subscriptionVersion;
    }


    /**
     * @return taxAmount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * @return taxes
     **/
    @ApiModelProperty(value = "")
    public List<Tax> getTaxes() {
        return taxes;
    }


    /**
     * @return title
     **/
    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
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
        SubscriptionLedgerEntry subscriptionLedgerEntry = (SubscriptionLedgerEntry) o;
        return Objects.equals(this.aggregatedTaxRate, subscriptionLedgerEntry.aggregatedTaxRate) &&
                Objects.equals(this.amountExcludingTax, subscriptionLedgerEntry.amountExcludingTax) &&
                Objects.equals(this.amountIncludingTax, subscriptionLedgerEntry.amountIncludingTax) &&
                Objects.equals(this.createdBy, subscriptionLedgerEntry.createdBy) &&
                Objects.equals(this.createdOn, subscriptionLedgerEntry.createdOn) &&
                Objects.equals(this.externalId, subscriptionLedgerEntry.externalId) &&
                Objects.equals(this.id, subscriptionLedgerEntry.id) &&
                Objects.equals(this.linkedSpaceId, subscriptionLedgerEntry.linkedSpaceId) &&
                Objects.equals(this.plannedPurgeDate, subscriptionLedgerEntry.plannedPurgeDate) &&
                Objects.equals(this.quantity, subscriptionLedgerEntry.quantity) && this.state == subscriptionLedgerEntry.state
                &&
                Objects.equals(this.subscriptionVersion, subscriptionLedgerEntry.subscriptionVersion) &&
                Objects.equals(this.taxAmount, subscriptionLedgerEntry.taxAmount) &&
                Objects.equals(this.taxes, subscriptionLedgerEntry.taxes) &&
                Objects.equals(this.title, subscriptionLedgerEntry.title) &&
                Objects.equals(this.version, subscriptionLedgerEntry.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, createdBy, createdOn, externalId, id, linkedSpaceId, plannedPurgeDate, quantity, state, subscriptionVersion, taxAmount, taxes, title, version);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionLedgerEntry {\n");

        sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
        sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
        sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
        sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

