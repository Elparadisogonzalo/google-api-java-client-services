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

package com.google.api.services.sheets.v4.model;

/**
 * The request for clearing more than one range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchClearValuesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ranges to clear, in A1 or R1C1 notation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ranges;

  /**
   * The ranges to clear, in A1 or R1C1 notation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRanges() {
    return ranges;
  }

  /**
   * The ranges to clear, in A1 or R1C1 notation.
   * @param ranges ranges or {@code null} for none
   */
  public BatchClearValuesRequest setRanges(java.util.List<java.lang.String> ranges) {
    this.ranges = ranges;
    return this;
  }

  @Override
  public BatchClearValuesRequest set(String fieldName, Object value) {
    return (BatchClearValuesRequest) super.set(fieldName, value);
  }

  @Override
  public BatchClearValuesRequest clone() {
    return (BatchClearValuesRequest) super.clone();
  }

}
