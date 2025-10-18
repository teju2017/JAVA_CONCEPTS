package com.manual.coded;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LevelThree {
	
	@JacksonXmlProperty(localName="low1")
	private String low1;
	
	@JacksonXmlProperty(localName="low2")
	private String low2;
	
	
	public String getLow1() {
		return low1;
	}
	public void setLow1(String low1) {
		this.low1 = low1;
	}
	public String getLow2() {
		return low2;
	}
	public void setLow2(String low2) {
		this.low2 = low2;
	}
	public LevelThree(String low1, String low2) {
		super();
		this.low1 = low1;
		this.low2 = low2;
	}
	
	public LevelThree()
	{
		
	}
	
	
	
	

}
