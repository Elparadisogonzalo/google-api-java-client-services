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

package com.google.api.services.videointelligence.v1p2beta1.model;

/**
 * Config for PERSON_DETECTION.
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
public final class GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type
   * (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
   * 'include_bounding_boxes' is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeAttributes;

  /**
   * Whether bounding boxes are included in the person detection annotation output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeBoundingBoxes;

  /**
   * Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to
   * false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includePoseLandmarks;

  /**
   * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type
   * (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
   * 'include_bounding_boxes' is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeAttributes() {
    return includeAttributes;
  }

  /**
   * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type
   * (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
   * 'include_bounding_boxes' is set to false.
   * @param includeAttributes includeAttributes or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig setIncludeAttributes(java.lang.Boolean includeAttributes) {
    this.includeAttributes = includeAttributes;
    return this;
  }

  /**
   * Whether bounding boxes are included in the person detection annotation output.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeBoundingBoxes() {
    return includeBoundingBoxes;
  }

  /**
   * Whether bounding boxes are included in the person detection annotation output.
   * @param includeBoundingBoxes includeBoundingBoxes or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig setIncludeBoundingBoxes(java.lang.Boolean includeBoundingBoxes) {
    this.includeBoundingBoxes = includeBoundingBoxes;
    return this;
  }

  /**
   * Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to
   * false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludePoseLandmarks() {
    return includePoseLandmarks;
  }

  /**
   * Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to
   * false.
   * @param includePoseLandmarks includePoseLandmarks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig setIncludePoseLandmarks(java.lang.Boolean includePoseLandmarks) {
    this.includePoseLandmarks = includePoseLandmarks;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig clone() {
    return (GoogleCloudVideointelligenceV1p2beta1PersonDetectionConfig) super.clone();
  }

}
