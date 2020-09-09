package com.qa.ORGHRM.PageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ORGHRM.PageObjects.HomePage;

import utility.PropertiesFileReader;

public class LoginTest extends BaseTest {
	HomePage hp;

	@Test(enabled=false)
	public void vertifyValidLoginTest() {
		String username = PropertiesFileReader.getConfigProp("username");
		String password = PropertiesFileReader.getConfigProp("password");
		System.out.println("Login Page-" + loginPage);
		hp = loginPage.doValidLogin(username, password);

		String expDashbrdText = "Dashboard";
		String actDashbrdText = hp.getDashBoradHeading();
		//Assertion
		Assert.assertEquals(actDashbrdText, expDashbrdText);
		
	
	}
	
	@Test
	public void vertifyInValidLoginTest() {
		String username = PropertiesFileReader.getConfigProp("username");
		String password = PropertiesFileReader.getConfigProp("password");
		System.out.println("Login Page-" + loginPage);
		hp = loginPage.doValidLogin(username, password);

		String expDashbrdText = "Forgot your password?";
		String actDashbrdText = loginPage.getForgetPwdText();
		
		System.out.println("Actual text "+ actDashbrdText);
		//Assertion
		Assert.assertEquals(actDashbrdText, expDashbrdText);
		
	
	}

}
