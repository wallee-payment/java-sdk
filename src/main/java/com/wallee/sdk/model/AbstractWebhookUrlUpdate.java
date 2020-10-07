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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AbstractWebhookUrlUpdate
 */

public class AbstractWebhookUrlUpdate extends Indentable {

    @JsonProperty("name")
    protected String name;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("url")
    protected String url;


    public AbstractWebhookUrlUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The URL name is used internally to identify the URL in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The URL name is used internally to identify the URL in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AbstractWebhookUrlUpdate state(CreationEntityState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }

    public void setState(CreationEntityState state) {
        this.state = state;
    }


    public AbstractWebhookUrlUpdate url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL to which the HTTP requests are sent to. An example URL could look like https://www.example.com/some/path?some-query-parameter&#x3D;value.
     *
     * @return url
     **/
    @ApiModelProperty(value = "The URL to which the HTTP requests are sent to. An example URL could look like https://www.example.com/some/path?some-query-parameter=value.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractWebhookUrlUpdate abstractWebhookUrlUpdate = (AbstractWebhookUrlUpdate) o;
        return Objects.equals(this.name, abstractWebhookUrlUpdate.name) && this.state == abstractWebhookUrlUpdate.state &&
                Objects.equals(this.url, abstractWebhookUrlUpdate.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractWebhookUrlUpdate {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

