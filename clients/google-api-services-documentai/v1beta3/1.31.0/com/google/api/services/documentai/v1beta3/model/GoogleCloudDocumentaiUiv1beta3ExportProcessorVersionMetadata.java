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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Metadata message associated with the ExportProcessorVersion operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The common metadata about the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata commonMetadata;

  /**
   * The common metadata about the operation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata getCommonMetadata() {
    return commonMetadata;
  }

  /**
   * The common metadata about the operation.
   * @param commonMetadata commonMetadata or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata setCommonMetadata(GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata commonMetadata) {
    this.commonMetadata = commonMetadata;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata clone() {
    return (GoogleCloudDocumentaiUiv1beta3ExportProcessorVersionMetadata) super.clone();
  }

}
