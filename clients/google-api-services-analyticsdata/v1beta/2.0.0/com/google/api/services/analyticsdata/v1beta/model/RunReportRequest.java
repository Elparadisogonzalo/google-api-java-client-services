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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * The request to generate a report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunReportRequest extends com.google.api.client.json.GenericJson {

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CohortSpec cohortSpec;

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Date ranges of data to read. If multiple date ranges are requested, each response row will
   * contain a zero based date range index. If two date ranges overlap, the event data for the
   * overlapping days is included in the response rows for both date ranges. In a cohort request,
   * this `dateRanges` must be unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DateRange> dateRanges;

  static {
    // hack to force ProGuard to consider DateRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DateRange.class);
  }

  /**
   * Dimension filters allow you to ask for only specific dimension values in the report. To learn
   * more, see [Fundamentals of Dimension Filters](https://developers.google.com/analytics/devguides
   * /reporting/data/v1/basics#dimension_filters) for examples. Metrics cannot be used in this
   * filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression dimensionFilter;

  /**
   * The dimensions requested and displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean keepEmptyRows;

  /**
   * The number of rows to return. If unspecified, 10,000 rows are returned. The API returns a
   * maximum of 100,000 rows per request, no matter how many you ask for. `limit` must be positive.
   * The API can also return fewer rows than the requested `limit`, if there aren't as many
   * dimension values as the `limit`. For instance, there are fewer than 300 possible values for the
   * dimension `country`, so when reporting on only `country`, you can't get more than 300 rows,
   * even if you set `limit` to a higher value. To learn more about this pagination parameter, see [
   * Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#paginati
   * on).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long limit;

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metricAggregations;

  /**
   * The filter clause of metrics. Applied after aggregating the report's rows, similar to SQL
   * having-clause. Dimensions cannot be used in this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression metricFilter;

  /**
   * The metrics requested and displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  static {
    // hack to force ProGuard to consider Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Metric.class);
  }

  /**
   * The row count of the start row. The first row is counted as row 0. When paging, the first
   * request does not specify offset; or equivalently, sets offset to 0; the first request returns
   * the first `limit` of rows. The second request sets offset to the `limit` of the first request;
   * the second request returns the second `limit` of rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long offset;

  /**
   * Specifies how rows are ordered in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderBy> orderBys;

  static {
    // hack to force ProGuard to consider OrderBy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderBy.class);
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String property;

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnPropertyQuota;

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * @return value or {@code null} for none
   */
  public CohortSpec getCohortSpec() {
    return cohortSpec;
  }

  /**
   * Cohort group associated with this request. If there is a cohort group in the request the
   * 'cohort' dimension must be present.
   * @param cohortSpec cohortSpec or {@code null} for none
   */
  public RunReportRequest setCohortSpec(CohortSpec cohortSpec) {
    this.cohortSpec = cohortSpec;
    return this;
  }

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * A currency code in ISO4217 format, such as "AED", "USD", "JPY". If the field is empty, the
   * report uses the property's default currency.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public RunReportRequest setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Date ranges of data to read. If multiple date ranges are requested, each response row will
   * contain a zero based date range index. If two date ranges overlap, the event data for the
   * overlapping days is included in the response rows for both date ranges. In a cohort request,
   * this `dateRanges` must be unspecified.
   * @return value or {@code null} for none
   */
  public java.util.List<DateRange> getDateRanges() {
    return dateRanges;
  }

  /**
   * Date ranges of data to read. If multiple date ranges are requested, each response row will
   * contain a zero based date range index. If two date ranges overlap, the event data for the
   * overlapping days is included in the response rows for both date ranges. In a cohort request,
   * this `dateRanges` must be unspecified.
   * @param dateRanges dateRanges or {@code null} for none
   */
  public RunReportRequest setDateRanges(java.util.List<DateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }

  /**
   * Dimension filters allow you to ask for only specific dimension values in the report. To learn
   * more, see [Fundamentals of Dimension Filters](https://developers.google.com/analytics/devguides
   * /reporting/data/v1/basics#dimension_filters) for examples. Metrics cannot be used in this
   * filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getDimensionFilter() {
    return dimensionFilter;
  }

  /**
   * Dimension filters allow you to ask for only specific dimension values in the report. To learn
   * more, see [Fundamentals of Dimension Filters](https://developers.google.com/analytics/devguides
   * /reporting/data/v1/basics#dimension_filters) for examples. Metrics cannot be used in this
   * filter.
   * @param dimensionFilter dimensionFilter or {@code null} for none
   */
  public RunReportRequest setDimensionFilter(FilterExpression dimensionFilter) {
    this.dimensionFilter = dimensionFilter;
    return this;
  }

  /**
   * The dimensions requested and displayed.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * The dimensions requested and displayed.
   * @param dimensions dimensions or {@code null} for none
   */
  public RunReportRequest setDimensions(java.util.List<Dimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKeepEmptyRows() {
    return keepEmptyRows;
  }

  /**
   * If false or unspecified, each row with all metrics equal to 0 will not be returned. If true,
   * these rows will be returned if they are not separately removed by a filter.
   * @param keepEmptyRows keepEmptyRows or {@code null} for none
   */
  public RunReportRequest setKeepEmptyRows(java.lang.Boolean keepEmptyRows) {
    this.keepEmptyRows = keepEmptyRows;
    return this;
  }

  /**
   * The number of rows to return. If unspecified, 10,000 rows are returned. The API returns a
   * maximum of 100,000 rows per request, no matter how many you ask for. `limit` must be positive.
   * The API can also return fewer rows than the requested `limit`, if there aren't as many
   * dimension values as the `limit`. For instance, there are fewer than 300 possible values for the
   * dimension `country`, so when reporting on only `country`, you can't get more than 300 rows,
   * even if you set `limit` to a higher value. To learn more about this pagination parameter, see [
   * Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#paginati
   * on).
   * @return value or {@code null} for none
   */
  public java.lang.Long getLimit() {
    return limit;
  }

  /**
   * The number of rows to return. If unspecified, 10,000 rows are returned. The API returns a
   * maximum of 100,000 rows per request, no matter how many you ask for. `limit` must be positive.
   * The API can also return fewer rows than the requested `limit`, if there aren't as many
   * dimension values as the `limit`. For instance, there are fewer than 300 possible values for the
   * dimension `country`, so when reporting on only `country`, you can't get more than 300 rows,
   * even if you set `limit` to a higher value. To learn more about this pagination parameter, see [
   * Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#paginati
   * on).
   * @param limit limit or {@code null} for none
   */
  public RunReportRequest setLimit(java.lang.Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetricAggregations() {
    return metricAggregations;
  }

  /**
   * Aggregation of metrics. Aggregated metric values will be shown in rows where the
   * dimension_values are set to "RESERVED_(MetricAggregation)".
   * @param metricAggregations metricAggregations or {@code null} for none
   */
  public RunReportRequest setMetricAggregations(java.util.List<java.lang.String> metricAggregations) {
    this.metricAggregations = metricAggregations;
    return this;
  }

  /**
   * The filter clause of metrics. Applied after aggregating the report's rows, similar to SQL
   * having-clause. Dimensions cannot be used in this filter.
   * @return value or {@code null} for none
   */
  public FilterExpression getMetricFilter() {
    return metricFilter;
  }

  /**
   * The filter clause of metrics. Applied after aggregating the report's rows, similar to SQL
   * having-clause. Dimensions cannot be used in this filter.
   * @param metricFilter metricFilter or {@code null} for none
   */
  public RunReportRequest setMetricFilter(FilterExpression metricFilter) {
    this.metricFilter = metricFilter;
    return this;
  }

  /**
   * The metrics requested and displayed.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * The metrics requested and displayed.
   * @param metrics metrics or {@code null} for none
   */
  public RunReportRequest setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * The row count of the start row. The first row is counted as row 0. When paging, the first
   * request does not specify offset; or equivalently, sets offset to 0; the first request returns
   * the first `limit` of rows. The second request sets offset to the `limit` of the first request;
   * the second request returns the second `limit` of rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * @return value or {@code null} for none
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * The row count of the start row. The first row is counted as row 0. When paging, the first
   * request does not specify offset; or equivalently, sets offset to 0; the first request returns
   * the first `limit` of rows. The second request sets offset to the `limit` of the first request;
   * the second request returns the second `limit` of rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * @param offset offset or {@code null} for none
   */
  public RunReportRequest setOffset(java.lang.Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Specifies how rows are ordered in the response.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderBy> getOrderBys() {
    return orderBys;
  }

  /**
   * Specifies how rows are ordered in the response.
   * @param orderBys orderBys or {@code null} for none
   */
  public RunReportRequest setOrderBys(java.util.List<OrderBy> orderBys) {
    this.orderBys = orderBys;
    return this;
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * @return value or {@code null} for none
   */
  public java.lang.String getProperty() {
    return property;
  }

  /**
   * A Google Analytics GA4 property identifier whose events are tracked. Specified in the URL path
   * and not the body. To learn more, see [where to find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Within a
   * batch request, this property should either be unspecified or consistent with the batch-level
   * property. Example: properties/1234
   * @param property property or {@code null} for none
   */
  public RunReportRequest setProperty(java.lang.String property) {
    this.property = property;
    return this;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnPropertyQuota() {
    return returnPropertyQuota;
  }

  /**
   * Toggles whether to return the current state of this Analytics Property's quota. Quota is
   * returned in [PropertyQuota](#PropertyQuota).
   * @param returnPropertyQuota returnPropertyQuota or {@code null} for none
   */
  public RunReportRequest setReturnPropertyQuota(java.lang.Boolean returnPropertyQuota) {
    this.returnPropertyQuota = returnPropertyQuota;
    return this;
  }

  @Override
  public RunReportRequest set(String fieldName, Object value) {
    return (RunReportRequest) super.set(fieldName, value);
  }

  @Override
  public RunReportRequest clone() {
    return (RunReportRequest) super.clone();
  }

}
