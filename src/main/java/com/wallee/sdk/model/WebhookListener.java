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
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class WebhookListener {
  
  @JsonProperty("entity")
  protected Long entity;

  
  @JsonProperty("entityStates")
  protected List<String> entityStates;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("identity")
  protected WebhookIdentity identity;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("name")
  protected String name;

  
  @JsonProperty("notifyEveryChange")
  protected Boolean notifyEveryChange;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("state")
  protected CreationEntityState state;

  
  @JsonProperty("url")
  protected WebhookUrl url;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The listener listens on state changes of the entity linked with the listener.
   * @return entity
  **/
  @ApiModelProperty(value = "The listener listens on state changes of the entity linked with the listener.")
  public Long getEntity() {
    return entity;
  }

  
   /**
   * The target state identifies the state into which entities need to move into to trigger the webhook listener.
   * @return entityStates
  **/
  @ApiModelProperty(value = "The target state identifies the state into which entities need to move into to trigger the webhook listener.")
  public List<String> getEntityStates() {
    return entityStates;
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
   * The identity which will be used to sign messages sent by this listener.
   * @return identity
  **/
  @ApiModelProperty(value = "The identity which will be used to sign messages sent by this listener.")
  public WebhookIdentity getIdentity() {
    return identity;
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
   * The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.
   * @return notifyEveryChange
  **/
  @ApiModelProperty(value = "Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.")
  public Boolean isNotifyEveryChange() {
    return notifyEveryChange;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The URL which is invoked by the listener to notify the application about the event.
   * @return url
  **/
  @ApiModelProperty(value = "The URL which is invoked by the listener to notify the application about the event.")
  public WebhookUrl getUrl() {
    return url;
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
    WebhookListener webhookListener = (WebhookListener) o;
    return Objects.equals(this.entity, webhookListener.entity) &&
        Objects.equals(this.entityStates, webhookListener.entityStates) &&
        Objects.equals(this.id, webhookListener.id) &&
        Objects.equals(this.identity, webhookListener.identity) &&
        Objects.equals(this.linkedSpaceId, webhookListener.linkedSpaceId) &&
        Objects.equals(this.name, webhookListener.name) &&
        Objects.equals(this.notifyEveryChange, webhookListener.notifyEveryChange) &&
        Objects.equals(this.plannedPurgeDate, webhookListener.plannedPurgeDate) && this.state == webhookListener.state
      &&
        Objects.equals(this.url, webhookListener.url) &&
        Objects.equals(this.version, webhookListener.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, entityStates, id, identity, linkedSpaceId, name, notifyEveryChange, plannedPurgeDate, state, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListener {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

