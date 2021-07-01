package com.ecommerce_proj.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver ldriver;
	public Loginpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement btnLogout;

	public void Usernameclear() {
		txtEmail.clear();
	}

	public void passwordClear() {
		txtpassword.clear();
	}

	public void setUserName(String uname) {
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		txtpassword.sendKeys(pwd);

	}

	public void Login() {
		btnLogin.click();
	}

	public void Logout() {

		btnLogout.click();

	}

}
