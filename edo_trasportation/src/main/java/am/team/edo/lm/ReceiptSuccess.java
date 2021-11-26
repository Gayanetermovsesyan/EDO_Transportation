
package am.team.edo.lm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *  \u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u0443\u0435\u0442 \u043e\u0431 \u0443\u0441\u043f\u0435\u0448\u043d\u043e\u0439 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0435 \u041b\u0421 \u0441 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c Identifier\u043e\u043c
 *  
 * 
 * <p>Java class for ReceiptSuccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptSuccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ES" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ES" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LMId" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "КвитанцияУспех", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "document",
    "es"
})
public class ReceiptSuccess {

    @XmlElement(name = "Документ", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<Document> document;
    @XmlElement(name = "ЭП", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<ES> es;
    @XmlAttribute(name = "ИдЛС", required = true)
    protected String lmId;

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
     * Gets the value of the lmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMId() {
        return lmId;
    }

    /**
     * Sets the value of the lmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMId(String value) {
        this.lmId = value;
    }

}
