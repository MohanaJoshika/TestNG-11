package org.testblog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnlyTestBlog extends BaseClassTestBlog {

	public OnlyTestBlog() {
		PageFactory.initElements(driver, this);
	}	
	public void firstName(String fname, String value) {
	sendKeys(driver.findElement(By.xpath(fname)), value);
	}	
	public void lastName(String lname, String value1) {
	sendKeys(driver.findElement(By.xpath(lname)), value1);
	}	
	public void hiddenName(String hidden, String hiddenvalue) {
	sendKeys(driver.findElement(By.xpath(hidden)), hiddenvalue);
	}
	@FindBy(xpath="//input[@name='vehicle'][3]")
	private WebElement vehicle;
	
	@FindBy(xpath="//input[@name='vehicle'][2]")
	private WebElement car;
	
	@FindBy(xpath="//input[@name='gender'][2]")
	private WebElement gender;
	
	@FindBy(tagName="select")
	private WebElement country;
	
	@FindBy(xpath="//input[@value='->']")
	private WebElement moveBtn;
	
	@FindBy(xpath="//button[@onclick='myFunction()']")
	private WebElement confirmAlert;
	
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	
	public WebElement getVehicle() {
		vehicle.click();
		return vehicle;
	}
	
	public WebElement getGender() {
		gender.click();
		return gender;
	}
	
	public WebElement getCar() {
		car.click();
		return car;
	}
	
	public WebElement getMoveBtn() {
		return moveBtn;
	}
	
	public WebElement getConfirmAlert() {
		return confirmAlert;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void getCountry() {
		WebElement country = driver.findElement(By.name("FromLB"));
		Select s=new Select(country);
		List<WebElement> ct = s.getOptions();
		for (int i = 0; i < ct.size(); i++) {
			if (ct.get(i).getText().toLowerCase().contains("s")) {
				selectByIndex(country, i);
			}		
		}
		click(moveBtn);
	}
	
	}

