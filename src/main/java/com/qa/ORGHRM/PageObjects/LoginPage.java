package com.qa.ORGHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	private By unameTxtField = By.id("txtUsername");
	private By pwdTxtField = By.id("txtPassword");
	private By loginBtn = By.xpath("//input[@id='btnLogin']");
	private By forgetpwdLink = By.partialLinkText("Forgot your password");
	
	public LoginPage(WebDriver driver) {
		super(driver); 
	}

	public WebElement getUnameTxtField() {
		//WebElement elm = driver.findelement(By.id("test"));
		WebElement username = getElement(unameTxtField);
		return username;
	}

	public WebElement getPwdTxtField() {
		return getElement(pwdTxtField);
	}
	
	public WebElement getForgetpwdLink() {
		return getElement(forgetpwdLink);
	}

//	public WebElement getLoginBtn() {
//		return getElement(loginBtn);
//	}
	
	public HomePage doValidLogin(String username, String password) {
		
		//enter username
		getUnameTxtField().sendKeys(username);
		//enter password
		getPwdTxtField().sendKeys(password);
		//click on login
		getElement(loginBtn).click();
		
		//HomePage hp = new HomePage(driver);
		//return hp;
		//or
		return new HomePage(driver);
		
	}
	
	public String getForgetPwdText() {
		return getForgetpwdLink().getText();
	}
	
	
	

}
