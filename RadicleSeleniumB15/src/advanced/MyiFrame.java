package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyiFrame {
	
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.switchTo().frame("IF2");
		driver.findElement(By.xpath("//a[@id='ui-id-2']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@id='primary-menu']//a//span/span/span[contains(text(),'HOME')]")).click();
		Thread.sleep(4000);
		driver.close();
//		driver.quit();
		
		
	}

}
