


package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActionTest {
	
	
	@Test
	public void myActionTest() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		Actions myAction=new Actions(driver);
		
		Actions obj = myAction.moveToElement(emailTxtBox).click().keyDown(emailTxtBox,Keys.SHIFT).sendKeys(emailTxtBox,"selenium");
		
		obj.build().perform();
		
			
		
//		WebElement emailTxtBox = driver.findElement(By.id("email"));
//		actions.sendKeys("myEmailId");
//		
//		actions.build().perform();
		
		
	}
	
}
