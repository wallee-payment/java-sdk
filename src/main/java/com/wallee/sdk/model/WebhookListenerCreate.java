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
import com.wallee.sdk.model.AbstractWebhookListenerUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class WebhookListenerCreate extends AbstractWebhookListenerUpdate {
  
  @JsonProperty("entity")
  protected Long entity = null;

  
  @JsonProperty("identity")
  protected Long identity = null;

  
  @JsonProperty("url")
  protected Long url = null;

  
  
  public WebhookListenerCreate entity(Long entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The listener listens on state changes of the entity linked with the listener.
   * @return entity
  **/
  @ApiModelProperty(required = true, value = "The listener listens on state changes of the entity linked with the listener.")
  public Long getEntity() {
    return entity;
  }

  public void setEntity(Long entity) {
    this.entity = entity;
  }

  
  public WebhookListenerCreate identity(Long identity) {
    this.identity = identity;
    return this;
  }

   /**
   * The identity which will be used to sign messages sent by this listener.
   * @return identity
  **/
  @ApiModelProperty(value = "The identity which will be used to sign messages sent by this listener.")
  public Long getIdentity() {
    return identity;
  }

  public void setIdentity(Long identity) {
    this.identity = identity;
  }

  
  public WebhookListenerCreate url(Long url) {
    this.url = url;
    return this;
  }

   /**
   * The URL which is invoked by the listener to notify the application about the event.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL which is invoked by the listener to notify the application about the event.")
  public Long getUrl() {
    return url;
  }

  public void setUrl(Long url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookListenerCreate webhookListenerCreate = (WebhookListenerCreate) o;
    return Objects.equals(this.entityStates, webhookListenerCreate.entityStates) &&
        Objects.equals(this.name, webhookListenerCreate.name) &&
        Objects.equals(this.notifyEveryChange, webhookListenerCreate.notifyEveryChange) &&
        Objects.equals(this.state, webhookListenerCreate.state) &&
        Objects.equals(this.entity, webhookListenerCreate.entity) &&
        Objects.equals(this.identity, webhookListenerCreate.identity) &&
        Objects.equals(this.url, webhookListenerCreate.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityStates, name, notifyEveryChange, state, entity, identity, url, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListenerCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

