package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		boolean flag = driver.findElement(By.className("img-responsive1")).isDisplayed();
//		System.out.println(flag);
//		if(flag)
//			System.out.println("Logo Displayed");
//		else
//			System.out.println("Logo is NOT Present");
		
//		By logo = By.className("img-responsive");
//		if(isElementDisplayed(logo))
//		{
//			System.out.println("Logo is Displayed");
//		}
	
//		List<WebElement> logo = driver.findElements(By.className("img-responsive1"));
//		
//		if(logo.size()==1)
//		{
//			System.out.println("Logo is Displayed");
//		}
//		else
//		{
//			System.out.println("Logo is NOT Displayed");
//		}
		
		
		By logo = By.className("img-responsive");
		
		boolean flag = isElementExist(logo);
		
		if(flag)
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is NOT Displayed");
		}
		
	}
	
	public static boolean isElementExist(By locator)
	{
		if(getElements(locator).size()==1)
		{
			return true;
		}
		return false;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
