package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropDownWithoutSelectClass {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By country = By.xpath("//select[@id=\"Form_getForm_Country\"]/option");	
		doSelectValueFromDropDown(country,"India");

	}
	
	public static void doSelectValueFromDropDown(By locator, String value)
	{
		List<WebElement> options = driver.findElements(locator);
		
		for(WebElement e : options)
		{
			String text = e.getText();
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}

}
