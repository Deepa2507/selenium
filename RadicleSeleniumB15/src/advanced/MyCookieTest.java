package advanced;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyCookieTest {

	@Test
	public void cookieTest(){
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		Set<Cookie> allcookies = driver.manage().getCookies();
		System.out.println("Cookies :" + allcookies.size());
		
		for(Cookie cookie : allcookies )
		{
			System.out.println("domain : " + cookie.getDomain());
			System.out.println("Expiry : " + cookie.getExpiry());
			System.out.println("Name : " + cookie.getName());
			System.out.println("Value : " + cookie.getValue());
			System.out.println("Path : " + cookie.getPath());
		}
		
		driver.manage().deleteAllCookies();
		Set<Cookie> allcookies1 = driver.manage().getCookies();
		System.out.println("post deletion Cookies :" + allcookies1.size());
	}
}
