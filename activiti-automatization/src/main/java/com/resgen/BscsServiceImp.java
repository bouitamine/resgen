package com.resgen;

import java.io.StringWriter;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.resgen.dao.MpusptabDao;
import com.resgen.entity.Mpusptab;
import com.resgen.jms.XMLPeticionBSCS_CUSTOMER;
import com.resgen.model.Generate;
import com.resgen.model.Resource;

@EnableJms
@Service
@ImportResource({"classpath*:MessageServiceTest-context.xml"})
public class BscsServiceImp implements BscsService {
	
	private static final String EMPRESA = "EMPRESA";
	private static final String AUTONOMO = "AUTONOMO";
	private static final String AUTONOMO_SOHO = "AUTONOMO/SOHO";
	private static final String RESIDENCIAL = "RESIDENCIAL";
	private static final String POSTEMPB = "POSTEMPB";
	private static final String POSTRESD = "POSTRESD";
	private static final String POSTAUT = "POSTAUT";
	private static final String SPACE = "";
	private static final String QUEUE_BSCS_CUSTOMER_INT = "BSCS-CUSTOMER_INT";
	private static final String ACTIVE_MQ_LOCAL_QUEUE = "RESGEN.COLA.OUT";
	
	
	
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Autowired  
	BscsDao bscsDao;
	@Autowired  
	MpusptabDao mpusptabDao;
	
	@Autowired
	private Environment env;
	
	@Autowired
	@Qualifier("connect1")
	private JmsTemplate jmsTemplate1;

	@Autowired
	@Qualifier("connect2")
	private JmsTemplate jmsTemplate2;	
	
	@Autowired
	@Qualifier("connect3")
	private JmsTemplate jmsTemplate3;
	
	@Autowired
	private Queue queue;
	
	  @Override
    public void sendMessage1(String id) {
    Map<String, String> actionmap = new HashMap<>();
    actionmap.put("id", id);
    logger.info("Sending the index request through queue message");
    jmsTemplate1.convertAndSend(queue, actionmap);
	}
	  
