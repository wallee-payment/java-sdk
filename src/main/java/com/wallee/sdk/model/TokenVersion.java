/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentInformationHash;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TokenVersionState;
import com.wallee.sdk.model.TokenVersionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TokenVersion {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("environment")
  protected ChargeAttemptEnvironment environment = null;

  
  @JsonProperty("expiresOn")
  protected OffsetDateTime expiresOn = null;

  
  @JsonProperty("iconUrl")
  protected String iconUrl = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("obsoletedOn")
  protected OffsetDateTime obsoletedOn = null;

  
  @JsonProperty("paymentConnectorConfiguration")
  protected PaymentConnectorConfiguration paymentConnectorConfiguration = null;

  
  @JsonProperty("paymentInformationHashes")
  protected List<PaymentInformationHash> paymentInformationHashes = null;

  
  @JsonProperty("paymentMethod")
  protected Long paymentMethod = null;

  
  @JsonProperty("paymentMethodBrand")
  protected Long paymentMethodBrand = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processorToken")
  protected String processorToken = null;

  
  @JsonProperty("shippingAddress")
  protected Address shippingAddress = null;

  
  @JsonProperty("state")
  protected TokenVersionState state = null;

  
  @JsonProperty("token")
  protected Token token = null;

  
  @JsonProperty("type")
  protected TokenVersionType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the token version was activated.
   * @return activatedOn
  **/
  @ApiModelProperty(value = "The date and time when the token version was activated.")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The billing address to be used for the transaction if no explicit billing address is provided during payment processing.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The billing address to be used for the transaction if no explicit billing address is provided during payment processing.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The environment in which the token version was created.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment in which the token version was created.")
  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * The date and time when the token version is set to expire, after which it will be marked as obsolete.
   * @return expiresOn
  **/
  @ApiModelProperty(value = "The date and time when the token version is set to expire, after which it will be marked as obsolete.")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }

  
   /**
   * The URL to the token&#39;s icon displayed to the customer.
   * @return iconUrl
  **/
  @ApiModelProperty(value = "The URL to the token's icon displayed to the customer.")
  public String getIconUrl() {
    return iconUrl;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @ApiModelProperty(value = "The labels providing additional information about the object.")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name used to identify the token.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the token.")
  public String getName() {
    return name;
  }

  
   /**
   * The date and time when the token version was marked obsolete.
   * @return obsoletedOn
  **/
  @ApiModelProperty(value = "The date and time when the token version was marked obsolete.")
  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
  }

  
   /**
   * The payment connector configuration that initialized the token version.
   * @return paymentConnectorConfiguration
  **/
  @ApiModelProperty(value = "The payment connector configuration that initialized the token version.")
  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }

  
   /**
   * The hashed payment information that the token version represents.
   * @return paymentInformationHashes
  **/
  @ApiModelProperty(value = "The hashed payment information that the token version represents.")
  public List<PaymentInformationHash> getPaymentInformationHashes() {
    return paymentInformationHashes;
  }

  
   /**
   * The payment method that initialized the token version.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method that initialized the token version.")
  public Long getPaymentMethod() {
    return paymentMethod;
  }

  
   /**
   * The payment method brand that initialized the token version.
   * @return paymentMethodBrand
  **/
  @ApiModelProperty(value = "The payment method brand that initialized the token version.")
  public Long getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The token name as specified by the processor.
   * @return processorToken
  **/
  @ApiModelProperty(value = "The token name as specified by the processor.")
  public String getProcessorToken() {
    return processorToken;
  }

  
   /**
   * The shipping address to be used for the transaction if no explicit shipping address is provided during payment processing.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The shipping address to be used for the transaction if no explicit shipping address is provided during payment processing.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public TokenVersionState getState() {
    return state;
  }

  
   /**
   * The token that the token version belongs to.
   * @return token
  **/
  @ApiModelProperty(value = "The token that the token version belongs to.")
  public Token getToken() {
    return token;
  }

  
   /**
   * The type specifies the nature of the token and identifies the payment connector capable of processing it.
   * @return type
  **/
  @ApiModelProperty(value = "The type specifies the nature of the token and identifies the payment connector capable of processing it.")
  public TokenVersionType getType() {
    return type;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenVersion tokenVersion = (TokenVersion) o;
    return Objects.equals(this.activatedOn, tokenVersion.activatedOn) &&
        Objects.equals(this.billingAddress, tokenVersion.billingAddress) &&
        Objects.equals(this.createdOn, tokenVersion.createdOn) &&
        Objects.equals(this.environment, tokenVersion.environment) &&
        Objects.equals(this.expiresOn, tokenVersion.expiresOn) &&
        Objects.equals(this.iconUrl, tokenVersion.iconUrl) &&
        Objects.equals(this.id, tokenVersion.id) &&
        Objects.equals(this.labels, tokenVersion.labels) &&
        Objects.equals(this.language, tokenVersion.language) &&
        Objects.equals(this.linkedSpaceId, tokenVersion.linkedSpaceId) &&
        Objects.equals(this.name, tokenVersion.name) &&
        Objects.equals(this.obsoletedOn, tokenVersion.obsoletedOn) &&
        Objects.equals(this.paymentConnectorConfiguration, tokenVersion.paymentConnectorConfiguration) &&
        Objects.equals(this.paymentInformationHashes, tokenVersion.paymentInformationHashes) &&
        Objects.equals(this.paymentMethod, tokenVersion.paymentMethod) &&
        Objects.equals(this.paymentMethodBrand, tokenVersion.paymentMethodBrand) &&
        Objects.equals(this.plannedPurgeDate, tokenVersion.plannedPurgeDate) &&
        Objects.equals(this.processorToken, tokenVersion.processorToken) &&
        Objects.equals(this.shippingAddress, tokenVersion.shippingAddress) &&
        Objects.equals(this.state, tokenVersion.state) &&
        Objects.equals(this.token, tokenVersion.token) &&
        Objects.equals(this.type, tokenVersion.type) &&
        Objects.equals(this.version, tokenVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, billingAddress, createdOn, environment, expiresOn, iconUrl, id, labels, language, linkedSpaceId, name, obsoletedOn, paymentConnectorConfiguration, paymentInformationHashes, paymentMethod, paymentMethodBrand, plannedPurgeDate, processorToken, shippingAddress, state, token, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenVersion {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    paymentInformationHashes: ").append(toIndentedString(paymentInformationHashes)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

