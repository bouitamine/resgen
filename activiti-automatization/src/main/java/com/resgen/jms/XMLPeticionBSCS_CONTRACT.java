//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.31 a las 11:01:59 AM CET 
//


package com.resgen.jms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCuentaBSCS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TarifaVoz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TarifaDatos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RazonAlta" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Productos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DatosAdicionales" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idCuentaBSCS",
    "iccid",
    "msisdn",
    "accion",
    "tarifaVoz",
    "tarifaDatos",
    "razonAlta",
    "productos",
    "datosAdicionales"
})
@XmlRootElement(name = "XML_Peticion")
public class XMLPeticionBSCS_CONTRACT {

    @XmlElement(name = "IDCuentaBSCS", required = true)
    protected String idCuentaBSCS;
    @XmlElement(name = "ICCID", required = true)
    protected String iccid;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "Accion", required = true)
    protected String accion;
    @XmlElement(name = "TarifaVoz", required = true)
    protected String tarifaVoz;
    @XmlElement(name = "TarifaDatos", required = true)
    protected String tarifaDatos;
    @XmlElement(name = "RazonAlta")
    protected byte razonAlta;
    @XmlElement(name = "Productos", required = true)
    protected XMLPeticionBSCS_CONTRACT.Productos productos;
    @XmlElement(name = "DatosAdicionales")
    protected List<XMLPeticionBSCS_CONTRACT.DatosAdicionales> datosAdicionales;

    /**
     * Obtiene el valor de la propiedad idCuentaBSCS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCuentaBSCS() {
        return idCuentaBSCS;
    }

    /**
     * Define el valor de la propiedad idCuentaBSCS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCuentaBSCS(String value) {
        this.idCuentaBSCS = value;
    }

    /**
     * Obtiene el valor de la propiedad iccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCID() {
        return iccid;
    }

    /**
     * Define el valor de la propiedad iccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCID(String value) {
        this.iccid = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaVoz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaVoz() {
        return tarifaVoz;
    }

    /**
     * Define el valor de la propiedad tarifaVoz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaVoz(String value) {
        this.tarifaVoz = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaDatos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaDatos() {
        return tarifaDatos;
    }

    /**
     * Define el valor de la propiedad tarifaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaDatos(String value) {
        this.tarifaDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad razonAlta.
     * 
     */
    public byte getRazonAlta() {
        return razonAlta;
    }

    /**
     * Define el valor de la propiedad razonAlta.
     * 
     */
    public void setRazonAlta(byte value) {
        this.razonAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     * @return
     *     possible object is
     *     {@link XMLPeticionBSCS_CONTRACT.Productos }
     *     
     */
    public XMLPeticionBSCS_CONTRACT.Productos getProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPeticionBSCS_CONTRACT.Productos }
     *     
     */
    public void setProductos(XMLPeticionBSCS_CONTRACT.Productos value) {
        this.productos = value;
    }

    /**
     * Gets the value of the datosAdicionales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosAdicionales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosAdicionales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLPeticionBSCS_CONTRACT.DatosAdicionales }
     * 
     * 
     */
    public List<XMLPeticionBSCS_CONTRACT.DatosAdicionales> getDatosAdicionales() {
        if (datosAdicionales == null) {
            datosAdicionales = new ArrayList<XMLPeticionBSCS_CONTRACT.DatosAdicionales>();
        }
        return this.datosAdicionales;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "valor"
    })
    public static class DatosAdicionales {

        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "Valor", required = true)
        protected String valor;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad valor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValor() {
            return valor;
        }

        /**
         * Define el valor de la propiedad valor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValor(String value) {
            this.valor = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IDProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idProducto"
    })
    public static class Productos {

        @XmlElement(name = "IDProducto", required = true)
        protected String idProducto;

        /**
         * Obtiene el valor de la propiedad idProducto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDProducto() {
            return idProducto;
        }

        /**
         * Define el valor de la propiedad idProducto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDProducto(String value) {
            this.idProducto = value;
        }

    }

}
