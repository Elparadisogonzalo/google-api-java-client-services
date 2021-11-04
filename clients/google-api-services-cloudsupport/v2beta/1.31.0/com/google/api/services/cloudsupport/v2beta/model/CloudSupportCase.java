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

package com.google.api.services.cloudsupport.v2beta.model;

/**
 * A support case.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Support API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudSupportCase extends com.google.api.client.json.GenericJson {

  /**
   * The issue classification applicable to this case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CaseClassification classification;

  /**
   * Output only. The time this case was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The user who created the case. Note: The name and email will be obfuscated if the case was
   * created by Google Support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Actor creator;

  /**
   * A broad description of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The short summary of the issue reported in this case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Whether the case is currently escalated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean escalated;

  /**
   * The resource name for the case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The severity of this case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Output only. The current status of the support case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The email addresses to receive updates on this case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subscriberEmailAddresses;

  /**
   * Whether this case was created for internal API testing and should not be acted on by the
   * support team.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean testCase;

  /**
   * The timezone of the user who created the support case. It should be in a format IANA
   * recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Output only. The time this case was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The issue classification applicable to this case.
   * @return value or {@code null} for none
   */
  public CaseClassification getClassification() {
    return classification;
  }

  /**
   * The issue classification applicable to this case.
   * @param classification classification or {@code null} for none
   */
  public CloudSupportCase setClassification(CaseClassification classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Output only. The time this case was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this case was created.
   * @param createTime createTime or {@code null} for none
   */
  public CloudSupportCase setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The user who created the case. Note: The name and email will be obfuscated if the case was
   * created by Google Support.
   * @return value or {@code null} for none
   */
  public Actor getCreator() {
    return creator;
  }

  /**
   * The user who created the case. Note: The name and email will be obfuscated if the case was
   * created by Google Support.
   * @param creator creator or {@code null} for none
   */
  public CloudSupportCase setCreator(Actor creator) {
    this.creator = creator;
    return this;
  }

  /**
   * A broad description of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A broad description of the issue.
   * @param description description or {@code null} for none
   */
  public CloudSupportCase setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The short summary of the issue reported in this case.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The short summary of the issue reported in this case.
   * @param displayName displayName or {@code null} for none
   */
  public CloudSupportCase setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Whether the case is currently escalated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEscalated() {
    return escalated;
  }

  /**
   * Whether the case is currently escalated.
   * @param escalated escalated or {@code null} for none
   */
  public CloudSupportCase setEscalated(java.lang.Boolean escalated) {
    this.escalated = escalated;
    return this;
  }

  /**
   * The resource name for the case.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name for the case.
   * @param name name or {@code null} for none
   */
  public CloudSupportCase setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The severity of this case.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of this case.
   * @param severity severity or {@code null} for none
   */
  public CloudSupportCase setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Output only. The current status of the support case.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current status of the support case.
   * @param state state or {@code null} for none
   */
  public CloudSupportCase setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The email addresses to receive updates on this case.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubscriberEmailAddresses() {
    return subscriberEmailAddresses;
  }

  /**
   * The email addresses to receive updates on this case.
   * @param subscriberEmailAddresses subscriberEmailAddresses or {@code null} for none
   */
  public CloudSupportCase setSubscriberEmailAddresses(java.util.List<java.lang.String> subscriberEmailAddresses) {
    this.subscriberEmailAddresses = subscriberEmailAddresses;
    return this;
  }

  /**
   * Whether this case was created for internal API testing and should not be acted on by the
   * support team.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTestCase() {
    return testCase;
  }

  /**
   * Whether this case was created for internal API testing and should not be acted on by the
   * support team.
   * @param testCase testCase or {@code null} for none
   */
  public CloudSupportCase setTestCase(java.lang.Boolean testCase) {
    this.testCase = testCase;
    return this;
  }

  /**
   * The timezone of the user who created the support case. It should be in a format IANA
   * recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The timezone of the user who created the support case. It should be in a format IANA
   * recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
   * @param timeZone timeZone or {@code null} for none
   */
  public CloudSupportCase setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Output only. The time this case was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this case was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public CloudSupportCase setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public CloudSupportCase set(String fieldName, Object value) {
    return (CloudSupportCase) super.set(fieldName, value);
  }

  @Override
  public CloudSupportCase clone() {
    return (CloudSupportCase) super.clone();
  }

}
