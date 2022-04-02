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
 * Contains a [dialog](https://developers.google.com/chat/how-tos/dialogs) and request status code.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DialogAction extends com.google.api.client.json.GenericJson {

  /**
   * Status for a request to either invoke or submit a [dialog](https://developers.google.com/chat
   * /how-tos/dialogs). Displays a status and message to users, if necessary. For example, in case
   * of an error or success.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActionStatus actionStatus;

  /**
   * [Dialog](https://developers.google.com/chat/how-tos/dialogs) for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dialog dialog;

  /**
   * Status for a request to either invoke or submit a [dialog](https://developers.google.com/chat
   * /how-tos/dialogs). Displays a status and message to users, if necessary. For example, in case
   * of an error or success.
   * @return value or {@code null} for none
   */
  public ActionStatus getActionStatus() {
    return actionStatus;
  }

  /**
   * Status for a request to either invoke or submit a [dialog](https://developers.google.com/chat
   * /how-tos/dialogs). Displays a status and message to users, if necessary. For example, in case
   * of an error or success.
   * @param actionStatus actionStatus or {@code null} for none
   */
  public DialogAction setActionStatus(ActionStatus actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

  /**
   * [Dialog](https://developers.google.com/chat/how-tos/dialogs) for the request.
   * @return value or {@code null} for none
   */
  public Dialog getDialog() {
    return dialog;
  }

  /**
   * [Dialog](https://developers.google.com/chat/how-tos/dialogs) for the request.
   * @param dialog dialog or {@code null} for none
   */
  public DialogAction setDialog(Dialog dialog) {
    this.dialog = dialog;
    return this;
  }

  @Override
  public DialogAction set(String fieldName, Object value) {
    return (DialogAction) super.set(fieldName, value);
  }

  @Override
  public DialogAction clone() {
    return (DialogAction) super.clone();
  }

}
