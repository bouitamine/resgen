//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.29 a las 03:59:44 PM CET 
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
 *         &lt;element name="IDCuentaSIEBEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatosCliente" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="ContactoCliente" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Atributos" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DatosPagoCliente" maxOccurs="unbounded" minOccurs="0">
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
    "idCuentaSIEBEL",
    "msisdn",
    "tipoDocumento",
    "numeroDocumento",
    "datosCliente",
    "contactoCliente",
    "datosPagoCliente",
    "datosAdicionales"
})
@XmlRootElement(name = "XML_Peticion")
public class XMLPeticionBSCS_CUSTOMER {

    @XmlElement(name = "IDCuentaSIEBEL", required = true)
    protected String idCuentaSIEBEL;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "DatosCliente")
    protected List<XMLPeticionBSCS_CUSTOMER.DatosCliente> datosCliente;
    @XmlElement(name = "ContactoCliente")
    protected List<XMLPeticionBSCS_CUSTOMER.ContactoCliente> contactoCliente;
    @XmlElement(name = "DatosPagoCliente")
    protected List<XMLPeticionBSCS_CUSTOMER.DatosPagoCliente> datosPagoCliente;
    @XmlElement(name = "DatosAdicionales")
    protected List<XMLPeticionBSCS_CUSTOMER.DatosAdicionales> datosAdicionales;

    /**
     * Obtiene el valor de la propiedad idCuentaSIEBEL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCuentaSIEBEL() {
        return idCuentaSIEBEL;
    }

    /**
     * Define el valor de la propiedad idCuentaSIEBEL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCuentaSIEBEL(String value) {
        this.idCuentaSIEBEL = value;
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
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the datosCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLPeticionBSCS_CUSTOMER.DatosCliente }
     * 
     * 
     */
    public List<XMLPeticionBSCS_CUSTOMER.DatosCliente> getDatosCliente() {
        if (datosCliente == null) {
            datosCliente = new ArrayList<XMLPeticionBSCS_CUSTOMER.DatosCliente>();
        }
        return this.datosCliente;
    }

    /**
     * Gets the value of the contactoCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactoCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactoCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLPeticionBSCS_CUSTOMER.ContactoCliente }
     * 
     * 
     */
    public List<XMLPeticionBSCS_CUSTOMER.ContactoCliente> getContactoCliente() {
        if (contactoCliente == null) {
            contactoCliente = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente>();
        }
        return this.contactoCliente;
    }

    /**
     * Gets the value of the datosPagoCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosPagoCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosPagoCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLPeticionBSCS_CUSTOMER.DatosPagoCliente }
     * 
     * 
     */
    public List<XMLPeticionBSCS_CUSTOMER.DatosPagoCliente> getDatosPagoCliente() {
        if (datosPagoCliente == null) {
            datosPagoCliente = new ArrayList<XMLPeticionBSCS_CUSTOMER.DatosPagoCliente>();
        }
        return this.datosPagoCliente;
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
     * {@link XMLPeticionBSCS_CUSTOMER.DatosAdicionales }
     * 
     * 
     */
    public List<XMLPeticionBSCS_CUSTOMER.DatosAdicionales> getDatosAdicionales() {
        if (datosAdicionales == null) {
            datosAdicionales = new ArrayList<XMLPeticionBSCS_CUSTOMER.DatosAdicionales>();
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
     *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Atributos" maxOccurs="unbounded" minOccurs="0">
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
        "tipo",
        "atributos"
    })
    public static class ContactoCliente {

        @XmlElement(name = "Tipo", required = true)
        protected String tipo;
        @XmlElement(name = "Atributos")
        protected List<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos> atributos;

        /**
         * Obtiene el valor de la propiedad tipo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Define el valor de la propiedad tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }

        /**
         * Gets the value of the atributos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atributos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAtributos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos }
         * 
         * 
         */
        public List<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos> getAtributos() {
            if (atributos == null) {
                atributos = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos>();
            }
            return this.atributos;
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
        public static class Atributos {

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
    public static class DatosCliente {

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
    public static class DatosPagoCliente {

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

}
