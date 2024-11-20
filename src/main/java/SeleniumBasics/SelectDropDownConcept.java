package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//
//		Select select = new Select(country);
//		
//		//select.selectByIndex(5);
//		select.selectByVisibleText("Australia");
//		select.selectByValue("India");
		
		By byCountry = By.id("Form_getForm_Country");
		//doSelectbyIndex(byCountry, 6);
		
		//doSelectbyVisibleText(byCountry, "India");
		
		doSelectbyValue(byCountry, "Australia");
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectbyIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectbyVisibleText(By locator, String visibleText)
	{
		nullBlankCheck(visibleText);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectbyValue(By locator, String value)
	{
		nullBlankCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	private static void nullBlankCheck(String value)
	{
		if(value == null || value.length() == 0)
			throw new MyElementExeption("Visible Text Cannot be Null");
	}

}
