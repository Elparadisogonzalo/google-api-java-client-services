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

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * `Authentication` defines the authentication configuration for API methods provided by an API
 * service. Example: name: calendar.googleapis.com authentication: providers: - id:
 * google_calendar_auth jwks_uri: https://www.googleapis.com/oauth2/v1/certs issuer:
 * https://securetoken.google.com rules: - selector: "*" requirements: provider_id:
 * google_calendar_auth - selector: google.calendar.Delegate oauth: canonical_scopes:
 * https://www.googleapis.com/auth/calendar.read
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Authentication extends com.google.api.client.json.GenericJson {

  /**
   * Defines a set of authentication providers that a service supports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuthProvider> providers;

  static {
    // hack to force ProGuard to consider AuthProvider used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AuthProvider.class);
  }

  /**
   * A list of authentication rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuthenticationRule> rules;

  /**
   * Defines a set of authentication providers that a service supports.
   * @return value or {@code null} for none
   */
  public java.util.List<AuthProvider> getProviders() {
    return providers;
  }

  /**
   * Defines a set of authentication providers that a service supports.
   * @param providers providers or {@code null} for none
   */
  public Authentication setProviders(java.util.List<AuthProvider> providers) {
    this.providers = providers;
    return this;
  }

  /**
   * A list of authentication rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<AuthenticationRule> getRules() {
    return rules;
  }

  /**
   * A list of authentication rules that apply to individual API methods. **NOTE:** All service
   * configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Authentication setRules(java.util.List<AuthenticationRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Authentication set(String fieldName, Object value) {
    return (Authentication) super.set(fieldName, value);
  }

  @Override
  public Authentication clone() {
    return (Authentication) super.clone();
  }

}
