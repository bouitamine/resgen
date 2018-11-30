/**
 * Swagger RESGEN
 * This is a API REST field for RESGEN proyect.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.resgen.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Systems
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-18T19:09:46.109+02:00")
public class Systems   {
  @SerializedName("BSCS")
  private Boolean BSCS = true;

  @SerializedName("TA")
  private Boolean TA = true;

  @SerializedName("OCS")
  private Boolean OCS = true;

  @SerializedName("INTRANSIT")
  private Boolean INTRANSIT = true;

  @SerializedName("PERSA")
  private Boolean PERSA = false;

  @SerializedName("TAO")
  private Boolean TAO = true;

  @SerializedName("SEDNA")
  private Boolean SEDNA = true;

  @SerializedName("OPENCOBROS")
  private Boolean OPENCOBROS = true;

  @SerializedName("COCO")
  private Boolean COCO = true;

  @SerializedName("RESER")
  private Boolean RESER = true;

  @SerializedName("SIGMA")
  private Boolean SIGMA = true;

  public Systems BSCS(Boolean BSCS) {
    this.BSCS = BSCS;
    return this;
  }

   /**
   * Get BSCS
   * @return BSCS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBSCS() {
    return BSCS;
  }

  public void setBSCS(Boolean BSCS) {
    this.BSCS = BSCS;
  }

  public Systems TA(Boolean TA) {
    this.TA = TA;
    return this;
  }

   /**
   * Get TA
   * @return TA
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTA() {
    return TA;
  }

  public void setTA(Boolean TA) {
    this.TA = TA;
  }

  public Systems OCS(Boolean OCS) {
    this.OCS = OCS;
    return this;
  }

   /**
   * Get OCS
   * @return OCS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOCS() {
    return OCS;
  }

  public void setOCS(Boolean OCS) {
    this.OCS = OCS;
  }

  public Systems INTRANSIT(Boolean INTRANSIT) {
    this.INTRANSIT = INTRANSIT;
    return this;
  }

   /**
   * Get INTRANSIT
   * @return INTRANSIT
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getINTRANSIT() {
    return INTRANSIT;
  }

  public void setINTRANSIT(Boolean INTRANSIT) {
    this.INTRANSIT = INTRANSIT;
  }

  public Systems PERSA(Boolean PERSA) {
    this.PERSA = PERSA;
    return this;
  }

   /**
   * Get PERSA
   * @return PERSA
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPERSA() {
    return PERSA;
  }

  public void setPERSA(Boolean PERSA) {
    this.PERSA = PERSA;
  }

  public Systems TAO(Boolean TAO) {
    this.TAO = TAO;
    return this;
  }

   /**
   * Get TAO
   * @return TAO
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTAO() {
    return TAO;
  }

  public void setTAO(Boolean TAO) {
    this.TAO = TAO;
  }

  public Systems SEDNA(Boolean SEDNA) {
    this.SEDNA = SEDNA;
    return this;
  }

   /**
   * Get SEDNA
   * @return SEDNA
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSEDNA() {
    return SEDNA;
  }

  public void setSEDNA(Boolean SEDNA) {
    this.SEDNA = SEDNA;
  }

  public Systems OPENCOBROS(Boolean OPENCOBROS) {
    this.OPENCOBROS = OPENCOBROS;
    return this;
  }

   /**
   * Get OPENCOBROS
   * @return OPENCOBROS
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOPENCOBROS() {
    return OPENCOBROS;
  }

  public void setOPENCOBROS(Boolean OPENCOBROS) {
    this.OPENCOBROS = OPENCOBROS;
  }

  public Systems COCO(Boolean COCO) {
    this.COCO = COCO;
    return this;
  }

   /**
   * Get COCO
   * @return COCO
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCOCO() {
    return COCO;
  }

  public void setCOCO(Boolean COCO) {
    this.COCO = COCO;
  }

  public Systems RESER(Boolean RESER) {
    this.RESER = RESER;
    return this;
  }

   /**
   * Get RESER
   * @return RESER
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRESER() {
    return RESER;
  }

  public void setRESER(Boolean RESER) {
    this.RESER = RESER;
  }

  public Systems SIGMA(Boolean SIGMA) {
    this.SIGMA = SIGMA;
    return this;
  }

   /**
   * Get SIGMA
   * @return SIGMA
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSIGMA() {
    return SIGMA;
  }

  public void setSIGMA(Boolean SIGMA) {
    this.SIGMA = SIGMA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Systems systems = (Systems) o;
    return Objects.equals(this.BSCS, systems.BSCS) &&
        Objects.equals(this.TA, systems.TA) &&
        Objects.equals(this.OCS, systems.OCS) &&
        Objects.equals(this.INTRANSIT, systems.INTRANSIT) &&
        Objects.equals(this.PERSA, systems.PERSA) &&
        Objects.equals(this.TAO, systems.TAO) &&
        Objects.equals(this.SEDNA, systems.SEDNA) &&
        Objects.equals(this.OPENCOBROS, systems.OPENCOBROS) &&
        Objects.equals(this.COCO, systems.COCO) &&
        Objects.equals(this.RESER, systems.RESER) &&
        Objects.equals(this.SIGMA, systems.SIGMA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BSCS, TA, OCS, INTRANSIT, PERSA, TAO, SEDNA, OPENCOBROS, COCO, RESER, SIGMA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Systems {\n");
    
    sb.append("    BSCS: ").append(toIndentedString(BSCS)).append("\n");
    sb.append("    TA: ").append(toIndentedString(TA)).append("\n");
    sb.append("    OCS: ").append(toIndentedString(OCS)).append("\n");
    sb.append("    INTRANSIT: ").append(toIndentedString(INTRANSIT)).append("\n");
    sb.append("    PERSA: ").append(toIndentedString(PERSA)).append("\n");
    sb.append("    TAO: ").append(toIndentedString(TAO)).append("\n");
    sb.append("    SEDNA: ").append(toIndentedString(SEDNA)).append("\n");
    sb.append("    OPENCOBROS: ").append(toIndentedString(OPENCOBROS)).append("\n");
    sb.append("    COCO: ").append(toIndentedString(COCO)).append("\n");
    sb.append("    RESER: ").append(toIndentedString(RESER)).append("\n");
    sb.append("    SIGMA: ").append(toIndentedString(SIGMA)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

