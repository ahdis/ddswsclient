
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
 * <p>Java class for patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.demographic.gazelle.ihe.net/}auditModule">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://ws.demographic.gazelle.ihe.net/}patientAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="country" type="{http://ws.demographic.gazelle.ihe.net/}countryCode" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ddsPatientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherPatient" type="{http://ws.demographic.gazelle.ihe.net/}patient" minOccurs="0"/>
 *         &lt;element name="nationalPatientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="person" type="{http://ws.demographic.gazelle.ihe.net/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient", propOrder = {
    "address",
    "country",
    "creationDate",
    "ddsPatientIdentifier",
    "motherPatient",
    "nationalPatientIdentifier",
    "person"
})
public class Patient
    extends AuditModule
{

    @XmlElement(nillable = true)
    protected List<PatientAddress> address;
    protected CountryCode country;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String ddsPatientIdentifier;
    protected Patient motherPatient;
    protected String nationalPatientIdentifier;
    protected Person person;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientAddress }
     * 
     * 
     */
    public List<PatientAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<PatientAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the ddsPatientIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdsPatientIdentifier() {
        return ddsPatientIdentifier;
    }

    /**
     * Sets the value of the ddsPatientIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdsPatientIdentifier(String value) {
        this.ddsPatientIdentifier = value;
    }

    /**
     * Gets the value of the motherPatient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getMotherPatient() {
        return motherPatient;
    }

    /**
     * Sets the value of the motherPatient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setMotherPatient(Patient value) {
        this.motherPatient = value;
    }

    /**
     * Gets the value of the nationalPatientIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalPatientIdentifier() {
        return nationalPatientIdentifier;
    }

    /**
     * Sets the value of the nationalPatientIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalPatientIdentifier(String value) {
        this.nationalPatientIdentifier = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
