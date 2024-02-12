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


package com.wallee.sdk.util;

import com.google.api.client.http.UriTemplate;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.http.client.utils.URIBuilder;

/**
 * Helper class for creating and modifying URIBuilder {@link  URIBuilder}
 */
public final class URIBuilderUtil {
	/**
	 * Create a new URIBuilder instance from url
	 *
	 * @throws IllegalArgumentException if url is not a valid URI template or is null.
	 * @param url to be used as URI
	 * @return a new {@link URIBuilder}
	 */
	public static URIBuilder create(String url) {
		try {
			return new URIBuilder(url);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Invalid URI: " + e.getLocalizedMessage());
		}
	}

	/**
     * Create a new {@link URIBuilder} instance from url with parameters
     *
     * @throws IllegalArgumentException if url is not a valid URI template or is null.
     * @param url to be used as URI template
     * @param pathParameters path parameters to be resolved in url
     * @return a new {@link URIBuilder}
     */
    public static URIBuilder create(String url, Map<String, Object> pathParameters) {
        try {
            return new URIBuilder(UriTemplate.expand(url, pathParameters, false));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URI: " + e.getLocalizedMessage());
        }
    }

	/**
	 * Build {@link URIBuilder} to {@link URI}
	 *
	 * @throws IllegalArgumentException if url is not a valid URI template or is null.
	 * @param uriBuilder {@link URIBuilder} to build
	 * @return a new {@link URI}
	 */
	public static URI build(URIBuilder uriBuilder) {
		try {
			return uriBuilder.build();
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Invalid URI: " + e.getLocalizedMessage());
		}
	}

	/**
	 * Apply query parameter
	 * @param uriBuilder uri builder instance query parameters will applied to
	 * @param paramName query parameter name
	 * @param paramValue query parameter value
	 * @return uri builder with applied parameters
	 */
	public static URIBuilder applyQueryParam(URIBuilder uriBuilder, String paramName, Object paramValue) {
		if (paramValue instanceof Collection) {
			uriBuilder = applyCollection(uriBuilder, paramName, ((Collection) paramValue).toArray());
		} else if (paramValue instanceof Object[]) {
			uriBuilder = applyCollection(uriBuilder, paramName, (Object[]) paramValue);
		} else {
			uriBuilder = uriBuilder.addParameter(paramName, paramValue.toString());
		}
		return uriBuilder;
	}

	private static URIBuilder applyCollection(URIBuilder uriBuilder, String paramName, Object[] paramValues) {
		for (Object paramValue: paramValues) {
			uriBuilder.addParameter(paramName, paramValue.toString());
		}
		return uriBuilder;
	}
}
