package com.tejas.excelwritting;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritting {
	
	public Logger logone = Logger.getLogger(com.tejas.excelwritting.ExcelWritting.class);
	
	public void writeExcel(List<IncidentDetails> inclist, String excelFilePath) throws Exception
	{
		Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	    sheet.autoSizeColumn(2);
	 
	    int rowCount = 0;
	    
	    
	 
	    for (IncidentDetails inc : inclist) {
	        Row row = sheet.createRow(++rowCount);
	        writeBook(inc, row,workbook);
	    }
	 
	    logone.info("Writting to the excel is in place");
	    
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	    }
	    logone.info("Creation of the excel file is successful "+excelFilePath);
	}
	


 public void writeBook(IncidentDetails inc, Row row,Workbook wb)
 {
	  logone.debug("CELL CREATION UNDERWAY");
	  Cell cell = row.createCell(1);
	  cell.setCellValue(inc.getIncidentno());
	  cellStylecreation(wb,cell);
   
	  cell=row.createCell(2);
	  cell.setCellValue(inc.getOpendt());
	  cellStylecreation(wb,cell);
	  
	  cell=row.createCell(3);
	  cell.setCellValue(inc.getClosedt());
	  cellStylecreation(wb,cell);
	  
	  cell=row.createCell(4);
	  cell.setCellValue(inc.getDesc());
	  cellStylecreation(wb,cell);
	  
	  cell= row.createCell(5);
	  cell.setCellValue(inc.getAssignedPerson());
	  cellStylecreation(wb,cell);
	  
	  
	  cell=row.createCell(6);
	  cell.setCellValue(inc.getAssignedteam());
	  cellStylecreation(wb,cell);
	  
	  cell=row.createCell(7);
	  cell.setCellValue(inc.getStatus());
	  cellStylecreation(wb,cell);
	  
	

 }
 
 public void cellStylecreation(Workbook wb,Cell cell)
 {
	 CellStyle style = wb.createCellStyle();
	  style.setBorderBottom(BorderStyle.THIN);
	  style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
	  style.setBorderLeft(BorderStyle.THIN);
	  style.setLeftBorderColor(IndexedColors.GREEN.getIndex());
	  style.setBorderRight(BorderStyle.THIN);
	  style.setRightBorderColor(IndexedColors.BLUE.getIndex());
	  style.setBorderTop(BorderStyle.MEDIUM_DASHED);
	  style.setTopBorderColor(IndexedColors.BLACK.getIndex());
	  
	  
	  
	  Font font = wb.createFont();
	  font.setFontName("Arial");
	  font.setFontHeightInPoints((short)12);
	  style.setFont(font);
	  cell.setCellStyle(style);
	  
 }
}
