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

import io.swagger.annotations.ApiModel;

import java.util.Objects;


@ApiModel(description = "")

public class SubscriptionAffiliateDeleted extends SubscriptionAffiliate {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAffiliateDeleted subscriptionAffiliateDeleted = (SubscriptionAffiliateDeleted) o;
        return Objects.equals(this.externalId, subscriptionAffiliateDeleted.externalId) &&
                Objects.equals(this.id, subscriptionAffiliateDeleted.id) &&
                Objects.equals(this.language, subscriptionAffiliateDeleted.language) &&
                Objects.equals(this.linkedSpaceId, subscriptionAffiliateDeleted.linkedSpaceId) &&
                Objects.equals(this.metaData, subscriptionAffiliateDeleted.metaData) &&
                Objects.equals(this.name, subscriptionAffiliateDeleted.name) &&
                Objects.equals(this.plannedPurgeDate, subscriptionAffiliateDeleted.plannedPurgeDate) &&
                Objects.equals(this.reference, subscriptionAffiliateDeleted.reference) && this.state
                == subscriptionAffiliateDeleted.state &&
                Objects.equals(this.version, subscriptionAffiliateDeleted.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, id, language, linkedSpaceId, metaData, name, plannedPurgeDate, reference, state, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionAffiliateDeleted { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    externalId: " + toIndentedString(externalId) + " \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " +  toIndentedString(linkedSpaceId) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  " \n" +
            "    reference: " + toIndentedString(reference) + " \n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

