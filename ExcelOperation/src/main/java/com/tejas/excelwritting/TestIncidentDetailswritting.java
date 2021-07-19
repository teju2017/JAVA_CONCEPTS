package com.tejas.excelwritting;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class TestIncidentDetailswritting {
	
	public final static Logger log = Logger.getLogger(TestIncidentDetailswritting.class);
	private List<IncidentDetails> inclist;
	
	public TestIncidentDetailswritting()
	{
		this.inclist=new ArrayList<IncidentDetails>();
	}
	
	//com.tejas.excelPojo.TestIncidentDetailswritting
	
	public List<IncidentDetails> populate()
	{
		
		 log.info("Population of the list is underway");
	     inclist.add(new IncidentDetails("123", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("1234", "abc down", "infra team","sdsfds",new Date(),new Date(), "Resolved"));
	     inclist.add(new IncidentDetails("1235", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("1236", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("1237", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("1238", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("1239", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("12312", "abc down", "infra team","sdsfds",new Date(),new Date(), "Closed"));
	     inclist.add(new IncidentDetails("12312", "abc down", "infra team","sdsfds",new Date(),new Date(), "Open"));
	     log.warn("Manual way of creating the logs");
	     log.info("Population of the list completed");
	     return this.inclist;
	}
	
	public static void main(String args[]) throws Exception
	{
		
		TestIncidentDetailswritting testobj = new TestIncidentDetailswritting();
		ExcelWritting excwrite = new ExcelWritting();
		excwrite.writeExcel(testobj.populate(), "Incident.xlsx");
	}
	
	
	

}
