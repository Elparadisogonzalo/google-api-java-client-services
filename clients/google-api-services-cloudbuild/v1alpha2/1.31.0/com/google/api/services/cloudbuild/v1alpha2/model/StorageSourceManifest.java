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

package com.google.api.services.cloudbuild.v1alpha2.model;

/**
 * Location of the source manifest in Google Cloud Storage. This feature is in Preview.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageSourceManifest extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage bucket containing the source manifest (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucket;

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long generation;

  /**
   * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("object")
  private java.lang.String object__;

  /**
   * Google Cloud Storage bucket containing the source manifest (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @return value or {@code null} for none
   */
  public java.lang.String getBucket() {
    return bucket;
  }

  /**
   * Google Cloud Storage bucket containing the source manifest (see [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @param bucket bucket or {@code null} for none
   */
  public StorageSourceManifest setBucket(java.lang.String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGeneration() {
    return generation;
  }

  /**
   * Google Cloud Storage generation for the object. If the generation is omitted, the latest
   * generation will be used.
   * @param generation generation or {@code null} for none
   */
  public StorageSourceManifest setGeneration(java.lang.Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
   * @return value or {@code null} for none
   */
  public java.lang.String getObject() {
    return object__;
  }

  /**
   * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
   * @param object__ object__ or {@code null} for none
   */
  public StorageSourceManifest setObject(java.lang.String object__) {
    this.object__ = object__;
    return this;
  }

  @Override
  public StorageSourceManifest set(String fieldName, Object value) {
    return (StorageSourceManifest) super.set(fieldName, value);
  }

  @Override
  public StorageSourceManifest clone() {
    return (StorageSourceManifest) super.clone();
  }

}
