package com.ihubdirect;


import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;
import com.ihubmeaven.pageObjects.pageobjectfactory;



public class change_password extends baseclass  {

private static final OutputType<File> OuputType_FILE = null;

@Test
  public void tc_1() throws IOException {
	test = report.createTest("tc_1");
	driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	pageobjectfactory page = new pageobjectfactory(driver);
	page.location("hyderabad");
	page.signin();
	page.login("9666262992","Store.123");
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("Window.open()");
	for(String handle:driver.getWindowHandles()) {
		driver.switchTo().window(handle);
	}
		
	}
	}



  
