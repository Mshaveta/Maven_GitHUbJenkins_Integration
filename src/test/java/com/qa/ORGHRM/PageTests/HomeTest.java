package com.qa.ORGHRM.PageTests;

import org.testng.Assert;

import com.qa.ORGHRM.PageObjects.HomePage;
import com.qa.ORGHRM.PageObjects.Admin.AdminPages;
import com.qa.ORGHRM.PageObjects.Admin.Users.UserMgmtPage;

import utility.PropertiesFileReader;

public class HomeTest extends BaseTest {
	HomePage hp;
//	@Test
//	public void verifyLogout() {
//		String username = PropertiesFileReader.getConfigProp("username");
//		String password = PropertiesFileReader.getConfigProp("password");
//		System.out.println("Login Page-" + loginPage);
//		hp = loginPage.doValidLogin(username, password);
//
//		String expDashbrdText = "Dashboard";
//		String actDashbrdText = hp.getDashBoradHeading();
//		//Assertion
//		Assert.assertEquals(actDashbrdText, expDashbrdText);
//		
//		 
//	}
	
	public void VerifyAddUser() {
		String username = PropertiesFileReader.getConfigProp("username");
		String password = PropertiesFileReader.getConfigProp("password");
		System.out.println("Login Page-" + loginPage);
		hp = loginPage.doValidLogin(username, password);

		String expDashbrdText = "Dashboard";
		String actDashbrdText = hp.getDashBoradHeading();
		//Assertion
		Assert.assertEquals(actDashbrdText, expDashbrdText);
		
		//click on admin link
		AdminPages adminPage = hp.clickAdminLink();
		UserMgmtPage userPage = adminPage.clickaddUserBtn();
		userPage.addUser();
		
	}

}
