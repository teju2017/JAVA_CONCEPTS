package com.tejas.testing;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StraightTest {

	public static void main(String args[])
	{
		Workbook wb = new XSSFWorkbook();
		CreationHelper createHelper = wb.getCreationHelper();
		org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");
		// Create a row and put some cells in it. Rows are 0 based.
		Row row = sheet.createRow(1);
		// Create a cell and put a value in it.
		Cell cell = row.createCell(1);
		cell.setCellValue(1);
		// Or do it on one line.
		row.createCell(1).setCellValue(1.2);
		row.createCell(2).setCellValue(
		     createHelper.createRichTextString("This is a string"));
		row.createCell(3).setCellValue(true);
		// Write the output to a file
		try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
		    wb.write(fileOut);
		}
		catch(Exception ae)
		{
			System.out.println("working exception");
		}
	}
	
}
