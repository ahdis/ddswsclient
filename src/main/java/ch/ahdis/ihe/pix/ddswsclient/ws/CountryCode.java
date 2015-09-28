
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="countryCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iso3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isLastNameSexed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="countryOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characterSetEncodingReference" type="{http://ws.demographic.gazelle.ihe.net/}characterSetEncoding" minOccurs="0"/>
 *         &lt;element name="generateReligion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="generateRace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minNumberOfPatientMiddleName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxNumberOfPatientMiddleName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryCode", propOrder = {
    "id",
    "iso",
    "name",
    "printableName",
    "iso3",
    "numcode",
    "ec",
    "flagUrl",
    "isLastNameSexed",
    "countryOID",
    "characterSetEncodingReference",
    "generateReligion",
    "generateRace",
    "minNumberOfPatientMiddleName",
    "maxNumberOfPatientMiddleName"
})
public class CountryCode {

    protected Integer id;
    protected String iso;
    protected String name;
    protected String printableName;
    protected String iso3;
    protected Integer numcode;
    protected Boolean ec;
    protected String flagUrl;
    protected Boolean isLastNameSexed;
    protected String countryOID;
    protected CharacterSetEncoding characterSetEncodingReference;
    protected Boolean generateReligion;
    protected Boolean generateRace;
    protected Integer minNumberOfPatientMiddleName;
    protected Integer maxNumberOfPatientMiddleName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the iso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso() {
        return iso;
    }

    /**
     * Sets the value of the iso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso(String value) {
        this.iso = value;
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
     * Gets the value of the printableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintableName() {
        return printableName;
    }

    /**
     * Sets the value of the printableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintableName(String value) {
        this.printableName = value;
    }

    /**
     * Gets the value of the iso3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso3() {
        return iso3;
    }

    /**
     * Sets the value of the iso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso3(String value) {
        this.iso3 = value;
    }

    /**
     * Gets the value of the numcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumcode() {
        return numcode;
    }

    /**
     * Sets the value of the numcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumcode(Integer value) {
        this.numcode = value;
    }

    /**
     * Gets the value of the ec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEc() {
        return ec;
    }

    /**
     * Sets the value of the ec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEc(Boolean value) {
        this.ec = value;
    }

    /**
     * Gets the value of the flagUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagUrl() {
        return flagUrl;
    }

    /**
     * Sets the value of the flagUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagUrl(String value) {
        this.flagUrl = value;
    }

    /**
     * Gets the value of the isLastNameSexed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastNameSexed() {
        return isLastNameSexed;
    }

    /**
     * Sets the value of the isLastNameSexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLastNameSexed(Boolean value) {
        this.isLastNameSexed = value;
    }

    /**
     * Gets the value of the countryOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOID() {
        return countryOID;
    }

    /**
     * Sets the value of the countryOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOID(String value) {
        this.countryOID = value;
    }

    /**
     * Gets the value of the characterSetEncodingReference property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetEncoding }
     *     
     */
    public CharacterSetEncoding getCharacterSetEncodingReference() {
        return characterSetEncodingReference;
    }

    /**
     * Sets the value of the characterSetEncodingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetEncoding }
     *     
     */
    public void setCharacterSetEncodingReference(CharacterSetEncoding value) {
        this.characterSetEncodingReference = value;
    }

    /**
     * Gets the value of the generateReligion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateReligion() {
        return generateReligion;
    }

    /**
     * Sets the value of the generateReligion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateReligion(Boolean value) {
        this.generateReligion = value;
    }

    /**
     * Gets the value of the generateRace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateRace() {
        return generateRace;
    }

    /**
     * Sets the value of the generateRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateRace(Boolean value) {
        this.generateRace = value;
    }

    /**
     * Gets the value of the minNumberOfPatientMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinNumberOfPatientMiddleName() {
        return minNumberOfPatientMiddleName;
    }

    /**
     * Sets the value of the minNumberOfPatientMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinNumberOfPatientMiddleName(Integer value) {
        this.minNumberOfPatientMiddleName = value;
    }

    /**
     * Gets the value of the maxNumberOfPatientMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfPatientMiddleName() {
        return maxNumberOfPatientMiddleName;
    }

    /**
     * Sets the value of the maxNumberOfPatientMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfPatientMiddleName(Integer value) {
        this.maxNumberOfPatientMiddleName = value;
    }

}
