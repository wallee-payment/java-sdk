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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionAffiliateCreate extends AbstractSubscriptionAffiliateUpdate {
  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("reference")
  protected String reference;

  
  
  public SubscriptionAffiliateCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public SubscriptionAffiliateCreate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAffiliateCreate subscriptionAffiliateCreate = (SubscriptionAffiliateCreate) o;
    return Objects.equals(this.language, subscriptionAffiliateCreate.language) &&
        Objects.equals(this.metaData, subscriptionAffiliateCreate.metaData) &&
        Objects.equals(this.name, subscriptionAffiliateCreate.name) && this.state == subscriptionAffiliateCreate.state
      &&
        Objects.equals(this.externalId, subscriptionAffiliateCreate.externalId) &&
        Objects.equals(this.reference, subscriptionAffiliateCreate.reference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, metaData, name, state, externalId, reference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAffiliateCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

