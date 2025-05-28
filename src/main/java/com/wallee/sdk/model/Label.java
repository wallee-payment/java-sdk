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
import com.wallee.sdk.model.LabelDescriptor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Label {
  
  @JsonProperty("content")
  protected Object content = null;

  
  @JsonProperty("contentAsString")
  protected String contentAsString = null;

  
  @JsonProperty("descriptor")
  protected LabelDescriptor descriptor = null;

  
  
   /**
   * The label&#39;s actual content.
   * @return content
  **/
  @ApiModelProperty(value = "The label's actual content.")
  public Object getContent() {
    return content;
  }

  
   /**
   * The label&#39;s content formatted as string.
   * @return contentAsString
  **/
  @ApiModelProperty(value = "The label's content formatted as string.")
  public String getContentAsString() {
    return contentAsString;
  }

  
   /**
   * The descriptor that describes what information the label provides.
   * @return descriptor
  **/
  @ApiModelProperty(value = "The descriptor that describes what information the label provides.")
  public LabelDescriptor getDescriptor() {
    return descriptor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.content, label.content) &&
        Objects.equals(this.contentAsString, label.contentAsString) &&
        Objects.equals(this.descriptor, label.descriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentAsString, descriptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentAsString: ").append(toIndentedString(contentAsString)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

