package com.manual.coded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {
	
	@JacksonXmlProperty(localName="NAME")
	private String name;
	
    @JacksonXmlProperty(localName="REGION")
	private String region;
    
    @JacksonXmlProperty(localName="TESTED")
    private String tested;
    
    
	
	public String getTested() {
		return tested;
	}
	public void setTested(String tested) {
		this.tested = tested;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	

}
