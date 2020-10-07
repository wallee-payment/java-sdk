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

import java.util.List;
import java.util.Map;
import java.util.Objects;


@ApiModel(description = "")

public class Feature extends Indentable {

    @JsonProperty("beta")
    protected Boolean beta;


    @JsonProperty("category")
    protected FeatureCategory category;


    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("logoPath")
    protected String logoPath;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("requiredFeatures")
    protected List<Long> requiredFeatures;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    @JsonProperty("visible")
    protected Boolean visible;


    /**
     * @return beta
     **/
    @ApiModelProperty(value = "")
    public Boolean isBeta() {
        return beta;
    }


    /**
     * @return category
     **/
    @ApiModelProperty(value = "")
    public FeatureCategory getCategory() {
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
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return logoPath
     **/
    @ApiModelProperty(value = "")
    public String getLogoPath() {
        return logoPath;
    }


    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    /**
     * @return requiredFeatures
     **/
    @ApiModelProperty(value = "")
    public List<Long> getRequiredFeatures() {
        return requiredFeatures;
    }


    /**
     * @return sortOrder
     **/
    @ApiModelProperty(value = "")
    public Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * @return visible
     **/
    @ApiModelProperty(value = "")
    public Boolean isVisible() {
        return visible;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feature feature = (Feature) o;
        return Objects.equals(this.beta, feature.beta) &&
                Objects.equals(this.category, feature.category) &&
                Objects.equals(this.description, feature.description) &&
                Objects.equals(this.id, feature.id) &&
                Objects.equals(this.logoPath, feature.logoPath) &&
                Objects.equals(this.name, feature.name) &&
                Objects.equals(this.requiredFeatures, feature.requiredFeatures) &&
                Objects.equals(this.sortOrder, feature.sortOrder) &&
                Objects.equals(this.visible, feature.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beta, category, description, id, logoPath, name, requiredFeatures, sortOrder, visible);
    }


    @Override
    public String toString() {

        return "class Feature { \n" +
            "    beta: " + toIndentedString(beta) + " \n" +
            "    category: " + toIndentedString(category) + " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    logoPath: " + toIndentedString(logoPath) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    requiredFeatures: " + toIndentedString(requiredFeatures) +  "\n" +
            "    sortOrder: " + toIndentedString(sortOrder) + " \n" +
            "    visible: " + toIndentedString(visible) +  "\n" +
            "}";
        }


}

