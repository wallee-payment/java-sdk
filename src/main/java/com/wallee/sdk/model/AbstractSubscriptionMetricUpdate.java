/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractSubscriptionMetricUpdate
 */
public class AbstractSubscriptionMetricUpdate {
  
  @SerializedName("description")
  protected DatabaseTranslatedStringCreate description = null;

  
  @SerializedName("name")
  protected DatabaseTranslatedStringCreate name = null;

  
  
  public AbstractSubscriptionMetricUpdate description(DatabaseTranslatedStringCreate description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public DatabaseTranslatedStringCreate getDescription() {
    return description;
  }

  public void setDescription(DatabaseTranslatedStringCreate description) {
    this.description = description;
  }

  
  public AbstractSubscriptionMetricUpdate name(DatabaseTranslatedStringCreate name) {
    this.name = name;
    return this;
  }

   /**
   * 
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractSubscriptionMetricUpdate abstractSubscriptionMetricUpdate = (AbstractSubscriptionMetricUpdate) o;
    return Objects.equals(this.description, abstractSubscriptionMetricUpdate.description) &&
        Objects.equals(this.name, abstractSubscriptionMetricUpdate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractSubscriptionMetricUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

