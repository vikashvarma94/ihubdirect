package com.ihubmeaven.pageObjects;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}



FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sh = wb.getSheetAt(0);
FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
wb.write(fos);

int lastrow=sh.getLastRowNum();

for (int i=1;i<=lastrow;i++){
String email = sh.getRow(i).getCell(0).getStringCellValue();
String pass = sh.getRow(i).getCell(1).getStringCellValue();

d.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(email);
d.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
d.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
Alert al = d.switchTo().alert();
al.dismiss();
Thread.sleep(500);
String et = d.getTitle();
String at = "Guru99 Bank Manager HomePage";

if (at.equalsIgnoreCase(et)) {
sh.getRow(i).createCell(2).setCellValue("loged in sucessfully");
break;
}
else {
sh.getRow(i).createCell(2).setCellValue("login failed");
continue;
}
}
}
}