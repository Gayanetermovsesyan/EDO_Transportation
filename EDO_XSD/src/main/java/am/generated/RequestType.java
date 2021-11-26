
package am.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="\u0417\u0430\u043f\u0440\u043e\u0441"/>
 *     &lt;enumeration value="\u0420\u0430\u0437\u0440\u044b\u0432"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestType", namespace = "https://roseu.org/upload/iblock/fc7/logical-message-v1.xsd")
@XmlEnum
public enum RequestType {

    @XmlEnumValue("\u0417\u0430\u043f\u0440\u043e\u0441")
    \u0417\u0410\u041f\u0420\u041e\u0421("\u0417\u0430\u043f\u0440\u043e\u0441"),
    @XmlEnumValue("\u0420\u0430\u0437\u0440\u044b\u0432")
    \u0420\u0410\u0417\u0420\u042b\u0412("\u0420\u0430\u0437\u0440\u044b\u0432");
    private final String value;

    RequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType fromValue(String v) {
        for (RequestType c: RequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
