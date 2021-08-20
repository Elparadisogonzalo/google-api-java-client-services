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

package com.google.api.services.file.v1.model;

/**
 * File share configuration for the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileShareConfig extends com.google.api.client.json.GenericJson {

  /**
   * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long capacityGb;

  /**
   * The name of the file share (must be 16 characters or less).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Nfs Export Options. There is a limit of 10 export options per file share.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NfsExportOptions> nfsExportOptions;

  /**
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share
   * has been restored from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceBackup;

  /**
   * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCapacityGb() {
    return capacityGb;
  }

  /**
   * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
   * @param capacityGb capacityGb or {@code null} for none
   */
  public FileShareConfig setCapacityGb(java.lang.Long capacityGb) {
    this.capacityGb = capacityGb;
    return this;
  }

  /**
   * The name of the file share (must be 16 characters or less).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the file share (must be 16 characters or less).
   * @param name name or {@code null} for none
   */
  public FileShareConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Nfs Export Options. There is a limit of 10 export options per file share.
   * @return value or {@code null} for none
   */
  public java.util.List<NfsExportOptions> getNfsExportOptions() {
    return nfsExportOptions;
  }

  /**
   * Nfs Export Options. There is a limit of 10 export options per file share.
   * @param nfsExportOptions nfsExportOptions or {@code null} for none
   */
  public FileShareConfig setNfsExportOptions(java.util.List<NfsExportOptions> nfsExportOptions) {
    this.nfsExportOptions = nfsExportOptions;
    return this;
  }

  /**
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share
   * has been restored from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceBackup() {
    return sourceBackup;
  }

  /**
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share
   * has been restored from.
   * @param sourceBackup sourceBackup or {@code null} for none
   */
  public FileShareConfig setSourceBackup(java.lang.String sourceBackup) {
    this.sourceBackup = sourceBackup;
    return this;
  }

  @Override
  public FileShareConfig set(String fieldName, Object value) {
    return (FileShareConfig) super.set(fieldName, value);
  }

  @Override
  public FileShareConfig clone() {
    return (FileShareConfig) super.clone();
  }

}
