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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric represents the usage of a resource that can be measured.
 */
@ApiModel(description = "A metric represents the usage of a resource that can be measured.")

public class SubscriptionMetricUpdate extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("description")
    protected DatabaseTranslatedStringCreate description;


    @JsonProperty("name")
    protected DatabaseTranslatedStringCreate name;


    public SubscriptionMetricUpdate id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SubscriptionMetricUpdate version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    public SubscriptionMetricUpdate description(DatabaseTranslatedStringCreate description) {
        this.description = description;
        return this;
    }

    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public DatabaseTranslatedStringCreate getDescription() {
        return description;
    }

    public void setDescription(DatabaseTranslatedStringCreate description) {
        this.description = description;
    }


    public SubscriptionMetricUpdate name(DatabaseTranslatedStringCreate name) {
        this.name = name;
        return this;
    }

    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public DatabaseTranslatedStringCreate getName() {
        return name;
    }

    public void setName(DatabaseTranslatedStringCreate name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionMetricUpdate subscriptionMetricUpdate = (SubscriptionMetricUpdate) o;
        return Objects.equals(this.id, subscriptionMetricUpdate.id) &&
                Objects.equals(this.version, subscriptionMetricUpdate.version) &&
                Objects.equals(this.description, subscriptionMetricUpdate.description) &&
                Objects.equals(this.name, subscriptionMetricUpdate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, description, name);
    }


    @Override
    public String toString() {

        return "class SubscriptionMetricUpdate {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "    description: " + toIndentedString(description) +  "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "}";
        }


}

