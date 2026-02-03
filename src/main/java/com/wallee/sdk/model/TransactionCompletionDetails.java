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
import com.wallee.sdk.model.CompletionLineItemCreate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionCompletionDetails
 */
@JsonPropertyOrder({
  TransactionCompletionDetails.JSON_PROPERTY_LINE_ITEMS,
  TransactionCompletionDetails.JSON_PROPERTY_META_DATA,
  TransactionCompletionDetails.JSON_PROPERTY_LAST_COMPLETION,
  TransactionCompletionDetails.JSON_PROPERTY_STATEMENT_DESCRIPTOR,
  TransactionCompletionDetails.JSON_PROPERTY_EXTERNAL_ID,
  TransactionCompletionDetails.JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE,
  TransactionCompletionDetails.JSON_PROPERTY_ID
})

public class TransactionCompletionDetails {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<CompletionLineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_LAST_COMPLETION = "lastCompletion";
  @javax.annotation.Nullable
  private Boolean lastCompletion;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR = "statementDescriptor";
  @javax.annotation.Nullable
  private String statementDescriptor;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE = "invoiceMerchantReference";
  @javax.annotation.Nullable
  private String invoiceMerchantReference;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public TransactionCompletionDetails() {
  }

  public TransactionCompletionDetails lineItems(@javax.annotation.Nullable List<CompletionLineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public TransactionCompletionDetails addLineItemsItem(CompletionLineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * The line items to be captured in the transaction completion.
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CompletionLineItemCreate> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(@javax.annotation.Nullable List<CompletionLineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  public TransactionCompletionDetails metaData(@javax.annotation.Nullable Map<String, String> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public TransactionCompletionDetails putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

  /**
   * Allow to store additional information about the object.
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }


  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaData(@javax.annotation.Nullable Map<String, String> metaData) {
    this.metaData = metaData;
  }

  public TransactionCompletionDetails lastCompletion(@javax.annotation.Nullable Boolean lastCompletion) {
    
    this.lastCompletion = lastCompletion;
    return this;
  }

  /**
   * Whether this is the final completion for the transaction, meaning no further completions can occur, and the transaction will move to its completed state upon success.
   * @return lastCompletion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLastCompletion() {
    return lastCompletion;
  }


  @JsonProperty(JSON_PROPERTY_LAST_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastCompletion(@javax.annotation.Nullable Boolean lastCompletion) {
    this.lastCompletion = lastCompletion;
  }

  public TransactionCompletionDetails statementDescriptor(@javax.annotation.Nullable String statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

  /**
   * The statement descriptor that appears on a customer&#39;s bank statement, providing an explanation for charges or payments, helping customers identify the transaction.
   * @return statementDescriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementDescriptor() {
    return statementDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatementDescriptor(@javax.annotation.Nullable String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  public TransactionCompletionDetails externalId(@javax.annotation.Nullable String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }

  public TransactionCompletionDetails invoiceMerchantReference(@javax.annotation.Nullable String invoiceMerchantReference) {
    
    this.invoiceMerchantReference = invoiceMerchantReference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceMerchantReference(@javax.annotation.Nullable String invoiceMerchantReference) {
    this.invoiceMerchantReference = invoiceMerchantReference;
  }

  public TransactionCompletionDetails id(@javax.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
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


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCompletionDetails transactionCompletionDetails = (TransactionCompletionDetails) o;
    return Objects.equals(this.lineItems, transactionCompletionDetails.lineItems) &&
        Objects.equals(this.metaData, transactionCompletionDetails.metaData) &&
        Objects.equals(this.lastCompletion, transactionCompletionDetails.lastCompletion) &&
        Objects.equals(this.statementDescriptor, transactionCompletionDetails.statementDescriptor) &&
        Objects.equals(this.externalId, transactionCompletionDetails.externalId) &&
        Objects.equals(this.invoiceMerchantReference, transactionCompletionDetails.invoiceMerchantReference) &&
        Objects.equals(this.id, transactionCompletionDetails.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, metaData, lastCompletion, statementDescriptor, externalId, invoiceMerchantReference, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCompletionDetails {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `metaData` to the URL query string
    if (getMetaData() != null) {
      for (String _key : getMetaData().keySet()) {
        try {
          joiner.add(String.format("%smetaData%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetaData().get(_key), URLEncoder.encode(String.valueOf(getMetaData().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `lastCompletion` to the URL query string
    if (getLastCompletion() != null) {
      try {
        joiner.add(String.format("%slastCompletion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastCompletion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `statementDescriptor` to the URL query string
    if (getStatementDescriptor() != null) {
      try {
        joiner.add(String.format("%sstatementDescriptor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatementDescriptor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invoiceMerchantReference` to the URL query string
    if (getInvoiceMerchantReference() != null) {
      try {
        joiner.add(String.format("%sinvoiceMerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoiceMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

