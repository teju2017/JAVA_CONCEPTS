package com.tejas.excelwritting;

import java.util.Date;

public class IncidentDetails {
	
	
	private String incidentno;
	private String desc;
	private String assignedteam;
	private String assignedPerson;
	private Date opendt;
	private Date closedt;
	private String status;
	
	
	public IncidentDetails(String incidentno, String desc, String assignedteam, String assignedPerson, Date opendt,
			Date closedt, String status) {
		super();
		this.incidentno = incidentno;
		this.desc = desc;
		this.assignedteam = assignedteam;
		this.assignedPerson = assignedPerson;
		this.opendt = opendt;
		this.closedt = closedt;
		this.status = status;
	}


	/**
	 * @return the incidentno
	 */
	public String getIncidentno() {
		return incidentno;
	}


	/**
	 * @param incidentno the incidentno to set
	 */
	public void setIncidentno(String incidentno) {
		this.incidentno = incidentno;
	}


	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}


	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}


	/**
	 * @return the assignedteam
	 */
	public String getAssignedteam() {
		return assignedteam;
	}


	/**
	 * @param assignedteam the assignedteam to set
	 */
	public void setAssignedteam(String assignedteam) {
		this.assignedteam = assignedteam;
	}


	/**
	 * @return the assignedPerson
	 */
	public String getAssignedPerson() {
		return assignedPerson;
	}


	/**
	 * @param assignedPerson the assignedPerson to set
	 */
	public void setAssignedPerson(String assignedPerson) {
		this.assignedPerson = assignedPerson;
	}


	/**
	 * @return the opendt
	 */
	public Date getOpendt() {
		return opendt;
	}


	/**
	 * @param opendt the opendt to set
	 */
	public void setOpendt(Date opendt) {
		this.opendt = opendt;
	}


	/**
	 * @return the closedt
	 */
	public Date getClosedt() {
		return closedt;
	}


	/**
	 * @param closedt the closedt to set
	 */
	public void setClosedt(Date closedt) {
		this.closedt = closedt;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
