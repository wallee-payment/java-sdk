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
import com.wallee.sdk.model.AbstractSubscriptionMetricUpdate;
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A metric represents the usage of a resource that can be measured.
 */
@io.swagger.annotations.ApiModel(description = "A metric represents the usage of a resource that can be measured.")
public class SubscriptionMetricCreate extends AbstractSubscriptionMetricUpdate {
	@SerializedName("description")
	private DatabaseTranslatedStringCreate description = null;

	@SerializedName("name")
	private DatabaseTranslatedStringCreate name = null;

	@SerializedName("type")
	private Long type = null;

	public SubscriptionMetricCreate description(DatabaseTranslatedStringCreate description) {
		this.description = description;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DatabaseTranslatedStringCreate getDescription() {
		return description;
	}

	public void setDescription(DatabaseTranslatedStringCreate description) {
		this.description = description;
	}

	public SubscriptionMetricCreate name(DatabaseTranslatedStringCreate name) {
		this.name = name;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public DatabaseTranslatedStringCreate getName() {
		return name;
	}

	public void setName(DatabaseTranslatedStringCreate name) {
		this.name = name;
	}

	public SubscriptionMetricCreate type(Long type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionMetricCreate subscriptionMetricCreate = (SubscriptionMetricCreate) o;
		return Objects.equals(this.description, subscriptionMetricCreate.description) &&
				Objects.equals(this.name, subscriptionMetricCreate.name) &&
				Objects.equals(this.type, subscriptionMetricCreate.type) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, name, type, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionMetricCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

