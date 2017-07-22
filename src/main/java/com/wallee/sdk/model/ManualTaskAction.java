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
import com.wallee.sdk.model.ManualTaskActionStyle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ManualTaskAction {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("label")
	private Map<String, String> label = new HashMap<String, String>();

	@SerializedName("style")
	private ManualTaskActionStyle style = null;

	@SerializedName("taskType")
	private Long taskType = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public ManualTaskAction label(Map<String, String> label) {
		this.label = label;
		return this;
	}

	public ManualTaskAction putLabelItem(String key, String labelItem) {
		this.label.put(key, labelItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getLabel() {
		return label;
	}

	public void setLabel(Map<String, String> label) {
		this.label = label;
	}

	public ManualTaskAction style(ManualTaskActionStyle style) {
		this.style = style;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ManualTaskActionStyle getStyle() {
		return style;
	}

	public void setStyle(ManualTaskActionStyle style) {
		this.style = style;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getTaskType() {
		return taskType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ManualTaskAction manualTaskAction = (ManualTaskAction) o;
		return Objects.equals(this.id, manualTaskAction.id) &&
				Objects.equals(this.label, manualTaskAction.label) &&
				Objects.equals(this.style, manualTaskAction.style) &&
				Objects.equals(this.taskType, manualTaskAction.taskType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, style, taskType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ManualTaskAction {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		label: ").append(toIndentedString(label)).append("\n");
		sb.append("		style: ").append(toIndentedString(style)).append("\n");
		sb.append("		taskType: ").append(toIndentedString(taskType)).append("\n");
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

