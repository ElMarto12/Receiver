package lt.eif.viko.mdanys.receiver;

import lt.eif.viko.mdanys.receiver.model.ObjectFactory;
import lt.eif.viko.mdanys.receiver.model.Order;
import lt.eif.viko.mdanys.receiver.util.ConvertUtil;
import lt.eif.viko.mdanys.receiver.util.JaxbUtil;
import lt.eif.viko.mdanys.receiver.util.MessageUtil;
import org.xml.sax.SAXException;

import javax.jms.JMSException;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JMSException, ParserConfigurationException, IOException, TransformerException, SAXException, JAXBException {

        //ConvertUtil.stringToXml(MessageUtil.messageReceive());
        JaxbUtil.XMLtoObject(MessageUtil.messageReceive());

    }
}