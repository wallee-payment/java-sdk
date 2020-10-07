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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionCommentActive extends AbstractTransactionCommentActive {
  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("version")
  protected Long version;

  
  
  public TransactionCommentActive id(Long id) {
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

  
  public TransactionCommentActive version(Long version) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCommentActive transactionCommentActive = (TransactionCommentActive) o;
    return Objects.equals(this.content, transactionCommentActive.content) &&
        Objects.equals(this.id, transactionCommentActive.id) &&
        Objects.equals(this.version, transactionCommentActive.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCommentActive {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

