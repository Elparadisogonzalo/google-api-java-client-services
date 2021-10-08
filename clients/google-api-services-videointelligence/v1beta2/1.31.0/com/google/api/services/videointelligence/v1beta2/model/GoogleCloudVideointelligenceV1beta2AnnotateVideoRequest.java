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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Video annotation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Requested video annotation features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> features;

  /**
   * The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If
   * set, `input_uri` must be unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputContent;

  /**
   * Input video location. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs
   * are supported. URIs must be specified in the following format: `gs://bucket-id/object-id`
   * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints). To identify multiple videos, a
   * video URI may include wildcards in the `object-id`. Supported wildcards: '*' to match 0 or more
   * characters; '?' to match 1 character. If unset, the input video should be embedded in the
   * request as `input_content`. If set, `input_content` must be unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputUri;

  /**
   * Optional. Cloud region where annotation should take place. Supported cloud regions are: `us-
   * east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region is specified, the region will be
   * determined based on video file location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Optional. Location where the output (in JSON format) should be stored. Currently, only [Cloud
   * Storage](https://cloud.google.com/storage/) URIs are supported. These must be specified in the
   * following format: `gs://bucket-id/object-id` (other URI formats return
   * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUri;

  /**
   * Additional video context and/or feature-specific parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2VideoContext videoContext;

  /**
   * Required. Requested video annotation features.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFeatures() {
    return features;
  }

  /**
   * Required. Requested video annotation features.
   * @param features features or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setFeatures(java.util.List<java.lang.String> features) {
    this.features = features;
    return this;
  }

  /**
   * The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If
   * set, `input_uri` must be unset.
   * @see #decodeInputContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getInputContent() {
    return inputContent;
  }

  /**
   * The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If
   * set, `input_uri` must be unset.
   * @see #getInputContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInputContent() {
    return com.google.api.client.util.Base64.decodeBase64(inputContent);
  }

  /**
   * The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If
   * set, `input_uri` must be unset.
   * @see #encodeInputContent()
   * @param inputContent inputContent or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setInputContent(java.lang.String inputContent) {
    this.inputContent = inputContent;
    return this;
  }

  /**
   * The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If
   * set, `input_uri` must be unset.
   * @see #setInputContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest encodeInputContent(byte[] inputContent) {
    this.inputContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(inputContent);
    return this;
  }

  /**
   * Input video location. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs
   * are supported. URIs must be specified in the following format: `gs://bucket-id/object-id`
   * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints). To identify multiple videos, a
   * video URI may include wildcards in the `object-id`. Supported wildcards: '*' to match 0 or more
   * characters; '?' to match 1 character. If unset, the input video should be embedded in the
   * request as `input_content`. If set, `input_content` must be unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputUri() {
    return inputUri;
  }

  /**
   * Input video location. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs
   * are supported. URIs must be specified in the following format: `gs://bucket-id/object-id`
   * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints). To identify multiple videos, a
   * video URI may include wildcards in the `object-id`. Supported wildcards: '*' to match 0 or more
   * characters; '?' to match 1 character. If unset, the input video should be embedded in the
   * request as `input_content`. If set, `input_content` must be unset.
   * @param inputUri inputUri or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setInputUri(java.lang.String inputUri) {
    this.inputUri = inputUri;
    return this;
  }

  /**
   * Optional. Cloud region where annotation should take place. Supported cloud regions are: `us-
   * east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region is specified, the region will be
   * determined based on video file location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Optional. Cloud region where annotation should take place. Supported cloud regions are: `us-
   * east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region is specified, the region will be
   * determined based on video file location.
   * @param locationId locationId or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Optional. Location where the output (in JSON format) should be stored. Currently, only [Cloud
   * Storage](https://cloud.google.com/storage/) URIs are supported. These must be specified in the
   * following format: `gs://bucket-id/object-id` (other URI formats return
   * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints).
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUri() {
    return outputUri;
  }

  /**
   * Optional. Location where the output (in JSON format) should be stored. Currently, only [Cloud
   * Storage](https://cloud.google.com/storage/) URIs are supported. These must be specified in the
   * following format: `gs://bucket-id/object-id` (other URI formats return
   * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
   * URIs](https://cloud.google.com/storage/docs/request-endpoints).
   * @param outputUri outputUri or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setOutputUri(java.lang.String outputUri) {
    this.outputUri = outputUri;
    return this;
  }

  /**
   * Additional video context and/or feature-specific parameters.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoContext getVideoContext() {
    return videoContext;
  }

  /**
   * Additional video context and/or feature-specific parameters.
   * @param videoContext videoContext or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest setVideoContext(GoogleCloudVideointelligenceV1beta2VideoContext videoContext) {
    this.videoContext = videoContext;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest clone() {
    return (GoogleCloudVideointelligenceV1beta2AnnotateVideoRequest) super.clone();
  }

}
