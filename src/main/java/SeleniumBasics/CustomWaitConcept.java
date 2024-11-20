package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitConcept {

	static WebDriver driver;
	
	public static WebElement retryingElement(By locator, int timeout)
	{
		WebElement element = null;
		int attempt = 0;
				
		while(attempt < timeout)
		{
			try 
			{
				element=driver.findElement(locator);
				System.out.println("Element Found at attempt number: " + (attempt+1));
				break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element is not found in attempt number: " + (attempt+1));
				TimeUtil.defaultTime();				
			}
			
			attempt++;
		}
		
		if(element == null)
		{
			System.out.println("Element NOT Found in " + timeout + " attempts with 500 milliseconds of interval");
			throw new MyElementException("No Such Element Found");
		}
		
		return element;
	}
	
	public static WebElement retryingElement(By locator, int timeout, int interval)
	{
		WebElement element = null;
		int attempt = 0;
				
		while(attempt < timeout)
		{
			try 
			{
				element=driver.findElement(locator);
				System.out.println("Element Found at attempt number: " + (attempt+1));
				break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element is not found in attempt number: " + (attempt+1));
				TimeUtil.myCustomTime(interval);			
			}
			
			attempt++;
		}
		
		if(element == null)
		{
			System.out.println("Element NOT Found in " + timeout + " attempts with " + (interval * 1000) + " milliseconds of interval");
			throw new MyElementException("No Such Element Found");
		}
		
		return element;
	}
	
	public static void main(String[] args){
		
		// Thread.sleep --- static wait --> dynamic wait
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email1");
		retryingElement(emailId, 10, 2).sendKeys("kapil@gmail.com");

	}

}
