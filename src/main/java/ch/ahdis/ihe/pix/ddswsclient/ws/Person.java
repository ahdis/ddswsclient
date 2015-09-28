
package ch.ahdis.ihe.pix.ddswsclient.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.demographic.gazelle.ihe.net/}auditModule">
 *       &lt;sequence>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstAlternativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstNameSex" type="{http://ws.demographic.gazelle.ihe.net/}firstNameSex" minOccurs="0"/>
 *         &lt;element name="lastAlternativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://ws.demographic.gazelle.ihe.net/}lastName" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherMaidenName" type="{http://ws.demographic.gazelle.ihe.net/}lastName" minOccurs="0"/>
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherFirstNameSexList" type="{http://ws.demographic.gazelle.ihe.net/}firstNameSex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherNameList" type="{http://ws.demographic.gazelle.ihe.net/}otherName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="race" type="{http://ws.demographic.gazelle.ihe.net/}race" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://ws.demographic.gazelle.ihe.net/}religion" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://ws.demographic.gazelle.ihe.net/}sex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "dateOfBirth",
    "dateOfDeath",
    "firstAlternativeName",
    "firstNameSex",
    "lastAlternativeName",
    "lastName",
    "maritalStatus",
    "motherMaidenName",
    "nameType",
    "otherFirstNameSexList",
    "otherNameList",
    "race",
    "religion",
    "sex"
})
public class Person
    extends AuditModule
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeath;
    protected String firstAlternativeName;
    protected FirstNameSex firstNameSex;
    protected String lastAlternativeName;
    protected LastName lastName;
    protected String maritalStatus;
    protected LastName motherMaidenName;
    protected String nameType;
    @XmlElement(nillable = true)
    protected List<FirstNameSex> otherFirstNameSexList;
    @XmlElement(nillable = true)
    protected List<OtherName> otherNameList;
    protected Race race;
    protected Religion religion;
    protected Sex sex;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the firstAlternativeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAlternativeName() {
        return firstAlternativeName;
    }

    /**
     * Sets the value of the firstAlternativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAlternativeName(String value) {
        this.firstAlternativeName = value;
    }

    /**
     * Gets the value of the firstNameSex property.
     * 
     * @return
     *     possible object is
     *     {@link FirstNameSex }
     *     
     */
    public FirstNameSex getFirstNameSex() {
        return firstNameSex;
    }

    /**
     * Sets the value of the firstNameSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstNameSex }
     *     
     */
    public void setFirstNameSex(FirstNameSex value) {
        this.firstNameSex = value;
    }

    /**
     * Gets the value of the lastAlternativeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAlternativeName() {
        return lastAlternativeName;
    }

    /**
     * Sets the value of the lastAlternativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAlternativeName(String value) {
        this.lastAlternativeName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastName }
     *     
     */
    public LastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastName }
     *     
     */
    public void setLastName(LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link LastName }
     *     
     */
    public LastName getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastName }
     *     
     */
    public void setMotherMaidenName(LastName value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the otherFirstNameSexList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFirstNameSexList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFirstNameSexList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FirstNameSex }
     * 
     * 
     */
    public List<FirstNameSex> getOtherFirstNameSexList() {
        if (otherFirstNameSexList == null) {
            otherFirstNameSexList = new ArrayList<FirstNameSex>();
        }
        return this.otherFirstNameSexList;
    }

    /**
     * Gets the value of the otherNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherName }
     * 
     * 
     */
    public List<OtherName> getOtherNameList() {
        if (otherNameList == null) {
            otherNameList = new ArrayList<OtherName>();
        }
        return this.otherNameList;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link Race }
     *     
     */
    public Race getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link Race }
     *     
     */
    public void setRace(Race value) {
        this.race = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link Religion }
     *     
     */
    public Religion getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Religion }
     *     
     */
    public void setReligion(Religion value) {
        this.religion = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

}
