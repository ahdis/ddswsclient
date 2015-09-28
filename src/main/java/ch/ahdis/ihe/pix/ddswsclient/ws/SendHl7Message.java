
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendHl7Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendHl7Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receivingApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivingFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characterSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hl7Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendHl7Message", propOrder = {
    "countryCode",
    "targetHost",
    "targetPort",
    "receivingApplication",
    "receivingFacility",
    "characterSet",
    "hl7Version",
    "messageType"
})
public class SendHl7Message {

    protected String countryCode;
    protected String targetHost;
    protected Integer targetPort;
    protected String receivingApplication;
    protected String receivingFacility;
    protected String characterSet;
    protected String hl7Version;
    protected String messageType;

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
     * Gets the value of the targetHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetHost() {
        return targetHost;
    }

    /**
     * Sets the value of the targetHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetHost(String value) {
        this.targetHost = value;
    }

    /**
     * Gets the value of the targetPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetPort() {
        return targetPort;
    }

    /**
     * Sets the value of the targetPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetPort(Integer value) {
        this.targetPort = value;
    }

    /**
     * Gets the value of the receivingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingApplication() {
        return receivingApplication;
    }

    /**
     * Sets the value of the receivingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingApplication(String value) {
        this.receivingApplication = value;
    }

    /**
     * Gets the value of the receivingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingFacility() {
        return receivingFacility;
    }

    /**
     * Sets the value of the receivingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingFacility(String value) {
        this.receivingFacility = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the hl7Version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHl7Version() {
        return hl7Version;
    }

    /**
     * Sets the value of the hl7Version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHl7Version(String value) {
        this.hl7Version = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

}
