/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class WebhookListenerCreate extends AbstractWebhookListenerUpdate {

    @JsonProperty("entity")
    protected Long entity;


    @JsonProperty("identity")
    protected Long identity;


    @JsonProperty("url")
    protected Long url;


    public WebhookListenerCreate entity(Long entity) {
        this.entity = entity;
        return this;
    }

    /**
     * The listener listens on state changes of the entity linked with the listener.
     *
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
     *
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
     *
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookListenerCreate webhookListenerCreate = (WebhookListenerCreate) o;
        return Objects.equals(this.entityStates, webhookListenerCreate.entityStates) &&
                Objects.equals(this.name, webhookListenerCreate.name) &&
                Objects.equals(this.notifyEveryChange, webhookListenerCreate.notifyEveryChange) && this.state
                == webhookListenerCreate.state &&
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
        return "class WebhookListenerCreate {\n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    entityStates: " + toIndentedString(entityStates) + "\n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    notifyEveryChange: " + toIndentedString(notifyEveryChange) + "\n" +
            "    state: " +  toIndentedString(state) + "\n" +
            "    entity: " + toIndentedString(entity) + "\n" +
            "    identity: " +  toIndentedString(identity) + "\n" +
            "    url: " + toIndentedString(url) + "\n" +
            "}";
        }


}

