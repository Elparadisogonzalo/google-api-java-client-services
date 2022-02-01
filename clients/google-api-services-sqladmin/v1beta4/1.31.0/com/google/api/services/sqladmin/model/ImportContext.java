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

package com.google.api.services.sqladmin.model;

/**
 * Database instance import context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportContext extends com.google.api.client.json.GenericJson {

  /**
   * Import parameters specific to SQL Server .BAK files
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BakImportOptions bakImportOptions;

  /**
   * Options for importing data as CSV.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CsvImportOptions csvImportOptions;

  /**
   * The target database for the import. If `fileType` is `SQL`, this field is required only if the
   * import file does not specify a database, and is overridden by any database specification in the
   * import file. If `fileType` is `CSV`, one database must be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String database;

  /**
   * The file type for the specified uri. * `SQL`: The file contains SQL statements. * `CSV`: The
   * file contains CSV data. * `BAK`: The file contains backup data for a SQL Server instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * The PostgreSQL user for this import operation. PostgreSQL instances only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importUser;

  /**
   * This is always `sql#importContext`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Path to the import file in Cloud Storage, in the form `gs://bucketName/fileName`. Compressed
   * gzip files (.gz) are supported when `fileType` is `SQL`. The instance must have write
   * permissions to the bucket and read access to the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Import parameters specific to SQL Server .BAK files
   * @return value or {@code null} for none
   */
  public BakImportOptions getBakImportOptions() {
    return bakImportOptions;
  }

  /**
   * Import parameters specific to SQL Server .BAK files
   * @param bakImportOptions bakImportOptions or {@code null} for none
   */
  public ImportContext setBakImportOptions(BakImportOptions bakImportOptions) {
    this.bakImportOptions = bakImportOptions;
    return this;
  }

  /**
   * Options for importing data as CSV.
   * @return value or {@code null} for none
   */
  public CsvImportOptions getCsvImportOptions() {
    return csvImportOptions;
  }

  /**
   * Options for importing data as CSV.
   * @param csvImportOptions csvImportOptions or {@code null} for none
   */
  public ImportContext setCsvImportOptions(CsvImportOptions csvImportOptions) {
    this.csvImportOptions = csvImportOptions;
    return this;
  }

  /**
   * The target database for the import. If `fileType` is `SQL`, this field is required only if the
   * import file does not specify a database, and is overridden by any database specification in the
   * import file. If `fileType` is `CSV`, one database must be specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * The target database for the import. If `fileType` is `SQL`, this field is required only if the
   * import file does not specify a database, and is overridden by any database specification in the
   * import file. If `fileType` is `CSV`, one database must be specified.
   * @param database database or {@code null} for none
   */
  public ImportContext setDatabase(java.lang.String database) {
    this.database = database;
    return this;
  }

  /**
   * The file type for the specified uri. * `SQL`: The file contains SQL statements. * `CSV`: The
   * file contains CSV data. * `BAK`: The file contains backup data for a SQL Server instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * The file type for the specified uri. * `SQL`: The file contains SQL statements. * `CSV`: The
   * file contains CSV data. * `BAK`: The file contains backup data for a SQL Server instance.
   * @param fileType fileType or {@code null} for none
   */
  public ImportContext setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * The PostgreSQL user for this import operation. PostgreSQL instances only.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportUser() {
    return importUser;
  }

  /**
   * The PostgreSQL user for this import operation. PostgreSQL instances only.
   * @param importUser importUser or {@code null} for none
   */
  public ImportContext setImportUser(java.lang.String importUser) {
    this.importUser = importUser;
    return this;
  }

  /**
   * This is always `sql#importContext`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#importContext`.
   * @param kind kind or {@code null} for none
   */
  public ImportContext setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Path to the import file in Cloud Storage, in the form `gs://bucketName/fileName`. Compressed
   * gzip files (.gz) are supported when `fileType` is `SQL`. The instance must have write
   * permissions to the bucket and read access to the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Path to the import file in Cloud Storage, in the form `gs://bucketName/fileName`. Compressed
   * gzip files (.gz) are supported when `fileType` is `SQL`. The instance must have write
   * permissions to the bucket and read access to the file.
   * @param uri uri or {@code null} for none
   */
  public ImportContext setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ImportContext set(String fieldName, Object value) {
    return (ImportContext) super.set(fieldName, value);
  }

  @Override
  public ImportContext clone() {
    return (ImportContext) super.clone();
  }

  /**
   * Import parameters specific to SQL Server .BAK files
   */
  public static final class BakImportOptions extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EncryptionOptions encryptionOptions;

    /**
     * @return value or {@code null} for none
     */
    public EncryptionOptions getEncryptionOptions() {
      return encryptionOptions;
    }

    /**
     * @param encryptionOptions encryptionOptions or {@code null} for none
     */
    public BakImportOptions setEncryptionOptions(EncryptionOptions encryptionOptions) {
      this.encryptionOptions = encryptionOptions;
      return this;
    }

    @Override
    public BakImportOptions set(String fieldName, Object value) {
      return (BakImportOptions) super.set(fieldName, value);
    }

    @Override
    public BakImportOptions clone() {
      return (BakImportOptions) super.clone();
    }

    /**
     * Model definition for ImportContextBakImportOptionsEncryptionOptions.
     */
    public static final class EncryptionOptions extends com.google.api.client.json.GenericJson {

      /**
       * Path to the Certificate (.cer) in Cloud Storage, in the form `gs://bucketName/fileName`. The
       * instance must have write permissions to the bucket and read access to the file.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String certPath;

      /**
       * Password that encrypts the private key
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String pvkPassword;

      /**
       * Path to the Certificate Private Key (.pvk) in Cloud Storage, in the form
       * `gs://bucketName/fileName`. The instance must have write permissions to the bucket and read
       * access to the file.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String pvkPath;

      /**
       * Path to the Certificate (.cer) in Cloud Storage, in the form `gs://bucketName/fileName`. The
       * instance must have write permissions to the bucket and read access to the file.
       * @return value or {@code null} for none
       */
      public java.lang.String getCertPath() {
        return certPath;
      }

      /**
       * Path to the Certificate (.cer) in Cloud Storage, in the form `gs://bucketName/fileName`. The
       * instance must have write permissions to the bucket and read access to the file.
       * @param certPath certPath or {@code null} for none
       */
      public EncryptionOptions setCertPath(java.lang.String certPath) {
        this.certPath = certPath;
        return this;
      }

      /**
       * Password that encrypts the private key
       * @return value or {@code null} for none
       */
      public java.lang.String getPvkPassword() {
        return pvkPassword;
      }

      /**
       * Password that encrypts the private key
       * @param pvkPassword pvkPassword or {@code null} for none
       */
      public EncryptionOptions setPvkPassword(java.lang.String pvkPassword) {
        this.pvkPassword = pvkPassword;
        return this;
      }

      /**
       * Path to the Certificate Private Key (.pvk) in Cloud Storage, in the form
       * `gs://bucketName/fileName`. The instance must have write permissions to the bucket and read
       * access to the file.
       * @return value or {@code null} for none
       */
      public java.lang.String getPvkPath() {
        return pvkPath;
      }

      /**
       * Path to the Certificate Private Key (.pvk) in Cloud Storage, in the form
       * `gs://bucketName/fileName`. The instance must have write permissions to the bucket and read
       * access to the file.
       * @param pvkPath pvkPath or {@code null} for none
       */
      public EncryptionOptions setPvkPath(java.lang.String pvkPath) {
        this.pvkPath = pvkPath;
        return this;
      }

      @Override
      public EncryptionOptions set(String fieldName, Object value) {
        return (EncryptionOptions) super.set(fieldName, value);
      }

      @Override
      public EncryptionOptions clone() {
        return (EncryptionOptions) super.clone();
      }

    }
  }

  /**
   * Options for importing data as CSV.
   */
  public static final class CsvImportOptions extends com.google.api.client.json.GenericJson {

    /**
     * The columns to which CSV data is imported. If not specified, all columns of the database table
     * are loaded with CSV data.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> columns;

    /**
     * Specifies the character that should appear before a data character that needs to be escaped.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String escapeCharacter;

    /**
     * Specifies the character that separates columns within each row (line) of the file.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String fieldsTerminatedBy;

    /**
     * This is used to separate lines. If a line does not contain all fields, the rest of the columns
     * are set to their default values.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String linesTerminatedBy;

    /**
     * Specifies the quoting character to be used when a data value is quoted.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String quoteCharacter;

    /**
     * The table to which CSV data is imported.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String table;

    /**
     * The columns to which CSV data is imported. If not specified, all columns of the database table
     * are loaded with CSV data.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getColumns() {
      return columns;
    }

    /**
     * The columns to which CSV data is imported. If not specified, all columns of the database table
     * are loaded with CSV data.
     * @param columns columns or {@code null} for none
     */
    public CsvImportOptions setColumns(java.util.List<java.lang.String> columns) {
      this.columns = columns;
      return this;
    }

    /**
     * Specifies the character that should appear before a data character that needs to be escaped.
     * @return value or {@code null} for none
     */
    public java.lang.String getEscapeCharacter() {
      return escapeCharacter;
    }

    /**
     * Specifies the character that should appear before a data character that needs to be escaped.
     * @param escapeCharacter escapeCharacter or {@code null} for none
     */
    public CsvImportOptions setEscapeCharacter(java.lang.String escapeCharacter) {
      this.escapeCharacter = escapeCharacter;
      return this;
    }

    /**
     * Specifies the character that separates columns within each row (line) of the file.
     * @return value or {@code null} for none
     */
    public java.lang.String getFieldsTerminatedBy() {
      return fieldsTerminatedBy;
    }

    /**
     * Specifies the character that separates columns within each row (line) of the file.
     * @param fieldsTerminatedBy fieldsTerminatedBy or {@code null} for none
     */
    public CsvImportOptions setFieldsTerminatedBy(java.lang.String fieldsTerminatedBy) {
      this.fieldsTerminatedBy = fieldsTerminatedBy;
      return this;
    }

    /**
     * This is used to separate lines. If a line does not contain all fields, the rest of the columns
     * are set to their default values.
     * @return value or {@code null} for none
     */
    public java.lang.String getLinesTerminatedBy() {
      return linesTerminatedBy;
    }

    /**
     * This is used to separate lines. If a line does not contain all fields, the rest of the columns
     * are set to their default values.
     * @param linesTerminatedBy linesTerminatedBy or {@code null} for none
     */
    public CsvImportOptions setLinesTerminatedBy(java.lang.String linesTerminatedBy) {
      this.linesTerminatedBy = linesTerminatedBy;
      return this;
    }

    /**
     * Specifies the quoting character to be used when a data value is quoted.
     * @return value or {@code null} for none
     */
    public java.lang.String getQuoteCharacter() {
      return quoteCharacter;
    }

    /**
     * Specifies the quoting character to be used when a data value is quoted.
     * @param quoteCharacter quoteCharacter or {@code null} for none
     */
    public CsvImportOptions setQuoteCharacter(java.lang.String quoteCharacter) {
      this.quoteCharacter = quoteCharacter;
      return this;
    }

    /**
     * The table to which CSV data is imported.
     * @return value or {@code null} for none
     */
    public java.lang.String getTable() {
      return table;
    }

    /**
     * The table to which CSV data is imported.
     * @param table table or {@code null} for none
     */
    public CsvImportOptions setTable(java.lang.String table) {
      this.table = table;
      return this;
    }

    @Override
    public CsvImportOptions set(String fieldName, Object value) {
      return (CsvImportOptions) super.set(fieldName, value);
    }

    @Override
    public CsvImportOptions clone() {
      return (CsvImportOptions) super.clone();
    }

  }

}
