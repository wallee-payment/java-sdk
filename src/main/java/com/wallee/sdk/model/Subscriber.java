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
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")

public class Subscriber {
  
  @JsonProperty("additionalAllowedPaymentMethodConfigurations")
  protected List<Long> additionalAllowedPaymentMethodConfigurations = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("disallowedPaymentMethodConfigurations")
  protected List<Long> disallowedPaymentMethodConfigurations = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("shippingAddress")
  protected Address shippingAddress = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
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
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
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
   * The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
   * @return language
  **/
  @ApiModelProperty(value = "The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).")
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
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Allow to store additional information about the object.")
  public Map<String, String> getMetaData() {
    return metaData;
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
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
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
        Objects.equals(this.shippingAddress, subscriber.shippingAddress) &&
        Objects.equals(this.state, subscriber.state) &&
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

