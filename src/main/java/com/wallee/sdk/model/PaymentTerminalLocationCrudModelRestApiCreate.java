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
import com.wallee.sdk.model.PaymentTerminalAddressCreate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminalLocationCrudModelRestApiCreate
 */
@JsonPropertyOrder({
  PaymentTerminalLocationCrudModelRestApiCreate.JSON_PROPERTY_PRODUCTION_MERCHANT_ID,
  PaymentTerminalLocationCrudModelRestApiCreate.JSON_PROPERTY_ADDRESS,
  PaymentTerminalLocationCrudModelRestApiCreate.JSON_PROPERTY_NAME,
  PaymentTerminalLocationCrudModelRestApiCreate.JSON_PROPERTY_EXTERNAL_ID,
  PaymentTerminalLocationCrudModelRestApiCreate.JSON_PROPERTY_CONTACT_ADDRESS
})
@JsonTypeName("PaymentTerminalLocationCrudModel.RestApiCreate")

public class PaymentTerminalLocationCrudModelRestApiCreate {
  public static final String JSON_PROPERTY_PRODUCTION_MERCHANT_ID = "productionMerchantId";
  @javax.annotation.Nullable
  private String productionMerchantId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nonnull
  private PaymentTerminalAddressCreate address;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nonnull
  private String externalId;

  public static final String JSON_PROPERTY_CONTACT_ADDRESS = "contactAddress";
  @javax.annotation.Nullable
  private PaymentTerminalAddressCreate contactAddress;

  public PaymentTerminalLocationCrudModelRestApiCreate() {
  }

  public PaymentTerminalLocationCrudModelRestApiCreate productionMerchantId(@javax.annotation.Nullable String productionMerchantId) {
    
    this.productionMerchantId = productionMerchantId;
    return this;
  }

  /**
   * The production merchant identifier assigned to the location.
   * @return productionMerchantId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTION_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductionMerchantId() {
    return productionMerchantId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductionMerchantId(@javax.annotation.Nullable String productionMerchantId) {
    this.productionMerchantId = productionMerchantId;
  }

  public PaymentTerminalLocationCrudModelRestApiCreate address(@javax.annotation.Nonnull PaymentTerminalAddressCreate address) {
    
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentTerminalAddressCreate getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(@javax.annotation.Nonnull PaymentTerminalAddressCreate address) {
    this.address = address;
  }

  public PaymentTerminalLocationCrudModelRestApiCreate name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the payment terminal location.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public PaymentTerminalLocationCrudModelRestApiCreate externalId(@javax.annotation.Nonnull String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }

  public PaymentTerminalLocationCrudModelRestApiCreate contactAddress(@javax.annotation.Nullable PaymentTerminalAddressCreate contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalAddressCreate getContactAddress() {
    return contactAddress;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactAddress(@javax.annotation.Nullable PaymentTerminalAddressCreate contactAddress) {
    this.contactAddress = contactAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalLocationCrudModelRestApiCreate paymentTerminalLocationCrudModelRestApiCreate = (PaymentTerminalLocationCrudModelRestApiCreate) o;
    return Objects.equals(this.productionMerchantId, paymentTerminalLocationCrudModelRestApiCreate.productionMerchantId) &&
        Objects.equals(this.address, paymentTerminalLocationCrudModelRestApiCreate.address) &&
        Objects.equals(this.name, paymentTerminalLocationCrudModelRestApiCreate.name) &&
        Objects.equals(this.externalId, paymentTerminalLocationCrudModelRestApiCreate.externalId) &&
        Objects.equals(this.contactAddress, paymentTerminalLocationCrudModelRestApiCreate.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionMerchantId, address, name, externalId, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocationCrudModelRestApiCreate {\n");
    sb.append("    productionMerchantId: ").append(toIndentedString(productionMerchantId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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

    // add `productionMerchantId` to the URL query string
    if (getProductionMerchantId() != null) {
      try {
        joiner.add(String.format("%sproductionMerchantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductionMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `contactAddress` to the URL query string
    if (getContactAddress() != null) {
      joiner.add(getContactAddress().toUrlQueryString(prefix + "contactAddress" + suffix));
    }

    return joiner.toString();
  }

}

