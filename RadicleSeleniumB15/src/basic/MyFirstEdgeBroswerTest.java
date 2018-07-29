package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MyFirstEdgeBroswerTest {
	
	@Test
	public void testMouseHover(){
		
		/*Edge driver is available only with windows 10 
		 * Zoom should be 100%
		 * Find out the OS build from windows settings 
		 * Download the exe from microsoft website*/
		System.setProperty("webdriver.edge.driver","path of edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	}

}
