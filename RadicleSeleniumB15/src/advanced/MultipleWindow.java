package advanced;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
		
	@Test
	public static void testMultipleWindow() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//String parentWin =driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='fbbtnl']/span")).click();
		Thread.sleep(4000);
		
		String basewin =driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		String childWin = null;
		for (String win : allWindow) {
			
			if(!win.equals(basewin)){
				childWin = win;
			}
			
		}
		System.out.println(childWin);
		driver.switchTo().window("");
		
		
		
		
		
		
		
		
		
//		String childWin = null;
//		Set<String> allWin = driver.getWindowHandles();
//		for (String win : allWin) {
//			if(!parentWin.equals(win)){
//				System.out.println(win);
//				childWin= win;
//			}
//		}
//		driver.switchTo().window(childWin);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Anilkale");
//		driver.close();
//		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
//		String childWin = null;
//		for (String win : allWin) {
//			if(!parentWin.equals(win)){
//				childWin = win;
//			}
//		}
//		driver.switchTo().window(childWin);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myeamil@gmail.com");
//		
//		driver.close();
//		
//		driver.quit();
//		
//		
//		
//		
//		
//		
		
		
//		String parentWind = driver.getWindowHandle();
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//a[@class='fbbtnl']/span")).click();
//		Thread.sleep(4000);
//		Set<String> allWinds = driver.getWindowHandles();
//		String childWind = null;
//		for(String currentWin: allWinds){
//			if(!parentWind.equals(currentWin)){
//				childWind = currentWin;
//			}
//		}
//		driver.switchTo().window(childWind);
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myeamil@gmail.com");
//		driver.close();
//		driver.switchTo().window(parentWind);
//		System.out.println(driver.getTitle());
//		
//		driver.quit();
		
		
		
		
//		String parentWinHand = driver.getWindowHandle();
//		
//		driver.findElement(By.xpath("//a[@class='fbbtnl']/span")).click();
//		Thread.sleep(5000);
//		Set<String> allWinHand = driver.getWindowHandles();
//		
//		for(String anyWinName : allWinHand) {
//			if(!parentWinHand.equals(anyWinName)){
//				driver.switchTo().window(anyWinName);
//			}
////			driver.switchTo().window(anyWinName);
////			System.out.println("title is = "+driver.getTitle());
//		}
//		String firstChild = driver.getWindowHandle();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myeamil@gmail.com");
//		
//		
//		driver.close();
//		driver.switchTo().window(parentWinHand);
//		System.out.println("title is = "+driver.getTitle());
//		
//		driver.quit();
//		
//		
//		
//		
//		
//		
//		
////		
////		String parentWin = driver.getWindowHandle();
////		driver.findElement(By.xpath("//a[@class='fbbtnl']")).click();
////		Thread.sleep(4000);
////		Set<String> allWinds= driver.getWindowHandles();
////		//LinkedHashSet <String> titles= (LinkedHashSet<String>) driver.getWindowHandles();
////		//String getChildWindow;
////		for (String winName : allWinds) {
////			driver.switchTo().window(winName);
////			System.out.println(driver.getTitle());
////		}
////		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myemail");
////		driver.switchTo().window(parentWin);
////		System.out.println(driver.getTitle());
////		driver.quit();
		

	}

}
