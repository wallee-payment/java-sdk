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
import com.wallee.sdk.model.LocalizedString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class LegalOrganizationForm {
  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("description")
  protected List<LocalizedString> description = null;

  
  @JsonProperty("englishDescription")
  protected String englishDescription = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("shortcut")
  protected List<LocalizedString> shortcut = null;

  
  
   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return englishDescription
  **/
  @ApiModelProperty(value = "")
  public String getEnglishDescription() {
    return englishDescription;
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
   * @return shortcut
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getShortcut() {
    return shortcut;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalOrganizationForm legalOrganizationForm = (LegalOrganizationForm) o;
    return Objects.equals(this.country, legalOrganizationForm.country) &&
        Objects.equals(this.description, legalOrganizationForm.description) &&
        Objects.equals(this.englishDescription, legalOrganizationForm.englishDescription) &&
        Objects.equals(this.id, legalOrganizationForm.id) &&
        Objects.equals(this.shortcut, legalOrganizationForm.shortcut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, description, englishDescription, id, shortcut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalOrganizationForm {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    englishDescription: ").append(toIndentedString(englishDescription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
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

