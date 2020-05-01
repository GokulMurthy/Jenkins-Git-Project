package com.indigo.mainscript;

import org.testng.Assert;
import org.testng.annotations.*;

import com.indigo.constantvalues.TestData;
import com.indigo.testcases.TestTwo;
import com.indigo.utility.ActionKeywords;
import com.indigo.utility.ReadWriteExcel;

public class TestOne {
	
	

	public static boolean bValue;
	ReadWriteExcel rw = new ReadWriteExcel();
	ActionKeywords act = new ActionKeywords();
	TestData td = new TestData();
	TestTwo tc01 = new TestTwo();

	@Test
	public void flightPrice_1() {

		if (rw.readExcel(td.sheetPath, td.testScenarioSheet, 1, td.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc01.tco1();
			if (bValue == true) {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.Pass);
			} else if (bValue == false) {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.fail);
			} else {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.Skip);
			}

		}

	}
	
	@Test
	public void flightPrice_2() {

		if (rw.readExcel(td.sheetPath, td.testScenarioSheet, 1, td.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc01.tco2();
			if (bValue == true) {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.Pass);
			} else if (bValue == false) {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.fail);
			} else {
				rw.writeExcel(td.sheetPath, td.testScenarioSheet, 1, td.status, td.Skip);
			}

		}

	}
	
	@Test(enabled=false)
	public void Testtwo()
	{
		System.out.println("Test Two Method");
	}

	@AfterMethod
	public void tearDown() {

		act.CloseBrowser();
	}

}
