package com.resgen.config;

import javax.jms.JMSException;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.core.JmsTemplate;

import com.tibco.tibjms.TibjmsConnectionFactory;

@Configuration
public class Config {

    @Value("${tibco.UAT3.server-url}")
    private String UAT3serverUrl;
    
    @Value("${tibco.UAT.server-url}")
    private String UATserverUrl;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("RESGEN.QUEUE.IN");
    }

//    @Bean
//    public ActiveMQConnectionFactory activeMQConnectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
//        factory.setBrokerURL(brokerUrl);
//        return factory;
//    }
    
    @Primary
    @Bean
    public TibjmsConnectionFactory tibjmsConnectionFactoryUAT3() throws JMSException {
    	TibjmsConnectionFactory factory = new TibjmsConnectionFactory();
        factory.setServerUrl(UAT3serverUrl);
        factory.setUserName("cimaems");
        factory.setUserPassword("cimaems");
        return factory;
    }
    
    @Bean
    public TibjmsConnectionFactory tibjmsConnectionFactoryUAT() throws JMSException {
    	TibjmsConnectionFactory factory = new TibjmsConnectionFactory();
        factory.setServerUrl(UATserverUrl);
        factory.setUserName("cimaems");
        factory.setUserPassword("cimaems");
        return factory;
    }

    
    @Bean(name = "connect1")
    public JmsTemplate jmsTemplate1() throws JMSException {
        return new JmsTemplate(tibjmsConnectionFactoryUAT3());
    }
    
    @Bean(name = "connect2")
    public JmsTemplate jmsTemplate2() throws JMSException {
        return new JmsTemplate(tibjmsConnectionFactoryUAT());
    }
}