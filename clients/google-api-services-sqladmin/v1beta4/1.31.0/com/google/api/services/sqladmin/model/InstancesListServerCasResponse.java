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

package com.google.api.services.sqladmin.model;

/**
 * Instances ListServerCas response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesListServerCasResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activeVersion;

  /**
   * List of server CA certificates for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SslCert> certs;

  /**
   * This is always `sql#instancesListServerCas`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getActiveVersion() {
    return activeVersion;
  }

  /**
   * @param activeVersion activeVersion or {@code null} for none
   */
  public InstancesListServerCasResponse setActiveVersion(java.lang.String activeVersion) {
    this.activeVersion = activeVersion;
    return this;
  }

  /**
   * List of server CA certificates for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<SslCert> getCerts() {
    return certs;
  }

  /**
   * List of server CA certificates for the instance.
   * @param certs certs or {@code null} for none
   */
  public InstancesListServerCasResponse setCerts(java.util.List<SslCert> certs) {
    this.certs = certs;
    return this;
  }

  /**
   * This is always `sql#instancesListServerCas`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#instancesListServerCas`.
   * @param kind kind or {@code null} for none
   */
  public InstancesListServerCasResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public InstancesListServerCasResponse set(String fieldName, Object value) {
    return (InstancesListServerCasResponse) super.set(fieldName, value);
  }

  @Override
  public InstancesListServerCasResponse clone() {
    return (InstancesListServerCasResponse) super.clone();
  }

}
