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
import com.wallee.sdk.model.EntityQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The entity property export request contains the information required to create an export of a list of entities.
 */
@ApiModel(description = "The entity property export request contains the information required to create an export of a list of entities.")

public class EntityExportRequest {
  
  @JsonProperty("properties")
  protected List<String> properties = new ArrayList<>();

  
  @JsonProperty("query")
  protected EntityQuery query = null;

  
  
  public EntityExportRequest properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public EntityExportRequest addPropertiesItem(String propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The properties is a list of property paths which should be exported.
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "The properties is a list of property paths which should be exported.")
  public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }

  
  public EntityExportRequest query(EntityQuery query) {
    this.query = query;
    return this;
  }

   /**
   * The query limits the returned entries. The query allows to restrict the entries to return and it allows to control the order of them.
   * @return query
  **/
  @ApiModelProperty(value = "The query limits the returned entries. The query allows to restrict the entries to return and it allows to control the order of them.")
  public EntityQuery getQuery() {
    return query;
  }

  public void setQuery(EntityQuery query) {
    this.query = query;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityExportRequest entityExportRequest = (EntityExportRequest) o;
    return Objects.equals(this.properties, entityExportRequest.properties) &&
        Objects.equals(this.query, entityExportRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityExportRequest {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

