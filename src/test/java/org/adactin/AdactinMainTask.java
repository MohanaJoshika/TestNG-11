package org.adactin;

import javax.net.ssl.HostnameVerifier;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinMainTask extends BaseClassAdactin {

	@BeforeClass
	public void beforeClass() {
		browserLaunch();
		urlLaunch("https://adactinhotelapp.com/index.php");
		maximize();
		implicitWait(30);
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {		
	}
	
	@AfterClass
	public void afterClass() {	
	}
	
	@Test
	public void TestA() {
		System.out.println("Login Started");
		AdactinLogin Login= new AdactinLogin();
		sendKeys(Login.getUsername(), "MohanaKarthik");
		sendKeys(Login.getPassword(), "J56I70");
		click(Login.getLogin());
		System.out.println("Login Completed");
}
	@Test
	public void TestB() {
		System.out.println("Hotel Searching Inprogress");
		SearchHotel sear= new SearchHotel();
		selectByIndex(sear.getLocations(), 6);
		selectByIndex(sear.getHotels(), 2);
		selectByIndex(sear.getRoomType(), 3);
		selectByIndex(sear.getRoomNos(), 2);
		sendKeys(sear.getFromDate(), "25/06/1995");
		sendKeys(sear.getToDate(), "22/07/1995");
		selectByIndex(sear.getAdultsSelect(), 2);
		selectByIndex(sear.getChildSelect(), 2);
		click(sear.getSearchBtn());
		System.out.println("Hotel Searching Completed");

	}
}
