package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//String titleFraction = WaitUntilTitleContains("Free CRM software for customer relationship management",10);
		String title = WaitUntilTitleIs("Free CRM software for customer relationship management, sales, and support.",10);
		System.out.println(title);
		
		driver.findElement(By.linkText("Sign Up")).click();
//		String urlFraction = WaitUntilURLContains("register/",5);
//		System.out.println(urlFraction);
		String url = WaitUntilURLIs("https://classic.freecrm.com/register/",5);
		System.out.println(url);
		

	}
	
	public static String WaitUntilTitleContains(String titleFraction, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction)))
			{
				return driver.getTitle();
			}
		}
		catch(Exception e)
		{
			System.out.println("Title Fraction could not be captured in "+ timeout + " seconds of timeout");
		}
		
		return null;		
	}
	
	public static String WaitUntilTitleIs(String title, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if(wait.until(ExpectedConditions.titleIs(title)))
			{
				return driver.getTitle();
			}
		}
		catch(Exception e)
		{
			System.out.println("Title could not be captured in "+ timeout + " seconds of timeout");
		}
		
		return null;		
	}
	
	public static String WaitUntilURLContains(String urlFraction, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction)))
			{
				return driver.getCurrentUrl();
			}
		}
		catch(Exception e)
		{
			System.out.println("URL Fraction could not be captured in "+ timeout + " seconds of timeout");
		}
		
		return null;		
	}
	
	public static String WaitUntilURLIs(String url, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if(wait.until(ExpectedConditions.urlToBe(url)))
			{
				return driver.getCurrentUrl();
			}
		}
		catch(Exception e)
		{
			System.out.println("URL could not be captured in "+ timeout + " seconds of timeout");
		}
		
		return null;		
	}

}
