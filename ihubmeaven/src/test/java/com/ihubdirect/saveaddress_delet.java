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
public class saveaddress_delet extends baseclass{
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("save address delete");
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
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//li[@ng-if=\"UserMobileNumber!=undefined&&UserMobileNumber!=''&&UserMobileNumber!=null\"]//a[@ng-click=\"DataToggle()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//li[@class=\"mobile-dropdown open\"]//ul[@ng-show=\"Show_Buyer_Menu\"]//a[@ng-click=\"Buyer_Profile_Details()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-repeat=\"address in BuyerAddress_List\"]//a[@ng-click=\"DeleteBuyerAddress(address.Address_Details_ID)\"]"))
				.click();

  }
}
