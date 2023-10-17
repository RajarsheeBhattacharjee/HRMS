package com.hrms.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.objectos.xls.pojo.Sheet;

public class Testdatadriventesing {
	
	WebDriver driver;
	//public static void main(String[] args) {
		//Testdatadriventesing tcs = new Testdatadriventesing();

		//tcs.loginDataDrivenExcelSheet();
	//}

	public void loginDataDrivenExcelSheet() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("http://newtours.demoaut.com/");
		File src = new File(".\\testdata\\Login_data.xls");
		//Workbook wb = Workbook.getWorkbook(src);
		//Sheet sh1 = wb.getSheet("Sheet1");
		//int rows = sh1.getRows();
		//for (int i = 1; i < rows; i++) {
				//String userNameDataFromExcel = sh1.getCell(0, i).getContents();
				//String passwordDataFromExcel = sh1.getCell(2, i).getContents();
				Thread.sleep(2000);
				WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));
				//uName.sendKeys(userNameDataFromExcel);
				Thread.sleep(2000);
				//System.out.println(userNameDataFromExcel);
				WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
				//pwd.sendKeys(passwordDataFromExcel);
				Thread.sleep(2000);
				//System.out.println(passwordDataFromExcel);
				WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
				login.click();
				Thread.sleep(5000);
				WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
				home.click();
				Thread.sleep(5000);
				driver.close();
			}
	}



