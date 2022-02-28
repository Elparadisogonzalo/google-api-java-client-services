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
 * A game server config resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GameServerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The description of the game server config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FleetConfig> fleetConfigs;

  static {
    // hack to force ProGuard to consider FleetConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FleetConfig.class);
  }

  /**
   * The labels associated with this game server config. Each label is a key-value pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name of the game server config, in the following form: `projects/{project}/locatio
   * ns/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The autoscaling settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ScalingConfig> scalingConfigs;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public GameServerConfig setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The description of the game server config.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the game server config.
   * @param description description or {@code null} for none
   */
  public GameServerConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<FleetConfig> getFleetConfigs() {
    return fleetConfigs;
  }

  /**
   * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
   * @param fleetConfigs fleetConfigs or {@code null} for none
   */
  public GameServerConfig setFleetConfigs(java.util.List<FleetConfig> fleetConfigs) {
    this.fleetConfigs = fleetConfigs;
    return this;
  }

  /**
   * The labels associated with this game server config. Each label is a key-value pair.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this game server config. Each label is a key-value pair.
   * @param labels labels or {@code null} for none
   */
  public GameServerConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name of the game server config, in the following form: `projects/{project}/locatio
   * ns/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the game server config, in the following form: `projects/{project}/locatio
   * ns/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example,
   * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
   * @param name name or {@code null} for none
   */
  public GameServerConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The autoscaling settings.
   * @return value or {@code null} for none
   */
  public java.util.List<ScalingConfig> getScalingConfigs() {
    return scalingConfigs;
  }

  /**
   * The autoscaling settings.
   * @param scalingConfigs scalingConfigs or {@code null} for none
   */
  public GameServerConfig setScalingConfigs(java.util.List<ScalingConfig> scalingConfigs) {
    this.scalingConfigs = scalingConfigs;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GameServerConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GameServerConfig set(String fieldName, Object value) {
    return (GameServerConfig) super.set(fieldName, value);
  }

  @Override
  public GameServerConfig clone() {
    return (GameServerConfig) super.clone();
  }

}
