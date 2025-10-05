package com.manual.coded;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Junk {
	
    @JacksonXmlProperty(localName="Junkx")
	private String Junkx;
	
    @JacksonXmlProperty(localName="Junkx1")
	private String Junkx1;

	public String getJunkx() {
		return Junkx;
	}

	public void setJunkx(String junkx) {
		Junkx = junkx;
	}

	public String getJunkx1() {
		return Junkx1;
	}

	public void setJunkx1(String junkx1) {
		Junkx1 = junkx1;
	}
	
	
	
	

}
