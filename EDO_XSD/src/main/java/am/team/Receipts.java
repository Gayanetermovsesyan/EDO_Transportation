
package am.team;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receipts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorHandling" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ReceiptErrorHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnknownId" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ReceiptErrorUnknownId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Success" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ReceiptSuccess" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SendDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Receiver" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}OperatorId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Квитанции", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "errorHandling",
    "unknownId",
    "success"
})
public class Receipts {

    @XmlElement(name = "ОшибкаОбработки", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<ReceiptErrorHandling> errorHandling;
    @XmlElement(name = "НеизвестныйИд", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<ReceiptErrorUnknownId> unknownId;
    @XmlElement(name = "Успех", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<ReceiptSuccess> success;
    @XmlAttribute(name = "ДатаОтправки", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sendDate;
    @XmlAttribute(name = "Получатель", required = true)
    protected String receiver;

    /**
     * Gets the value of the errorHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptErrorHandling }
     * 
     * 
     */
    public List<ReceiptErrorHandling> getErrorHandling() {
        if (errorHandling == null) {
            errorHandling = new ArrayList<ReceiptErrorHandling>();
        }
        return this.errorHandling;
    }

    /**
     * Gets the value of the unknownId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unknownId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnknownId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptErrorUnknownId }
     * 
     * 
     */
    public List<ReceiptErrorUnknownId> getUnknownId() {
        if (unknownId == null) {
            unknownId = new ArrayList<ReceiptErrorUnknownId>();
        }
        return this.unknownId;
    }

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptSuccess }
     * 
     * 
     */
    public List<ReceiptSuccess> getSuccess() {
        if (success == null) {
            success = new ArrayList<ReceiptSuccess>();
        }
        return this.success;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(String value) {
        this.sendDate = value;
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

}
