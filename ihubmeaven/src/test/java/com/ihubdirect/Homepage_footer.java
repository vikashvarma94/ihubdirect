package com.ihubdirect;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;

public class Homepage_footer extends baseclass {
  @Test
  public void Homepage_footer() throws InterruptedException {
	  test=report.createTest("Homepage_reports");
	  driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		// Logo
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(1000);
		for(int i=2;i<=9;i++) {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(1000);
		driver.findElement(By.xpath("(//footer/div/div/div/div/div/ul/li/a)["+i+"]")).click();
		Thread.sleep(2000);
		WebElement body=driver.findElement(By.xpath("(//div[@class='section-info'])[1]"));
		Assert.assertEquals(body.isEnabled(),true);
		continue;}
	}
  }

