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

import java.util.Objects;

import io.swagger.annotations.ApiModel;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionAffiliateDeleting extends SubscriptionAffiliateDeleted {
  
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAffiliateDeleting subscriptionAffiliateDeleting = (SubscriptionAffiliateDeleting) o;
    return Objects.equals(this.externalId, subscriptionAffiliateDeleting.externalId) &&
        Objects.equals(this.id, subscriptionAffiliateDeleting.id) &&
        Objects.equals(this.language, subscriptionAffiliateDeleting.language) &&
        Objects.equals(this.linkedSpaceId, subscriptionAffiliateDeleting.linkedSpaceId) &&
        Objects.equals(this.metaData, subscriptionAffiliateDeleting.metaData) &&
        Objects.equals(this.name, subscriptionAffiliateDeleting.name) &&
        Objects.equals(this.plannedPurgeDate, subscriptionAffiliateDeleting.plannedPurgeDate) &&
        Objects.equals(this.reference, subscriptionAffiliateDeleting.reference) && this.state
      == subscriptionAffiliateDeleting.state &&
        Objects.equals(this.version, subscriptionAffiliateDeleting.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, language, linkedSpaceId, metaData, name, plannedPurgeDate, reference, state, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAffiliateDeleting {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

