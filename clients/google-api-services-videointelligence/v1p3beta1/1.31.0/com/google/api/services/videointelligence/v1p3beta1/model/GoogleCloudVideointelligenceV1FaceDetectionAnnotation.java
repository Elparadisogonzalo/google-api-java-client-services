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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * Face detection annotation.
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
public final class GoogleCloudVideointelligenceV1FaceDetectionAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The thumbnail of a person's face.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnail;

  /**
   * The face tracks with attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1Track> tracks;

  /**
   * Feature version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The thumbnail of a person's face.
   * @see #decodeThumbnail()
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnail() {
    return thumbnail;
  }

  /**
   * The thumbnail of a person's face.
   * @see #getThumbnail()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeThumbnail() {
    return com.google.api.client.util.Base64.decodeBase64(thumbnail);
  }

  /**
   * The thumbnail of a person's face.
   * @see #encodeThumbnail()
   * @param thumbnail thumbnail or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation setThumbnail(java.lang.String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * The thumbnail of a person's face.
   * @see #setThumbnail()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation encodeThumbnail(byte[] thumbnail) {
    this.thumbnail = com.google.api.client.util.Base64.encodeBase64URLSafeString(thumbnail);
    return this;
  }

  /**
   * The face tracks with attributes.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1Track> getTracks() {
    return tracks;
  }

  /**
   * The face tracks with attributes.
   * @param tracks tracks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation setTracks(java.util.List<GoogleCloudVideointelligenceV1Track> tracks) {
    this.tracks = tracks;
    return this;
  }

  /**
   * Feature version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Feature version.
   * @param version version or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1FaceDetectionAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1FaceDetectionAnnotation clone() {
    return (GoogleCloudVideointelligenceV1FaceDetectionAnnotation) super.clone();
  }

}
