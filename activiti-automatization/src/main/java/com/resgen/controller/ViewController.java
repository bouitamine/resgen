package com.resgen.controller;

import java.lang.invoke.MethodHandles;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resgen.BscsService;
import com.resgen.entity.Mpusptab;
import com.resgen.model.Generate;

public class ViewController {
	
	@RestController
	public static class MyRestController {
		
	    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

		@Autowired
		private BscsService bscsService;
		
		
		@PostMapping(consumes = "application/json",  produces = "application/json", value = "/api/resgen/generate")
		public String generate(@RequestBody Generate generate) throws JAXBException {
			logger.info("Empieza la generacíon"); 
			logger.info(generate.toString());
			// Traduccion 
			if (null != generate.getTarrif().getShdes() && !generate.getTarrif().getShdes().isEmpty()) {
				Mpusptab mpusptab = bscsService.traduccion(generate.getTarrif().getShdes().toString());		
				logger.info("El resultado de la traduccion es SHDES" +" : "+  mpusptab.getSHDES() +" AND SPCODE :" + mpusptab.getSPCODE() );  
			// Enviar mensaje MQ a BSCS
				bscsService.EnviarJmsBscs(generate, mpusptab);
				 return "El resultado de la traduccion es SHDES" +" : "+  mpusptab.getSHDES() +" AND SPCODE :" + mpusptab.getSPCODE();
			} else {
				 return "No se puede ralizar la traducción";
			}
			
		}
		
		
		@RequestMapping(value = "/api/resgen/clean", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	    public String clean(){
			logger.info("Empieza la limpieza");
	    	System.out.println("limpiar el recurso");
	    	 return "limpiar el recurso";
		}
		
		 @RequestMapping("/api/resgen/sendMessage/{id}")
		    public String indexProduct(@PathVariable String id){
//			 bscsService.sendMessage(id);
		        return "redirect:/product/show/"+id;
		    }
		 
		 @RequestMapping(value = "/api/resgen/sendMessageTibcoUAT3", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		    public String sendTibcoJmsUAT3(){
			 bscsService.sendMessageToTibcoUAT3();
		        return "sendTibcoJMS to UAT3";
		    }
		 
		 @RequestMapping(value = "/api/resgen/sendMessageTibcoUAT", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		    public String sendTibcoJmsUAT(){
			 bscsService.sendMessageToTibcoUAT();
		        return "sendTibcoJMS to UAT";
		    }
		 
		 @RequestMapping(value = "/api/resgen/sendMessageActiveMQ", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
		    public String sendActiveMQ(){
			 bscsService.sendMessageActiveMQ();;
		        return "send JMS to ActiveMQ";
		    }
	}

}
