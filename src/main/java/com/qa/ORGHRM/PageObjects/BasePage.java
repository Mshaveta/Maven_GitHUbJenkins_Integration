package com.qa.ORGHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
 

abstract public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		 
	}
		

	public String pageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public WebElement getElement(By locator) {
		WebElement elm = driver.findElement(locator);
		return elm;
		 
	}
	
	 

}
