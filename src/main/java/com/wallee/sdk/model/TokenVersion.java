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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentInformationHash;
import com.wallee.sdk.model.PaymentMethod;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TokenVersionRetryStrategy;
import com.wallee.sdk.model.TokenVersionState;
import com.wallee.sdk.model.TokenVersionType;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TokenVersion
 */
@JsonPropertyOrder({
  TokenVersion.JSON_PROPERTY_PAYMENT_INFORMATION_HASHES,
  TokenVersion.JSON_PROPERTY_LANGUAGE,
  TokenVersion.JSON_PROPERTY_TYPE,
  TokenVersion.JSON_PROPERTY_CREATED_ON,
  TokenVersion.JSON_PROPERTY_RETRY_IN,
  TokenVersion.JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION,
  TokenVersion.JSON_PROPERTY_OBSOLETED_ON,
  TokenVersion.JSON_PROPERTY_EXPIRES_ON,
  TokenVersion.JSON_PROPERTY_ICON_URL,
  TokenVersion.JSON_PROPERTY_ID,
  TokenVersion.JSON_PROPERTY_STATE,
  TokenVersion.JSON_PROPERTY_PROCESSOR_TOKEN,
  TokenVersion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  TokenVersion.JSON_PROPERTY_PAYMENT_METHOD_BRAND,
  TokenVersion.JSON_PROPERTY_VERSION,
  TokenVersion.JSON_PROPERTY_LAST_RETRIED_ON,
  TokenVersion.JSON_PROPERTY_LABELS,
  TokenVersion.JSON_PROPERTY_TOKEN,
  TokenVersion.JSON_PROPERTY_LINKED_SPACE_ID,
  TokenVersion.JSON_PROPERTY_ENVIRONMENT,
  TokenVersion.JSON_PROPERTY_ACTIVATED_ON,
  TokenVersion.JSON_PROPERTY_NAME,
  TokenVersion.JSON_PROPERTY_PAYMENT_METHOD,
  TokenVersion.JSON_PROPERTY_SHIPPING_ADDRESS,
  TokenVersion.JSON_PROPERTY_BILLING_ADDRESS,
  TokenVersion.JSON_PROPERTY_RETRY_STRATEGY
})

public class TokenVersion {
  public static final String JSON_PROPERTY_PAYMENT_INFORMATION_HASHES = "paymentInformationHashes";
  @javax.annotation.Nullable
  private Set<PaymentInformationHash> paymentInformationHashes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private TokenVersionType type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_RETRY_IN = "retryIn";
  @javax.annotation.Nullable
  private String retryIn;

  public static final String JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION = "paymentConnectorConfiguration";
  @javax.annotation.Nullable
  private PaymentConnectorConfiguration paymentConnectorConfiguration;

  public static final String JSON_PROPERTY_OBSOLETED_ON = "obsoletedOn";
  @javax.annotation.Nullable
  private OffsetDateTime obsoletedOn;

  public static final String JSON_PROPERTY_EXPIRES_ON = "expiresOn";
  @javax.annotation.Nullable
  private OffsetDateTime expiresOn;

  public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
  @javax.annotation.Nullable
  private String iconUrl;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private TokenVersionState state;

  public static final String JSON_PROPERTY_PROCESSOR_TOKEN = "processorToken";
  @javax.annotation.Nullable
  private String processorToken;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_BRAND = "paymentMethodBrand";
  @javax.annotation.Nullable
  private PaymentMethodBrand paymentMethodBrand;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LAST_RETRIED_ON = "lastRetriedOn";
  @javax.annotation.Nullable
  private OffsetDateTime lastRetriedOn;

  public static final String JSON_PROPERTY_LABELS = "labels";
  @javax.annotation.Nullable
  private Set<Label> labels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private Token token;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private ChargeAttemptEnvironment environment;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  @javax.annotation.Nullable
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  @javax.annotation.Nullable
  private Address shippingAddress;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  @javax.annotation.Nullable
  private Address billingAddress;

  public static final String JSON_PROPERTY_RETRY_STRATEGY = "retryStrategy";
  @javax.annotation.Nullable
  private TokenVersionRetryStrategy retryStrategy;

