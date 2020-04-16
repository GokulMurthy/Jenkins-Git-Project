package com.indigo.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeywords {
	
		//openBrowser
		//OpenURL
		//Click
		//sendKeys
		//selectValueFromDropdown
		//mouseHoveringWithoutClick
		//mouseHoveringwithclick
		//switchingMulipleWindows
		//switchingFrames
		//handlingTables
		//Scrolling
		//fetchTheValue
		//switchToDefault
		//CloseBrowser
		//explicitWait
		//screenShot
	
		public static WebDriver driver;
		public JavascriptExecutor jse;
	
	public WebDriver openBrowser(String bname)
	{
		if(bname.equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("FIREFOX"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		else if(bname.equalsIgnoreCase("SAFARI"))
		{
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	
	public void OpenURL(String URL)
	{
		driver.get(URL);
	}
	
	public void Click(String locatorVariable)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		element.click();
	}
	
	public void sendKeysText(String locatorVariable, String sendKeyData)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		element.sendKeys(sendKeyData);
	}
	
	public void sendKeys(String locatorVariable, Keys sendKeyData)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		element.sendKeys(sendKeyData);
	}
	
	public void selectValueFromDropdown(String locatorVariable, String selectText)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		Select sel = new Select(element);
		sel.selectByVisibleText(selectText);
	}
	
	public void mouseHoveringWithoutClick(String locatorVariable)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void mouseHoveringWithClick(String locatorVariable)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	
	public void switchingMulipleWindows(int windowNumber)
	{
		List<String> wind = new ArrayList<String>();
		wind = (List<String>)driver.getWindowHandles();
		driver.switchTo().window(wind.get(windowNumber));
	}
	
	public void switchingFrames(String frameName)
	{
		driver.switchTo().frame(frameName);
	}
	
	public void Scrolling(int i, int j)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("scroll('i,j')");
	}
	
	public String fetchTheValue(String locatorVariable)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		return element.getText();
	}
	
	public void switchToDefault()
	{
		driver.switchTo().defaultContent();
	}
	
	public void submit(String locatorVariable)
	{
		WebElement element = driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable));
		element.submit();
	}
	
	public void explicitWait(WebDriver driver, int secs, String locatorVariable)
	{
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(LocatorSplitFunction.locatorSplit(locatorVariable))));
	}
	
	public void screenShot(String fileName) throws IOException
	{
		TakesScreenshot scsh = ((TakesScreenshot)driver);
				
		File srcFile = scsh.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\gokul\\eclipse-workspace\\TestNG_Project\\screenshot\\" +"FailedScreenshot" +"_" +fileName +".jpg");
		
		FileUtils fut = new FileUtils();
		
		fut.copyFile(srcFile, destFile);
				
		
	}
	
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	public void handlingTables(String locatorVariable, String dayValue)
	{
		boolean bvalue=false;
		List<WebElement> tableRow = new ArrayList<WebElement>();
		tableRow = driver.findElements(LocatorSplitFunction.locatorSplit(locatorVariable));
		int rowCount = tableRow.size();
		
		for(int i=0; i<rowCount; i++)
		{
			if(bvalue == true)
			{
				break;
			}
			else 
			{
			
				tableRow.get(i);
				List<WebElement> tableData = new ArrayList<WebElement>();
				tableData = driver.findElements(By.tagName("td"));
				int dataCount = tableData.size();
				
				for(int j=0; j<dataCount; j++)
				{
					
					String date = tableData.get(j).getText();
					if(date.equalsIgnoreCase(dayValue))
					{
						tableData.get(j).click();
						bvalue = true;
						break;
					}
					
				}
		
			}
						
		}
		
	}
	
}
