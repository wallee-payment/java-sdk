/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.Label;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DebtCollectionCaseDocument
 */
@JsonPropertyOrder({
  DebtCollectionCaseDocument.JSON_PROPERTY_LINKED_SPACE_ID,
  DebtCollectionCaseDocument.JSON_PROPERTY_FILE_NAME,
  DebtCollectionCaseDocument.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DebtCollectionCaseDocument.JSON_PROPERTY_DEBT_COLLECTION_CASE,
  DebtCollectionCaseDocument.JSON_PROPERTY_ID,
  DebtCollectionCaseDocument.JSON_PROPERTY_MIME_TYPE,
  DebtCollectionCaseDocument.JSON_PROPERTY_CREATED_ON,
  DebtCollectionCaseDocument.JSON_PROPERTY_VERSION,
  DebtCollectionCaseDocument.JSON_PROPERTY_UNIQUE_ID,
  DebtCollectionCaseDocument.JSON_PROPERTY_LABELS
})

public class DebtCollectionCaseDocument {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_DEBT_COLLECTION_CASE = "debtCollectionCase";
  private Long debtCollectionCase;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Set<Label> labels = new LinkedHashSet<>();

  public DebtCollectionCaseDocument() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public DebtCollectionCaseDocument(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_FILE_NAME) String fileName, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_DEBT_COLLECTION_CASE) Long debtCollectionCase, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_MIME_TYPE) String mimeType, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_UNIQUE_ID) String uniqueId, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.fileName = fileName;
    this.plannedPurgeDate = plannedPurgeDate;
    this.debtCollectionCase = debtCollectionCase;
    this.id = id;
    this.mimeType = mimeType;
    this.createdOn = createdOn;
    this.version = version;
    this.uniqueId = uniqueId;
    this.labels = labels;
  }

   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



   /**
   * The file name of the document.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * The debt collection case that this document belongs to.
   * @return debtCollectionCase
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBT_COLLECTION_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDebtCollectionCase() {
    return debtCollectionCase;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



   /**
   * The MIME type of the document&#39;s content.
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * A unique identifier of the document.
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }



   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
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
    return Objects.equals(this.linkedSpaceId, debtCollectionCaseDocument.linkedSpaceId) &&
        Objects.equals(this.fileName, debtCollectionCaseDocument.fileName) &&
        Objects.equals(this.plannedPurgeDate, debtCollectionCaseDocument.plannedPurgeDate) &&
        Objects.equals(this.debtCollectionCase, debtCollectionCaseDocument.debtCollectionCase) &&
        Objects.equals(this.id, debtCollectionCaseDocument.id) &&
        Objects.equals(this.mimeType, debtCollectionCaseDocument.mimeType) &&
        Objects.equals(this.createdOn, debtCollectionCaseDocument.createdOn) &&
        Objects.equals(this.version, debtCollectionCaseDocument.version) &&
        Objects.equals(this.uniqueId, debtCollectionCaseDocument.uniqueId) &&
        Objects.equals(this.labels, debtCollectionCaseDocument.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, fileName, plannedPurgeDate, debtCollectionCase, id, mimeType, createdOn, version, uniqueId, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCaseDocument {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    debtCollectionCase: ").append(toIndentedString(debtCollectionCase)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      try {
        joiner.add(String.format("%sfileName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `debtCollectionCase` to the URL query string
    if (getDebtCollectionCase() != null) {
      try {
        joiner.add(String.format("%sdebtCollectionCase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebtCollectionCase()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mimeType` to the URL query string
    if (getMimeType() != null) {
      try {
        joiner.add(String.format("%smimeType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMimeType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueId` to the URL query string
    if (getUniqueId() != null) {
      try {
        joiner.add(String.format("%suniqueId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (Label _item : getLabels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slabels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

