package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {
			
//			BrowserUtil br = new BrowserUtil();
//			WebDriver driver = br.launchBrowser("Chrome");
//			
//			br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//			
//			ElementUtil el = new ElementUtil(driver);
//			
//			WebElement element = el.getElement(By.id("mani"));
//			element.click();	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname1")).sendKeys("testing");
			
			

	}

}
