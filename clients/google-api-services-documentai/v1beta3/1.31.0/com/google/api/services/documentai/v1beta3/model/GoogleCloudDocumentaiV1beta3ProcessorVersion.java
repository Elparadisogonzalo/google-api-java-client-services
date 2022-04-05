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

package com.google.api.services.documentai.v1beta3.model;

/**
 * A processor version is an implementation of a processor. Each processor can have multiple
 * versions, pre-trained by Google internally or up-trained by the customer. At a time, a processor
 * can only have one default version version. So the processor's behavior (when processing
 * documents) is defined by a default version
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta3ProcessorVersion extends com.google.api.client.json.GenericJson {

  /**
   * The time the processor version was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The display name of the processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Denotes that this ProcessorVersion is managed by google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean googleManaged;

  /**
   * The KMS key name used for encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * The KMS key version with which data is encrypted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersionName;

  /**
   * The resource name of the processor version. Format: `projects/{project}/locations/{location}/pr
   * ocessors/{processor}/processorVersions/{processor_version}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The state of the processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time the processor version was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the processor version was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The display name of the processor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the processor version.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Denotes that this ProcessorVersion is managed by google.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGoogleManaged() {
    return googleManaged;
  }

  /**
   * Denotes that this ProcessorVersion is managed by google.
   * @param googleManaged googleManaged or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setGoogleManaged(java.lang.Boolean googleManaged) {
    this.googleManaged = googleManaged;
    return this;
  }

  /**
   * The KMS key name used for encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The KMS key name used for encryption.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * The KMS key version with which data is encrypted.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersionName() {
    return kmsKeyVersionName;
  }

  /**
   * The KMS key version with which data is encrypted.
   * @param kmsKeyVersionName kmsKeyVersionName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setKmsKeyVersionName(java.lang.String kmsKeyVersionName) {
    this.kmsKeyVersionName = kmsKeyVersionName;
    return this;
  }

  /**
   * The resource name of the processor version. Format: `projects/{project}/locations/{location}/pr
   * ocessors/{processor}/processorVersions/{processor_version}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the processor version. Format: `projects/{project}/locations/{location}/pr
   * ocessors/{processor}/processorVersions/{processor_version}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The state of the processor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the processor version.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3ProcessorVersion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessorVersion set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3ProcessorVersion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3ProcessorVersion clone() {
    return (GoogleCloudDocumentaiV1beta3ProcessorVersion) super.clone();
  }

}
