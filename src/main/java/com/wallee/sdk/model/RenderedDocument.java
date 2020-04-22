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
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class RenderedDocument {
  
  @JsonProperty("data")
  protected List<byte[]> data = null;

  
  @JsonProperty("documentTemplateType")
  protected Long documentTemplateType = null;

  
  @JsonProperty("mimeType")
  protected String mimeType = null;

  
  @JsonProperty("title")
  protected String title = null;

  
  
   /**
   * 
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<byte[]> getData() {
    return data;
  }

  
   /**
   * 
   * @return documentTemplateType
  **/
  @ApiModelProperty(value = "")
  public Long getDocumentTemplateType() {
    return documentTemplateType;
  }

  
   /**
   * 
   * @return mimeType
  **/
  @ApiModelProperty(value = "")
  public String getMimeType() {
    return mimeType;
  }

  
   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderedDocument renderedDocument = (RenderedDocument) o;
    return Objects.equals(this.data, renderedDocument.data) &&
        Objects.equals(this.documentTemplateType, renderedDocument.documentTemplateType) &&
        Objects.equals(this.mimeType, renderedDocument.mimeType) &&
        Objects.equals(this.title, renderedDocument.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, documentTemplateType, mimeType, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderedDocument {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documentTemplateType: ").append(toIndentedString(documentTemplateType)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

