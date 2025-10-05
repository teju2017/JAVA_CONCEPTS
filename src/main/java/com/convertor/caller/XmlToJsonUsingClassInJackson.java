package com.convertor.caller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.manual.coded.AdditionalCosts;
import com.manual.coded.RealEstates;

public class XmlToJsonUsingClassInJackson {
	

	  
	  public byte[] getFileBytes(String fileName) {
	        try
	        {
	        	
	        	return FileUtils.readFileToByteArray(new File(getClass().getClassLoader().getResource(fileName).getFile()));
	        	
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	        
	    }	  

	public static void main(String[] args) throws IOException {
		XmlToJsonUsingClassInJackson obj = new XmlToJsonUsingClassInJackson();
		XmlMapper xmlMapper = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		  RealEstates realestate =
		  xmlMapper.readValue(obj.getFileBytes("Testing.xml"),
		  RealEstates.class);
		  
		  String json =
		  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(realestate);
		  System.out.println(json);
		 

		
		  com.model.codeGenerator.RealEstates realestate1 = xmlMapper.readValue(obj.getFileBytes("Testing.xml"),
		  com.model.codeGenerator.RealEstates.class); String jsonAutomated =
		  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(realestate1);
		  System.out.println("############ JSON AUTOMATED #####################");
		  System.out.println(jsonAutomated);
		 

	}

}
