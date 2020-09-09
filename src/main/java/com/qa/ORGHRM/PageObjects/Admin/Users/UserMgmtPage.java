package com.qa.ORGHRM.PageObjects.Admin.Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ORGHRM.PageObjects.Admin.AdminPages;

public class UserMgmtPage extends AdminPages {

	By usernameTxtFld = By.id("systemUser_userName");

	public UserMgmtPage(WebDriver driver) {
		super(driver);

	}

	public void addUser() {
		getElement(usernameTxtFld).sendKeys("testuser");
	}
	
	

}
