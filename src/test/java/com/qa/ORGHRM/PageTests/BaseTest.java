package com.qa.ORGHRM.PageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.ORGHRM.PageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import static utility.PropertiesFileReader.*;
 

public class BaseTest {
	protected WebDriver driver;
	LoginPage loginPage;
	@Test
	public void browserSetup() {
		String browser = getConfigProp("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		String appUrl = getConfigProp("appUrl");
		driver.get(appUrl);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		 
		 
	}
}
