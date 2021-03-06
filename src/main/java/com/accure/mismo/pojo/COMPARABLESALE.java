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
 *         &lt;element ref="{}ROOM_ADJUSTMENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}SALE_PRICE_ADJUSTMENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OTHER_FEATURE_ADJUSTMENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PRIOR_SALES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}IMAGE" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.COMPARABLE_SALE"/>
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
    "roomadjustment",
    "salepriceadjustment",
    "otherfeatureadjustment",
    "priorsales",
    "image"
})
@XmlRootElement(name = "COMPARABLE_SALE")
public class COMPARABLESALE {

    @XmlElement(name = "LOCATION")
    protected LOCATION location;
    @XmlElement(name = "ROOM_ADJUSTMENT")
    protected List<ROOMADJUSTMENT> roomadjustment;
    @XmlElement(name = "SALE_PRICE_ADJUSTMENT")
    protected List<SALEPRICEADJUSTMENT> salepriceadjustment;
    @XmlElement(name = "OTHER_FEATURE_ADJUSTMENT")
    protected List<OTHERFEATUREADJUSTMENT> otherfeatureadjustment;
    @XmlElement(name = "PRIOR_SALES")
    protected List<PRIORSALES> priorsales;
    @XmlElement(name = "IMAGE")
    protected IMAGE image;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "PropertySequenceIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertySequenceIdentifier;
    @XmlAttribute(name = "ProjectName")
    @XmlSchemaType(name = "anySimpleType")
    protected String projectName;
    @XmlAttribute(name = "ProjectPhaseIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String projectPhaseIdentifier;
    @XmlAttribute(name = "DataSourceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSourceDescription;
    @XmlAttribute(name = "DataSourceVerificationDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSourceVerificationDescription;
    @XmlAttribute(name = "ManufacturedHomeIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String manufacturedHomeIndicator;
    @XmlAttribute(name = "_FurnishedIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String furnishedIndicator;
    @XmlAttribute(name = "MonthlyRentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String monthlyRentAmount;
    @XmlAttribute(name = "GrossMonthlyRentMultiplierFactor")
    @XmlSchemaType(name = "anySimpleType")
    protected String grossMonthlyRentMultiplierFactor;
    @XmlAttribute(name = "ClosingDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String closingDate;
    @XmlAttribute(name = "DaysOnMarketCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String daysOnMarketCount;
    @XmlAttribute(name = "FinalListPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalListPriceAmount;
    @XmlAttribute(name = "PropertySalesAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertySalesAmount;
    @XmlAttribute(name = "SalesPriceToListPriceRate")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPriceToListPriceRate;
    @XmlAttribute(name = "SalesPricePerGrossBuildingAreaAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerGrossBuildingAreaAmount;
    @XmlAttribute(name = "SalesPricePerOwnershipShareAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerOwnershipShareAmount;
    @XmlAttribute(name = "SalesPricePerGrossLivingAreaAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerGrossLivingAreaAmount;
    @XmlAttribute(name = "SalesPricePerUnitAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerUnitAmount;
    @XmlAttribute(name = "SalesPricePerRoomAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerRoomAmount;
    @XmlAttribute(name = "SalesPricePerBedroomAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPricePerBedroomAmount;
    @XmlAttribute(name = "RentControlStatusType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rentControlStatusType;
    @XmlAttribute(name = "SalePriceTotalAdjustmentAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String salePriceTotalAdjustmentAmount;
    @XmlAttribute(name = "SalesPriceTotalAdjustmentPositiveIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesPriceTotalAdjustmentPositiveIndicator;
    @XmlAttribute(name = "SalePriceTotalAdjustmentNetPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String salePriceTotalAdjustmentNetPercent;
    @XmlAttribute(name = "SalesPriceTotalAdjustmentGrossPercent")
    @XmlSchemaType(name = "anySimpleType")
    protected String salesPriceTotalAdjustmentGrossPercent;
    @XmlAttribute(name = "AdjustedSalesPriceAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String adjustedSalesPriceAmount;
    @XmlAttribute(name = "AdjustedSalesPricePerUnitAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String adjustedSalesPricePerUnitAmount;
    @XmlAttribute(name = "AdjustedSalesPricePerRoomAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String adjustedSalesPricePerRoomAmount;
    @XmlAttribute(name = "AdjustedSalesPricePerBedroomAmount")
    @XmlSchemaType(name = "anySimpleType")
    protected String adjustedSalesPricePerBedroomAmount;
    @XmlAttribute(name = "ComparablePropertyComment")
    @XmlSchemaType(name = "anySimpleType")
    protected String comparablePropertyComment;

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
     * Gets the value of the roomadjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomadjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROOMADJUSTMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROOMADJUSTMENT }
     * 
     * 
     */
    public List<ROOMADJUSTMENT> getROOMADJUSTMENT() {
        if (roomadjustment == null) {
            roomadjustment = new ArrayList<ROOMADJUSTMENT>();
        }
        return this.roomadjustment;
    }

    /**
     * Gets the value of the salepriceadjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salepriceadjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSALEPRICEADJUSTMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SALEPRICEADJUSTMENT }
     * 
     * 
     */
    public List<SALEPRICEADJUSTMENT> getSALEPRICEADJUSTMENT() {
        if (salepriceadjustment == null) {
            salepriceadjustment = new ArrayList<SALEPRICEADJUSTMENT>();
        }
        return this.salepriceadjustment;
    }

    /**
     * Gets the value of the otherfeatureadjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherfeatureadjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTHERFEATUREADJUSTMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTHERFEATUREADJUSTMENT }
     * 
     * 
     */
    public List<OTHERFEATUREADJUSTMENT> getOTHERFEATUREADJUSTMENT() {
        if (otherfeatureadjustment == null) {
            otherfeatureadjustment = new ArrayList<OTHERFEATUREADJUSTMENT>();
        }
        return this.otherfeatureadjustment;
    }

    /**
     * Gets the value of the priorsales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorsales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRIORSALES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRIORSALES }
     * 
     * 
     */
    public List<PRIORSALES> getPRIORSALES() {
        if (priorsales == null) {
            priorsales = new ArrayList<PRIORSALES>();
        }
        return this.priorsales;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link IMAGE }
     *     
     */
    public IMAGE getIMAGE() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMAGE }
     *     
     */
    public void setIMAGE(IMAGE value) {
        this.image = value;
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
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectPhaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPhaseIdentifier() {
        return projectPhaseIdentifier;
    }

    /**
     * Sets the value of the projectPhaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPhaseIdentifier(String value) {
        this.projectPhaseIdentifier = value;
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
     * Gets the value of the dataSourceVerificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceVerificationDescription() {
        return dataSourceVerificationDescription;
    }

    /**
     * Sets the value of the dataSourceVerificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceVerificationDescription(String value) {
        this.dataSourceVerificationDescription = value;
    }

    /**
     * Gets the value of the manufacturedHomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedHomeIndicator() {
        return manufacturedHomeIndicator;
    }

    /**
     * Sets the value of the manufacturedHomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedHomeIndicator(String value) {
        this.manufacturedHomeIndicator = value;
    }

    /**
     * Gets the value of the furnishedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurnishedIndicator() {
        return furnishedIndicator;
    }

    /**
     * Sets the value of the furnishedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurnishedIndicator(String value) {
        this.furnishedIndicator = value;
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
     * Gets the value of the grossMonthlyRentMultiplierFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossMonthlyRentMultiplierFactor() {
        return grossMonthlyRentMultiplierFactor;
    }

    /**
     * Sets the value of the grossMonthlyRentMultiplierFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossMonthlyRentMultiplierFactor(String value) {
        this.grossMonthlyRentMultiplierFactor = value;
    }

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingDate(String value) {
        this.closingDate = value;
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
     * Gets the value of the finalListPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalListPriceAmount() {
        return finalListPriceAmount;
    }

    /**
     * Sets the value of the finalListPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalListPriceAmount(String value) {
        this.finalListPriceAmount = value;
    }

    /**
     * Gets the value of the propertySalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySalesAmount() {
        return propertySalesAmount;
    }

    /**
     * Sets the value of the propertySalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySalesAmount(String value) {
        this.propertySalesAmount = value;
    }

    /**
     * Gets the value of the salesPriceToListPriceRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPriceToListPriceRate() {
        return salesPriceToListPriceRate;
    }

    /**
     * Sets the value of the salesPriceToListPriceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPriceToListPriceRate(String value) {
        this.salesPriceToListPriceRate = value;
    }

    /**
     * Gets the value of the salesPricePerGrossBuildingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerGrossBuildingAreaAmount() {
        return salesPricePerGrossBuildingAreaAmount;
    }

    /**
     * Sets the value of the salesPricePerGrossBuildingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerGrossBuildingAreaAmount(String value) {
        this.salesPricePerGrossBuildingAreaAmount = value;
    }

    /**
     * Gets the value of the salesPricePerOwnershipShareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerOwnershipShareAmount() {
        return salesPricePerOwnershipShareAmount;
    }

    /**
     * Sets the value of the salesPricePerOwnershipShareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerOwnershipShareAmount(String value) {
        this.salesPricePerOwnershipShareAmount = value;
    }

    /**
     * Gets the value of the salesPricePerGrossLivingAreaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerGrossLivingAreaAmount() {
        return salesPricePerGrossLivingAreaAmount;
    }

    /**
     * Sets the value of the salesPricePerGrossLivingAreaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerGrossLivingAreaAmount(String value) {
        this.salesPricePerGrossLivingAreaAmount = value;
    }

    /**
     * Gets the value of the salesPricePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerUnitAmount() {
        return salesPricePerUnitAmount;
    }

    /**
     * Sets the value of the salesPricePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerUnitAmount(String value) {
        this.salesPricePerUnitAmount = value;
    }

    /**
     * Gets the value of the salesPricePerRoomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerRoomAmount() {
        return salesPricePerRoomAmount;
    }

    /**
     * Sets the value of the salesPricePerRoomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerRoomAmount(String value) {
        this.salesPricePerRoomAmount = value;
    }

    /**
     * Gets the value of the salesPricePerBedroomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPricePerBedroomAmount() {
        return salesPricePerBedroomAmount;
    }

    /**
     * Sets the value of the salesPricePerBedroomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPricePerBedroomAmount(String value) {
        this.salesPricePerBedroomAmount = value;
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
     * Gets the value of the salePriceTotalAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePriceTotalAdjustmentAmount() {
        return salePriceTotalAdjustmentAmount;
    }

    /**
     * Sets the value of the salePriceTotalAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePriceTotalAdjustmentAmount(String value) {
        this.salePriceTotalAdjustmentAmount = value;
    }

    /**
     * Gets the value of the salesPriceTotalAdjustmentPositiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPriceTotalAdjustmentPositiveIndicator() {
        return salesPriceTotalAdjustmentPositiveIndicator;
    }

    /**
     * Sets the value of the salesPriceTotalAdjustmentPositiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPriceTotalAdjustmentPositiveIndicator(String value) {
        this.salesPriceTotalAdjustmentPositiveIndicator = value;
    }

    /**
     * Gets the value of the salePriceTotalAdjustmentNetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePriceTotalAdjustmentNetPercent() {
        return salePriceTotalAdjustmentNetPercent;
    }

    /**
     * Sets the value of the salePriceTotalAdjustmentNetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePriceTotalAdjustmentNetPercent(String value) {
        this.salePriceTotalAdjustmentNetPercent = value;
    }

    /**
     * Gets the value of the salesPriceTotalAdjustmentGrossPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPriceTotalAdjustmentGrossPercent() {
        return salesPriceTotalAdjustmentGrossPercent;
    }

    /**
     * Sets the value of the salesPriceTotalAdjustmentGrossPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPriceTotalAdjustmentGrossPercent(String value) {
        this.salesPriceTotalAdjustmentGrossPercent = value;
    }

    /**
     * Gets the value of the adjustedSalesPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedSalesPriceAmount() {
        return adjustedSalesPriceAmount;
    }

    /**
     * Sets the value of the adjustedSalesPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedSalesPriceAmount(String value) {
        this.adjustedSalesPriceAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedSalesPricePerUnitAmount() {
        return adjustedSalesPricePerUnitAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedSalesPricePerUnitAmount(String value) {
        this.adjustedSalesPricePerUnitAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerRoomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedSalesPricePerRoomAmount() {
        return adjustedSalesPricePerRoomAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerRoomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedSalesPricePerRoomAmount(String value) {
        this.adjustedSalesPricePerRoomAmount = value;
    }

    /**
     * Gets the value of the adjustedSalesPricePerBedroomAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedSalesPricePerBedroomAmount() {
        return adjustedSalesPricePerBedroomAmount;
    }

    /**
     * Sets the value of the adjustedSalesPricePerBedroomAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedSalesPricePerBedroomAmount(String value) {
        this.adjustedSalesPricePerBedroomAmount = value;
    }

    /**
     * Gets the value of the comparablePropertyComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparablePropertyComment() {
        return comparablePropertyComment;
    }

    /**
     * Sets the value of the comparablePropertyComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparablePropertyComment(String value) {
        this.comparablePropertyComment = value;
    }

}
