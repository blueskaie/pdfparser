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
 *         &lt;element ref="{}PARSED_STREET_ADDRESS" minOccurs="0"/>
 *         &lt;element ref="{}_IDENTIFICATION" minOccurs="0"/>
 *         &lt;element ref="{}_LEGAL_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}STRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}_OFF_SITE_IMPROVEMENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SITE" minOccurs="0"/>
 *         &lt;element ref="{}PROJECT" minOccurs="0"/>
 *         &lt;element ref="{}NEIGHBORHOOD" minOccurs="0"/>
 *         &lt;element ref="{}_TITLE_TRANSFER_INSPECTION" minOccurs="0"/>
 *         &lt;element ref="{}_TAX" minOccurs="0"/>
 *         &lt;element ref="{}SALES_HISTORY" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LISTING_HISTORY" minOccurs="0"/>
 *         &lt;element ref="{}EMBEDDED_FILE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PROPERTY_ANALYSIS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}_OWNER" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SALES_CONTRACT" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.PROPERTY"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parsedstreetaddress",
    "identification",
    "legaldescription",
    "structure",
    "offsiteimprovement",
    "site",
    "project",
    "neighborhood",
    "titletransferinspection",
    "tax",
    "saleshistory",
    "listinghistory",
    "embeddedfile",
    "propertyanalysis",
    "owner",
    "salescontract"
})
@XmlRootElement(name = "PROPERTY")
public class PROPERTY {

