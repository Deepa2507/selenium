package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyMouseHover {
	
	@Test
	public void testMouseHover(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
	
	}
	
//	@Test
//	public void test() throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver","D:\\Radical\\chromedriver_win32_B39\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.seleniumhq.org/");
//		Thread.sleep(2000);
//	    WebElement tooltip=driver.findElement(By.xpath("//li/a[text()='Projects']"));
//		Actions action=new Actions (driver);
//		action.moveToElement(tooltip).perform();
//	}

}
