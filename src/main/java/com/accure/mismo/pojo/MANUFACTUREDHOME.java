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
 *         &lt;element ref="{}_SECTION" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}_QUALITY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.MANUFACTURED_HOME"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "section",
    "quality"
})
@XmlRootElement(name = "MANUFACTURED_HOME")
public class MANUFACTUREDHOME {

    @XmlElement(name = "_SECTION")
    protected List<SECTION> section;
    @XmlElement(name = "_QUALITY")
    protected QUALITY quality;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "LengthFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String lengthFeetCount;
    @XmlAttribute(name = "_DeckDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String deckDescription;
    @XmlAttribute(name = "_MakeIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String makeIdentifier;
    @XmlAttribute(name = "_ModelIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String modelIdentifier;
    @XmlAttribute(name = "_ModelYear")
    @XmlSchemaType(name = "anySimpleType")
    protected String modelYear;
    @XmlAttribute(name = "_ManufactureDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String manufactureDate;
    @XmlAttribute(name = "_PorchDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String porchDescription;
    @XmlAttribute(name = "_SerialNumberIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String serialNumberIdentifier;
    @XmlAttribute(name = "_HUDCertificationLabelIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String hudCertificationLabelIdentifier;
    @XmlAttribute(name = "_TipOutDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipOutDescription;
    @XmlAttribute(name = "_WaniganDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String waniganDescription;
    @XmlAttribute(name = "_WidthType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String widthType;
    @XmlAttribute(name = "WidthFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String widthFeetCount;
    @XmlAttribute(name = "_SectionCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String sectionCount;
    @XmlAttribute(name = "_ModificationsDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String modificationsDescription;
    @XmlAttribute(name = "_InstallerName")
    @XmlSchemaType(name = "anySimpleType")
    protected String installerName;
    @XmlAttribute(name = "_InstalledDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String installedDate;
    @XmlAttribute(name = "_AttachedToFoundationIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attachedToFoundationIndicator;
    @XmlAttribute(name = "_AttachedToFoundationDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String attachedToFoundationDescription;
    @XmlAttribute(name = "_WheelsRemovedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wheelsRemovedIndicator;
    @XmlAttribute(name = "_WheelsDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String wheelsDescription;
    @XmlAttribute(name = "_ConnectedToUtilitiesIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String connectedToUtilitiesIndicator;
    @XmlAttribute(name = "_ConnectionToUtilitiesDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String connectionToUtilitiesDescription;
    @XmlAttribute(name = "_InteriorSpaceAcceptableToMarketIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interiorSpaceAcceptableToMarketIndicator;
    @XmlAttribute(name = "_InteriorSpaceAcceptabilityToMarketDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String interiorSpaceAcceptabilityToMarketDescription;
    @XmlAttribute(name = "_HUDDataPlateAttachedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hudDataPlateAttachedIndicator;
    @XmlAttribute(name = "_HUDDataPlateDataSourceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String hudDataPlateDataSourceDescription;
    @XmlAttribute(name = "_HUDCertificationLabelAttachedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hudCertificationLabelAttachedIndicator;
    @XmlAttribute(name = "_HUDCertificationLabelDataSourceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String hudCertificationLabelDataSourceDescription;
    @XmlAttribute(name = "_MeetsHUDRequirementsForLocationIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String meetsHUDRequirementsForLocationIndicator;
    @XmlAttribute(name = "_MeetsHUDRequirementsForLocationDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String meetsHUDRequirementsForLocationDescription;
    @XmlAttribute(name = "_ManufacturedYear")
    @XmlSchemaType(name = "anySimpleType")
    protected String manufacturedYear;

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECTION }
     * 
     * 
     */
    public List<SECTION> getSECTION() {
        if (section == null) {
            section = new ArrayList<SECTION>();
        }
        return this.section;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QUALITY }
     *     
     */
    public QUALITY getQUALITY() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUALITY }
     *     
     */
    public void setQUALITY(QUALITY value) {
        this.quality = value;
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
     * Gets the value of the lengthFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthFeetCount() {
        return lengthFeetCount;
    }

    /**
     * Sets the value of the lengthFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthFeetCount(String value) {
        this.lengthFeetCount = value;
    }

    /**
     * Gets the value of the deckDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckDescription() {
        return deckDescription;
    }

    /**
     * Sets the value of the deckDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckDescription(String value) {
        this.deckDescription = value;
    }

    /**
     * Gets the value of the makeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeIdentifier() {
        return makeIdentifier;
    }

    /**
     * Sets the value of the makeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeIdentifier(String value) {
        this.makeIdentifier = value;
    }

    /**
     * Gets the value of the modelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelIdentifier() {
        return modelIdentifier;
    }

    /**
     * Sets the value of the modelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelIdentifier(String value) {
        this.modelIdentifier = value;
    }

    /**
     * Gets the value of the modelYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelYear(String value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufactureDate(String value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the porchDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorchDescription() {
        return porchDescription;
    }

    /**
     * Sets the value of the porchDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorchDescription(String value) {
        this.porchDescription = value;
    }

    /**
     * Gets the value of the serialNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberIdentifier() {
        return serialNumberIdentifier;
    }

    /**
     * Sets the value of the serialNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberIdentifier(String value) {
        this.serialNumberIdentifier = value;
    }

    /**
     * Gets the value of the hudCertificationLabelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDCertificationLabelIdentifier() {
        return hudCertificationLabelIdentifier;
    }

    /**
     * Sets the value of the hudCertificationLabelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDCertificationLabelIdentifier(String value) {
        this.hudCertificationLabelIdentifier = value;
    }

    /**
     * Gets the value of the tipOutDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipOutDescription() {
        return tipOutDescription;
    }

    /**
     * Sets the value of the tipOutDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipOutDescription(String value) {
        this.tipOutDescription = value;
    }

    /**
     * Gets the value of the waniganDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaniganDescription() {
        return waniganDescription;
    }

    /**
     * Sets the value of the waniganDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaniganDescription(String value) {
        this.waniganDescription = value;
    }

    /**
     * Gets the value of the widthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthType() {
        return widthType;
    }

    /**
     * Sets the value of the widthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthType(String value) {
        this.widthType = value;
    }

    /**
     * Gets the value of the widthFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthFeetCount() {
        return widthFeetCount;
    }

    /**
     * Sets the value of the widthFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthFeetCount(String value) {
        this.widthFeetCount = value;
    }

    /**
     * Gets the value of the sectionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCount() {
        return sectionCount;
    }

    /**
     * Sets the value of the sectionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCount(String value) {
        this.sectionCount = value;
    }

    /**
     * Gets the value of the modificationsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationsDescription() {
        return modificationsDescription;
    }

    /**
     * Sets the value of the modificationsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationsDescription(String value) {
        this.modificationsDescription = value;
    }

    /**
     * Gets the value of the installerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallerName() {
        return installerName;
    }

    /**
     * Sets the value of the installerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallerName(String value) {
        this.installerName = value;
    }

    /**
     * Gets the value of the installedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledDate() {
        return installedDate;
    }

    /**
     * Sets the value of the installedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledDate(String value) {
        this.installedDate = value;
    }

    /**
     * Gets the value of the attachedToFoundationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedToFoundationIndicator() {
        return attachedToFoundationIndicator;
    }

    /**
     * Sets the value of the attachedToFoundationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedToFoundationIndicator(String value) {
        this.attachedToFoundationIndicator = value;
    }

    /**
     * Gets the value of the attachedToFoundationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedToFoundationDescription() {
        return attachedToFoundationDescription;
    }

    /**
     * Sets the value of the attachedToFoundationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedToFoundationDescription(String value) {
        this.attachedToFoundationDescription = value;
    }

    /**
     * Gets the value of the wheelsRemovedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelsRemovedIndicator() {
        return wheelsRemovedIndicator;
    }

    /**
     * Sets the value of the wheelsRemovedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelsRemovedIndicator(String value) {
        this.wheelsRemovedIndicator = value;
    }

    /**
     * Gets the value of the wheelsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelsDescription() {
        return wheelsDescription;
    }

    /**
     * Sets the value of the wheelsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelsDescription(String value) {
        this.wheelsDescription = value;
    }

    /**
     * Gets the value of the connectedToUtilitiesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedToUtilitiesIndicator() {
        return connectedToUtilitiesIndicator;
    }

    /**
     * Sets the value of the connectedToUtilitiesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedToUtilitiesIndicator(String value) {
        this.connectedToUtilitiesIndicator = value;
    }

    /**
     * Gets the value of the connectionToUtilitiesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionToUtilitiesDescription() {
        return connectionToUtilitiesDescription;
    }

    /**
     * Sets the value of the connectionToUtilitiesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionToUtilitiesDescription(String value) {
        this.connectionToUtilitiesDescription = value;
    }

    /**
     * Gets the value of the interiorSpaceAcceptableToMarketIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorSpaceAcceptableToMarketIndicator() {
        return interiorSpaceAcceptableToMarketIndicator;
    }

    /**
     * Sets the value of the interiorSpaceAcceptableToMarketIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorSpaceAcceptableToMarketIndicator(String value) {
        this.interiorSpaceAcceptableToMarketIndicator = value;
    }

    /**
     * Gets the value of the interiorSpaceAcceptabilityToMarketDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorSpaceAcceptabilityToMarketDescription() {
        return interiorSpaceAcceptabilityToMarketDescription;
    }

    /**
     * Sets the value of the interiorSpaceAcceptabilityToMarketDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorSpaceAcceptabilityToMarketDescription(String value) {
        this.interiorSpaceAcceptabilityToMarketDescription = value;
    }

    /**
     * Gets the value of the hudDataPlateAttachedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDDataPlateAttachedIndicator() {
        return hudDataPlateAttachedIndicator;
    }

    /**
     * Sets the value of the hudDataPlateAttachedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDDataPlateAttachedIndicator(String value) {
        this.hudDataPlateAttachedIndicator = value;
    }

    /**
     * Gets the value of the hudDataPlateDataSourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDDataPlateDataSourceDescription() {
        return hudDataPlateDataSourceDescription;
    }

    /**
     * Sets the value of the hudDataPlateDataSourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDDataPlateDataSourceDescription(String value) {
        this.hudDataPlateDataSourceDescription = value;
    }

    /**
     * Gets the value of the hudCertificationLabelAttachedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDCertificationLabelAttachedIndicator() {
        return hudCertificationLabelAttachedIndicator;
    }

    /**
     * Sets the value of the hudCertificationLabelAttachedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDCertificationLabelAttachedIndicator(String value) {
        this.hudCertificationLabelAttachedIndicator = value;
    }

    /**
     * Gets the value of the hudCertificationLabelDataSourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUDCertificationLabelDataSourceDescription() {
        return hudCertificationLabelDataSourceDescription;
    }

    /**
     * Sets the value of the hudCertificationLabelDataSourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUDCertificationLabelDataSourceDescription(String value) {
        this.hudCertificationLabelDataSourceDescription = value;
    }

    /**
     * Gets the value of the meetsHUDRequirementsForLocationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetsHUDRequirementsForLocationIndicator() {
        return meetsHUDRequirementsForLocationIndicator;
    }

    /**
     * Sets the value of the meetsHUDRequirementsForLocationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetsHUDRequirementsForLocationIndicator(String value) {
        this.meetsHUDRequirementsForLocationIndicator = value;
    }

    /**
     * Gets the value of the meetsHUDRequirementsForLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetsHUDRequirementsForLocationDescription() {
        return meetsHUDRequirementsForLocationDescription;
    }

    /**
     * Sets the value of the meetsHUDRequirementsForLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetsHUDRequirementsForLocationDescription(String value) {
        this.meetsHUDRequirementsForLocationDescription = value;
    }

    /**
     * Gets the value of the manufacturedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Sets the value of the manufacturedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedYear(String value) {
        this.manufacturedYear = value;
    }

}