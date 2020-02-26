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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class Customer {
  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("customerId")
  protected String customerId = null;

  
  @SerializedName("emailAddress")
  protected String emailAddress = null;

  
  @SerializedName("familyName")
  protected String familyName = null;

  
  @SerializedName("givenName")
  protected String givenName = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("language")
  protected String language = null;

  
  @SerializedName("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @SerializedName("metaData")
  protected Map<String, String> metaData = null;

  
  @SerializedName("preferredCurrency")
  protected String preferredCurrency = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  
   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  
   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  
   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
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
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
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
   * 
   * @return preferredCurrency
  **/
  @ApiModelProperty(value = "")
  public String getPreferredCurrency() {
    return preferredCurrency;
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.createdOn, customer.createdOn) &&
        Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.emailAddress, customer.emailAddress) &&
        Objects.equals(this.familyName, customer.familyName) &&
        Objects.equals(this.givenName, customer.givenName) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.language, customer.language) &&
        Objects.equals(this.linkedSpaceId, customer.linkedSpaceId) &&
        Objects.equals(this.metaData, customer.metaData) &&
        Objects.equals(this.preferredCurrency, customer.preferredCurrency) &&
        Objects.equals(this.version, customer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, customerId, emailAddress, familyName, givenName, id, language, linkedSpaceId, metaData, preferredCurrency, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    preferredCurrency: ").append(toIndentedString(preferredCurrency)).append("\n");
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

