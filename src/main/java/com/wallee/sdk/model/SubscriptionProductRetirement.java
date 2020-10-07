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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class SubscriptionProductRetirement {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("product")
  protected SubscriptionProduct product;

  
  @JsonProperty("respectTerminiationPeriodsEnabled")
  protected Boolean respectTerminiationPeriodsEnabled;

  
  @JsonProperty("targetProduct")
  protected SubscriptionProduct targetProduct;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return product
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProduct getProduct() {
    return product;
  }

  
   /**
   * 
   * @return respectTerminiationPeriodsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isRespectTerminiationPeriodsEnabled() {
    return respectTerminiationPeriodsEnabled;
  }

  
   /**
   * 
   * @return targetProduct
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProduct getTargetProduct() {
    return targetProduct;
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
    SubscriptionProductRetirement subscriptionProductRetirement = (SubscriptionProductRetirement) o;
    return Objects.equals(this.createdOn, subscriptionProductRetirement.createdOn) &&
        Objects.equals(this.id, subscriptionProductRetirement.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductRetirement.linkedSpaceId) &&
        Objects.equals(this.product, subscriptionProductRetirement.product) &&
        Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductRetirement.respectTerminiationPeriodsEnabled) &&
        Objects.equals(this.targetProduct, subscriptionProductRetirement.targetProduct) &&
        Objects.equals(this.version, subscriptionProductRetirement.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, linkedSpaceId, product, respectTerminiationPeriodsEnabled, targetProduct, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductRetirement {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

