package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Take1 {
	
	

	@JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Take2")	
	private List<Take2> take2;

	public List<Take2> getTake2() {
		return take2;
	}

	public void setTake2(List<Take2> take2) {
		this.take2 = take2;
	}
	
	

}
