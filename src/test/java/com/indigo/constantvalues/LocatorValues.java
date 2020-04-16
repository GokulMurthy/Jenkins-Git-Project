package com.indigo.constantvalues;

public class LocatorValues {

	public String departureCity = "NAME:or-src";
	public String destinationCity = "NAME:or-dest";
	public String departureDate = "XPATH://*[@id=\"bookFlightTab\"]/form/div[3]/div[2]/div[1]/div/input";
	public String returnDate = "NAME:or-return";
	public String nextButton = "XPATH://*[contains(@id,'15')]/div/div[2]/div/a";
	public String monthReturn = "XPATH://*[contains(@id,'15')]/div/div[1]/div/div/span[1]";
	public String yearReturn = "XPATH://div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//span[@class='ui-datepicker-year'][contains(text(),'2020')]";
	public String table = "XPATH://div[@class='ui-datepicker-group ui-datepicker-group-last']//tr";
	public String searchFlightButton = "XPATH://*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button/span[1]";
	public String price = "XPATH://*[@id=\"bookingWidgetContainer\"]/div/div/div/div[2]/div[2]/div/div[3]/div/div[1]/span";

}
