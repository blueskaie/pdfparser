//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ATTIC_FEATURE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LEVEL" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.ATTIC"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "atticfeature",
    "level"
})
@XmlRootElement(name = "ATTIC")
public class ATTIC {

    @XmlElement(name = "ATTIC_FEATURE")
    protected List<ATTICFEATURE> atticfeature;
    @XmlElement(name = "LEVEL")
    protected LEVEL level;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_ExistsIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String existsIndicator;
    @XmlAttribute(name = "SquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String squareFeetCount;

    /**
     * Gets the value of the atticfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atticfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTICFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTICFEATURE }
     * 
     * 
     */
    public List<ATTICFEATURE> getATTICFEATURE() {
        if (atticfeature == null) {
            atticfeature = new ArrayList<ATTICFEATURE>();
        }
        return this.atticfeature;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LEVEL }
     *     
     */
    public LEVEL getLEVEL() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEVEL }
     *     
     */
    public void setLEVEL(LEVEL value) {
        this.level = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the existsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistsIndicator() {
        return existsIndicator;
    }

    /**
     * Sets the value of the existsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistsIndicator(String value) {
        this.existsIndicator = value;
    }

    /**
     * Gets the value of the squareFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFeetCount() {
        return squareFeetCount;
    }

    /**
     * Sets the value of the squareFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFeetCount(String value) {
        this.squareFeetCount = value;
    }

}