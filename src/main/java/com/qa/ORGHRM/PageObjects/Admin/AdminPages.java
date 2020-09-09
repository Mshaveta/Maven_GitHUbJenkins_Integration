package com.qa.ORGHRM.PageObjects.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ORGHRM.PageObjects.HomePage;
import com.qa.ORGHRM.PageObjects.Admin.Users.UserMgmtPage;

public class AdminPages extends HomePage {
	/*Add user*/
	private By addUserBtn = By.id("btnAdd");

	public AdminPages(WebDriver driver) {
		super(driver);

	}

	public UserMgmtPage clickaddUserBtn() {
		getElement(addUserBtn).click();
		return new UserMgmtPage(driver);
	}

}
