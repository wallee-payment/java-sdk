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
package com.wallee.sdk.service;

import com.wallee.sdk.WalleeSdkException;
import com.wallee.sdk.util.EncryptionUtil;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Encryption util tests
 */
public class EncryptionUtilTest {
  private static final String SIGNATURE_ALGORITHM = "SHA256withECDSA";

  private static final String VALID_CONTENT_TO_VERIFY =
    "{\"entityId\":11,\"eventId\":35,\"listenerEntityId\":1472041829003,\"listenerEntityTechnicalName\":\"Transaction\",\"spaceId\":1,\"state\":\"PROCESSING\",\"timestamp\":\"2023-12-19T13:43:35+0000\",\"webhookListenerId\":2}";

  private static final String VALID_CONTENT_SIGNATURE =
    "MEYCIQCTzbMrMsOAC6T57T9kQTb1iGZVg2R7n6pY9A4ML4P31gIhAIOoav8cG8x0jpRWQztqSJIC8gXWKq+4DuENEySvmMYf";

  private final static String VALID_PUBLIC_KEY =
    "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdWq7ZBGsjUzhBO3e6mzUBLpjpV3TQw1bL1rk3ocjn5C5qne7TY0OBBhiWgaPtWlvUcqASz903vtfeSTQma+SBA==";


  @BeforeAll
  public static void init() {
    setupSecurityProvider();
  }

  @Test
  public void validationShouldPassForValidContentSignatureAndKey() {
    boolean validationResult =
      EncryptionUtil.isContentValid(
        VALID_CONTENT_TO_VERIFY,
        VALID_CONTENT_SIGNATURE,
        VALID_PUBLIC_KEY,
        BouncyCastleProvider.PROVIDER_NAME,
        SIGNATURE_ALGORITHM);

    assertTrue(validationResult, "Valid public key, signature and content must fit each other");
  }

  @Test
  public void validationShouldFailForBadContent() {
    boolean validationResult =
      EncryptionUtil.isContentValid(
        "ModifiedContent",
        VALID_CONTENT_SIGNATURE,
        VALID_PUBLIC_KEY,
        BouncyCastleProvider.PROVIDER_NAME,
        SIGNATURE_ALGORITHM);

    assertFalse(validationResult, "Invalid content should fail validation");
  }

  @Test
  public void validationShouldFailForBadSignatureFormat() {
    assertThrows(
      WalleeSdkException.class,
      () -> {
        EncryptionUtil.isContentValid(
          VALID_CONTENT_TO_VERIFY,
          "InvalidModifiedSignature",
          VALID_PUBLIC_KEY,
          BouncyCastleProvider.PROVIDER_NAME,
          SIGNATURE_ALGORITHM);
      },
      "Invalid signature should fail validation");
  }

  @Test
  public void validationShouldFailForBadSignatureBase64Format() {
    assertThrows(
      WalleeSdkException.class,
      () -> {
        EncryptionUtil.isContentValid(
          VALID_CONTENT_TO_VERIFY,
          "MEYCIQCTzbMrMsOAC6T57T9kQTb1iGZVg2R7n6pY9A4ML4P31gIhAIOoav8cG8x0jpRWQztqSJIC8gXWKq",
          VALID_PUBLIC_KEY,
          BouncyCastleProvider.PROVIDER_NAME,
          SIGNATURE_ALGORITHM);
      },
      "Invalid signature should fail validation");
  }

  @Test
  public void validationShouldFailForBadPublicKeyFormat() {
    assertThrows(
      WalleeSdkException.class,
      () -> {
        EncryptionUtil.isContentValid(
          VALID_CONTENT_TO_VERIFY,
          VALID_CONTENT_SIGNATURE,
          "InvalidModifiedPublicKey",
          BouncyCastleProvider.PROVIDER_NAME,
          SIGNATURE_ALGORITHM);
      },
      "Invalid public key should fail validation");
  }

  @Test
  public void validationShouldFailForBadPublicKeyBase64Format() {
    assertThrows(
      IllegalArgumentException.class,
      () -> {
        EncryptionUtil.isContentValid(
          VALID_CONTENT_TO_VERIFY,
          VALID_CONTENT_SIGNATURE,
          "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdWq7ZBGsjUzhBO3e6mzUBLpjpV3TQw1bL1rk3ocjn5C5qne7TY0OBBhiWgaPtWlvUcqASz903vtfeSTQm",
          BouncyCastleProvider.PROVIDER_NAME,
          SIGNATURE_ALGORITHM);
      },
      "Invalid public key should fail validation");
  }

  private static void setupSecurityProvider() {
    Security.addProvider(new BouncyCastleProvider());
  }
}
