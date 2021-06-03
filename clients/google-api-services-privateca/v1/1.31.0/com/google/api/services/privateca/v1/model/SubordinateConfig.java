/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.privateca.v1.model;

/**
 * Describes a subordinate CA's issuers. This is either a resource name to a known issuing
 * CertificateAuthority, or a PEM issuer certificate chain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubordinateConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. This can refer to a CertificateAuthority in the same project that was used to create
   * a subordinate CertificateAuthority. This field is used for information and usability purposes
   * only. The resource name is in the format `projects/locations/caPools/certificateAuthorities`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificateAuthority;

  /**
   * Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but
   * not pem certificate for this CA itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubordinateConfigChain pemIssuerChain;

  /**
   * Required. This can refer to a CertificateAuthority in the same project that was used to create
   * a subordinate CertificateAuthority. This field is used for information and usability purposes
   * only. The resource name is in the format `projects/locations/caPools/certificateAuthorities`.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificateAuthority() {
    return certificateAuthority;
  }

  /**
   * Required. This can refer to a CertificateAuthority in the same project that was used to create
   * a subordinate CertificateAuthority. This field is used for information and usability purposes
   * only. The resource name is in the format `projects/locations/caPools/certificateAuthorities`.
   * @param certificateAuthority certificateAuthority or {@code null} for none
   */
  public SubordinateConfig setCertificateAuthority(java.lang.String certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
    return this;
  }

  /**
   * Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but
   * not pem certificate for this CA itself.
   * @return value or {@code null} for none
   */
  public SubordinateConfigChain getPemIssuerChain() {
    return pemIssuerChain;
  }

  /**
   * Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but
   * not pem certificate for this CA itself.
   * @param pemIssuerChain pemIssuerChain or {@code null} for none
   */
  public SubordinateConfig setPemIssuerChain(SubordinateConfigChain pemIssuerChain) {
    this.pemIssuerChain = pemIssuerChain;
    return this;
  }

  @Override
  public SubordinateConfig set(String fieldName, Object value) {
    return (SubordinateConfig) super.set(fieldName, value);
  }

  @Override
  public SubordinateConfig clone() {
    return (SubordinateConfig) super.clone();
  }

}
