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

package com.google.api.services.books.v1.model;

/**
 * Model definition for Series.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Series extends com.google.api.client.json.GenericJson {

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SeriesSeries> series;

  static {
    // hack to force ProGuard to consider SeriesSeries used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SeriesSeries.class);
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Series setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SeriesSeries> getSeries() {
    return series;
  }

  /**
   * @param series series or {@code null} for none
   */
  public Series setSeries(java.util.List<SeriesSeries> series) {
    this.series = series;
    return this;
  }

  @Override
  public Series set(String fieldName, Object value) {
    return (Series) super.set(fieldName, value);
  }

  @Override
  public Series clone() {
    return (Series) super.clone();
  }

  /**
   * Model definition for SeriesSeries.
   */
  public static final class SeriesSeries extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String bannerImageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean eligibleForSubscription;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String imageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean isComplete;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String seriesFormatType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String seriesId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private SeriesSubscriptionReleaseInfo seriesSubscriptionReleaseInfo;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String seriesType;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String subscriptionId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBannerImageUrl() {
      return bannerImageUrl;
    }

    /**
     * @param bannerImageUrl bannerImageUrl or {@code null} for none
     */
    public SeriesSeries setBannerImageUrl(java.lang.String bannerImageUrl) {
      this.bannerImageUrl = bannerImageUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getEligibleForSubscription() {
      return eligibleForSubscription;
    }

    /**
     * @param eligibleForSubscription eligibleForSubscription or {@code null} for none
     */
    public SeriesSeries setEligibleForSubscription(java.lang.Boolean eligibleForSubscription) {
      this.eligibleForSubscription = eligibleForSubscription;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getImageUrl() {
      return imageUrl;
    }

    /**
     * @param imageUrl imageUrl or {@code null} for none
     */
    public SeriesSeries setImageUrl(java.lang.String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getIsComplete() {
      return isComplete;
    }

    /**
     * @param isComplete isComplete or {@code null} for none
     */
    public SeriesSeries setIsComplete(java.lang.Boolean isComplete) {
      this.isComplete = isComplete;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSeriesFormatType() {
      return seriesFormatType;
    }

    /**
     * @param seriesFormatType seriesFormatType or {@code null} for none
     */
    public SeriesSeries setSeriesFormatType(java.lang.String seriesFormatType) {
      this.seriesFormatType = seriesFormatType;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSeriesId() {
      return seriesId;
    }

    /**
     * @param seriesId seriesId or {@code null} for none
     */
    public SeriesSeries setSeriesId(java.lang.String seriesId) {
      this.seriesId = seriesId;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public SeriesSubscriptionReleaseInfo getSeriesSubscriptionReleaseInfo() {
      return seriesSubscriptionReleaseInfo;
    }

    /**
     * @param seriesSubscriptionReleaseInfo seriesSubscriptionReleaseInfo or {@code null} for none
     */
    public SeriesSeries setSeriesSubscriptionReleaseInfo(SeriesSubscriptionReleaseInfo seriesSubscriptionReleaseInfo) {
      this.seriesSubscriptionReleaseInfo = seriesSubscriptionReleaseInfo;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSeriesType() {
      return seriesType;
    }

    /**
     * @param seriesType seriesType or {@code null} for none
     */
    public SeriesSeries setSeriesType(java.lang.String seriesType) {
      this.seriesType = seriesType;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSubscriptionId() {
      return subscriptionId;
    }

    /**
     * @param subscriptionId subscriptionId or {@code null} for none
     */
    public SeriesSeries setSubscriptionId(java.lang.String subscriptionId) {
      this.subscriptionId = subscriptionId;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * @param title title or {@code null} for none
     */
    public SeriesSeries setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public SeriesSeries set(String fieldName, Object value) {
      return (SeriesSeries) super.set(fieldName, value);
    }

    @Override
    public SeriesSeries clone() {
      return (SeriesSeries) super.clone();
    }

    /**
     * Model definition for SeriesSeriesSeriesSubscriptionReleaseInfo.
     */
    public static final class SeriesSubscriptionReleaseInfo extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String cancelTime;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private CurrentReleaseInfo currentReleaseInfo;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private NextReleaseInfo nextReleaseInfo;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String seriesSubscriptionType;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getCancelTime() {
        return cancelTime;
      }

      /**
       * @param cancelTime cancelTime or {@code null} for none
       */
      public SeriesSubscriptionReleaseInfo setCancelTime(java.lang.String cancelTime) {
        this.cancelTime = cancelTime;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public CurrentReleaseInfo getCurrentReleaseInfo() {
        return currentReleaseInfo;
      }

      /**
       * @param currentReleaseInfo currentReleaseInfo or {@code null} for none
       */
      public SeriesSubscriptionReleaseInfo setCurrentReleaseInfo(CurrentReleaseInfo currentReleaseInfo) {
        this.currentReleaseInfo = currentReleaseInfo;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public NextReleaseInfo getNextReleaseInfo() {
        return nextReleaseInfo;
      }

      /**
       * @param nextReleaseInfo nextReleaseInfo or {@code null} for none
       */
      public SeriesSubscriptionReleaseInfo setNextReleaseInfo(NextReleaseInfo nextReleaseInfo) {
        this.nextReleaseInfo = nextReleaseInfo;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getSeriesSubscriptionType() {
        return seriesSubscriptionType;
      }

      /**
       * @param seriesSubscriptionType seriesSubscriptionType or {@code null} for none
       */
      public SeriesSubscriptionReleaseInfo setSeriesSubscriptionType(java.lang.String seriesSubscriptionType) {
        this.seriesSubscriptionType = seriesSubscriptionType;
        return this;
      }

      @Override
      public SeriesSubscriptionReleaseInfo set(String fieldName, Object value) {
        return (SeriesSubscriptionReleaseInfo) super.set(fieldName, value);
      }

      @Override
      public SeriesSubscriptionReleaseInfo clone() {
        return (SeriesSubscriptionReleaseInfo) super.clone();
      }

      /**
       * Model definition for SeriesSeriesSeriesSubscriptionReleaseInfoCurrentReleaseInfo.
       */
      public static final class CurrentReleaseInfo extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Double amountInMicros;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String currencyCode;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String releaseNumber;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String releaseTime;

        /**
         * @return value or {@code null} for none
         */
        public java.lang.Double getAmountInMicros() {
          return amountInMicros;
        }

        /**
         * @param amountInMicros amountInMicros or {@code null} for none
         */
        public CurrentReleaseInfo setAmountInMicros(java.lang.Double amountInMicros) {
          this.amountInMicros = amountInMicros;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getCurrencyCode() {
          return currencyCode;
        }

        /**
         * @param currencyCode currencyCode or {@code null} for none
         */
        public CurrentReleaseInfo setCurrencyCode(java.lang.String currencyCode) {
          this.currencyCode = currencyCode;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getReleaseNumber() {
          return releaseNumber;
        }

        /**
         * @param releaseNumber releaseNumber or {@code null} for none
         */
        public CurrentReleaseInfo setReleaseNumber(java.lang.String releaseNumber) {
          this.releaseNumber = releaseNumber;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getReleaseTime() {
          return releaseTime;
        }

        /**
         * @param releaseTime releaseTime or {@code null} for none
         */
        public CurrentReleaseInfo setReleaseTime(java.lang.String releaseTime) {
          this.releaseTime = releaseTime;
          return this;
        }

        @Override
        public CurrentReleaseInfo set(String fieldName, Object value) {
          return (CurrentReleaseInfo) super.set(fieldName, value);
        }

        @Override
        public CurrentReleaseInfo clone() {
          return (CurrentReleaseInfo) super.clone();
        }

      }
      /**
       * Model definition for SeriesSeriesSeriesSubscriptionReleaseInfoNextReleaseInfo.
       */
      public static final class NextReleaseInfo extends com.google.api.client.json.GenericJson {

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Double amountInMicros;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String currencyCode;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String releaseNumber;

        /**
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String releaseTime;

        /**
         * @return value or {@code null} for none
         */
        public java.lang.Double getAmountInMicros() {
          return amountInMicros;
        }

        /**
         * @param amountInMicros amountInMicros or {@code null} for none
         */
        public NextReleaseInfo setAmountInMicros(java.lang.Double amountInMicros) {
          this.amountInMicros = amountInMicros;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getCurrencyCode() {
          return currencyCode;
        }

        /**
         * @param currencyCode currencyCode or {@code null} for none
         */
        public NextReleaseInfo setCurrencyCode(java.lang.String currencyCode) {
          this.currencyCode = currencyCode;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getReleaseNumber() {
          return releaseNumber;
        }

        /**
         * @param releaseNumber releaseNumber or {@code null} for none
         */
        public NextReleaseInfo setReleaseNumber(java.lang.String releaseNumber) {
          this.releaseNumber = releaseNumber;
          return this;
        }

        /**
         * @return value or {@code null} for none
         */
        public java.lang.String getReleaseTime() {
          return releaseTime;
        }

        /**
         * @param releaseTime releaseTime or {@code null} for none
         */
        public NextReleaseInfo setReleaseTime(java.lang.String releaseTime) {
          this.releaseTime = releaseTime;
          return this;
        }

        @Override
        public NextReleaseInfo set(String fieldName, Object value) {
          return (NextReleaseInfo) super.set(fieldName, value);
        }

        @Override
        public NextReleaseInfo clone() {
          return (NextReleaseInfo) super.clone();
        }

      }
    }
  }

}
