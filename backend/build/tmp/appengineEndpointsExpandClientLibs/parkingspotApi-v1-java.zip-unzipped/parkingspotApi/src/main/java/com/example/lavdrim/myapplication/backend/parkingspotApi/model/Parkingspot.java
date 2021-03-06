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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2018-01-09 at 07:56:42 UTC 
 * Modify at your own risk.
 */

package com.example.lavdrim.myapplication.backend.parkingspotApi.model;

/**
 * Model definition for Parkingspot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the parkingspotApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Parkingspot extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double coordinatex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double coordinatey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long iduser;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double price;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public Parkingspot setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getCoordinatex() {
    return coordinatex;
  }

  /**
   * @param coordinatex coordinatex or {@code null} for none
   */
  public Parkingspot setCoordinatex(java.lang.Double coordinatex) {
    this.coordinatex = coordinatex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getCoordinatey() {
    return coordinatey;
  }

  /**
   * @param coordinatey coordinatey or {@code null} for none
   */
  public Parkingspot setCoordinatey(java.lang.Double coordinatey) {
    this.coordinatey = coordinatey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Parkingspot setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIduser() {
    return iduser;
  }

  /**
   * @param iduser iduser or {@code null} for none
   */
  public Parkingspot setIduser(java.lang.Long iduser) {
    this.iduser = iduser;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public Parkingspot setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getPrice() {
    return price;
  }

  /**
   * @param price price or {@code null} for none
   */
  public Parkingspot setPrice(java.lang.Double price) {
    this.price = price;
    return this;
  }

  @Override
  public Parkingspot set(String fieldName, Object value) {
    return (Parkingspot) super.set(fieldName, value);
  }

  @Override
  public Parkingspot clone() {
    return (Parkingspot) super.clone();
  }

}
