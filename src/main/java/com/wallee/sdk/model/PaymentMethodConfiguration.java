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
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payment method configuration builds the base to connect with different payment method connectors.
 */
@ApiModel(description = "The payment method configuration builds the base to connect with different payment method connectors.")

public class PaymentMethodConfiguration extends Indentable {
  
  @JsonProperty("dataCollectionType")
  protected DataCollectionType dataCollectionType;

  
  @JsonProperty("description")
  protected DatabaseTranslatedString description;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("imageResourcePath")
  protected ResourcePath imageResourcePath;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("name")
  protected String name;

  
  @JsonProperty("oneClickPaymentMode")
  protected OneClickPaymentMode oneClickPaymentMode;

  
  @JsonProperty("paymentMethod")
  protected Long paymentMethod;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("resolvedDescription")
  protected Map<String, String> resolvedDescription;

  
  @JsonProperty("resolvedImageUrl")
  protected String resolvedImageUrl;

  
  @JsonProperty("resolvedTitle")
  protected Map<String, String> resolvedTitle;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder;

  
  @JsonProperty("spaceId")
  protected Long spaceId;

  
  @JsonProperty("state")
  protected CreationEntityState state;

  
  @JsonProperty("title")
  protected DatabaseTranslatedString title;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The data collection type determines who is collecting the payment information. This can be done either by the processor (offsite) or by our application (onsite).
   * @return dataCollectionType
  **/
  @ApiModelProperty(value = "The data collection type determines who is collecting the payment information. This can be done either by the processor (offsite) or by our application (onsite).")
  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }

  
   /**
   * The payment method configuration description can be used to show a text during the payment process. Choose an appropriate description as it will be displayed to your customer.
   * @return description
  **/
  @ApiModelProperty(value = "The payment method configuration description can be used to show a text during the payment process. Choose an appropriate description as it will be displayed to your customer.")
  public DatabaseTranslatedString getDescription() {
    return description;
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
   * The image of the payment method configuration overrides the default image of the payment method.
   * @return imageResourcePath
  **/
  @ApiModelProperty(value = "The image of the payment method configuration overrides the default image of the payment method.")
  public ResourcePath getImageResourcePath() {
    return imageResourcePath;
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
   * The payment method configuration name is used internally to identify the payment method configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The payment method configuration name is used internally to identify the payment method configuration. For example the name is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * When the buyer is present on the payment page or within the iFrame the payment details can be stored automatically. The buyer will be able to use the stored payment details for subsequent transactions. When the transaction already contains a token one-click payments are disabled anyway
   * @return oneClickPaymentMode
  **/
  @ApiModelProperty(value = "When the buyer is present on the payment page or within the iFrame the payment details can be stored automatically. The buyer will be able to use the stored payment details for subsequent transactions. When the transaction already contains a token one-click payments are disabled anyway")
  public OneClickPaymentMode getOneClickPaymentMode() {
    return oneClickPaymentMode;
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
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The resolved description uses the specified description or the default one when it is not overridden.
   * @return resolvedDescription
  **/
  @ApiModelProperty(value = "The resolved description uses the specified description or the default one when it is not overridden.")
  public Map<String, String> getResolvedDescription() {
    return resolvedDescription;
  }

  
   /**
   * The resolved URL of the image to use with this payment method.
   * @return resolvedImageUrl
  **/
  @ApiModelProperty(value = "The resolved URL of the image to use with this payment method.")
  public String getResolvedImageUrl() {
    return resolvedImageUrl;
  }

  
   /**
   * The resolved title uses the specified title or the default one when it is not overridden.
   * @return resolvedTitle
  **/
  @ApiModelProperty(value = "The resolved title uses the specified title or the default one when it is not overridden.")
  public Map<String, String> getResolvedTitle() {
    return resolvedTitle;
  }

  
   /**
   * The sort order of the payment method determines the ordering of the methods shown to the user during the payment process.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The sort order of the payment method determines the ordering of the methods shown to the user during the payment process.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * 
   * @return spaceId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceId() {
    return spaceId;
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
   * The title of the payment method configuration is used within the payment process. The title is visible to the customer.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the payment method configuration is used within the payment process. The title is visible to the customer.")
  public DatabaseTranslatedString getTitle() {
    return title;
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
    PaymentMethodConfiguration paymentMethodConfiguration = (PaymentMethodConfiguration) o;
    return this.dataCollectionType == paymentMethodConfiguration.dataCollectionType &&
        Objects.equals(this.description, paymentMethodConfiguration.description) &&
        Objects.equals(this.id, paymentMethodConfiguration.id) &&
        Objects.equals(this.imageResourcePath, paymentMethodConfiguration.imageResourcePath) &&
        Objects.equals(this.linkedSpaceId, paymentMethodConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentMethodConfiguration.name) && this.oneClickPaymentMode
      == paymentMethodConfiguration.oneClickPaymentMode &&
        Objects.equals(this.paymentMethod, paymentMethodConfiguration.paymentMethod) &&
        Objects.equals(this.plannedPurgeDate, paymentMethodConfiguration.plannedPurgeDate) &&
        Objects.equals(this.resolvedDescription, paymentMethodConfiguration.resolvedDescription) &&
        Objects.equals(this.resolvedImageUrl, paymentMethodConfiguration.resolvedImageUrl) &&
        Objects.equals(this.resolvedTitle, paymentMethodConfiguration.resolvedTitle) &&
        Objects.equals(this.sortOrder, paymentMethodConfiguration.sortOrder) &&
        Objects.equals(this.spaceId, paymentMethodConfiguration.spaceId) && this.state
      == paymentMethodConfiguration.state &&
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



}

