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
 * ExternalTransferBankTransaction
 */
@JsonPropertyOrder({
  ExternalTransferBankTransaction.JSON_PROPERTY_EXTERNAL_BANK_NAME,
  ExternalTransferBankTransaction.JSON_PROPERTY_LINKED_SPACE_ID,
  ExternalTransferBankTransaction.JSON_PROPERTY_EXTERNAL_ACCOUNT_IDENTIFIER,
  ExternalTransferBankTransaction.JSON_PROPERTY_ID,
  ExternalTransferBankTransaction.JSON_PROPERTY_BANK_TRANSACTION,
  ExternalTransferBankTransaction.JSON_PROPERTY_VERSION,
  ExternalTransferBankTransaction.JSON_PROPERTY_EXTERNAL_ACCOUNT_TYPE
})

public class ExternalTransferBankTransaction {
  public static final String JSON_PROPERTY_EXTERNAL_BANK_NAME = "externalBankName";
  @javax.annotation.Nullable
  private String externalBankName;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_EXTERNAL_ACCOUNT_IDENTIFIER = "externalAccountIdentifier";
  @javax.annotation.Nullable
  private String externalAccountIdentifier;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_BANK_TRANSACTION = "bankTransaction";
  @javax.annotation.Nullable
  private BankTransaction bankTransaction;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_EXTERNAL_ACCOUNT_TYPE = "externalAccountType";
  @javax.annotation.Nullable
  private String externalAccountType;

  public ExternalTransferBankTransaction() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExternalTransferBankTransaction(
    @JsonProperty(JSON_PROPERTY_EXTERNAL_BANK_NAME) String externalBankName, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ACCOUNT_IDENTIFIER) String externalAccountIdentifier, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ACCOUNT_TYPE) String externalAccountType
  ) {
    this();
    this.externalBankName = externalBankName;
    this.linkedSpaceId = linkedSpaceId;
    this.externalAccountIdentifier = externalAccountIdentifier;
    this.id = id;
    this.version = version;
    this.externalAccountType = externalAccountType;
  }

  /**
   * The external bank account&#39;s name.
   * @return externalBankName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalBankName() {
    return externalBankName;
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
   * The identifier is used to uniquely identify the external bank account.
   * @return externalAccountIdentifier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalAccountIdentifier() {
    return externalAccountIdentifier;
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



  public ExternalTransferBankTransaction bankTransaction(@javax.annotation.Nullable BankTransaction bankTransaction) {
    
    this.bankTransaction = bankTransaction;
    return this;
  }

  /**
   * Get bankTransaction
   * @return bankTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankTransaction(@javax.annotation.Nullable BankTransaction bankTransaction) {
    this.bankTransaction = bankTransaction;
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
   * The external bank account&#39;s type.
   * @return externalAccountType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalAccountType() {
    return externalAccountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTransferBankTransaction externalTransferBankTransaction = (ExternalTransferBankTransaction) o;
    return Objects.equals(this.externalBankName, externalTransferBankTransaction.externalBankName) &&
        Objects.equals(this.linkedSpaceId, externalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.externalAccountIdentifier, externalTransferBankTransaction.externalAccountIdentifier) &&
        Objects.equals(this.id, externalTransferBankTransaction.id) &&
        Objects.equals(this.bankTransaction, externalTransferBankTransaction.bankTransaction) &&
        Objects.equals(this.version, externalTransferBankTransaction.version) &&
        Objects.equals(this.externalAccountType, externalTransferBankTransaction.externalAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalBankName, linkedSpaceId, externalAccountIdentifier, id, bankTransaction, version, externalAccountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTransferBankTransaction {\n");
    sb.append("    externalBankName: ").append(toIndentedString(externalBankName)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    externalAccountIdentifier: ").append(toIndentedString(externalAccountIdentifier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    externalAccountType: ").append(toIndentedString(externalAccountType)).append("\n");
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

    // add `externalBankName` to the URL query string
    if (getExternalBankName() != null) {
      try {
        joiner.add(String.format("%sexternalBankName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalBankName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `externalAccountIdentifier` to the URL query string
    if (getExternalAccountIdentifier() != null) {
      try {
        joiner.add(String.format("%sexternalAccountIdentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalAccountIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `bankTransaction` to the URL query string
    if (getBankTransaction() != null) {
      joiner.add(getBankTransaction().toUrlQueryString(prefix + "bankTransaction" + suffix));
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

    // add `externalAccountType` to the URL query string
    if (getExternalAccountType() != null) {
      try {
        joiner.add(String.format("%sexternalAccountType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalAccountType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

