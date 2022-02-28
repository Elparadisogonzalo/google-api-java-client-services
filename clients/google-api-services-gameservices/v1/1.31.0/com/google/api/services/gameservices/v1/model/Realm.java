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

package com.google.api.services.gameservices.v1.model;

/**
 * A realm resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Realm extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Human readable description of the realm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The labels associated with this realm. Each label is a key-value pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name of the realm, in the following form:
   * `projects/{project}/locations/{locationId}/realms/{realmId}`. For example, `projects/my-
   * project/locations/global/realms/my-realm`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Time zone where all policies targeting this realm are evaluated. The value of this
   * field must be from the [IANA time zone database](https://www.iana.org/time-zones).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Realm setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Human readable description of the realm.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human readable description of the realm.
   * @param description description or {@code null} for none
   */
  public Realm setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @param etag etag or {@code null} for none
   */
  public Realm setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The labels associated with this realm. Each label is a key-value pair.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this realm. Each label is a key-value pair.
   * @param labels labels or {@code null} for none
   */
  public Realm setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name of the realm, in the following form:
   * `projects/{project}/locations/{locationId}/realms/{realmId}`. For example, `projects/my-
   * project/locations/global/realms/my-realm`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the realm, in the following form:
   * `projects/{project}/locations/{locationId}/realms/{realmId}`. For example, `projects/my-
   * project/locations/global/realms/my-realm`.
   * @param name name or {@code null} for none
   */
  public Realm setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Time zone where all policies targeting this realm are evaluated. The value of this
   * field must be from the [IANA time zone database](https://www.iana.org/time-zones).
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Required. Time zone where all policies targeting this realm are evaluated. The value of this
   * field must be from the [IANA time zone database](https://www.iana.org/time-zones).
   * @param timeZone timeZone or {@code null} for none
   */
  public Realm setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Realm setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Realm set(String fieldName, Object value) {
    return (Realm) super.set(fieldName, value);
  }

  @Override
  public Realm clone() {
    return (Realm) super.clone();
  }

}
