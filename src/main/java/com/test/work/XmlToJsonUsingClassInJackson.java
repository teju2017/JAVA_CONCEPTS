package com.test.work;

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
import com.test.modelCheck.AdditionalCosts;
import com.test.modelCheck.RealEstates;

public class XmlToJsonUsingClassInJackson {
	
	
	  public InputStreamReader readTextFile() {
	        try (
	        	InputStream is = getClass().getClassLoader().getResourceAsStream("myFile.txt");
	            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
	            BufferedReader br = new BufferedReader(isr)) {

				/*
				 * // Read the file line-by-line String line; while ((line = br.readLine()) !=
				 * null) { System.out.println(line); }
				 */
	        	return isr;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	        
	    }

	public static void main(String[] args) throws IOException {
		XmlMapper xmlMapper = new XmlMapper();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		  RealEstates realestate =
		  xmlMapper.readValue(FileUtils.readFileToByteArray(new File("Testing.xml")),
		  RealEstates.class);
		  
		  String json =
		  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(realestate);
		  System.out.println(json);
		 

		
		  com.model.codeGenerator.RealEstates realestate1 = xmlMapper.readValue(
		  FileUtils.readFileToByteArray(new File("Testing.xml")),
		  com.model.codeGenerator.RealEstates.class); String jsonAutomated =
		  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(realestate1);
		  System.out.println("############ JSON AUTOMATED #####################");
		  System.out.println(jsonAutomated);
		 

	}

}
