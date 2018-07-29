package basic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyResizeBrowser {
	
	@Test
	
	public void testBrowserResize(){
		
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		
		
		Dimension dim = new Dimension(200,400);
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
	
		driver.quit();
	}

}
