package org.dataproviderss;

import java.util.Date;

import javax.xml.crypto.Data;

import org.locatorrr.LoginPage;
import org.pages.Registration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Facebook extends BaseClass {

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
	

	@Test(dataProvider="login", dataProviderClass=Datas.class)
	public void test2(String user,String pass) throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		LoginPage l=new LoginPage();
		sendKeys(l.getTxtusername(), user);
		sendKeys(l.getTxtpassword(), pass);
		click(l.getBtnlogin());
		Thread.sleep(3000);
		System.out.println("Test 2");				
	}
	
	
	@Test(dataProvider="reg", dataProviderClass=Data.class)
	public void test3(String fname, String lname) {
		urlLaunch("https://www.facebook.com/");
		Registration r=new Registration();
		click(r.getBtnCreate());
		sendKeys(r.getTxtFirstname(), fname);
		sendKeys(r.getTxtLastname(), lname);
		sendKeys(r.getTxtMobile(), "12345678");
		click(r.getBtnsignup());
		System.out.println("Test 3");
	}
	
	

	@Test(enabled=false)
	public void test1() {
		System.out.println("Test 1");

	}
	
}
