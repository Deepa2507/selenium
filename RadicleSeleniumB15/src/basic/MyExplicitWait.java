package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {

	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		WebDriverWait obj = new WebDriverWait(driver, 25);
		
		WebElement myElement =obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lst-ibxxx']")));
		
		myElement.click();
		
//		myElement.
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.withMessage("I am waiting");
//		driver.findElement(By.xpath("//input[@class='gsfi']"));
		
		
	}

}
