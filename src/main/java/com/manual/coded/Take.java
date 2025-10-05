package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Take {
	
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName="Take1")
	private List<Take1> take1;

	public List<Take1> getTake1() {
		return take1;
	}

	public void setTake1(List<Take1> take1) {
		this.take1 = take1;
	}
	
	

}
