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

public class DatabaseTranslatedStringItem {
  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("languageCode")
  protected String languageCode = null;

  
  @JsonProperty("translation")
  protected String translation = null;

  
  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * 
   * @return languageCode
  **/
  @ApiModelProperty(value = "")
  public String getLanguageCode() {
    return languageCode;
  }

  
   /**
   * 
   * @return translation
  **/
  @ApiModelProperty(value = "")
  public String getTranslation() {
    return translation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseTranslatedStringItem databaseTranslatedStringItem = (DatabaseTranslatedStringItem) o;
    return Objects.equals(this.language, databaseTranslatedStringItem.language) &&
        Objects.equals(this.languageCode, databaseTranslatedStringItem.languageCode) &&
        Objects.equals(this.translation, databaseTranslatedStringItem.translation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, languageCode, translation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseTranslatedStringItem {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
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

