package com.tejas.testing;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tejas.excelwritting.ExcelCreateSheet;
import com.tejas.excelwritting.ExcelCreation;
import com.tejas.excelwritting.ExcelRowCreation;
import com.tejas.excelwritting.WrittingContents;

public class TestExcelCreation {
	
	public static void main(String args[]) throws Exception
	{
		ExcelRowCreation excelrowobj = new ExcelRowCreation(12,"FirstWorkbook.xlsx","First_sheet_1");
		Row row = excelrowobj.createrows();
		//Cell cell=excelrowobj.createrows().createCell(100);
			 Cell cell= row.createCell(5);
		     cell.setCellValue("WORKING WELL");
		Workbook val = excelrowobj.getobjexcel().workbookreturn();
		OutputStream oost = new FileOutputStream("FirstWorkbook.xlsx");
		WrittingContents workobj = new WrittingContents();
		workobj.writecontents(val,oost,"FirstWorkbook.xlsx");
		System.out.println("Sheet and rows are created");
		
	}

}
