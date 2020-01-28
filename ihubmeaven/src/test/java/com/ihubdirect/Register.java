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
public class Register extends baseclass {
  @Test
  public void f() throws InterruptedException {
	  test=report.createTest("register");
	  driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"autocomplet \"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class=\"hidden-xs hidden-sm\"]//a[@ng-click=\"RegisterModal()\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"FullName\"]")).sendKeys("vikas");
		driver.findElement(By.xpath(
				"//div[@ng-class=\"{'has-error':RegistrationForm.gender.$invalid && !RegistrationForm.gender.$pristine}\"]//label[@for=\"switch_right\"]"))
				.click();
		driver.findElement(By.xpath(
				"//form[@name=\"RegistrationForm\"]//div[@class=\"form-group row row-gutter6\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("7780554172");
		driver.findElement(By.xpath("//input[@name=\"EmailID\"]")).sendKeys("vikas@inativetech.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath(
				"//div[@class=\"form-group row row-gutter6\"]//div[@class=\"col-sm-7 gutter6\"]//input[@name=\"ConfirmPassword\"]"))
				.sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"TermsCond\"]//i[@class=\"check\"]")).click();
		driver.findElement(By.xpath("//button[@ng-click=\"Register_User('RegistrationForm')\"]")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//form[@name=\"OtpForm\"]//input[@name=\"OTP\"]")).click();

		 driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		 driver.findElement(By.xpath("//div[@class=\"col-sm-6gutter6\"]//button[@ng-click=\"Cancel()\"]")).click();

  }
}
