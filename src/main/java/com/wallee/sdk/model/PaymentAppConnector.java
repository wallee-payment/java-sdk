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
import com.wallee.sdk.model.PaymentAppCompletionConfiguration;
import com.wallee.sdk.model.PaymentAppConnectorState;
import com.wallee.sdk.model.PaymentAppProcessor;
import com.wallee.sdk.model.PaymentAppRefundConfiguration;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentAppConnector
 */
@JsonPropertyOrder({
  PaymentAppConnector.JSON_PROPERTY_PAYMENT_PAGE_ENDPOINT,
  PaymentAppConnector.JSON_PROPERTY_EXTERNAL_ID,
  PaymentAppConnector.JSON_PROPERTY_UPDATED_ON,
  PaymentAppConnector.JSON_PROPERTY_COMPLETION_CONFIGURATION,
  PaymentAppConnector.JSON_PROPERTY_CREATED_ON,
  PaymentAppConnector.JSON_PROPERTY_PROCESSOR,
  PaymentAppConnector.JSON_PROPERTY_VERSION,
  PaymentAppConnector.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentAppConnector.JSON_PROPERTY_CONNECTOR_CONFIGURATION,
  PaymentAppConnector.JSON_PROPERTY_AUTHORIZATION_TIMEOUT,
  PaymentAppConnector.JSON_PROPERTY_NAME,
  PaymentAppConnector.JSON_PROPERTY_ID,
  PaymentAppConnector.JSON_PROPERTY_STATE,
  PaymentAppConnector.JSON_PROPERTY_REFUND_CONFIGURATION
})

public class PaymentAppConnector {
  public static final String JSON_PROPERTY_PAYMENT_PAGE_ENDPOINT = "paymentPageEndpoint";
  @javax.annotation.Nullable
  private String paymentPageEndpoint;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_UPDATED_ON = "updatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime updatedOn;

  public static final String JSON_PROPERTY_COMPLETION_CONFIGURATION = "completionConfiguration";
  @javax.annotation.Nullable
  private PaymentAppCompletionConfiguration completionConfiguration;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_PROCESSOR = "processor";
  @javax.annotation.Nullable
  private PaymentAppProcessor processor;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CONNECTOR_CONFIGURATION = "connectorConfiguration";
  @javax.annotation.Nullable
  private PaymentConnectorConfiguration connectorConfiguration;

  public static final String JSON_PROPERTY_AUTHORIZATION_TIMEOUT = "authorizationTimeout";
  @javax.annotation.Nullable
  private String authorizationTimeout;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private PaymentAppConnectorState state;

  public static final String JSON_PROPERTY_REFUND_CONFIGURATION = "refundConfiguration";
  @javax.annotation.Nullable
  private PaymentAppRefundConfiguration refundConfiguration;

