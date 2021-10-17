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
 * Scheduling information for VM on maintenance/restart behaviour and node allocation in sole tenant
 * nodes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeScheduling extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean automaticRestart;

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node. Ignored if no node_affinites are configured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCpus;

  /**
   * A set of node affinity and anti-affinity configurations for sole tenant nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SchedulingNodeAffinity> nodeAffinities;

  /**
   * How the instance should behave when the host machine undergoes maintenance that may temporarily
   * impact instance performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onHostMaintenance;

  /**
   * Whether the Instance should be automatically restarted whenever it is terminated by Compute
   * Engine (not terminated by user). This configuration is identical to `automaticRestart` field in
   * Compute Engine create instance under scheduling. It was changed to an enum (instead of a
   * boolean) to match the default value in Compute Engine which is automatic restart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restartType;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutomaticRestart() {
    return automaticRestart;
  }

  /**
   * @param automaticRestart automaticRestart or {@code null} for none
   */
  public ComputeScheduling setAutomaticRestart(java.lang.Boolean automaticRestart) {
    this.automaticRestart = automaticRestart;
    return this;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node. Ignored if no node_affinites are configured.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCpus() {
    return minNodeCpus;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node. Ignored if no node_affinites are configured.
   * @param minNodeCpus minNodeCpus or {@code null} for none
   */
  public ComputeScheduling setMinNodeCpus(java.lang.Integer minNodeCpus) {
    this.minNodeCpus = minNodeCpus;
    return this;
  }

  /**
   * A set of node affinity and anti-affinity configurations for sole tenant nodes.
   * @return value or {@code null} for none
   */
  public java.util.List<SchedulingNodeAffinity> getNodeAffinities() {
    return nodeAffinities;
  }

  /**
   * A set of node affinity and anti-affinity configurations for sole tenant nodes.
   * @param nodeAffinities nodeAffinities or {@code null} for none
   */
  public ComputeScheduling setNodeAffinities(java.util.List<SchedulingNodeAffinity> nodeAffinities) {
    this.nodeAffinities = nodeAffinities;
    return this;
  }

  /**
   * How the instance should behave when the host machine undergoes maintenance that may temporarily
   * impact instance performance.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnHostMaintenance() {
    return onHostMaintenance;
  }

  /**
   * How the instance should behave when the host machine undergoes maintenance that may temporarily
   * impact instance performance.
   * @param onHostMaintenance onHostMaintenance or {@code null} for none
   */
  public ComputeScheduling setOnHostMaintenance(java.lang.String onHostMaintenance) {
    this.onHostMaintenance = onHostMaintenance;
    return this;
  }

  /**
   * Whether the Instance should be automatically restarted whenever it is terminated by Compute
   * Engine (not terminated by user). This configuration is identical to `automaticRestart` field in
   * Compute Engine create instance under scheduling. It was changed to an enum (instead of a
   * boolean) to match the default value in Compute Engine which is automatic restart.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestartType() {
    return restartType;
  }

  /**
   * Whether the Instance should be automatically restarted whenever it is terminated by Compute
   * Engine (not terminated by user). This configuration is identical to `automaticRestart` field in
   * Compute Engine create instance under scheduling. It was changed to an enum (instead of a
   * boolean) to match the default value in Compute Engine which is automatic restart.
   * @param restartType restartType or {@code null} for none
   */
  public ComputeScheduling setRestartType(java.lang.String restartType) {
    this.restartType = restartType;
    return this;
  }

  @Override
  public ComputeScheduling set(String fieldName, Object value) {
    return (ComputeScheduling) super.set(fieldName, value);
  }

  @Override
  public ComputeScheduling clone() {
    return (ComputeScheduling) super.clone();
  }

}
