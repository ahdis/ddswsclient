
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastNameOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firstNameOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="motherMaidenNameOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="religionOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="raceOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="birthDayOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "returnPerson", propOrder = {
    "countryCode",
    "lastNameOption",
    "firstNameOption",
    "motherMaidenNameOption",
    "religionOption",
    "raceOption",
    "birthDayOption",
    "genderDescription",
    "firstNameLike",
    "lastNameLike",
    "firstNameIs",
    "lastNameIs"
})
public class ReturnPerson {

    protected String countryCode;
    protected boolean lastNameOption;
    protected boolean firstNameOption;
    protected Boolean motherMaidenNameOption;
    protected boolean religionOption;
    protected boolean raceOption;
    protected boolean birthDayOption;
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
     */
    public boolean isLastNameOption() {
        return lastNameOption;
    }

    /**
     * Sets the value of the lastNameOption property.
     * 
     */
    public void setLastNameOption(boolean value) {
        this.lastNameOption = value;
    }

    /**
     * Gets the value of the firstNameOption property.
     * 
     */
    public boolean isFirstNameOption() {
        return firstNameOption;
    }

    /**
     * Sets the value of the firstNameOption property.
     * 
     */
    public void setFirstNameOption(boolean value) {
        this.firstNameOption = value;
    }

    /**
     * Gets the value of the motherMaidenNameOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMotherMaidenNameOption() {
        return motherMaidenNameOption;
    }

    /**
     * Sets the value of the motherMaidenNameOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMotherMaidenNameOption(Boolean value) {
        this.motherMaidenNameOption = value;
    }

    /**
     * Gets the value of the religionOption property.
     * 
     */
    public boolean isReligionOption() {
        return religionOption;
    }

    /**
     * Sets the value of the religionOption property.
     * 
     */
    public void setReligionOption(boolean value) {
        this.religionOption = value;
    }

    /**
     * Gets the value of the raceOption property.
     * 
     */
    public boolean isRaceOption() {
        return raceOption;
    }

    /**
     * Sets the value of the raceOption property.
     * 
     */
    public void setRaceOption(boolean value) {
        this.raceOption = value;
    }

    /**
     * Gets the value of the birthDayOption property.
     * 
     */
    public boolean isBirthDayOption() {
        return birthDayOption;
    }

    /**
     * Sets the value of the birthDayOption property.
     * 
     */
    public void setBirthDayOption(boolean value) {
        this.birthDayOption = value;
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
