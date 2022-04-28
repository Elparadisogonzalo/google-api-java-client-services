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
 * Payload proto for "clouddeploy.googleapis.com/release_render" Platform Log event that describes
 * the render status change.
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
public final class ReleaseRenderEvent extends com.google.api.client.json.GenericJson {

  /**
   * Debug message for when a render transition occurs. Provides further details as rendering
   * progresses through render states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The name of the `Release`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String release;

  /**
   * Debug message for when a render transition occurs. Provides further details as rendering
   * progresses through render states.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Debug message for when a render transition occurs. Provides further details as rendering
   * progresses through render states.
   * @param message message or {@code null} for none
   */
  public ReleaseRenderEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The name of the `Release`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelease() {
    return release;
  }

  /**
   * The name of the `Release`.
   * @param release release or {@code null} for none
   */
  public ReleaseRenderEvent setRelease(java.lang.String release) {
    this.release = release;
    return this;
  }

  @Override
  public ReleaseRenderEvent set(String fieldName, Object value) {
    return (ReleaseRenderEvent) super.set(fieldName, value);
  }

  @Override
  public ReleaseRenderEvent clone() {
    return (ReleaseRenderEvent) super.clone();
  }

}
