package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*An implicit wait is to tell WebDriver to poll the DOM for a 
//certain amount of time when 
//trying to find an element 
//or elements if they are not immediately available. 
//The default setting is 0. Once set, the implicit wait is set for the 
//life of the WebDriver object instance.*/
public class MyImplicitWait {

	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='lst-ibxx']")).sendKeys("abc");
		System.out.println("Script running");
		driver.findElement(By.xpath(""));
		driver.quit();
		
		
	}

}
