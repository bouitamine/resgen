package com.resgen;

import javax.xml.bind.JAXBException;

import com.resgen.entity.Mpusptab;
import com.resgen.model.Generate;
import com.resgen.model.Resource;

public interface BscsService {

	void insertResource(Resource resource);
	void deleteResource(Resource resource);
	Mpusptab traduccion(String shdes);
	void EnviarJmsBscs(Generate generate, Mpusptab mpusptab) throws JAXBException;
	void sendMessage(String id);
	void sendMessage1(String id);
//	void sendMessageToTibcoEMS();
	void sendMessageToTibcoUAT3();
	void sendMessageToTibcoUAT();
	
}
