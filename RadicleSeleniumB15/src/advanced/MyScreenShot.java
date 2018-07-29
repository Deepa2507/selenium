package advanced;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	@Test
	public void test() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot obj =  (TakesScreenshot) driver;
		
		File srcFile=  obj.getScreenshotAs(OutputType.FILE);
		
		//File srcFile=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String title = driver.getTitle();
		String myTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File destFile =new File("C:\\RadicalSeleniumB15\\downloads\\image1_"+title+"_"+myTimeStamp+".png");
		FileUtils.copyFile(srcFile, destFile);
		
//		boolean result = true;
//		try{
//			driver.get("http://www.google.com");
//			Thread.sleep(6000);
//			driver.findElement(By.xpath("//input[@id='lst-ib1xxx']"));
//		}catch(Exception e){
//			MyScreenShotUtil scu = new MyScreenShotUtil();
//			scu.getScreenShot(driver);
//			result =false;
//			System.out.println("taking screen shot");
//		}
//		driver.close();
//		driver.quit();
//		Assert.assertTrue(result);
		
		
		
		
		//File srcFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File("C:\\test\\googleError2"+"myTimeStamp"+".png"));
//		driver.close();
//		Thread.sleep(3000);
		
		
//		TakesScreenshot a = (TakesScreenshot) driver;
//		a.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("C:\\test\\googleError.png"));
		
		
	}

}
	