package com.ecommerce_proj.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ecommerce_proj.pageObject.Loginpage;

@Test
public class TC_LoginTest_001 extends SuperClass {
	public void LoginTest() throws InterruptedException {
		driver.get(baseURL);
		Logger.info("URL ENTERED....");
		Loginpage lp = new Loginpage(driver);

		lp.Usernameclear();
		Logger.info("username cleared...");
		lp.passwordClear();
		Logger.info("password cleared...");

		lp.setUserName(username);
		Logger.info("Entered username...");

		lp.setPassword(password);
		Logger.info("Entered password....");

		lp.Login();
		Logger.info("Loggedin...");

		Thread.sleep(5000);
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Assert.assertTrue(true);
			lp.Logout();
			Logger.info("Loggedout...");

		}

	}

}
