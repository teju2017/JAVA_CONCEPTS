package com.tejas.excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.eventusermodel.XSSFBReader.SheetIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AcceptExcel {
	
	public final static Logger logaccept = Logger.getLogger(AcceptExcel.class);
	
	
	private String ExcelName;
	
	public AcceptExcel()
	{
		 System.out.println("AcceptExcel method");
	}
	
	
	public void parameterCheck(String[] param)
	{
		if(param.length!=1)
		{
			System.out.println("Please pass the excel name as parameter");
			logaccept.info("Please pass the excel name as parameter");
			System.exit(1);
		}
		setExcelName(param[0]);
	}


	/**
	 * @return the excelName
	 */
	public String getExcelName() {
		return ExcelName;
	}


	/**
	 * @param excelName the excelName to set
	 */
	public void setExcelName(String excelName) {
		ExcelName = excelName;
	}
	
	
	public void readExcel() throws IOException
	{
		FileInputStream file = new FileInputStream(new File(ExcelName));
		 
        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        logaccept.info("Excel file "+ExcelName+" contains "+workbook.getNumberOfSheets()+" sheets ");
        
        int y = workbook.getNumberOfSheets();
        
       Iterator<Sheet> sheetiterator = workbook.sheetIterator();
       
       while(sheetiterator.hasNext())
       {
    	   Sheet sheet = sheetiterator.next();
    	   logaccept.info("Sheet name is "+sheet.getSheetName());
    	   readSheet(sheet);
       }
        

	}
	
	
	public void readSheet(Sheet sheet)
	{
		 DataFormatter dataFormatter = new DataFormatter();
		Iterator<Row> rowiterator = sheet.rowIterator();
		while (rowiterator.hasNext())
		{
			Row row = rowiterator.next();
			Iterator<Cell> celliterator = row.cellIterator();
			String celllist="==>";
			while(celliterator.hasNext())
			{
		        String cellvalue = dataFormatter.formatCellValue(celliterator.next());
		        celllist=celllist+"|"+cellvalue;
			}
			if(celllist.contains("|"))
			{
			    System.out.println("Cell value is "+celllist);
			}
		}
		
		}
	}
