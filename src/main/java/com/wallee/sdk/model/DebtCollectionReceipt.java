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
import java.util.Objects;


@ApiModel(description = "")

public class DebtCollectionReceipt extends Indentable {

    @JsonProperty("amount")
    protected BigDecimal amount;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("debtCollectionCase")
    protected Long debtCollectionCase;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("source")
    protected Long source;


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
     * The created by field indicates the user which has created the receipt.
     *
     * @return createdBy
     **/
    @ApiModelProperty(value = "The created by field indicates the user which has created the receipt.")
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
     * @return debtCollectionCase
     **/
    @ApiModelProperty(value = "")
    public Long getDebtCollectionCase() {
        return debtCollectionCase;
    }


    /**
     * The external id is a unique identifier for the receipt. The external id has to be unique in combination with the debt collection case. When a receipt is sent with an existing external id the existing one is returned rather than a new one is created.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id is a unique identifier for the receipt. The external id has to be unique in combination with the debt collection case. When a receipt is sent with an existing external id the existing one is returned rather than a new one is created.")
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
     * @return source
     **/
    @ApiModelProperty(value = "")
    public Long getSource() {
        return source;
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
        DebtCollectionReceipt debtCollectionReceipt = (DebtCollectionReceipt) o;
        return Objects.equals(this.amount, debtCollectionReceipt.amount) &&
                Objects.equals(this.createdBy, debtCollectionReceipt.createdBy) &&
                Objects.equals(this.createdOn, debtCollectionReceipt.createdOn) &&
                Objects.equals(this.debtCollectionCase, debtCollectionReceipt.debtCollectionCase) &&
                Objects.equals(this.externalId, debtCollectionReceipt.externalId) &&
                Objects.equals(this.id, debtCollectionReceipt.id) &&
                Objects.equals(this.linkedSpaceId, debtCollectionReceipt.linkedSpaceId) &&
                Objects.equals(this.plannedPurgeDate, debtCollectionReceipt.plannedPurgeDate) &&
                Objects.equals(this.source, debtCollectionReceipt.source) &&
                Objects.equals(this.version, debtCollectionReceipt.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, createdBy, createdOn, debtCollectionCase, externalId, id, linkedSpaceId, plannedPurgeDate, source, version);
    }


    @Override
    public String toString() {

        return "class DebtCollectionReceipt { \n" +
            "    amount: " + toIndentedString(amount) +  "\n" +
            "    createdBy: " + toIndentedString(createdBy) + "\n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    debtCollectionCase: " + toIndentedString(debtCollectionCase) + "\n" +
            "    externalId: " + toIndentedString(externalId) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    source: " + toIndentedString(source) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

