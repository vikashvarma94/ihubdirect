package com.ihubdirect;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;
public class request_product extends baseclass{
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("request product");
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
		driver.findElement(By.xpath("//li[@ng-click=\"Request_Special_Product()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@name=\"CustomerName\"]"))
				.sendKeys("Anusha");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"ProductRequestForm\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("9666262992");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"ProductRequestForm\"]//input[@ng-model=\"ProductName\"]"))
				.sendKeys("TV");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"ProductRequestForm\"]//input[@ng-model=\"RequestedQunatity\"]"))
				.sendKeys("1");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"ProductRequestForm\"]//textarea[@ng-model=\"Specifications\"]"))
				.sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"ProductRequestForm\"]//button[@ng-click=\"Save_Special_Product('ProductRequestForm')\"]"))
				.click();

  }
}
