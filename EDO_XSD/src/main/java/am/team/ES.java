
package am.team;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Signatory" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}IDMemberEDO" />
 *       &lt;attribute name="ESId" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" />
 *       &lt;attribute name="ToDocument" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ЭП", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
public class ES {

    @XmlAttribute(name = "Подписант", required = true)
    protected String signatory;
    @XmlAttribute(name = "ИдЭП", required = true)
    protected String esId;
    @XmlAttribute(name = "КДокументу", required = true)
    protected String toDocument;

    /**
     * Gets the value of the signatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatory() {
        return signatory;
    }

    /**
     * Sets the value of the signatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatory(String value) {
        this.signatory = value;
    }

    /**
     * Gets the value of the esId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESId() {
        return esId;
    }

    /**
     * Sets the value of the esId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESId(String value) {
        this.esId = value;
    }

    /**
     * Gets the value of the toDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDocument() {
        return toDocument;
    }

    /**
     * Sets the value of the toDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDocument(String value) {
        this.toDocument = value;
    }

}
