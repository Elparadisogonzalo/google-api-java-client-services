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

package com.google.api.services.networksecurity.v1beta1.model;

/**
 * Specification of traffic source attributes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Source extends com.google.api.client.json.GenericJson {

  /**
   * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should
   * match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization
   * based on source IP alone should be avoided. The IP addresses of any load balancers or proxies
   * should be considered untrusted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipBlocks;

  /**
   * Optional. List of peer identities to match for authorization. At least one principal should
   * match. Each peer can be an exact match, or a prefix match (example, "namespace") or a suffix
   * match (example, // service-account") or a presence match "*". Authorization based on the
   * principal name without certificate validation (configured by ServerTlsPolicy resource) is
   * considered insecure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> principals;

  /**
   * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should
   * match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization
   * based on source IP alone should be avoided. The IP addresses of any load balancers or proxies
   * should be considered untrusted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpBlocks() {
    return ipBlocks;
  }

  /**
   * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should
   * match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization
   * based on source IP alone should be avoided. The IP addresses of any load balancers or proxies
   * should be considered untrusted.
   * @param ipBlocks ipBlocks or {@code null} for none
   */
  public Source setIpBlocks(java.util.List<java.lang.String> ipBlocks) {
    this.ipBlocks = ipBlocks;
    return this;
  }

  /**
   * Optional. List of peer identities to match for authorization. At least one principal should
   * match. Each peer can be an exact match, or a prefix match (example, "namespace") or a suffix
   * match (example, // service-account") or a presence match "*". Authorization based on the
   * principal name without certificate validation (configured by ServerTlsPolicy resource) is
   * considered insecure.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrincipals() {
    return principals;
  }

  /**
   * Optional. List of peer identities to match for authorization. At least one principal should
   * match. Each peer can be an exact match, or a prefix match (example, "namespace") or a suffix
   * match (example, // service-account") or a presence match "*". Authorization based on the
   * principal name without certificate validation (configured by ServerTlsPolicy resource) is
   * considered insecure.
   * @param principals principals or {@code null} for none
   */
  public Source setPrincipals(java.util.List<java.lang.String> principals) {
    this.principals = principals;
    return this;
  }

  @Override
  public Source set(String fieldName, Object value) {
    return (Source) super.set(fieldName, value);
  }

  @Override
  public Source clone() {
    return (Source) super.clone();
  }

}
