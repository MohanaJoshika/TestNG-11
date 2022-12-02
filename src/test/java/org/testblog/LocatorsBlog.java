package org.testblog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LocatorsBlog extends BaseClassTestBlog{

	
	@BeforeClass
	public void beforeClass() {
		browserLaunch();
		urlLaunch("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		maximize();
		implicitWait(3000);
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
//		driver.quit();
	}
	
	@Parameters({"fname","value","hidden","hiddenvalue"})
	@Test
	public void test1(String fname, String value, String hidden, String hiddenvalue) throws InterruptedException {
		OnlyTestBlog Test = new OnlyTestBlog();
		Thread.sleep(2000);
		Test.firstName(fname, value);
		Test.hiddenName(hidden, hiddenvalue);
		Test.getVehicle();
		Test.getCar();
		Test.getGender();
		Test.getCountry();
		click(Test.getSubmitBtn());
		
	}
}
