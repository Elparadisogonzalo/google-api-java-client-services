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

package com.google.api.services.displayvideo.v1.model;

/**
 * Represents a single targeting option, which is a targetable concept in DV360.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetingOption extends com.google.api.client.json.GenericJson {

  /**
   * Age range details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AgeRangeTargetingOptionDetails ageRangeDetails;

  /**
   * App category details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppCategoryTargetingOptionDetails appCategoryDetails;

  /**
   * Audio content type details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AudioContentTypeTargetingOptionDetails audioContentTypeDetails;

  /**
   * Authorized seller status resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuthorizedSellerStatusTargetingOptionDetails authorizedSellerStatusDetails;

  /**
   * Browser details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BrowserTargetingOptionDetails browserDetails;

  /**
   * Business chain resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusinessChainTargetingOptionDetails businessChainDetails;

  /**
   * Carrier and ISP details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CarrierAndIspTargetingOptionDetails carrierAndIspDetails;

  /**
   * Category resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CategoryTargetingOptionDetails categoryDetails;

  /**
   * Content instream position details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContentInstreamPositionTargetingOptionDetails contentInstreamPositionDetails;

  /**
   * Content outstream position details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContentOutstreamPositionTargetingOptionDetails contentOutstreamPositionDetails;

  /**
   * Device make and model resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceMakeModelTargetingOptionDetails deviceMakeModelDetails;

  /**
   * Device type details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceTypeTargetingOptionDetails deviceTypeDetails;

  /**
   * Digital content label details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DigitalContentLabelTargetingOptionDetails digitalContentLabelDetails;

  /**
   * Environment details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnvironmentTargetingOptionDetails environmentDetails;

  /**
   * Exchange details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExchangeTargetingOptionDetails exchangeDetails;

  /**
   * Gender details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GenderTargetingOptionDetails genderDetails;

  /**
   * Geographic region resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoRegionTargetingOptionDetails geoRegionDetails;

  /**
   * Household income details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HouseholdIncomeTargetingOptionDetails householdIncomeDetails;

  /**
   * Language resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LanguageTargetingOptionDetails languageDetails;

  /**
   * Output only. The resource name for this targeting option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Native content position details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NativeContentPositionTargetingOptionDetails nativeContentPositionDetails;

  /**
   * Open Measurement enabled inventory details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OmidTargetingOptionDetails omidDetails;

  /**
   * On screen position details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnScreenPositionTargetingOptionDetails onScreenPositionDetails;

  /**
   * Operating system resources details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperatingSystemTargetingOptionDetails operatingSystemDetails;

  /**
   * Parental status details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParentalStatusTargetingOptionDetails parentalStatusDetails;

  /**
   * POI resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PoiTargetingOptionDetails poiDetails;

  /**
   * Sensitive Category details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SensitiveCategoryTargetingOptionDetails sensitiveCategoryDetails;

  /**
   * Sub-exchange details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubExchangeTargetingOptionDetails subExchangeDetails;

  /**
   * Output only. A unique identifier for this targeting option. The tuple {`targeting_type`,
   * `targeting_option_id`} will be unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * Output only. The type of this targeting option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingType;

  /**
   * User rewarded content details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserRewardedContentTargetingOptionDetails userRewardedContentDetails;

  /**
   * Video player size details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoPlayerSizeTargetingOptionDetails videoPlayerSizeDetails;

  /**
   * Viewability resource details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ViewabilityTargetingOptionDetails viewabilityDetails;

  /**
   * Age range details.
   * @return value or {@code null} for none
   */
  public AgeRangeTargetingOptionDetails getAgeRangeDetails() {
    return ageRangeDetails;
  }

  /**
   * Age range details.
   * @param ageRangeDetails ageRangeDetails or {@code null} for none
   */
  public TargetingOption setAgeRangeDetails(AgeRangeTargetingOptionDetails ageRangeDetails) {
    this.ageRangeDetails = ageRangeDetails;
    return this;
  }

  /**
   * App category details.
   * @return value or {@code null} for none
   */
  public AppCategoryTargetingOptionDetails getAppCategoryDetails() {
    return appCategoryDetails;
  }

  /**
   * App category details.
   * @param appCategoryDetails appCategoryDetails or {@code null} for none
   */
  public TargetingOption setAppCategoryDetails(AppCategoryTargetingOptionDetails appCategoryDetails) {
    this.appCategoryDetails = appCategoryDetails;
    return this;
  }

  /**
   * Audio content type details.
   * @return value or {@code null} for none
   */
  public AudioContentTypeTargetingOptionDetails getAudioContentTypeDetails() {
    return audioContentTypeDetails;
  }

  /**
   * Audio content type details.
   * @param audioContentTypeDetails audioContentTypeDetails or {@code null} for none
   */
  public TargetingOption setAudioContentTypeDetails(AudioContentTypeTargetingOptionDetails audioContentTypeDetails) {
    this.audioContentTypeDetails = audioContentTypeDetails;
    return this;
  }

  /**
   * Authorized seller status resource details.
   * @return value or {@code null} for none
   */
  public AuthorizedSellerStatusTargetingOptionDetails getAuthorizedSellerStatusDetails() {
    return authorizedSellerStatusDetails;
  }

  /**
   * Authorized seller status resource details.
   * @param authorizedSellerStatusDetails authorizedSellerStatusDetails or {@code null} for none
   */
  public TargetingOption setAuthorizedSellerStatusDetails(AuthorizedSellerStatusTargetingOptionDetails authorizedSellerStatusDetails) {
    this.authorizedSellerStatusDetails = authorizedSellerStatusDetails;
    return this;
  }

  /**
   * Browser details.
   * @return value or {@code null} for none
   */
  public BrowserTargetingOptionDetails getBrowserDetails() {
    return browserDetails;
  }

  /**
   * Browser details.
   * @param browserDetails browserDetails or {@code null} for none
   */
  public TargetingOption setBrowserDetails(BrowserTargetingOptionDetails browserDetails) {
    this.browserDetails = browserDetails;
    return this;
  }

  /**
   * Business chain resource details.
   * @return value or {@code null} for none
   */
  public BusinessChainTargetingOptionDetails getBusinessChainDetails() {
    return businessChainDetails;
  }

  /**
   * Business chain resource details.
   * @param businessChainDetails businessChainDetails or {@code null} for none
   */
  public TargetingOption setBusinessChainDetails(BusinessChainTargetingOptionDetails businessChainDetails) {
    this.businessChainDetails = businessChainDetails;
    return this;
  }

  /**
   * Carrier and ISP details.
   * @return value or {@code null} for none
   */
  public CarrierAndIspTargetingOptionDetails getCarrierAndIspDetails() {
    return carrierAndIspDetails;
  }

  /**
   * Carrier and ISP details.
   * @param carrierAndIspDetails carrierAndIspDetails or {@code null} for none
   */
  public TargetingOption setCarrierAndIspDetails(CarrierAndIspTargetingOptionDetails carrierAndIspDetails) {
    this.carrierAndIspDetails = carrierAndIspDetails;
    return this;
  }

  /**
   * Category resource details.
   * @return value or {@code null} for none
   */
  public CategoryTargetingOptionDetails getCategoryDetails() {
    return categoryDetails;
  }

  /**
   * Category resource details.
   * @param categoryDetails categoryDetails or {@code null} for none
   */
  public TargetingOption setCategoryDetails(CategoryTargetingOptionDetails categoryDetails) {
    this.categoryDetails = categoryDetails;
    return this;
  }

  /**
   * Content instream position details.
   * @return value or {@code null} for none
   */
  public ContentInstreamPositionTargetingOptionDetails getContentInstreamPositionDetails() {
    return contentInstreamPositionDetails;
  }

  /**
   * Content instream position details.
   * @param contentInstreamPositionDetails contentInstreamPositionDetails or {@code null} for none
   */
  public TargetingOption setContentInstreamPositionDetails(ContentInstreamPositionTargetingOptionDetails contentInstreamPositionDetails) {
    this.contentInstreamPositionDetails = contentInstreamPositionDetails;
    return this;
  }

  /**
   * Content outstream position details.
   * @return value or {@code null} for none
   */
  public ContentOutstreamPositionTargetingOptionDetails getContentOutstreamPositionDetails() {
    return contentOutstreamPositionDetails;
  }

  /**
   * Content outstream position details.
   * @param contentOutstreamPositionDetails contentOutstreamPositionDetails or {@code null} for none
   */
  public TargetingOption setContentOutstreamPositionDetails(ContentOutstreamPositionTargetingOptionDetails contentOutstreamPositionDetails) {
    this.contentOutstreamPositionDetails = contentOutstreamPositionDetails;
    return this;
  }

  /**
   * Device make and model resource details.
   * @return value or {@code null} for none
   */
  public DeviceMakeModelTargetingOptionDetails getDeviceMakeModelDetails() {
    return deviceMakeModelDetails;
  }

  /**
   * Device make and model resource details.
   * @param deviceMakeModelDetails deviceMakeModelDetails or {@code null} for none
   */
  public TargetingOption setDeviceMakeModelDetails(DeviceMakeModelTargetingOptionDetails deviceMakeModelDetails) {
    this.deviceMakeModelDetails = deviceMakeModelDetails;
    return this;
  }

  /**
   * Device type details.
   * @return value or {@code null} for none
   */
  public DeviceTypeTargetingOptionDetails getDeviceTypeDetails() {
    return deviceTypeDetails;
  }

  /**
   * Device type details.
   * @param deviceTypeDetails deviceTypeDetails or {@code null} for none
   */
  public TargetingOption setDeviceTypeDetails(DeviceTypeTargetingOptionDetails deviceTypeDetails) {
    this.deviceTypeDetails = deviceTypeDetails;
    return this;
  }

  /**
   * Digital content label details.
   * @return value or {@code null} for none
   */
  public DigitalContentLabelTargetingOptionDetails getDigitalContentLabelDetails() {
    return digitalContentLabelDetails;
  }

  /**
   * Digital content label details.
   * @param digitalContentLabelDetails digitalContentLabelDetails or {@code null} for none
   */
  public TargetingOption setDigitalContentLabelDetails(DigitalContentLabelTargetingOptionDetails digitalContentLabelDetails) {
    this.digitalContentLabelDetails = digitalContentLabelDetails;
    return this;
  }

  /**
   * Environment details.
   * @return value or {@code null} for none
   */
  public EnvironmentTargetingOptionDetails getEnvironmentDetails() {
    return environmentDetails;
  }

  /**
   * Environment details.
   * @param environmentDetails environmentDetails or {@code null} for none
   */
  public TargetingOption setEnvironmentDetails(EnvironmentTargetingOptionDetails environmentDetails) {
    this.environmentDetails = environmentDetails;
    return this;
  }

  /**
   * Exchange details.
   * @return value or {@code null} for none
   */
  public ExchangeTargetingOptionDetails getExchangeDetails() {
    return exchangeDetails;
  }

  /**
   * Exchange details.
   * @param exchangeDetails exchangeDetails or {@code null} for none
   */
  public TargetingOption setExchangeDetails(ExchangeTargetingOptionDetails exchangeDetails) {
    this.exchangeDetails = exchangeDetails;
    return this;
  }

  /**
   * Gender details.
   * @return value or {@code null} for none
   */
  public GenderTargetingOptionDetails getGenderDetails() {
    return genderDetails;
  }

  /**
   * Gender details.
   * @param genderDetails genderDetails or {@code null} for none
   */
  public TargetingOption setGenderDetails(GenderTargetingOptionDetails genderDetails) {
    this.genderDetails = genderDetails;
    return this;
  }

  /**
   * Geographic region resource details.
   * @return value or {@code null} for none
   */
  public GeoRegionTargetingOptionDetails getGeoRegionDetails() {
    return geoRegionDetails;
  }

  /**
   * Geographic region resource details.
   * @param geoRegionDetails geoRegionDetails or {@code null} for none
   */
  public TargetingOption setGeoRegionDetails(GeoRegionTargetingOptionDetails geoRegionDetails) {
    this.geoRegionDetails = geoRegionDetails;
    return this;
  }

  /**
   * Household income details.
   * @return value or {@code null} for none
   */
  public HouseholdIncomeTargetingOptionDetails getHouseholdIncomeDetails() {
    return householdIncomeDetails;
  }

  /**
   * Household income details.
   * @param householdIncomeDetails householdIncomeDetails or {@code null} for none
   */
  public TargetingOption setHouseholdIncomeDetails(HouseholdIncomeTargetingOptionDetails householdIncomeDetails) {
    this.householdIncomeDetails = householdIncomeDetails;
    return this;
  }

  /**
   * Language resource details.
   * @return value or {@code null} for none
   */
  public LanguageTargetingOptionDetails getLanguageDetails() {
    return languageDetails;
  }

  /**
   * Language resource details.
   * @param languageDetails languageDetails or {@code null} for none
   */
  public TargetingOption setLanguageDetails(LanguageTargetingOptionDetails languageDetails) {
    this.languageDetails = languageDetails;
    return this;
  }

  /**
   * Output only. The resource name for this targeting option.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name for this targeting option.
   * @param name name or {@code null} for none
   */
  public TargetingOption setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Native content position details.
   * @return value or {@code null} for none
   */
  public NativeContentPositionTargetingOptionDetails getNativeContentPositionDetails() {
    return nativeContentPositionDetails;
  }

  /**
   * Native content position details.
   * @param nativeContentPositionDetails nativeContentPositionDetails or {@code null} for none
   */
  public TargetingOption setNativeContentPositionDetails(NativeContentPositionTargetingOptionDetails nativeContentPositionDetails) {
    this.nativeContentPositionDetails = nativeContentPositionDetails;
    return this;
  }

  /**
   * Open Measurement enabled inventory details.
   * @return value or {@code null} for none
   */
  public OmidTargetingOptionDetails getOmidDetails() {
    return omidDetails;
  }

  /**
   * Open Measurement enabled inventory details.
   * @param omidDetails omidDetails or {@code null} for none
   */
  public TargetingOption setOmidDetails(OmidTargetingOptionDetails omidDetails) {
    this.omidDetails = omidDetails;
    return this;
  }

  /**
   * On screen position details.
   * @return value or {@code null} for none
   */
  public OnScreenPositionTargetingOptionDetails getOnScreenPositionDetails() {
    return onScreenPositionDetails;
  }

  /**
   * On screen position details.
   * @param onScreenPositionDetails onScreenPositionDetails or {@code null} for none
   */
  public TargetingOption setOnScreenPositionDetails(OnScreenPositionTargetingOptionDetails onScreenPositionDetails) {
    this.onScreenPositionDetails = onScreenPositionDetails;
    return this;
  }

  /**
   * Operating system resources details.
   * @return value or {@code null} for none
   */
  public OperatingSystemTargetingOptionDetails getOperatingSystemDetails() {
    return operatingSystemDetails;
  }

  /**
   * Operating system resources details.
   * @param operatingSystemDetails operatingSystemDetails or {@code null} for none
   */
  public TargetingOption setOperatingSystemDetails(OperatingSystemTargetingOptionDetails operatingSystemDetails) {
    this.operatingSystemDetails = operatingSystemDetails;
    return this;
  }

  /**
   * Parental status details.
   * @return value or {@code null} for none
   */
  public ParentalStatusTargetingOptionDetails getParentalStatusDetails() {
    return parentalStatusDetails;
  }

  /**
   * Parental status details.
   * @param parentalStatusDetails parentalStatusDetails or {@code null} for none
   */
  public TargetingOption setParentalStatusDetails(ParentalStatusTargetingOptionDetails parentalStatusDetails) {
    this.parentalStatusDetails = parentalStatusDetails;
    return this;
  }

  /**
   * POI resource details.
   * @return value or {@code null} for none
   */
  public PoiTargetingOptionDetails getPoiDetails() {
    return poiDetails;
  }

  /**
   * POI resource details.
   * @param poiDetails poiDetails or {@code null} for none
   */
  public TargetingOption setPoiDetails(PoiTargetingOptionDetails poiDetails) {
    this.poiDetails = poiDetails;
    return this;
  }

  /**
   * Sensitive Category details.
   * @return value or {@code null} for none
   */
  public SensitiveCategoryTargetingOptionDetails getSensitiveCategoryDetails() {
    return sensitiveCategoryDetails;
  }

  /**
   * Sensitive Category details.
   * @param sensitiveCategoryDetails sensitiveCategoryDetails or {@code null} for none
   */
  public TargetingOption setSensitiveCategoryDetails(SensitiveCategoryTargetingOptionDetails sensitiveCategoryDetails) {
    this.sensitiveCategoryDetails = sensitiveCategoryDetails;
    return this;
  }

  /**
   * Sub-exchange details.
   * @return value or {@code null} for none
   */
  public SubExchangeTargetingOptionDetails getSubExchangeDetails() {
    return subExchangeDetails;
  }

  /**
   * Sub-exchange details.
   * @param subExchangeDetails subExchangeDetails or {@code null} for none
   */
  public TargetingOption setSubExchangeDetails(SubExchangeTargetingOptionDetails subExchangeDetails) {
    this.subExchangeDetails = subExchangeDetails;
    return this;
  }

  /**
   * Output only. A unique identifier for this targeting option. The tuple {`targeting_type`,
   * `targeting_option_id`} will be unique.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Output only. A unique identifier for this targeting option. The tuple {`targeting_type`,
   * `targeting_option_id`} will be unique.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public TargetingOption setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  /**
   * Output only. The type of this targeting option.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingType() {
    return targetingType;
  }

  /**
   * Output only. The type of this targeting option.
   * @param targetingType targetingType or {@code null} for none
   */
  public TargetingOption setTargetingType(java.lang.String targetingType) {
    this.targetingType = targetingType;
    return this;
  }

  /**
   * User rewarded content details.
   * @return value or {@code null} for none
   */
  public UserRewardedContentTargetingOptionDetails getUserRewardedContentDetails() {
    return userRewardedContentDetails;
  }

  /**
   * User rewarded content details.
   * @param userRewardedContentDetails userRewardedContentDetails or {@code null} for none
   */
  public TargetingOption setUserRewardedContentDetails(UserRewardedContentTargetingOptionDetails userRewardedContentDetails) {
    this.userRewardedContentDetails = userRewardedContentDetails;
    return this;
  }

  /**
   * Video player size details.
   * @return value or {@code null} for none
   */
  public VideoPlayerSizeTargetingOptionDetails getVideoPlayerSizeDetails() {
    return videoPlayerSizeDetails;
  }

  /**
   * Video player size details.
   * @param videoPlayerSizeDetails videoPlayerSizeDetails or {@code null} for none
   */
  public TargetingOption setVideoPlayerSizeDetails(VideoPlayerSizeTargetingOptionDetails videoPlayerSizeDetails) {
    this.videoPlayerSizeDetails = videoPlayerSizeDetails;
    return this;
  }

  /**
   * Viewability resource details.
   * @return value or {@code null} for none
   */
  public ViewabilityTargetingOptionDetails getViewabilityDetails() {
    return viewabilityDetails;
  }

  /**
   * Viewability resource details.
   * @param viewabilityDetails viewabilityDetails or {@code null} for none
   */
  public TargetingOption setViewabilityDetails(ViewabilityTargetingOptionDetails viewabilityDetails) {
    this.viewabilityDetails = viewabilityDetails;
    return this;
  }

  @Override
  public TargetingOption set(String fieldName, Object value) {
    return (TargetingOption) super.set(fieldName, value);
  }

  @Override
  public TargetingOption clone() {
    return (TargetingOption) super.clone();
  }

}
