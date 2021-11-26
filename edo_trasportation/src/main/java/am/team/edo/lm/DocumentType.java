
package am.team.edo.lm;

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
 *     &lt;enumeration value="\u041d\u0435\u0444\u043e\u0440\u043c\u0430\u043b\u0438\u0437\u043e\u0432\u0430\u043d\u043d\u044b\u0439"/>
 *     &lt;enumeration value="\u041e\u0442\u043a\u0430\u0437\u041f\u043e\u0434\u043f\u0438\u0441\u0438"/>
 *     &lt;enumeration value="\u0422\u041d"/>
 *     &lt;enumeration value="\u0422\u0422\u041d"/>
 *     &lt;enumeration value="\u0410\u043a\u0442"/>
 *     &lt;enumeration value="\u0410\u043a\u0442\u0421\u0432\u0435\u0440\u043a\u0438"/>
 *     &lt;enumeration value="\u041f\u043b\u0430\u0442\u041f\u043e\u0440\u0443\u0447"/>
 *     &lt;enumeration value="\u0414\u043e\u0433\u043e\u0432\u043e\u0440"/>
 *     &lt;enumeration value="\u0417\u0430\u043a\u0430\u0437"/>
 *     &lt;enumeration value="\u0421\u0424"/>
 *     &lt;enumeration value="\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u0435\u041e\u043f\u0435\u0440\u0430\u0442\u043e\u0440\u0430"/>
 *     &lt;enumeration value="\u0418\u0437\u0432\u0435\u0449\u0435\u043d\u0438\u0435\u041e\u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438"/>
 *     &lt;enumeration value="\u0423\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435\u041e\u0431\u0423\u0442\u043e\u0447\u043d\u0435\u043d\u0438\u0438"/>
 *     &lt;enumeration value="\u041f\u0440\u0435\u0434\u043b\u043e\u0436\u0435\u043d\u0438\u0435\u041e\u0431\u0410\u043d\u043d\u0443\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0438"/>
 *     &lt;enumeration value="\u0422\u043e\u0440\u043312\u0422\u0438\u0442\u0443\u043b\u041f\u0440\u043e\u0434\u0430\u0432\u0446\u0430"/>
 *     &lt;enumeration value="\u0422\u043e\u0440\u043312\u0422\u0438\u0442\u0443\u043b\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044f"/>
 *     &lt;enumeration value="\u0422\u043e\u0440\u04332\u0422\u0438\u0442\u0443\u043b\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0445\u0421\u0432\u0435\u0434\u0435\u043d\u0438\u0439\u041f\u043e\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0430\u043c\u041f\u0440\u0438\u0435\u043c\u043a\u0438"/>
 *     &lt;enumeration value="\u0422\u043e\u0440\u04332\u0422\u0438\u0442\u0443\u043b\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044f"/>
 *     &lt;enumeration value="\u0410\u043a\u0442\u0422\u0438\u0442\u0443\u043b\u0417\u0430\u043a\u0430\u0437\u0447\u0438\u043a\u0430"/>
 *     &lt;enumeration value="\u0410\u043a\u0442\u0422\u0438\u0442\u0443\u043b\u0418\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044f"/>
 *     &lt;enumeration value="\u041a\u0421-11"/>
 *     &lt;enumeration value="\u041a\u0421-2"/>
 *     &lt;enumeration value="\u041a\u0421-3"/>
 *     &lt;enumeration value="\u0412\u0435\u0434\u043e\u043c\u043e\u0441\u0442\u044c"/>
 *     &lt;enumeration value="Document\u041e\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0435\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432\u0420\u0430\u0431\u043e\u0442\u0418\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="Document\u041e\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0435\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432\u0420\u0430\u0431\u043e\u0442\u0417\u0430\u043a\u0430\u0437\u0447\u0438\u043a"/>
 *     &lt;enumeration value="Document\u041e\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0435\u0422\u043e\u0432\u0430\u0440\u043e\u0432\u041f\u0440\u0438\u0422\u043e\u0440\u0433\u043e\u0432\u044b\u0445\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\u0445\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"/>
 *     &lt;enumeration value="Document\u041e\u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0435\u0422\u043e\u0432\u0430\u0440\u043e\u0432\u041f\u0440\u0438\u0422\u043e\u0440\u0433\u043e\u0432\u044b\u0445\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\u0445\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="\u0421\u0427\u0424"/>
 *     &lt;enumeration value="\u0421\u0427\u0424\u0414\u041e\u041f\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"/>
 *     &lt;enumeration value="\u0421\u0427\u0424\u0414\u041e\u041f\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u0430\u044f"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446\u0410\u043a\u0442"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u0430\u044f"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c\u0410\u043a\u0442"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"/>
 *     &lt;enumeration value="\u0414\u041e\u041f\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0421\u0427\u0424"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0421\u0427\u0424\u0414\u0418\u0421\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0421\u0427\u0424\u0414\u0418\u0421\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u0430\u044f"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446\u0410\u043a\u0442"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c\u041d\u0430\u043a\u043b\u0430\u0434\u043d\u0430\u044f"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c\u0410\u043a\u0442"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446"/>
 *     &lt;enumeration value="\u041a\u043e\u0440\u0414\u0418\u0421\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c"/>
 *     &lt;enumeration value="\u0421\u0447\u0435\u0442"/>
 *     &lt;enumeration value="\u0421\u0442\u0440\u0443\u043a\u0442\u0443\u0440\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0435\u0414\u0430\u043d\u043d\u044b\u0435"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ТипДокумента", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("Неформализованный")
    Unformalized("Unformalized"),
    @XmlEnumValue("ОтказПодписи")
    SignatureRefusal("SignatureRefusal"),
    @XmlEnumValue("ТН")
    TN("TNN"),
    @XmlEnumValue("ТТН")
    TTN("TTN"),
    @XmlEnumValue("Акт")
    Act("Act"),
    @XmlEnumValue("АктСверки")
    ReconciliationAct("ReconciliationAct"),
    @XmlEnumValue("ПлатПоруч")
    OrderFee("OrderFee"),
    @XmlEnumValue("Договор")
    Contract("Contract"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("SF")
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
    @XmlEnumValue("SCF")
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
