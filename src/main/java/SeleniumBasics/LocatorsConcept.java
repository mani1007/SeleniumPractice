package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		//1.
//		driver.findElement(By.id("input-email")).sendKeys("automation123@nal.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
//		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("automation123@nal.com");
//		password.sendKeys("test@123");
//		
//		//3.
//		By user = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement email = driver.findElement(user);
//		WebElement password = driver.findElement(pwd);
//		
//		email.sendKeys("automation123@nal.com");
//		password.sendKeys("test@123");
//		
//		//4. 
//		By user = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement email = getElement(user);
//		WebElement password = getElement(pwd);
//		
//		email.sendKeys("automation123@nal.com");
//		password.sendKeys("test@123");
//		
		
		//5.
//		By user = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(user,"automation123@nal.com");
//		doSendKeys(pwd,"test@123");

		
		//6. Element Utility
//		By user = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		ElementUtil element = new ElementUtil(driver);
//		element.doSendKeys(user,"automation123@nal.com");
//		element.doSendKeys(pwd,"test@123");
		
		//7. Browser Utility + Element Utility
		
		//8. By Util + String locators
		String user_id = "input-email";
		String pwd_id = "input-password";
		
		ElementUtil element = new ElementUtil(driver);
		element.doSendKeys("id", user_id,"automation123@nal.com");
		element.doSendKeys("id", pwd_id,"test@123");
		
		
		
		
		
	}
	
//	Required for 4 and 5
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	
//	public static void doSendKeys(By locator, String input)
//	{
//		getElement(locator).sendKeys(input);
//	}

}
