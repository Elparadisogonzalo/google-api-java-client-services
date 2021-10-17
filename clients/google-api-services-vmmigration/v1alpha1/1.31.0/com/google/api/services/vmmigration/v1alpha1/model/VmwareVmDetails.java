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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * VmwareVmDetails describes a VM in vCenter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmwareVmDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The VM Boot Option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootOption;

  /**
   * The total size of the storage allocated to the VM in MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long committedStorage;

  /**
   * The total size of the storage allocated to the VM in MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long committedStorageMb;

  /**
   * The number of cpus in the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cpuCount;

  /**
   * The descriptive name of the vCenter's datacenter this VM is contained in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datacenterDescription;

  /**
   * The id of the vCenter's datacenter this VM is contained in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datacenterId;

  /**
   * The number of disks the VM has.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer diskCount;

  /**
   * The display name of the VM. Note that this is not necessarily unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The VM's OS. See for example https://pubs.vmware.com/vi-
   * sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of
   * strings this might hold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String guestDescription;

  /**
   * The size of the memory of the VM in MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryMb;

  /**
   * The power state of the VM at the moment list was taken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String powerState;

  /**
   * The unique identifier of the VM in vCenter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uuid;

  /**
   * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of
   * the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmId;

  /**
   * Output only. The VM Boot Option.
   * @return value or {@code null} for none
   */
  public java.lang.String getBootOption() {
    return bootOption;
  }

  /**
   * Output only. The VM Boot Option.
   * @param bootOption bootOption or {@code null} for none
   */
  public VmwareVmDetails setBootOption(java.lang.String bootOption) {
    this.bootOption = bootOption;
    return this;
  }

  /**
   * The total size of the storage allocated to the VM in MB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCommittedStorage() {
    return committedStorage;
  }

  /**
   * The total size of the storage allocated to the VM in MB.
   * @param committedStorage committedStorage or {@code null} for none
   */
  public VmwareVmDetails setCommittedStorage(java.lang.Long committedStorage) {
    this.committedStorage = committedStorage;
    return this;
  }

  /**
   * The total size of the storage allocated to the VM in MB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCommittedStorageMb() {
    return committedStorageMb;
  }

  /**
   * The total size of the storage allocated to the VM in MB.
   * @param committedStorageMb committedStorageMb or {@code null} for none
   */
  public VmwareVmDetails setCommittedStorageMb(java.lang.Long committedStorageMb) {
    this.committedStorageMb = committedStorageMb;
    return this;
  }

  /**
   * The number of cpus in the VM.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCpuCount() {
    return cpuCount;
  }

  /**
   * The number of cpus in the VM.
   * @param cpuCount cpuCount or {@code null} for none
   */
  public VmwareVmDetails setCpuCount(java.lang.Integer cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * The descriptive name of the vCenter's datacenter this VM is contained in.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatacenterDescription() {
    return datacenterDescription;
  }

  /**
   * The descriptive name of the vCenter's datacenter this VM is contained in.
   * @param datacenterDescription datacenterDescription or {@code null} for none
   */
  public VmwareVmDetails setDatacenterDescription(java.lang.String datacenterDescription) {
    this.datacenterDescription = datacenterDescription;
    return this;
  }

  /**
   * The id of the vCenter's datacenter this VM is contained in.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatacenterId() {
    return datacenterId;
  }

  /**
   * The id of the vCenter's datacenter this VM is contained in.
   * @param datacenterId datacenterId or {@code null} for none
   */
  public VmwareVmDetails setDatacenterId(java.lang.String datacenterId) {
    this.datacenterId = datacenterId;
    return this;
  }

  /**
   * The number of disks the VM has.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiskCount() {
    return diskCount;
  }

  /**
   * The number of disks the VM has.
   * @param diskCount diskCount or {@code null} for none
   */
  public VmwareVmDetails setDiskCount(java.lang.Integer diskCount) {
    this.diskCount = diskCount;
    return this;
  }

  /**
   * The display name of the VM. Note that this is not necessarily unique.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the VM. Note that this is not necessarily unique.
   * @param displayName displayName or {@code null} for none
   */
  public VmwareVmDetails setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The VM's OS. See for example https://pubs.vmware.com/vi-
   * sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of
   * strings this might hold.
   * @return value or {@code null} for none
   */
  public java.lang.String getGuestDescription() {
    return guestDescription;
  }

  /**
   * The VM's OS. See for example https://pubs.vmware.com/vi-
   * sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of
   * strings this might hold.
   * @param guestDescription guestDescription or {@code null} for none
   */
  public VmwareVmDetails setGuestDescription(java.lang.String guestDescription) {
    this.guestDescription = guestDescription;
    return this;
  }

  /**
   * The size of the memory of the VM in MB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * The size of the memory of the VM in MB.
   * @param memoryMb memoryMb or {@code null} for none
   */
  public VmwareVmDetails setMemoryMb(java.lang.Integer memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * The power state of the VM at the moment list was taken.
   * @return value or {@code null} for none
   */
  public java.lang.String getPowerState() {
    return powerState;
  }

  /**
   * The power state of the VM at the moment list was taken.
   * @param powerState powerState or {@code null} for none
   */
  public VmwareVmDetails setPowerState(java.lang.String powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * The unique identifier of the VM in vCenter.
   * @return value or {@code null} for none
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * The unique identifier of the VM in vCenter.
   * @param uuid uuid or {@code null} for none
   */
  public VmwareVmDetails setUuid(java.lang.String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of
   * the VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getVmId() {
    return vmId;
  }

  /**
   * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of
   * the VM.
   * @param vmId vmId or {@code null} for none
   */
  public VmwareVmDetails setVmId(java.lang.String vmId) {
    this.vmId = vmId;
    return this;
  }

  @Override
  public VmwareVmDetails set(String fieldName, Object value) {
    return (VmwareVmDetails) super.set(fieldName, value);
  }

  @Override
  public VmwareVmDetails clone() {
    return (VmwareVmDetails) super.clone();
  }

}
