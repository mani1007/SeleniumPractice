package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String fnNameAttr = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		String fnPlaceholderAttr = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fnClassAttr = driver.findElement(By.id("input-firstname")).getAttribute("class");
		
		By fn = By.id("input-firstname");
		String fnNameAttr = doElementGetAttribute(fn,"name");
		String fnPlaceholderAttr = doElementGetAttribute(fn,"placeholder");
		String fnClassAttr = doElementGetAttribute(fn,"class");
		
		System.out.println(fnNameAttr);
		System.out.println(fnPlaceholderAttr);
		System.out.println(fnClassAttr);		

		By regLink = By.linkText("Register");
		String registerAttr = doElementGetAttribute(regLink, "href");
		
		System.out.println(registerAttr);
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static String doElementGetAttribute(By locator, String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}

}
