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
 * Model definition for InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall
   * policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * [Output Only] The name of the firewall policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The rules that apply to the network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallPolicyRule> rules;

  static {
    // hack to force ProGuard to consider FirewallPolicyRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FirewallPolicyRule.class);
  }

  /**
   * [Output Only] The short name of the firewall policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortName;

  /**
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK,
   * NETWORK_REGIONAL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall
   * policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall
   * policy.
   * @param displayName displayName or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * [Output Only] The name of the firewall policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] The name of the firewall policy.
   * @param name name or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The rules that apply to the network.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallPolicyRule> getRules() {
    return rules;
  }

  /**
   * The rules that apply to the network.
   * @param rules rules or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy setRules(java.util.List<FirewallPolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * [Output Only] The short name of the firewall policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortName() {
    return shortName;
  }

  /**
   * [Output Only] The short name of the firewall policy.
   * @param shortName shortName or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy setShortName(java.lang.String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK,
   * NETWORK_REGIONAL.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK,
   * NETWORK_REGIONAL.
   * @param type type or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy set(String fieldName, Object value) {
    return (InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy) super.set(fieldName, value);
  }

  @Override
  public InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy clone() {
    return (InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy) super.clone();
  }

}
