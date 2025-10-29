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
import com.wallee.sdk.model.TaxCreate;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@JsonPropertyOrder({
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_QUANTITY,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_SUBSCRIPTION_VERSION,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_TAXES,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_TITLE,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_COMPONENT_REFERENCE_NAME,
  SubscriptionLedgerEntryCreate.JSON_PROPERTY_SUBSCRIPTION_METRIC_ID
})
@JsonTypeName("SubscriptionLedgerEntry.Create")

public class SubscriptionLedgerEntryCreate {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_SUBSCRIPTION_VERSION = "subscriptionVersion";
  private Long subscriptionVersion;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private Set<TaxCreate> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_COMPONENT_REFERENCE_NAME = "componentReferenceName";
  private String componentReferenceName;

  public static final String JSON_PROPERTY_SUBSCRIPTION_METRIC_ID = "subscriptionMetricId";
  private Long subscriptionMetricId;

  public SubscriptionLedgerEntryCreate() {
  }

  public SubscriptionLedgerEntryCreate quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items that were consumed.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public SubscriptionLedgerEntryCreate subscriptionVersion(Long subscriptionVersion) {
    
    this.subscriptionVersion = subscriptionVersion;
    return this;
  }

   /**
   * The subscription version that the ledger entry belongs to.
   * @return subscriptionVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSubscriptionVersion() {
    return subscriptionVersion;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionVersion(Long subscriptionVersion) {
    this.subscriptionVersion = subscriptionVersion;
  }

  public SubscriptionLedgerEntryCreate externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public SubscriptionLedgerEntryCreate taxes(Set<TaxCreate> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public SubscriptionLedgerEntryCreate addTaxesItem(TaxCreate taxesItem) {
    if (this.taxes == null) {
      this.taxes = new LinkedHashSet<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * A set of tax lines, each of which specifies a tax applied to the ledger entry.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TaxCreate> getTaxes() {
    return taxes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(Set<TaxCreate> taxes) {
    this.taxes = taxes;
  }

  public SubscriptionLedgerEntryCreate amountIncludingTax(BigDecimal amountIncludingTax) {
    
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * The leger entry&#39;s amount with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }

  public SubscriptionLedgerEntryCreate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title that indicates what the ledger entry is about.
   * @return title
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }

  public SubscriptionLedgerEntryCreate componentReferenceName(String componentReferenceName) {
    
    this.componentReferenceName = componentReferenceName;
    return this;
  }

   /**
   * Get componentReferenceName
   * @return componentReferenceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComponentReferenceName() {
    return componentReferenceName;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentReferenceName(String componentReferenceName) {
    this.componentReferenceName = componentReferenceName;
  }

  public SubscriptionLedgerEntryCreate subscriptionMetricId(Long subscriptionMetricId) {
    
    this.subscriptionMetricId = subscriptionMetricId;
    return this;
  }

   /**
   * Get subscriptionMetricId
   * @return subscriptionMetricId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionMetricId() {
    return subscriptionMetricId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionMetricId(Long subscriptionMetricId) {
    this.subscriptionMetricId = subscriptionMetricId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionLedgerEntryCreate subscriptionLedgerEntryCreate = (SubscriptionLedgerEntryCreate) o;
    return Objects.equals(this.quantity, subscriptionLedgerEntryCreate.quantity) &&
        Objects.equals(this.subscriptionVersion, subscriptionLedgerEntryCreate.subscriptionVersion) &&
        Objects.equals(this.externalId, subscriptionLedgerEntryCreate.externalId) &&
        Objects.equals(this.taxes, subscriptionLedgerEntryCreate.taxes) &&
        Objects.equals(this.amountIncludingTax, subscriptionLedgerEntryCreate.amountIncludingTax) &&
        Objects.equals(this.title, subscriptionLedgerEntryCreate.title) &&
        Objects.equals(this.componentReferenceName, subscriptionLedgerEntryCreate.componentReferenceName) &&
        Objects.equals(this.subscriptionMetricId, subscriptionLedgerEntryCreate.subscriptionMetricId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, subscriptionVersion, externalId, taxes, amountIncludingTax, title, componentReferenceName, subscriptionMetricId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLedgerEntryCreate {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    componentReferenceName: ").append(toIndentedString(componentReferenceName)).append("\n");
    sb.append("    subscriptionMetricId: ").append(toIndentedString(subscriptionMetricId)).append("\n");
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

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionVersion` to the URL query string
    if (getSubscriptionVersion() != null) {
      try {
        joiner.add(String.format("%ssubscriptionVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionVersion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (TaxCreate _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `amountIncludingTax` to the URL query string
    if (getAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%samountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      try {
        joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `componentReferenceName` to the URL query string
    if (getComponentReferenceName() != null) {
      try {
        joiner.add(String.format("%scomponentReferenceName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponentReferenceName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionMetricId` to the URL query string
    if (getSubscriptionMetricId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionMetricId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionMetricId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

