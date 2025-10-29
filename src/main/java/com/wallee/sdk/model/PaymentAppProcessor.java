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
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.PaymentAppProcessorState;
import com.wallee.sdk.model.PaymentProcessorConfiguration;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentAppProcessor
 */
@JsonPropertyOrder({
  PaymentAppProcessor.JSON_PROPERTY_DOCUMENTATION_URL,
  PaymentAppProcessor.JSON_PROPERTY_CONFIGURED_ENVIRONMENT,
  PaymentAppProcessor.JSON_PROPERTY_EXTERNAL_ID,
  PaymentAppProcessor.JSON_PROPERTY_SVG_ICON,
  PaymentAppProcessor.JSON_PROPERTY_UPDATED_ON,
  PaymentAppProcessor.JSON_PROPERTY_USABLE_IN_PRODUCTION,
  PaymentAppProcessor.JSON_PROPERTY_CREATED_ON,
  PaymentAppProcessor.JSON_PROPERTY_VERSION,
  PaymentAppProcessor.JSON_PROPERTY_PROCESSOR_CONFIGURATION,
  PaymentAppProcessor.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentAppProcessor.JSON_PROPERTY_USABLE_IN_PRODUCTION_SINCE,
  PaymentAppProcessor.JSON_PROPERTY_NAME,
  PaymentAppProcessor.JSON_PROPERTY_ID,
  PaymentAppProcessor.JSON_PROPERTY_INSTALLATION_ID,
  PaymentAppProcessor.JSON_PROPERTY_PRODUCTION_MODE_URL,
  PaymentAppProcessor.JSON_PROPERTY_STATE
})

public class PaymentAppProcessor {
  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentationUrl";
  private String documentationUrl;

  public static final String JSON_PROPERTY_CONFIGURED_ENVIRONMENT = "configuredEnvironment";
  private ChargeAttemptEnvironment configuredEnvironment;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_SVG_ICON = "svgIcon";
  private String svgIcon;

  public static final String JSON_PROPERTY_UPDATED_ON = "updatedOn";
  private OffsetDateTime updatedOn;

  public static final String JSON_PROPERTY_USABLE_IN_PRODUCTION = "usableInProduction";
  private Boolean usableInProduction;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_PROCESSOR_CONFIGURATION = "processorConfiguration";
  private PaymentProcessorConfiguration processorConfiguration;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_USABLE_IN_PRODUCTION_SINCE = "usableInProductionSince";
  private OffsetDateTime usableInProductionSince;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_INSTALLATION_ID = "installationId";
  private Long installationId;

  public static final String JSON_PROPERTY_PRODUCTION_MODE_URL = "productionModeUrl";
  private String productionModeUrl;

  public static final String JSON_PROPERTY_STATE = "state";
  private PaymentAppProcessorState state;

