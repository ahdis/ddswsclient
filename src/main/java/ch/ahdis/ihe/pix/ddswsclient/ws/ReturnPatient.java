
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnPatient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnPatient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNameOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firstNameOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="religionOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="raceOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="birthDayOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="addressOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="genderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstNameLike" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNameLike" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstNameIs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNameIs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnPatient", propOrder = {
    "countryCode",
    "lastNameOption",
    "firstNameOption",
    "religionOption",
    "raceOption",
    "birthDayOption",
    "addressOption",
    "genderDescription",
    "firstNameLike",
    "lastNameLike",
    "firstNameIs",
    "lastNameIs"
})
public class ReturnPatient {

    protected String countryCode;
    protected Boolean lastNameOption;
    protected Boolean firstNameOption;
    protected Boolean religionOption;
    protected Boolean raceOption;
    protected Boolean birthDayOption;
    protected Boolean addressOption;
    protected String genderDescription;
    protected String firstNameLike;
    protected String lastNameLike;
    protected String firstNameIs;
    protected String lastNameIs;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the lastNameOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastNameOption() {
        return lastNameOption;
    }

    /**
     * Sets the value of the lastNameOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastNameOption(Boolean value) {
        this.lastNameOption = value;
    }

    /**
     * Gets the value of the firstNameOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstNameOption() {
        return firstNameOption;
    }

    /**
     * Sets the value of the firstNameOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstNameOption(Boolean value) {
        this.firstNameOption = value;
    }

    /**
     * Gets the value of the religionOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReligionOption() {
        return religionOption;
    }

    /**
     * Sets the value of the religionOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReligionOption(Boolean value) {
        this.religionOption = value;
    }

    /**
     * Gets the value of the raceOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaceOption() {
        return raceOption;
    }

    /**
     * Sets the value of the raceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaceOption(Boolean value) {
        this.raceOption = value;
    }

    /**
     * Gets the value of the birthDayOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBirthDayOption() {
        return birthDayOption;
    }

    /**
     * Sets the value of the birthDayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBirthDayOption(Boolean value) {
        this.birthDayOption = value;
    }

    /**
     * Gets the value of the addressOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressOption() {
        return addressOption;
    }

    /**
     * Sets the value of the addressOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressOption(Boolean value) {
        this.addressOption = value;
    }

    /**
     * Gets the value of the genderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderDescription() {
        return genderDescription;
    }

    /**
     * Sets the value of the genderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderDescription(String value) {
        this.genderDescription = value;
    }

    /**
     * Gets the value of the firstNameLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameLike() {
        return firstNameLike;
    }

    /**
     * Sets the value of the firstNameLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameLike(String value) {
        this.firstNameLike = value;
    }

    /**
     * Gets the value of the lastNameLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameLike() {
        return lastNameLike;
    }

    /**
     * Sets the value of the lastNameLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameLike(String value) {
        this.lastNameLike = value;
    }

    /**
     * Gets the value of the firstNameIs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameIs() {
        return firstNameIs;
    }

    /**
     * Sets the value of the firstNameIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameIs(String value) {
        this.firstNameIs = value;
    }

    /**
     * Gets the value of the lastNameIs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameIs() {
        return lastNameIs;
    }

    /**
     * Sets the value of the lastNameIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameIs(String value) {
        this.lastNameIs = value;
    }

}
