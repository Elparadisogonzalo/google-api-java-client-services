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

package com.google.api.services.vmmigration.v1.model;

/**
 * ComputeEngineTargetDetails is a collection of details for creating a VM in a target Compute
 * Engine project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeEngineTargetDetails extends com.google.api.client.json.GenericJson {

  /**
   * Additional licenses to assign to the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalLicenses;

  /**
   * The OS license returned from the adaptation module report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppliedLicense appliedLicense;

  /**
   * The VM Boot Option, as set in the source vm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootOption;

  /**
   * Compute instance scheduling information (if empty default is used).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeScheduling computeScheduling;

  /**
   * The disk type to use in the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * A map of labels to associate with the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The license type to use in OS adaptation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String licenseType;

  /**
   * The machine type to create the VM with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The machine type series to create the VM with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineTypeSeries;

  /**
   * The metadata key/value pairs to assign to the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * List of NICs connected to this VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkInterface> networkInterfaces;

  /**
   * A map of network tags to associate with the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> networkTags;

  /**
   * The GCP target project ID or project name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm
   * boot option is EFI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean secureBoot;

  /**
   * The service account to associate the VM with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The name of the VM to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmName;

  /**
   * The zone in which to create the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Additional licenses to assign to the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalLicenses() {
    return additionalLicenses;
  }

  /**
   * Additional licenses to assign to the VM.
   * @param additionalLicenses additionalLicenses or {@code null} for none
   */
  public ComputeEngineTargetDetails setAdditionalLicenses(java.util.List<java.lang.String> additionalLicenses) {
    this.additionalLicenses = additionalLicenses;
    return this;
  }

  /**
   * The OS license returned from the adaptation module report.
   * @return value or {@code null} for none
   */
  public AppliedLicense getAppliedLicense() {
    return appliedLicense;
  }

  /**
   * The OS license returned from the adaptation module report.
   * @param appliedLicense appliedLicense or {@code null} for none
   */
  public ComputeEngineTargetDetails setAppliedLicense(AppliedLicense appliedLicense) {
    this.appliedLicense = appliedLicense;
    return this;
  }

  /**
   * The VM Boot Option, as set in the source vm.
   * @return value or {@code null} for none
   */
  public java.lang.String getBootOption() {
    return bootOption;
  }

  /**
   * The VM Boot Option, as set in the source vm.
   * @param bootOption bootOption or {@code null} for none
   */
  public ComputeEngineTargetDetails setBootOption(java.lang.String bootOption) {
    this.bootOption = bootOption;
    return this;
  }

  /**
   * Compute instance scheduling information (if empty default is used).
   * @return value or {@code null} for none
   */
  public ComputeScheduling getComputeScheduling() {
    return computeScheduling;
  }

  /**
   * Compute instance scheduling information (if empty default is used).
   * @param computeScheduling computeScheduling or {@code null} for none
   */
  public ComputeEngineTargetDetails setComputeScheduling(ComputeScheduling computeScheduling) {
    this.computeScheduling = computeScheduling;
    return this;
  }

  /**
   * The disk type to use in the VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * The disk type to use in the VM.
   * @param diskType diskType or {@code null} for none
   */
  public ComputeEngineTargetDetails setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * A map of labels to associate with the VM.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A map of labels to associate with the VM.
   * @param labels labels or {@code null} for none
   */
  public ComputeEngineTargetDetails setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The license type to use in OS adaptation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLicenseType() {
    return licenseType;
  }

  /**
   * The license type to use in OS adaptation.
   * @param licenseType licenseType or {@code null} for none
   */
  public ComputeEngineTargetDetails setLicenseType(java.lang.String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * The machine type to create the VM with.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * The machine type to create the VM with.
   * @param machineType machineType or {@code null} for none
   */
  public ComputeEngineTargetDetails setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The machine type series to create the VM with.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineTypeSeries() {
    return machineTypeSeries;
  }

  /**
   * The machine type series to create the VM with.
   * @param machineTypeSeries machineTypeSeries or {@code null} for none
   */
  public ComputeEngineTargetDetails setMachineTypeSeries(java.lang.String machineTypeSeries) {
    this.machineTypeSeries = machineTypeSeries;
    return this;
  }

  /**
   * The metadata key/value pairs to assign to the VM.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * The metadata key/value pairs to assign to the VM.
   * @param metadata metadata or {@code null} for none
   */
  public ComputeEngineTargetDetails setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * List of NICs connected to this VM.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkInterface> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * List of NICs connected to this VM.
   * @param networkInterfaces networkInterfaces or {@code null} for none
   */
  public ComputeEngineTargetDetails setNetworkInterfaces(java.util.List<NetworkInterface> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  /**
   * A map of network tags to associate with the VM.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNetworkTags() {
    return networkTags;
  }

  /**
   * A map of network tags to associate with the VM.
   * @param networkTags networkTags or {@code null} for none
   */
  public ComputeEngineTargetDetails setNetworkTags(java.util.List<java.lang.String> networkTags) {
    this.networkTags = networkTags;
    return this;
  }

  /**
   * The GCP target project ID or project name.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The GCP target project ID or project name.
   * @param project project or {@code null} for none
   */
  public ComputeEngineTargetDetails setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm
   * boot option is EFI.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSecureBoot() {
    return secureBoot;
  }

  /**
   * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm
   * boot option is EFI.
   * @param secureBoot secureBoot or {@code null} for none
   */
  public ComputeEngineTargetDetails setSecureBoot(java.lang.Boolean secureBoot) {
    this.secureBoot = secureBoot;
    return this;
  }

  /**
   * The service account to associate the VM with.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account to associate the VM with.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public ComputeEngineTargetDetails setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The name of the VM to create.
   * @return value or {@code null} for none
   */
  public java.lang.String getVmName() {
    return vmName;
  }

  /**
   * The name of the VM to create.
   * @param vmName vmName or {@code null} for none
   */
  public ComputeEngineTargetDetails setVmName(java.lang.String vmName) {
    this.vmName = vmName;
    return this;
  }

  /**
   * The zone in which to create the VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The zone in which to create the VM.
   * @param zone zone or {@code null} for none
   */
  public ComputeEngineTargetDetails setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public ComputeEngineTargetDetails set(String fieldName, Object value) {
    return (ComputeEngineTargetDetails) super.set(fieldName, value);
  }

  @Override
  public ComputeEngineTargetDetails clone() {
    return (ComputeEngineTargetDetails) super.clone();
  }

}
