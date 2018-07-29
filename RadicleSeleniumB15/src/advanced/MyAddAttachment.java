package advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyAddAttachment {
	
	@Test
	public void addAttachment() throws InterruptedException, AWTException{
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.2shared.com");
		driver.get("http://www.freefileconvert.com/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.id("upField")).sendKeys("D:\\TrainingContent\\URLs.txt");
		driver.findElement(By.id("first_file")).sendKeys("D:\\Training\\TrainingContent\\URLs.txt");
		Thread.sleep(5000);
		
//		driver.findElement(By.id("first_file")).sendKeys("D:\\Training\\TrainingContent\\InterviewQ.txt");
//		Thread.sleep(5000);
	}

}
