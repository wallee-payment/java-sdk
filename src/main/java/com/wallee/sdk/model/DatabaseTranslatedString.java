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

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class DatabaseTranslatedString extends Indentable {
  
  @JsonProperty("availableLanguages")
  protected List<String> availableLanguages;

  
  @JsonProperty("displayName")
  protected String displayName;

  
  @JsonProperty("items")
  protected List<DatabaseTranslatedStringItem> items;

  
  
   /**
   * 
   * @return availableLanguages
  **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableLanguages() {
    return availableLanguages;
  }

  
   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  
   /**
   * 
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<DatabaseTranslatedStringItem> getItems() {
    return items;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseTranslatedString databaseTranslatedString = (DatabaseTranslatedString) o;
    return Objects.equals(this.availableLanguages, databaseTranslatedString.availableLanguages) &&
        Objects.equals(this.displayName, databaseTranslatedString.displayName) &&
        Objects.equals(this.items, databaseTranslatedString.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableLanguages, displayName, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseTranslatedString {\n");
    
    sb.append("    availableLanguages: ").append(toIndentedString(availableLanguages)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

