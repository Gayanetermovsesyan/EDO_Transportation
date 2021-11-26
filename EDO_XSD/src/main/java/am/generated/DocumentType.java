
package am.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="SF"/>
 *     &lt;enumeration value="OperatorConfirmation"/>
 *     &lt;enumeration value="ReceivedNotice"/>
 *     &lt;enumeration value="EnumerationNotice"/>
 *     &lt;enumeration value="CancellationProposal"/>
 *     &lt;enumeration value="Trade12SellerTitle"/>
 *     &lt;enumeration value="Trade12BuyerTitle"/>
 *     &lt;enumeration value="Bidding2TitleofAdditionalInformationonAcceptanceResults"/>
 *     &lt;enumeration value="Trade2BuyerTitle"/>
 *     &lt;enumeration value="CustomerTitleDeed"/>
 *     &lt;enumeration value="TitleDeedoftheExecutor"/>
 *     &lt;enumeration value="KC-11"/>
 *     &lt;enumeration value="KC-2"/>
 *     &lt;enumeration value="KC-3"/>
 *     &lt;enumeration value="Statement"/>
 *     &lt;enumeration value="DocumentAboutSubmissionofWorkResultsContractor"/>
 *     &lt;enumeration value="DocumentAboutSubmissionofWorkResultsCustomer"/>
 *     &lt;enumeration value="DocumentAbouttheTransferofGoodsDuringTradeTransactionsSeller"/>
 *     &lt;enumeration value="DocumentAbouttheTransferofGoodsDuringTradeTransactionsbytheBuyer"/>
 *     &lt;enumeration value="SCF"/>
 *     &lt;enumeration value="SCHFDPSeller"/>
 *     &lt;enumeration value="SCHFDOPBuyer"/>
 *     &lt;enumeration value="DOPSellerInvoice"/>
 *     &lt;enumeration value="DOPSellerAct"/>
 *     &lt;enumeration value="OPTIONALBuyerInvoice"/>
 *     &lt;enumeration value="AdditionalBuyerAct"/>
 *     &lt;enumeration value="DOPSeller"/>
 *     &lt;enumeration value="EXTRABuyer"/>
 *     &lt;enumeration value="CorSCHF"/>
 *     &lt;enumeration value="CorSCHFDISSeller"/>
 *     &lt;enumeration value="CorSCHFDISBuyer"/>
 *     &lt;enumeration value="CorDISSellerInvoice"/>
 *     &lt;enumeration value="CorDISSellerAct"/>
 *     &lt;enumeration value="CorDISBuyer Invoice"/>
 *     &lt;enumeration value="CorDISBuyerAct"/>
 *     &lt;enumeration value="CorDISSeller"/>
 *     &lt;enumeration value="CorDISBuyer"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="StructuredData"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("Order")
    ORDER("Order"),
    SF("SF"),
    @XmlEnumValue("OperatorConfirmation")
    OPERATOR_CONFIRMATION("OperatorConfirmation"),
    @XmlEnumValue("ReceivedNotice")
    RECEIVED_NOTICE("ReceivedNotice"),
    @XmlEnumValue("EnumerationNotice")
    ENUMERATION_NOTICE("EnumerationNotice"),
    @XmlEnumValue("CancellationProposal")
    CANCELLATION_PROPOSAL("CancellationProposal"),
    @XmlEnumValue("Trade12SellerTitle")
    TRADE_12_SELLER_TITLE("Trade12SellerTitle"),
    @XmlEnumValue("Trade12BuyerTitle")
    TRADE_12_BUYER_TITLE("Trade12BuyerTitle"),
    @XmlEnumValue("Bidding2TitleofAdditionalInformationonAcceptanceResults")
    BIDDING_2_TITLEOF_ADDITIONAL_INFORMATIONON_ACCEPTANCE_RESULTS("Bidding2TitleofAdditionalInformationonAcceptanceResults"),
    @XmlEnumValue("Trade2BuyerTitle")
    TRADE_2_BUYER_TITLE("Trade2BuyerTitle"),
    @XmlEnumValue("CustomerTitleDeed")
    CUSTOMER_TITLE_DEED("CustomerTitleDeed"),
    @XmlEnumValue("TitleDeedoftheExecutor")
    TITLE_DEEDOFTHE_EXECUTOR("TitleDeedoftheExecutor"),
    @XmlEnumValue("KC-11")
    KC_11("KC-11"),
    @XmlEnumValue("KC-2")
    KC_2("KC-2"),
    @XmlEnumValue("KC-3")
    KC_3("KC-3"),
    @XmlEnumValue("Statement")
    STATEMENT("Statement"),
    @XmlEnumValue("DocumentAboutSubmissionofWorkResultsContractor")
    DOCUMENT_ABOUT_SUBMISSIONOF_WORK_RESULTS_CONTRACTOR("DocumentAboutSubmissionofWorkResultsContractor"),
    @XmlEnumValue("DocumentAboutSubmissionofWorkResultsCustomer")
    DOCUMENT_ABOUT_SUBMISSIONOF_WORK_RESULTS_CUSTOMER("DocumentAboutSubmissionofWorkResultsCustomer"),
    @XmlEnumValue("DocumentAbouttheTransferofGoodsDuringTradeTransactionsSeller")
    DOCUMENT_ABOUTTHE_TRANSFEROF_GOODS_DURING_TRADE_TRANSACTIONS_SELLER("DocumentAbouttheTransferofGoodsDuringTradeTransactionsSeller"),
    @XmlEnumValue("DocumentAbouttheTransferofGoodsDuringTradeTransactionsbytheBuyer")
    DOCUMENT_ABOUTTHE_TRANSFEROF_GOODS_DURING_TRADE_TRANSACTIONSBYTHE_BUYER("DocumentAbouttheTransferofGoodsDuringTradeTransactionsbytheBuyer"),
    SCF("SCF"),
    @XmlEnumValue("SCHFDPSeller")
    SCHFDP_SELLER("SCHFDPSeller"),
    @XmlEnumValue("SCHFDOPBuyer")
    SCHFDOP_BUYER("SCHFDOPBuyer"),
    @XmlEnumValue("DOPSellerInvoice")
    DOP_SELLER_INVOICE("DOPSellerInvoice"),
    @XmlEnumValue("DOPSellerAct")
    DOP_SELLER_ACT("DOPSellerAct"),
    @XmlEnumValue("OPTIONALBuyerInvoice")
    OPTIONAL_BUYER_INVOICE("OPTIONALBuyerInvoice"),
    @XmlEnumValue("AdditionalBuyerAct")
    ADDITIONAL_BUYER_ACT("AdditionalBuyerAct"),
    @XmlEnumValue("DOPSeller")
    DOP_SELLER("DOPSeller"),
    @XmlEnumValue("EXTRABuyer")
    EXTRA_BUYER("EXTRABuyer"),
    @XmlEnumValue("CorSCHF")
    COR_SCHF("CorSCHF"),
    @XmlEnumValue("CorSCHFDISSeller")
    COR_SCHFDIS_SELLER("CorSCHFDISSeller"),
    @XmlEnumValue("CorSCHFDISBuyer")
    COR_SCHFDIS_BUYER("CorSCHFDISBuyer"),
    @XmlEnumValue("CorDISSellerInvoice")
    COR_DIS_SELLER_INVOICE("CorDISSellerInvoice"),
    @XmlEnumValue("CorDISSellerAct")
    COR_DIS_SELLER_ACT("CorDISSellerAct"),
    @XmlEnumValue("CorDISBuyer Invoice")
    COR_DIS_BUYER_INVOICE("CorDISBuyer Invoice"),
    @XmlEnumValue("CorDISBuyerAct")
    COR_DIS_BUYER_ACT("CorDISBuyerAct"),
    @XmlEnumValue("CorDISSeller")
    COR_DIS_SELLER("CorDISSeller"),
    @XmlEnumValue("CorDISBuyer")
    COR_DIS_BUYER("CorDISBuyer"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),

    /**
     * 
     *  \u0421\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435 (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440 \u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435 xml),
     *  \u043f\u0435\u0440\u0435\u0434\u0430\u0432\u0430\u0435\u043c\u044b\u0435 \u0432\u043c\u0435\u0441\u0442\u0435 \u0441 \u043f\u0435\u0447\u0430\u0442\u043d\u043e\u0439 \u0444\u043e\u0440\u043c\u043e\u0439 Document\u0430.
     *  \u0423 Document\u0430 \u0442\u0430\u043a\u043e\u0433\u043e \u0442\u0438\u043f\u0430 \u0441\u043a\u043e\u0440\u0435\u0435 \u0432\u0441\u0435\u0433\u043e \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u0443\u043a\u0430\u0437\u0430\u043d Identifier ToDocument
     *  
     * 
     */
    @XmlEnumValue("StructuredData")
    STRUCTURED_DATA("StructuredData");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
