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
   * The two-letter code of the country the legal organization form is used in (ISO 3166-1 alpha-2 format).
   * @return country
  **/
  @ApiModelProperty(value = "The two-letter code of the country the legal organization form is used in (ISO 3166-1 alpha-2 format).")
  public String getCountry() {
    return country;
  }

  
   /**
   * The localized descriptions of the legal organization form.
   * @return description
  **/
  @ApiModelProperty(value = "The localized descriptions of the legal organization form.")
  public List<LocalizedString> getDescription() {
    return description;
  }

  
   /**
   * The English name of the legal organization form.
   * @return englishDescription
  **/
  @ApiModelProperty(value = "The English name of the legal organization form.")
  public String getEnglishDescription() {
    return englishDescription;
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
   * The localized shortcuts of the legal organization form.
   * @return shortcut
  **/
  @ApiModelProperty(value = "The localized shortcuts of the legal organization form.")
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

