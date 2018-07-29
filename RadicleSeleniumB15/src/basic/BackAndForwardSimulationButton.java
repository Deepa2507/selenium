package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BackAndForwardSimulationButton {
	
	@Test
	public void testBackAndForwardButton()	{
		
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		//driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
