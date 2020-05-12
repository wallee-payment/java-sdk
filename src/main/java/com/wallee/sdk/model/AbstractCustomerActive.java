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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractCustomerActive
 */

public class AbstractCustomerActive {
  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("familyName")
  protected String familyName = null;

  
  @JsonProperty("givenName")
  protected String givenName = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("preferredCurrency")
  protected String preferredCurrency = null;

  
  
  public AbstractCustomerActive customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * 
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public AbstractCustomerActive emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public AbstractCustomerActive familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public AbstractCustomerActive givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  public AbstractCustomerActive language(String language) {
    this.language = language;
    return this;
  }

   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractCustomerActive metaData(Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public AbstractCustomerActive putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

   /**
   * Meta data allow to store additional data along the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Meta data allow to store additional data along the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }

  
  public AbstractCustomerActive preferredCurrency(String preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
    return this;
  }

   /**
   * 
   * @return preferredCurrency
  **/
  @ApiModelProperty(value = "")
  public String getPreferredCurrency() {
    return preferredCurrency;
  }

  public void setPreferredCurrency(String preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractCustomerActive abstractCustomerActive = (AbstractCustomerActive) o;
    return Objects.equals(this.customerId, abstractCustomerActive.customerId) &&
        Objects.equals(this.emailAddress, abstractCustomerActive.emailAddress) &&
        Objects.equals(this.familyName, abstractCustomerActive.familyName) &&
        Objects.equals(this.givenName, abstractCustomerActive.givenName) &&
        Objects.equals(this.language, abstractCustomerActive.language) &&
        Objects.equals(this.metaData, abstractCustomerActive.metaData) &&
        Objects.equals(this.preferredCurrency, abstractCustomerActive.preferredCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, emailAddress, familyName, givenName, language, metaData, preferredCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractCustomerActive {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    preferredCurrency: ").append(toIndentedString(preferredCurrency)).append("\n");
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

