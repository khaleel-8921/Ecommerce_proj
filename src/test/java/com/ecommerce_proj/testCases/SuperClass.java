package com.ecommerce_proj.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ecommerce_proj.utilities.Readconfig;

public class SuperClass {

	Readconfig con = new Readconfig();

	public String baseURL = con.getApplicationURL();
	public String username = con.getusername();
	public String password = con.getpassword();
	public static WebDriver driver;

	public static Logger Logger;

	@BeforeClass
	@Parameters("browser")
	  public void setup(String br) {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		Logger = Logger.getLogger("ecommerce_proj");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",con.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
//		else if(br.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver",con.getfirefoxpath());
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		}
		
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",con.getInternetExplorer());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	
	}

	@AfterClass
	public void Teardown() {
		driver.quit();
	}

}
