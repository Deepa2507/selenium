package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTestNGAssertionTest {

	@Test
	public void testTestNGAsserts(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		/*Case 1*/
//		Assert.assertEquals(title, "Google","Title not matching");
//		System.out.println("Title : " + title);
		
		/*Case 2*/
//		boolean result = title.equals("Google");
//		Assert.assertEquals(result, true);
//		System.out.println("result : " + result);
		
		/*Case 3*/
		//Assert.assertEquals(100, 100);
		
		/*Case 4*/
		//Assert.assertNotEquals(100,100);
		
		/*Case 5*/
//		Boolean result = title.equals("Google");
//		Assert.assertTrue(result);
		
		/*Case 6 --> Assertion error */
//		Boolean result = title.equals("India Google");
//		Assert.assertTrue(result);
		Assert.assertFalse(false);
		
		/*Case 7 expecting null value*/
		Assert.assertNull(null);
		
		/*Case 8 expecting null value*/
		Assert.assertNotNull(null);
		
		
		
		
		
	}
}
