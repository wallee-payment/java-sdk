/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.Label;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DebtCollectionCaseDocument {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("debtCollectionCase")
  protected Long debtCollectionCase = null;

  
  @JsonProperty("fileName")
  protected String fileName = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("mimeType")
  protected String mimeType = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The debt collection case that this document belongs to.
   * @return debtCollectionCase
  **/
  @ApiModelProperty(value = "The debt collection case that this document belongs to.")
  public Long getDebtCollectionCase() {
    return debtCollectionCase;
  }

  
   /**
   * The file name of the document.
   * @return fileName
  **/
  @ApiModelProperty(value = "The file name of the document.")
  public String getFileName() {
    return fileName;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @ApiModelProperty(value = "The labels providing additional information about the object.")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The MIME type of the document&#39;s content.
   * @return mimeType
  **/
  @ApiModelProperty(value = "The MIME type of the document's content.")
  public String getMimeType() {
    return mimeType;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * A unique identifier of the document.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "A unique identifier of the document.")
  public String getUniqueId() {
    return uniqueId;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.uniqueId, debtCollectionCaseDocument.uniqueId) &&
        Objects.equals(this.version, debtCollectionCaseDocument.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, debtCollectionCase, fileName, id, labels, linkedSpaceId, mimeType, plannedPurgeDate, uniqueId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCaseDocument {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    debtCollectionCase: ").append(toIndentedString(debtCollectionCase)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

