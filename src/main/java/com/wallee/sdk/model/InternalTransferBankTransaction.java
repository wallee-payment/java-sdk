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
import com.wallee.sdk.model.BankTransaction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InternalTransferBankTransaction
 */
@JsonPropertyOrder({
  InternalTransferBankTransaction.JSON_PROPERTY_SOURCE_BANK_TRANSACTION,
  InternalTransferBankTransaction.JSON_PROPERTY_LINKED_SPACE_ID,
  InternalTransferBankTransaction.JSON_PROPERTY_TARGET_BANK_TRANSACTION,
  InternalTransferBankTransaction.JSON_PROPERTY_ID,
  InternalTransferBankTransaction.JSON_PROPERTY_VERSION
})

public class InternalTransferBankTransaction {
  public static final String JSON_PROPERTY_SOURCE_BANK_TRANSACTION = "sourceBankTransaction";
  private BankTransaction sourceBankTransaction;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TARGET_BANK_TRANSACTION = "targetBankTransaction";
  private BankTransaction targetBankTransaction;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public InternalTransferBankTransaction() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public InternalTransferBankTransaction(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.id = id;
    this.version = version;
  }

  public InternalTransferBankTransaction sourceBankTransaction(BankTransaction sourceBankTransaction) {
    
    this.sourceBankTransaction = sourceBankTransaction;
    return this;
  }

   /**
   * Get sourceBankTransaction
   * @return sourceBankTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransaction getSourceBankTransaction() {
    return sourceBankTransaction;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceBankTransaction(BankTransaction sourceBankTransaction) {
    this.sourceBankTransaction = sourceBankTransaction;
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



  public InternalTransferBankTransaction targetBankTransaction(BankTransaction targetBankTransaction) {
    
    this.targetBankTransaction = targetBankTransaction;
    return this;
  }

   /**
   * Get targetBankTransaction
   * @return targetBankTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransaction getTargetBankTransaction() {
    return targetBankTransaction;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetBankTransaction(BankTransaction targetBankTransaction) {
    this.targetBankTransaction = targetBankTransaction;
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
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    InternalTransferBankTransaction internalTransferBankTransaction = (InternalTransferBankTransaction) o;
    return Objects.equals(this.sourceBankTransaction, internalTransferBankTransaction.sourceBankTransaction) &&
        Objects.equals(this.linkedSpaceId, internalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.targetBankTransaction, internalTransferBankTransaction.targetBankTransaction) &&
        Objects.equals(this.id, internalTransferBankTransaction.id) &&
        Objects.equals(this.version, internalTransferBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceBankTransaction, linkedSpaceId, targetBankTransaction, id, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransferBankTransaction {\n");
    sb.append("    sourceBankTransaction: ").append(toIndentedString(sourceBankTransaction)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    targetBankTransaction: ").append(toIndentedString(targetBankTransaction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `sourceBankTransaction` to the URL query string
    if (getSourceBankTransaction() != null) {
      joiner.add(getSourceBankTransaction().toUrlQueryString(prefix + "sourceBankTransaction" + suffix));
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `targetBankTransaction` to the URL query string
    if (getTargetBankTransaction() != null) {
      joiner.add(getTargetBankTransaction().toUrlQueryString(prefix + "targetBankTransaction" + suffix));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

