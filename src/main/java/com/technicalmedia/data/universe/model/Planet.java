/*
 * Data Universe
 * This is a sample Data Universe server.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: datumgeek@yahoo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.technicalmedia.data.universe.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Planet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-28T05:23:16.947-06:00")
public class Planet   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orderFromSun")
  private Integer orderFromSun = null;

  @JsonProperty("size")
  private Double size = null;

  @JsonProperty("moons")
  private List<Moon> moons = new ArrayList<Moon>();

  public Planet id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Planet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Planet orderFromSun(Integer orderFromSun) {
    this.orderFromSun = orderFromSun;
    return this;
  }

   /**
   * Get orderFromSun
   * @return orderFromSun
  **/
  @JsonProperty("orderFromSun")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getOrderFromSun() {
    return orderFromSun;
  }

  public void setOrderFromSun(Integer orderFromSun) {
    this.orderFromSun = orderFromSun;
  }

  public Planet size(Double size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  @ApiModelProperty(value = "")
  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  public Planet moons(List<Moon> moons) {
    this.moons = moons;
    return this;
  }

  public Planet addMoonsItem(Moon moonsItem) {
    this.moons.add(moonsItem);
    return this;
  }

   /**
   * Get moons
   * @return moons
  **/
  @JsonProperty("moons")
  @ApiModelProperty(value = "")
  public List<Moon> getMoons() {
    return moons;
  }

  public void setMoons(List<Moon> moons) {
    this.moons = moons;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Planet planet = (Planet) o;
    return Objects.equals(this.id, planet.id) &&
        Objects.equals(this.name, planet.name) &&
        Objects.equals(this.orderFromSun, planet.orderFromSun) &&
        Objects.equals(this.size, planet.size) &&
        Objects.equals(this.moons, planet.moons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orderFromSun, size, moons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Planet {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderFromSun: ").append(toIndentedString(orderFromSun)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    moons: ").append(toIndentedString(moons)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

