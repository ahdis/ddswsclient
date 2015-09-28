
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.demographic.gazelle.ihe.net/}auditModule">
 *       &lt;sequence>
 *         &lt;element name="firstNameSex" type="{http://ws.demographic.gazelle.ihe.net/}firstNameSex" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://ws.demographic.gazelle.ihe.net/}lastName" minOccurs="0"/>
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherName", propOrder = {
    "firstNameSex",
    "id",
    "lastName",
    "nameType"
})
public class OtherName
    extends AuditModule
{

    protected FirstNameSex firstNameSex;
    protected Integer id;
    protected LastName lastName;
    protected String nameType;

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

}
