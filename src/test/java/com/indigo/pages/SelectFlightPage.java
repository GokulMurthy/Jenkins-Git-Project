/**
 * 
 */
package com.indigo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indigo.constantvalues.LocatorValues;
import com.indigo.utility.ActionKeywords;

/**
 * @author gokul This Page Contains the WebElements for Select Flight Page
 *
 */
public class SelectFlightPage {

	public static WebDriver driver;
	ActionKeywords act = new ActionKeywords();
	LocatorValues locv = new LocatorValues();

	public String displayFlightPrice() throws Exception {

//		act.explicitWait(driver, 10, locv.price);
		Thread.sleep(10000);
		String priceValue = act.fetchTheValue(locv.price);
		System.out.println(priceValue);
		return priceValue;

	}

}
