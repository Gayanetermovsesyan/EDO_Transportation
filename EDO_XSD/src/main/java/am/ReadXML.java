package am;

import am.team.Message;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class ReadXML {
    public static void main(String[] args) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<Сообщение xmlns=\"https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd\" \n" +
                "Отправитель=\"sdfs@dfsd\" Получатель=\"sdfsdf@2342\" ИдПодразделенияПолучателя=\"1234\" \n" +
                "ДатаОтправки=\"2011-01-01T12:23:21Z\">\n" +
                " <Документ ИдДокумента=\"02345678901234567890123456789012\" ИмяФайла=\"doc.txt\" \n" +
                "ТипДокумента=\"Неформализованный\" ОжидаетсяПодписьПолучателя=\"true\" Зашифрован=\"true\">\n" +
                " <КДокументу>12345678901234567890123456789012</КДокументу>\n" +
                " <ИдВнутренний>InternalID</ИдВнутренний>\n" +
                " <ИдСделки>12-12-2011-140</ИдСделки>\n" +
                " <Номер>140</Номер>\n" +
                " <Дата>2011-12-12</Дата>\n" +
                " <Сумма>123.4</Сумма>\n" +
                " <СуммаНДС>123.45</СуммаНДС>\n" +
                " <ДополнительныеДанные>\n" +
                " <ДополнительныйПараметр Название=\"key1\" Значение=\"value1\" />\n" +
                " </ДополнительныеДанные>\n" +
                " </Документ>\n" +
                " <Документ ИдДокумента=\"12345678901234567890123456789013\" ИмяФайла=\"CommerceML.xml\" \n" +
                "ТипДокумента=\"СтруктурированныеДанные\" ОжидаетсяПодписьПолучателя=\"false\">\n" +
                " <КДокументу>02345678901234567890123456789012</КДокументу>\n" +
                " </Документ>\n" +
                " <ЭП ИдЭП=\"22345678901234567890123456789012\" \n" +
                "КДокументу=\"02345678901234567890123456789012\" Подписант=\"sdf@sdfsd\"/>\n" +
                "</Сообщение>";

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Message.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Message message = (Message) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(message.getDocument().get(0));
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
