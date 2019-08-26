package com.test.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class openBrowser {
	
	public void openBrowser1()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
		/*DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("gecko", false);  // to disable marionette, by default true
		
		WebDriver driver = new FirefoxDriver(d);*/
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
	}
	
	public static void main(String args[])
	{
		openBrowser obj = new openBrowser();
		obj.openBrowser1();
	}

}
