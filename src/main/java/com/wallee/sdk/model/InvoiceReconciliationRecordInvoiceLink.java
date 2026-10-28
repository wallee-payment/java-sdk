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
import com.wallee.sdk.model.InvoiceReconciliationRecord;
import com.wallee.sdk.model.TransactionInvoice;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InvoiceReconciliationRecordInvoiceLink
 */
@JsonPropertyOrder({
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_LINKED_SPACE_ID,
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_AMOUNT,
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_RECORD,
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_ID,
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_INVOICE,
  InvoiceReconciliationRecordInvoiceLink.JSON_PROPERTY_CREATED_ON
})

public class InvoiceReconciliationRecordInvoiceLink {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_RECORD = "record";
  @javax.annotation.Nullable
  private InvoiceReconciliationRecord record;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_INVOICE = "invoice";
  @javax.annotation.Nullable
  private TransactionInvoice invoice;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public InvoiceReconciliationRecordInvoiceLink() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public InvoiceReconciliationRecordInvoiceLink(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.amount = amount;
    this.id = id;
    this.createdOn = createdOn;
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
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



  public InvoiceReconciliationRecordInvoiceLink record(@javax.annotation.Nullable InvoiceReconciliationRecord record) {
    
    this.record = record;
    return this;
  }

  /**
   * Get record
   * @return record
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InvoiceReconciliationRecord getRecord() {
    return record;
  }


  @JsonProperty(JSON_PROPERTY_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecord(@javax.annotation.Nullable InvoiceReconciliationRecord record) {
    this.record = record;
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



  public InvoiceReconciliationRecordInvoiceLink invoice(@javax.annotation.Nullable TransactionInvoice invoice) {
    
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionInvoice getInvoice() {
    return invoice;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoice(@javax.annotation.Nullable TransactionInvoice invoice) {
    this.invoice = invoice;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceReconciliationRecordInvoiceLink invoiceReconciliationRecordInvoiceLink = (InvoiceReconciliationRecordInvoiceLink) o;
    return Objects.equals(this.linkedSpaceId, invoiceReconciliationRecordInvoiceLink.linkedSpaceId) &&
        Objects.equals(this.amount, invoiceReconciliationRecordInvoiceLink.amount) &&
        Objects.equals(this.record, invoiceReconciliationRecordInvoiceLink.record) &&
        Objects.equals(this.id, invoiceReconciliationRecordInvoiceLink.id) &&
        Objects.equals(this.invoice, invoiceReconciliationRecordInvoiceLink.invoice) &&
        Objects.equals(this.createdOn, invoiceReconciliationRecordInvoiceLink.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, amount, record, id, invoice, createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReconciliationRecordInvoiceLink {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `record` to the URL query string
    if (getRecord() != null) {
      joiner.add(getRecord().toUrlQueryString(prefix + "record" + suffix));
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

    // add `invoice` to the URL query string
    if (getInvoice() != null) {
      joiner.add(getInvoice().toUrlQueryString(prefix + "invoice" + suffix));
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

    return joiner.toString();
  }

}

