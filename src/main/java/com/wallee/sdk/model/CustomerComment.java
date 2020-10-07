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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerComment extends Indentable {
  
  @JsonProperty("content")
  protected String content;

  
  @JsonProperty("createdBy")
  protected Long createdBy;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("customer")
  protected Long customer;

  
  @JsonProperty("editedBy")
  protected Long editedBy;

  
  @JsonProperty("editedOn")
  protected OffsetDateTime editedOn;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("pinned")
  protected Boolean pinned;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Long getCustomer() {
    return customer;
  }

  
   /**
   * 
   * @return editedBy
  **/
  @ApiModelProperty(value = "")
  public Long getEditedBy() {
    return editedBy;
  }

  
   /**
   * The date on which the comment was last edited.
   * @return editedOn
  **/
  @ApiModelProperty(value = "The date on which the comment was last edited.")
  public OffsetDateTime getEditedOn() {
    return editedOn;
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return pinned
  **/
  @ApiModelProperty(value = "")
  public Boolean isPinned() {
    return pinned;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerComment customerComment = (CustomerComment) o;
    return Objects.equals(this.content, customerComment.content) &&
        Objects.equals(this.createdBy, customerComment.createdBy) &&
        Objects.equals(this.createdOn, customerComment.createdOn) &&
        Objects.equals(this.customer, customerComment.customer) &&
        Objects.equals(this.editedBy, customerComment.editedBy) &&
        Objects.equals(this.editedOn, customerComment.editedOn) &&
        Objects.equals(this.id, customerComment.id) &&
        Objects.equals(this.linkedSpaceId, customerComment.linkedSpaceId) &&
        Objects.equals(this.pinned, customerComment.pinned) &&
        Objects.equals(this.version, customerComment.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, createdBy, createdOn, customer, editedBy, editedOn, id, linkedSpaceId, pinned, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerComment {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    editedBy: ").append(toIndentedString(editedBy)).append("\n");
    sb.append("    editedOn: ").append(toIndentedString(editedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

