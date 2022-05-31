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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * A TagKey, used to group a set of TagValues.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TagKey extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Entity tag which users can pass to prevent race conditions. This field is always set
   * in server responses. See UpdateTagKeyRequest for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where
   * `tag_key_id` is the generated numeric id for the TagKey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Immutable. Namespaced name of the TagKey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespacedName;

  /**
   * Immutable. The resource name of the new TagKey's parent. Must be of the form
   * `organizations/{org_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy
   * engine, and will involve that policy engine in management operations involving this Tag. A
   * purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by
   * other policy engines. A purpose cannot be changed once set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purpose;

  /**
   * Optional. Purpose data corresponds to the policy system that the tag is intended for. See
   * documentation for `Purpose` for formatting of this field. Purpose data cannot be changed once
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> purposeData;

  /**
   * Required. Immutable. The user friendly name for a TagKey. The short name should be unique for
   * TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and
   * ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.),
   * and alphanumerics between.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortName;

  /**
   * Output only. Update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation time.
   * @param createTime createTime or {@code null} for none
   */
  public TagKey setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
   * @param description description or {@code null} for none
   */
  public TagKey setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Entity tag which users can pass to prevent race conditions. This field is always set
   * in server responses. See UpdateTagKeyRequest for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. Entity tag which users can pass to prevent race conditions. This field is always set
   * in server responses. See UpdateTagKeyRequest for details.
   * @param etag etag or {@code null} for none
   */
  public TagKey setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where
   * `tag_key_id` is the generated numeric id for the TagKey.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where
   * `tag_key_id` is the generated numeric id for the TagKey.
   * @param name name or {@code null} for none
   */
  public TagKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Immutable. Namespaced name of the TagKey.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespacedName() {
    return namespacedName;
  }

  /**
   * Output only. Immutable. Namespaced name of the TagKey.
   * @param namespacedName namespacedName or {@code null} for none
   */
  public TagKey setNamespacedName(java.lang.String namespacedName) {
    this.namespacedName = namespacedName;
    return this;
  }

  /**
   * Immutable. The resource name of the new TagKey's parent. Must be of the form
   * `organizations/{org_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Immutable. The resource name of the new TagKey's parent. Must be of the form
   * `organizations/{org_id}`.
   * @param parent parent or {@code null} for none
   */
  public TagKey setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy
   * engine, and will involve that policy engine in management operations involving this Tag. A
   * purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by
   * other policy engines. A purpose cannot be changed once set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurpose() {
    return purpose;
  }

  /**
   * Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy
   * engine, and will involve that policy engine in management operations involving this Tag. A
   * purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by
   * other policy engines. A purpose cannot be changed once set.
   * @param purpose purpose or {@code null} for none
   */
  public TagKey setPurpose(java.lang.String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Optional. Purpose data corresponds to the policy system that the tag is intended for. See
   * documentation for `Purpose` for formatting of this field. Purpose data cannot be changed once
   * set.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getPurposeData() {
    return purposeData;
  }

  /**
   * Optional. Purpose data corresponds to the policy system that the tag is intended for. See
   * documentation for `Purpose` for formatting of this field. Purpose data cannot be changed once
   * set.
   * @param purposeData purposeData or {@code null} for none
   */
  public TagKey setPurposeData(java.util.Map<String, java.lang.String> purposeData) {
    this.purposeData = purposeData;
    return this;
  }

  /**
   * Required. Immutable. The user friendly name for a TagKey. The short name should be unique for
   * TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and
   * ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.),
   * and alphanumerics between.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortName() {
    return shortName;
  }

  /**
   * Required. Immutable. The user friendly name for a TagKey. The short name should be unique for
   * TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and
   * ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.),
   * and alphanumerics between.
   * @param shortName shortName or {@code null} for none
   */
  public TagKey setShortName(java.lang.String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Output only. Update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public TagKey setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public TagKey set(String fieldName, Object value) {
    return (TagKey) super.set(fieldName, value);
  }

  @Override
  public TagKey clone() {
    return (TagKey) super.clone();
  }

}
