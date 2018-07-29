

package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataProcess {
	
	private String keywordCol;
	private String locatorTypeCol;
	private String locatorValueCol;
	private String parameterCol;
	
	public DataProcess(String keyCol, String locTypeCol,String locValueCol,String paramCol){
		keywordCol = keyCol;
		locatorTypeCol=locTypeCol;
		locatorValueCol=locValueCol;
		parameterCol=paramCol;
	}
	
	//private By getElementLocator(String keyword, String locatorType, String locatorValue){
		private By getElementLocator(String locatorType, String locatorValue){
		
		switch(locatorType){
			case "className": 
					return By.className(locatorValue);
			case "id": 
					return By.id(locatorValue);
			case "cssSelector": 
					return By.cssSelector(locatorValue);
			case "xpath": 
					return By.xpath(locatorValue);
			default:
				return By.id(locatorValue);
		}
	}
	/**
	 * 
	 * @param driver
	 * @param keyword
	 * @param locatorType
	 * @param locatorValue
	 * @param param
	 * @author Anil
	 */
	public void performAction(WebDriver driver ,String keyword, String locatorType, String locatorValue,String param){
		
		switch(keyword){
		
			case "openBrowser" :
					driver.get(param);
					break;
			case "click": 
				//if(locatorType.equals("xpath"))
					//driver.findElement(By.xpath(locatorValue)).click();
					driver.findElement(getElementLocator(locatorType, locatorValue)).click();
					break;
			case "sendKeys": 
					//driver.findElement(By.xpath(locatorValue)).sendKeys(param);
					driver.findElement(getElementLocator(locatorType, locatorValue)).sendKeys(param);;
					break;
			case "clearText": 
					//driver.findElement(By.xpath(locatorValue)).clear();
					driver.findElement(getElementLocator(locatorType, locatorValue)).click();
					break;
			case "selectComoboxValue": 
					//driver.findElement(By.xpath(locatorValue)).click();
					driver.findElement(getElementLocator(locatorType, locatorValue)).click();
					break;
			case "clearTextAnilsBox":
					//driver.findElement(By.xpath(locatorValue)).clear();
					driver.findElement(getElementLocator(locatorType, locatorValue)).click();
					break;
			case "selectMultiValue":
					//driver.findElement(By.xpath(locatorValue)).click();
					driver.findElement(getElementLocator(locatorType, locatorValue)).click();
					break;
		}
		
	
	}

}
