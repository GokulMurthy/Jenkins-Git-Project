package com.indigo.utility;

import org.openqa.selenium.By;

public class LocatorSplitFunction {
	
	public static By locatorSplit(String locatorVariable)
	{
		String locatorType = locatorVariable.split(":")[0];
		String locatorValue = locatorVariable.split(":")[1];
		
		if(locatorType.equalsIgnoreCase("NAME"))
		{
			return By.name(locatorValue);
		}
		else if(locatorType.equalsIgnoreCase("ID"))
		{
			return By.id(locatorValue);
		}
		else if(locatorType.equalsIgnoreCase("XPATH"))
		{
			return By.xpath(locatorValue);
		}
		else if(locatorType.equalsIgnoreCase("CLASS"))
		{
			return By.className(locatorValue);
		}
		
		return null;
	}

}
