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

package com.google.api.services.clouddeploy.v1.model;

/**
 * Configuration of the environment to use when calling Skaffold.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deploy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Cloud Storage location in which to store execution outputs. This can either be a
   * bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified,
   * a default bucket located in the same region will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifactStorage;

  /**
   * Optional. Use default Cloud Build pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultPool defaultPool;

  /**
   * Optional. Use private Cloud Build pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivatePool privatePool;

  /**
   * Optional. Google service account to use for execution. If unspecified, the project execution
   * service account (-compute@developer.gserviceaccount.com) is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Required. Usages when this configuration should be applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> usages;

  /**
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is
   * unspecified, the default Cloud Build pool will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerPool;

  /**
   * Optional. Cloud Storage location in which to store execution outputs. This can either be a
   * bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified,
   * a default bucket located in the same region will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifactStorage() {
    return artifactStorage;
  }

  /**
   * Optional. Cloud Storage location in which to store execution outputs. This can either be a
   * bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified,
   * a default bucket located in the same region will be used.
   * @param artifactStorage artifactStorage or {@code null} for none
   */
  public ExecutionConfig setArtifactStorage(java.lang.String artifactStorage) {
    this.artifactStorage = artifactStorage;
    return this;
  }

  /**
   * Optional. Use default Cloud Build pool.
   * @return value or {@code null} for none
   */
  public DefaultPool getDefaultPool() {
    return defaultPool;
  }

  /**
   * Optional. Use default Cloud Build pool.
   * @param defaultPool defaultPool or {@code null} for none
   */
  public ExecutionConfig setDefaultPool(DefaultPool defaultPool) {
    this.defaultPool = defaultPool;
    return this;
  }

  /**
   * Optional. Use private Cloud Build pool.
   * @return value or {@code null} for none
   */
  public PrivatePool getPrivatePool() {
    return privatePool;
  }

  /**
   * Optional. Use private Cloud Build pool.
   * @param privatePool privatePool or {@code null} for none
   */
  public ExecutionConfig setPrivatePool(PrivatePool privatePool) {
    this.privatePool = privatePool;
    return this;
  }

  /**
   * Optional. Google service account to use for execution. If unspecified, the project execution
   * service account (-compute@developer.gserviceaccount.com) is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. Google service account to use for execution. If unspecified, the project execution
   * service account (-compute@developer.gserviceaccount.com) is used.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public ExecutionConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Required. Usages when this configuration should be applied.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUsages() {
    return usages;
  }

  /**
   * Required. Usages when this configuration should be applied.
   * @param usages usages or {@code null} for none
   */
  public ExecutionConfig setUsages(java.util.List<java.lang.String> usages) {
    this.usages = usages;
    return this;
  }

  /**
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is
   * unspecified, the default Cloud Build pool will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerPool() {
    return workerPool;
  }

  /**
   * Optional. The resource name of the `WorkerPool`, with the format
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is
   * unspecified, the default Cloud Build pool will be used.
   * @param workerPool workerPool or {@code null} for none
   */
  public ExecutionConfig setWorkerPool(java.lang.String workerPool) {
    this.workerPool = workerPool;
    return this;
  }

  @Override
  public ExecutionConfig set(String fieldName, Object value) {
    return (ExecutionConfig) super.set(fieldName, value);
  }

  @Override
  public ExecutionConfig clone() {
    return (ExecutionConfig) super.clone();
  }

}
