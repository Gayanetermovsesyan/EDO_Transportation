
package am.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invitation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgSender" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}OrganizationSender"/>
 *         &lt;element name="OrgReceiver" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}OrganizationReceiver"/>
 *         &lt;element name="Document" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Document" minOccurs="0"/>
 *         &lt;element name="ES" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ES" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SendDate" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}DateTimeUTC" />
 *       &lt;attribute name="Type" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}RequestType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invitation", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "orgSender",
    "orgReceiver",
    "document",
    "es",
    "comment"
})
public class Invitation {

    @XmlElement(name = "OrgSender", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    protected OrganizationSender orgSender;
    @XmlElement(name = "OrgReceiver", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    protected OrganizationReceiver orgReceiver;
    @XmlElement(name = "Document", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected Document document;
    @XmlElement(name = "ES", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected ES es;
    @XmlElement(name = "Comment", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected String comment;
    @XmlAttribute(name = "SendDate", required = true)
    protected XMLGregorianCalendar sendDate;
    @XmlAttribute(name = "Type", required = true)
    protected RequestType type;

    /**
     * Gets the value of the orgSender property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSender }
     *     
     */
    public OrganizationSender getOrgSender() {
        return orgSender;
    }

    /**
     * Sets the value of the orgSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSender }
     *     
     */
    public void setOrgSender(OrganizationSender value) {
        this.orgSender = value;
    }

    /**
     * Gets the value of the orgReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReceiver }
     *     
     */
    public OrganizationReceiver getOrgReceiver() {
        return orgReceiver;
    }

    /**
     * Sets the value of the orgReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReceiver }
     *     
     */
    public void setOrgReceiver(OrganizationReceiver value) {
        this.orgReceiver = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the es property.
     * 
     * @return
     *     possible object is
     *     {@link ES }
     *     
     */
    public ES getES() {
        return es;
    }

    /**
     * Sets the value of the es property.
     * 
     * @param value
     *     allowed object is
     *     {@link ES }
     *     
     */
    public void setES(ES value) {
        this.es = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setType(RequestType value) {
        this.type = value;
    }

}
