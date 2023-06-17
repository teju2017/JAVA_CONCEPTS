package com.tejas.testSample;

import java.net.ConnectException;

import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tejas.testSample.connectivity.CheckerCreation;
import com.tejas.testSample.connectivity.Connectivity;


public class WorkingExample {
	
 private static org.slf4j.Logger log = LoggerFactory.getLogger(WorkingExample.class);
	
	public static void main(String[] args)
	{
		System.out.println("Its a test ");
       log.info("Working ok");
       log.debug("Its a debugging information");
      Connectivity con = new Connectivity();
      con.connectSomeWhere();
      CheckerCreation.checkSomeValue();
      System.exit(0);
	}

}
