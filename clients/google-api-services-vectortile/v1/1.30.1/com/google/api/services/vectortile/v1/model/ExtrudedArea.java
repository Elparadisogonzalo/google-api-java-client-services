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

package com.google.api.services.vectortile.v1.model;

/**
 * Represents a height-extruded area: a 3D prism with a constant X-Y plane cross section. Used to
 * represent extruded buildings. A single building may consist of several extruded areas. The min_z
 * and max_z fields are scaled to the size of the tile. An extruded area with a max_z value of 4096
 * has the same height as the width of the tile that it is on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Semantic Tile API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExtrudedArea extends com.google.api.client.json.GenericJson {

  /**
   * The area representing the footprint of the extruded area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Area area;

  /**
   * The z-value in local tile coordinates where the extruded area ends.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxZ;

  /**
   * The z-value in local tile coordinates where the extruded area begins. This is non-zero for
   * extruded areas that begin off the ground. For example, a building with a skybridge may have an
   * extruded area component with a non-zero min_z.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minZ;

  /**
   * The area representing the footprint of the extruded area.
   * @return value or {@code null} for none
   */
  public Area getArea() {
    return area;
  }

  /**
   * The area representing the footprint of the extruded area.
   * @param area area or {@code null} for none
   */
  public ExtrudedArea setArea(Area area) {
    this.area = area;
    return this;
  }

  /**
   * The z-value in local tile coordinates where the extruded area ends.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxZ() {
    return maxZ;
  }

  /**
   * The z-value in local tile coordinates where the extruded area ends.
   * @param maxZ maxZ or {@code null} for none
   */
  public ExtrudedArea setMaxZ(java.lang.Integer maxZ) {
    this.maxZ = maxZ;
    return this;
  }

  /**
   * The z-value in local tile coordinates where the extruded area begins. This is non-zero for
   * extruded areas that begin off the ground. For example, a building with a skybridge may have an
   * extruded area component with a non-zero min_z.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinZ() {
    return minZ;
  }

  /**
   * The z-value in local tile coordinates where the extruded area begins. This is non-zero for
   * extruded areas that begin off the ground. For example, a building with a skybridge may have an
   * extruded area component with a non-zero min_z.
   * @param minZ minZ or {@code null} for none
   */
  public ExtrudedArea setMinZ(java.lang.Integer minZ) {
    this.minZ = minZ;
    return this;
  }

  @Override
  public ExtrudedArea set(String fieldName, Object value) {
    return (ExtrudedArea) super.set(fieldName, value);
  }

  @Override
  public ExtrudedArea clone() {
    return (ExtrudedArea) super.clone();
  }

}
