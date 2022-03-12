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

package com.google.api.services.gkehub.v1beta.model;

/**
 * Configuration for Policy Controller
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyControllerHubConfig extends com.google.api.client.json.GenericJson {

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long auditIntervalSeconds;

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exemptableNamespaces;

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installSpec;

  /**
   * Logs all denies and dry run failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDeniesEnabled;

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean referentialRulesEnabled;

  /**
   * Configures the library templates to install along with Policy Controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyControllerTemplateLibraryConfig templateLibraryConfig;

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAuditIntervalSeconds() {
    return auditIntervalSeconds;
  }

  /**
   * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables
   * audit functionality altogether.
   * @param auditIntervalSeconds auditIntervalSeconds or {@code null} for none
   */
  public PolicyControllerHubConfig setAuditIntervalSeconds(java.lang.Long auditIntervalSeconds) {
    this.auditIntervalSeconds = auditIntervalSeconds;
    return this;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExemptableNamespaces() {
    return exemptableNamespaces;
  }

  /**
   * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need
   * to currently exist on the cluster.
   * @param exemptableNamespaces exemptableNamespaces or {@code null} for none
   */
  public PolicyControllerHubConfig setExemptableNamespaces(java.util.List<java.lang.String> exemptableNamespaces) {
    this.exemptableNamespaces = exemptableNamespaces;
    return this;
  }

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstallSpec() {
    return installSpec;
  }

  /**
   * The install_spec represents the intended state specified by the latest request that mutated
   * install_spec in the feature spec, not the lifecycle state of the feature observed by the Hub
   * feature controller that is reported in the feature state.
   * @param installSpec installSpec or {@code null} for none
   */
  public PolicyControllerHubConfig setInstallSpec(java.lang.String installSpec) {
    this.installSpec = installSpec;
    return this;
  }

  /**
   * Logs all denies and dry run failures.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDeniesEnabled() {
    return logDeniesEnabled;
  }

  /**
   * Logs all denies and dry run failures.
   * @param logDeniesEnabled logDeniesEnabled or {@code null} for none
   */
  public PolicyControllerHubConfig setLogDeniesEnabled(java.lang.Boolean logDeniesEnabled) {
    this.logDeniesEnabled = logDeniesEnabled;
    return this;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReferentialRulesEnabled() {
    return referentialRulesEnabled;
  }

  /**
   * Enables the ability to use Constraint Templates that reference to objects other than the object
   * currently being evaluated.
   * @param referentialRulesEnabled referentialRulesEnabled or {@code null} for none
   */
  public PolicyControllerHubConfig setReferentialRulesEnabled(java.lang.Boolean referentialRulesEnabled) {
    this.referentialRulesEnabled = referentialRulesEnabled;
    return this;
  }

  /**
   * Configures the library templates to install along with Policy Controller.
   * @return value or {@code null} for none
   */
  public PolicyControllerTemplateLibraryConfig getTemplateLibraryConfig() {
    return templateLibraryConfig;
  }

  /**
   * Configures the library templates to install along with Policy Controller.
   * @param templateLibraryConfig templateLibraryConfig or {@code null} for none
   */
  public PolicyControllerHubConfig setTemplateLibraryConfig(PolicyControllerTemplateLibraryConfig templateLibraryConfig) {
    this.templateLibraryConfig = templateLibraryConfig;
    return this;
  }

  @Override
  public PolicyControllerHubConfig set(String fieldName, Object value) {
    return (PolicyControllerHubConfig) super.set(fieldName, value);
  }

  @Override
  public PolicyControllerHubConfig clone() {
    return (PolicyControllerHubConfig) super.clone();
  }

}
