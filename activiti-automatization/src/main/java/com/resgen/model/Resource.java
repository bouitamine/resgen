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

import io.swagger.annotations.ApiModelProperty;


/**
 * Resource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-18T19:09:46.109+02:00")
public class Resource   {
  @SerializedName("msisdn")
  private String msisdn;

  @SerializedName("imsi")
  private String imsi = null;

  @SerializedName("iccid")
  private String iccid = null;

  public Resource msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

//  public Resource() {
//	    this.setMsisdn(msisdn);
//	    this.setIccid(iccid);
//	    this.setImsi(imsi);
//	  
//	  }
   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMsisdn() {
    return msisdn;
  } 

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public Resource imsi(String imsi) {
    this.imsi = imsi;
    return this;
  }

   /**
   * Get imsi
   * @return imsi
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public Resource iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

   /**
   * Get iccid
   * @return iccid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.msisdn, resource.msisdn) &&
        Objects.equals(this.imsi, resource.imsi) &&
        Objects.equals(this.iccid, resource.iccid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, imsi, iccid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
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
