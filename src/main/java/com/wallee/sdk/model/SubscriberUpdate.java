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
import com.wallee.sdk.model.AddressCreate;
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
 * A subscriber represents everyone who is subscribed to a product.
 */
@JsonPropertyOrder({
  SubscriberUpdate.JSON_PROPERTY_REFERENCE,
  SubscriberUpdate.JSON_PROPERTY_ADDITIONAL_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  SubscriberUpdate.JSON_PROPERTY_META_DATA,
  SubscriberUpdate.JSON_PROPERTY_EMAIL_ADDRESS,
  SubscriberUpdate.JSON_PROPERTY_DISALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  SubscriberUpdate.JSON_PROPERTY_DESCRIPTION,
  SubscriberUpdate.JSON_PROPERTY_SHIPPING_ADDRESS,
  SubscriberUpdate.JSON_PROPERTY_LANGUAGE,
  SubscriberUpdate.JSON_PROPERTY_BILLING_ADDRESS,
  SubscriberUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("Subscriber.Update")

public class SubscriberUpdate {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private String reference;

  public static final String JSON_PROPERTY_ADDITIONAL_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "additionalAllowedPaymentMethodConfigurations";
  @javax.annotation.Nullable
  private List<Long> additionalAllowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  @javax.annotation.Nullable
  private String emailAddress;

  public static final String JSON_PROPERTY_DISALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "disallowedPaymentMethodConfigurations";
  @javax.annotation.Nullable
  private List<Long> disallowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  @javax.annotation.Nullable
  private AddressCreate shippingAddress;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  @javax.annotation.Nullable
  private AddressCreate billingAddress;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public SubscriberUpdate() {
  }

  public SubscriberUpdate reference(@javax.annotation.Nullable String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the subscriber.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(@javax.annotation.Nullable String reference) {
    this.reference = reference;
  }

  public SubscriberUpdate additionalAllowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> additionalAllowedPaymentMethodConfigurations) {
    
    this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
    return this;
  }

  public SubscriberUpdate addAdditionalAllowedPaymentMethodConfigurationsItem(Long additionalAllowedPaymentMethodConfigurationsItem) {
    if (this.additionalAllowedPaymentMethodConfigurations == null) {
      this.additionalAllowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.additionalAllowedPaymentMethodConfigurations.add(additionalAllowedPaymentMethodConfigurationsItem);
    return this;
  }

  /**
   * Allow the subscriber to use these payment methods even if subscription products do not accept them.
   * @return additionalAllowedPaymentMethodConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
    return additionalAllowedPaymentMethodConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalAllowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> additionalAllowedPaymentMethodConfigurations) {
    this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
  }

  public SubscriberUpdate metaData(@javax.annotation.Nullable Map<String, String> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public SubscriberUpdate putMetaDataItem(String key, String metaDataItem) {
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

  public SubscriberUpdate emailAddress(@javax.annotation.Nullable String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address that is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public SubscriberUpdate disallowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> disallowedPaymentMethodConfigurations) {
    
    this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
    return this;
  }

  public SubscriberUpdate addDisallowedPaymentMethodConfigurationsItem(Long disallowedPaymentMethodConfigurationsItem) {
    if (this.disallowedPaymentMethodConfigurations == null) {
      this.disallowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.disallowedPaymentMethodConfigurations.add(disallowedPaymentMethodConfigurationsItem);
    return this;
  }

  /**
   * Prevent the subscriber from using these payment methods even if subscription products do accept them.
   * @return disallowedPaymentMethodConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getDisallowedPaymentMethodConfigurations() {
    return disallowedPaymentMethodConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_DISALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisallowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> disallowedPaymentMethodConfigurations) {
    this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
  }

  public SubscriberUpdate description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The description used to identify the subscriber.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public SubscriberUpdate shippingAddress(@javax.annotation.Nullable AddressCreate shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressCreate getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(@javax.annotation.Nullable AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public SubscriberUpdate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
  }

  /**
   * The language that is used when communicating with the subscriber via emails and documents.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  public SubscriberUpdate billingAddress(@javax.annotation.Nullable AddressCreate billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressCreate getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(@javax.annotation.Nullable AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  public SubscriberUpdate version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
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
    SubscriberUpdate subscriberUpdate = (SubscriberUpdate) o;
    return Objects.equals(this.reference, subscriberUpdate.reference) &&
        Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberUpdate.additionalAllowedPaymentMethodConfigurations) &&
        Objects.equals(this.metaData, subscriberUpdate.metaData) &&
        Objects.equals(this.emailAddress, subscriberUpdate.emailAddress) &&
        Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberUpdate.disallowedPaymentMethodConfigurations) &&
        Objects.equals(this.description, subscriberUpdate.description) &&
        Objects.equals(this.shippingAddress, subscriberUpdate.shippingAddress) &&
        Objects.equals(this.language, subscriberUpdate.language) &&
        Objects.equals(this.billingAddress, subscriberUpdate.billingAddress) &&
        Objects.equals(this.version, subscriberUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, additionalAllowedPaymentMethodConfigurations, metaData, emailAddress, disallowedPaymentMethodConfigurations, description, shippingAddress, language, billingAddress, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberUpdate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `additionalAllowedPaymentMethodConfigurations` to the URL query string
    if (getAdditionalAllowedPaymentMethodConfigurations() != null) {
      for (int i = 0; i < getAdditionalAllowedPaymentMethodConfigurations().size(); i++) {
        try {
          joiner.add(String.format("%sadditionalAllowedPaymentMethodConfigurations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAdditionalAllowedPaymentMethodConfigurations().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
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

    // add `emailAddress` to the URL query string
    if (getEmailAddress() != null) {
      try {
        joiner.add(String.format("%semailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `disallowedPaymentMethodConfigurations` to the URL query string
    if (getDisallowedPaymentMethodConfigurations() != null) {
      for (int i = 0; i < getDisallowedPaymentMethodConfigurations().size(); i++) {
        try {
          joiner.add(String.format("%sdisallowedPaymentMethodConfigurations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getDisallowedPaymentMethodConfigurations().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
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