  public PaymentAppConnector() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentAppConnector(
    @JsonProperty(JSON_PROPERTY_PAYMENT_PAGE_ENDPOINT) String paymentPageEndpoint, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_UPDATED_ON) OffsetDateTime updatedOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TIMEOUT) String authorizationTimeout, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.paymentPageEndpoint = paymentPageEndpoint;
    this.externalId = externalId;
    this.updatedOn = updatedOn;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.authorizationTimeout = authorizationTimeout;
    this.name = name;
    this.id = id;
  }

  /**
   * The URL where the user is redirected to process a payment. This endpoint is provided by the external service provider.
   * @return paymentPageEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PAGE_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentPageEndpoint() {
    return paymentPageEndpoint;
  }



  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



  /**
   * The date and time when the connector was last updated.
   * @return updatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }



  public PaymentAppConnector completionConfiguration(@javax.annotation.Nullable PaymentAppCompletionConfiguration completionConfiguration) {
    
    this.completionConfiguration = completionConfiguration;
    return this;
  }

  /**
   * Get completionConfiguration
   * @return completionConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAppCompletionConfiguration getCompletionConfiguration() {
    return completionConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionConfiguration(@javax.annotation.Nullable PaymentAppCompletionConfiguration completionConfiguration) {
    this.completionConfiguration = completionConfiguration;
  }

  /**
   * The date and time when the connector was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public PaymentAppConnector processor(@javax.annotation.Nullable PaymentAppProcessor processor) {
    
    this.processor = processor;
    return this;
  }

  /**
   * Get processor
   * @return processor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAppProcessor getProcessor() {
    return processor;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessor(@javax.annotation.Nullable PaymentAppProcessor processor) {
    this.processor = processor;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public PaymentAppConnector connectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration connectorConfiguration) {
    
    this.connectorConfiguration = connectorConfiguration;
    return this;
  }

  /**
   * Get connectorConfiguration
   * @return connectorConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorConfiguration(@javax.annotation.Nullable PaymentConnectorConfiguration connectorConfiguration) {
    this.connectorConfiguration = connectorConfiguration;
  }

  /**
   * The duration within which the authorization process for a payment should complete.
   * @return authorizationTimeout
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationTimeout() {
    return authorizationTimeout;
  }



  /**
   * The name used to identify the connector.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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



  public PaymentAppConnector state(@javax.annotation.Nullable PaymentAppConnectorState state) {
    
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

  public PaymentAppConnectorState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable PaymentAppConnectorState state) {
    this.state = state;
  }

  public PaymentAppConnector refundConfiguration(@javax.annotation.Nullable PaymentAppRefundConfiguration refundConfiguration) {
    
    this.refundConfiguration = refundConfiguration;
    return this;
  }

  /**
   * Get refundConfiguration
   * @return refundConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAppRefundConfiguration getRefundConfiguration() {
    return refundConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundConfiguration(@javax.annotation.Nullable PaymentAppRefundConfiguration refundConfiguration) {
    this.refundConfiguration = refundConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppConnector paymentAppConnector = (PaymentAppConnector) o;
    return Objects.equals(this.paymentPageEndpoint, paymentAppConnector.paymentPageEndpoint) &&
        Objects.equals(this.externalId, paymentAppConnector.externalId) &&
        Objects.equals(this.updatedOn, paymentAppConnector.updatedOn) &&
        Objects.equals(this.completionConfiguration, paymentAppConnector.completionConfiguration) &&
        Objects.equals(this.createdOn, paymentAppConnector.createdOn) &&
        Objects.equals(this.processor, paymentAppConnector.processor) &&
        Objects.equals(this.version, paymentAppConnector.version) &&
        Objects.equals(this.linkedSpaceId, paymentAppConnector.linkedSpaceId) &&
        Objects.equals(this.connectorConfiguration, paymentAppConnector.connectorConfiguration) &&
        Objects.equals(this.authorizationTimeout, paymentAppConnector.authorizationTimeout) &&
        Objects.equals(this.name, paymentAppConnector.name) &&
        Objects.equals(this.id, paymentAppConnector.id) &&
        Objects.equals(this.state, paymentAppConnector.state) &&
        Objects.equals(this.refundConfiguration, paymentAppConnector.refundConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentPageEndpoint, externalId, updatedOn, completionConfiguration, createdOn, processor, version, linkedSpaceId, connectorConfiguration, authorizationTimeout, name, id, state, refundConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppConnector {\n");
    sb.append("    paymentPageEndpoint: ").append(toIndentedString(paymentPageEndpoint)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    completionConfiguration: ").append(toIndentedString(completionConfiguration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    authorizationTimeout: ").append(toIndentedString(authorizationTimeout)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    refundConfiguration: ").append(toIndentedString(refundConfiguration)).append("\n");
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

    // add `paymentPageEndpoint` to the URL query string
    if (getPaymentPageEndpoint() != null) {
      try {
        joiner.add(String.format("%spaymentPageEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentPageEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `updatedOn` to the URL query string
    if (getUpdatedOn() != null) {
      try {
        joiner.add(String.format("%supdatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionConfiguration` to the URL query string
    if (getCompletionConfiguration() != null) {
      joiner.add(getCompletionConfiguration().toUrlQueryString(prefix + "completionConfiguration" + suffix));
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

    // add `processor` to the URL query string
    if (getProcessor() != null) {
      joiner.add(getProcessor().toUrlQueryString(prefix + "processor" + suffix));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connectorConfiguration` to the URL query string
    if (getConnectorConfiguration() != null) {
      joiner.add(getConnectorConfiguration().toUrlQueryString(prefix + "connectorConfiguration" + suffix));
    }

    // add `authorizationTimeout` to the URL query string
    if (getAuthorizationTimeout() != null) {
      try {
        joiner.add(String.format("%sauthorizationTimeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationTimeout()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `refundConfiguration` to the URL query string
    if (getRefundConfiguration() != null) {
      joiner.add(getRefundConfiguration().toUrlQueryString(prefix + "refundConfiguration" + suffix));
    }

    return joiner.toString();
  }

}