  public TokenVersion() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TokenVersion(
    @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_HASHES) Set<PaymentInformationHash> paymentInformationHashes, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_RETRY_IN) String retryIn, 
    @JsonProperty(JSON_PROPERTY_OBSOLETED_ON) OffsetDateTime obsoletedOn, 
    @JsonProperty(JSON_PROPERTY_EXPIRES_ON) OffsetDateTime expiresOn, 
    @JsonProperty(JSON_PROPERTY_ICON_URL) String iconUrl, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PROCESSOR_TOKEN) String processorToken, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LAST_RETRIED_ON) OffsetDateTime lastRetriedOn, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
    this();
    this.paymentInformationHashes = paymentInformationHashes;
    this.language = language;
    this.createdOn = createdOn;
    this.retryIn = retryIn;
    this.obsoletedOn = obsoletedOn;
    this.expiresOn = expiresOn;
    this.iconUrl = iconUrl;
    this.id = id;
    this.processorToken = processorToken;
    this.plannedPurgeDate = plannedPurgeDate;
    this.version = version;
    this.lastRetriedOn = lastRetriedOn;
    this.labels = labels;
    this.linkedSpaceId = linkedSpaceId;
    this.activatedOn = activatedOn;
    this.name = name;
  }

  /**
   * The hashed payment information that the token version represents.
   * @return paymentInformationHashes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PaymentInformationHash> getPaymentInformationHashes() {
    return paymentInformationHashes;
  }



  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  public TokenVersion type(@javax.annotation.Nullable TokenVersionType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenVersionType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable TokenVersionType type) {
    this.type = type;
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



  /**
   * Retry interval when the strategy advises retrying later.
   * @return retryIn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetryIn() {
    return retryIn;
  }



  public TokenVersion paymentConnectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration paymentConnectorConfiguration) {
    
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
    return this;
  }

  /**
   * Get paymentConnectorConfiguration
   * @return paymentConnectorConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentConnectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration paymentConnectorConfiguration) {
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
  }

  /**
   * The date and time when the token version was marked obsolete.
   * @return obsoletedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSOLETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
  }



  /**
   * The date and time when the token version is set to expire, after which it will be marked as obsolete.
   * @return expiresOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }



  /**
   * The URL to the token&#39;s icon displayed to the customer.
   * @return iconUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconUrl() {
    return iconUrl;
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



  public TokenVersion state(@javax.annotation.Nullable TokenVersionState state) {
    
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

  public TokenVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable TokenVersionState state) {
    this.state = state;
  }

  /**
   * The token name as specified by the processor.
   * @return processorToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessorToken() {
    return processorToken;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  public TokenVersion paymentMethodBrand(@javax.annotation.Nullable PaymentMethodBrand paymentMethodBrand) {
    
    this.paymentMethodBrand = paymentMethodBrand;
    return this;
  }

  /**
   * Get paymentMethodBrand
   * @return paymentMethodBrand
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodBrand getPaymentMethodBrand() {
    return paymentMethodBrand;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodBrand(@javax.annotation.Nullable PaymentMethodBrand paymentMethodBrand) {
    this.paymentMethodBrand = paymentMethodBrand;
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



  /**
   * The date and time when the system last attempted a retry for this token version.
   * @return lastRetriedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RETRIED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastRetriedOn() {
    return lastRetriedOn;
  }



  /**
   * The labels providing additional information about the object.
   * @return labels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
  }



  public TokenVersion token(@javax.annotation.Nullable Token token) {
    
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Token getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@javax.annotation.Nullable Token token) {
    this.token = token;
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



  public TokenVersion environment(@javax.annotation.Nullable ChargeAttemptEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(@javax.annotation.Nullable ChargeAttemptEnvironment environment) {
    this.environment = environment;
  }

  /**
   * The date and time when the token version was activated.
   * @return activatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



  /**
   * The name used to identify the token.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  public TokenVersion paymentMethod(@javax.annotation.Nullable PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(@javax.annotation.Nullable PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public TokenVersion shippingAddress(@javax.annotation.Nullable Address shippingAddress) {
    
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

  public Address getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(@javax.annotation.Nullable Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public TokenVersion billingAddress(@javax.annotation.Nullable Address billingAddress) {
    
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

  public Address getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(@javax.annotation.Nullable Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public TokenVersion retryStrategy(@javax.annotation.Nullable TokenVersionRetryStrategy retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenVersionRetryStrategy getRetryStrategy() {
    return retryStrategy;
  }


  @JsonProperty(JSON_PROPERTY_RETRY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetryStrategy(@javax.annotation.Nullable TokenVersionRetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenVersion tokenVersion = (TokenVersion) o;
    return Objects.equals(this.paymentInformationHashes, tokenVersion.paymentInformationHashes) &&
        Objects.equals(this.language, tokenVersion.language) &&
        Objects.equals(this.type, tokenVersion.type) &&
        Objects.equals(this.createdOn, tokenVersion.createdOn) &&
        Objects.equals(this.retryIn, tokenVersion.retryIn) &&
        Objects.equals(this.paymentConnectorConfiguration, tokenVersion.paymentConnectorConfiguration) &&
        Objects.equals(this.obsoletedOn, tokenVersion.obsoletedOn) &&
        Objects.equals(this.expiresOn, tokenVersion.expiresOn) &&
        Objects.equals(this.iconUrl, tokenVersion.iconUrl) &&
        Objects.equals(this.id, tokenVersion.id) &&
        Objects.equals(this.state, tokenVersion.state) &&
        Objects.equals(this.processorToken, tokenVersion.processorToken) &&
        Objects.equals(this.plannedPurgeDate, tokenVersion.plannedPurgeDate) &&
        Objects.equals(this.paymentMethodBrand, tokenVersion.paymentMethodBrand) &&
        Objects.equals(this.version, tokenVersion.version) &&
        Objects.equals(this.lastRetriedOn, tokenVersion.lastRetriedOn) &&
        Objects.equals(this.labels, tokenVersion.labels) &&
        Objects.equals(this.token, tokenVersion.token) &&
        Objects.equals(this.linkedSpaceId, tokenVersion.linkedSpaceId) &&
        Objects.equals(this.environment, tokenVersion.environment) &&
        Objects.equals(this.activatedOn, tokenVersion.activatedOn) &&
        Objects.equals(this.name, tokenVersion.name) &&
        Objects.equals(this.paymentMethod, tokenVersion.paymentMethod) &&
        Objects.equals(this.shippingAddress, tokenVersion.shippingAddress) &&
        Objects.equals(this.billingAddress, tokenVersion.billingAddress) &&
        Objects.equals(this.retryStrategy, tokenVersion.retryStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInformationHashes, language, type, createdOn, retryIn, paymentConnectorConfiguration, obsoletedOn, expiresOn, iconUrl, id, state, processorToken, plannedPurgeDate, paymentMethodBrand, version, lastRetriedOn, labels, token, linkedSpaceId, environment, activatedOn, name, paymentMethod, shippingAddress, billingAddress, retryStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenVersion {\n");
    sb.append("    paymentInformationHashes: ").append(toIndentedString(paymentInformationHashes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    retryIn: ").append(toIndentedString(retryIn)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastRetriedOn: ").append(toIndentedString(lastRetriedOn)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
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

    // add `paymentInformationHashes` to the URL query string
    if (getPaymentInformationHashes() != null) {
      int i = 0;
      for (PaymentInformationHash _item : getPaymentInformationHashes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%spaymentInformationHashes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(getType().toUrlQueryString(prefix + "type" + suffix));
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

    // add `retryIn` to the URL query string
    if (getRetryIn() != null) {
      try {
        joiner.add(String.format("%sretryIn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetryIn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentConnectorConfiguration` to the URL query string
    if (getPaymentConnectorConfiguration() != null) {
      joiner.add(getPaymentConnectorConfiguration().toUrlQueryString(prefix + "paymentConnectorConfiguration" + suffix));
    }

    // add `obsoletedOn` to the URL query string
    if (getObsoletedOn() != null) {
      try {
        joiner.add(String.format("%sobsoletedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObsoletedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expiresOn` to the URL query string
    if (getExpiresOn() != null) {
      try {
        joiner.add(String.format("%sexpiresOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `iconUrl` to the URL query string
    if (getIconUrl() != null) {
      try {
        joiner.add(String.format("%siconUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIconUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processorToken` to the URL query string
    if (getProcessorToken() != null) {
      try {
        joiner.add(String.format("%sprocessorToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessorToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentMethodBrand` to the URL query string
    if (getPaymentMethodBrand() != null) {
      joiner.add(getPaymentMethodBrand().toUrlQueryString(prefix + "paymentMethodBrand" + suffix));
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

    // add `lastRetriedOn` to the URL query string
    if (getLastRetriedOn() != null) {
      try {
        joiner.add(String.format("%slastRetriedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastRetriedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (Label _item : getLabels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slabels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(getToken().toUrlQueryString(prefix + "token" + suffix));
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

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activatedOn` to the URL query string
    if (getActivatedOn() != null) {
      try {
        joiner.add(String.format("%sactivatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(getPaymentMethod().toUrlQueryString(prefix + "paymentMethod" + suffix));
    }

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
    }

    // add `retryStrategy` to the URL query string
    if (getRetryStrategy() != null) {
      try {
        joiner.add(String.format("%sretryStrategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetryStrategy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

