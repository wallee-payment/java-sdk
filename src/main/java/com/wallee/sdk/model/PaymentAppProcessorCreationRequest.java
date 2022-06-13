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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAppProcessorCreationRequest {
  
  @JsonProperty("documentationUrl")
  protected String documentationUrl = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("productionModeUrl")
  protected String productionModeUrl = null;

  
  @JsonProperty("svgIcon")
  protected String svgIcon = null;

  
  
  public PaymentAppProcessorCreationRequest documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

   /**
   * The documentation URL has to point to a description of how to configure and use the processor.
   * @return documentationUrl
  **/
  @ApiModelProperty(required = true, value = "The documentation URL has to point to a description of how to configure and use the processor.")
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  
  public PaymentAppProcessorCreationRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external ID identifies the processor within the external system. It has to be unique per space and for any subsequent update the same ID must be sent.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external ID identifies the processor within the external system. It has to be unique per space and for any subsequent update the same ID must be sent.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public PaymentAppProcessorCreationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the processor will be displayed within the user interfaces that the merchant is interacting with.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the processor will be displayed within the user interfaces that the merchant is interacting with.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PaymentAppProcessorCreationRequest productionModeUrl(String productionModeUrl) {
    this.productionModeUrl = productionModeUrl;
    return this;
  }

   /**
   * The production mode URL has to point to a site on which the merchant can set up the production mode for the processor.
   * @return productionModeUrl
  **/
  @ApiModelProperty(value = "The production mode URL has to point to a site on which the merchant can set up the production mode for the processor.")
  public String getProductionModeUrl() {
    return productionModeUrl;
  }

  public void setProductionModeUrl(String productionModeUrl) {
    this.productionModeUrl = productionModeUrl;
  }

  
  public PaymentAppProcessorCreationRequest svgIcon(String svgIcon) {
    this.svgIcon = svgIcon;
    return this;
  }

   /**
   * The SVG icon will be displayed to the user to represent this processor.
   * @return svgIcon
  **/
  @ApiModelProperty(required = true, value = "The SVG icon will be displayed to the user to represent this processor.")
  public String getSvgIcon() {
    return svgIcon;
  }

  public void setSvgIcon(String svgIcon) {
    this.svgIcon = svgIcon;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppProcessorCreationRequest paymentAppProcessorCreationRequest = (PaymentAppProcessorCreationRequest) o;
    return Objects.equals(this.documentationUrl, paymentAppProcessorCreationRequest.documentationUrl) &&
        Objects.equals(this.externalId, paymentAppProcessorCreationRequest.externalId) &&
        Objects.equals(this.name, paymentAppProcessorCreationRequest.name) &&
        Objects.equals(this.productionModeUrl, paymentAppProcessorCreationRequest.productionModeUrl) &&
        Objects.equals(this.svgIcon, paymentAppProcessorCreationRequest.svgIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentationUrl, externalId, name, productionModeUrl, svgIcon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppProcessorCreationRequest {\n");
    
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productionModeUrl: ").append(toIndentedString(productionModeUrl)).append("\n");
    sb.append("    svgIcon: ").append(toIndentedString(svgIcon)).append("\n");
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

