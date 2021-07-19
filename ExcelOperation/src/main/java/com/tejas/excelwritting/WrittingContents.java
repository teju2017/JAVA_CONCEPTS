package com.tejas.excelwritting;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;

public class WrittingContents {

	public void writecontents(Workbook workbook,OutputStream oos,String name) throws Exception
	{
		oos = new FileOutputStream(name);
		workbook.write(oos);
	}
	
}
