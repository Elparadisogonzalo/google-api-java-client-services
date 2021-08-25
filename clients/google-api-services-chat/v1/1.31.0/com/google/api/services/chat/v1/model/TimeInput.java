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

package com.google.api.services.chat.v1.model;

/**
 * Input Parameter for Time Picker widget.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeInput extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hours;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minutes;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHours() {
    return hours;
  }

  /**
   * @param hours hours or {@code null} for none
   */
  public TimeInput setHours(java.lang.Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinutes() {
    return minutes;
  }

  /**
   * @param minutes minutes or {@code null} for none
   */
  public TimeInput setMinutes(java.lang.Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  @Override
  public TimeInput set(String fieldName, Object value) {
    return (TimeInput) super.set(fieldName, value);
  }

  @Override
  public TimeInput clone() {
    return (TimeInput) super.clone();
  }

}
