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
 *       &lt;attGroup ref="{}attlist._TYPICAL_APARTMENT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "_TYPICAL_APARTMENT")
public class TYPICALAPARTMENT {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "AgeYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String ageYearsCount;
    @XmlAttribute(name = "_Description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "_EstimatedVacancyPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String estimatedVacancyPercent;
    @XmlAttribute(name = "_VacancyTrendType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vacancyTrendType;
    @XmlAttribute(name = "_RentHighPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentHighPriceAmount;
    @XmlAttribute(name = "_RentLowPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentLowPriceAmount;
    @XmlAttribute(name = "_RentTrendType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rentTrendType;
    @XmlAttribute(name = "RentControlStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rentControlStatusType;
    @XmlAttribute(name = "RentControlDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String rentControlDescription;
    @XmlAttribute(name = "StoriesCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String storiesCount;
    @XmlAttribute(name = "LivingUnitCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String livingUnitCount;

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
     * Gets the value of the ageYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeYearsCount() {
        return ageYearsCount;
    }

    /**
     * Sets the value of the ageYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeYearsCount(String value) {
        this.ageYearsCount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the estimatedVacancyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedVacancyPercent() {
        return estimatedVacancyPercent;
    }

    /**
     * Sets the value of the estimatedVacancyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedVacancyPercent(String value) {
        this.estimatedVacancyPercent = value;
    }

    /**
     * Gets the value of the vacancyTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacancyTrendType() {
        return vacancyTrendType;
    }

    /**
     * Sets the value of the vacancyTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacancyTrendType(String value) {
        this.vacancyTrendType = value;
    }

    /**
     * Gets the value of the rentHighPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentHighPriceAmount() {
        return rentHighPriceAmount;
    }

    /**
     * Sets the value of the rentHighPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentHighPriceAmount(String value) {
        this.rentHighPriceAmount = value;
    }

    /**
     * Gets the value of the rentLowPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentLowPriceAmount() {
        return rentLowPriceAmount;
    }

    /**
     * Sets the value of the rentLowPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentLowPriceAmount(String value) {
        this.rentLowPriceAmount = value;
    }

    /**
     * Gets the value of the rentTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentTrendType() {
        return rentTrendType;
    }

    /**
     * Sets the value of the rentTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentTrendType(String value) {
        this.rentTrendType = value;
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
     * Gets the value of the rentControlDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentControlDescription() {
        return rentControlDescription;
    }

    /**
     * Sets the value of the rentControlDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentControlDescription(String value) {
        this.rentControlDescription = value;
    }

    /**
     * Gets the value of the storiesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoriesCount() {
        return storiesCount;
    }

    /**
     * Sets the value of the storiesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoriesCount(String value) {
        this.storiesCount = value;
    }

    /**
     * Gets the value of the livingUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingUnitCount() {
        return livingUnitCount;
    }

    /**
     * Sets the value of the livingUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingUnitCount(String value) {
        this.livingUnitCount = value;
    }

}
