package com.tejas.excelReader;

public class ExcelReading {
	
	
	public static void main(String args[]) throws Exception
	{
	    AcceptExcel acceptobj = new AcceptExcel();
	    acceptobj.parameterCheck(args);
	    acceptobj.readExcel();
			
	}
	
	
	

}
