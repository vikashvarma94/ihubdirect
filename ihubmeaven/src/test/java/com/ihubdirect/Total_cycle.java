package com.ihubdirect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ihubmeaven.pageObjects.baseclass;

public class Total_cycle extends baseclass{
	
	 @Test(priority=0)
	  public void direct() throws InterruptedException {
		  test=report.createTest("add to cart payment");
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
			 JavascriptExecutor js =(JavascriptExecutor) driver; 
			 js.executeScript("arguments[0].click();",checkbox);
		
			 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]")) .click();
			 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]")) .click(); 
			 Thread.sleep(2000);
//			 WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
//			 JavascriptExecutor js1 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox1);
//			 Thread.sleep(2000);
//			 WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
//			 JavascriptExecutor js2 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox2);
//			 Thread.sleep(2000);
//			 WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
//			 JavascriptExecutor js3 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox3);
//			 Thread.sleep(2000);
//			 WebElement checkbox4 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
//			 JavascriptExecutor js4 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox4);
//			 Thread.sleep(2000);
//			 WebElement checkbox5 = driver.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
//			 JavascriptExecutor js5 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox5);
//			 Thread.sleep(2000);
//			 WebElement checkbox6 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
//			 JavascriptExecutor js6 =(JavascriptExecutor) driver; 
//			 js.executeScript("arguments[0].click();",checkbox6);
//			 Thread.sleep(2000);
			

				
				 //Cart
			   driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
			   Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
				 Thread.sleep(2000);
				 //Make payment
				 WebElement link=driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]"));
				 JavascriptExecutor js11 =(JavascriptExecutor) driver; 
				 js11.executeScript("arguments[0].click();",link);
				 
				 //Store address
				 Thread.sleep(2000);
				 WebElement link1= driver.findElement(By.xpath("//input[@value=\"S\"]"));
				 JavascriptExecutor js0 =(JavascriptExecutor) driver; 
				 js.executeScript("arguments[0].click();",link1);
				 driver.findElement(By.xpath("//div[@class=\"relative clearfix\"]//div[@class=\"address-details\"][1]")).click();
			
							 
				 /*Add new address
				 Thread.sleep(2000);
				 WebElement link2= driver.findElement(By.xpath("//div[@class=\"add-new-address\"]"));
				 JavascriptExecutor js00 =(JavascriptExecutor) driver; 
				 js.executeScript("arguments[0].click();",link2);
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("Anusha");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Kondapur");
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//select[@name=\"State\"]//option[@label=\"Telangana\"]")).click();
				 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@attr-placeholder=\"search\"]")).clear();
			driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@attr-placeholder=\"search\"]")).sendKeys("Madhapur");
			driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"NewPincode\"]")).clear();
			driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"NewPincode\"]")).sendKeys("500018");
			driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
			driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("9666262992");
			driver.findElement(By.xpath("//form[@name=\"AddNewAddressForm\"]//input[@id=\"btnSave\"]")).click();
		*/
				 //Billing information
			driver.findElement(By.xpath("//div[@class=\"address-details\"][1]//label[@class=\"label-wrapper\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"text-center\"]")).click();
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billName\"]")).sendKeys("Anusha");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billAddress\"]")).sendKeys("Bansal Pride");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billZip\"]")).sendKeys("500018");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billCity\"]")).sendKeys("Madhapur");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billState\"]")).sendKeys("Telangana");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//select[@id=\"orderBillCountry\"]//option[@value=\"India\"]")).click();
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billTel\"]")).sendKeys("9666262992");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"billEmail\"]")).sendKeys("anusha.t@inativetech.com");
			driver.findElement(By.xpath("//div[@id=\"billing_form\"]//input[@name=\"notesValue\"]")).sendKeys("Text");
			
			//Shipping address
			driver.findElement(By.xpath("//div[@id=\"check_address\"]//input[@name=\"differentShippingAddress\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipName\"]")).sendKeys("Maha");
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipAddress\"]")).sendKeys("Hitech city");
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipZip\"]")).sendKeys("500018");
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipCity\"]")).sendKeys("Madhapur");
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipState\"]")).sendKeys("Telangana");
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//select[@name=\"shipCountry\"]//option[@value=\"India\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"span12 shipping-edit-form\"]//input[@name=\"shipTel\"]")).sendKeys("8186814540");
			
			
			//All other Banks
			driver.findElement(By.xpath("//div[@class=\"span12 all-other-banks\"]//select[@id=\"netBankingBank\"]//option[@ value=\"AvenuesTest\"]")).click();
			
			//cc avenue checkbox
			//driver.findElement(By.xpath("//div[@id=\"savecard\"]//input[@name=\"saveCard\"]")).click();
			
			//make payment
			driver.findElement(By.xpath("//div[@id=\"buttons\"]//a[@id=\"SubmitBillShip\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//form[@method=\"post\"]//input[@value=\"Return To the Merchant Site\"]")).click();
		
	  }
  @Test(priority = 1)
  public void admin() throws InterruptedException {
	
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
		}
  @Test(priority = 2)
		  public void hyderabaddc() throws InterruptedException {
		// Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("hyderabad@ihubdc.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		driver.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//input[@ng-model=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(
				By.xpath("//div[@ng-controller=\"WHOnline_OrdersController\"]//button[@title=\"SearchOrders\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"WHOnline_OrdersController\"]//a[@ng-click=\"ViewOrderedProducts(i.Order_Number,i)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//select[@name=\"Status\"]//option[@value=\"20\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@class=\"close\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"WHOnline_OrdersController\"]//span[@ng-click=\"getShortInvoice(i.Order_Number,i,'O')\"]"))
				.click();
		driver.close();
		 }
  @Test(priority = 3)
		  public void dclogistic() throws InterruptedException {
		// Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("HyderabadDCLogistics@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// Categories
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"Logistics_OrdersController\"]//select[@name=\"Status\"]//option[@value=\"30\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-red\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-controller=\"Logistics_OrdersController\"]//input[@type=\"checkbox\"]"))
				.click();
		Thread.sleep(2000);
		WebElement checkbox00 = driver.findElement(
				By.xpath("//div[@ng-controller=\"Logistics_OrdersController\"]//input[@value=\"Assign\"]"));
		JavascriptExecutor js00 = (JavascriptExecutor) driver;
		js00.executeScript("arguments[0].click();", checkbox00);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@ng-click=\"AssignProductTo('O')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"SaveDetails()\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver.close();
		
	}
}
