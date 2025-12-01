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
import com.wallee.sdk.model.TransactionInvoice;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionInvoiceComment
 */
@JsonPropertyOrder({
  TransactionInvoiceComment.JSON_PROPERTY_LINKED_SPACE_ID,
  TransactionInvoiceComment.JSON_PROPERTY_PINNED,
  TransactionInvoiceComment.JSON_PROPERTY_EDITED_BY,
  TransactionInvoiceComment.JSON_PROPERTY_CREATED_BY,
  TransactionInvoiceComment.JSON_PROPERTY_ID,
  TransactionInvoiceComment.JSON_PROPERTY_EDITED_ON,
  TransactionInvoiceComment.JSON_PROPERTY_CREATED_ON,
  TransactionInvoiceComment.JSON_PROPERTY_TRANSACTION_INVOICE,
  TransactionInvoiceComment.JSON_PROPERTY_VERSION,
  TransactionInvoiceComment.JSON_PROPERTY_CONTENT
})

public class TransactionInvoiceComment {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_PINNED = "pinned";
  @javax.annotation.Nullable
  private Boolean pinned;

  public static final String JSON_PROPERTY_EDITED_BY = "editedBy";
  @javax.annotation.Nullable
  private Long editedBy;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_EDITED_ON = "editedOn";
  @javax.annotation.Nullable
  private OffsetDateTime editedOn;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_TRANSACTION_INVOICE = "transactionInvoice";
  @javax.annotation.Nullable
  private TransactionInvoice transactionInvoice;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private String content;

  public TransactionInvoiceComment() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TransactionInvoiceComment(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_PINNED) Boolean pinned, 
    @JsonProperty(JSON_PROPERTY_EDITED_BY) Long editedBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_EDITED_ON) OffsetDateTime editedOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_CONTENT) String content
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.pinned = pinned;
    this.editedBy = editedBy;
    this.createdBy = createdBy;
    this.id = id;
    this.editedOn = editedOn;
    this.createdOn = createdOn;
    this.version = version;
    this.content = content;
  }

  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * Whether the comment is pinned to the top.
   * @return pinned
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPinned() {
    return pinned;
  }



  /**
   * The ID of the user the comment was last updated by.
   * @return editedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEditedBy() {
    return editedBy;
  }



  /**
   * The ID of the user the comment was created by.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  /**
   * The date and time when the comment was last updated.
   * @return editedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEditedOn() {
    return editedOn;
  }



  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public TransactionInvoiceComment transactionInvoice(@javax.annotation.Nullable TransactionInvoice transactionInvoice) {
    
    this.transactionInvoice = transactionInvoice;
    return this;
  }

  /**
   * Get transactionInvoice
   * @return transactionInvoice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionInvoice getTransactionInvoice() {
    return transactionInvoice;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionInvoice(@javax.annotation.Nullable TransactionInvoice transactionInvoice) {
    this.transactionInvoice = transactionInvoice;
  }

  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The comment&#39;s actual content.
   * @return content
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInvoiceComment transactionInvoiceComment = (TransactionInvoiceComment) o;
    return Objects.equals(this.linkedSpaceId, transactionInvoiceComment.linkedSpaceId) &&
        Objects.equals(this.pinned, transactionInvoiceComment.pinned) &&
        Objects.equals(this.editedBy, transactionInvoiceComment.editedBy) &&
        Objects.equals(this.createdBy, transactionInvoiceComment.createdBy) &&
        Objects.equals(this.id, transactionInvoiceComment.id) &&
        Objects.equals(this.editedOn, transactionInvoiceComment.editedOn) &&
        Objects.equals(this.createdOn, transactionInvoiceComment.createdOn) &&
        Objects.equals(this.transactionInvoice, transactionInvoiceComment.transactionInvoice) &&
        Objects.equals(this.version, transactionInvoiceComment.version) &&
        Objects.equals(this.content, transactionInvoiceComment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, pinned, editedBy, createdBy, id, editedOn, createdOn, transactionInvoice, version, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoiceComment {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    editedBy: ").append(toIndentedString(editedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    editedOn: ").append(toIndentedString(editedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    transactionInvoice: ").append(toIndentedString(transactionInvoice)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

    // add `pinned` to the URL query string
    if (getPinned() != null) {
      try {
        joiner.add(String.format("%spinned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPinned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `editedBy` to the URL query string
    if (getEditedBy() != null) {
      try {
        joiner.add(String.format("%seditedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `editedOn` to the URL query string
    if (getEditedOn() != null) {
      try {
        joiner.add(String.format("%seditedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEditedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `transactionInvoice` to the URL query string
    if (getTransactionInvoice() != null) {
      joiner.add(getTransactionInvoice().toUrlQueryString(prefix + "transactionInvoice" + suffix));
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

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

