package com.ihubdirect;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;

public class addnew_address extends baseclass {
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("add new adress");
	  driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"SignIn()\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("9666262992");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@class=\"btn btn-prime btn-block\"]")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.linkText("Electronics And Home Appliances"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]"))
				.click();
		driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(2000);
//		WebElement checkbox2 = driver
//				.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox2);
//		Thread.sleep(2000);
//		WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox3);
//		Thread.sleep(2000);
//		WebElement checkbox4 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", checkbox4);
//		Thread.sleep(2000);
		WebElement checkbox5 = driver
				.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox5);
		Thread.sleep(2000);
		WebElement checkbox6 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox6);
		Thread.sleep(2000);

		// Cart
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		// Make payment
		WebElement link = driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", link);

		// home address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[4]/ng-view/div[1]/div/div/div[2]/div[2]/div/label[2]"));
	
		driver.findElement(By.xpath("//div[@class=\"relative clearfix\"]//div[@class=\"address-details\"][1]")).click();

		// Add new address
		Thread.sleep(2000);
		WebElement link2 = driver.findElement(By.xpath("//div[@class=\"add-new-address\"]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", link2);
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("vikas");
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Kondapur");
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//select[@name=\"State\"]//option[@label=\"Telangana\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@attr-placeholder=\"search\"]")).clear();
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@attr-placeholder=\"search\"]")).sendKeys("Madhapur");
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"NewPincode\"]")).clear();
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"NewPincode\"]")).sendKeys("500018");
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
		driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("9666262992");
		driver.findElement(By.xpath("//form[@name=\"AddNewAddressForm\"]//input[@id=\"btnSave\"]")).click();

  }
}
