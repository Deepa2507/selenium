package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPipeOperator {
	
	@Test
	public static void testXpathPipeOperator() {
	
	System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");

	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='First Name']|//input[@ng-model='FirstName']")).sendKeys("Radical");;
	
	
	}

}
