
package ch.ahdis.ihe.pix.ddswsclient.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ahdis.ihe.pix.ddswsclient.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JDOMException_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "JDOMException");
    private final static QName _ReturnAddressByCoordinatesResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddressByCoordinatesResponse");
    private final static QName _IOException_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "IOException");
    private final static QName _ReturnPersonResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPersonResponse");
    private final static QName _ReturnHl7V3MessageResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnHl7v3MessageResponse");
    private final static QName _CharacterSetEncoding_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "CharacterSetEncoding");
    private final static QName _ReturnHl7V3Message_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnHl7v3Message");
    private final static QName _SendHl7MessageResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "sendHl7MessageResponse");
    private final static QName _ReturnSimplePatientResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnSimplePatientResponse");
    private final static QName _HL7Exception_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "HL7Exception");
    private final static QName _ReturnAddressByTownResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddressByTownResponse");
    private final static QName _ReturnHl7Message_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnHl7Message");
    private final static QName _ReturnPatientWithAllOptionsResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPatientWithAllOptionsResponse");
    private final static QName _SendHl7Message_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "sendHl7Message");
    private final static QName _ReturnPatientWithAllOptions_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPatientWithAllOptions");
    private final static QName _ReturnAddress_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddress");
    private final static QName _ReturnSimplePatient_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnSimplePatient");
    private final static QName _GetListCountryCode_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "getListCountryCode");
    private final static QName _ReturnPatientResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPatientResponse");
    private final static QName _SendHl7V3Message_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "sendHl7v3Message");
    private final static QName _ReturnAddressByTown_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddressByTown");
    private final static QName _ReturnPerson_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPerson");
    private final static QName _ReturnHl7MessageResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnHl7MessageResponse");
    private final static QName _SendHl7V3MessageResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "sendHl7v3MessageResponse");
    private final static QName _ReturnAddressByCoordinates_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddressByCoordinates");
    private final static QName _ReturnPatient_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnPatient");
    private final static QName _CountryCode_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "CountryCode");
    private final static QName _SOAPException_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "SOAPException");
    private final static QName _GetListCountryCodeResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "getListCountryCodeResponse");
    private final static QName _ReturnAddressResponse_QNAME = new QName("http://ws.demographic.gazelle.ihe.net/", "returnAddressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ahdis.ihe.pix.ddswsclient.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendHl7V3MessageResponse }
     * 
     */
    public SendHl7V3MessageResponse createSendHl7V3MessageResponse() {
        return new SendHl7V3MessageResponse();
    }

    /**
     * Create an instance of {@link ReturnHl7MessageResponse }
     * 
     */
    public ReturnHl7MessageResponse createReturnHl7MessageResponse() {
        return new ReturnHl7MessageResponse();
    }

    /**
     * Create an instance of {@link ReturnPerson }
     * 
     */
    public ReturnPerson createReturnPerson() {
        return new ReturnPerson();
    }

    /**
     * Create an instance of {@link ReturnAddressByTown }
     * 
     */
    public ReturnAddressByTown createReturnAddressByTown() {
        return new ReturnAddressByTown();
    }

    /**
     * Create an instance of {@link SendHl7V3Message }
     * 
     */
    public SendHl7V3Message createSendHl7V3Message() {
        return new SendHl7V3Message();
    }

    /**
     * Create an instance of {@link GetListCountryCode }
     * 
     */
    public GetListCountryCode createGetListCountryCode() {
        return new GetListCountryCode();
    }

    /**
     * Create an instance of {@link ReturnPatientResponse }
     * 
     */
    public ReturnPatientResponse createReturnPatientResponse() {
        return new ReturnPatientResponse();
    }

    /**
     * Create an instance of {@link ReturnSimplePatient }
     * 
     */
    public ReturnSimplePatient createReturnSimplePatient() {
        return new ReturnSimplePatient();
    }

    /**
     * Create an instance of {@link ReturnAddress }
     * 
     */
    public ReturnAddress createReturnAddress() {
        return new ReturnAddress();
    }

    /**
     * Create an instance of {@link GetListCountryCodeResponse }
     * 
     */
    public GetListCountryCodeResponse createGetListCountryCodeResponse() {
        return new GetListCountryCodeResponse();
    }

    /**
     * Create an instance of {@link ReturnAddressResponse }
     * 
     */
    public ReturnAddressResponse createReturnAddressResponse() {
        return new ReturnAddressResponse();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link ReturnAddressByCoordinates }
     * 
     */
    public ReturnAddressByCoordinates createReturnAddressByCoordinates() {
        return new ReturnAddressByCoordinates();
    }

    /**
     * Create an instance of {@link ReturnPatient }
     * 
     */
    public ReturnPatient createReturnPatient() {
        return new ReturnPatient();
    }

    /**
     * Create an instance of {@link SendHl7MessageResponse }
     * 
     */
    public SendHl7MessageResponse createSendHl7MessageResponse() {
        return new SendHl7MessageResponse();
    }

    /**
     * Create an instance of {@link ReturnHl7V3Message }
     * 
     */
    public ReturnHl7V3Message createReturnHl7V3Message() {
        return new ReturnHl7V3Message();
    }

    /**
     * Create an instance of {@link CharacterSetEncoding }
     * 
     */
    public CharacterSetEncoding createCharacterSetEncoding() {
        return new CharacterSetEncoding();
    }

    /**
     * Create an instance of {@link ReturnHl7V3MessageResponse }
     * 
     */
    public ReturnHl7V3MessageResponse createReturnHl7V3MessageResponse() {
        return new ReturnHl7V3MessageResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link ReturnPersonResponse }
     * 
     */
    public ReturnPersonResponse createReturnPersonResponse() {
        return new ReturnPersonResponse();
    }

    /**
     * Create an instance of {@link JDOMException }
     * 
     */
    public JDOMException createJDOMException() {
        return new JDOMException();
    }

    /**
     * Create an instance of {@link ReturnAddressByCoordinatesResponse }
     * 
     */
    public ReturnAddressByCoordinatesResponse createReturnAddressByCoordinatesResponse() {
        return new ReturnAddressByCoordinatesResponse();
    }

    /**
     * Create an instance of {@link ReturnPatientWithAllOptions }
     * 
     */
    public ReturnPatientWithAllOptions createReturnPatientWithAllOptions() {
        return new ReturnPatientWithAllOptions();
    }

    /**
     * Create an instance of {@link SendHl7Message }
     * 
     */
    public SendHl7Message createSendHl7Message() {
        return new SendHl7Message();
    }

    /**
     * Create an instance of {@link ReturnAddressByTownResponse }
     * 
     */
    public ReturnAddressByTownResponse createReturnAddressByTownResponse() {
        return new ReturnAddressByTownResponse();
    }

    /**
     * Create an instance of {@link ReturnHl7Message }
     * 
     */
    public ReturnHl7Message createReturnHl7Message() {
        return new ReturnHl7Message();
    }

    /**
     * Create an instance of {@link ReturnPatientWithAllOptionsResponse }
     * 
     */
    public ReturnPatientWithAllOptionsResponse createReturnPatientWithAllOptionsResponse() {
        return new ReturnPatientWithAllOptionsResponse();
    }

    /**
     * Create an instance of {@link HL7Exception }
     * 
     */
    public HL7Exception createHL7Exception() {
        return new HL7Exception();
    }

    /**
     * Create an instance of {@link ReturnSimplePatientResponse }
     * 
     */
    public ReturnSimplePatientResponse createReturnSimplePatientResponse() {
        return new ReturnSimplePatientResponse();
    }

    /**
     * Create an instance of {@link LastName }
     * 
     */
    public LastName createLastName() {
        return new LastName();
    }

    /**
     * Create an instance of {@link Gender }
     * 
     */
    public Gender createGender() {
        return new Gender();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Street }
     * 
     */
    public Street createStreet() {
        return new Street();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link PatientAddress }
     * 
     */
    public PatientAddress createPatientAddress() {
        return new PatientAddress();
    }

    /**
     * Create an instance of {@link FirstNameSex }
     * 
     */
    public FirstNameSex createFirstNameSex() {
        return new FirstNameSex();
    }

    /**
     * Create an instance of {@link Race }
     * 
     */
    public Race createRace() {
        return new Race();
    }

    /**
     * Create an instance of {@link Sex }
     * 
     */
    public Sex createSex() {
        return new Sex();
    }

    /**
     * Create an instance of {@link Religion }
     * 
     */
    public Religion createReligion() {
        return new Religion();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link OtherName }
     * 
     */
    public OtherName createOtherName() {
        return new OtherName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JDOMException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "JDOMException")
    public JAXBElement<JDOMException> createJDOMException(JDOMException value) {
        return new JAXBElement<JDOMException>(_JDOMException_QNAME, JDOMException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddressByCoordinatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddressByCoordinatesResponse")
    public JAXBElement<ReturnAddressByCoordinatesResponse> createReturnAddressByCoordinatesResponse(ReturnAddressByCoordinatesResponse value) {
        return new JAXBElement<ReturnAddressByCoordinatesResponse>(_ReturnAddressByCoordinatesResponse_QNAME, ReturnAddressByCoordinatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPersonResponse")
    public JAXBElement<ReturnPersonResponse> createReturnPersonResponse(ReturnPersonResponse value) {
        return new JAXBElement<ReturnPersonResponse>(_ReturnPersonResponse_QNAME, ReturnPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHl7V3MessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnHl7v3MessageResponse")
    public JAXBElement<ReturnHl7V3MessageResponse> createReturnHl7V3MessageResponse(ReturnHl7V3MessageResponse value) {
        return new JAXBElement<ReturnHl7V3MessageResponse>(_ReturnHl7V3MessageResponse_QNAME, ReturnHl7V3MessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacterSetEncoding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "CharacterSetEncoding")
    public JAXBElement<CharacterSetEncoding> createCharacterSetEncoding(CharacterSetEncoding value) {
        return new JAXBElement<CharacterSetEncoding>(_CharacterSetEncoding_QNAME, CharacterSetEncoding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHl7V3Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnHl7v3Message")
    public JAXBElement<ReturnHl7V3Message> createReturnHl7V3Message(ReturnHl7V3Message value) {
        return new JAXBElement<ReturnHl7V3Message>(_ReturnHl7V3Message_QNAME, ReturnHl7V3Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHl7MessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "sendHl7MessageResponse")
    public JAXBElement<SendHl7MessageResponse> createSendHl7MessageResponse(SendHl7MessageResponse value) {
        return new JAXBElement<SendHl7MessageResponse>(_SendHl7MessageResponse_QNAME, SendHl7MessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnSimplePatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnSimplePatientResponse")
    public JAXBElement<ReturnSimplePatientResponse> createReturnSimplePatientResponse(ReturnSimplePatientResponse value) {
        return new JAXBElement<ReturnSimplePatientResponse>(_ReturnSimplePatientResponse_QNAME, ReturnSimplePatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HL7Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "HL7Exception")
    public JAXBElement<HL7Exception> createHL7Exception(HL7Exception value) {
        return new JAXBElement<HL7Exception>(_HL7Exception_QNAME, HL7Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddressByTownResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddressByTownResponse")
    public JAXBElement<ReturnAddressByTownResponse> createReturnAddressByTownResponse(ReturnAddressByTownResponse value) {
        return new JAXBElement<ReturnAddressByTownResponse>(_ReturnAddressByTownResponse_QNAME, ReturnAddressByTownResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHl7Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnHl7Message")
    public JAXBElement<ReturnHl7Message> createReturnHl7Message(ReturnHl7Message value) {
        return new JAXBElement<ReturnHl7Message>(_ReturnHl7Message_QNAME, ReturnHl7Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatientWithAllOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPatientWithAllOptionsResponse")
    public JAXBElement<ReturnPatientWithAllOptionsResponse> createReturnPatientWithAllOptionsResponse(ReturnPatientWithAllOptionsResponse value) {
        return new JAXBElement<ReturnPatientWithAllOptionsResponse>(_ReturnPatientWithAllOptionsResponse_QNAME, ReturnPatientWithAllOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHl7Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "sendHl7Message")
    public JAXBElement<SendHl7Message> createSendHl7Message(SendHl7Message value) {
        return new JAXBElement<SendHl7Message>(_SendHl7Message_QNAME, SendHl7Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatientWithAllOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPatientWithAllOptions")
    public JAXBElement<ReturnPatientWithAllOptions> createReturnPatientWithAllOptions(ReturnPatientWithAllOptions value) {
        return new JAXBElement<ReturnPatientWithAllOptions>(_ReturnPatientWithAllOptions_QNAME, ReturnPatientWithAllOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddress")
    public JAXBElement<ReturnAddress> createReturnAddress(ReturnAddress value) {
        return new JAXBElement<ReturnAddress>(_ReturnAddress_QNAME, ReturnAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnSimplePatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnSimplePatient")
    public JAXBElement<ReturnSimplePatient> createReturnSimplePatient(ReturnSimplePatient value) {
        return new JAXBElement<ReturnSimplePatient>(_ReturnSimplePatient_QNAME, ReturnSimplePatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "getListCountryCode")
    public JAXBElement<GetListCountryCode> createGetListCountryCode(GetListCountryCode value) {
        return new JAXBElement<GetListCountryCode>(_GetListCountryCode_QNAME, GetListCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPatientResponse")
    public JAXBElement<ReturnPatientResponse> createReturnPatientResponse(ReturnPatientResponse value) {
        return new JAXBElement<ReturnPatientResponse>(_ReturnPatientResponse_QNAME, ReturnPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHl7V3Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "sendHl7v3Message")
    public JAXBElement<SendHl7V3Message> createSendHl7V3Message(SendHl7V3Message value) {
        return new JAXBElement<SendHl7V3Message>(_SendHl7V3Message_QNAME, SendHl7V3Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddressByTown }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddressByTown")
    public JAXBElement<ReturnAddressByTown> createReturnAddressByTown(ReturnAddressByTown value) {
        return new JAXBElement<ReturnAddressByTown>(_ReturnAddressByTown_QNAME, ReturnAddressByTown.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPerson")
    public JAXBElement<ReturnPerson> createReturnPerson(ReturnPerson value) {
        return new JAXBElement<ReturnPerson>(_ReturnPerson_QNAME, ReturnPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHl7MessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnHl7MessageResponse")
    public JAXBElement<ReturnHl7MessageResponse> createReturnHl7MessageResponse(ReturnHl7MessageResponse value) {
        return new JAXBElement<ReturnHl7MessageResponse>(_ReturnHl7MessageResponse_QNAME, ReturnHl7MessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendHl7V3MessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "sendHl7v3MessageResponse")
    public JAXBElement<SendHl7V3MessageResponse> createSendHl7V3MessageResponse(SendHl7V3MessageResponse value) {
        return new JAXBElement<SendHl7V3MessageResponse>(_SendHl7V3MessageResponse_QNAME, SendHl7V3MessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddressByCoordinates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddressByCoordinates")
    public JAXBElement<ReturnAddressByCoordinates> createReturnAddressByCoordinates(ReturnAddressByCoordinates value) {
        return new JAXBElement<ReturnAddressByCoordinates>(_ReturnAddressByCoordinates_QNAME, ReturnAddressByCoordinates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnPatient")
    public JAXBElement<ReturnPatient> createReturnPatient(ReturnPatient value) {
        return new JAXBElement<ReturnPatient>(_ReturnPatient_QNAME, ReturnPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "CountryCode")
    public JAXBElement<CountryCode> createCountryCode(CountryCode value) {
        return new JAXBElement<CountryCode>(_CountryCode_QNAME, CountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCountryCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "getListCountryCodeResponse")
    public JAXBElement<GetListCountryCodeResponse> createGetListCountryCodeResponse(GetListCountryCodeResponse value) {
        return new JAXBElement<GetListCountryCodeResponse>(_GetListCountryCodeResponse_QNAME, GetListCountryCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demographic.gazelle.ihe.net/", name = "returnAddressResponse")
    public JAXBElement<ReturnAddressResponse> createReturnAddressResponse(ReturnAddressResponse value) {
        return new JAXBElement<ReturnAddressResponse>(_ReturnAddressResponse_QNAME, ReturnAddressResponse.class, null, value);
    }

}
