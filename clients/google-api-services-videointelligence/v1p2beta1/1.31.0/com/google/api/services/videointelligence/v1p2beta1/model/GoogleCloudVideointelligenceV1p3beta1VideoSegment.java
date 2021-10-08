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
 * Video segment.
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
public final class GoogleCloudVideointelligenceV1p3beta1VideoSegment extends com.google.api.client.json.GenericJson {

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the end of the segment
   * (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTimeOffset;

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the start of the segment
   * (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTimeOffset;

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the end of the segment
   * (inclusive).
   * @return value or {@code null} for none
   */
  public String getEndTimeOffset() {
    return endTimeOffset;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the end of the segment
   * (inclusive).
   * @param endTimeOffset endTimeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment setEndTimeOffset(String endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the start of the segment
   * (inclusive).
   * @return value or {@code null} for none
   */
  public String getStartTimeOffset() {
    return startTimeOffset;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the start of the segment
   * (inclusive).
   * @param startTimeOffset startTimeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment setStartTimeOffset(String startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1VideoSegment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment clone() {
    return (GoogleCloudVideointelligenceV1p3beta1VideoSegment) super.clone();
  }

}
