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
import com.wallee.sdk.model.SubscriptionProduct;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionProductRetirement
 */
@JsonPropertyOrder({
  SubscriptionProductRetirement.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionProductRetirement.JSON_PROPERTY_RESPECT_TERMINATION_PERIODS,
  SubscriptionProductRetirement.JSON_PROPERTY_PRODUCT,
  SubscriptionProductRetirement.JSON_PROPERTY_ID,
  SubscriptionProductRetirement.JSON_PROPERTY_CREATED_ON,
  SubscriptionProductRetirement.JSON_PROPERTY_VERSION,
  SubscriptionProductRetirement.JSON_PROPERTY_TARGET_PRODUCT
})

public class SubscriptionProductRetirement {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_RESPECT_TERMINATION_PERIODS = "respectTerminationPeriods";
  private Boolean respectTerminationPeriods;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private SubscriptionProduct product;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TARGET_PRODUCT = "targetProduct";
  private SubscriptionProduct targetProduct;

  public SubscriptionProductRetirement() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionProductRetirement(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIODS) Boolean respectTerminationPeriods, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.respectTerminationPeriods = respectTerminationPeriods;
    this.id = id;
    this.createdOn = createdOn;
    this.version = version;
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
   * Whether the subscriptions&#39; termination periods should be respected.
   * @return respectTerminationPeriods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRespectTerminationPeriods() {
    return respectTerminationPeriods;
  }



  public SubscriptionProductRetirement product(SubscriptionProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProduct getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(SubscriptionProduct product) {
    this.product = product;
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



  public SubscriptionProductRetirement targetProduct(SubscriptionProduct targetProduct) {
    
    this.targetProduct = targetProduct;
    return this;
  }

   /**
   * Get targetProduct
   * @return targetProduct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProduct getTargetProduct() {
    return targetProduct;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetProduct(SubscriptionProduct targetProduct) {
    this.targetProduct = targetProduct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductRetirement subscriptionProductRetirement = (SubscriptionProductRetirement) o;
    return Objects.equals(this.linkedSpaceId, subscriptionProductRetirement.linkedSpaceId) &&
        Objects.equals(this.respectTerminationPeriods, subscriptionProductRetirement.respectTerminationPeriods) &&
        Objects.equals(this.product, subscriptionProductRetirement.product) &&
        Objects.equals(this.id, subscriptionProductRetirement.id) &&
        Objects.equals(this.createdOn, subscriptionProductRetirement.createdOn) &&
        Objects.equals(this.version, subscriptionProductRetirement.version) &&
        Objects.equals(this.targetProduct, subscriptionProductRetirement.targetProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, respectTerminationPeriods, product, id, createdOn, version, targetProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductRetirement {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    respectTerminationPeriods: ").append(toIndentedString(respectTerminationPeriods)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

    // add `respectTerminationPeriods` to the URL query string
    if (getRespectTerminationPeriods() != null) {
      try {
        joiner.add(String.format("%srespectTerminationPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRespectTerminationPeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `product` to the URL query string
    if (getProduct() != null) {
      joiner.add(getProduct().toUrlQueryString(prefix + "product" + suffix));
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

    // add `targetProduct` to the URL query string
    if (getTargetProduct() != null) {
      joiner.add(getTargetProduct().toUrlQueryString(prefix + "targetProduct" + suffix));
    }

    return joiner.toString();
  }

}

