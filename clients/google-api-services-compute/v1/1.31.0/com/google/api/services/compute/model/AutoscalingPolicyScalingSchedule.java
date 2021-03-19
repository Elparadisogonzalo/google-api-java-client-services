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
 * Scaling based on user-defined schedule. The message describes a single scaling schedule. A
 * scaling schedule changes the minimum number of VM instances an autoscaler can recommend, which
 * can trigger scaling out.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingPolicyScalingSchedule extends com.google.api.client.json.GenericJson {

  /**
   * A description of a scaling schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A boolean value that specifies whether a scaling schedule can influence autoscaler
   * recommendations. If set to true, then a scaling schedule has no effect. This field is optional,
   * and its value is false by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * The duration of time intervals, in seconds, for which this scaling schedule is to run. The
   * minimum allowed value is 300. This field is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer durationSec;

  /**
   * The minimum number of VM instances that the autoscaler will recommend in time intervals
   * starting according to schedule. This field is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minRequiredReplicas;

  /**
   * The start timestamps of time intervals when this scaling schedule is to provide a scaling
   * signal. This field uses the extended cron format (with an optional year field). The expression
   * can describe a single timestamp if the optional year is set, in which case the scaling schedule
   * runs once. The schedule is interpreted with respect to time_zone. This field is required. Note:
   * These timestamps only describe when autoscaler starts providing the scaling signal. The VMs
   * need additional time to become serving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedule;

  /**
   * The time zone to use when interpreting the schedule. The value of this field must be a time
   * zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database. This field is
   * assigned a default value of ?UTC? if left empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * A description of a scaling schedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of a scaling schedule.
   * @param description description or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A boolean value that specifies whether a scaling schedule can influence autoscaler
   * recommendations. If set to true, then a scaling schedule has no effect. This field is optional,
   * and its value is false by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * A boolean value that specifies whether a scaling schedule can influence autoscaler
   * recommendations. If set to true, then a scaling schedule has no effect. This field is optional,
   * and its value is false by default.
   * @param disabled disabled or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The duration of time intervals, in seconds, for which this scaling schedule is to run. The
   * minimum allowed value is 300. This field is required.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDurationSec() {
    return durationSec;
  }

  /**
   * The duration of time intervals, in seconds, for which this scaling schedule is to run. The
   * minimum allowed value is 300. This field is required.
   * @param durationSec durationSec or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setDurationSec(java.lang.Integer durationSec) {
    this.durationSec = durationSec;
    return this;
  }

  /**
   * The minimum number of VM instances that the autoscaler will recommend in time intervals
   * starting according to schedule. This field is required.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinRequiredReplicas() {
    return minRequiredReplicas;
  }

  /**
   * The minimum number of VM instances that the autoscaler will recommend in time intervals
   * starting according to schedule. This field is required.
   * @param minRequiredReplicas minRequiredReplicas or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setMinRequiredReplicas(java.lang.Integer minRequiredReplicas) {
    this.minRequiredReplicas = minRequiredReplicas;
    return this;
  }

  /**
   * The start timestamps of time intervals when this scaling schedule is to provide a scaling
   * signal. This field uses the extended cron format (with an optional year field). The expression
   * can describe a single timestamp if the optional year is set, in which case the scaling schedule
   * runs once. The schedule is interpreted with respect to time_zone. This field is required. Note:
   * These timestamps only describe when autoscaler starts providing the scaling signal. The VMs
   * need additional time to become serving.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedule() {
    return schedule;
  }

  /**
   * The start timestamps of time intervals when this scaling schedule is to provide a scaling
   * signal. This field uses the extended cron format (with an optional year field). The expression
   * can describe a single timestamp if the optional year is set, in which case the scaling schedule
   * runs once. The schedule is interpreted with respect to time_zone. This field is required. Note:
   * These timestamps only describe when autoscaler starts providing the scaling signal. The VMs
   * need additional time to become serving.
   * @param schedule schedule or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * The time zone to use when interpreting the schedule. The value of this field must be a time
   * zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database. This field is
   * assigned a default value of ?UTC? if left empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone to use when interpreting the schedule. The value of this field must be a time
   * zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database. This field is
   * assigned a default value of ?UTC? if left empty.
   * @param timeZone timeZone or {@code null} for none
   */
  public AutoscalingPolicyScalingSchedule setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public AutoscalingPolicyScalingSchedule set(String fieldName, Object value) {
    return (AutoscalingPolicyScalingSchedule) super.set(fieldName, value);
  }

  @Override
  public AutoscalingPolicyScalingSchedule clone() {
    return (AutoscalingPolicyScalingSchedule) super.clone();
  }

}