  public PaymentAppProcessor() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentAppProcessor(
    @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL) String documentationUrl, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_SVG_ICON) String svgIcon, 
    @JsonProperty(JSON_PROPERTY_UPDATED_ON) OffsetDateTime updatedOn, 
    @JsonProperty(JSON_PROPERTY_USABLE_IN_PRODUCTION) Boolean usableInProduction, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_USABLE_IN_PRODUCTION_SINCE) OffsetDateTime usableInProductionSince, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_INSTALLATION_ID) Long installationId, 
    @JsonProperty(JSON_PROPERTY_PRODUCTION_MODE_URL) String productionModeUrl
  ) {
    this();
    this.documentationUrl = documentationUrl;
    this.externalId = externalId;
    this.svgIcon = svgIcon;
    this.updatedOn = updatedOn;
    this.usableInProduction = usableInProduction;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.usableInProductionSince = usableInProductionSince;
    this.name = name;
    this.id = id;
    this.installationId = installationId;
    this.productionModeUrl = productionModeUrl;
  }

   /**
   * A URL pointing to the documentation that explains how to configure and use the processor.
   * @return documentationUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentationUrl() {
    return documentationUrl;
  }



  public PaymentAppProcessor configuredEnvironment(ChargeAttemptEnvironment configuredEnvironment) {
    
    this.configuredEnvironment = configuredEnvironment;
    return this;
  }

   /**
   * Get configuredEnvironment
   * @return configuredEnvironment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURED_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getConfiguredEnvironment() {
    return configuredEnvironment;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURED_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguredEnvironment(ChargeAttemptEnvironment configuredEnvironment) {
    this.configuredEnvironment = configuredEnvironment;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



   /**
   * An SVG icon representing the processor, displayed to the user in the interface.
   * @return svgIcon
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SVG_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSvgIcon() {
    return svgIcon;
  }



   /**
   * The date and time when the processor was last updated.
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }



   /**
   * Whether the processor is fully prepared and available for handling transactions in a production environment.
   * @return usableInProduction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USABLE_IN_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsableInProduction() {
    return usableInProduction;
  }



   /**
   * The date and time when the processor was created.
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



  public PaymentAppProcessor processorConfiguration(PaymentProcessorConfiguration processorConfiguration) {
    
    this.processorConfiguration = processorConfiguration;
    return this;
  }

   /**
   * Get processorConfiguration
   * @return processorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessorConfiguration(PaymentProcessorConfiguration processorConfiguration) {
    this.processorConfiguration = processorConfiguration;
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
   * the date and time when the processor became fully usable and available for handling transactions in a production environment.
   * @return usableInProductionSince
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USABLE_IN_PRODUCTION_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUsableInProductionSince() {
    return usableInProductionSince;
  }



   /**
   * The name used to identify the processor.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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
   * The installation ID identifies the Web App installation.
   * @return installationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALLATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInstallationId() {
    return installationId;
  }



   /**
   * A URL pointing to the site where merchants can set up production mode for the processor.
   * @return productionModeUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCTION_MODE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductionModeUrl() {
    return productionModeUrl;
  }



  public PaymentAppProcessor state(PaymentAppProcessorState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAppProcessorState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(PaymentAppProcessorState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppProcessor paymentAppProcessor = (PaymentAppProcessor) o;
    return Objects.equals(this.documentationUrl, paymentAppProcessor.documentationUrl) &&
        Objects.equals(this.configuredEnvironment, paymentAppProcessor.configuredEnvironment) &&
        Objects.equals(this.externalId, paymentAppProcessor.externalId) &&
        Objects.equals(this.svgIcon, paymentAppProcessor.svgIcon) &&
        Objects.equals(this.updatedOn, paymentAppProcessor.updatedOn) &&
        Objects.equals(this.usableInProduction, paymentAppProcessor.usableInProduction) &&
        Objects.equals(this.createdOn, paymentAppProcessor.createdOn) &&
        Objects.equals(this.version, paymentAppProcessor.version) &&
        Objects.equals(this.processorConfiguration, paymentAppProcessor.processorConfiguration) &&
        Objects.equals(this.linkedSpaceId, paymentAppProcessor.linkedSpaceId) &&
        Objects.equals(this.usableInProductionSince, paymentAppProcessor.usableInProductionSince) &&
        Objects.equals(this.name, paymentAppProcessor.name) &&
        Objects.equals(this.id, paymentAppProcessor.id) &&
        Objects.equals(this.installationId, paymentAppProcessor.installationId) &&
        Objects.equals(this.productionModeUrl, paymentAppProcessor.productionModeUrl) &&
        Objects.equals(this.state, paymentAppProcessor.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentationUrl, configuredEnvironment, externalId, svgIcon, updatedOn, usableInProduction, createdOn, version, processorConfiguration, linkedSpaceId, usableInProductionSince, name, id, installationId, productionModeUrl, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppProcessor {\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    configuredEnvironment: ").append(toIndentedString(configuredEnvironment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    svgIcon: ").append(toIndentedString(svgIcon)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    usableInProduction: ").append(toIndentedString(usableInProduction)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    usableInProductionSince: ").append(toIndentedString(usableInProductionSince)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationId: ").append(toIndentedString(installationId)).append("\n");
    sb.append("    productionModeUrl: ").append(toIndentedString(productionModeUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `documentationUrl` to the URL query string
    if (getDocumentationUrl() != null) {
      try {
        joiner.add(String.format("%sdocumentationUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocumentationUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configuredEnvironment` to the URL query string
    if (getConfiguredEnvironment() != null) {
      try {
        joiner.add(String.format("%sconfiguredEnvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfiguredEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `svgIcon` to the URL query string
    if (getSvgIcon() != null) {
      try {
        joiner.add(String.format("%ssvgIcon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSvgIcon()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `usableInProduction` to the URL query string
    if (getUsableInProduction() != null) {
      try {
        joiner.add(String.format("%susableInProduction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsableInProduction()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processorConfiguration` to the URL query string
    if (getProcessorConfiguration() != null) {
      joiner.add(getProcessorConfiguration().toUrlQueryString(prefix + "processorConfiguration" + suffix));
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

    // add `usableInProductionSince` to the URL query string
    if (getUsableInProductionSince() != null) {
      try {
        joiner.add(String.format("%susableInProductionSince%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsableInProductionSince()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `installationId` to the URL query string
    if (getInstallationId() != null) {
      try {
        joiner.add(String.format("%sinstallationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstallationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `productionModeUrl` to the URL query string
    if (getProductionModeUrl() != null) {
      try {
        joiner.add(String.format("%sproductionModeUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductionModeUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

