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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractWebhookListenerUpdate
 */

public class AbstractWebhookListenerUpdate {
  
  @JsonProperty("enablePayloadSignatureAndState")
  protected Boolean enablePayloadSignatureAndState = null;

  
  @JsonProperty("entityStates")
  protected List<String> entityStates = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("notifyEveryChange")
  protected Boolean notifyEveryChange = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  
  public AbstractWebhookListenerUpdate enablePayloadSignatureAndState(Boolean enablePayloadSignatureAndState) {
    this.enablePayloadSignatureAndState = enablePayloadSignatureAndState;
    return this;
  }

   /**
   * Whether signature header and state property are enabled in webhook payload.
   * @return enablePayloadSignatureAndState
  **/
  @ApiModelProperty(value = "Whether signature header and state property are enabled in webhook payload.")
  public Boolean isEnablePayloadSignatureAndState() {
    return enablePayloadSignatureAndState;
  }

  public void setEnablePayloadSignatureAndState(Boolean enablePayloadSignatureAndState) {
    this.enablePayloadSignatureAndState = enablePayloadSignatureAndState;
  }

  
  public AbstractWebhookListenerUpdate entityStates(List<String> entityStates) {
    this.entityStates = entityStates;
    return this;
  }

  public AbstractWebhookListenerUpdate addEntityStatesItem(String entityStatesItem) {
    if (this.entityStates == null) {
      this.entityStates = new ArrayList<>();
    }
    this.entityStates.add(entityStatesItem);
    return this;
  }

   /**
   * The entity&#39;s target states that are to be monitored.
   * @return entityStates
  **/
  @ApiModelProperty(value = "The entity's target states that are to be monitored.")
  public List<String> getEntityStates() {
    return entityStates;
  }

  public void setEntityStates(List<String> entityStates) {
    this.entityStates = entityStates;
  }

  
  public AbstractWebhookListenerUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the webhook listener.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the webhook listener.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public AbstractWebhookListenerUpdate notifyEveryChange(Boolean notifyEveryChange) {
    this.notifyEveryChange = notifyEveryChange;
    return this;
  }

   /**
   * Whether every update of the entity or only state changes are to be monitored.
   * @return notifyEveryChange
  **/
  @ApiModelProperty(value = "Whether every update of the entity or only state changes are to be monitored.")
  public Boolean isNotifyEveryChange() {
    return notifyEveryChange;
  }

  public void setNotifyEveryChange(Boolean notifyEveryChange) {
    this.notifyEveryChange = notifyEveryChange;
  }

  
  public AbstractWebhookListenerUpdate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractWebhookListenerUpdate abstractWebhookListenerUpdate = (AbstractWebhookListenerUpdate) o;
    return Objects.equals(this.enablePayloadSignatureAndState, abstractWebhookListenerUpdate.enablePayloadSignatureAndState) &&
        Objects.equals(this.entityStates, abstractWebhookListenerUpdate.entityStates) &&
        Objects.equals(this.name, abstractWebhookListenerUpdate.name) &&
        Objects.equals(this.notifyEveryChange, abstractWebhookListenerUpdate.notifyEveryChange) &&
        Objects.equals(this.state, abstractWebhookListenerUpdate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePayloadSignatureAndState, entityStates, name, notifyEveryChange, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractWebhookListenerUpdate {\n");
    
    sb.append("    enablePayloadSignatureAndState: ").append(toIndentedString(enablePayloadSignatureAndState)).append("\n");
    sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

