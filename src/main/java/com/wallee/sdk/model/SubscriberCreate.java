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
import com.wallee.sdk.model.AbstractSubscriberUpdate;
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")

public class SubscriberCreate extends AbstractSubscriberUpdate {
  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  
  public SubscriberCreate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  
  public SubscriberCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberCreate subscriberCreate = (SubscriberCreate) o;
    return Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberCreate.additionalAllowedPaymentMethodConfigurations) &&
        Objects.equals(this.billingAddress, subscriberCreate.billingAddress) &&
        Objects.equals(this.description, subscriberCreate.description) &&
        Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberCreate.disallowedPaymentMethodConfigurations) &&
        Objects.equals(this.emailAddress, subscriberCreate.emailAddress) &&
        Objects.equals(this.language, subscriberCreate.language) &&
        Objects.equals(this.metaData, subscriberCreate.metaData) &&
        Objects.equals(this.reference, subscriberCreate.reference) &&
        Objects.equals(this.shippingAddress, subscriberCreate.shippingAddress) &&
        Objects.equals(this.state, subscriberCreate.state) &&
        Objects.equals(this.externalId, subscriberCreate.externalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, metaData, reference, shippingAddress, state, externalId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

