package com.indigo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
	
	
	public FileInputStream fis;
	public FileOutputStream fos;
	public XSSFWorkbook wb;
	public XSSFSheet ws;
	public XSSFCell cell;
	String cellValue;
		
	public String readExcel(String filePath, String sheetName, int rowNum, int cellnum)
	{
		File fil = new File(filePath);
		try {
			fis = new FileInputStream(fil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ws = wb.getSheet(sheetName);
		cell = ws.getRow(rowNum).getCell(cellnum);
		
		DataFormatter df = new DataFormatter();
		return cellValue = df.formatCellValue(cell);
		
	}
	
	public void writeExcel(String filePath, String sheetName, int rowNum, int cellnum, String testStatus)
	
	{
		File fil = new File(filePath);
		try {
			fis= new FileInputStream(fil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ws = wb.getSheet(sheetName);
		
		cell = ws.getRow(rowNum).createCell(cellnum);
		
		cell.setCellValue(testStatus);
		
		try {
			fos = new FileOutputStream(fil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