    @XmlElement(name = "PARSED_STREET_ADDRESS")
    protected PARSEDSTREETADDRESS parsedstreetaddress;
    @XmlElement(name = "_IDENTIFICATION")
    protected IDENTIFICATION identification;
    @XmlElement(name = "_LEGAL_DESCRIPTION")
    protected List<LEGALDESCRIPTION> legaldescription;
    @XmlElement(name = "STRUCTURE")
    protected List<STRUCTURE> structure;
    @XmlElement(name = "_OFF_SITE_IMPROVEMENT")
    protected List<OFFSITEIMPROVEMENT> offsiteimprovement;
    @XmlElement(name = "SITE")
    protected SITE site;
    @XmlElement(name = "PROJECT")
    protected PROJECT project;
    @XmlElement(name = "NEIGHBORHOOD")
    protected NEIGHBORHOOD neighborhood;
    @XmlElement(name = "_TITLE_TRANSFER_INSPECTION")
    protected TITLETRANSFERINSPECTION titletransferinspection;
    @XmlElement(name = "_TAX")
    protected TAX tax;
    @XmlElement(name = "SALES_HISTORY")
    protected List<SALESHISTORY> saleshistory;
    @XmlElement(name = "LISTING_HISTORY")
    protected LISTINGHISTORY listinghistory;
    @XmlElement(name = "EMBEDDED_FILE")
    protected List<EMBEDDEDFILE> embeddedfile;
    @XmlElement(name = "PROPERTY_ANALYSIS")
    protected List<PROPERTYANALYSIS> propertyanalysis;
    @XmlElement(name = "_OWNER")
    protected List<OWNER> owner;
    @XmlElement(name = "SALES_CONTRACT")
    protected SALESCONTRACT salescontract;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "MISMOVersionID")
    protected String mismoVersionID;
    @XmlAttribute(name = "_SequenceIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenceIdentifier;
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
    @XmlAttribute(name = "_County")
    @XmlSchemaType(name = "anySimpleType")
    protected String county;
    @XmlAttribute(name = "_Country")
    @XmlSchemaType(name = "anySimpleType")
    protected String country;
    @XmlAttribute(name = "BuildingStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buildingStatusType;
    @XmlAttribute(name = "BuildingStatusTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String buildingStatusTypeOtherDescription;
    @XmlAttribute(name = "LandUseType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String landUseType;
    @XmlAttribute(name = "LandUseTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String landUseTypeOtherDescription;
    @XmlAttribute(name = "LandUseComment")
    @XmlSchemaType(name = "anySimpleType")
    protected String landUseComment;
    @XmlAttribute(name = "_ConditionDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String conditionDescription;
    @XmlAttribute(name = "_CurrentOccupancyType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currentOccupancyType;
    @XmlAttribute(name = "_CurrentOccupantUnparsedName")
    @XmlSchemaType(name = "anySimpleType")
    protected String currentOccupantUnparsedName;
    @XmlAttribute(name = "_GatedCommunityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gatedCommunityIndicator;
    @XmlAttribute(name = "_RightsType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rightsType;
    @XmlAttribute(name = "_RightsTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String rightsTypeOtherDescription;
    @XmlAttribute(name = "_TaxDelinquentIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxDelinquentIndicator;
    @XmlAttribute(name = "_TitleCategoryType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String titleCategoryType;
    @XmlAttribute(name = "_TitleCategoryTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String titleCategoryTypeOtherDescription;
    @XmlAttribute(name = "_AppraisedWithinPreviousYearIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String appraisedWithinPreviousYearIndicator;
    @XmlAttribute(name = "_AppraisedWithinPreviousYearDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String appraisedWithinPreviousYearDescription;
    @XmlAttribute(name = "ProjectClassificationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String projectClassificationType;
    @XmlAttribute(name = "ProjectClassificationTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String projectClassificationTypeOtherDescription;
    @XmlAttribute(name = "LeaseExpirationDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String leaseExpirationDate;

    /**
     * Gets the value of the parsedstreetaddress property.
     * 
     * @return
     *     possible object is
     *     {@link PARSEDSTREETADDRESS }
     *     
     */
    public PARSEDSTREETADDRESS getPARSEDSTREETADDRESS() {
        return parsedstreetaddress;
    }

    /**
     * Sets the value of the parsedstreetaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARSEDSTREETADDRESS }
     *     
     */
    public void setPARSEDSTREETADDRESS(PARSEDSTREETADDRESS value) {
        this.parsedstreetaddress = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATION }
     *     
     */
    public IDENTIFICATION getIDENTIFICATION() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATION }
     *     
     */
    public void setIDENTIFICATION(IDENTIFICATION value) {
        this.identification = value;
    }

    /**
     * Gets the value of the legaldescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legaldescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLEGALDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LEGALDESCRIPTION }
     * 
     * 
     */
    public List<LEGALDESCRIPTION> getLEGALDESCRIPTION() {
        if (legaldescription == null) {
            legaldescription = new ArrayList<LEGALDESCRIPTION>();
        }
        return this.legaldescription;
    }

    /**
     * Gets the value of the structure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRUCTURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRUCTURE }
     * 
     * 
     */
    public List<STRUCTURE> getSTRUCTURE() {
        if (structure == null) {
            structure = new ArrayList<STRUCTURE>();
        }
        return this.structure;
    }

    /**
     * Gets the value of the offsiteimprovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsiteimprovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOFFSITEIMPROVEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFFSITEIMPROVEMENT }
     * 
     * 
     */
    public List<OFFSITEIMPROVEMENT> getOFFSITEIMPROVEMENT() {
        if (offsiteimprovement == null) {
            offsiteimprovement = new ArrayList<OFFSITEIMPROVEMENT>();
        }
        return this.offsiteimprovement;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SITE }
     *     
     */
    public SITE getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITE }
     *     
     */
    public void setSITE(SITE value) {
        this.site = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link PROJECT }
     *     
     */
    public PROJECT getPROJECT() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROJECT }
     *     
     */
    public void setPROJECT(PROJECT value) {
        this.project = value;
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link NEIGHBORHOOD }
     *     
     */
    public NEIGHBORHOOD getNEIGHBORHOOD() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEIGHBORHOOD }
     *     
     */
    public void setNEIGHBORHOOD(NEIGHBORHOOD value) {
        this.neighborhood = value;
    }

    /**
     * Gets the value of the titletransferinspection property.
     * 
     * @return
     *     possible object is
     *     {@link TITLETRANSFERINSPECTION }
     *     
     */
    public TITLETRANSFERINSPECTION getTITLETRANSFERINSPECTION() {
        return titletransferinspection;
    }

    /**
     * Sets the value of the titletransferinspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TITLETRANSFERINSPECTION }
     *     
     */
    public void setTITLETRANSFERINSPECTION(TITLETRANSFERINSPECTION value) {
        this.titletransferinspection = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TAX }
     *     
     */
    public TAX getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAX }
     *     
     */
    public void setTAX(TAX value) {
        this.tax = value;
    }

    /**
     * Gets the value of the saleshistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleshistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSALESHISTORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SALESHISTORY }
     * 
     * 
     */
    public List<SALESHISTORY> getSALESHISTORY() {
        if (saleshistory == null) {
            saleshistory = new ArrayList<SALESHISTORY>();
        }
        return this.saleshistory;
    }

    /**
     * Gets the value of the listinghistory property.
     * 
     * @return
     *     possible object is
     *     {@link LISTINGHISTORY }
     *     
     */
    public LISTINGHISTORY getLISTINGHISTORY() {
        return listinghistory;
    }

    /**
     * Sets the value of the listinghistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTINGHISTORY }
     *     
     */
    public void setLISTINGHISTORY(LISTINGHISTORY value) {
        this.listinghistory = value;
    }

    /**
     * Gets the value of the embeddedfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embeddedfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMBEDDEDFILE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMBEDDEDFILE }
     * 
     * 
     */
    public List<EMBEDDEDFILE> getEMBEDDEDFILE() {
        if (embeddedfile == null) {
            embeddedfile = new ArrayList<EMBEDDEDFILE>();
        }
        return this.embeddedfile;
    }

    /**
     * Gets the value of the propertyanalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyanalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROPERTYANALYSIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROPERTYANALYSIS }
     * 
     * 
     */
    public List<PROPERTYANALYSIS> getPROPERTYANALYSIS() {
        if (propertyanalysis == null) {
            propertyanalysis = new ArrayList<PROPERTYANALYSIS>();
        }
        return this.propertyanalysis;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOWNER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OWNER }
     * 
     * 
     */
    public List<OWNER> getOWNER() {
        if (owner == null) {
            owner = new ArrayList<OWNER>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the salescontract property.
     * 
     * @return
     *     possible object is
     *     {@link SALESCONTRACT }
     *     
     */
    public SALESCONTRACT getSALESCONTRACT() {
        return salescontract;
    }

    /**
     * Sets the value of the salescontract property.
     * 
     * @param value
     *     allowed object is
     *     {@link SALESCONTRACT }
     *     
     */
    public void setSALESCONTRACT(SALESCONTRACT value) {
        this.salescontract = value;
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
     * Gets the value of the mismoVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISMOVersionID() {
        if (mismoVersionID == null) {
            return "2.4";
        } else {
            return mismoVersionID;
        }
    }

    /**
     * Sets the value of the mismoVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISMOVersionID(String value) {
        this.mismoVersionID = value;
    }

    /**
     * Gets the value of the sequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceIdentifier() {
        return sequenceIdentifier;
    }

    /**
     * Sets the value of the sequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceIdentifier(String value) {
        this.sequenceIdentifier = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the buildingStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingStatusType() {
        return buildingStatusType;
    }

    /**
     * Sets the value of the buildingStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingStatusType(String value) {
        this.buildingStatusType = value;
    }

    /**
     * Gets the value of the buildingStatusTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingStatusTypeOtherDescription() {
        return buildingStatusTypeOtherDescription;
    }

    /**
     * Sets the value of the buildingStatusTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingStatusTypeOtherDescription(String value) {
        this.buildingStatusTypeOtherDescription = value;
    }

    /**
     * Gets the value of the landUseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUseType() {
        return landUseType;
    }

    /**
     * Sets the value of the landUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUseType(String value) {
        this.landUseType = value;
    }

    /**
     * Gets the value of the landUseTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUseTypeOtherDescription() {
        return landUseTypeOtherDescription;
    }

    /**
     * Sets the value of the landUseTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUseTypeOtherDescription(String value) {
        this.landUseTypeOtherDescription = value;
    }

    /**
     * Gets the value of the landUseComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUseComment() {
        return landUseComment;
    }

    /**
     * Sets the value of the landUseComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUseComment(String value) {
        this.landUseComment = value;
    }

    /**
     * Gets the value of the conditionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDescription() {
        return conditionDescription;
    }

    /**
     * Sets the value of the conditionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDescription(String value) {
        this.conditionDescription = value;
    }

    /**
     * Gets the value of the currentOccupancyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOccupancyType() {
        return currentOccupancyType;
    }

    /**
     * Sets the value of the currentOccupancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOccupancyType(String value) {
        this.currentOccupancyType = value;
    }

    /**
     * Gets the value of the currentOccupantUnparsedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOccupantUnparsedName() {
        return currentOccupantUnparsedName;
    }

    /**
     * Sets the value of the currentOccupantUnparsedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOccupantUnparsedName(String value) {
        this.currentOccupantUnparsedName = value;
    }

    /**
     * Gets the value of the gatedCommunityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatedCommunityIndicator() {
        return gatedCommunityIndicator;
    }

    /**
     * Sets the value of the gatedCommunityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatedCommunityIndicator(String value) {
        this.gatedCommunityIndicator = value;
    }

    /**
     * Gets the value of the rightsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsType() {
        return rightsType;
    }

    /**
     * Sets the value of the rightsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsType(String value) {
        this.rightsType = value;
    }

    /**
     * Gets the value of the rightsTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsTypeOtherDescription() {
        return rightsTypeOtherDescription;
    }

    /**
     * Sets the value of the rightsTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsTypeOtherDescription(String value) {
        this.rightsTypeOtherDescription = value;
    }

    /**
     * Gets the value of the taxDelinquentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDelinquentIndicator() {
        return taxDelinquentIndicator;
    }

    /**
     * Sets the value of the taxDelinquentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDelinquentIndicator(String value) {
        this.taxDelinquentIndicator = value;
    }

    /**
     * Gets the value of the titleCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleCategoryType() {
        return titleCategoryType;
    }

    /**
     * Sets the value of the titleCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleCategoryType(String value) {
        this.titleCategoryType = value;
    }

    /**
     * Gets the value of the titleCategoryTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleCategoryTypeOtherDescription() {
        return titleCategoryTypeOtherDescription;
    }

    /**
     * Sets the value of the titleCategoryTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleCategoryTypeOtherDescription(String value) {
        this.titleCategoryTypeOtherDescription = value;
    }

    /**
     * Gets the value of the appraisedWithinPreviousYearIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppraisedWithinPreviousYearIndicator() {
        return appraisedWithinPreviousYearIndicator;
    }

    /**
     * Sets the value of the appraisedWithinPreviousYearIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppraisedWithinPreviousYearIndicator(String value) {
        this.appraisedWithinPreviousYearIndicator = value;
    }

    /**
     * Gets the value of the appraisedWithinPreviousYearDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppraisedWithinPreviousYearDescription() {
        return appraisedWithinPreviousYearDescription;
    }

    /**
     * Sets the value of the appraisedWithinPreviousYearDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppraisedWithinPreviousYearDescription(String value) {
        this.appraisedWithinPreviousYearDescription = value;
    }

    /**
     * Gets the value of the projectClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectClassificationType() {
        return projectClassificationType;
    }

    /**
     * Sets the value of the projectClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectClassificationType(String value) {
        this.projectClassificationType = value;
    }

    /**
     * Gets the value of the projectClassificationTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectClassificationTypeOtherDescription() {
        return projectClassificationTypeOtherDescription;
    }

    /**
     * Sets the value of the projectClassificationTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectClassificationTypeOtherDescription(String value) {
        this.projectClassificationTypeOtherDescription = value;
    }

    /**
     * Gets the value of the leaseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseExpirationDate() {
        return leaseExpirationDate;
    }

    /**
     * Sets the value of the leaseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseExpirationDate(String value) {
        this.leaseExpirationDate = value;
    }

}