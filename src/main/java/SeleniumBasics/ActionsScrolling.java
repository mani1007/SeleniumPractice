package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Actions actions = new Actions(driver);
		
		//1. Page Up and Page Down with Keyboard Keys
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		actions.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(3000);
//		actions.sendKeys(Keys.PAGE_UP).perform();
		
		//2. Bottom of Page and Top of Page with Keyboard Keys
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(3000);
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		//a[text()='Privacy Policy']
		WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		actions.scrollToElement(element).click(element).perform();		

	}

}