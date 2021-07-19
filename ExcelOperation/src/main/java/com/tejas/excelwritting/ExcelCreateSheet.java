package com.tejas.excelwritting;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateSheet {
	
	private String sheetname;
	private String workbookname;
	private Workbook workbook;
	private static org.apache.poi.ss.usermodel.Sheet sheet1;
	
	public ExcelCreateSheet(String workbookname,String sheetname)
	{
		System.out.println("This is excel sheet creation inside a workbook");
		this.sheetname=sheetname;
		this.workbookname=workbookname;
	}
	
	
	public org.apache.poi.ss.usermodel.Sheet createSheet()
	{
		System.out.println("Workbookname is "+this.workbookname);
	    this.workbook= new ExcelCreation(new XSSFWorkbook(), this.workbookname).createWorkbook();
		this.sheet1 = workbook.createSheet(sheetname);
		return sheet1;
	}


	
	public Workbook workbookreturn()
	{
		return this.workbook;
	}
	
	

	

	
}
