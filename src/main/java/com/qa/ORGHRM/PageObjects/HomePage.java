package com.qa.ORGHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ORGHRM.PageObjects.Admin.AdminPages;

public class HomePage extends BasePage {

	/////////////////////// Start Locators////////////////////////
	private By welcomeLink = By.id("welcome");
	private By logOutLink = By.partialLinkText("Logout");
	private By dashBoardText = By.xpath("//h1[text()='Dashboard']");

	/* Admin link */
	private By adminLink = By.id("menu_admin_viewAdminModule");

	//////////////////// end Locators **////////////////

	/////////////////////////// Get Locator Elements ///////////////////////
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getWelcomeLink() {
		return getElement(welcomeLink);
	}

	public WebElement getLogoutLink() {
		return getElement(logOutLink);
	}

	public WebElement getdashBoardText() {
		return getElement(dashBoardText);
	}

	public WebElement getAdminlink() {
		return getElement(adminLink);
	}

	/////////////////////////// End Get Locator Elements ///////////////////////

	///////////////////////////// function to perform actions //////////////////
	public LoginPage doLogOut() {
		getWelcomeLink().click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getLogoutLink().click();
		return new LoginPage(driver);
	}

	public String getDashBoradHeading() {
		return getdashBoardText().getText();
	}

	/* click on Admin Link */
	public AdminPages clickAdminLink() {
		getAdminlink().click();
		return new AdminPages(driver);
	}
}
