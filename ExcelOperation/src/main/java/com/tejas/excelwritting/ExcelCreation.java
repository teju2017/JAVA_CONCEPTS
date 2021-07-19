package com.tejas.excelwritting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreation {
	
	private Workbook workbook;
	private String name;
	
	public ExcelCreation(XSSFWorkbook xsfworkbook,String name)
	{
		System.out.println("ExcelCreation class");
		workbook=xsfworkbook;
		this.name=name;
		System.out.println("name of the workbook is "+this.name);
	}
	
	public Workbook getworkbook()
	{
	    return workbook;
	    
	}
	
	public Workbook createWorkbook()
	{
		try
		{
			OutputStream fileout= new FileOutputStream(this.name);
			if(workbook == null  || fileout == null)
			{
				System.out.println("workbook is null");
				System.exit(1);
			}
		
			//workbook.write(fileout);
			//fileout.close();
         //return workbook;
			
		}
		catch(Exception ae)
		{
			System.out.println("We are hitting the exception when creating the excelbook "+ae.getMessage());
			System.exit(1);
		}
		return workbook;
	}

}
