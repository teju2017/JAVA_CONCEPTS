package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LowerLev {
	
	@JacksonXmlProperty(localName="LEV1")
	private String level1;
	
	@JacksonXmlProperty(localName="LEV2")
	private String level2;
	
	
	@JacksonXmlElementWrapper(localName="LEV3")
	@JacksonXmlProperty(localName="LEV3")
	private List<LevelThree> levelThree;
	
	
	
	
	
	public List<LevelThree> getLevelThree() {
		return levelThree;
	}
	public void setLevelThree(List<LevelThree> levelThree) {
		this.levelThree = levelThree;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	
	
	
	

}
