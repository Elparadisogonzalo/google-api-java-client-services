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

package com.google.api.services.iam.v1.model;

/**
 * A service account in the Identity and Access Management API.
 *
 * To create a service account, specify the `project_id` and the `account_id` for the account.  The
 * `account_id` is unique within the project, and is used to generate the service account email
 * address and a stable `unique_id`.
 *
 * If the account already exists, the account's resource name is returned in the format of
 * projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}. The caller can use the name in other methods to
 * access the account.
 *
 * All other methods can identify the service account using the format
 * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. Using `-` as a wildcard for the `PROJECT_ID`
 * will infer the project from the account. The `ACCOUNT` value can be the `email` address or the
 * `unique_id` of the service account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAccount extends com.google.api.client.json.GenericJson {

  /**
   * @OutputOnly A bool indicate if the service account is disabled. The field is currently in alpha
   * phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Optional. A user-specified name for the service account. Must be less than or equal to 100
   * UTF-8 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * @OutputOnly The email address of the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Optional. Note: `etag` is an inoperable legacy field that is only returned for backwards
   * compatibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   *
   * Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account`
   * and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
   *
   * In responses the resource name will always be in the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @OutputOnly The OAuth2 client id for the service account. This is used in conjunction with the
   * OAuth2 clientconfig API to make three legged OAuth2 (3LO) flows to access the data of Google
   * users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauth2ClientId;

  /**
   * @OutputOnly The id of the project that owns the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * @OutputOnly The unique and stable id of the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueId;

  /**
   * @OutputOnly A bool indicate if the service account is disabled. The field is currently in alpha
   * phase.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * @OutputOnly A bool indicate if the service account is disabled. The field is currently in alpha
   * phase.
   * @param disabled disabled or {@code null} for none
   */
  public ServiceAccount setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Optional. A user-specified name for the service account. Must be less than or equal to 100
   * UTF-8 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. A user-specified name for the service account. Must be less than or equal to 100
   * UTF-8 bytes.
   * @param displayName displayName or {@code null} for none
   */
  public ServiceAccount setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * @OutputOnly The email address of the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @OutputOnly The email address of the service account.
   * @param email email or {@code null} for none
   */
  public ServiceAccount setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Optional. Note: `etag` is an inoperable legacy field that is only returned for backwards
   * compatibility.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. Note: `etag` is an inoperable legacy field that is only returned for backwards
   * compatibility.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * Optional. Note: `etag` is an inoperable legacy field that is only returned for backwards
   * compatibility.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public ServiceAccount setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. Note: `etag` is an inoperable legacy field that is only returned for backwards
   * compatibility.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ServiceAccount encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   *
   * Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account`
   * and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
   *
   * In responses the resource name will always be in the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   *
   * Requests using `-` as a wildcard for the `PROJECT_ID` will infer the project from the `account`
   * and the `ACCOUNT` value can be the `email` address or the `unique_id` of the service account.
   *
   * In responses the resource name will always be in the format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * @param name name or {@code null} for none
   */
  public ServiceAccount setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @OutputOnly The OAuth2 client id for the service account. This is used in conjunction with the
   * OAuth2 clientconfig API to make three legged OAuth2 (3LO) flows to access the data of Google
   * users.
   * @return value or {@code null} for none
   */
  public java.lang.String getOauth2ClientId() {
    return oauth2ClientId;
  }

  /**
   * @OutputOnly The OAuth2 client id for the service account. This is used in conjunction with the
   * OAuth2 clientconfig API to make three legged OAuth2 (3LO) flows to access the data of Google
   * users.
   * @param oauth2ClientId oauth2ClientId or {@code null} for none
   */
  public ServiceAccount setOauth2ClientId(java.lang.String oauth2ClientId) {
    this.oauth2ClientId = oauth2ClientId;
    return this;
  }

  /**
   * @OutputOnly The id of the project that owns the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * @OutputOnly The id of the project that owns the service account.
   * @param projectId projectId or {@code null} for none
   */
  public ServiceAccount setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * @OutputOnly The unique and stable id of the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueId() {
    return uniqueId;
  }

  /**
   * @OutputOnly The unique and stable id of the service account.
   * @param uniqueId uniqueId or {@code null} for none
   */
  public ServiceAccount setUniqueId(java.lang.String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  @Override
  public ServiceAccount set(String fieldName, Object value) {
    return (ServiceAccount) super.set(fieldName, value);
  }

  @Override
  public ServiceAccount clone() {
    return (ServiceAccount) super.clone();
  }

}
