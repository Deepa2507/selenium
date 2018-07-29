package TestNGB9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class MyTestngReport {
	
	@Test
	public void method1(){
		System.setProperty("webdriver.gecko.driver", "C:\\RadicalSeleniumB15\\softwares\\Phase 3\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("launching application");
		//System.out.println("launching application");
		//selenium code
		Reporter.log("clicking on project tab");
		//System.out.println("clicking on project tab");
		//selenium code
		Reporter.log("entring search text");
		//System.out.println("entring search text");
		//selenium code
		Assert.assertTrue(false);
	}
	
	@Test
	public void method2(){
		//System.setProperty("webdriver.gecko.driver", "C:\\RadicalSeleniumB15\\softwares\\Phase 3\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("launching application");
		//System.out.println("launching application");
		//selenium code
		Reporter.log("clicking on project tab");
		//System.out.println("clicking on project tab");
		//selenium code
		Reporter.log("entring search text");
		//System.out.println("entring search text");
		//selenium code
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void method3(){
		System.setProperty("webdriver.gecko.driver", "C:\\RadicalSeleniumB15\\softwares\\Phase 3\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("launching application");
		System.out.println("launching application");
		//selenium code
		Reporter.log("clicking on project tab");
		System.out.println("clicking on project tab");
		//selenium code
		Reporter.log("entring search text");
		System.out.println("entring search text");
		//selenium code
		Assert.assertTrue(true);
	}

}
