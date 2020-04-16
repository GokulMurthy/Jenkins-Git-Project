package com.indigo.constantvalues;


import com.indigo.utility.ReadWriteExcel;

public class TestData 

{
	
	public final String sheetPath = "C:\\Users\\gokul\\Desktop\\Selenium\\TestData\\IndigoData.xlsx";
	public final String sheetName = "TestData";
	public final String testScenarioSheet= "TestScenario"; 
	
	public final int runMOde = 2;
	public final int status = 3;
	
	public final String Pass = "PASS";
	public final String fail = "FAIL";
	public final String Skip = "SKIP";
	
	ReadWriteExcel rw = new ReadWriteExcel();
	
	public final String browserName = rw.readExcel(sheetPath, sheetName, 0, 1);
	public final String URL = rw.readExcel(sheetPath, sheetName, 1, 1);
	public final String deptCity = rw.readExcel(sheetPath, sheetName, 2, 1);
	public final String destCity = rw.readExcel(sheetPath, sheetName, 3, 1);
	public final String month = rw.readExcel(sheetPath, sheetName, 4, 1);
	public final String year = rw.readExcel(sheetPath, sheetName, 5, 1);
	public final String date = rw.readExcel(sheetPath, sheetName, 6, 1);
	
	
}
