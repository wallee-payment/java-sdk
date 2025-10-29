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
import com.wallee.sdk.model.PersistableCurrencyAmountUpdate;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProductMeteredTierFeeUpdate
 */
@JsonPropertyOrder({
  ProductMeteredTierFeeUpdate.JSON_PROPERTY_START_RANGE,
  ProductMeteredTierFeeUpdate.JSON_PROPERTY_METERED_FEE,
  ProductMeteredTierFeeUpdate.JSON_PROPERTY_FEE,
  ProductMeteredTierFeeUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("ProductMeteredTierFee.Update")

public class ProductMeteredTierFeeUpdate {
  public static final String JSON_PROPERTY_START_RANGE = "startRange";
  private BigDecimal startRange;

  public static final String JSON_PROPERTY_METERED_FEE = "meteredFee";
  private Long meteredFee;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Set<PersistableCurrencyAmountUpdate> fee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public ProductMeteredTierFeeUpdate() {
  }

  public ProductMeteredTierFeeUpdate startRange(BigDecimal startRange) {
    
    this.startRange = startRange;
    return this;
  }

   /**
   * Starting from and including this quantity is contained in the tier.
   * @return startRange
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartRange() {
    return startRange;
  }


  @JsonProperty(JSON_PROPERTY_START_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartRange(BigDecimal startRange) {
    this.startRange = startRange;
  }

  public ProductMeteredTierFeeUpdate meteredFee(Long meteredFee) {
    
    this.meteredFee = meteredFee;
    return this;
  }

   /**
   * The metered fee that this tier belongs to.
   * @return meteredFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METERED_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMeteredFee() {
    return meteredFee;
  }


  @JsonProperty(JSON_PROPERTY_METERED_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeteredFee(Long meteredFee) {
    this.meteredFee = meteredFee;
  }

  public ProductMeteredTierFeeUpdate fee(Set<PersistableCurrencyAmountUpdate> fee) {
    
    this.fee = fee;
    return this;
  }

  public ProductMeteredTierFeeUpdate addFeeItem(PersistableCurrencyAmountUpdate feeItem) {
    if (this.fee == null) {
      this.fee = new LinkedHashSet<>();
    }
    this.fee.add(feeItem);
    return this;
  }

   /**
   * The amount charged to the customer for each consumed unit at the end of a billing cycle.
   * @return fee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmountUpdate> getFee() {
    return fee;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFee(Set<PersistableCurrencyAmountUpdate> fee) {
    this.fee = fee;
  }

  public ProductMeteredTierFeeUpdate version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate = (ProductMeteredTierFeeUpdate) o;
    return Objects.equals(this.startRange, productMeteredTierFeeUpdate.startRange) &&
        Objects.equals(this.meteredFee, productMeteredTierFeeUpdate.meteredFee) &&
        Objects.equals(this.fee, productMeteredTierFeeUpdate.fee) &&
        Objects.equals(this.version, productMeteredTierFeeUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startRange, meteredFee, fee, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredTierFeeUpdate {\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

    // add `startRange` to the URL query string
    if (getStartRange() != null) {
      try {
        joiner.add(String.format("%sstartRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `meteredFee` to the URL query string
    if (getMeteredFee() != null) {
      try {
        joiner.add(String.format("%smeteredFee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMeteredFee()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fee` to the URL query string
    if (getFee() != null) {
      int i = 0;
      for (PersistableCurrencyAmountUpdate _item : getFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sfee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

