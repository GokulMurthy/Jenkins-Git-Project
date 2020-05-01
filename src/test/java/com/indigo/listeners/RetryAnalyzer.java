package com.indigo.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	public int count = 0;
	public int retry=3;
	
	public boolean retry(ITestResult result) {
		
		if(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}

}
