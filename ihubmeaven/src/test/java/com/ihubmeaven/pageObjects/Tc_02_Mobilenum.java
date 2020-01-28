package com.ihubmeaven.pageObjects;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_02_Mobilenum extends baseclass{
  @Test
  public void mobilenum() throws InterruptedException{
	  test=report.createTest("mobile num");
	  driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
//		List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//		for(int i = 0; i<5;i++) {
//			li.get(i).click();
//		}
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='userName'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ng-click=\"Buyer_MblNo_modal_open()\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("9666262992");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
  }
}
