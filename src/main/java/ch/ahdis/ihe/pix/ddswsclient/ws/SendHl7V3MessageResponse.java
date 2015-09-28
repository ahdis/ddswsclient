
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendHl7v3MessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendHl7v3MessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hl7v3MessageRespond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendHl7v3MessageResponse", propOrder = {
    "hl7V3MessageRespond"
})
public class SendHl7V3MessageResponse {

    @XmlElement(name = "Hl7v3MessageRespond")
    protected String hl7V3MessageRespond;

    /**
     * Gets the value of the hl7V3MessageRespond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHl7V3MessageRespond() {
        return hl7V3MessageRespond;
    }

    /**
     * Sets the value of the hl7V3MessageRespond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHl7V3MessageRespond(String value) {
        this.hl7V3MessageRespond = value;
    }

}
