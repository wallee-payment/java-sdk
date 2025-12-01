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
import com.wallee.sdk.model.PersistableCurrencyAmount;
import com.wallee.sdk.model.ProductMeteredFee;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProductMeteredTierFee
 */
@JsonPropertyOrder({
  ProductMeteredTierFee.JSON_PROPERTY_START_RANGE,
  ProductMeteredTierFee.JSON_PROPERTY_METERED_FEE,
  ProductMeteredTierFee.JSON_PROPERTY_FEE,
  ProductMeteredTierFee.JSON_PROPERTY_ID,
  ProductMeteredTierFee.JSON_PROPERTY_VERSION
})

public class ProductMeteredTierFee {
  public static final String JSON_PROPERTY_START_RANGE = "startRange";
  @javax.annotation.Nullable
  private BigDecimal startRange;

  public static final String JSON_PROPERTY_METERED_FEE = "meteredFee";
  @javax.annotation.Nullable
  private ProductMeteredFee meteredFee;

  public static final String JSON_PROPERTY_FEE = "fee";
  @javax.annotation.Nullable
  private Set<PersistableCurrencyAmount> fee = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public ProductMeteredTierFee() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ProductMeteredTierFee(
    @JsonProperty(JSON_PROPERTY_START_RANGE) BigDecimal startRange, 
    @JsonProperty(JSON_PROPERTY_FEE) Set<PersistableCurrencyAmount> fee, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.startRange = startRange;
    this.fee = fee;
    this.id = id;
    this.version = version;
  }

  /**
   * Starting from and including this quantity is contained in the tier.
   * @return startRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartRange() {
    return startRange;
  }



  public ProductMeteredTierFee meteredFee(@javax.annotation.Nullable ProductMeteredFee meteredFee) {
    
    this.meteredFee = meteredFee;
    return this;
  }

  /**
   * Get meteredFee
   * @return meteredFee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METERED_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductMeteredFee getMeteredFee() {
    return meteredFee;
  }


  @JsonProperty(JSON_PROPERTY_METERED_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeteredFee(@javax.annotation.Nullable ProductMeteredFee meteredFee) {
    this.meteredFee = meteredFee;
  }

  /**
   * The amount charged to the customer for each consumed unit at the end of a billing cycle.
   * @return fee
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PersistableCurrencyAmount> getFee() {
    return fee;
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
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
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
    ProductMeteredTierFee productMeteredTierFee = (ProductMeteredTierFee) o;
    return Objects.equals(this.startRange, productMeteredTierFee.startRange) &&
        Objects.equals(this.meteredFee, productMeteredTierFee.meteredFee) &&
        Objects.equals(this.fee, productMeteredTierFee.fee) &&
        Objects.equals(this.id, productMeteredTierFee.id) &&
        Objects.equals(this.version, productMeteredTierFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startRange, meteredFee, fee, id, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredTierFee {\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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
      joiner.add(getMeteredFee().toUrlQueryString(prefix + "meteredFee" + suffix));
    }

    // add `fee` to the URL query string
    if (getFee() != null) {
      int i = 0;
      for (PersistableCurrencyAmount _item : getFee()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sfee%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

