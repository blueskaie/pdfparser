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
 *         &lt;element ref="{}LOCATION" minOccurs="0"/>
 *         &lt;element ref="{}RENTAL_UNIT" maxOccurs="unbounded"/>
 *         &lt;element ref="{}RENTAL_FEATURE" maxOccurs="unbounded"/>
 *         &lt;element ref="{}OTHER_FEATURE_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IMAGE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.MULTIFAMILY_RENTAL"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "rentalunit",
    "rentalfeature",
    "otherfeaturedescription",
    "image"
})
@XmlRootElement(name = "MULTIFAMILY_RENTAL")
public class MULTIFAMILYRENTAL {

    @XmlElement(name = "LOCATION")
    protected LOCATION location;
    @XmlElement(name = "RENTAL_UNIT", required = true)
    protected List<RENTALUNIT> rentalunit;
    @XmlElement(name = "RENTAL_FEATURE", required = true)
    protected List<RENTALFEATURE> rentalfeature;
    @XmlElement(name = "OTHER_FEATURE_DESCRIPTION")
    protected List<OTHERFEATUREDESCRIPTION> otherfeaturedescription;
    @XmlElement(name = "IMAGE")
    protected List<IMAGE> image;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "PropertySequenceIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertySequenceIdentifier;
    @XmlAttribute(name = "MonthlyRentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String monthlyRentAmount;
    @XmlAttribute(name = "RentPerGrossBuildingAreaAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentPerGrossBuildingAreaAmount;
    @XmlAttribute(name = "RentControlStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rentControlStatusType;
    @XmlAttribute(name = "DataSourceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSourceDescription;
    @XmlAttribute(name = "GrossBuildingAreaSquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String grossBuildingAreaSquareFeetCount;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATION }
     *     
     */
    public LOCATION getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATION }
     *     
     */
    public void setLOCATION(LOCATION value) {
        this.location = value;
    }

    /**
     * Gets the value of the rentalunit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalunit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRENTALUNIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RENTALUNIT }
     * 
     * 
     */
    public List<RENTALUNIT> getRENTALUNIT() {
        if (rentalunit == null) {
            rentalunit = new ArrayList<RENTALUNIT>();
        }
        return this.rentalunit;
    }

    /**
     * Gets the value of the rentalfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRENTALFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RENTALFEATURE }
     * 
     * 
     */
    public List<RENTALFEATURE> getRENTALFEATURE() {
        if (rentalfeature == null) {
            rentalfeature = new ArrayList<RENTALFEATURE>();
        }
        return this.rentalfeature;
    }

    /**
     * Gets the value of the otherfeaturedescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherfeaturedescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTHERFEATUREDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTHERFEATUREDESCRIPTION }
     * 
     * 
     */
    public List<OTHERFEATUREDESCRIPTION> getOTHERFEATUREDESCRIPTION() {
        if (otherfeaturedescription == null) {
            otherfeaturedescription = new ArrayList<OTHERFEATUREDESCRIPTION>();
        }
        return this.otherfeaturedescription;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIMAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IMAGE }
     * 
     * 
     */
    public List<IMAGE> getIMAGE() {
        if (image == null) {
            image = new ArrayList<IMAGE>();
        }
        return this.image;
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
     * Gets the value of the propertySequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySequenceIdentifier() {
        return propertySequenceIdentifier;
    }

    /**
     * Sets the value of the propertySequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySequenceIdentifier(String value) {
        this.propertySequenceIdentifier = value;
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

    /**
     * Gets the value of the rentPerGrossBuildingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentPerGrossBuildingAreaAmount() {
        return rentPerGrossBuildingAreaAmount;
    }

    /**
     * Sets the value of the rentPerGrossBuildingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentPerGrossBuildingAreaAmount(String value) {
        this.rentPerGrossBuildingAreaAmount = value;
    }

    /**
     * Gets the value of the rentControlStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentControlStatusType() {
        return rentControlStatusType;
    }

    /**
     * Sets the value of the rentControlStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentControlStatusType(String value) {
        this.rentControlStatusType = value;
    }

    /**
     * Gets the value of the dataSourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceDescription() {
        return dataSourceDescription;
    }

    /**
     * Sets the value of the dataSourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceDescription(String value) {
        this.dataSourceDescription = value;
    }

    /**
     * Gets the value of the grossBuildingAreaSquareFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossBuildingAreaSquareFeetCount() {
        return grossBuildingAreaSquareFeetCount;
    }

    /**
     * Sets the value of the grossBuildingAreaSquareFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossBuildingAreaSquareFeetCount(String value) {
        this.grossBuildingAreaSquareFeetCount = value;
    }

}