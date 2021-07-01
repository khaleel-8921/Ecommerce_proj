package com.ecommerce_proj.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {

		File src = new File("./configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getusername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getchromepath() {
	 String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
		
	/*
	 * public String getfirefoxpath() { String firefox=
	 * pro.getProperty("firefoxpath"); return firefox;
	 * 
	 * }
	 */
				public String getInternetExplorer() {
					 String IE= pro.getProperty("iepath");
						return IE;
	}

}
