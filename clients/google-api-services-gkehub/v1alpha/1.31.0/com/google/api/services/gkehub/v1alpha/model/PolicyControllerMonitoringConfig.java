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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * MonitoringConfig specifies the backends Policy Controller should export metrics to. For example,
 * to specify metrics should be exported to Cloud Monitoring and Prometheus, specify backends:
 * ["cloudmonitoring", "prometheus"]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyControllerMonitoringConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the list of backends Policy Controller will export to. An empty list would
   * effectively disable metrics export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> backends;

  /**
   * Specifies the list of backends Policy Controller will export to. An empty list would
   * effectively disable metrics export.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBackends() {
    return backends;
  }

  /**
   * Specifies the list of backends Policy Controller will export to. An empty list would
   * effectively disable metrics export.
   * @param backends backends or {@code null} for none
   */
  public PolicyControllerMonitoringConfig setBackends(java.util.List<java.lang.String> backends) {
    this.backends = backends;
    return this;
  }

  @Override
  public PolicyControllerMonitoringConfig set(String fieldName, Object value) {
    return (PolicyControllerMonitoringConfig) super.set(fieldName, value);
  }

  @Override
  public PolicyControllerMonitoringConfig clone() {
    return (PolicyControllerMonitoringConfig) super.clone();
  }

}
