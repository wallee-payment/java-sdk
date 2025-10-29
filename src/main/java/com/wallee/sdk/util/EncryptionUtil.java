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
package com.wallee.sdk.util;

import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.WalleeSdkException;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/** Helper class to verify content body with signature */
public class EncryptionUtil {
  /**
   * Verify content with signature
   *
   * @param contentToVerify content that needs to be verified
   * @param contentSignature content verification signature
   * @param webhookEncryptionPublicKey public key
   * @param encryptionProvider encryption provider name
   * @param signatureAlgorithm signature encryption algorithm
   * @return true if content is verified by signature
   */
  public static boolean isContentValid(
      String contentToVerify,
      String contentSignature,
      String webhookEncryptionPublicKey,
      String encryptionProvider,
      String signatureAlgorithm) {
    PublicKey publicKey =
        getPublicKey(
            Base64.getDecoder().decode(webhookEncryptionPublicKey),
            encryptionProvider,
            signatureAlgorithm);
    Signature verifier = getSignature(signatureAlgorithm);
    try {
      verifier.initVerify(publicKey);
    } catch (InvalidKeyException e) {
      throw new WalleeSdkException(
          ErrorCode.WEBHOOK_ENCRYPTION_VERIFIER_INIT_ERROR,
          "Could not initialize encryption verifier due to public key issue: "
              + e.getLocalizedMessage());
    }
    try {
      verifier.update(contentToVerify.getBytes(StandardCharsets.UTF_8));
    } catch (SignatureException e) {
      throw new WalleeSdkException(
          ErrorCode.WEBHOOK_ENCRYPTION_VERIFIER_CONTENT_UPDATE_ERROR,
          "Could not update content in verifier due to verifier issue: " + e.getLocalizedMessage());
    }
    try {
      return verifier.verify(Base64.getDecoder().decode(contentSignature));
    } catch (SignatureException e) {
      throw new WalleeSdkException(
          ErrorCode.WEBHOOK_ENCRYPTION_SIGNATURE_VERIFICATION_FAILED,
          "Content verification failed due to unknown issue: " + e.getLocalizedMessage());
    }
  }

  private static PublicKey getPublicKey(
      byte[] publicKeyBytes, String encryptionProvider, String signatureAlgorithm) {
    try {
      return KeyFactory.getInstance(getPublicKeyAlgorithm(signatureAlgorithm), encryptionProvider)
          .generatePublic(new X509EncodedKeySpec(publicKeyBytes));
    } catch (InvalidKeySpecException e) {
      throw new WalleeSdkException(
          ErrorCode.INVALID_WEBHOOK_ENCRYPTION_PUBLIC_KEY, "Invalid public key");
    } catch (NoSuchAlgorithmException e) {
      throw new WalleeSdkException(
          ErrorCode.UNSUPPORTED_WEBHOOK_ENCRYPTION_ALGORYTHM,
          "Unknown webhook signature encryption algorithm: " + signatureAlgorithm);
    } catch (NoSuchProviderException e) {
      throw new WalleeSdkException(
          ErrorCode.UNKNOWN_WEBHOOK_ENCRYPTION_PROVIDER,
          "Unknown webhook signature encryption provider: " + encryptionProvider);
    }
  }

  private static Signature getSignature(String signatureAlgorithm) {
    try {
      return Signature.getInstance(signatureAlgorithm);
    } catch (NoSuchAlgorithmException e) {
      throw new WalleeSdkException(
          ErrorCode.UNSUPPORTED_WEBHOOK_ENCRYPTION_ALGORYTHM,
          "Unsupported signature algorithm: " + signatureAlgorithm);
    }
  }

  private static String getPublicKeyAlgorithm(String signatureAlgorithm) {
    String publicKeyAlgorithm;

    if (signatureAlgorithm.isEmpty()) {
      throw new WalleeSdkException(
          ErrorCode.MISSING_WEBHOOK_ENCRYPTION_ALGORYTHM,
          "Webhook signature algorythm was not provided");
    }

    switch (signatureAlgorithm) {
      case "SHA256withECDSA":
        publicKeyAlgorithm = "ECDSA";
        break;
      default:
        throw new WalleeSdkException(
            ErrorCode.UNSUPPORTED_WEBHOOK_ENCRYPTION_ALGORYTHM,
            "Unsupported webhook signature algorithm: '" + signatureAlgorithm + "'. "
            + "This may indicate that the REST API is using a new encryption algorithm for webhooks. "
            + "Please check whether a newer version of the SDK is available.");
    }
    return publicKeyAlgorithm;
  }
}
