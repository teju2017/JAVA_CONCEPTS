package com.tejas.excelwritting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelRowCreation {
	
	private int noofrows;
	private String workbookname;
	private String sheetname;
	private ExcelCreateSheet excelsheet;
	
	public ExcelRowCreation(int noofrows,String workbookname,String sheetname)
	{
		this.noofrows=noofrows;
		this.workbookname=workbookname;
		this.sheetname=sheetname;
	}
	
	
	public Row createrows() 
	{
		 System.out.println("No of rows are "+noofrows);
		 this.excelsheet = new ExcelCreateSheet(this.workbookname, this.sheetname);
		 Row row = excelsheet.createSheet().createRow(noofrows);
		 System.out.println("No of rows created ");
		 //System.out.println("Size of row is "+row.getPhysicalNumberOfCells());
	     return row;
	}
	
	public ExcelCreateSheet getobjexcel()
	{
		return this.excelsheet;
	}
	


}
