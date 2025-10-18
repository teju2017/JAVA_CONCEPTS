package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


public class Instances {
	
	@JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Instance")
	private List<Instance> listOfIns;

	public List<Instance> getListOfInstance() {
		return listOfIns;
	}

	public void setListOfInstance(List<Instance> listOfInstance) {
		this.listOfIns = listOfInstance;
	}
	
	
	
	

}
