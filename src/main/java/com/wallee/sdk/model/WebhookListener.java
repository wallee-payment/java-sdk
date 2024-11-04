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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.WebhookIdentity;
import com.wallee.sdk.model.WebhookUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class WebhookListener {
  
  @JsonProperty("enablePayloadSignatureAndState")
  protected Boolean enablePayloadSignatureAndState = null;

  
  @JsonProperty("entity")
  protected Long entity = null;

  
  @JsonProperty("entityStates")
  protected List<String> entityStates = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("identity")
  protected WebhookIdentity identity = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("notifyEveryChange")
  protected Boolean notifyEveryChange = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("url")
  protected WebhookUrl url = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Whether signature header and &#39;state&#39; property are enabled in webhook payload.
   * @return enablePayloadSignatureAndState
  **/
  @ApiModelProperty(value = "Whether signature header and 'state' property are enabled in webhook payload.")
  public Boolean isEnablePayloadSignatureAndState() {
    return enablePayloadSignatureAndState;
  }

  
   /**
   * The entity that is to be monitored.
   * @return entity
  **/
  @ApiModelProperty(value = "The entity that is to be monitored.")
  public Long getEntity() {
    return entity;
  }

  
   /**
   * The entity&#39;s target states that are to be monitored.
   * @return entityStates
  **/
  @ApiModelProperty(value = "The entity's target states that are to be monitored.")
  public List<String> getEntityStates() {
    return entityStates;
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
   * The identity used to sign messages.
   * @return identity
  **/
  @ApiModelProperty(value = "The identity used to sign messages.")
  public WebhookIdentity getIdentity() {
    return identity;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name used to identify the webhook listener.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the webhook listener.")
  public String getName() {
    return name;
  }

  
   /**
   * Whether every update of the entity or only state changes are to be monitored.
   * @return notifyEveryChange
  **/
  @ApiModelProperty(value = "Whether every update of the entity or only state changes are to be monitored.")
  public Boolean isNotifyEveryChange() {
    return notifyEveryChange;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The URL where notifications about entity changes are sent to.
   * @return url
  **/
  @ApiModelProperty(value = "The URL where notifications about entity changes are sent to.")
  public WebhookUrl getUrl() {
    return url;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookListener webhookListener = (WebhookListener) o;
    return Objects.equals(this.enablePayloadSignatureAndState, webhookListener.enablePayloadSignatureAndState) &&
        Objects.equals(this.entity, webhookListener.entity) &&
        Objects.equals(this.entityStates, webhookListener.entityStates) &&
        Objects.equals(this.id, webhookListener.id) &&
        Objects.equals(this.identity, webhookListener.identity) &&
        Objects.equals(this.linkedSpaceId, webhookListener.linkedSpaceId) &&
        Objects.equals(this.name, webhookListener.name) &&
        Objects.equals(this.notifyEveryChange, webhookListener.notifyEveryChange) &&
        Objects.equals(this.plannedPurgeDate, webhookListener.plannedPurgeDate) &&
        Objects.equals(this.state, webhookListener.state) &&
        Objects.equals(this.url, webhookListener.url) &&
        Objects.equals(this.version, webhookListener.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePayloadSignatureAndState, entity, entityStates, id, identity, linkedSpaceId, name, notifyEveryChange, plannedPurgeDate, state, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListener {\n");
    
    sb.append("    enablePayloadSignatureAndState: ").append(toIndentedString(enablePayloadSignatureAndState)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

