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

package com.google.api.services.servicenetworking.v1.model;

/**
 * Configuration of a specific billing destination (Currently only support bill against consumer
 * project).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BillingDestination extends com.google.api.client.json.GenericJson {

  /**
   * Names of the metrics to report to this billing destination. Each name must be defined in
   * Service.metrics section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * The monitored resource type. The type must be defined in Service.monitored_resources section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String monitoredResource;

  /**
   * Names of the metrics to report to this billing destination. Each name must be defined in
   * Service.metrics section.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * Names of the metrics to report to this billing destination. Each name must be defined in
   * Service.metrics section.
   * @param metrics metrics or {@code null} for none
   */
  public BillingDestination setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * The monitored resource type. The type must be defined in Service.monitored_resources section.
   * @return value or {@code null} for none
   */
  public java.lang.String getMonitoredResource() {
    return monitoredResource;
  }

  /**
   * The monitored resource type. The type must be defined in Service.monitored_resources section.
   * @param monitoredResource monitoredResource or {@code null} for none
   */
  public BillingDestination setMonitoredResource(java.lang.String monitoredResource) {
    this.monitoredResource = monitoredResource;
    return this;
  }

  @Override
  public BillingDestination set(String fieldName, Object value) {
    return (BillingDestination) super.set(fieldName, value);
  }

  @Override
  public BillingDestination clone() {
    return (BillingDestination) super.clone();
  }

}
