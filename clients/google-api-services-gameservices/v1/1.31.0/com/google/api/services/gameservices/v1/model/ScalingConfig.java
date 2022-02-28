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

package com.google.api.services.gameservices.v1.model;

/**
 * Autoscaling config for an Agones fleet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ScalingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Agones fleet autoscaler spec (see [example
   * spec](https://agones.dev/site/docs/reference/fleetautoscaler/)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fleetAutoscalerSpec;

  /**
   * Required. The name of the scaling config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The schedules to which this scaling config applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Schedule> schedules;

  /**
   * Labels used to identify the game server clusters to which this Agones scaling config applies. A
   * game server cluster is subject to this Agones scaling config if its labels match any of the
   * selector entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelSelector> selectors;

  static {
    // hack to force ProGuard to consider LabelSelector used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelSelector.class);
  }

  /**
   * Required. Agones fleet autoscaler spec (see [example
   * spec](https://agones.dev/site/docs/reference/fleetautoscaler/)).
   * @return value or {@code null} for none
   */
  public java.lang.String getFleetAutoscalerSpec() {
    return fleetAutoscalerSpec;
  }

  /**
   * Required. Agones fleet autoscaler spec (see [example
   * spec](https://agones.dev/site/docs/reference/fleetautoscaler/)).
   * @param fleetAutoscalerSpec fleetAutoscalerSpec or {@code null} for none
   */
  public ScalingConfig setFleetAutoscalerSpec(java.lang.String fleetAutoscalerSpec) {
    this.fleetAutoscalerSpec = fleetAutoscalerSpec;
    return this;
  }

  /**
   * Required. The name of the scaling config.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the scaling config.
   * @param name name or {@code null} for none
   */
  public ScalingConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The schedules to which this scaling config applies.
   * @return value or {@code null} for none
   */
  public java.util.List<Schedule> getSchedules() {
    return schedules;
  }

  /**
   * The schedules to which this scaling config applies.
   * @param schedules schedules or {@code null} for none
   */
  public ScalingConfig setSchedules(java.util.List<Schedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  /**
   * Labels used to identify the game server clusters to which this Agones scaling config applies. A
   * game server cluster is subject to this Agones scaling config if its labels match any of the
   * selector entries.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelSelector> getSelectors() {
    return selectors;
  }

  /**
   * Labels used to identify the game server clusters to which this Agones scaling config applies. A
   * game server cluster is subject to this Agones scaling config if its labels match any of the
   * selector entries.
   * @param selectors selectors or {@code null} for none
   */
  public ScalingConfig setSelectors(java.util.List<LabelSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  @Override
  public ScalingConfig set(String fieldName, Object value) {
    return (ScalingConfig) super.set(fieldName, value);
  }

  @Override
  public ScalingConfig clone() {
    return (ScalingConfig) super.clone();
  }

}
