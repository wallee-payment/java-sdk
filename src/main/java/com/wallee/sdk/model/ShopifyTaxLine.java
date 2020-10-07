/**
*  SDK
*
* This library allows to interact with the  payment service.
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

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifyTaxLine extends Indentable {
  
  @JsonProperty("fractionRate")
  protected BigDecimal fractionRate;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("rate")
  protected BigDecimal rate;

  
  @JsonProperty("title")
  protected String title;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return fractionRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFractionRate() {
    return fractionRate;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRate() {
    return rate;
  }

  
   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifyTaxLine shopifyTaxLine = (ShopifyTaxLine) o;
    return Objects.equals(this.fractionRate, shopifyTaxLine.fractionRate) &&
        Objects.equals(this.id, shopifyTaxLine.id) &&
        Objects.equals(this.rate, shopifyTaxLine.rate) &&
        Objects.equals(this.title, shopifyTaxLine.title) &&
        Objects.equals(this.version, shopifyTaxLine.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fractionRate, id, rate, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifyTaxLine {\n");
    
    sb.append("    fractionRate: ").append(toIndentedString(fractionRate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

