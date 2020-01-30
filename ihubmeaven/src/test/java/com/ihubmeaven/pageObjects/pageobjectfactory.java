package com.ihubmeaven.pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;




public class pageobjectfactory {
	private static final String Keys_ENTER = null;
	public static WebDriver driver;
	private By signin = By.xpath("(//a[@class='sbold'])[1]");
	private By uid = By.xpath("(//input[@type=\"text\"])[7]");
	private By passid = By.name("password");
	private By submit = By.xpath("(//button[@type=\"submit\"])[2]");
	


	public pageobjectfactory(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String mobnum, String pass) {
		
		driver.findElement(uid).sendKeys(mobnum);
		driver.findElement(passid).sendKeys(pass);
		driver.findElement(submit).click();
	}
	
	public void location(String location) {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(location);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.ENTER);
}
	public void signin() {
		driver.findElement(signin).click();
	}
	
}
