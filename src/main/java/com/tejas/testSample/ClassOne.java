package com.tejas.testSample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassOne {
	private static Logger log = LoggerFactory.getLogger(ClassOne.class);
	
	public void checkClassValue()
	{
		log.info("Inside the method");
		log.debug("Debugging the values");
	}

}
