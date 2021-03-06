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
 *       &lt;attGroup ref="{}attlist.LISTING_HISTORY"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LISTING_HISTORY")
public class LISTINGHISTORY {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "CurrentlyListedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currentlyListedIndicator;
    @XmlAttribute(name = "CurrentListPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String currentListPriceAmount;
    @XmlAttribute(name = "DaysOnMarketCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String daysOnMarketCount;
    @XmlAttribute(name = "OriginalListPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String originalListPriceAmount;
    @XmlAttribute(name = "LastListPriceRevisionDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastListPriceRevisionDate;
    @XmlAttribute(name = "ListedWithinPreviousYearIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String listedWithinPreviousYearIndicator;
    @XmlAttribute(name = "ListedWithinPreviousYearDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String listedWithinPreviousYearDescription;

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
     * Gets the value of the currentlyListedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentlyListedIndicator() {
        return currentlyListedIndicator;
    }

    /**
     * Sets the value of the currentlyListedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentlyListedIndicator(String value) {
        this.currentlyListedIndicator = value;
    }

    /**
     * Gets the value of the currentListPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentListPriceAmount() {
        return currentListPriceAmount;
    }

    /**
     * Sets the value of the currentListPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentListPriceAmount(String value) {
        this.currentListPriceAmount = value;
    }

    /**
     * Gets the value of the daysOnMarketCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOnMarketCount() {
        return daysOnMarketCount;
    }

    /**
     * Sets the value of the daysOnMarketCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOnMarketCount(String value) {
        this.daysOnMarketCount = value;
    }

    /**
     * Gets the value of the originalListPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalListPriceAmount() {
        return originalListPriceAmount;
    }

    /**
     * Sets the value of the originalListPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalListPriceAmount(String value) {
        this.originalListPriceAmount = value;
    }

    /**
     * Gets the value of the lastListPriceRevisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastListPriceRevisionDate() {
        return lastListPriceRevisionDate;
    }

    /**
     * Sets the value of the lastListPriceRevisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastListPriceRevisionDate(String value) {
        this.lastListPriceRevisionDate = value;
    }

    /**
     * Gets the value of the listedWithinPreviousYearIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedWithinPreviousYearIndicator() {
        return listedWithinPreviousYearIndicator;
    }

    /**
     * Sets the value of the listedWithinPreviousYearIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedWithinPreviousYearIndicator(String value) {
        this.listedWithinPreviousYearIndicator = value;
    }

    /**
     * Gets the value of the listedWithinPreviousYearDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedWithinPreviousYearDescription() {
        return listedWithinPreviousYearDescription;
    }

    /**
     * Sets the value of the listedWithinPreviousYearDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedWithinPreviousYearDescription(String value) {
        this.listedWithinPreviousYearDescription = value;
    }

}
