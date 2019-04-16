//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{}attlist.RENTAL_UNIT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RENTAL_UNIT")
public class RENTALUNIT {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "UnitSequenceIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitSequenceIdentifier;
    @XmlAttribute(name = "TotalRoomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalRoomCount;
    @XmlAttribute(name = "TotalBedroomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalBedroomCount;
    @XmlAttribute(name = "TotalBathroomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalBathroomCount;
    @XmlAttribute(name = "SquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String squareFeetCount;
    @XmlAttribute(name = "MonthlyRentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String monthlyRentAmount;

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
     * Gets the value of the unitSequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSequenceIdentifier() {
        return unitSequenceIdentifier;
    }

    /**
     * Sets the value of the unitSequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSequenceIdentifier(String value) {
        this.unitSequenceIdentifier = value;
    }

    /**
     * Gets the value of the totalRoomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRoomCount() {
        return totalRoomCount;
    }

    /**
     * Sets the value of the totalRoomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRoomCount(String value) {
        this.totalRoomCount = value;
    }

    /**
     * Gets the value of the totalBedroomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBedroomCount() {
        return totalBedroomCount;
    }

    /**
     * Sets the value of the totalBedroomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBedroomCount(String value) {
        this.totalBedroomCount = value;
    }

    /**
     * Gets the value of the totalBathroomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBathroomCount() {
        return totalBathroomCount;
    }

    /**
     * Sets the value of the totalBathroomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBathroomCount(String value) {
        this.totalBathroomCount = value;
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

    /**
     * Gets the value of the monthlyRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyRentAmount() {
        return monthlyRentAmount;
    }

    /**
     * Sets the value of the monthlyRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyRentAmount(String value) {
        this.monthlyRentAmount = value;
    }

}