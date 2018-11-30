//package com.resgen.listener;
//
//import java.util.Map;
//
//import javax.jms.Message;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
///**
// * This is the queue listener class, its receiveMessage() method ios invoked with the
// * message as the parameter.
// */
//@Component
//public class MessageListener {
//
////    private ProductRepository productRepository;
//
//    private static final Logger log = LogManager.getLogger(MessageListener.class);
//
////    public MessageListener(Message message) {
////        this.productRepository = productRepository;
////    }
//
//    /**
//     * This method is invoked whenever any new message is put in the queue.
//     * @param message
//     */
//    @JmsListener(destination = "RESMAN.COLA.IN", containerFactory = "jmsFactory")
//    public void receiveMessage(Map<String, String> message) {
//        log.info("Received <" + message + ">");
////        Long id = Long.valueOf(message.get("id"));
//        log.info("Message processed...");
//    }
//}