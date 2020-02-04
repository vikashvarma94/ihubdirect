package com.ihubmeaven.offers;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class testxl {
 
@Test
  public void f() throws IOException {
	  
//	  WebDriver driver= new ChromeDriver();
//	  System.setProperty("WebDriver.chrome.driver", System.getProperty("user+dir")+"//Drivers/chromedriver_linux64.exe");
	  String vikas[][]= new String[20][20];
		FileInputStream fis = new FileInputStream("/home/vikas/Desktop/write.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/write.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook();
		XSSFSheet so = wo.createSheet("vikas");		
		
		for (int i=2;i<=sh.getLastRowNum();i++) {
			  for (int j=0;j<=10;j++) {
			
			vikas[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(vikas[i][j]);
			wo.write(fos);
			so.createRow(i).createCell(j).setCellValue(vikas[i][j]);
  }
}}
}
