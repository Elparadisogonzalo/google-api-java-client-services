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

package com.google.api.services.artifactregistry.v1beta2.model;

/**
 * A Repository for storing artifacts with a specific format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Repository extends com.google.api.client.json.GenericJson {

  /**
   * The time when the repository was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The user-provided description of the repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The format of packages that are stored in the repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The Cloud KMS resource name of the customer managed encryption key that's used to encrypt the
   * contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-
   * kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and
   * values may be no longer than 63 characters. Label keys must begin with a lowercase letter and
   * may only contain lowercase letters, numeric characters, underscores, and dashes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Maven repository config contains repository level configuration for the repositories of maven
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MavenRepositoryConfig mavenConfig;

  /**
   * The name of the repository, for example: "projects/p1/locations/us-
   * central1/repositories/repo1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The time when the repository was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the repository was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the repository was created.
   * @param createTime createTime or {@code null} for none
   */
  public Repository setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The user-provided description of the repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The user-provided description of the repository.
   * @param description description or {@code null} for none
   */
  public Repository setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The format of packages that are stored in the repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The format of packages that are stored in the repository.
   * @param format format or {@code null} for none
   */
  public Repository setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The Cloud KMS resource name of the customer managed encryption key that's used to encrypt the
   * contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-
   * kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The Cloud KMS resource name of the customer managed encryption key that's used to encrypt the
   * contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-
   * kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public Repository setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and
   * values may be no longer than 63 characters. Label keys must begin with a lowercase letter and
   * may only contain lowercase letters, numeric characters, underscores, and dashes.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and
   * values may be no longer than 63 characters. Label keys must begin with a lowercase letter and
   * may only contain lowercase letters, numeric characters, underscores, and dashes.
   * @param labels labels or {@code null} for none
   */
  public Repository setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Maven repository config contains repository level configuration for the repositories of maven
   * type.
   * @return value or {@code null} for none
   */
  public MavenRepositoryConfig getMavenConfig() {
    return mavenConfig;
  }

  /**
   * Maven repository config contains repository level configuration for the repositories of maven
   * type.
   * @param mavenConfig mavenConfig or {@code null} for none
   */
  public Repository setMavenConfig(MavenRepositoryConfig mavenConfig) {
    this.mavenConfig = mavenConfig;
    return this;
  }

  /**
   * The name of the repository, for example: "projects/p1/locations/us-
   * central1/repositories/repo1".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the repository, for example: "projects/p1/locations/us-
   * central1/repositories/repo1".
   * @param name name or {@code null} for none
   */
  public Repository setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The time when the repository was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the repository was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Repository setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Repository set(String fieldName, Object value) {
    return (Repository) super.set(fieldName, value);
  }

  @Override
  public Repository clone() {
    return (Repository) super.clone();
  }

}
