package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {
	
	@JacksonXmlProperty(localName="NAME")
	private String name;
	
    @JacksonXmlProperty(localName="REGION")
	private String region;
    
    @JacksonXmlProperty(localName="TESTED")
    private String tested;
    
    @JacksonXmlElementWrapper(localName="SubInstances")
    @JacksonXmlProperty(localName="SubInstance")
    private List<SubInstance> subInstances;
    
    
    
 	
	public List<SubInstance> getSubInstances() {
		return subInstances;
	}
	public void setSubInstances(List<SubInstance> subInstances) {
		this.subInstances = subInstances;
	}
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
