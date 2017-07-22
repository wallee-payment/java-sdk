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
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AbstractSubscriptionMetricUpdate
 */
public class AbstractSubscriptionMetricUpdate {
	@SerializedName("description")
	private DatabaseTranslatedStringCreate description = null;

	@SerializedName("name")
	private DatabaseTranslatedStringCreate name = null;

	public AbstractSubscriptionMetricUpdate description(DatabaseTranslatedStringCreate description) {
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

	public AbstractSubscriptionMetricUpdate name(DatabaseTranslatedStringCreate name) {
		this.name = name;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DatabaseTranslatedStringCreate getName() {
		return name;
	}

	public void setName(DatabaseTranslatedStringCreate name) {
		this.name = name;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractSubscriptionMetricUpdate abstractSubscriptionMetricUpdate = (AbstractSubscriptionMetricUpdate) o;
		return Objects.equals(this.description, abstractSubscriptionMetricUpdate.description) &&
				Objects.equals(this.name, abstractSubscriptionMetricUpdate.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, name);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractSubscriptionMetricUpdate {\n");
		
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
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

