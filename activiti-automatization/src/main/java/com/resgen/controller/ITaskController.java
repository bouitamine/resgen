//package com.resgen.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.resgen.model.Generate;
//import com.resgen.model.Mpusptab;
//import com.resgen.service.BscsService;
//
//@RestController
//public class ITaskController {
//
//	private BscsService bscsService;
//	
//	@Autowired
//	public void setBscsService (BscsService bscsService) { this.bscsService = bscsService; }
//	
//	@PostMapping(consumes = "application/json",  produces = "application/json", value = "/api/resgen/generate")
//	public String generate(@RequestBody Generate generate) {
//		Mpusptab mpusptab = bscsService.traduccion(generate.getTarrif().getShdes());
//		System.out.println(mpusptab.getSHDES() +"///" + mpusptab.getSHDES() );
//		 return mpusptab.getSHDES() +"///" + mpusptab.getSHDES() ;
//		
//	}
//	
//	@RequestMapping(value = "/api/resgen/clean", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
//    public String clean(){
//    	System.out.println("limpiar el recurso");
//    	 return "limpiar el recurso";
//	}
//
////	public Mpusptab generar(Generate generate) {
////
////		if (isValid(generate)) {
////			return traducirBSCS(generate.getTarrif().getShdes());
////		} else
////			return null;
////	}
////
////	private boolean isValid(Generate generate) {
////
////		// TODO Imlementar la validacion de datos de entrada
////		//throw new ValidationException("El msisdn cumple el formato");
////		return true;
////	}
////	
////	private Mpusptab traducirBSCS (String shdes_voz) {
////		return bscsService.traduccion(shdes_voz);
////		
////
////	}
//
//}
