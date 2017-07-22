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
import com.wallee.sdk.model.CriteriaOperator;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.EntityQueryFilterType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The query filter allows to restrict the entities which are returned.
 */
@io.swagger.annotations.ApiModel(description = "The query filter allows to restrict the entities which are returned.")
public class EntityQueryFilter {
	@SerializedName("children")
	private List<EntityQueryFilter> children = new ArrayList<EntityQueryFilter>();

	@SerializedName("fieldName")
	private String fieldName = null;

	@SerializedName("operator")
	private CriteriaOperator operator = null;

	@SerializedName("type")
	private EntityQueryFilterType type = null;

	@SerializedName("value")
	private Object value = null;

	public EntityQueryFilter children(List<EntityQueryFilter> children) {
		this.children = children;
		return this;
	}

	public EntityQueryFilter addChildrenItem(EntityQueryFilter childrenItem) {
		this.children.add(childrenItem);
		return this;
	}

	/**
	 * The 'children' can contain other filter nodes which are applied to the query. This property is only applicable on filter types 'OR' and 'AND'.
	 *
	 * @return The 'children' can contain other filter nodes which are applied to the query. This property is only applicable on filter types 'OR' and 'AND'.
	 */
	@ApiModelProperty(example = "null", value = "The 'children' can contain other filter nodes which are applied to the query. This property is only applicable on filter types 'OR' and 'AND'.")
	public List<EntityQueryFilter> getChildren() {
		return children;
	}

	public void setChildren(List<EntityQueryFilter> children) {
		this.children = children;
	}

	/**
	 * The 'fieldName' indicates the property on the entity which should be filtered. This property is only applicable on filter type 'LEAF'.
	 *
	 * @return The 'fieldName' indicates the property on the entity which should be filtered. This property is only applicable on filter type 'LEAF'.
	 */
	@ApiModelProperty(example = "null", value = "The 'fieldName' indicates the property on the entity which should be filtered. This property is only applicable on filter type 'LEAF'.")
	public String getFieldName() {
		return fieldName;
	}

	public EntityQueryFilter operator(CriteriaOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * The 'operator' indicates what kind of filtering on the 'fieldName' is executed on. This property is only applicable on filter type 'LEAF'.
	 *
	 * @return The 'operator' indicates what kind of filtering on the 'fieldName' is executed on. This property is only applicable on filter type 'LEAF'.
	 */
	@ApiModelProperty(example = "null", value = "The 'operator' indicates what kind of filtering on the 'fieldName' is executed on. This property is only applicable on filter type 'LEAF'.")
	public CriteriaOperator getOperator() {
		return operator;
	}

	public void setOperator(CriteriaOperator operator) {
		this.operator = operator;
	}

	public EntityQueryFilter type(EntityQueryFilterType type) {
		this.type = type;
		return this;
	}

	/**
	 * The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group.
	 *
	 * @return The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The filter type controls how the query node is interpreted. I.e. if the node acts as leaf node or as a filter group.")
	public EntityQueryFilterType getType() {
		return type;
	}

	public void setType(EntityQueryFilterType type) {
		this.type = type;
	}

	public EntityQueryFilter value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * The 'value' is used to compare with the 'fieldName' as defined by the 'operator'. This property is only applicable on filter type 'LEAF'.
	 *
	 * @return The 'value' is used to compare with the 'fieldName' as defined by the 'operator'. This property is only applicable on filter type 'LEAF'.
	 */
	@ApiModelProperty(example = "null", value = "The 'value' is used to compare with the 'fieldName' as defined by the 'operator'. This property is only applicable on filter type 'LEAF'.")
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EntityQueryFilter entityQueryFilter = (EntityQueryFilter) o;
		return Objects.equals(this.children, entityQueryFilter.children) &&
				Objects.equals(this.fieldName, entityQueryFilter.fieldName) &&
				Objects.equals(this.operator, entityQueryFilter.operator) &&
				Objects.equals(this.type, entityQueryFilter.type) &&
				Objects.equals(this.value, entityQueryFilter.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(children, fieldName, operator, type, value);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EntityQueryFilter {\n");
		
		sb.append("		children: ").append(toIndentedString(children)).append("\n");
		sb.append("		fieldName: ").append(toIndentedString(fieldName)).append("\n");
		sb.append("		operator: ").append(toIndentedString(operator)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
		sb.append("		value: ").append(toIndentedString(value)).append("\n");
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

