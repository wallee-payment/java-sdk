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
import com.wallee.sdk.model.enums.LabelDescriptorCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@ApiModel(description = "")

public class LabelDescriptor extends Indentable {

    @JsonProperty("category")
    protected LabelDescriptorCategory category;


    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("features")
    protected List<Long> features;


    @JsonProperty("group")
    protected Long group;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("type")
    protected Long type;


    @JsonProperty("weight")
    protected Integer weight;


    /**
     * @return category
     **/
    @ApiModelProperty(value = "")
    public LabelDescriptorCategory getCategory() {
        return category;
    }


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     * @return features
     **/
    @ApiModelProperty(value = "")
    public List<Long> getFeatures() {
        return features;
    }


    /**
     * @return group
     **/
    @ApiModelProperty(value = "")
    public Long getGroup() {
        return group;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public Long getType() {
        return type;
    }


    /**
     * @return weight
     **/
    @ApiModelProperty(value = "")
    public Integer getWeight() {
        return weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelDescriptor labelDescriptor = (LabelDescriptor) o;
        return this.category == labelDescriptor.category &&
                Objects.equals(this.description, labelDescriptor.description) &&
                Objects.equals(this.features, labelDescriptor.features) &&
                Objects.equals(this.group, labelDescriptor.group) &&
                Objects.equals(this.id, labelDescriptor.id) &&
                Objects.equals(this.name, labelDescriptor.name) &&
                Objects.equals(this.type, labelDescriptor.type) &&
                Objects.equals(this.weight, labelDescriptor.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, description, features, group, id, name, type, weight);
    }


    @Override
    public String toString() {

        return "class LabelDescriptor { \n" +
            "    category: " + toIndentedString(category) +  "\n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    features: " + toIndentedString(features) + "\n" +
            "    group: " + toIndentedString(group) + " \n" +
            "    id: " + toIndentedString(id) +  "\n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    type: " + toIndentedString(type) +  "\n" +
            "    weight: " + toIndentedString(weight) + " \n" +
            "}";
        }


}

