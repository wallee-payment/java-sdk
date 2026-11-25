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
import com.wallee.sdk.model.Tax;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExpressCheckoutShippingOption
 */
@JsonPropertyOrder({
  ExpressCheckoutShippingOption.JSON_PROPERTY_DESCRIPTION,
  ExpressCheckoutShippingOption.JSON_PROPERTY_TAXES,
  ExpressCheckoutShippingOption.JSON_PROPERTY_CURRENCY,
  ExpressCheckoutShippingOption.JSON_PROPERTY_ID,
  ExpressCheckoutShippingOption.JSON_PROPERTY_LABEL,
  ExpressCheckoutShippingOption.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  ExpressCheckoutShippingOption.JSON_PROPERTY_SELECTED
})

public class ExpressCheckoutShippingOption {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  @javax.annotation.Nullable
  private Set<Tax> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  @javax.annotation.Nullable
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_SELECTED = "selected";
  @javax.annotation.Nullable
  private Boolean selected;

  public ExpressCheckoutShippingOption() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExpressCheckoutShippingOption(
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_TAXES) Set<Tax> taxes, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_LABEL) String label, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX) BigDecimal amountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_SELECTED) Boolean selected
  ) {
    this();
    this.description = description;
    this.taxes = taxes;
    this.currency = currency;
    this.id = id;
    this.label = label;
    this.amountIncludingTax = amountIncludingTax;
    this.selected = selected;
  }

  /**
   * Description of the option
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }



  /**
   * A set of tax lines, each of which specifies a tax applied to this shipping option.
   * @return taxes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Tax> getTaxes() {
    return taxes;
  }



  /**
   * Currency code (ISO-4217) of this shipping option.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



  /**
   * Identifier of the option.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }



  /**
   * Label of the option.
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }



  /**
   * Total cost of this shipping option, including taxes.
   * @return amountIncludingTax
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }



  /**
   * Whether it was the option selected by the customer.
   * @return selected
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelected() {
    return selected;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutShippingOption expressCheckoutShippingOption = (ExpressCheckoutShippingOption) o;
    return Objects.equals(this.description, expressCheckoutShippingOption.description) &&
        Objects.equals(this.taxes, expressCheckoutShippingOption.taxes) &&
        Objects.equals(this.currency, expressCheckoutShippingOption.currency) &&
        Objects.equals(this.id, expressCheckoutShippingOption.id) &&
        Objects.equals(this.label, expressCheckoutShippingOption.label) &&
        Objects.equals(this.amountIncludingTax, expressCheckoutShippingOption.amountIncludingTax) &&
        Objects.equals(this.selected, expressCheckoutShippingOption.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, taxes, currency, id, label, amountIncludingTax, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutShippingOption {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (Tax _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `label` to the URL query string
    if (getLabel() != null) {
      try {
        joiner.add(String.format("%slabel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `selected` to the URL query string
    if (getSelected() != null) {
      try {
        joiner.add(String.format("%sselected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

