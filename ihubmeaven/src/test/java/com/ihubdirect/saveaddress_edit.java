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

import junit.framework.Assert;
public class saveaddress_edit extends baseclass{
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("saved address edit");
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
		driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@ng-show=\"BuyerDetailsShow\"]//a[@ng-click=\"Edit_Buyer_Details(BuyerProfileDetails)\"]")).click();
		// Update
		//driver.findElement(By.xpath("//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"Update_Buyer_Details('PersonalDetailsForm')\"]")).click();
		// Cancel
		driver.findElement(By.xpath("//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"CancelModals()\"]")).click();
//		// Close
//		driver.findElement(By.xpath("//div[@id=\"EditBuyerDetailsFormModal\"]//button[@ng-click=\"Cancel()\"]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"col-md-8 col-lg-10\"]")).isEnabled(), true);
}}
