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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Represents what's commonly known as an Indicator of compromise (IoC) in computer forensics. This
 * is an artifact observed on a network or in an operating system that, with high confidence,
 * indicates a computer intrusion. Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Indicator extends com.google.api.client.json.GenericJson {

  /**
   * List of domains associated to the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domains;

  /**
   * List of ip addresses associated to the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipAddresses;

  /**
   * The list of matched signatures indicating that the given process is present in the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProcessSignature> signatures;

  /**
   * List of domains associated to the Finding.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomains() {
    return domains;
  }

  /**
   * List of domains associated to the Finding.
   * @param domains domains or {@code null} for none
   */
  public Indicator setDomains(java.util.List<java.lang.String> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * List of ip addresses associated to the Finding.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * List of ip addresses associated to the Finding.
   * @param ipAddresses ipAddresses or {@code null} for none
   */
  public Indicator setIpAddresses(java.util.List<java.lang.String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * The list of matched signatures indicating that the given process is present in the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<ProcessSignature> getSignatures() {
    return signatures;
  }

  /**
   * The list of matched signatures indicating that the given process is present in the environment.
   * @param signatures signatures or {@code null} for none
   */
  public Indicator setSignatures(java.util.List<ProcessSignature> signatures) {
    this.signatures = signatures;
    return this;
  }

  @Override
  public Indicator set(String fieldName, Object value) {
    return (Indicator) super.set(fieldName, value);
  }

  @Override
  public Indicator clone() {
    return (Indicator) super.clone();
  }

}
