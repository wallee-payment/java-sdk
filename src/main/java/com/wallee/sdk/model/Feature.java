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
import com.wallee.sdk.model.FeatureCategory;
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
 * Feature
 */
@JsonPropertyOrder({
  Feature.JSON_PROPERTY_REQUIRED_FEATURES,
  Feature.JSON_PROPERTY_VISIBLE,
  Feature.JSON_PROPERTY_LOGO_PATH,
  Feature.JSON_PROPERTY_SORT_ORDER,
  Feature.JSON_PROPERTY_NAME,
  Feature.JSON_PROPERTY_DESCRIPTION,
  Feature.JSON_PROPERTY_ID,
  Feature.JSON_PROPERTY_CATEGORY,
  Feature.JSON_PROPERTY_BETA
})

public class Feature {
  public static final String JSON_PROPERTY_REQUIRED_FEATURES = "requiredFeatures";
  @javax.annotation.Nullable
  private List<Long> requiredFeatures = new ArrayList<>();

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  @javax.annotation.Nullable
  private Boolean visible;

  public static final String JSON_PROPERTY_LOGO_PATH = "logoPath";
  @javax.annotation.Nullable
  private String logoPath;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  @javax.annotation.Nullable
  private FeatureCategory category;

  public static final String JSON_PROPERTY_BETA = "beta";
  @javax.annotation.Nullable
  private Boolean beta;

  public Feature() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Feature(
    @JsonProperty(JSON_PROPERTY_REQUIRED_FEATURES) List<Long> requiredFeatures, 
    @JsonProperty(JSON_PROPERTY_VISIBLE) Boolean visible, 
    @JsonProperty(JSON_PROPERTY_LOGO_PATH) String logoPath, 
    @JsonProperty(JSON_PROPERTY_SORT_ORDER) Integer sortOrder, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_BETA) Boolean beta
  ) {
    this();
    this.requiredFeatures = requiredFeatures;
    this.visible = visible;
    this.logoPath = logoPath;
    this.sortOrder = sortOrder;
    this.name = name;
    this.description = description;
    this.id = id;
    this.beta = beta;
  }

  /**
   * The features that must be enabled for this feature to work properly.
   * @return requiredFeatures
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getRequiredFeatures() {
    return requiredFeatures;
  }



  /**
   * Whether the feature is visible to the user.
   * @return visible
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }



  /**
   * The path to the feature&#39;s logo image.
   * @return logoPath
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoPath() {
    return logoPath;
  }



  /**
   * When listing features, they can be sorted by this number.
   * @return sortOrder
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }



  /**
   * The localized name of the object.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



  /**
   * The localized description of the object.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
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



  public Feature category(@javax.annotation.Nullable FeatureCategory category) {
    
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeatureCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(@javax.annotation.Nullable FeatureCategory category) {
    this.category = category;
  }

  /**
   * Whether the feature is in beta stage and there may still be some issues.
   * @return beta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBeta() {
    return beta;
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
    return Objects.equals(this.requiredFeatures, feature.requiredFeatures) &&
        Objects.equals(this.visible, feature.visible) &&
        Objects.equals(this.logoPath, feature.logoPath) &&
        Objects.equals(this.sortOrder, feature.sortOrder) &&
        Objects.equals(this.name, feature.name) &&
        Objects.equals(this.description, feature.description) &&
        Objects.equals(this.id, feature.id) &&
        Objects.equals(this.category, feature.category) &&
        Objects.equals(this.beta, feature.beta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredFeatures, visible, logoPath, sortOrder, name, description, id, category, beta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    sb.append("    requiredFeatures: ").append(toIndentedString(requiredFeatures)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
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

    // add `requiredFeatures` to the URL query string
    if (getRequiredFeatures() != null) {
      for (int i = 0; i < getRequiredFeatures().size(); i++) {
        try {
          joiner.add(String.format("%srequiredFeatures%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getRequiredFeatures().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `visible` to the URL query string
    if (getVisible() != null) {
      try {
        joiner.add(String.format("%svisible%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisible()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logoPath` to the URL query string
    if (getLogoPath() != null) {
      try {
        joiner.add(String.format("%slogoPath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogoPath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortOrder` to the URL query string
    if (getSortOrder() != null) {
      try {
        joiner.add(String.format("%ssortOrder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortOrder()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `category` to the URL query string
    if (getCategory() != null) {
      joiner.add(getCategory().toUrlQueryString(prefix + "category" + suffix));
    }

    // add `beta` to the URL query string
    if (getBeta() != null) {
      try {
        joiner.add(String.format("%sbeta%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBeta()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

