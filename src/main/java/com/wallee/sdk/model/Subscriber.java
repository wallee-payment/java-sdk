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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")

public class Subscriber {
  
  @JsonProperty("additionalAllowedPaymentMethodConfigurations")
  protected List<Long> additionalAllowedPaymentMethodConfigurations;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress;

  
  @JsonProperty("description")
  protected String description;

  
  @JsonProperty("disallowedPaymentMethodConfigurations")
  protected List<Long> disallowedPaymentMethodConfigurations;

  
  @JsonProperty("emailAddress")
  protected String emailAddress;

  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("language")
  protected String language;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("reference")
  protected String reference;

  
  @JsonProperty("shippingAddress")
  protected Address shippingAddress;

  
  @JsonProperty("state")
  protected CreationEntityState state;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
   * @return additionalAllowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "Those payment methods which are allowed additionally will be available even when the product does not allow those methods.")
  public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
    return additionalAllowedPaymentMethodConfigurations;
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
   * The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
   * @return description
  **/
  @ApiModelProperty(value = "The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.")
  public String getDescription() {
    return description;
  }

  
   /**
   * Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
   * @return disallowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.")
  public List<Long> getDisallowedPaymentMethodConfigurations() {
    return disallowedPaymentMethodConfigurations;
  }

  
   /**
   * The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  
   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
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
   * The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
   * @return language
  **/
  @ApiModelProperty(value = "The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).")
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
   * Meta data allow to store additional data along the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Meta data allow to store additional data along the object.")
  public Map<String, String> getMetaData() {
    return metaData;
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
   * The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
   * @return reference
  **/
  @ApiModelProperty(value = "The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).")
  public String getReference() {
    return reference;
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
  public CreationEntityState getState() {
    return state;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriber subscriber = (Subscriber) o;
    return Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriber.additionalAllowedPaymentMethodConfigurations) &&
        Objects.equals(this.billingAddress, subscriber.billingAddress) &&
        Objects.equals(this.description, subscriber.description) &&
        Objects.equals(this.disallowedPaymentMethodConfigurations, subscriber.disallowedPaymentMethodConfigurations) &&
        Objects.equals(this.emailAddress, subscriber.emailAddress) &&
        Objects.equals(this.externalId, subscriber.externalId) &&
        Objects.equals(this.id, subscriber.id) &&
        Objects.equals(this.language, subscriber.language) &&
        Objects.equals(this.linkedSpaceId, subscriber.linkedSpaceId) &&
        Objects.equals(this.metaData, subscriber.metaData) &&
        Objects.equals(this.plannedPurgeDate, subscriber.plannedPurgeDate) &&
        Objects.equals(this.reference, subscriber.reference) &&
        Objects.equals(this.shippingAddress, subscriber.shippingAddress) && this.state == subscriber.state &&
        Objects.equals(this.version, subscriber.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, externalId, id, language, linkedSpaceId, metaData, plannedPurgeDate, reference, shippingAddress, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscriber {\n");
    
    sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

}

