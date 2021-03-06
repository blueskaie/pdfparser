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
 *         &lt;element ref="{}CONTACT_DETAIL" minOccurs="0"/>
 *         &lt;element ref="{}APPRAISER_LICENSE" minOccurs="0"/>
 *         &lt;element ref="{}INSPECTION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.APPRAISER"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactdetail",
    "appraiserlicense",
    "inspection"
})
@XmlRootElement(name = "APPRAISER")
public class APPRAISER {

    @XmlElement(name = "CONTACT_DETAIL")
    protected CONTACTDETAIL contactdetail;
    @XmlElement(name = "APPRAISER_LICENSE")
    protected APPRAISERLICENSE appraiserlicense;
    @XmlElement(name = "INSPECTION")
    protected List<INSPECTION> inspection;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "_Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "_CompanyName")
    @XmlSchemaType(name = "anySimpleType")
    protected String companyName;
    @XmlAttribute(name = "_StreetAddress")
    @XmlSchemaType(name = "anySimpleType")
    protected String streetAddress;
    @XmlAttribute(name = "_StreetAddress2")
    @XmlSchemaType(name = "anySimpleType")
    protected String streetAddress2;
    @XmlAttribute(name = "_City")
    @XmlSchemaType(name = "anySimpleType")
    protected String city;
    @XmlAttribute(name = "_State")
    @XmlSchemaType(name = "anySimpleType")
    protected String state;
    @XmlAttribute(name = "_PostalCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String postalCode;
    @XmlAttribute(name = "_Country")
    @XmlSchemaType(name = "anySimpleType")
    protected String country;
    @XmlAttribute(name = "_Identifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String identifier;

    /**
     * Gets the value of the contactdetail property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACTDETAIL }
     *     
     */
    public CONTACTDETAIL getCONTACTDETAIL() {
        return contactdetail;
    }

    /**
     * Sets the value of the contactdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACTDETAIL }
     *     
     */
    public void setCONTACTDETAIL(CONTACTDETAIL value) {
        this.contactdetail = value;
    }

    /**
     * Gets the value of the appraiserlicense property.
     * 
     * @return
     *     possible object is
     *     {@link APPRAISERLICENSE }
     *     
     */
    public APPRAISERLICENSE getAPPRAISERLICENSE() {
        return appraiserlicense;
    }

    /**
     * Sets the value of the appraiserlicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPRAISERLICENSE }
     *     
     */
    public void setAPPRAISERLICENSE(APPRAISERLICENSE value) {
        this.appraiserlicense = value;
    }

    /**
     * Gets the value of the inspection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINSPECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INSPECTION }
     * 
     * 
     */
    public List<INSPECTION> getINSPECTION() {
        if (inspection == null) {
            inspection = new ArrayList<INSPECTION>();
        }
        return this.inspection;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
