package testcase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5day2.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass
	{
		@Test(dataProvider="getData")
		public void Createmethod(String company, String Fname, String Lname, String PhNo) {
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
		@DataProvider()
		public String[][] getData() throws IOException
		{
			/*
			 * String[][] data = new String[2][4]; data[0][0]= "Testleaf"; data[0][1]=
			 * "Hari"; data[0][2]= "R"; data[0][3]= "99";
			 * 
			 * data[1][0]= "Testleaf"; data[1][1]= "Sheriba"; data[1][2]= "T"; data[1][3]=
			 * "98"; return data;
			 */
			ReadExcel excel=new ReadExcel();
			return excel.readData();
		}
		}







