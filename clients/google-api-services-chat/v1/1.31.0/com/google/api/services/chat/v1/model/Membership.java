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
 * Represents a membership relation in Google Chat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Membership extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time of the membership a.k.a. the time at which the member joined the
   * space, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A user in Google Chat. Represents a person in the People API. Formatted as `users/person_id`
   * where `person_id` is available from the [People
   * API](https://developers.google.com/people/api/rest/v1/people).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User member;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * State of the membership. Required for `CreateMembership`. Read-only for other usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The creation time of the membership a.k.a. the time at which the member joined the
   * space, if applicable.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time of the membership a.k.a. the time at which the member joined the
   * space, if applicable.
   * @param createTime createTime or {@code null} for none
   */
  public Membership setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A user in Google Chat. Represents a person in the People API. Formatted as `users/person_id`
   * where `person_id` is available from the [People
   * API](https://developers.google.com/people/api/rest/v1/people).
   * @return value or {@code null} for none
   */
  public User getMember() {
    return member;
  }

  /**
   * A user in Google Chat. Represents a person in the People API. Formatted as `users/person_id`
   * where `person_id` is available from the [People
   * API](https://developers.google.com/people/api/rest/v1/people).
   * @param member member or {@code null} for none
   */
  public Membership setMember(User member) {
    this.member = member;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Membership setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * State of the membership. Required for `CreateMembership`. Read-only for other usage.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the membership. Required for `CreateMembership`. Read-only for other usage.
   * @param state state or {@code null} for none
   */
  public Membership setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Membership set(String fieldName, Object value) {
    return (Membership) super.set(fieldName, value);
  }

  @Override
  public Membership clone() {
    return (Membership) super.clone();
  }

}
