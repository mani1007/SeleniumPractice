package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		// 1. One Level SubMenu with mrbool application
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		
//		By parentMenuLocator = By.className("menulink");
//		By subMenuLocator = By.linkText("SINGLE VIDEOS");
		
		// 2. One Level SubMenu with spicejet application
		driver.get("https://www.spicejet.com/");
		
		By parentMenuLocator = By.xpath("//div[text()='Add-ons']");
 		By subMenuLocator = By.xpath("//div[text()='Visa Services']");
		
		handleTwoLevelMenuSubMenu(parentMenuLocator, subMenuLocator);			
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static void handleTwoLevelMenuSubMenu(By parentMenuLocator, By subMenuLocator) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(3000);
		
		doClick(subMenuLocator);	
	}

}
