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
import com.wallee.sdk.model.ExpressCheckoutSessionState;
import com.wallee.sdk.model.ExpressCheckoutShippingOption;
import com.wallee.sdk.model.ExpressCheckoutWalletType;
import com.wallee.sdk.model.LineItem;
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
 * ExpressCheckoutSession
 */
@JsonPropertyOrder({
  ExpressCheckoutSession.JSON_PROPERTY_LINE_ITEMS,
  ExpressCheckoutSession.JSON_PROPERTY_LINKED_SPACE_ID,
  ExpressCheckoutSession.JSON_PROPERTY_META_DATA,
  ExpressCheckoutSession.JSON_PROPERTY_WALLET_TYPE,
  ExpressCheckoutSession.JSON_PROPERTY_ID,
  ExpressCheckoutSession.JSON_PROPERTY_STATE,
  ExpressCheckoutSession.JSON_PROPERTY_SHIPPING_OPTIONS
})

public class ExpressCheckoutSession {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_WALLET_TYPE = "walletType";
  @javax.annotation.Nullable
  private ExpressCheckoutWalletType walletType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private ExpressCheckoutSessionState state;

  public static final String JSON_PROPERTY_SHIPPING_OPTIONS = "shippingOptions";
  @javax.annotation.Nullable
  private List<ExpressCheckoutShippingOption> shippingOptions = new ArrayList<>();

  public ExpressCheckoutSession() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExpressCheckoutSession(
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_META_DATA) Map<String, String> metaData, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS) List<ExpressCheckoutShippingOption> shippingOptions
  ) {
    this();
    this.lineItems = lineItems;
    this.linkedSpaceId = linkedSpaceId;
    this.metaData = metaData;
    this.id = id;
    this.shippingOptions = shippingOptions;
  }

  /**
   * Get lineItems
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



  /**
   * The spaceId linked to the entity.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * Get metaData
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }



  public ExpressCheckoutSession walletType(@javax.annotation.Nullable ExpressCheckoutWalletType walletType) {
    
    this.walletType = walletType;
    return this;
  }

  /**
   * Get walletType
   * @return walletType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpressCheckoutWalletType getWalletType() {
    return walletType;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalletType(@javax.annotation.Nullable ExpressCheckoutWalletType walletType) {
    this.walletType = walletType;
  }

  /**
   * Id of the entity.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ExpressCheckoutSession state(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpressCheckoutSessionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    this.state = state;
  }

  /**
   * Get shippingOptions
   * @return shippingOptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExpressCheckoutShippingOption> getShippingOptions() {
    return shippingOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutSession expressCheckoutSession = (ExpressCheckoutSession) o;
    return Objects.equals(this.lineItems, expressCheckoutSession.lineItems) &&
        Objects.equals(this.linkedSpaceId, expressCheckoutSession.linkedSpaceId) &&
        Objects.equals(this.metaData, expressCheckoutSession.metaData) &&
        Objects.equals(this.walletType, expressCheckoutSession.walletType) &&
        Objects.equals(this.id, expressCheckoutSession.id) &&
        Objects.equals(this.state, expressCheckoutSession.state) &&
        Objects.equals(this.shippingOptions, expressCheckoutSession.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, linkedSpaceId, metaData, walletType, id, state, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutSession {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `walletType` to the URL query string
    if (getWalletType() != null) {
      joiner.add(getWalletType().toUrlQueryString(prefix + "walletType" + suffix));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingOptions` to the URL query string
    if (getShippingOptions() != null) {
      for (int i = 0; i < getShippingOptions().size(); i++) {
        if (getShippingOptions().get(i) != null) {
          joiner.add(getShippingOptions().get(i).toUrlQueryString(String.format("%sshippingOptions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

