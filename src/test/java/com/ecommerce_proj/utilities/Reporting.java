package com.ecommerce_proj.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting extends TestListenerAdapter {

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;

	public void onstart(ITestContext testcontext) {
		String timestamp = new SimpleDateFormat("YYYY.MM.DD.HH.MM.SS").format(new Date());
		String repName = "Test-Report-" + timestamp + ".html";
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + repName);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Host name","local host");
		extent.set
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
