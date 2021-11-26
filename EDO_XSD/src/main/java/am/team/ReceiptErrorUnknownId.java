
package am.team;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 *  Document \u0438\u043b\u0438 ES \u0438\u0437 \u043e\u0431\u0440\u0430\u0431\u0430\u0442\u044b\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u041b\u0421 \u0441\u0441\u044b\u043b\u0430\u0435\u0442\u0441\u044f \u043d\u0430 \u043d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0441\u0438\u0441\u0442\u0435\u043c\u0435 Document.
 *  \u042d\u0442\u0430 \u043e\u0448\u0438\u0431\u043a\u0430 \u043c\u043e\u0436\u0435\u0442 \u0432\u043e\u0437\u043d\u0438\u043a\u0430\u0442\u044c, \u0435\u0441\u043b\u0438 \u0422\u041f \u0441 \u0445\u0440\u043e\u043d\u043e\u043b\u043e\u0433\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u043e\u043b\u0435\u0435 \u043f\u043e\u0437\u0434\u043d\u0438\u043c\u0438 Document\u0430\u043c\u0438 \u0431\u0443\u0434\u0435\u0442 \u043f\u043e 
 * \u043a\u0430\u043a\u043e\u0439-\u0442\u043e \u043f\u0440\u0438\u0447\u0438\u043d\u0435
 *  (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0438\u0437-\u0437\u0430 \u0440\u0430\u0437\u043e\u0432\u043e\u0433\u043e \u0441\u0431\u043e\u044f \u0442\u0440\u0430\u043d\u0441\u043f\u043e\u0440\u0442\u0430) \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043e \u0438 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u0430\u043d\u043e \u0440\u0430\u043d\u0435\u0435,
 *  \u0422\u041f \u0441 \u0445\u0440\u043e\u043d\u043e\u043b\u043e\u0433\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u043e\u043b\u0435\u0435 \u0440\u0430\u043d\u043d\u0438\u043c\u0438 Document\u0430\u043c\u0438.
 *  \u041d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u043f\u043e\u0432\u0442\u043e\u0440\u0438\u0442\u044c \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u0443 \u0434\u0430\u043d\u043d\u043e\u0433\u043e \u041b\u0421 \u0447\u0435\u0440\u0435\u0437 \u043d\u0435\u043a\u043e\u0442\u043e\u0440\u043e\u0435 \u0432\u0440\u0435\u043c\u044f.
 *  \u0415\u0441\u043b\u0438 \u043e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0432\u0442\u043e\u0440\u044f\u0435\u0442\u0441\u044f \u043f\u043e\u0441\u0442\u043e\u044f\u043d\u043d\u043e, \u0440\u0430\u0437\u043e\u0431\u0440\u0430\u0442\u044c\u0441\u044f \u0432 \u043f\u0440\u0438\u0447\u0438\u043d\u0430\u0445 \u043e\u0448\u0438\u0431\u043a\u0438 \u0438 \u0443\u0441\u0442\u0440\u0430\u043d\u0438\u0442\u044c \u0438\u0445 \u0432\u0440\u0443\u0447\u043d\u0443\u044e.
 *  
 * 
 * <p>Java class for ReceiptErrorUnknownId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptErrorUnknownId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" maxOccurs="unbounded"/>
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
@XmlType(name = "ReceiptErrorUnknownId", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "id",
    "description"
})
public class ReceiptErrorUnknownId {

    @XmlElement(name = "Ид", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    protected List<String> id;
    @XmlElement(name = "Описание", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    protected String description;
    @XmlAttribute(name = "ИдЛС", required = true)
    protected String lmId;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

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
