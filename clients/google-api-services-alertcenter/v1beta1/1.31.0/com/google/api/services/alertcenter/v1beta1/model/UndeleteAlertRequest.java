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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * A request to undelete a specific alert that was marked for deletion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Alert Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UndeleteAlertRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The unique identifier of the G Suite organization account of the customer the alert
   * is associated with. Inferred from the caller identity if not provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Optional. The unique identifier of the G Suite organization account of the customer the alert
   * is associated with. Inferred from the caller identity if not provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Optional. The unique identifier of the G Suite organization account of the customer the alert
   * is associated with. Inferred from the caller identity if not provided.
   * @param customerId customerId or {@code null} for none
   */
  public UndeleteAlertRequest setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  @Override
  public UndeleteAlertRequest set(String fieldName, Object value) {
    return (UndeleteAlertRequest) super.set(fieldName, value);
  }

  @Override
  public UndeleteAlertRequest clone() {
    return (UndeleteAlertRequest) super.clone();
  }

}
