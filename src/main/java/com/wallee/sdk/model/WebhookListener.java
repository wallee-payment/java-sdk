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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.WebhookIdentity;
import com.wallee.sdk.model.WebhookUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class WebhookListener {
	@SerializedName("entity")
	private Long entity = null;

	@SerializedName("entityStates")
	private List<String> entityStates = new ArrayList<String>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("identity")
	private WebhookIdentity identity = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("notifyEveryChange")
	private Boolean notifyEveryChange = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("url")
	private WebhookUrl url = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The listener listens on state changes of the entity linked with the listener.
	 *
	 * @return The listener listens on state changes of the entity linked with the listener.
	 */
	@ApiModelProperty(example = "null", value = "The listener listens on state changes of the entity linked with the listener.")
	public Long getEntity() {
		return entity;
	}

	public WebhookListener entityStates(List<String> entityStates) {
		this.entityStates = entityStates;
		return this;
	}

	public WebhookListener addEntityStatesItem(String entityStatesItem) {
		this.entityStates.add(entityStatesItem);
		return this;
	}

	/**
	 * The target state identifies the state into which entities need to move into to trigger the webhook listener.
	 *
	 * @return The target state identifies the state into which entities need to move into to trigger the webhook listener.
	 */
	@ApiModelProperty(example = "null", value = "The target state identifies the state into which entities need to move into to trigger the webhook listener.")
	public List<String> getEntityStates() {
		return entityStates;
	}

	public void setEntityStates(List<String> entityStates) {
		this.entityStates = entityStates;
	}

	public WebhookListener id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public WebhookListener identity(WebhookIdentity identity) {
		this.identity = identity;
		return this;
	}

	/**
	 * The identity which will be used to sign messages sent by this listener.
	 *
	 * @return The identity which will be used to sign messages sent by this listener.
	 */
	@ApiModelProperty(example = "null", value = "The identity which will be used to sign messages sent by this listener.")
	public WebhookIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(WebhookIdentity identity) {
		this.identity = identity;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	@ApiModelProperty(example = "null", value = "The webhook listener name is used internally to identify the webhook listener in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
	public String getName() {
		return name;
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

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	public WebhookListener state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public WebhookListener url(WebhookUrl url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL which is invoked by the listener to notify the application about the event.
	 *
	 * @return The URL which is invoked by the listener to notify the application about the event.
	 */
	@ApiModelProperty(example = "null", value = "The URL which is invoked by the listener to notify the application about the event.")
	public WebhookUrl getUrl() {
		return url;
	}

	public void setUrl(WebhookUrl url) {
		this.url = url;
	}

	public WebhookListener version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
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
		WebhookListener webhookListener = (WebhookListener) o;
		return Objects.equals(this.entity, webhookListener.entity) &&
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
		return Objects.hash(entity, entityStates, id, identity, linkedSpaceId, name, notifyEveryChange, plannedPurgeDate, state, url, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookListener {\n");
		
		sb.append("		entity: ").append(toIndentedString(entity)).append("\n");
		sb.append("		entityStates: ").append(toIndentedString(entityStates)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		identity: ").append(toIndentedString(identity)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		url: ").append(toIndentedString(url)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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

