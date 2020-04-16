/**
 * 
 */
package com.indigo.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.indigo.constantvalues.LocatorValues;
import com.indigo.constantvalues.TestData;
import com.indigo.utility.ActionKeywords;
import com.indigo.utility.LocatorSplitFunction;

/**
 * @author gokul
 * 
 * This Class contains WebElements and Methods for HomePage
 *
 */
public class HomePage 
{
	
	LocatorValues locv = new LocatorValues();
	LocatorSplitFunction locs = new LocatorSplitFunction();
	ActionKeywords act = new ActionKeywords();
	TestData td = new TestData();
	WebDriver driver;
		
	public void scrollDown()
	{
		act.Scrolling(10, 100);
	}
	
	public void enterDepartureCity() throws Exception
	{
		
		act.Click(locv.departureCity);
		act.Click(locv.departureCity);
		
		for(int i=0; i<15; i++)
		{
			act.sendKeys(locv.departureCity, Keys.BACK_SPACE);
			
		}
		
		act.sendKeysText(locv.departureCity, td.deptCity);
		act.sendKeys(locv.departureCity, Keys.ENTER);
		Thread.sleep(4000);
		
	}
	
	public void enterDestinationCity() throws Exception
	{
		act.Click(locv.destinationCity);
		act.sendKeysText(locv.destinationCity, td.destCity);
		act.sendKeys(locv.destinationCity, Keys.ENTER);
	}
	
	public void enterDepartureDate()
	{
		act.sendKeys(locv.departureDate, Keys.TAB);
	}
	
	public void clickReturnDateField()
	{
		act.Click(locv.returnDate);
	}
	
	public void clickNextButtonUntil() throws Exception
	{
		for(int i=0; i<12; i++)
		{
			
		act.Click(locv.nextButton);
		
		if(act.fetchTheValue(locv.monthReturn).equalsIgnoreCase(td.month) && act.fetchTheValue(locv.yearReturn).equalsIgnoreCase(td.year))
		
		{
			break;
		}
		
		}
		
	}
	
	public void selectReturnDate()
	
	{
		act.handlingTables(locv.table, td.date);
		
	}
	
	public void searchFlight()
	
	{
		act.submit(locv.searchFlightButton);
	
	}
		
}
