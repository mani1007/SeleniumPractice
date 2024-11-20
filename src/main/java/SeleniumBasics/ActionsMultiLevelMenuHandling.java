package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultiLevelMenuHandling {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		// Three Level SubMenu with bigbasket application
		driver.get("https://www.bigbasket.com/");
		
		By parentMenuLocator = By.xpath("(//span[contains(text(),'Category')])[2]");
 		By level1Locator = By.linkText("Foodgrains, Oil & Masala");
 		By level2Locator = By.linkText("Atta, Flours & Sooji");
 		By level3Locator = By.linkText("Sooji, Maida & Besan");
 		
 		Thread.sleep(3000);
 		
 		doClick(parentMenuLocator);
 		Thread.sleep(1500); 
		
		handleThreeLevelMenuSubMenu(level1Locator, level2Locator, level3Locator);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static void handleThreeLevelMenuSubMenu(By level1Locator, By level2Locator, By level3Locator) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level1Locator)).perform();
		Thread.sleep(1500);
		action.moveToElement(getElement(level2Locator)).perform();
		Thread.sleep(1500);		
		//doClick(level3Locator);	
		
		action.click(getElement(level3Locator)).perform();
	}


}
