package datadriven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataDrivenScript1 {
	
	WebDriver driver ;
	
	@DataProvider(name="MyDataProvider")
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0]= "admin";
		data[0][1]= "pwd";
		data[1][0]= "admin1";
		data[1][1]= "pwd";
		return data;
	}
	
	
	@Test(dataProvider="MyDataProvider")
	public void loginToFacebook(String username, String password) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\RadicalSeleniumB15\\softwares\\Phase 3\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	
		//driver.manage().window().maximize();
		
		System.out.println("Name "+username);
		System.out.println("pwd "+password);
		
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).click();

	}
	
}
