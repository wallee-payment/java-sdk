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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionAffiliateUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  
  public SubscriptionAffiliateUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public SubscriptionAffiliateUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public SubscriptionAffiliateUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public SubscriptionAffiliateUpdate metaData(Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public SubscriptionAffiliateUpdate putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

   /**
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Allow to store additional information about the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }

  
  public SubscriptionAffiliateUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public SubscriptionAffiliateUpdate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAffiliateUpdate subscriptionAffiliateUpdate = (SubscriptionAffiliateUpdate) o;
    return Objects.equals(this.id, subscriptionAffiliateUpdate.id) &&
        Objects.equals(this.version, subscriptionAffiliateUpdate.version) &&
        Objects.equals(this.language, subscriptionAffiliateUpdate.language) &&
        Objects.equals(this.metaData, subscriptionAffiliateUpdate.metaData) &&
        Objects.equals(this.name, subscriptionAffiliateUpdate.name) &&
        Objects.equals(this.state, subscriptionAffiliateUpdate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, language, metaData, name, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAffiliateUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

