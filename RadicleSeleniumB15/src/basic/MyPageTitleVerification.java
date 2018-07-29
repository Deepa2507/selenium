package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyPageTitleVerification {

	@Test
	public void testWindowTitle(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	
	
		String winTitle = driver.getTitle();
		System.out.println("Title :" + winTitle);
		
		Assert.assertEquals(winTitle, "Facebook – log in or sign up");
	}
}
