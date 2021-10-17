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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * Represents migration resource error information that can be used with google.rpc.Status message.
 * MigrationError is used to present the user with error information in migration operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MigrationError extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Suggested action for solving the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizedMessage actionItem;

  /**
   * Output only. The error code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Output only. The localized error message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizedMessage errorMessage;

  /**
   * Output only. The time the error occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String errorTime;

  /**
   * Output only. URL(s) pointing to additional information on handling the current error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Link> helpLinks;

  static {
    // hack to force ProGuard to consider Link used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Link.class);
  }

  /**
   * Output only. Suggested action for solving the error.
   * @return value or {@code null} for none
   */
  public LocalizedMessage getActionItem() {
    return actionItem;
  }

  /**
   * Output only. Suggested action for solving the error.
   * @param actionItem actionItem or {@code null} for none
   */
  public MigrationError setActionItem(LocalizedMessage actionItem) {
    this.actionItem = actionItem;
    return this;
  }

  /**
   * Output only. The error code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Output only. The error code.
   * @param code code or {@code null} for none
   */
  public MigrationError setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Output only. The localized error message.
   * @return value or {@code null} for none
   */
  public LocalizedMessage getErrorMessage() {
    return errorMessage;
  }

  /**
   * Output only. The localized error message.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public MigrationError setErrorMessage(LocalizedMessage errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Output only. The time the error occurred.
   * @return value or {@code null} for none
   */
  public String getErrorTime() {
    return errorTime;
  }

  /**
   * Output only. The time the error occurred.
   * @param errorTime errorTime or {@code null} for none
   */
  public MigrationError setErrorTime(String errorTime) {
    this.errorTime = errorTime;
    return this;
  }

  /**
   * Output only. URL(s) pointing to additional information on handling the current error.
   * @return value or {@code null} for none
   */
  public java.util.List<Link> getHelpLinks() {
    return helpLinks;
  }

  /**
   * Output only. URL(s) pointing to additional information on handling the current error.
   * @param helpLinks helpLinks or {@code null} for none
   */
  public MigrationError setHelpLinks(java.util.List<Link> helpLinks) {
    this.helpLinks = helpLinks;
    return this;
  }

  @Override
  public MigrationError set(String fieldName, Object value) {
    return (MigrationError) super.set(fieldName, value);
  }

  @Override
  public MigrationError clone() {
    return (MigrationError) super.clone();
  }

}
