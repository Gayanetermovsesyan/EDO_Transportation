
package am.team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToDocument" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SumVat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdditionalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalParam" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentId" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}Identifier" />
 *       &lt;attribute name="DocType" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}DocumentType" />
 *       &lt;attribute name="RecipientSignatureExpected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileName" use="required" type="{https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd}FileName" />
 *       &lt;attribute name="Encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Документ", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", propOrder = {
    "toDocument",
    "internalID",
    "dealID",
    "number",
    "date",
    "sum",
    "sumVat",
    "additionalData"
})
public class Document {

    @XmlElement(name = "КДокументу", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected List<String> toDocument;
    @XmlElement(name = "ИдВнутренний", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected String internalID;
    @XmlElement(name = "ИдСделки", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected String dealID;
    @XmlElement(name = "Номер", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected String number;
    @XmlElement(name = "Дата", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Сумма", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected BigDecimal sum;
    @XmlElement(name = "СуммаНДС", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected BigDecimal sumVat;
    @XmlElement(name = "ДополнительныеДанные", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
    protected Document.AdditionalData additionalData;
    @XmlAttribute(name = "ИдДокумента", required = true)
    protected String documentId;
    @XmlAttribute(name = "ТипДокумента", required = true)
    protected DocumentType docType;
    @XmlAttribute(name = "ОжидаетсяПодписьПолучателя")
    protected Boolean recipientSignatureExpected;
    @XmlAttribute(name = "ИмяФайла", required = true)
    protected String fileName;
    @XmlAttribute(name = "Зашифрован")
    protected Boolean encrypted;

    /**
     * Gets the value of the toDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToDocument() {
        if (toDocument == null) {
            toDocument = new ArrayList<String>();
        }
        return this.toDocument;
    }

    /**
     * Gets the value of the internalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Sets the value of the internalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the dealID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealID() {
        return dealID;
    }

    /**
     * Sets the value of the dealID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealID(String value) {
        this.dealID = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the sumVat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumVat() {
        return sumVat;
    }

    /**
     * Sets the value of the sumVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumVat(BigDecimal value) {
        this.sumVat = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link Document.AdditionalData }
     *     
     */
    public Document.AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.AdditionalData }
     *     
     */
    public void setAdditionalData(Document.AdditionalData value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocType(DocumentType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the recipientSignatureExpected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecipientSignatureExpected() {
        if (recipientSignatureExpected == null) {
            return false;
        } else {
            return recipientSignatureExpected;
        }
    }

    /**
     * Sets the value of the recipientSignatureExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientSignatureExpected(Boolean value) {
        this.recipientSignatureExpected = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEncrypted() {
        if (encrypted == null) {
            return false;
        } else {
            return encrypted;
        }
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdditionalParam" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalParam"
    })
    public static class AdditionalData {

        @XmlElement(name = "AdditionalParam", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", required = true)
        protected List<Document.AdditionalData.AdditionalParam> additionalParam;

        /**
         * Gets the value of the additionalParam property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalParam property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.AdditionalData.AdditionalParam }
         * 
         * 
         */
        public List<Document.AdditionalData.AdditionalParam> getAdditionalParam() {
            if (additionalParam == null) {
                additionalParam = new ArrayList<Document.AdditionalData.AdditionalParam>();
            }
            return this.additionalParam;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdditionalParam {

            @XmlAttribute(name = "Название", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String name;
            @XmlAttribute(name = "Значение", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
