package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://www.amazon.com");		

		Actions actions = new Actions(driver);
		
//		WebElement firstname = driver.findElement(By.name("firstname"));
//		
//		actions.sendKeys(firstname, "Automation")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("Test")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("test@nal.com")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("88888888")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("test@123")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("test@123")
//			.build().perform();
		
		actions.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("iphone pro")
		.sendKeys(Keys.ENTER)
		.build().perform();

	}

}
