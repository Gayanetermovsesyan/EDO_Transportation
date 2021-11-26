
package am.team.edo.lm;

import am.team.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the am.team package. 
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

    private final static QName _Message_QNAME = new QName("https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", "Message");
    private final static QName _Receipts_QNAME = new QName("https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", "Receipts");
    private final static QName _Invitation_QNAME = new QName("https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", "Invitation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: am.team
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Document.AdditionalData }
     * 
     */
    public Document.AdditionalData createDocumentAdditionalData() {
        return new Document.AdditionalData();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Invitation }
     * 
     */
    public Invitation createInvitation() {
        return new Invitation();
    }

    /**
     * Create an instance of {@link Receipts }
     * 
     */
    public Receipts createReceipts() {
        return new Receipts();
    }

    /**
     * Create an instance of {@link ReceiptSuccess }
     * 
     */
    public ReceiptSuccess createReceiptSuccess() {
        return new ReceiptSuccess();
    }

    /**
     * Create an instance of {@link ReceiptErrorHandling }
     * 
     */
    public ReceiptErrorHandling createReceiptErrorHandling() {
        return new ReceiptErrorHandling();
    }

    /**
     * Create an instance of {@link OrganizationSender }
     * 
     */
    public OrganizationSender createOrganizationSender() {
        return new OrganizationSender();
    }

    /**
     * Create an instance of {@link ES }
     * 
     */
    public ES createES() {
        return new ES();
    }

    /**
     * Create an instance of {@link OrganizationReceiver }
     * 
     */
    public OrganizationReceiver createOrganizationReceiver() {
        return new OrganizationReceiver();
    }

    /**
     * Create an instance of {@link ReceiptErrorUnknownId }
     * 
     */
    public ReceiptErrorUnknownId createReceiptErrorUnknownId() {
        return new ReceiptErrorUnknownId();
    }

    /**
     * Create an instance of {@link Document.AdditionalData.AdditionalParam }
     * 
     */
    public Document.AdditionalData.AdditionalParam createDocumentAdditionalDataAdditionalParam() {
        return new Document.AdditionalData.AdditionalParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", name = "Сообщение")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Receipts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", name = "Квитанции")
    public JAXBElement<Receipts> createReceipts(Receipts value) {
        return new JAXBElement<Receipts>(_Receipts_QNAME, Receipts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd", name = "Приглашение")
    public JAXBElement<Invitation> createInvitation(Invitation value) {
        return new JAXBElement<Invitation>(_Invitation_QNAME, Invitation.class, null, value);
    }

}
