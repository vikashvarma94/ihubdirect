package com.ihubmeaven.offers;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testxl {
 
@DataProvider(name="data")
  public void f() throws IOException {

	  	String vikas[][]= new String[20][20];
		FileInputStream fis = new FileInputStream("/home/vikas/Desktop/write.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(1);
		
		FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/write.xlsx");
	//	XSSFWorkbook wo = new XSSFWorkbook();
	//	XSSFSheet so = wo.createSheet("vikas");		
		for (int i=1;i<=sh.getLastRowNum();i++) {
			  for (int j=0;j<=3;j++) {	
			vikas[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(vikas[i][j]);
			wb.write(fos);
			sh.createRow(i).createCell(i+10).setCellValue(vikas[i][j]);
  }}}}
