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

package com.google.api.services.compute.model;

/**
 * Model definition for RouterMd5AuthenticationKey.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterMd5AuthenticationKey extends com.google.api.client.json.GenericJson {

  /**
   * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value
   * from the previous configuration. This is allowed if the key with the same name existed before
   * the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Name used to identify the key. Must be unique within a router. Must be referenced by at least
   * one bgpPeer. Must comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value
   * from the previous configuration. This is allowed if the key with the same name existed before
   * the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * [Input only] Value of the key. For patch and update calls, it can be skipped to copy the value
   * from the previous configuration. This is allowed if the key with the same name existed before
   * the operation. Maximum length is 80 characters. Can only contain printable ASCII characters.
   * @param key key or {@code null} for none
   */
  public RouterMd5AuthenticationKey setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Name used to identify the key. Must be unique within a router. Must be referenced by at least
   * one bgpPeer. Must comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name used to identify the key. Must be unique within a router. Must be referenced by at least
   * one bgpPeer. Must comply with RFC1035.
   * @param name name or {@code null} for none
   */
  public RouterMd5AuthenticationKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public RouterMd5AuthenticationKey set(String fieldName, Object value) {
    return (RouterMd5AuthenticationKey) super.set(fieldName, value);
  }

  @Override
  public RouterMd5AuthenticationKey clone() {
    return (RouterMd5AuthenticationKey) super.clone();
  }

}
