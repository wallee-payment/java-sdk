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
package com.wallee.sdk.auth;

import com.wallee.sdk.Pair;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.*;


public class HttpBearerAuth implements Authentication {

  private final Long userId;
  private final String authenticationKey;

  public HttpBearerAuth(Long userId, String authenticationKey) {
    this.userId = userId;
    this.authenticationKey = authenticationKey;
  }

  @Override
  public void applyToParams(String url,
                            String baseUrl,
                            String path,
                            String method,
                            List<Pair> queryParams,
                            Map<String, String> headerParams,
                            Map<String, String> cookieParams) {
    String requestPath = String.format("/api/v2.0%s", url.replaceFirst(baseUrl, ""));
    Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(this.authenticationKey.getBytes()));

    // Generate the JWT token
    String jwtToken = Jwts.builder()
      .header()
        .add("type", "JWT")
        .add("ver", 1)
        .and()
      .subject(this.userId.toString())
      .issuedAt(new Date())
      .claim("requestPath", requestPath)
      .claim("requestMethod", method)
      .signWith(key, SignatureAlgorithm.HS256)
      .compact();

    headerParams.put("Authorization", "Bearer " + jwtToken);
  }
}