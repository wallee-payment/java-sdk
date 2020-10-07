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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AbstractWebhookListenerUpdate
 */

public class AbstractWebhookListenerUpdate extends Indentable {

    @JsonProperty("entityStates")
    protected List<String> entityStates;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("notifyEveryChange")
    protected Boolean notifyEveryChange;


    @JsonProperty("state")
    protected CreationEntityState state;


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
     * The target state identifies the state into which entities need to move into to trigger the webhook listener.
     * @return entityStates
     **/
    @ApiModelProperty(value = "The target state identifies the state into which entities need to move into to trigger the webhook listener.")
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
     * The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
     * @return name
     **/
    @ApiModelProperty(value = "The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
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
     * Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.
     * @return notifyEveryChange
     **/
    @ApiModelProperty(value = "Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.")
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
     *
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }

    public void setState(CreationEntityState state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractWebhookListenerUpdate abstractWebhookListenerUpdate = (AbstractWebhookListenerUpdate) o;
        return Objects.equals(this.entityStates, abstractWebhookListenerUpdate.entityStates) &&
                Objects.equals(this.name, abstractWebhookListenerUpdate.name) &&
                Objects.equals(this.notifyEveryChange, abstractWebhookListenerUpdate.notifyEveryChange) && this.state
                == abstractWebhookListenerUpdate.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityStates, name, notifyEveryChange, state);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractWebhookListenerUpdate {\n");

        sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

