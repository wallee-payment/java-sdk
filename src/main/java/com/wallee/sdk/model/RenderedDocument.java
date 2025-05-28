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

public class RenderedDocument {
  
  @JsonProperty("data")
  protected byte[] data = null;

  
  @JsonProperty("documentTemplateType")
  protected Long documentTemplateType = null;

  
  @JsonProperty("mimeType")
  protected String mimeType = null;

  
  @JsonProperty("title")
  protected String title = null;

  
  
  public RenderedDocument data(byte[] data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  
   /**
   * The document&#39;s template type
   * @return documentTemplateType
  **/
  @ApiModelProperty(value = "The document's template type")
  public Long getDocumentTemplateType() {
    return documentTemplateType;
  }

  
   /**
   * The document&#39;s content type
   * @return mimeType
  **/
  @ApiModelProperty(value = "The document's content type")
  public String getMimeType() {
    return mimeType;
  }

  
   /**
   * The title of the rendered document
   * @return title
  **/
  @ApiModelProperty(value = "The title of the rendered document")
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
    return Arrays.equals(this.data, renderedDocument.data) &&
        Objects.equals(this.documentTemplateType, renderedDocument.documentTemplateType) &&
        Objects.equals(this.mimeType, renderedDocument.mimeType) &&
        Objects.equals(this.title, renderedDocument.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(data), documentTemplateType, mimeType, title);
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

