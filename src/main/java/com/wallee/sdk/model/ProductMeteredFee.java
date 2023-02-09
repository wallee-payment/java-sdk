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
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.ProductMeteredTierPricing;
import com.wallee.sdk.model.SubscriptionMetric;
import com.wallee.sdk.model.SubscriptionProductComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ProductMeteredFee {
  
  @JsonProperty("component")
  protected SubscriptionProductComponent component = null;

  
  @JsonProperty("description")
  protected DatabaseTranslatedString description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("metric")
  protected SubscriptionMetric metric = null;

  
  @JsonProperty("name")
  protected DatabaseTranslatedString name = null;

  
  @JsonProperty("tierPricing")
  protected ProductMeteredTierPricing tierPricing = null;

  
  @JsonProperty("type")
  protected ProductFeeType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return component
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductComponent getComponent() {
    return component;
  }

  
   /**
   * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
   * @return description
  **/
  @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
  public DatabaseTranslatedString getDescription() {
    return description;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return metric
  **/
  @ApiModelProperty(value = "")
  public SubscriptionMetric getMetric() {
    return metric;
  }

  
   /**
   * The name of the fee should describe for the subscriber in few words for what the fee is for.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
  public DatabaseTranslatedString getName() {
    return name;
  }

  
   /**
   * The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.
   * @return tierPricing
  **/
  @ApiModelProperty(value = "The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.")
  public ProductMeteredTierPricing getTierPricing() {
    return tierPricing;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ProductFeeType getType() {
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
    ProductMeteredFee productMeteredFee = (ProductMeteredFee) o;
    return Objects.equals(this.component, productMeteredFee.component) &&
        Objects.equals(this.description, productMeteredFee.description) &&
        Objects.equals(this.id, productMeteredFee.id) &&
        Objects.equals(this.linkedSpaceId, productMeteredFee.linkedSpaceId) &&
        Objects.equals(this.metric, productMeteredFee.metric) &&
        Objects.equals(this.name, productMeteredFee.name) &&
        Objects.equals(this.tierPricing, productMeteredFee.tierPricing) &&
        Objects.equals(this.type, productMeteredFee.type) &&
        Objects.equals(this.version, productMeteredFee.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, description, id, linkedSpaceId, metric, name, tierPricing, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredFee {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
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

