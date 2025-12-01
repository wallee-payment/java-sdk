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
import com.wallee.sdk.model.ChargeFlowLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChargeFlowLevelPaymentLink
 */
@JsonPropertyOrder({
  ChargeFlowLevelPaymentLink.JSON_PROPERTY_LINKED_SPACE_ID,
  ChargeFlowLevelPaymentLink.JSON_PROPERTY_CHARGE_FLOW_LEVEL,
  ChargeFlowLevelPaymentLink.JSON_PROPERTY_ID,
  ChargeFlowLevelPaymentLink.JSON_PROPERTY_PAYMENT_LINK
})

public class ChargeFlowLevelPaymentLink {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CHARGE_FLOW_LEVEL = "chargeFlowLevel";
  @javax.annotation.Nullable
  private ChargeFlowLevel chargeFlowLevel;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_PAYMENT_LINK = "paymentLink";
  @javax.annotation.Nullable
  private String paymentLink;

  public ChargeFlowLevelPaymentLink() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ChargeFlowLevelPaymentLink(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_LINK) String paymentLink
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.id = id;
    this.paymentLink = paymentLink;
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



  public ChargeFlowLevelPaymentLink chargeFlowLevel(@javax.annotation.Nullable ChargeFlowLevel chargeFlowLevel) {
    
    this.chargeFlowLevel = chargeFlowLevel;
    return this;
  }

  /**
   * Get chargeFlowLevel
   * @return chargeFlowLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_FLOW_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeFlowLevel getChargeFlowLevel() {
    return chargeFlowLevel;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE_FLOW_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeFlowLevel(@javax.annotation.Nullable ChargeFlowLevel chargeFlowLevel) {
    this.chargeFlowLevel = chargeFlowLevel;
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
   * The URL provided to the customer for entering their payment details and completing the transaction.
   * @return paymentLink
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentLink() {
    return paymentLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFlowLevelPaymentLink chargeFlowLevelPaymentLink = (ChargeFlowLevelPaymentLink) o;
    return Objects.equals(this.linkedSpaceId, chargeFlowLevelPaymentLink.linkedSpaceId) &&
        Objects.equals(this.chargeFlowLevel, chargeFlowLevelPaymentLink.chargeFlowLevel) &&
        Objects.equals(this.id, chargeFlowLevelPaymentLink.id) &&
        Objects.equals(this.paymentLink, chargeFlowLevelPaymentLink.paymentLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, chargeFlowLevel, id, paymentLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevelPaymentLink {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    chargeFlowLevel: ").append(toIndentedString(chargeFlowLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
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

    // add `chargeFlowLevel` to the URL query string
    if (getChargeFlowLevel() != null) {
      joiner.add(getChargeFlowLevel().toUrlQueryString(prefix + "chargeFlowLevel" + suffix));
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

    // add `paymentLink` to the URL query string
    if (getPaymentLink() != null) {
      try {
        joiner.add(String.format("%spaymentLink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

