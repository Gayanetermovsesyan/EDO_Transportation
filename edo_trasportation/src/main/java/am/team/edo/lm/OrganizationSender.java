
package am.team.edo.lm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationSender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Id" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}IDMemberEDO" />
 *       &lt;attribute name="TaxID" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}TaxIdType" />
 *       &lt;attribute name="ReasonCode" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}ReasonCodeType" />
 *       &lt;attribute name="NameOrg" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ОрганизацияОтправитель", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
public class OrganizationSender {

    @XmlAttribute(name = "Ид", required = true)
    protected String id;
    @XmlAttribute(name = "ИНН", required = true)
    protected String taxID;
    @XmlAttribute(name = "КПП")
    protected String reasonCode;
    @XmlAttribute(name = "НаимОрг", required = true)
    protected String nameOrg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the nameOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOrg() {
        return nameOrg;
    }

    /**
     * Sets the value of the nameOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOrg(String value) {
        this.nameOrg = value;
    }

}
