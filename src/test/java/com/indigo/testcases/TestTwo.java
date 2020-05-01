package com.indigo.testcases;

import org.testng.Assert;

import com.indigo.constantvalues.TestData;
import com.indigo.mainscript.TestOne;
import com.indigo.pages.HomePage;
import com.indigo.pages.SelectFlightPage;
import com.indigo.utility.ActionKeywords;

public class TestTwo {

	ActionKeywords act = new ActionKeywords();
	TestData td = new TestData();
	HomePage hp = new HomePage();
	SelectFlightPage sf = new SelectFlightPage();
	String priceValue;

	public void tco1() {
		try {
			act.openBrowser(td.browserName);
			act.OpenURL(td.URL);
//		hp.scrollDown();
			hp.enterDepartureCity();
			hp.enterDestinationCity();
			hp.enterDepartureDate();
			hp.clickReturnDateField();
			hp.clickNextButtonUntil();
//		hp.scrollDown();
			hp.selectReturnDate();
			hp.searchFlight();
			priceValue = sf.displayFlightPrice();
		} catch (Exception e) {
			TestOne.bValue = false;
			e.printStackTrace();
		}

		Assert.assertEquals(priceValue, "₹1,966");

	}
	
	public void tco2() {
		try {
			act.openBrowser(td.browserName);
			act.OpenURL(td.URL);
//		hp.scrollDown();
			hp.enterDepartureCity();
			hp.enterDestinationCity();
			hp.enterDepartureDate();
			hp.clickReturnDateField();
			hp.clickNextButtonUntil();
//		hp.scrollDown();
			hp.selectReturnDate();
			hp.searchFlight();
			priceValue = sf.displayFlightPrice();
		} catch (Exception e) {
			TestOne.bValue = false;
			e.printStackTrace();
		}

		Assert.assertEquals(priceValue, "₹1,967");

	}

}
