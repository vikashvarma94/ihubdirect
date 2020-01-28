package com.ihubdirect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;

public class Total_cycle extends baseclass{
  @Test
  public void f() throws InterruptedException {
	  
		// Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
				.click();
		driver.findElement(By.xpath(
				"//li[@ng-repeat=\"i in  DynamicMenuItems\"][8]//li[@ng-repeat=\"j in i.SubMenus\"][1]//li[@ng-repeat=\"g in j.SubMenus\"][1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"StockInBoundController\"]//select[@ng-model=\"unitID\"]//option[@label=\"Hyderabad DC\"]"))
				.click();
		driver.findElement(By.xpath("//div[@ng-controller=\"StockInBoundController\"]//textarea[@ng-model=\"skus\"]"))
				.sendKeys("099D-2593237");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"StockInBoundController\"]//input[@ng-click=\"GetProducts()\"]"))
				.click();
		driver.findElement(By.xpath("//div[@ng-controller=\"StockInBoundController\"]//input[@value=\"Assign\"]"))
				.click();
		Thread.sleep(2000);
		driver.close();
		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		// Admin
		driver1.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("hyderabad@ihubdc.in");
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver1.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver1.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//input[@ng-model=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver1.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"WHOnline_OrdersController\"]//a[@ng-click=\"ViewOrderedProducts(i.Order_Number,i)\"]"))
				.click();
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@class=\"modal-content\"]//select[@name=\"Status\"]//option[@value=\"20\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver1.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@class=\"close\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(
				"//div[@ng-controller=\"WHOnline_OrdersController\"]//span[@ng-click=\"getShortInvoice(i.Order_Number,i,'O')\"]"))
				.click();
		driver1.close();
		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver2 = new ChromeDriver();
		// Admin
		driver2.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("HyderabadDCLogistics@ihubstores.in");
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver2.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver2.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath(
				"//div[@ng-controller=\"Logistics_OrdersController\"]//select[@name=\"Status\"]//option[@value=\"30\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"Logistics_OrdersController\"]//input[@type=\"checkbox\"]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox00 = driver.findElement(
				By.xpath("//div[@ng-controller=\"Logistics_OrdersController\"]//input[@value=\"Assign\"]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver2;
		js00.executeScript("arguments[0].click();", checkbox00);
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"AssignProductTo('O')\"]"))
				.click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"SaveDetails()\"]")).click();
		Thread.sleep(2000);
		driver2.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver2.close();
		System.setProperty("webdriver.chrome.driver", "/home/anushat/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver3 = new ChromeDriver();
		// Admin
		driver3.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("HyderabadDCLogistics@ihubstores.in");
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver3.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver3.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][5]"))
				.click();
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"Assigned_OrdersController\"]//select[@ng-model=\"logistic\"]//option[@value=\"0\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(
				By.xpath("//div[@ng-controller=\"Assigned_OrdersController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath(
				"//div[@ng-controller=\"Assigned_OrdersController\"]//select[@name=\"Status\"]//option[@value=\"50\"]"))
				.click();
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver3.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();


  }
}
