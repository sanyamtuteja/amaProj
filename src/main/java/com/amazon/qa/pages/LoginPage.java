package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Hello. Sign in')]")
	WebElement Hellobtn;
	
	@FindBy(xpath = ".//span[@class='nav-action-inner']")
	WebElement SignInBtn;

	@FindBy(id = "ap_email")
	WebElement username;

	@FindBy(id = "continue")
	WebElement contBtn;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement loginBtn;

	@FindBy(id = " createAccountSubmit")
	WebElement signUpBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public HomePage validateLogin(String un, String pw){
		
		Hellobtn.click();
		//SignInBtn.click();
		username.sendKeys(un);
		contBtn.click();
		password.sendKeys(pw);
		loginBtn.click();
		
		return new HomePage();
	}

}

