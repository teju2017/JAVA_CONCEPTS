package com.tejas.testSample.connectivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Connectivity {
	
	private Logger log = LoggerFactory.getLogger(Connectivity.class);
	
	public void connectSomeWhere()
	{
		log.debug("Starting to connect the information");
		log.info("Connection information");
		for(int i =0;i<10000;i++)
		{
			log.info("Inputting the value is "+i);
		}
	}

}
