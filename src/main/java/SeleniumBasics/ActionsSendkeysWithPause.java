package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysWithPause {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.name("search"));
		
		String value = "Automation";
		
		char val[] = value.toCharArray();
		
		for(char c:val)
		{
			actions.sendKeys(element, String.valueOf(c)).pause(500).perform();
		}

	}

}
