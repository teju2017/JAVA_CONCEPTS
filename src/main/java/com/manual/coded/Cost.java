package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Cost {
	
	@JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "AdditionalCosts")
	private List<AdditionalCosts> additionalCosts;
    


	public List<AdditionalCosts> getAdditionalCosts() {
		return additionalCosts;
	}

	public void setAdditionalCosts(List<AdditionalCosts> additionalCosts) {
		this.additionalCosts = additionalCosts;
	}
	
	

}
