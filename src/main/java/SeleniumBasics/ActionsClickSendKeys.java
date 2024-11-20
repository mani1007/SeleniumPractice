package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		
		//WITHOUT USING METHODS
//		WebElement user = driver.findElement(email);
//		WebElement pass = driver.findElement(password);
//		WebElement loginButton = driver.findElement(login);
//		
//		Actions actions = new Actions(driver);
//		
//		actions.sendKeys(user, "testautomation@nal.com").perform();
//		actions.sendKeys(pass, "test@123").perform();
//		actions.click(loginButton).perform();
		
		doActionsSendKeys(email, "testautomation@nal.com");
		doActionsSendKeys(password, "test@123");
		doActionsClick(login);

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value)
	{
		Actions actions = new Actions(driver);
		actions.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator)
	{
		Actions actions = new Actions(driver);
		actions.click(getElement(locator)).perform();		
	}

}
