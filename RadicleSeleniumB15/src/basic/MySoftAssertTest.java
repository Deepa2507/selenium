package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MySoftAssertTest {

	@Test
	public void testSoftAsserts(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
	
		SoftAssert mySoft = new SoftAssert();
		String tab1 = driver.findElement(By.xpath("//li[@id='menu_projects']")).getText();
		mySoft.assertEquals(tab1, "projects");
		
		String tab2 = driver.findElement(By.xpath("//li[@id='menu_download']")).getText();
		mySoft.assertEquals(tab2, "Download");
		mySoft.assertAll();
		
	}
}
