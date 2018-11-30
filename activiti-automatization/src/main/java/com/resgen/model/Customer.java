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
 * Customer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-18T19:09:46.109+02:00")
public class Customer   {
  /**
   * segment of customer
   */
  public enum PRGCODEEnum {
    @SerializedName("POSTRESD")
    POSTRESD("POSTRESD"),
    
    @SerializedName("PRE")
    PRE("PRE"),
    
    @SerializedName("POSTAUT")
    POSTAUT("POSTAUT"),
    
    @SerializedName("POSTEMPB")
    POSTEMPB("POSTEMPB"),
    
    @SerializedName("POSTRESLC")
    POSTRESLC("POSTRESLC");

    private String value;

    PRGCODEEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("PRGCODE")
  private PRGCODEEnum PRGCODE = null;

  @SerializedName("exist")
  private Boolean exist = null;

  @SerializedName("IdNumber")
  private String idNumber = null;
  
  private String CustomerSubtype = null;
  
  private String CustomerType = null;
  
  private String PRGCODEString = null;
  
  

  public String getCustomerSubtype() {
	return CustomerSubtype;
}

public void setCustomerSubtype(String customerSubtype) {
	CustomerSubtype = customerSubtype;
}

public String getCustomerType() {
	return CustomerType;
}

public void setCustomerType(String customerType) {
	CustomerType = customerType;
}

public String getPRGCODEString() {
	return PRGCODEString;
}

public void setPRGCODEString(String pRGCODEString) {
	PRGCODEString = pRGCODEString;
}

/**
   * type of document
   */
  public enum TypeIdNumberEnum {
    @SerializedName("PASSPORT")
    PASSPORT("PASSPORT"),
    
    @SerializedName("NIE")
    NIE("NIE"),
    
    @SerializedName("DNI")
    DNI("DNI");

    private String value;

    TypeIdNumberEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("typeIdNumber")
  private TypeIdNumberEnum typeIdNumber = null;

  @SerializedName("name")
  private String name = "John";

  @SerializedName("lastname")
  private String lastname = "Smith";

  public Customer PRGCODE(PRGCODEEnum PRGCODE) {
    this.PRGCODE = PRGCODE;
    return this;
  }

   /**
   * segment of customer
   * @return PRGCODE
  **/
  @ApiModelProperty(example = "null", required = true, value = "segment of customer")
  public PRGCODEEnum getPRGCODE() {
    return PRGCODE;
  }

  public void setPRGCODE(PRGCODEEnum PRGCODE) {
    this.PRGCODE = PRGCODE;
  }

  public Customer exist(Boolean exist) {
    this.exist = exist;
    return this;
  }

   /**
   * Get exist
   * @return exist
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getExist() {
    return exist;
  }

  public void setExist(Boolean exist) {
    this.exist = exist;
  }

  public Customer idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

   /**
   * DNI, PASSPORT, NIE number
   * @return idNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "DNI, PASSPORT, NIE number")
  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public Customer typeIdNumber(TypeIdNumberEnum typeIdNumber) {
    this.typeIdNumber = typeIdNumber;
    return this;
  }

   /**
   * type of document
   * @return typeIdNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "type of document")
  public TypeIdNumberEnum getTypeIdNumber() {
    return typeIdNumber;
  }

  public void setTypeIdNumber(TypeIdNumberEnum typeIdNumber) {
    this.typeIdNumber = typeIdNumber;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.PRGCODE, customer.PRGCODE) &&
        Objects.equals(this.exist, customer.exist) &&
        Objects.equals(this.idNumber, customer.idNumber) &&
        Objects.equals(this.typeIdNumber, customer.typeIdNumber) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.lastname, customer.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRGCODE, exist, idNumber, typeIdNumber, name, lastname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    PRGCODE: ").append(toIndentedString(PRGCODE)).append("\n");
    sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    typeIdNumber: ").append(toIndentedString(typeIdNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
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

