package org.dataproviderss;

import java.util.Date;

import org.locatorrr.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Facebook2 extends BaseClass {

	@BeforeClass
	private static void beforeClass() {
		browserLaunch("chrome");
		maximize();
		implicitWait(10);
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Start time......"+d);
        System.out.println("Before");
	}
	
	@AfterClass
	private static void afterClass() {
		quit();
		System.out.println("After Class");
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("End time......"+d);
        System.out.println("After");
	}
	

	@Test
	public void test1() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		LoginPage l=new LoginPage();
		sendKeys(l.getTxtusername(), "User");
		sendKeys(l.getTxtpassword(), "Pass");
		click(l.getBtnlogin());
		Thread.sleep(3000);
		System.out.println("Test 2");				
	}
	
	
	
	
}
