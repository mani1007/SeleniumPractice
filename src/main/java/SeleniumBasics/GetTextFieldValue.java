package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextFieldValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Automation");
		String fnNameAttr = driver.findElement(By.id("input-firstname")).getAttribute("name");
		String fnPlaceholderAttr = driver.findElement(By.id("input-firstname")).getAttribute("value");
		String fnClassAttr = driver.findElement(By.id("input-firstname")).getAttribute("class");
		
		System.out.println(fnNameAttr);
		System.out.println(fnPlaceholderAttr);
		System.out.println(fnClassAttr);
		
		
		
		

	}

}
