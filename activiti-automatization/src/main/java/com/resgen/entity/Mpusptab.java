package com.resgen.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mpusptab {
	
	
	@Id
	private String SPCODE;
	private String DES;
	private String SHDES;
	private String SPTYPE;
	private String REC_VERSION;
	public String getSPCODE() {
		return SPCODE;
	}
	public void setSPCODE(String sPCODE) {
		SPCODE = sPCODE;
	}
	public String getDES() {
		return DES;
	}
	public void setDES(String dES) {
		DES = dES;
	}
	public String getSHDES() {
		return SHDES;
	}
	public void setSHDES(String sHDES) {
		SHDES = sHDES;
	}
	public String getSPTYPE() {
		return SPTYPE;
	}
	public void setSPTYPE(String sPTYPE) {
		SPTYPE = sPTYPE;
	}
	public String getREC_VERSION() {
		return REC_VERSION;
	}
	public void setREC_VERSION(String rEC_VERSION) {
		REC_VERSION = rEC_VERSION;
	}
	
	
	
	
	
	
	}
