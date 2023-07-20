/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Feature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Scope {
  
  @JsonProperty("domainName")
  protected String domainName = null;

  
  @JsonProperty("features")
  protected List<Feature> features = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("machineName")
  protected String machineName = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("port")
  protected Integer port = null;

  
  @JsonProperty("sslActive")
  protected Boolean sslActive = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("themes")
  protected List<String> themes = null;

  
  @JsonProperty("url")
  protected String url = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The domain name that belongs to the scope.
   * @return domainName
  **/
  @ApiModelProperty(value = "The domain name that belongs to the scope.")
  public String getDomainName() {
    return domainName;
  }

  
   /**
   * The list of features that are active in the scope.
   * @return features
  **/
  @ApiModelProperty(value = "The list of features that are active in the scope.")
  public List<Feature> getFeatures() {
    return features;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The name identifying the scope in e.g. URLs.
   * @return machineName
  **/
  @ApiModelProperty(value = "The name identifying the scope in e.g. URLs.")
  public String getMachineName() {
    return machineName;
  }

  
   /**
   * The name used to identify the scope.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the scope.")
  public String getName() {
    return name;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The port where the scope can be accessed.
   * @return port
  **/
  @ApiModelProperty(value = "The port where the scope can be accessed.")
  public Integer getPort() {
    return port;
  }

  
   /**
   * Whether the scope supports SSL.
   * @return sslActive
  **/
  @ApiModelProperty(value = "Whether the scope supports SSL.")
  public Boolean isSslActive() {
    return sslActive;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The themes that determine the look and feel of the scope&#39;s user interface. A fall-through strategy is applied when building the actual theme.
   * @return themes
  **/
  @ApiModelProperty(value = "The themes that determine the look and feel of the scope's user interface. A fall-through strategy is applied when building the actual theme.")
  public List<String> getThemes() {
    return themes;
  }

  
   /**
   * The URL where the scope can be accessed.
   * @return url
  **/
  @ApiModelProperty(value = "The URL where the scope can be accessed.")
  public String getUrl() {
    return url;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
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
    Scope scope = (Scope) o;
    return Objects.equals(this.domainName, scope.domainName) &&
        Objects.equals(this.features, scope.features) &&
        Objects.equals(this.id, scope.id) &&
        Objects.equals(this.machineName, scope.machineName) &&
        Objects.equals(this.name, scope.name) &&
        Objects.equals(this.plannedPurgeDate, scope.plannedPurgeDate) &&
        Objects.equals(this.port, scope.port) &&
        Objects.equals(this.sslActive, scope.sslActive) &&
        Objects.equals(this.state, scope.state) &&
        Objects.equals(this.themes, scope.themes) &&
        Objects.equals(this.url, scope.url) &&
        Objects.equals(this.version, scope.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, features, id, machineName, name, plannedPurgeDate, port, sslActive, state, themes, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sslActive: ").append(toIndentedString(sslActive)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

