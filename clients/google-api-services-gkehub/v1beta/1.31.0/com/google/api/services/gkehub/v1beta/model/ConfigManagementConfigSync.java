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
 * Configuration for Config Sync
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementConfigSync extends com.google.api.client.json.GenericJson {

  /**
   * Git repo configuration for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementGitConfig git;

  /**
   * Specifies whether the Config Sync Repo is in “hierarchical” or “unstructured” mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceFormat;

  /**
   * Git repo configuration for the cluster.
   * @return value or {@code null} for none
   */
  public ConfigManagementGitConfig getGit() {
    return git;
  }

  /**
   * Git repo configuration for the cluster.
   * @param git git or {@code null} for none
   */
  public ConfigManagementConfigSync setGit(ConfigManagementGitConfig git) {
    this.git = git;
    return this;
  }

  /**
   * Specifies whether the Config Sync Repo is in “hierarchical” or “unstructured” mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceFormat() {
    return sourceFormat;
  }

  /**
   * Specifies whether the Config Sync Repo is in “hierarchical” or “unstructured” mode.
   * @param sourceFormat sourceFormat or {@code null} for none
   */
  public ConfigManagementConfigSync setSourceFormat(java.lang.String sourceFormat) {
    this.sourceFormat = sourceFormat;
    return this;
  }

  @Override
  public ConfigManagementConfigSync set(String fieldName, Object value) {
    return (ConfigManagementConfigSync) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementConfigSync clone() {
    return (ConfigManagementConfigSync) super.clone();
  }

}
