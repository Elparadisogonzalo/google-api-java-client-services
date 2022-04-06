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

package com.google.api.services.transcoder.v1.model;

/**
 * Color preprocessing configuration. **Note:** This configuration is not supported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Color extends com.google.api.client.json.GenericJson {

  /**
   * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness
   * and 1 is maximum brightness. 0 is no change. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double brightness;

  /**
   * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is
   * minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double contrast;

  /**
   * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully
   * desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double saturation;

  /**
   * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness
   * and 1 is maximum brightness. 0 is no change. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBrightness() {
    return brightness;
  }

  /**
   * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness
   * and 1 is maximum brightness. 0 is no change. The default is 0.
   * @param brightness brightness or {@code null} for none
   */
  public Color setBrightness(java.lang.Double brightness) {
    this.brightness = brightness;
    return this;
  }

  /**
   * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is
   * minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getContrast() {
    return contrast;
  }

  /**
   * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is
   * minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
   * @param contrast contrast or {@code null} for none
   */
  public Color setContrast(java.lang.Double contrast) {
    this.contrast = contrast;
    return this;
  }

  /**
   * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully
   * desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSaturation() {
    return saturation;
  }

  /**
   * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully
   * desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
   * @param saturation saturation or {@code null} for none
   */
  public Color setSaturation(java.lang.Double saturation) {
    this.saturation = saturation;
    return this;
  }

  @Override
  public Color set(String fieldName, Object value) {
    return (Color) super.set(fieldName, value);
  }

  @Override
  public Color clone() {
    return (Color) super.clone();
  }

}
