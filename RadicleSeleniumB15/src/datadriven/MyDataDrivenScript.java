package datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class MyDataDrivenScript {
	
	WebDriver driver ;
	String excelPath=
			"C:\\RadicalSeleniumB15\\workspace\\RadicleSeleniumB15\\src\\datadriven\\loginDemo.xlsx";
	
	@Test(dataProvider="B7MyDataProvider")
	public void loginToFacebook(String username, String password,String temp1,String temp2,String temp3) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\RadicalSeleniumB15\\softwares\\Phase 3\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@DataProvider(name="B7MyDataProvider")
	public Object[][] getDataB7() throws InvalidFormatException, IOException{
		ReadExcelSheet excelObj = new ReadExcelSheet(excelPath); // constructor of class
		int rowCount = excelObj.getRowCount(0) + 1;
		
		int ColumnCount= excelObj.getColumnCount(0,rowCount);
		System.out.println("rowcount " + rowCount + "ColumnCount " + ColumnCount);
		
		Object[][] data = new Object[rowCount][ColumnCount];
			
		
		for(int i=0;i<rowCount;i++ ){
			
			for(int j=0;j<ColumnCount;j++ ){
				data[i][j]=excelObj.getCellData(0,i, j);
			}
		}
		return data;
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

}
