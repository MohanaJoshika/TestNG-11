package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends BaseClassAdactin{

	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement Username;
		
	public WebElement getUsername() {
		return Username;
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement Login;
	
	public WebElement getLogin() {
		return Login;
	}
	
	
	
}

