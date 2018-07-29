package advanced;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B15MyToolTipTest {
	
	@Test
	public void testToolTip(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		String tooltip = driver.findElement(By.xpath("//a[@title='Get Selenium']")).getAttribute("title");
		System.out.println("tooltip : " + tooltip);
		
		Assert.assertEquals(tooltip, "Get Selenium");
	}
}
