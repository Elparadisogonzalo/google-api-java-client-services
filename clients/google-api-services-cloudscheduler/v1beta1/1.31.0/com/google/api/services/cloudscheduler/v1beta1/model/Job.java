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

package com.google.api.services.cloudscheduler.v1beta1.model;

/**
 * Configuration for a job. The maximum allowed size for a job is 1MB.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Job extends com.google.api.client.json.GenericJson {

  /**
   * App Engine HTTP target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppEngineHttpTarget appEngineHttpTarget;

  /**
   * The deadline for job attempts. If the request handler does not respond by this deadline then
   * the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed
   * attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the
   * RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds
   * and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. *
   * For PubSub targets, this field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String attemptDeadline;

  /**
   * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the
   * job. This string must not contain more than 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * HTTP target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpTarget httpTarget;

  /**
   * Output only. The time the last job attempt started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastAttemptTime;

  /**
   * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud
   * Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that
   * App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to
   * App Engine targets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean legacyAppEngineCron;

  /**
   * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For
   * example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more
   * information, see [Identifying projects](https://cloud.google.com/resource-manager/docs
   * /creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the
   * job's location. The list of available locations can be obtained by calling ListLocations. For
   * more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Pub/Sub target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubsubTarget pubsubTarget;

  /**
   * Settings that determine the retry behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetryConfig retryConfig;

  /**
   * Required, except when used with UpdateJob. Describes the schedule on which the job will be
   * executed. The schedule can be either of the following types: *
   * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like
   * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general
   * rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud
   * Scheduler will never allow two simultaneously outstanding executions. For example, this implies
   * that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until
   * 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be
   * delayed if the previous execution has not ended when its scheduled time occurs. If retry_count
   * > 0 and a job attempt fails, the job will be tried a total of retry_count times, with
   * exponential backoff, until the next scheduled start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedule;

  /**
   * Output only. The next time the job is scheduled. Note that this may be a retry of a previously
   * failed attempt or the next execution time according to the schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Output only. State of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The response from the target for the last attempted execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * Specifies the time zone to be used in interpreting schedule. The value of this field must be a
   * time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some
   * time zones include a provision for daylight savings time. The rules for daylight saving time
   * are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified,
   * the default will be in UTC (also known as GMT).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Output only. The creation time of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String userUpdateTime;

  /**
   * App Engine HTTP target.
   * @return value or {@code null} for none
   */
  public AppEngineHttpTarget getAppEngineHttpTarget() {
    return appEngineHttpTarget;
  }

  /**
   * App Engine HTTP target.
   * @param appEngineHttpTarget appEngineHttpTarget or {@code null} for none
   */
  public Job setAppEngineHttpTarget(AppEngineHttpTarget appEngineHttpTarget) {
    this.appEngineHttpTarget = appEngineHttpTarget;
    return this;
  }

  /**
   * The deadline for job attempts. If the request handler does not respond by this deadline then
   * the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed
   * attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the
   * RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds
   * and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. *
   * For PubSub targets, this field is ignored.
   * @return value or {@code null} for none
   */
  public String getAttemptDeadline() {
    return attemptDeadline;
  }

  /**
   * The deadline for job attempts. If the request handler does not respond by this deadline then
   * the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed
   * attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the
   * RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds
   * and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. *
   * For PubSub targets, this field is ignored.
   * @param attemptDeadline attemptDeadline or {@code null} for none
   */
  public Job setAttemptDeadline(String attemptDeadline) {
    this.attemptDeadline = attemptDeadline;
    return this;
  }

  /**
   * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the
   * job. This string must not contain more than 500 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the
   * job. This string must not contain more than 500 characters.
   * @param description description or {@code null} for none
   */
  public Job setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * HTTP target.
   * @return value or {@code null} for none
   */
  public HttpTarget getHttpTarget() {
    return httpTarget;
  }

  /**
   * HTTP target.
   * @param httpTarget httpTarget or {@code null} for none
   */
  public Job setHttpTarget(HttpTarget httpTarget) {
    this.httpTarget = httpTarget;
    return this;
  }

  /**
   * Output only. The time the last job attempt started.
   * @return value or {@code null} for none
   */
  public String getLastAttemptTime() {
    return lastAttemptTime;
  }

  /**
   * Output only. The time the last job attempt started.
   * @param lastAttemptTime lastAttemptTime or {@code null} for none
   */
  public Job setLastAttemptTime(String lastAttemptTime) {
    this.lastAttemptTime = lastAttemptTime;
    return this;
  }

  /**
   * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud
   * Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that
   * App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to
   * App Engine targets.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLegacyAppEngineCron() {
    return legacyAppEngineCron;
  }

  /**
   * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud
   * Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that
   * App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to
   * App Engine targets.
   * @param legacyAppEngineCron legacyAppEngineCron or {@code null} for none
   */
  public Job setLegacyAppEngineCron(java.lang.Boolean legacyAppEngineCron) {
    this.legacyAppEngineCron = legacyAppEngineCron;
    return this;
  }

  /**
   * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For
   * example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more
   * information, see [Identifying projects](https://cloud.google.com/resource-manager/docs
   * /creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the
   * job's location. The list of available locations can be obtained by calling ListLocations. For
   * more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For
   * example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more
   * information, see [Identifying projects](https://cloud.google.com/resource-manager/docs
   * /creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the
   * job's location. The list of available locations can be obtained by calling ListLocations. For
   * more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only
   * letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500
   * characters.
   * @param name name or {@code null} for none
   */
  public Job setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Pub/Sub target.
   * @return value or {@code null} for none
   */
  public PubsubTarget getPubsubTarget() {
    return pubsubTarget;
  }

  /**
   * Pub/Sub target.
   * @param pubsubTarget pubsubTarget or {@code null} for none
   */
  public Job setPubsubTarget(PubsubTarget pubsubTarget) {
    this.pubsubTarget = pubsubTarget;
    return this;
  }

  /**
   * Settings that determine the retry behavior.
   * @return value or {@code null} for none
   */
  public RetryConfig getRetryConfig() {
    return retryConfig;
  }

  /**
   * Settings that determine the retry behavior.
   * @param retryConfig retryConfig or {@code null} for none
   */
  public Job setRetryConfig(RetryConfig retryConfig) {
    this.retryConfig = retryConfig;
    return this;
  }

  /**
   * Required, except when used with UpdateJob. Describes the schedule on which the job will be
   * executed. The schedule can be either of the following types: *
   * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like
   * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general
   * rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud
   * Scheduler will never allow two simultaneously outstanding executions. For example, this implies
   * that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until
   * 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be
   * delayed if the previous execution has not ended when its scheduled time occurs. If retry_count
   * > 0 and a job attempt fails, the job will be tried a total of retry_count times, with
   * exponential backoff, until the next scheduled start time.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedule() {
    return schedule;
  }

  /**
   * Required, except when used with UpdateJob. Describes the schedule on which the job will be
   * executed. The schedule can be either of the following types: *
   * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like
   * [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general
   * rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud
   * Scheduler will never allow two simultaneously outstanding executions. For example, this implies
   * that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until
   * 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be
   * delayed if the previous execution has not ended when its scheduled time occurs. If retry_count
   * > 0 and a job attempt fails, the job will be tried a total of retry_count times, with
   * exponential backoff, until the next scheduled start time.
   * @param schedule schedule or {@code null} for none
   */
  public Job setSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Output only. The next time the job is scheduled. Note that this may be a retry of a previously
   * failed attempt or the next execution time according to the schedule.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * Output only. The next time the job is scheduled. Note that this may be a retry of a previously
   * failed attempt or the next execution time according to the schedule.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public Job setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  /**
   * Output only. State of the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the job.
   * @param state state or {@code null} for none
   */
  public Job setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The response from the target for the last attempted execution.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Output only. The response from the target for the last attempted execution.
   * @param status status or {@code null} for none
   */
  public Job setStatus(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the time zone to be used in interpreting schedule. The value of this field must be a
   * time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some
   * time zones include a provision for daylight savings time. The rules for daylight saving time
   * are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified,
   * the default will be in UTC (also known as GMT).
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Specifies the time zone to be used in interpreting schedule. The value of this field must be a
   * time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some
   * time zones include a provision for daylight savings time. The rules for daylight saving time
   * are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified,
   * the default will be in UTC (also known as GMT).
   * @param timeZone timeZone or {@code null} for none
   */
  public Job setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Output only. The creation time of the job.
   * @return value or {@code null} for none
   */
  public String getUserUpdateTime() {
    return userUpdateTime;
  }

  /**
   * Output only. The creation time of the job.
   * @param userUpdateTime userUpdateTime or {@code null} for none
   */
  public Job setUserUpdateTime(String userUpdateTime) {
    this.userUpdateTime = userUpdateTime;
    return this;
  }

  @Override
  public Job set(String fieldName, Object value) {
    return (Job) super.set(fieldName, value);
  }

  @Override
  public Job clone() {
    return (Job) super.clone();
  }

}
