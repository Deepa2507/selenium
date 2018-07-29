	package basic;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyImplicitExplicitWait {
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait obj = new WebDriverWait(driver, 30);
		WebElement myElement = obj.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//input[@class='gsfixx']")));
		myElement.sendKeys("radical");
		
		System.out.println("Script running");

	}

}



