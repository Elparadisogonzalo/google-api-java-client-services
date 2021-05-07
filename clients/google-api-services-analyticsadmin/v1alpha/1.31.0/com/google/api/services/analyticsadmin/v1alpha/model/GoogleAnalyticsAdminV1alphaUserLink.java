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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A resource message representing a user's permissions on an Account or Property resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaUserLink extends com.google.api.client.json.GenericJson {

  /**
   * Roles directly assigned to this user for this account or property. Valid values:
   * predefinedRoles/read predefinedRoles/collaborate predefinedRoles/edit predefinedRoles/manage-
   * users Excludes roles that are inherited from a higher-level entity, group, or organization
   * admin role. A UserLink that is updated to have an empty list of direct_roles will be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> directRoles;

  /**
   * Immutable. Email address of the user to link
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * Output only. Example format: properties/1234/userLinks/5678
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Roles directly assigned to this user for this account or property. Valid values:
   * predefinedRoles/read predefinedRoles/collaborate predefinedRoles/edit predefinedRoles/manage-
   * users Excludes roles that are inherited from a higher-level entity, group, or organization
   * admin role. A UserLink that is updated to have an empty list of direct_roles will be deleted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDirectRoles() {
    return directRoles;
  }

  /**
   * Roles directly assigned to this user for this account or property. Valid values:
   * predefinedRoles/read predefinedRoles/collaborate predefinedRoles/edit predefinedRoles/manage-
   * users Excludes roles that are inherited from a higher-level entity, group, or organization
   * admin role. A UserLink that is updated to have an empty list of direct_roles will be deleted.
   * @param directRoles directRoles or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaUserLink setDirectRoles(java.util.List<java.lang.String> directRoles) {
    this.directRoles = directRoles;
    return this;
  }

  /**
   * Immutable. Email address of the user to link
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Immutable. Email address of the user to link
   * @param emailAddress emailAddress or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaUserLink setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Output only. Example format: properties/1234/userLinks/5678
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Example format: properties/1234/userLinks/5678
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaUserLink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaUserLink set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaUserLink) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaUserLink clone() {
    return (GoogleAnalyticsAdminV1alphaUserLink) super.clone();
  }

}
