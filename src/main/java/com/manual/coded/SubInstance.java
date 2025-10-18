package com.manual.coded;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SubInstance {

	@JacksonXmlProperty(localName = "branchName")
	private String branchName;

	@JacksonXmlProperty(localName = "branchId")
	private String branchId;
	
	
	
	@JacksonXmlProperty(localName="MINUTEDETAILS")
	private MinuteDetails minuteDetails;
	
	
	

	public MinuteDetails getMinuteDetails() {
		return minuteDetails;
	}

	public void setMinuteDetails(MinuteDetails minuteDetails) {
		this.minuteDetails = minuteDetails;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

}