  @Override
    public void sendMessage(String message) {
    Map<String, String> actionmap = new HashMap<>();
    actionmap.put("id", message);
    logger.info("Sending the index request through queue message");
    jmsTemplate2.convertAndSend(ACTIVE_MQ_LOCAL_QUEUE, actionmap);
	}
	  
  
	@Override
	public void sendMessageActiveMQ() {
		jmsTemplate3.send(queue, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createTextMessage("Mensaje JMS enviado a la cola ActiveMQ de de salida de RESGEN ");
				message.setJMSCorrelationID("01101987");
				return message;
			}
		});
	}
  
	@Override
	public void insertResource(Resource resource) {
		bscsDao.insertResource(resource);
		
	}

	@Override
	public void deleteResource(Resource resource) {
		bscsDao.deleteResource(resource);
		
	} 
	
	@Override
	public Mpusptab traduccion(String shdes) {
		 return mpusptabDao.dataTraduction(shdes);
	} 
	
	@Override
	public void sendMessageToTibcoUAT3() {
		jmsTemplate1.send("ORANGE.MOVILES.UAT.JMS.026099.REQUEST", new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createTextMessage("Mensaje JMS para la prueba de conexion con UAT3 desde la API ResGen desplagada en el Servidor GRC");
				message.setJMSCorrelationID("01101987");
				return message;
			}
		});
	}
	
	@Override
	public void sendMessageToTibcoUAT() {
		jmsTemplate2.send("ORANGE.MOVILES.UAT.JMS.026099.REQUEST", new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createTextMessage("Mensaje JMS para la prueba de conexion con UAT desde la API ResGen desplagada en el Servidor GRC");
				message.setJMSCorrelationID("01101987");
				return message;
			}
		});
	}
	
	@Override
	public void EnviarJmsBscs(Generate generate, Mpusptab mpusptab) throws JAXBException {
		
		final String ColaBscsCustomer = env.getProperty(QUEUE_BSCS_CUSTOMER_INT);
	
		logger.info("Empieza la la peticion JMS a BSCS"); 
		final XMLPeticionBSCS_CUSTOMER xmlPeticionBSCS;
		// Preparacion previa de datos
		preparacionPrevia(generate);
        // Componer el mensaje JMS que se envia a la cola de BSCS 
		xmlPeticionBSCS = componerDatosBSC(generate, mpusptab);
    	// Visualizar el mensage 
		JAXBContext jaxbContext = JAXBContext.newInstance(XMLPeticionBSCS_CUSTOMER.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(xmlPeticionBSCS, sw);
		String xmlString = sw.toString();
		logger.info("El mensaje JMS a BSCS es : "+ xmlString); 
		// Convert to map
//		 ObjectMapper oMapper = new ObjectMapper();
//		 Map<String, Object> map = oMapper.convertValue(xmlPeticionBSCS, Map.class);
		// Enviar el XML
//		jmsTemplate.convertAndSend(ACTIVE_MQ_LOCAL_QUEUE, map);
		
//		jmsTemplate.convertAndSend("jms://Colas_cima_UAT3::queue_ORANGE.MOVILES.UAT.JMS.026097.REQUEST::queue_ORANGE.MOVILES.UAT.JMS.026097.REPLY", map, m -> {
		jmsTemplate1.convertAndSend("ORANGE.MOVILES.UAT.JMS.026099.REQUEST", xmlPeticionBSCS, m -> {

		 logger.info("setting standard JMS headers before sending");
            m.setJMSCorrelationID("01101987");
            return m;
        });
		
		
		
	} 
	
	private void preparacionPrevia(Generate generate){
		
		if (null != generate.getCustomer().getPRGCODE() && generate.getCustomer().getPRGCODE().toString().toUpperCase().equals(EMPRESA)) {
			generate.getCustomer().setPRGCODEString(POSTEMPB);
			generate.getCustomer().setCustomerSubtype(AUTONOMO_SOHO);
			generate.getCustomer().setCustomerType(EMPRESA);
		} else if (null != generate.getCustomer().getPRGCODE() && generate.getCustomer().getPRGCODE().toString().toUpperCase().equals(AUTONOMO)) {
			generate.getCustomer().setPRGCODEString(POSTAUT);
			generate.getCustomer().setCustomerSubtype(AUTONOMO_SOHO);
			generate.getCustomer().setCustomerType(EMPRESA);
		} else {
			generate.getCustomer().setPRGCODEString(POSTRESD);
			generate.getCustomer().setCustomerSubtype(SPACE);
			generate.getCustomer().setCustomerType(RESIDENCIAL);
		}
	}
	
	private XMLPeticionBSCS_CUSTOMER componerDatosBSC(Generate generate, Mpusptab mpusptab){
	
		
		final XMLPeticionBSCS_CUSTOMER xmlPeticionBSCS = new XMLPeticionBSCS_CUSTOMER();
		
		// IDCuentaSIEBEL
		 SimpleDateFormat date = new SimpleDateFormat("ddHHmmssDD");
		 System.out.println(date.format(new Date()));
		xmlPeticionBSCS.setIDCuentaSIEBEL(date.format(new Date()).toString());
		// MSISDN
		xmlPeticionBSCS.setMSISDN(generate.getResource().getMsisdn());
		// TipoDocumento
		xmlPeticionBSCS.setTipoDocumento(generate. getCustomer().getTypeIdNumber().toString());
		// NumeroDocumento
		xmlPeticionBSCS.setNumeroDocumento(generate.getCustomer().getIdNumber());
		
		// DatosCliente
		List<XMLPeticionBSCS_CUSTOMER.DatosCliente> listaDatosClientes = new ArrayList<XMLPeticionBSCS_CUSTOMER.DatosCliente>();
		XMLPeticionBSCS_CUSTOMER.DatosCliente datosCliente = new XMLPeticionBSCS_CUSTOMER.DatosCliente();
       // DatosCliente 1
		datosCliente.setNombre("ReasonCode");
		datosCliente.setValor("10");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 2
		datosCliente.setNombre("Prgcode");
		datosCliente.setValor(generate.getCustomer().getPRGCODE().toString());
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 3
		datosCliente.setNombre("CustomerType");
		datosCliente.setValor(generate.getCustomer().getCustomerType());
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 4
		datosCliente.setNombre("CustomerSubtype");
		datosCliente.setValor(generate.getCustomer().getCustomerSubtype());
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 5
		datosCliente.setNombre("ServiceType");
		datosCliente.setValor("POSPAGO");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 6
		datosCliente.setNombre("Company");
		datosCliente.setValor("ORANGE");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 7
		datosCliente.setNombre("Tratamiento");
		datosCliente.setValor("ESTANDAR");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 8
		datosCliente.setNombre("Costcenter");
		datosCliente.setValor("92");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 9
		datosCliente.setNombre("WelcomeProc");
		datosCliente.setValor("1");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 10
		datosCliente.setNombre("MonthlyBill");
		datosCliente.setValor("On-line.");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 11
		datosCliente.setNombre("PaymentTerm");
		datosCliente.setValor("1");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 12
		datosCliente.setNombre("Birthdate");
		datosCliente.setValor("19790101");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 13
		datosCliente.setNombre("Sex");
		datosCliente.setValor("Male");
		listaDatosClientes.add(datosCliente);
		 // DatosCliente 14
		datosCliente.setNombre("CustNationality");
		datosCliente.setValor("Spain");
		listaDatosClientes.add(datosCliente);
		
		// Setear el listado de datos cliente al mensaje XML
		xmlPeticionBSCS.getDatosCliente().addAll(listaDatosClientes);
		
		// ContactoCliente
		List<XMLPeticionBSCS_CUSTOMER.ContactoCliente> listaContactoClientes = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente>();
		XMLPeticionBSCS_CUSTOMER.ContactoCliente contactoCliente = new XMLPeticionBSCS_CUSTOMER.ContactoCliente();
		List<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos> listaAtributos = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos>();
		XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos atributo = new XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos();
		
		// ContactoCliente 1
		contactoCliente.setTipo("U");
		// Atributo 1
		atributo.setNombre("Title");
		atributo.setNombre("");
		listaAtributos.add(atributo);
		// Atributo 2
		atributo.setNombre("LastName");
		atributo.setNombre(generate.getCustomer().getLastname());
		listaAtributos.add(atributo);
		// Atributo 3
		atributo.setNombre("LastName");
		atributo.setNombre(generate.getCustomer().getLastname());
		listaAtributos.add(atributo);
		// Atributo 4
		atributo.setNombre("StreetType");
		atributo.setNombre("AVENIDA");
		listaAtributos.add(atributo);
		// Atributo 5
		atributo.setNombre("Street");
		atributo.setNombre("GRECIA");	
		listaAtributos.add(atributo);
		// Atributo 6
		SimpleDateFormat date1 = new SimpleDateFormat("ss");
		atributo.setNombre("StreetNum");
		atributo.setNombre(date1.format(new Date()).toString());
		listaAtributos.add(atributo);
		// Atributo 7
		atributo.setNombre("AddNote1");
		atributo.setNombre("2");	
		listaAtributos.add(atributo);
		// Atributo 8
		atributo.setNombre("AddNote3");
		atributo.setNombre("B");	
		listaAtributos.add(atributo);
		// Atributo 9
		atributo.setNombre("Zip");
		atributo.setNombre("41012");	
		listaAtributos.add(atributo);
		// Atributo 10
		atributo.setNombre("City");
		atributo.setNombre("SEVILLA");
		listaAtributos.add(atributo);
		// Atributo 10
		atributo.setNombre("Country");
		atributo.setNombre("Spain");	
		listaAtributos.add(atributo);
		// Atributo 11
		atributo.setNombre("Language");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 12
		atributo.setNombre("Job");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 13
		atributo.setNombre("PrivPhone1");
		atributo.setNombre("615123673");
		listaAtributos.add(atributo);
		// Atributo 14
		atributo.setNombre("PrivPhone2");
		atributo.setNombre("922225149");
		listaAtributos.add(atributo);
		// Atributo 15
		atributo.setNombre("Fax");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 16
		atributo.setNombre("Email");
		atributo.setNombre("aa@prueba.com");
		listaAtributos.add(atributo);
		// Atributo 17
		atributo.setNombre("ShortMess");
		atributo.setNombre(generate.getCustomer().getIdNumber());
		listaAtributos.add(atributo);
		// Atributo 18
		atributo.setNombre("FlagNorm");
		atributo.setNombre("Standard");	
		listaAtributos.add(atributo);
		
		contactoCliente.getAtributos().addAll(listaAtributos);
		// setear el primer ContactoCliente
		listaContactoClientes.add(contactoCliente);
 		
		
       // Reseteamos las listas
		listaContactoClientes = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente>();
	    listaAtributos = new ArrayList<XMLPeticionBSCS_CUSTOMER.ContactoCliente.Atributos>();
		
		
		// ContactoCliente 1
		contactoCliente.setTipo("B");
		// Atributo 1
		atributo.setNombre("Title");
		atributo.setNombre("");
		listaAtributos.add(atributo);
		// Atributo 2
		atributo.setNombre("LastName");
		atributo.setNombre(generate.getCustomer().getLastname());
		listaAtributos.add(atributo);
		// Atributo 3
		atributo.setNombre("LastName");
		atributo.setNombre(generate.getCustomer().getLastname());
		listaAtributos.add(atributo);
		// Atributo 4
		atributo.setNombre("StreetType");
		atributo.setNombre("AVENIDA");
		listaAtributos.add(atributo);
		// Atributo 5
		atributo.setNombre("Street");
		atributo.setNombre("GRECIA");	
		listaAtributos.add(atributo);
		// Atributo 6
		atributo.setNombre("StreetNum");
		atributo.setNombre(date1.format(new Date()).toString());
		listaAtributos.add(atributo);
		// Atributo 7
		atributo.setNombre("AddNote1");
		atributo.setNombre("2");	
		listaAtributos.add(atributo);
		// Atributo 8
		atributo.setNombre("AddNote3");
		atributo.setNombre("B");	
		listaAtributos.add(atributo);
		// Atributo 9
		atributo.setNombre("Zip");
		atributo.setNombre("41012");	
		listaAtributos.add(atributo);
		// Atributo 10
		atributo.setNombre("City");
		atributo.setNombre("SEVILLA");
		listaAtributos.add(atributo);
		// Atributo 10
		atributo.setNombre("Country");
		atributo.setNombre("Spain");	
		listaAtributos.add(atributo);
		// Atributo 11
		atributo.setNombre("Language");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 12
		atributo.setNombre("Job");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 13
		atributo.setNombre("PrivPhone1");
		atributo.setNombre("615123673");
		listaAtributos.add(atributo);
		// Atributo 14
		atributo.setNombre("PrivPhone2");
		atributo.setNombre("922225149");
		listaAtributos.add(atributo);
		// Atributo 15
		atributo.setNombre("Fax");
		atributo.setNombre("");	
		listaAtributos.add(atributo);
		// Atributo 16
		atributo.setNombre("Email");
		atributo.setNombre("aa@prueba.com");
		listaAtributos.add(atributo);
		// Atributo 17
		atributo.setNombre("ShortMess");
		atributo.setNombre(generate.getCustomer().getIdNumber());
		listaAtributos.add(atributo);
		// Atributo 18
		atributo.setNombre("FlagNorm");
		atributo.setNombre("Standard");	
		listaAtributos.add(atributo);
		
		contactoCliente.getAtributos().addAll(listaAtributos);
		// setear el segundo ContactoCliente
		listaContactoClientes.add(contactoCliente);
		
		
		// Setear el listado de datos cliente al mensaje XML
		xmlPeticionBSCS.getContactoCliente().addAll(listaContactoClientes);
		
		
		
		// DatosAdicionales
		List<XMLPeticionBSCS_CUSTOMER.DatosAdicionales> listaDatosAdicionales = new ArrayList<XMLPeticionBSCS_CUSTOMER.DatosAdicionales>();
		XMLPeticionBSCS_CUSTOMER.DatosAdicionales datosAdicionales = new XMLPeticionBSCS_CUSTOMER.DatosAdicionales();
		
       // DatosAdicionales 1
		datosAdicionales.setNombre("IC_DESCUENTO_C&amp;amp;amp;A");
		datosAdicionales.setValor("Not Applicable");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 2
		datosAdicionales.setNombre("IC_NO_PUBLI_TERCEROS");
		datosAdicionales.setValor("Y");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 3
		datosAdicionales.setNombre("IC_NO_PUBLICIDAD_ORANGE");
	    datosAdicionales.setValor("Y");
	    listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 4
		datosAdicionales.setNombre("IC_NO_DATOS_FIN_COMERCIAL");
		datosAdicionales.setValor("Y");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 5
		datosAdicionales.setNombre("IC_CLIENTES_GUIAS");
		datosAdicionales.setValor("Y");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 6
		datosAdicionales.setNombre("IC_SERVICIO_112");
		datosAdicionales.setValor("Y");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 7
		datosAdicionales.setNombre("IC_CTA_BANCO_NORMALIZADA");
		datosAdicionales.setValor("SI");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 8
		datosAdicionales.setNombre("IC_TIPO_MERCADO");
		datosAdicionales.setValor("Masivo");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 9
		datosAdicionales.setNombre("IC_INFO_RIESGO_CLIENTE");
		datosAdicionales.setValor("0");
		listaDatosAdicionales.add(datosAdicionales);
		// DatosAdicionales 10
		datosAdicionales.setNombre("IC_CNOE");
		datosAdicionales.setValor("ublic Servant");
		listaDatosAdicionales.add(datosAdicionales);
		
		// Setear el listado de datos adicionales al mensaje XML
		xmlPeticionBSCS.getDatosAdicionales().addAll(listaDatosAdicionales);
		
		return xmlPeticionBSCS;
		
	}

	

}
