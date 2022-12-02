package org.testblog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTestBlog {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(long secs) {
	   driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void selectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	

}
