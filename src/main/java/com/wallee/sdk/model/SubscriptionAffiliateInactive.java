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

import java.util.Objects;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "")

public class SubscriptionAffiliateInactive extends SubscriptionAffiliateUpdate {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAffiliateInactive subscriptionAffiliateInactive = (SubscriptionAffiliateInactive) o;
        return Objects.equals(this.id, subscriptionAffiliateInactive.id) &&
                Objects.equals(this.version, subscriptionAffiliateInactive.version) &&
                Objects.equals(this.language, subscriptionAffiliateInactive.language) &&
                Objects.equals(this.metaData, subscriptionAffiliateInactive.metaData) &&
                Objects.equals(this.name, subscriptionAffiliateInactive.name) && this.state
                == subscriptionAffiliateInactive.state &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, language, metaData, name, state, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionAffiliateInactive { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) +  "\n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    metaData: " + toIndentedString(metaData) +  "\n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
        }


}

