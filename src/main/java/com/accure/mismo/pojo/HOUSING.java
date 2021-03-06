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
 *       &lt;attGroup ref="{}attlist._HOUSING"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "_HOUSING")
public class HOUSING {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "_TypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeOtherDescription;
    @XmlAttribute(name = "_OldestYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String oldestYearsCount;
    @XmlAttribute(name = "_NewestYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String newestYearsCount;
    @XmlAttribute(name = "_HighPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String highPriceAmount;
    @XmlAttribute(name = "_LowPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String lowPriceAmount;
    @XmlAttribute(name = "_PredominantAgeYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String predominantAgeYearsCount;
    @XmlAttribute(name = "_PredominantPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String predominantPriceAmount;
    @XmlAttribute(name = "_PredominantOccupancyType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String predominantOccupancyType;
    @XmlAttribute(name = "_OwnerOccupancyPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String ownerOccupancyPercent;
    @XmlAttribute(name = "_TenantOccupancyPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String tenantOccupancyPercent;
    @XmlAttribute(name = "_PercentageVacancyType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String percentageVacancyType;
    @XmlAttribute(name = "_VacancyPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String vacancyPercent;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOtherDescription() {
        return typeOtherDescription;
    }

    /**
     * Sets the value of the typeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOtherDescription(String value) {
        this.typeOtherDescription = value;
    }

    /**
     * Gets the value of the oldestYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldestYearsCount() {
        return oldestYearsCount;
    }

    /**
     * Sets the value of the oldestYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldestYearsCount(String value) {
        this.oldestYearsCount = value;
    }

    /**
     * Gets the value of the newestYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewestYearsCount() {
        return newestYearsCount;
    }

    /**
     * Sets the value of the newestYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewestYearsCount(String value) {
        this.newestYearsCount = value;
    }

    /**
     * Gets the value of the highPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighPriceAmount() {
        return highPriceAmount;
    }

    /**
     * Sets the value of the highPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighPriceAmount(String value) {
        this.highPriceAmount = value;
    }

    /**
     * Gets the value of the lowPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowPriceAmount() {
        return lowPriceAmount;
    }

    /**
     * Sets the value of the lowPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowPriceAmount(String value) {
        this.lowPriceAmount = value;
    }

    /**
     * Gets the value of the predominantAgeYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredominantAgeYearsCount() {
        return predominantAgeYearsCount;
    }

    /**
     * Sets the value of the predominantAgeYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredominantAgeYearsCount(String value) {
        this.predominantAgeYearsCount = value;
    }

    /**
     * Gets the value of the predominantPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredominantPriceAmount() {
        return predominantPriceAmount;
    }

    /**
     * Sets the value of the predominantPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredominantPriceAmount(String value) {
        this.predominantPriceAmount = value;
    }

    /**
     * Gets the value of the predominantOccupancyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredominantOccupancyType() {
        return predominantOccupancyType;
    }

    /**
     * Sets the value of the predominantOccupancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredominantOccupancyType(String value) {
        this.predominantOccupancyType = value;
    }

    /**
     * Gets the value of the ownerOccupancyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOccupancyPercent() {
        return ownerOccupancyPercent;
    }

    /**
     * Sets the value of the ownerOccupancyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOccupancyPercent(String value) {
        this.ownerOccupancyPercent = value;
    }

    /**
     * Gets the value of the tenantOccupancyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantOccupancyPercent() {
        return tenantOccupancyPercent;
    }

    /**
     * Sets the value of the tenantOccupancyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantOccupancyPercent(String value) {
        this.tenantOccupancyPercent = value;
    }

    /**
     * Gets the value of the percentageVacancyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageVacancyType() {
        return percentageVacancyType;
    }

    /**
     * Sets the value of the percentageVacancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageVacancyType(String value) {
        this.percentageVacancyType = value;
    }

    /**
     * Gets the value of the vacancyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacancyPercent() {
        return vacancyPercent;
    }

    /**
     * Sets the value of the vacancyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacancyPercent(String value) {
        this.vacancyPercent = value;
    }

}
