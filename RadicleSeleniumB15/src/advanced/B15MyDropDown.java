package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class B15MyDropDown {

	
	@Test
	public static void testDropDownBox() {
		System.setProperty("webdriver.chrome.driver","C:\\RadicalSeleniumB15\\softwares\\Phase 3\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Analytics");
		
		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("first Element " + firstEle);
		
		List<WebElement> listOptions = sel.getOptions();
		for(WebElement webelement : listOptions){
		System.out.println("element : " + webelement);	
		}
	}
}
