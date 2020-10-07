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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class DebtCollectionCaseDocument extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("debtCollectionCase")
    protected Long debtCollectionCase;


    @JsonProperty("fileName")
    protected String fileName;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("mimeType")
    protected String mimeType;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("storageId")
    protected String storageId;


    @JsonProperty("uniqueId")
    protected String uniqueId;


    @JsonProperty("version")
    protected Integer version;


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
     * @return fileName
     **/
    @ApiModelProperty(value = "")
    public String getFileName() {
        return fileName;
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
     * @return labels
     **/
    @ApiModelProperty(value = "")
    public List<Label> getLabels() {
        return labels;
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
     * @return mimeType
     **/
    @ApiModelProperty(value = "")
    public String getMimeType() {
        return mimeType;
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
     * @return storageId
     **/
    @ApiModelProperty(value = "")
    public String getStorageId() {
        return storageId;
    }


    /**
     * @return uniqueId
     **/
    @ApiModelProperty(value = "")
    public String getUniqueId() {
        return uniqueId;
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
        DebtCollectionCaseDocument debtCollectionCaseDocument = (DebtCollectionCaseDocument) o;
        return Objects.equals(this.createdOn, debtCollectionCaseDocument.createdOn) &&
                Objects.equals(this.debtCollectionCase, debtCollectionCaseDocument.debtCollectionCase) &&
                Objects.equals(this.fileName, debtCollectionCaseDocument.fileName) &&
                Objects.equals(this.id, debtCollectionCaseDocument.id) &&
                Objects.equals(this.labels, debtCollectionCaseDocument.labels) &&
                Objects.equals(this.linkedSpaceId, debtCollectionCaseDocument.linkedSpaceId) &&
                Objects.equals(this.mimeType, debtCollectionCaseDocument.mimeType) &&
                Objects.equals(this.plannedPurgeDate, debtCollectionCaseDocument.plannedPurgeDate) &&
                Objects.equals(this.storageId, debtCollectionCaseDocument.storageId) &&
                Objects.equals(this.uniqueId, debtCollectionCaseDocument.uniqueId) &&
                Objects.equals(this.version, debtCollectionCaseDocument.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, debtCollectionCase, fileName, id, labels, linkedSpaceId, mimeType, plannedPurgeDate, storageId, uniqueId, version);
    }


    @Override
    public String toString() {

        return "class DebtCollectionCaseDocument {\n" +
            "    createdOn: " + toIndentedString(createdOn) +  "\n" +
            "    debtCollectionCase: " + toIndentedString(debtCollectionCase) + "\n" +
            "    fileName: " + toIndentedString(fileName) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    labels: " + toIndentedString(labels) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    mimeType: " + toIndentedString(mimeType) + "\n" +
            "    plannedPurgeDate: " +  toIndentedString(plannedPurgeDate) + "\n" +
            "    storageId: " + toIndentedString(storageId) + "\n" +
            "    uniqueId: " + toIndentedString(uniqueId) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

