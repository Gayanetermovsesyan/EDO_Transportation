
package am.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ES" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ES" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Sender" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}IDMemberEDO" />
 *       &lt;attribute name="Receiver" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}IDMemberEDO" />
 *       &lt;attribute name="ReceiverDepartmentID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="255"/>
 *             &lt;minLength value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SendDate" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}DateTimeUTC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Сообщение", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "document",
    "es"
})
public class Message {

    @XmlElement(name = "Document", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<Document> document;
    @XmlElement(name = "ES", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<ES> es;
    @XmlAttribute(name = "Sender", required = true)
    protected String sender;
    @XmlAttribute(name = "Receiver", required = true)
    protected String receiver;
    @XmlAttribute(name = "ReceiverDepartmentID")
    protected String receiverDepartmentID;
    @XmlAttribute(name = "SendDate", required = true)
    protected XMLGregorianCalendar sendDate;

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

    /**
     * Gets the value of the es property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the es property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ES }
     * 
     * 
     */
    public List<ES> getES() {
        if (es == null) {
            es = new ArrayList<ES>();
        }
        return this.es;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the receiverDepartmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverDepartmentID() {
        return receiverDepartmentID;
    }

    /**
     * Sets the value of the receiverDepartmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverDepartmentID(String value) {
        this.receiverDepartmentID = value;
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

}
