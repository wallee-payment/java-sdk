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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The webhook encryption public key is used to verify the webhook content signature.
 */
@ApiModel(description = "The webhook encryption public key is used to verify the webhook content signature.")

public class WebhookEncryptionPublicKey {
  
  @JsonProperty("id")
  protected String id = null;

  
  @JsonProperty("publicKey")
  protected String publicKey = null;

  
  
   /**
   * The ID of encryption key
   * @return id
  **/
  @ApiModelProperty(value = "The ID of encryption key")
  public String getId() {
    return id;
  }

  
   /**
   * The BASE64 encoded public key
   * @return publicKey
  **/
  @ApiModelProperty(value = "The BASE64 encoded public key")
  public String getPublicKey() {
    return publicKey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEncryptionPublicKey webhookEncryptionPublicKey = (WebhookEncryptionPublicKey) o;
    return Objects.equals(this.id, webhookEncryptionPublicKey.id) &&
        Objects.equals(this.publicKey, webhookEncryptionPublicKey.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEncryptionPublicKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

