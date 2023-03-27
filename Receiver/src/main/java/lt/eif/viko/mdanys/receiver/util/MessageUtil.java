package lt.eif.viko.mdanys.receiver.util;

import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.*;

public class MessageUtil {
    private static final String QUEUE_NAME = "XML";

    public static String messageReceive() throws JMSException{

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(QUEUE_NAME);
        MessageConsumer consumer = session.createConsumer(destination);

        Message message = consumer.receive();
        TextMessage textMessage = (TextMessage) message;

        connection.close();
        return textMessage.getText();
    }
}

