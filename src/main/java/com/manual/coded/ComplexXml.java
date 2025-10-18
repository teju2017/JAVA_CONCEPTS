package com.manual.coded;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="RealEstate")
public class ComplexXml {
	

	
    @JsonProperty("Cost")
	private Cost cost;
	private int externalId;
	private String ttitle;
	private Date creationDate;
	private Date lastModificationDate;
	private double thermalCharacteristic;
	private String energyConsumptionContainsWarmWater;
	private String buildingEnergyRatingType;
	private double additionalArea;
	private String numberOfFloors;
	@JacksonXmlElementWrapper(localName="Junk")
	private Junk junk;
	@JsonProperty("Take")
	private Take take;
	@JsonProperty("Instances")
	private Instances instance;
	
	
	
	
	
	

	public Instances getInstance() {
		return instance;
	}

	public void setInstance(Instances instance) {
		this.instance = instance;
	}

	public Take getTake() {
		return take;
	}

	public void setTake(Take take) {
		this.take = take;
	}

	public Junk getJunk() {
		return junk;
	}

	public void setJunk(Junk junk) {
		this.junk = junk;
	}

	public int getexternalId() {
		return this.externalId;
	}

	public void setexternalId(int externalId) {
		this.externalId = externalId;
	}

	

	public String getttitle() {
		return this.ttitle;
	}

	public void setttitle(String ttitle) {
		this.ttitle = ttitle;
	}

	

	public Date getcreationDate() {
		return this.creationDate;
	}

	public void setcreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getlastModificationDate() {
		return this.lastModificationDate;
	}

	public void setlastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}



	public double getthermalCharacteristic() {
		return this.thermalCharacteristic;
	}

	public void setthermalCharacteristic(double thermalCharacteristic) {
		this.thermalCharacteristic = thermalCharacteristic;
	}

	

	public String getenergyConsumptionContainsWarmWater() {
		return this.energyConsumptionContainsWarmWater;
	}

	public void setenergyConsumptionContainsWarmWater(String energyConsumptionContainsWarmWater) {
		this.energyConsumptionContainsWarmWater = energyConsumptionContainsWarmWater;
	}



	public String getbuildingEnergyRatingType() {
		return this.buildingEnergyRatingType;
	}

	public void setbuildingEnergyRatingType(String buildingEnergyRatingType) {
		this.buildingEnergyRatingType = buildingEnergyRatingType;
	}



	public double getadditionalArea() {
		return this.additionalArea;
	}

	public void setadditionalArea(double additionalArea) {
		this.additionalArea = additionalArea;
	}


	public String getnumberOfFloors() {
		return this.numberOfFloors;
	}

	public void setnumberOfFloors(String numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	

	/*
	 * public Cost getadditionalCosts() { return this.cost; }
	 * 
	 * public void setadditionalCosts(Cost additionalCosts) { this.cost =
	 * additionalCosts; }
	 */
	
	
	
	

	

}
