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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class SubscriptionUpdate {
  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("version")
  protected Long version = null;

  
  @SerializedName("affiliate")
  protected Long affiliate = null;

  
  @SerializedName("description")
  protected String description = null;

  
  @SerializedName("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate = null;

  
  
  public SubscriptionUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public SubscriptionUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public SubscriptionUpdate affiliate(Long affiliate) {
    this.affiliate = affiliate;
    return this;
  }

   /**
   * 
   * @return affiliate
  **/
  @ApiModelProperty(value = "")
  public Long getAffiliate() {
    return affiliate;
  }

  public void setAffiliate(Long affiliate) {
    this.affiliate = affiliate;
  }

  
  public SubscriptionUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public SubscriptionUpdate plannedTerminationDate(OffsetDateTime plannedTerminationDate) {
    this.plannedTerminationDate = plannedTerminationDate;
    return this;
  }

   /**
   * 
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  public void setPlannedTerminationDate(OffsetDateTime plannedTerminationDate) {
    this.plannedTerminationDate = plannedTerminationDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdate subscriptionUpdate = (SubscriptionUpdate) o;
    return Objects.equals(this.id, subscriptionUpdate.id) &&
        Objects.equals(this.version, subscriptionUpdate.version) &&
        Objects.equals(this.affiliate, subscriptionUpdate.affiliate) &&
        Objects.equals(this.description, subscriptionUpdate.description) &&
        Objects.equals(this.plannedTerminationDate, subscriptionUpdate.plannedTerminationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, affiliate, description, plannedTerminationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
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

