
package am.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *  \u0412 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0435 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0438 \u0432\u043e\u0437\u043d\u0438\u043a\u043b\u0430 \u043a\u0430\u043a\u0430\u044f-\u043b\u0438\u0431\u043e \u0434\u0440\u0443\u0433\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430.
 *  \u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0440\u0430\u0437\u043e\u0431\u0440\u0430\u0442\u044c\u0441\u044f \u0432 \u043f\u0440\u0438\u0447\u0438\u043d\u0430\u0445 \u043e\u0448\u0438\u0431\u043a\u0438 \u0438 \u0443\u0441\u0442\u0440\u0430\u043d\u0438\u0442\u044c \u0438\u0445 \u0432\u0440\u0443\u0447\u043d\u0443\u044e.
 *  
 * 
 * <p>Java class for ReceiptErrorHandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptErrorHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ReceiptErrorHandling", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "description"
})
public class ReceiptErrorHandling {

    @XmlElement(name = "Description", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    protected String description;
    @XmlAttribute(name = "LMId", required = true)
    protected String lmId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
