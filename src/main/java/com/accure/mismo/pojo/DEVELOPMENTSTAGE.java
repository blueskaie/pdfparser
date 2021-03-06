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
 *       &lt;attGroup ref="{}attlist.DEVELOPMENT_STAGE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DEVELOPMENT_STAGE")
public class DEVELOPMENTSTAGE {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "_Description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "_TotalPhasesCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalPhasesCount;
    @XmlAttribute(name = "CompletedUnitsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String completedUnitsCount;
    @XmlAttribute(name = "LivingUnitCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String livingUnitCount;
    @XmlAttribute(name = "DataSourceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSourceDescription;
    @XmlAttribute(name = "PlannedUnitsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String plannedUnitsCount;
    @XmlAttribute(name = "UnitsForSaleCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitsForSaleCount;
    @XmlAttribute(name = "UnitsSoldCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitsSoldCount;
    @XmlAttribute(name = "UnitsRentedCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitsRentedCount;
    @XmlAttribute(name = "OwnerOccupiedUnitCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String ownerOccupiedUnitCount;

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
     * Gets the value of the totalPhasesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPhasesCount() {
        return totalPhasesCount;
    }

    /**
     * Sets the value of the totalPhasesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPhasesCount(String value) {
        this.totalPhasesCount = value;
    }

    /**
     * Gets the value of the completedUnitsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedUnitsCount() {
        return completedUnitsCount;
    }

    /**
     * Sets the value of the completedUnitsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedUnitsCount(String value) {
        this.completedUnitsCount = value;
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
     * Gets the value of the plannedUnitsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedUnitsCount() {
        return plannedUnitsCount;
    }

    /**
     * Sets the value of the plannedUnitsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedUnitsCount(String value) {
        this.plannedUnitsCount = value;
    }

    /**
     * Gets the value of the unitsForSaleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsForSaleCount() {
        return unitsForSaleCount;
    }

    /**
     * Sets the value of the unitsForSaleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsForSaleCount(String value) {
        this.unitsForSaleCount = value;
    }

    /**
     * Gets the value of the unitsSoldCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsSoldCount() {
        return unitsSoldCount;
    }

    /**
     * Sets the value of the unitsSoldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsSoldCount(String value) {
        this.unitsSoldCount = value;
    }

    /**
     * Gets the value of the unitsRentedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsRentedCount() {
        return unitsRentedCount;
    }

    /**
     * Sets the value of the unitsRentedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsRentedCount(String value) {
        this.unitsRentedCount = value;
    }

    /**
     * Gets the value of the ownerOccupiedUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOccupiedUnitCount() {
        return ownerOccupiedUnitCount;
    }

    /**
     * Sets the value of the ownerOccupiedUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOccupiedUnitCount(String value) {
        this.ownerOccupiedUnitCount = value;
    }

}
