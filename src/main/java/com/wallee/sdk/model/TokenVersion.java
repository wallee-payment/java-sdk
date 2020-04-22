/**
*  SDK
*
* This library allows to interact with the  payment service.
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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
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
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.
   * @return expiresOn
  **/
  @ApiModelProperty(value = "The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }

  
   /**
   * 
   * @return iconUrl
  **/
  @ApiModelProperty(value = "")
  public String getIconUrl() {
    return iconUrl;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  
   /**
   * 
   * @return obsoletedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
  }

  
   /**
   * 
   * @return paymentConnectorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }

  
   /**
   * The payment information hash set contains hashes of the payment information represented by this token version.
   * @return paymentInformationHashes
  **/
  @ApiModelProperty(value = "The payment information hash set contains hashes of the payment information represented by this token version.")
  public List<PaymentInformationHash> getPaymentInformationHashes() {
    return paymentInformationHashes;
  }

  
   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public Long getPaymentMethod() {
    return paymentMethod;
  }

  
   /**
   * 
   * @return paymentMethodBrand
  **/
  @ApiModelProperty(value = "")
  public Long getPaymentMethodBrand() {
    return paymentMethodBrand;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return processorToken
  **/
  @ApiModelProperty(value = "")
  public String getProcessorToken() {
    return processorToken;
  }

  
   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public TokenVersionState getState() {
    return state;
  }

  
   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Token getToken() {
    return token;
  }

  
   /**
   * The token version type determines what kind of token it is and by which payment connector the token can be processed by.
   * @return type
  **/
  @ApiModelProperty(value = "The token version type determines what kind of token it is and by which payment connector the token can be processed by.")
  public TokenVersionType getType() {
    return type;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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

