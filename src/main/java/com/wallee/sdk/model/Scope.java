/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Feature;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Scope
 */
@JsonPropertyOrder({
  Scope.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Scope.JSON_PROPERTY_SSL_ACTIVE,
  Scope.JSON_PROPERTY_VERSION,
  Scope.JSON_PROPERTY_MACHINE_NAME,
  Scope.JSON_PROPERTY_URL,
  Scope.JSON_PROPERTY_FEATURES,
  Scope.JSON_PROPERTY_THEMES,
  Scope.JSON_PROPERTY_PORT,
  Scope.JSON_PROPERTY_PREPROD_DOMAIN_NAME,
  Scope.JSON_PROPERTY_DOMAIN_NAME,
  Scope.JSON_PROPERTY_NAME,
  Scope.JSON_PROPERTY_ID,
  Scope.JSON_PROPERTY_STATE,
  Scope.JSON_PROPERTY_SANDBOX_DOMAIN_NAME
})

public class Scope {
  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_SSL_ACTIVE = "sslActive";
  @javax.annotation.Nullable
  private Boolean sslActive;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_MACHINE_NAME = "machineName";
  @javax.annotation.Nullable
  private String machineName;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_FEATURES = "features";
  @javax.annotation.Nullable
  private Set<Feature> features = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_THEMES = "themes";
  @javax.annotation.Nullable
  private List<String> themes = new ArrayList<>();

  public static final String JSON_PROPERTY_PORT = "port";
  @javax.annotation.Nullable
  private Integer port;

  public static final String JSON_PROPERTY_PREPROD_DOMAIN_NAME = "preprodDomainName";
  @javax.annotation.Nullable
  private String preprodDomainName;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  @javax.annotation.Nullable
  private String domainName;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_SANDBOX_DOMAIN_NAME = "sandboxDomainName";
  @javax.annotation.Nullable
  private String sandboxDomainName;

  public Scope() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Scope(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_SSL_ACTIVE) Boolean sslActive, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_MACHINE_NAME) String machineName, 
    @JsonProperty(JSON_PROPERTY_URL) String url, 
    @JsonProperty(JSON_PROPERTY_FEATURES) Set<Feature> features, 
    @JsonProperty(JSON_PROPERTY_THEMES) List<String> themes, 
    @JsonProperty(JSON_PROPERTY_PORT) Integer port, 
    @JsonProperty(JSON_PROPERTY_PREPROD_DOMAIN_NAME) String preprodDomainName, 
    @JsonProperty(JSON_PROPERTY_DOMAIN_NAME) String domainName, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_SANDBOX_DOMAIN_NAME) String sandboxDomainName
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.sslActive = sslActive;
    this.version = version;
    this.machineName = machineName;
    this.url = url;
    this.features = features;
    this.themes = themes;
    this.port = port;
    this.preprodDomainName = preprodDomainName;
    this.domainName = domainName;
    this.name = name;
    this.id = id;
    this.sandboxDomainName = sandboxDomainName;
  }

  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * Whether the scope supports SSL.
   * @return sslActive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSslActive() {
    return sslActive;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The name identifying the scope in e.g. URLs.
   * @return machineName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MACHINE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMachineName() {
    return machineName;
  }



  /**
   * The URL where the scope can be accessed.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }



  /**
   * The list of features that are active in the scope.
   * @return features
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Feature> getFeatures() {
    return features;
  }



  /**
   * The themes that determine the look and feel of the scope&#39;s user interface. A fall-through strategy is applied when building the actual theme.
   * @return themes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THEMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getThemes() {
    return themes;
  }



  /**
   * The port where the scope can be accessed.
   * minimum: 1
   * @return port
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }



  /**
   * The preprod domain name that belongs to the scope.
   * @return preprodDomainName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREPROD_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreprodDomainName() {
    return preprodDomainName;
  }



  /**
   * The domain name that belongs to the scope.
   * @return domainName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainName() {
    return domainName;
  }



  /**
   * The name used to identify the scope.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public Scope state(@javax.annotation.Nullable CreationEntityState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable CreationEntityState state) {
    this.state = state;
  }

  /**
   * The sandbox domain name that belongs to the scope.
   * @return sandboxDomainName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SANDBOX_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSandboxDomainName() {
    return sandboxDomainName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scope scope = (Scope) o;
    return Objects.equals(this.plannedPurgeDate, scope.plannedPurgeDate) &&
        Objects.equals(this.sslActive, scope.sslActive) &&
        Objects.equals(this.version, scope.version) &&
        Objects.equals(this.machineName, scope.machineName) &&
        Objects.equals(this.url, scope.url) &&
        Objects.equals(this.features, scope.features) &&
        Objects.equals(this.themes, scope.themes) &&
        Objects.equals(this.port, scope.port) &&
        Objects.equals(this.preprodDomainName, scope.preprodDomainName) &&
        Objects.equals(this.domainName, scope.domainName) &&
        Objects.equals(this.name, scope.name) &&
        Objects.equals(this.id, scope.id) &&
        Objects.equals(this.state, scope.state) &&
        Objects.equals(this.sandboxDomainName, scope.sandboxDomainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedPurgeDate, sslActive, version, machineName, url, features, themes, port, preprodDomainName, domainName, name, id, state, sandboxDomainName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    sslActive: ").append(toIndentedString(sslActive)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    preprodDomainName: ").append(toIndentedString(preprodDomainName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sandboxDomainName: ").append(toIndentedString(sandboxDomainName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sslActive` to the URL query string
    if (getSslActive() != null) {
      try {
        joiner.add(String.format("%ssslActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSslActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `machineName` to the URL query string
    if (getMachineName() != null) {
      try {
        joiner.add(String.format("%smachineName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMachineName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      int i = 0;
      for (Feature _item : getFeatures()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sfeatures%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `themes` to the URL query string
    if (getThemes() != null) {
      for (int i = 0; i < getThemes().size(); i++) {
        try {
          joiner.add(String.format("%sthemes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getThemes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      try {
        joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `preprodDomainName` to the URL query string
    if (getPreprodDomainName() != null) {
      try {
        joiner.add(String.format("%spreprodDomainName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreprodDomainName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domainName` to the URL query string
    if (getDomainName() != null) {
      try {
        joiner.add(String.format("%sdomainName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomainName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sandboxDomainName` to the URL query string
    if (getSandboxDomainName() != null) {
      try {
        joiner.add(String.format("%ssandboxDomainName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSandboxDomainName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

