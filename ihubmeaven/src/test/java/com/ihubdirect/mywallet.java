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
public class mywallet extends baseclass{
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("my wallet");
	  driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
	driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"SignIn()\"]")).click();
	driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//input[@name=\"userName\"]")).sendKeys("9666262992");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
	driver.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@class=\"btn btn-prime btn-block\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/a/i")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul[2]/li[5]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"col-md-8 col-lg-10\"]")).isEnabled(), true);

  }
}
