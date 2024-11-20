package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.id("Form_getForm_Country");	
		
		doSelectDropDownValue(country, "India");
		printDropDownValues(country);
		

	}
	
	public static List<String> getDropDownOptionsTextList(By locator)
	{
		List<WebElement> elements = getDropDownOptionsList(locator);
		List<String> textList = new ArrayList<String>();
		
		for(WebElement e : elements)
		{
			textList.add(e.getText());
		}
		return textList;		
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator)
	{
		WebElement countryElement = driver.findElement(locator);
		Select select = new Select(countryElement);
		return select.getOptions();
	}
	
	public static int getDropDownOptionsCount(By locator)
	{
		return getDropDownOptionsList(locator).size();
	}
	
	public static void doSelectDropDownValue(By locator, String value)
	{
		List<WebElement> countryList = getDropDownOptionsList(locator);
		
		for(WebElement e : countryList)
		{
			String text = e.getText();
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}		
	}
	
	public static void printDropDownValues(By locator)
	{
		List<String> optionList = getDropDownOptionsTextList(locator);
		for(String e : optionList)
		{
			System.out.println(e);
		}		
	}

}
