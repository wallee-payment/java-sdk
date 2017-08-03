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
import com.wallee.sdk.model.LabelDescriptor;

/**
 * Label
 */
public class Label {

	@SerializedName("content")
	private Object content = null;

	@SerializedName("contentAsString")
	private String contentAsString = null;

	@SerializedName("descriptor")
	private LabelDescriptor descriptor = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * content
	 *
	 * @return content
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * contentAsString
	 *
	 * @return contentAsString
	 */
	public String getContentAsString() {
		return contentAsString;
	}

	/**
	 * descriptor
	 *
	 * @return descriptor
	 */
	public LabelDescriptor getDescriptor() {
		return descriptor;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
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
		Label label = (Label) o;
		return Objects.equals(this.content, label.content) &&
				Objects.equals(this.contentAsString, label.contentAsString) &&
				Objects.equals(this.descriptor, label.descriptor) &&
				Objects.equals(this.id, label.id) &&
				Objects.equals(this.version, label.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, contentAsString, descriptor, id, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Label {\n");
		
		sb.append("		content: ").append(toIndentedString(content)).append("\n");
		sb.append("		contentAsString: ").append(toIndentedString(contentAsString)).append("\n");
		sb.append("		descriptor: ").append(toIndentedString(descriptor)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
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

