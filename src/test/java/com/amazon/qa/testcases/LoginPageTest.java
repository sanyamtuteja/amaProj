package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {

		super();
	}

	@BeforeMethod
	public void seUp() {

		initialize();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void testLoginPageTitle() {
		String actualTitle = loginpage.validateLoginPageTitle();

		System.out.println("Title of the page is:" + actualTitle);

		// Assert.assertEquals(title, actualTitle);
	}

	@Test(priority =2
			)
	public void testLogin() {
		homepage = loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
