/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.AbstractWebhookListenerUpdate;
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class WebhookListenerCreate extends AbstractWebhookListenerUpdate {
	@SerializedName("entity")
	private Long entity = null;

	@SerializedName("entityStates")
	private List<String> entityStates = new ArrayList<String>();

	@SerializedName("identity")
	private Long identity = null;

	@SerializedName("notifyEveryChange")
	private Boolean notifyEveryChange = null;

	@SerializedName("url")
	private Long url = null;

	public WebhookListenerCreate entity(Long entity) {
		this.entity = entity;
		return this;
	}

	/**
	 * The listener listens on state changes of the entity linked with the listener.
	 *
	 * @return The listener listens on state changes of the entity linked with the listener.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The listener listens on state changes of the entity linked with the listener.")
	public Long getEntity() {
		return entity;
	}

	public void setEntity(Long entity) {
		this.entity = entity;
	}

	public WebhookListenerCreate entityStates(List<String> entityStates) {
		this.entityStates = entityStates;
		return this;
	}

	public WebhookListenerCreate addEntityStatesItem(String entityStatesItem) {
		this.entityStates.add(entityStatesItem);
		return this;
	}

	/**
	 * The target state identifies the state into which entities need to move into to trigger the webhook listener.
	 *
	 * @return The target state identifies the state into which entities need to move into to trigger the webhook listener.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The target state identifies the state into which entities need to move into to trigger the webhook listener.")
	public List<String> getEntityStates() {
		return entityStates;
	}

	public void setEntityStates(List<String> entityStates) {
		this.entityStates = entityStates;
	}

	public WebhookListenerCreate identity(Long identity) {
		this.identity = identity;
		return this;
	}

	/**
	 * The identity which will be used to sign messages sent by this listener.
	 *
	 * @return The identity which will be used to sign messages sent by this listener.
	 */
	@ApiModelProperty(example = "null", value = "The identity which will be used to sign messages sent by this listener.")
	public Long getIdentity() {
		return identity;
	}

	public void setIdentity(Long identity) {
		this.identity = identity;
	}

	public WebhookListenerCreate notifyEveryChange(Boolean notifyEveryChange) {
		this.notifyEveryChange = notifyEveryChange;
		return this;
	}

	/**
	 * Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.
	 *
	 * @return Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.
	 */
	@ApiModelProperty(example = "null", value = "Defines whether the webhook listener is to be informed about every change made to the entity in contrast to state transitions only.")
	public Boolean getNotifyEveryChange() {
		return notifyEveryChange;
	}

	public void setNotifyEveryChange(Boolean notifyEveryChange) {
		this.notifyEveryChange = notifyEveryChange;
	}

	public WebhookListenerCreate url(Long url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL which is invoked by the listener to notify the application about the event.
	 *
	 * @return The URL which is invoked by the listener to notify the application about the event.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The URL which is invoked by the listener to notify the application about the event.")
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
		return Objects.equals(this.entity, webhookListenerCreate.entity) &&
				Objects.equals(this.entityStates, webhookListenerCreate.entityStates) &&
				Objects.equals(this.identity, webhookListenerCreate.identity) &&
				Objects.equals(this.notifyEveryChange, webhookListenerCreate.notifyEveryChange) &&
				Objects.equals(this.url, webhookListenerCreate.url) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(entity, entityStates, identity, notifyEveryChange, url, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookListenerCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		entity: ").append(toIndentedString(entity)).append("\n");
		sb.append("		entityStates: ").append(toIndentedString(entityStates)).append("\n");
		sb.append("		identity: ").append(toIndentedString(identity)).append("\n");
		sb.append("		notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
		sb.append("		url: ").append(toIndentedString(url)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

