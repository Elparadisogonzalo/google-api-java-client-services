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
 * Represents a consumer project.
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
public final class ConsumerProject extends com.google.api.client.json.GenericJson {

  /**
   * Required. Project number of the consumer that is launching the service instance. It can own the
   * network that is peered with Google or, be a service project in an XPN where the host project
   * has the network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNum;

  /**
   * Required. Project number of the consumer that is launching the service instance. It can own the
   * network that is peered with Google or, be a service project in an XPN where the host project
   * has the network.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNum() {
    return projectNum;
  }

  /**
   * Required. Project number of the consumer that is launching the service instance. It can own the
   * network that is peered with Google or, be a service project in an XPN where the host project
   * has the network.
   * @param projectNum projectNum or {@code null} for none
   */
  public ConsumerProject setProjectNum(java.lang.Long projectNum) {
    this.projectNum = projectNum;
    return this;
  }

  @Override
  public ConsumerProject set(String fieldName, Object value) {
    return (ConsumerProject) super.set(fieldName, value);
  }

  @Override
  public ConsumerProject clone() {
    return (ConsumerProject) super.clone();
  }

}
