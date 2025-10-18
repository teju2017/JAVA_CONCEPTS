package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MinuteDetails {
	

	@JacksonXmlProperty(localName="LEV1")
	private String Lev1;
	@JacksonXmlProperty(localName="LEV2")
	private String Lev2;
	@JacksonXmlElementWrapper(localName="LEVS")
	@JacksonXmlProperty(localName="LEV3")
	private List<LevelThree> Lev3;
	public String getLev1() {
		return Lev1;
	}
	public void setLev1(String lev1) {
		Lev1 = lev1;
	}
	public String getLev2() {
		return Lev2;
	}
	public void setLev2(String lev2) {
		Lev2 = lev2;
	}
	public List<LevelThree> getLev3() {
		return Lev3;
	}
	public void setLev3(List<LevelThree> lev3) {
		Lev3 = lev3;
	}
	
	
	
	

}
