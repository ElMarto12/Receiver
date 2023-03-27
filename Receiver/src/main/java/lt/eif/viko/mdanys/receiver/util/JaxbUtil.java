package lt.eif.viko.mdanys.receiver.util;

import javax.xml.bind.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;

import lt.eif.viko.mdanys.receiver.model.Order;

public class JaxbUtil {
    public static void XMLtoObject(String message) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Order.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        String xmlContent = message;

        StringReader reader = new StringReader(xmlContent);
        Order order = (Order) unmarshaller.unmarshal(reader);
        System.out.println(order);
    }
}