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
import com.wallee.sdk.model.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Permission
 */
@JsonPropertyOrder({
  Permission.JSON_PROPERTY_PARENT,
  Permission.JSON_PROPERTY_FEATURE,
  Permission.JSON_PROPERTY_NAME,
  Permission.JSON_PROPERTY_PATH_TO_ROOT,
  Permission.JSON_PROPERTY_WEB_APP_ENABLED,
  Permission.JSON_PROPERTY_DESCRIPTION,
  Permission.JSON_PROPERTY_ID,
  Permission.JSON_PROPERTY_LEAF,
  Permission.JSON_PROPERTY_TITLE,
  Permission.JSON_PROPERTY_GROUP,
  Permission.JSON_PROPERTY_TWO_FACTOR_REQUIRED
})

public class Permission {
  public static final String JSON_PROPERTY_PARENT = "parent";
  private Long parent;

  public static final String JSON_PROPERTY_FEATURE = "feature";
  private Feature feature;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_PATH_TO_ROOT = "pathToRoot";
  private List<Long> pathToRoot = new ArrayList<>();

  public static final String JSON_PROPERTY_WEB_APP_ENABLED = "webAppEnabled";
  private Boolean webAppEnabled;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LEAF = "leaf";
  private Boolean leaf;

  public static final String JSON_PROPERTY_TITLE = "title";
  private Map<String, String> title = new HashMap<>();

  public static final String JSON_PROPERTY_GROUP = "group";
  private Boolean group;

  public static final String JSON_PROPERTY_TWO_FACTOR_REQUIRED = "twoFactorRequired";
  private Boolean twoFactorRequired;

  public Permission() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public Permission(
    @JsonProperty(JSON_PROPERTY_PARENT) Long parent, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_PATH_TO_ROOT) List<Long> pathToRoot, 
    @JsonProperty(JSON_PROPERTY_WEB_APP_ENABLED) Boolean webAppEnabled, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LEAF) Boolean leaf, 
    @JsonProperty(JSON_PROPERTY_TITLE) Map<String, String> title, 
    @JsonProperty(JSON_PROPERTY_GROUP) Boolean group, 
    @JsonProperty(JSON_PROPERTY_TWO_FACTOR_REQUIRED) Boolean twoFactorRequired
  ) {
    this();
    this.parent = parent;
    this.name = name;
    this.pathToRoot = pathToRoot;
    this.webAppEnabled = webAppEnabled;
    this.description = description;
    this.id = id;
    this.leaf = leaf;
    this.title = title;
    this.group = group;
    this.twoFactorRequired = twoFactorRequired;
  }

   /**
   * The group that this permission belongs to.
   * @return parent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParent() {
    return parent;
  }



  public Permission feature(Feature feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Feature getFeature() {
    return feature;
  }


  @JsonProperty(JSON_PROPERTY_FEATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeature(Feature feature) {
    this.feature = feature;
  }

   /**
   * The localized name of the object.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



   /**
   * All parents of this permission up to the root of the permission tree.
   * @return pathToRoot
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TO_ROOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPathToRoot() {
    return pathToRoot;
  }



   /**
   * Get webAppEnabled
   * @return webAppEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_APP_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebAppEnabled() {
    return webAppEnabled;
  }



   /**
   * The localized description of the object.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



   /**
   * Whether this is a leaf in the tree of permissions, and not a group.
   * @return leaf
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEAF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLeaf() {
    return leaf;
  }



   /**
   * The localized name of the object.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTitle() {
    return title;
  }



   /**
   * Whether this is a permission group.
   * @return group
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGroup() {
    return group;
  }



   /**
   * Whether users with this permission are required to enable two-factor authentication.
   * @return twoFactorRequired
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTwoFactorRequired() {
    return twoFactorRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.parent, permission.parent) &&
        Objects.equals(this.feature, permission.feature) &&
        Objects.equals(this.name, permission.name) &&
        Objects.equals(this.pathToRoot, permission.pathToRoot) &&
        Objects.equals(this.webAppEnabled, permission.webAppEnabled) &&
        Objects.equals(this.description, permission.description) &&
        Objects.equals(this.id, permission.id) &&
        Objects.equals(this.leaf, permission.leaf) &&
        Objects.equals(this.title, permission.title) &&
        Objects.equals(this.group, permission.group) &&
        Objects.equals(this.twoFactorRequired, permission.twoFactorRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, feature, name, pathToRoot, webAppEnabled, description, id, leaf, title, group, twoFactorRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathToRoot: ").append(toIndentedString(pathToRoot)).append("\n");
    sb.append("    webAppEnabled: ").append(toIndentedString(webAppEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
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

    // add `parent` to the URL query string
    if (getParent() != null) {
      try {
        joiner.add(String.format("%sparent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `feature` to the URL query string
    if (getFeature() != null) {
      joiner.add(getFeature().toUrlQueryString(prefix + "feature" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      for (String _key : getName().keySet()) {
        try {
          joiner.add(String.format("%sname%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getName().get(_key), URLEncoder.encode(String.valueOf(getName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `pathToRoot` to the URL query string
    if (getPathToRoot() != null) {
      for (int i = 0; i < getPathToRoot().size(); i++) {
        try {
          joiner.add(String.format("%spathToRoot%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPathToRoot().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `webAppEnabled` to the URL query string
    if (getWebAppEnabled() != null) {
      try {
        joiner.add(String.format("%swebAppEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebAppEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      for (String _key : getDescription().keySet()) {
        try {
          joiner.add(String.format("%sdescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getDescription().get(_key), URLEncoder.encode(String.valueOf(getDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `leaf` to the URL query string
    if (getLeaf() != null) {
      try {
        joiner.add(String.format("%sleaf%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLeaf()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      for (String _key : getTitle().keySet()) {
        try {
          joiner.add(String.format("%stitle%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getTitle().get(_key), URLEncoder.encode(String.valueOf(getTitle().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `group` to the URL query string
    if (getGroup() != null) {
      try {
        joiner.add(String.format("%sgroup%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroup()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `twoFactorRequired` to the URL query string
    if (getTwoFactorRequired() != null) {
      try {
        joiner.add(String.format("%stwoFactorRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTwoFactorRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

