
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendHl7MessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendHl7MessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hl7MessageRespond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendHl7MessageResponse", propOrder = {
    "hl7MessageRespond"
})
public class SendHl7MessageResponse {

    @XmlElement(name = "Hl7MessageRespond")
    protected String hl7MessageRespond;

    /**
     * Gets the value of the hl7MessageRespond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHl7MessageRespond() {
        return hl7MessageRespond;
    }

    /**
     * Sets the value of the hl7MessageRespond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHl7MessageRespond(String value) {
        this.hl7MessageRespond = value;
    }

}
