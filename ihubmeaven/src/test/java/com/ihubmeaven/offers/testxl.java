package com.ihubmeaven.offers;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class testxl {
  @Test
  public void f() throws IOException {
	  
	  String vikas[][]= new String[10][10];
	  
		FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(1);
		
		FileOutputStream fo = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
	//	XSSFSheet so = wb.getSheetAt(5);
		wb.write(fo);
		
		for (int i=2;i<=sh.getLastRowNum();i++) {
			  for (int j=0;j<=9;j++) {
			
			vikas[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(vikas[i][j]);
			
			sh.getRow(i).createCell(11).setCellValue("loged in sucessfully");
  }
}}}
