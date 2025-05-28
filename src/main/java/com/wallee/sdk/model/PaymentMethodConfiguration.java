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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.OneClickPaymentMode;
import com.wallee.sdk.model.ResourcePath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentMethodConfiguration {
  
  @JsonProperty("dataCollectionType")
  protected DataCollectionType dataCollectionType = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("imageResourcePath")
  protected ResourcePath imageResourcePath = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("oneClickPaymentMode")
  protected OneClickPaymentMode oneClickPaymentMode = null;

  
  @JsonProperty("paymentMethod")
  protected Long paymentMethod = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("resolvedDescription")
  protected Map<String, String> resolvedDescription = null;

  
  @JsonProperty("resolvedImageUrl")
  protected String resolvedImageUrl = null;

  
  @JsonProperty("resolvedTitle")
  protected Map<String, String> resolvedTitle = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("spaceId")
  protected Long spaceId = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("title")
  protected Map<String, String> title = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The data collection type specifies how the payment information is collected.
   * @return dataCollectionType
  **/
  @ApiModelProperty(value = "The data collection type specifies how the payment information is collected.")
  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }

  
   /**
   * A customer-facing custom description for the payment method.
   * @return description
  **/
  @ApiModelProperty(value = "A customer-facing custom description for the payment method.")
  public Map<String, String> getDescription() {
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
   * The resource path to a custom image for the payment method, displayed to the customer for visual identification.
   * @return imageResourcePath
  **/
  @ApiModelProperty(value = "The resource path to a custom image for the payment method, displayed to the customer for visual identification.")
  public ResourcePath getImageResourcePath() {
    return imageResourcePath;
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
   * The name used to identify the payment method configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the payment method configuration.")
  public String getName() {
    return name;
  }

  
   /**
   * The one-click payment mode determines whether the customer can save their payment details for later payments.
   * @return oneClickPaymentMode
  **/
  @ApiModelProperty(value = "The one-click payment mode determines whether the customer can save their payment details for later payments.")
  public OneClickPaymentMode getOneClickPaymentMode() {
    return oneClickPaymentMode;
  }

  
   /**
   * The payment method that the configuration is for.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method that the configuration is for.")
  public Long getPaymentMethod() {
    return paymentMethod;
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
   * The description of the payment method displayed to the customer. If a custom description is defined, it will be used; otherwise, the default description of the payment method will be shown.
   * @return resolvedDescription
  **/
  @ApiModelProperty(value = "The description of the payment method displayed to the customer. If a custom description is defined, it will be used; otherwise, the default description of the payment method will be shown.")
  public Map<String, String> getResolvedDescription() {
    return resolvedDescription;
  }

  
   /**
   * The URL to the image of the payment method displayed to the customer. If a custom image is defined, it will be used; otherwise, the default image of the payment method will be shown.
   * @return resolvedImageUrl
  **/
  @ApiModelProperty(value = "The URL to the image of the payment method displayed to the customer. If a custom image is defined, it will be used; otherwise, the default image of the payment method will be shown.")
  public String getResolvedImageUrl() {
    return resolvedImageUrl;
  }

  
   /**
   * The title of the payment method displayed to the customer. If a custom title is defined, it will be used; otherwise, the default title of the payment method will be shown.
   * @return resolvedTitle
  **/
  @ApiModelProperty(value = "The title of the payment method displayed to the customer. If a custom title is defined, it will be used; otherwise, the default title of the payment method will be shown.")
  public Map<String, String> getResolvedTitle() {
    return resolvedTitle;
  }

  
   /**
   * When listing payment methods, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing payment methods, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return spaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getSpaceId() {
    return spaceId;
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
   * A customer-facing custom title for the payment method.
   * @return title
  **/
  @ApiModelProperty(value = "A customer-facing custom title for the payment method.")
  public Map<String, String> getTitle() {
    return title;
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
    PaymentMethodConfiguration paymentMethodConfiguration = (PaymentMethodConfiguration) o;
    return Objects.equals(this.dataCollectionType, paymentMethodConfiguration.dataCollectionType) &&
        Objects.equals(this.description, paymentMethodConfiguration.description) &&
        Objects.equals(this.id, paymentMethodConfiguration.id) &&
        Objects.equals(this.imageResourcePath, paymentMethodConfiguration.imageResourcePath) &&
        Objects.equals(this.linkedSpaceId, paymentMethodConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentMethodConfiguration.name) &&
        Objects.equals(this.oneClickPaymentMode, paymentMethodConfiguration.oneClickPaymentMode) &&
        Objects.equals(this.paymentMethod, paymentMethodConfiguration.paymentMethod) &&
        Objects.equals(this.plannedPurgeDate, paymentMethodConfiguration.plannedPurgeDate) &&
        Objects.equals(this.resolvedDescription, paymentMethodConfiguration.resolvedDescription) &&
        Objects.equals(this.resolvedImageUrl, paymentMethodConfiguration.resolvedImageUrl) &&
        Objects.equals(this.resolvedTitle, paymentMethodConfiguration.resolvedTitle) &&
        Objects.equals(this.sortOrder, paymentMethodConfiguration.sortOrder) &&
        Objects.equals(this.spaceId, paymentMethodConfiguration.spaceId) &&
        Objects.equals(this.state, paymentMethodConfiguration.state) &&
        Objects.equals(this.title, paymentMethodConfiguration.title) &&
        Objects.equals(this.version, paymentMethodConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCollectionType, description, id, imageResourcePath, linkedSpaceId, name, oneClickPaymentMode, paymentMethod, plannedPurgeDate, resolvedDescription, resolvedImageUrl, resolvedTitle, sortOrder, spaceId, state, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodConfiguration {\n");
    
    sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageResourcePath: ").append(toIndentedString(imageResourcePath)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oneClickPaymentMode: ").append(toIndentedString(oneClickPaymentMode)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    resolvedDescription: ").append(toIndentedString(resolvedDescription)).append("\n");
    sb.append("    resolvedImageUrl: ").append(toIndentedString(resolvedImageUrl)).append("\n");
    sb.append("    resolvedTitle: ").append(toIndentedString(resolvedTitle)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

